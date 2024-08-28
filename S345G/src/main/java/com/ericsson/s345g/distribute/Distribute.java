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
package com.ericsson.s345g.distribute;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.channel.ChannelMgr;
import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.events.Event;
import com.ericsson.s345g.events.EventList;
import com.ericsson.s345g.resourcePool.ResourcePool;
import com.ericsson.s345g.schedule.Schedule;
import com.ericsson.s345g.utils.S3Instrumentation;
import com.ericsson.s345g.utils.Utils;

/*
 * send the events on time
 */
public class Distribute extends java.util.TimerTask {

    static Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private Schedule schedule;
    private ResourcePool resourcePool;
    private Utils utils;
    private int monitorPeriod;
    private int lenROP = 15;
    private int lastROP = -1;
    private long numSent;
    private Config config;
    private ChannelMgr channelMgr; //
    private S3Instrumentation s3Instrumentation;
    private Timer timer = null;
    private SimpleDateFormat ropStart = new SimpleDateFormat("yyyyMMdd.HHmmZ"); // yyyyMMdd.hhmm+ZZZZ-
    private SimpleDateFormat ropEnd = new SimpleDateFormat("HHmmZ"); // hhmm+ZZZZ

    public Distribute(Schedule scheduleObj, Config configObj, ResourcePool resourceObj, ChannelMgr chnlObj) {
        schedule = scheduleObj;
        config = configObj;
        resourcePool = resourceObj;
        utils = new Utils();

        monitorPeriod = (int) config.get(Param.DistMonitor, 1000); // 1 second
        lenROP = (int) config.get(Param.ROPlen, S3Defaults.ROPLENGTH);
        numSent = 0;

        channelMgr = chnlObj;

        startInstrumentation();

        // do lots of clever stuff here
    }

    /**
     * start the thread that will call send messages every fixed period of time
     */
    public void start() {
        LOGGER.debug("Starting Distribute timer");
        timer = new Timer(Distribute.class.getSimpleName());
        timer.schedule(this, monitorPeriod, monitorPeriod);
    }

    /**
     * clean up the distribution thread and stop the timer Also cleans up scheduled but undelivered events
     */
    public void stop() {
        LOGGER.debug("Stopping Distribute timer");
        if (timer != null) {
            timer.cancel();  // turn off the timer task
            timer.purge();
        }
        LOGGER.debug("Releasing connections");
        channelMgr.close();
        LOGGER.debug("Stopping Instrumentation timer");
        stopInstrumentation();
    }

    /*
     * get the status
     */
    public void status() {
        LOGGER.info("Number of messages sent is : {} ", numSent);
    }

    /**
     * Triggered by a timer
     *
     */
    @Override
    public void run() {
        doStuff();  // moved into a separate method so it could be called on demand and not just from the timer
    }

    /**
     *  get and send all the events to be transmitted in current timeblock
     */
    public void doStuff() {
        long st = System.currentTimeMillis();
        int minutes = (int) (st / 1000 / 60 ) ;
        if (minutes % lenROP == 0 && minutes != lastROP) {
            lastROP = minutes;
            String ropS = ropStart.format(new Date(st));
            String ropE = ropEnd.format(new Date(st + (lenROP * 60 * 1000)));
            channelMgr.rollROP("A"+ropS+"-"+ropE+"_SubNetwork=NR,MeContext=");
        }
        try {
            EventList evtList = schedule.getScheduledEvents();
            numSent += evtList.len(); // maintain some status info

            // all the events to be sent at the same time have the same time
            // stamp so work it out once only
            byte[] timeBuf = utils.getTimeBuf();
            for (Event evt : evtList) {
                if (evt.getEventId() == S3Defaults.TERMINATIONEVENTID) {
                    // last event of the pattern has been sent and resources need to be cleaned up
                    long patternId = evt.getPatternId();
                    resourcePool.release(patternId);
                } else {
                    evt.setTime(timeBuf);

                    // Send the message to the appropriate destination
                    boolean messageSent = channelMgr.write(evt);

                    if (messageSent) {
                        s3Instrumentation.updateInstrumentation(evt.getEventId());
                    } else {
                        s3Instrumentation.updateFailedInstrumentation(evt.getEventId());
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("Distribute exception , {} ", e.getMessage());
        }
        s3Instrumentation.updateRuntime(System.currentTimeMillis() - st);
    }

    /**
     * Start instrumentation.
     */
    private void startInstrumentation() {
        s3Instrumentation = S3Instrumentation.getInstance(config);
        s3Instrumentation.startInstrumentation();
    }

    /**
     * Stop instrumentation.
     */
    private void stopInstrumentation() {
        s3Instrumentation.stopInstrumentation();
    }

}
