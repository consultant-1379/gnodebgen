/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.schedule;

import java.util.Timer;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.events.Event;
import com.ericsson.s345g.events.EventList;
import com.ericsson.s345g.utils.MovingAverage;
import com.ericsson.s345g.utils.S3Instrumentation;


/**
 * Schedule events to be sent
 */
public class Schedule extends java.util.TimerTask  {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private Config config;
    private final EventList[] queue; // this is an array of eventlists

    /* 'now' is atomic because it is accessed from more then one thread */
    private AtomicInteger now; // pointer to current entry in queue
    //
    private int next; // pointer to first available entry in queue
    private final int queueSize;
    private final int monitorPeriod;

    // variables required for autotuning the rates
    private long genCnt = 0;
    private long distCnt = 0;
    private long genCntOld = 0;
    private long distCntOld = 0;
    private long lastStatusTime = 0;  // time the status was last displayed
    private long lastAdjustTime = 0;  // time the event rate was last adjusted
    private boolean verbose = false;
    private S3Instrumentation instrumentation;
    private boolean showEPSperCell = false;
    private int numCells = 0;
    private boolean showAVG;
    private int setAvg;
    /* track events per second rates */
    private MovingAverage avgEventsPerSec;
    private int targetEPSinUse = 0;
    private Timer timer = null;


    public Schedule(Config configObj) {
        config = configObj;

        monitorPeriod = (int) config.get(Param.DistMonitor, 125);
        avgEventsPerSec = new MovingAverage(50); // track average over last n events

        // Create a Q of the required size and initialize its elements to empty eventLists
        this.queueSize = config.getValue(Param.QueueSize.name(), S3Defaults.QUEUESIZE);
        queue = new EventList[queueSize];
        for (int i = 0; i < queueSize; i++) {
            queue[i] = new EventList();
        }
        now = new AtomicInteger(0);
        next = now.get() + 2;

        verbose = ((int)config.get(Param.Verbose, 0) == 1 ? true : false);
        showEPSperCell = ((int)config.get(Param.ShowEPS, 0) == 1 ? true : false);
        showAVG = ((int) config.get(Param.ShowAVG, 0) == 1 ? true : false);
        setAvg = ((int)config.get(Param.SetAVG, 0));
        numCells = config.getNumCells();
        targetEPSinUse = (int) config.get(Param.TargetEventsPerSec, 0);

        instrumentation = S3Instrumentation.getInstance(config);

        if (verbose) {
            StringBuilder buf1 = new StringBuilder();
            StringBuilder buf2 = new StringBuilder();
            if (targetEPSinUse > 0) {
                buf1.append("\n Evnts per second       Total Events          Events per second  ");
                buf2.append(  " Target   Current | generated distributed | generated distributed");
            } else {
                buf1.append("\n Calls per second       Total Events          Events per second  ");
                buf2.append(  " Target   Current | generated distributed | generated distributed");
            }
            if (showEPSperCell) {
                buf1.append("     eps  ");
                buf2.append(" | per NF ");
            }
            if (showAVG) {
                buf1.append("    avg  ");
                buf2.append(" | bytes ");
            }
            System.out.println(buf1.toString());
            System.out.println(buf2.toString());

            LOGGER.debug("Starting task to log performance to screen");
            timer = new Timer("Schedular");
            timer.schedule(this, 1000, 1000);
            lastStatusTime = System.currentTimeMillis();
            lastAdjustTime = lastStatusTime;
        }

    }

    /**
     * Given a list of events, add them to the slots that correspond with their offsets
     * where offset is in millisecs, Q slots are in config.DistMonitor so find nearest slot to use for given offset
     */
    public void scheduleEvents(EventList eventsToSchedule) {
        int numEvt = eventsToSchedule.len() ;
        genCnt += numEvt;
        instrumentation.incScheduled(numEvt);

        int q = 0;
        int slot = next; // what is the next slot to write to.
        for (Event evt : eventsToSchedule) {
            // there are 1000 / monitorPeriod slots per second
            // eg monitorPeriod = 100, offset = 1250 => slot should be 12
            // an offset of 1000, with monitorPeriod of 250 means use the fourth slot
            q = (evt.getDelay() / monitorPeriod);
            q = (q + slot) % queueSize;
            queue[q].add(evt);
        }

        //TERMINATION EVENT always added to qth slot. So Update the TERMINATION EVENT count for qth slot eventList.
        queue[q].incTerminationEventCnt();
    }

