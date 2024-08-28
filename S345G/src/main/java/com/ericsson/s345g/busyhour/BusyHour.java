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
package com.ericsson.s345g.busyhour;

import java.util.Calendar;
import java.util.Timer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.configure.Config;


public class BusyHour extends java.util.TimerTask {
    final static Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private Config config = null;
    private Timer timer;

    public BusyHour(Config configObj) {
        config = configObj;
    }

    /**
     * We want to start a timer to kick off the run() one second past the hour, and then
     * every hour after. The original code was ambiguous about exactly when it would start,
     * the that made picking the right rule difficult.
     */
    public void start() {
        LOGGER.debug("Starting BusyHour timer");
        int millisecsPerHour = 60 * 60 * 1000;
        // schedule the timer to start on the hour
        Calendar cal = Calendar.getInstance();
       // cal.setTimeInMillis(System.currentTimeMillis()); // UTC

        cal.set(Calendar.HOUR_OF_DAY, cal.get(Calendar.HOUR_OF_DAY) + 1);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 1);
        timer = new Timer(BusyHour.class.getSimpleName());
        timer.schedule(this, cal.getTime(), millisecsPerHour);
    }

    /**
     * stop the timer task
     */
    public void stop() {
        LOGGER.debug("Stopping BusyHour timer");
        timer.cancel();  // turn off the timer task
        timer.purge();
    }

    /**
     * get and return the current applicable busy hour rate Find the rate to use for the current hour. It is the most recently specified value
     *
     * @return
     */
    public static int getInitialRate(Config configObj) {
        int result = 100;  // use 100% if no other value specified
        int hour = getHour();
        int start = hour;
        do {
            String key = "Hour"+hour;
            int val = configObj.getValue(key, 0);
            if (val != 0) {
                result = val;
                break;
            }
            hour--; // valid hours are zero to twenty three.
            if (hour < 0) {
                hour = 23;
            }
        } while (start != hour);
        return result;
    }

    /**
     * Triggered by a timer on the hour
     *
     */
    @Override
    public void run() {
        // what is the current hour?
        String key = "Hour" + getHour();
        LOGGER.debug("Checking for BusyHour rule {}", key);
        int val = config.getValue(key, 0);
        if (val != 0) {
            LOGGER.debug("Applying BusyHour rule {} = {}",key, val);
            config.adjustTargetCPS(val);
        } else {
            LOGGER.debug("No BusyHour rule found for {}", key);
        }
    }

    /**
     * Get the current hour in LOCAL time
     *
     * @return the current hour in LOCAL time
     */
    private static int getHour() {
        Calendar cal = Calendar.getInstance();
       // cal.setTimeInMillis(System.currentTimeMillis()); // UTC
        return cal.get(Calendar.HOUR_OF_DAY);
    }

}
