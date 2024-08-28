/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.configure.Config;
import com.ericsson.s345g.configure.Param;

/**
 * Singleton class to handle instrumentation and performance
 */
public class S3Instrumentation extends java.util.TimerTask {

    static final Logger INSTRUMENTER = LoggerFactory.getLogger(S3Defaults.INSTRUMENTATION_LOGGER);
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);

    private static S3Instrumentation instance;
    private Config config;
    private final Map<Integer, Long> globalCounter = new ConcurrentHashMap<>();
    private long eventCnt = 0L; // number of events sent
    private long genCnt = 0L; // number of events generated
    private long failedCnt = 0L;
    private long oldEventCnt = 0L;
    private long oldGenCnt = 0L;
    private long lastCalled = 0L;
    private int bestEps = 0; // best send rate seen so far
    private Timer timer;
    /* track distribution thread runtime */
    private int runCount = 0;
    private int runTime = 0;
    private int distMonitor = 0;

    private S3Instrumentation() {
        /* singlton private constructor */
    }

    private S3Instrumentation(Config configObj) {
        config = configObj;
        distMonitor = (int) config.get(Param.DistMonitor, 100);
    }

    /**
     * thread safe getInstance method
     */
    public static S3Instrumentation getInstance(Config config) {
        if (instance == null) {
            synchronized (S3Instrumentation.class) {
                if(instance == null){
                    instance = new S3Instrumentation(config);
                }
            }
        }
        return instance;
    }

    /* this is only scheduled to run once every ten seconds */
    private static final String formatString = "\"Generated:\", {}, \"Sent:\", {}, \"eps generated:\", {},\"eps sent:\", {}, \"failed:\", {}, \"Breakdown:\" {} ";
    @Override
    public void run() {

        long timeNow = System.currentTimeMillis();
        int evntsSentPerSec = (int) ((eventCnt - oldEventCnt) * 1000 / (timeNow - lastCalled)); // events sent per second
        if (evntsSentPerSec > bestEps) {
            bestEps = evntsSentPerSec;
        }
        int evntsGenPerSec = (int) ((genCnt - oldGenCnt) * 1000 / (timeNow - lastCalled)); // events generated per second
        int current = config.getCurrentCPS();
        int target = config.getTargetCPS();

        // INSTRUMENTER.info("Generated: {}, Sent: {}, current cps: {}, target cps: {}, eps sent: {}, eps generated: {}, failed: {} ",
        INSTRUMENTER.info(formatString, genCnt, eventCnt, evntsGenPerSec, evntsSentPerSec, failedCnt, globalCounter);

        //INSTRUMENTER.info("Breakdown : {} ", globalCounter);
        oldEventCnt = eventCnt;
        oldGenCnt = genCnt;
        lastCalled = timeNow;

        if ((int) config.get(Param.TargetEventsPerSec, 0) != 0) {
            return; // Using the EPS rate for control not the CPS.
        }

        /*
         * do event sizes need adjusting?
         */
        int adjust = handleExternalControlFile();

        /*
         * If overspeeding, slow down quickly. If we have room to speed up, do so by half the available overhead.
         */

        // How many events is it reasonable to buffer?
        // This is twice the avg call length times the best send rate we have seen so far.
        long bufferRequired = (config.getAvgCallLen() * bestEps) * 1000L * 2L;
        // how big is the buffer now?
        long bufferSize = genCnt - eventCnt;
        // how is our runtime
        if (runCount < 1) { // in case nothing at all has happened, prevents divByZero.
            runCount = 1;
        }
        int avgRuntime = (int) runTime / runCount; // avg time spent distributing
        runTime = 0; // reset for next time through
        runCount = 1;
        if (avgRuntime > distMonitor) { // spending too long distributing, need to slow down
            adjust = 90;
            if (evntsGenPerSec > (evntsSentPerSec * 1.30)) { // generating more then we are sending
                adjust = 50;
            } else if (evntsGenPerSec > (evntsSentPerSec * 1.20)) { // generating much more then we are sending
                adjust = 70;
            } else if (evntsGenPerSec > (evntsSentPerSec * 1.10)) { // generating more then we are sending
                adjust = 80;
            }
            bestEps -= (bestEps / 10); // reduce it by 10%
        } else if (current < target) { // still below our target
            int maxAdjust = 100 - (int) ((1.0 * avgRuntime / distMonitor) * 100);

            // can we increase the rate?
            if (bufferRequired > bufferSize) { // is there room in the buffers
                int bufferAvail = 100 - ((int) (1.0 * bufferSize / bufferRequired) * 100);
                maxAdjust = Math.min(maxAdjust, bufferAvail);
                adjust = 100 + (maxAdjust / 2); // increase by half the max possible
            }
        } else if( current > target) { //Current CPS is greater then target CPS, decrement it
            int percentInc = (int)(((float)target/current) * 100);
            adjust = percentInc;
        }
        if (adjust < 97 || adjust > 103) {
            INSTRUMENTER.warn("Adjusting CPS to {}%. art={}, dm={}, gps={}, eps={}, bEps={}, br={}, bs={}", adjust, avgRuntime, distMonitor, evntsGenPerSec, evntsSentPerSec,
                    bestEps, bufferRequired, bufferSize);
            config.adjustCurrentCPS(adjust);
        }
    }

    /**
     * incremented when an event has been written to tcp stack.
     *
     * @param eventId
     *            id of the event
     * @param eventLen
     *            number of bytes in the event
     */
    public void updateInstrumentation(Integer eventId) {
        eventCnt++;
        updateGlobalCounter(eventId);
    }

    /**
     * how long did the distribution thread take to run?
     */
    public void updateRuntime(long millisecs) {
        runCount++;
        runTime += Math.min(millisecs, 1);
    }

    /**
     * incremented when events are added to schedular Q
     *
     * @param number
     *            of events generated
     */
    public void incScheduled(int numEvt) {
        genCnt += numEvt;
    }

    /**
     * @param eventId
     */
    public void updateFailedInstrumentation(Integer eventId) {
        failedCnt++;
    }

    /**
     * @param eventId
     */
    private void updateGlobalCounter(Integer eventId) {
        Long value = globalCounter.get(eventId);
        value = (value != null ? value + 1 : 1);
        globalCounter.put(eventId, value);
    }

    /**
	 *
	 */
    public void startInstrumentation() {
        timer = new Timer(S3Instrumentation.class.getSimpleName());
        int monitorPeriod = (int) config.get(Param.InstrumentationMonitor, 10000); // 10 second

        lastCalled = System.currentTimeMillis();
        timer.schedule(this, 5000, monitorPeriod);
    }

    public void stopInstrumentation() {
        timer.cancel();
    }

    private int handleExternalControlFile() {
        int adjust = 100;
        boolean error = false;
        /*
         * Handle possible external request to change the load
         */
        String lcf = (String) config.get(Param.LoadControlFile, "");
        if ("" == lcf) { // A load control file has not been specified
            return adjust;  // no change
        }
        try {
            File file = new File(lcf);
            if (file.exists() && !file.isDirectory()) {
                LOGGER.info("attempting to process Load Control file {}", lcf);
                BufferedReader fr = new BufferedReader(new FileReader(file));
                String val = fr.readLine();
                fr.close();
                try {
                    adjust = Integer.parseInt(val);
                    if (adjust < 0) {
                        LOGGER.warn("Load Control file value {} out of range. Must be a positive number.", adjust);
                        error = true;
                    }
                } catch (NumberFormatException e) {
                    LOGGER.warn("Load Control file did not contain a valid number");
                    error = true;
                }

                if (!file.delete()) {
                    LOGGER.warn("Load Control file could not be deleted. Ignoreing it.");
                    // if we cant delete it, we can't act on it!
                    error = true;
                }
            }
        } catch (IOException e) {
            // Load control file error
            error = true;
        }

        if (!error) {
            return adjust;
        }
        return 100; // do not risk changing
    }
}
