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
package com.ericsson.s345g.pattern;

import java.io.File;
import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.events.EventList;
import com.ericsson.s345g.resourcePool.ResourcePool;
import com.ericsson.s345g.schedule.Schedule;

/**
 * Generate calls following patterns
 */
public class GenerateCalls extends java.util.TimerTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);

    private List<Pattern> patternList;
    private final ResourcePool resourcePool;
    public final Config config;
    int curPattern = 0;
    private final Schedule schedule;
    private int monitorPeriod = 1000;
    private long numScheduled = 0L;
    private long patternId = 0L; // id for the next call instance to be generated
    private Timer timer;

    public GenerateCalls(Config conFigObj, Schedule scheduler, ResourcePool resourceObj) {
        schedule = scheduler;
        config = conFigObj;
        resourcePool = resourceObj;
        monitorPeriod = (int) config.get(Param.DistMonitor, monitorPeriod);
        setupCallPatterns();
    }

    /**
     * Set up the pattern of calls to use.
     */
    private void setupCallPatterns() {
        List<Pattern> availPatternList = new ArrayList<>();
        patternList = new ArrayList<>();
        PatternParser patternParser = new PatternParser();

        Pattern pattern;

        File dir = new File((String) config.get(Param.PatternDir, "patterns"));
        File[] files;
        if (!dir.isDirectory()) {
            throw new IllegalArgumentException("PatternDir >" + dir.getAbsolutePath() + "< is not a valid directory!");
        }
        files = dir.listFiles();
        int sumFreq = 0;
        for (File f : files) {
            if (f.isFile()) {
                try {
                    String patName = f.getName();
                    int freq = config.getValue(patName, -1);
                    if (freq > 0) {
                        pattern = patternParser.parseCallPatternFile(f.getAbsolutePath(), false);
                        pattern.setName(f.getName());

                        sumFreq += freq;
                        pattern.setFreq(freq);
                        if (pattern.isValid()) {
                            availPatternList.add(pattern);
                            LOGGER.debug(" Pattern {}, Frequency {} ", patName, freq);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        LOGGER.debug("Setup found {} files producing {} patterns for a total frequency of {}.", files.length, availPatternList.size(), sumFreq);

        if (availPatternList.size() == 0) {
            throw new IllegalArgumentException("Config file does not specify any valid patterns!");
        }

        // setup the pattern of calls to use
        for (Pattern template: availPatternList) {
            for (int i = 0; i < template.getFreq(); i++) {
                patternList.add(template);
            }
        }
        Collections.shuffle(patternList); // randomise the order of the calls

        LOGGER.debug("Setup {}  call patterns for  {}  calls per second.", patternList.size(), config.getCurrentCPS());
    }

    /**
     * generate the events for this pattern
     * @return list of events to be scheduled
     */
    public EventList getNextCall() {
        // get the next pattern to be used
        curPattern = (curPattern + 1) % patternList.size();
        patternId++;

        Pattern pattern = patternList.get(curPattern);
        return pattern.makeCall(resourcePool, patternId);
    }

    /*
     * start the thread that will call send messages every second
     */
    public void start() {
        LOGGER.debug("Starting Call timer");
        timer = new Timer(GenerateCalls.class.getSimpleName());
        timer.schedule(this, monitorPeriod, monitorPeriod);
    }

    /*
     * clean up the distribution thread
     */
    public void stop() {
        LOGGER.debug("Stopping Call timer");
        timer.cancel();
        timer.purge();
    }

    /*
     * get the status
     */
    public void status() {
        LOGGER.debug("Number of messages scheduled is {} ", numScheduled);
    }

    /*
     * This gets called by the scheduler every 'monitorPeriod' millisecs.
     */
    @Override
    public void run() {
        try {
            int numCallsToSchedule = config.getCurrentCPS() * monitorPeriod / 1000;

            for (int i = 0; i < numCallsToSchedule; i++) {
            	EventList evtList = getNextCall();
            	schedule.scheduleEvents(evtList);
            	numScheduled+=evtList.len();
            }
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.debug("Call Pattern exception ");
        }
    }

}