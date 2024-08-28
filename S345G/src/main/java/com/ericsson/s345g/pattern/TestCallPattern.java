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

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.zip.GZIPOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.s345g.channel.ChannelMgr;
import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.distribute.Distribute;
import com.ericsson.s345g.events.*;
import com.ericsson.s345g.resourcePool.ResourcePool;
import com.ericsson.s345g.schedule.Schedule;
import com.ericsson.s345g.utils.Utils;

/*

 */
public class TestCallPattern  {

    final static Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private ResourcePool resourcePool;

    /**
     * Used in feature test mode
     *
     */
    public TestCallPattern(String[] args) throws FileNotFoundException {
        boolean verbose = false;
        String iniFile = S3Defaults.INIFILETEST;
        PatternParser patternParser = new PatternParser();

        String section = "Paths";

        String patFile = "patterns/testPatterns/NrDuBaseTest.pat";
        int duration = 0;

        for (int i = 0; i < (args.length); i++) {
            if (args[i].equals("-i")) { // iniFile
                iniFile = args[i + 1];
            }
            if (args[i].equals("-p") && i < (args.length -1) ) { // patternFile
                patFile = args[i + 1];
            }
            if (args[i].equals("-d") && i < (args.length -1) ) { // duration
                duration = Utils.safeParseInt(args[i + 1]);
            }
            if (args[i].equals("-v")) { // verbose
                verbose = true;
            }
        }

        if (verbose) {
            System.out.println("About to start in FT mode with config from " + iniFile + " and pattern file " + patFile);
        }
        Config config = new Config(iniFile, section);
        config.setParam(Param.NumChannels, 1);
        config.setParam(Param.NumNodes, 2);
        ChannelMgr chnlMgr = new ChannelMgr(config);

        resourcePool = new ResourcePool(config);
        Pattern pat = patternParser.parseCallPatternFile(patFile, verbose);

        long st = System.currentTimeMillis();
        EventList eventList = pat.makeCall(resourcePool, 2L );
        long et = System.currentTimeMillis();

        if (verbose) {
            System.out.println("Call generation took " + (et - st) + "ms.");
            System.out.println("\nParameters used");
        }

        if (verbose) {
            System.out.println("\nEvents generated:\n" );
            LOGGER.debug("\nEvents generated:\n");
            for (Event evt: eventList) {
                System.out.println( evt.toString());
                LOGGER.debug(evt.toString());
                PmEvent pmEvent = evt.getPmEvent();
                if (pmEvent != null) {                
                    System.out.println( pmEvent.toString());
                    MsgMaker mm = new MsgMaker();
                    HashMap <String, Object> fullDecode = mm.decodeEvent(pmEvent);
                    System.out.println(fullDecode);
                } else {
                    System.out.println( "pmEvent is NULL!");
                }
            }
        }
        Schedule schedule = new Schedule(config);
        schedule.scheduleEvents(eventList);
        Distribute distribute = null;
        if (duration > 0) {
            distribute = new Distribute(schedule, config, resourcePool, chnlMgr);
        }

        LOGGER.debug("\nEvents scheduled");
        if (verbose) {
            System.out.println("\nEvents scheduled");
        }

        try {
            Path p = Paths.get(patFile);
            GZIPOutputStream out = new GZIPOutputStream(
                            new FileOutputStream("TestCall_"+p.getFileName().toString()+".bin.gz"));

            int monitorPeriod = (int) config.get(Param.DistMonitor, 1000);
            int queueSize = config.getValue(Param.QueueSize.name(), S3Defaults.QUEUESIZE);
            boolean done = false;
            for (int i = 0; i < queueSize && !done; i++) {
                if (duration > 0) {
                    eventList = schedule.getNextEvtList();
                } else {
                    eventList = schedule.getScheduledEvents();
                }

                if (eventList.len() > 0) {
                    LOGGER.debug("At time T+{}ms: {}", ((i - 2) * monitorPeriod), eventList.len());
                    if (verbose) {
                        System.out.println("At time T+"+ ((i - 2) * monitorPeriod) + "ms:"+eventList.len());
                    }
                    for (Event evt : eventList) {
                        LOGGER.debug(" {} ", evt.toString());
                        if (verbose) {
                            System.out.println(" "+evt.toString());
                        }

                        if (evt.getEventId() == S3Defaults.TERMINATIONEVENTID) {
                            done = true;
                        } else if (!evt.isInternal()){  // add event to file unless it is internal
                            out.write(evt.getMsg());
                        }
                    }
                }
                if (duration > 0) {// if the call duration has been specified, send in real time
                    distribute.doStuff();
                    Utils.snooze(monitorPeriod);
                }
            }
            out.close();
            if (duration > 0) {
                distribute.stop();
            }
            chnlMgr.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