    /**
     * Called from the Disribute thread to get the list of events to be send now.
     */
    public EventList getScheduledEvents() {
        int oldNow = now.get(); // reduce access to variable
        // get the events to be distributed
        EventList evtList = queue[oldNow];

        // delete what was there
        queue[oldNow] = new EventList();

        // bump the q pointers
        int newNow = (oldNow + 1) % queueSize;
        int newNext = (oldNow + 2) % queueSize;
        next = newNext;
        now.set(newNow);

        // update the stats
        distCnt += evtList.len();

        return evtList;
    }

    /**
     * debugging tool
     *
     * @return the next eventlist that distribute would process
     */
    public EventList getNextEvtList() {
        return queue[now.get()];
    }

    /*
     * clean up the distribution thread
     */
    public void stop() {
        if (verbose) {
            LOGGER.debug("Stopping task to log performance to screen");
            this.cancel();
        }
        if (timer != null) {
            timer.cancel();  // turn off the timer task
            timer.purge();
        }
    }

    /*
     * Update the statistics displayed
     * adjust the event rate if necessary
     * adjust the event size if necessary
     */
    public void run() {
        long timeNow = System.currentTimeMillis();
        long duration = timeNow - lastStatusTime;
        long t1 = genCnt; // minimise access
        long t2 = distCnt;
        lastStatusTime = timeNow;
        int genRate  = (int) ( (t1 - genCntOld) * 1000.0 / duration );
        genCntOld = t1;
        int distRate  = (int) ( (t2 - distCntOld) * 1000.0 / duration );
        distCntOld = t2;
        int currentCPS = config.getCurrentCPS();
        int targetCPS = config.getTargetCPS();
        
        StringBuilder buf = new StringBuilder();

        if (targetEPSinUse > 0) {
            int avgEPS = Math.round( avgEventsPerSec.getAverage());
            buf.append(String.format(" %6d    %6d  %10d  %10d      %6d      %6d",
                targetEPSinUse, avgEPS, t1, t2, genRate, distRate));

        } else {
            buf.append(String.format(" %6d    %6d  %10d  %10d      %6d      %6d",
                targetCPS, currentCPS, t1, t2, genRate, distRate));
        }
        avgEventsPerSec.add(distRate);

        if (showEPSperCell) {
            buf.append(String.format("  %7.2f", (float)distRate/numCells));
        }
        if (showAVG) {
            buf.append(String.format("  %7.2f", config.getAvgEventLen()));
        }
        buf.append("\r");
        System.out.print(buf.toString());

        if (targetEPSinUse > 0) {
            float delta = avgEventsPerSec.getAverage() / (float) targetEPSinUse;  // difference between actual and expected
            int maxDelta = 10;
            if ((delta < 0.99 || delta > 1.01) && // out by 1% or more
                (timeNow - lastAdjustTime > 2000 )){ // and more than 2 seconds since last change  
                // only make change if average and spot rate are on same side of target
                if ( (delta < 1 && distRate - targetEPSinUse < 1) ||
                     (delta > 1 && distRate - targetEPSinUse > 1) ) {
                    int adjust = (int)(100 / delta); // convert to a percentage
                    adjust = Math.min(adjust, 100 + maxDelta); // limit change to maxDelta
                    adjust = Math.max(adjust, 100 - maxDelta);
                    // there is a lag between changing the event rate and the rate actually changing
                    // so we don't want to change too often.      
                    config.adjustCurrentCPS(adjust);
                    lastAdjustTime = timeNow;
                }
            }

        }

        /** adjust the message length if necessary
         * UUID is byte array that makes up part of the header
         * we can set it to up to 300 bytes long
         *
         * delta
         */
        if (setAvg > 0) {
            float delta = config.getAvgEventLen() / (float) setAvg;  // difference between actual and expected
            int trend = config.getLastEventLen() - setAvg;  // difference between last value and target
            if ((delta < 0.98 && trend < 1) || (delta > 1.02 && trend > 1)) {  // out by 2% or more
                int newUUIDLen = (int) ((int)config.get(Param.SetUUIDLen, 10) / delta);
                if (newUUIDLen < 10 || newUUIDLen > 300) {
                    newUUIDLen = 10;
                }
                config.setParam(Param.SetUUIDLen, newUUIDLen);
                LOGGER.info("Adjusting average event len to {}", newUUIDLen);
            }
        }
    }
}
