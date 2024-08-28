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

/* Dummy change to test Jenkins build 10:49 */
package com.ericsson.s345g.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;

import com.ericsson.s345g.busyhour.BusyHour;
import com.ericsson.s345g.channel.ChannelMgr;
import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.distribute.Distribute;
import com.ericsson.s345g.pattern.GenerateCalls;
import com.ericsson.s345g.pattern.TestCallPattern;
import com.ericsson.s345g.resourcePool.ResourcePool;
import com.ericsson.s345g.schedule.Schedule;
import com.ericsson.s345g.utils.Utils;
import com.ericsson.s345g.netty.EventListener;

/*
 * Top level logic for call simulator
 */
public class Main {
    static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    static volatile boolean keepRunning = true;

    /**
     * @param args
     */
    public static void main(String[] args) throws FileNotFoundException {
        // make the objects we will need
        String iniFile = S3Defaults.INIFILE;
        String section = "Paths";
        boolean featureTest = false;
        boolean listenerTest = false;
        boolean verbose = false;
        boolean showEPS = false;
        boolean showAVG = false;
        String setAVG = "";
        boolean nettyListener = false;
        String outputLocation = null;
        int serverPort = 10102;
        int rop_time = 0;
        boolean fileBasedFlag = false;

        for (int i = 0; i < (args.length); i++) {
            if (args[i].equals("-i") && i < (args.length -1)) { // iniFile
                iniFile = args[i + 1];
            }
            if (args[i].equals("-s") && i < (args.length -1)) { // input section
                section = args[i + 1];
            }
            if (args[i].equals("-ft")) { // feature test mode
                featureTest = true;
            }
            if (args[i].equals("-lt")) { // feature test mode
                listenerTest = true;
            }
            if (args[i].equals("-v")) { // verbose mode
                verbose = true;
            }
            if (args[i].equals("-e")) { // show EPS mode
                verbose = true;
                showEPS = true;
            }
            if (args[i].equals("-es")) { // show event Size
                verbose = true;
                showAVG = true;
            }
            if (args[i].equals("-ses") && i < (args.length -1)) { // show event Size
                verbose = true;
                showAVG = true;
                setAVG = args[i + 1];
            }
            if (args[i].equals("-nlt")) {
                nettyListener = true;
                if (args.length != 5) {
                    LOGGER.error("Please provide proper arguments 1. ROP Time 2. File Location 3. Listener Port");
                    System.exit(1);
                }
                rop_time = Integer.parseInt(args[i + 1].trim());
                outputLocation = args[i + 2].trim();
                serverPort = Integer.parseInt(args[i + 3].trim());
                fileBasedFlag = Boolean.valueOf(args[i + 4].toLowerCase().trim());   // true|false
                break;
            }
        }

        if (nettyListener) {
            try {
                new EventListener().main(rop_time, outputLocation, serverPort, fileBasedFlag);
            } catch (Exception e) {
                LOGGER.info("Error while loading event listener. Please validate input parameters. " + e.getMessage());
            }
            return;
        }

        if (featureTest) {
            new TestCallPattern(args);
            return;
        }
        if (listenerTest) {
            ListenerTest.main(args);
            return;
        }

        Config config = new Config(iniFile, section);
        if (verbose) {
            config.setParam(Param.Verbose, 1);
            if (showEPS) {
                config.setParam(Param.ShowEPS, 1);
            }
            if (showAVG) {
                config.setParam(Param.ShowAVG, 1);
            }
        }
        if (!"".equals(setAVG)) {  // control average event length
            config.setParam(Param.SetAVG, Utils.safeParseInt(setAVG));
            LOGGER.info("Setting average event len to {}", (int)config.get(Param.SetAVG, -1));
        }

        Schedule schedule = new Schedule(config);
        ChannelMgr chnlMgr = new ChannelMgr(config);
        ResourcePool resource = new ResourcePool(config);
        BusyHour busyHour = new BusyHour(config);
        GenerateCalls callGenerator = new GenerateCalls(config, schedule, resource);
        Distribute distribute = new Distribute(schedule, config, resource, chnlMgr);

        // kick off the thread that will distribute any events that have been generated
        distribute.start();

        // kick off the thread that will generate events
        callGenerator.start();

        // kick off the thread that will handle busyhour
        busyHour.start();

        // set up a graceful shutdown hook
        final Thread mainThread = Thread.currentThread();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                keepRunning = false;
                LOGGER.debug("Ctrl-C detected.");

                try {
                    mainThread.join();
                } catch (InterruptedException e) {
                    LOGGER.debug("Interupted.");
                }
            }
        });
        // run for a limited time ?
        int runfor = config.getValue("RunFor", -1);
        do {
            try {
                if (runfor != 0) {
                    Thread.sleep(1000);
                    if (runfor > 0) {
                        runfor -= 1;
                    }
                }
            } catch (InterruptedException e) {
                LOGGER.debug("Interupted.");
            }
        } while (keepRunning && runfor != 0);
        LOGGER.debug("Shutting Down.");
        System.out.println("");  // updates status display
        busyHour.stop();
        callGenerator.stop(); // stop generating new calls
        if (keepRunning) {  // no ctrl-C
            int cooldown = config.getValue("coolDown", 0);  // send events from already scheduled calls
            try {
                Thread.sleep(1000*cooldown);
            } catch (InterruptedException e) {
                LOGGER.debug("Interupted.");
            }
        }
        // handle limited run
        callGenerator.status();
        distribute.status();
        distribute.stop();

        schedule.stop();
        if (verbose) {
        	System.out.println("\nDone.");
        }
    }

}

