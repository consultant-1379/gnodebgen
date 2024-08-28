/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014-2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.s345g.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

import com.ericsson.s345g.distribute.Distribute;
import com.ericsson.s345g.utils.MovingAverage;

import org.slf4j.LoggerFactory;

public class ServerMonitor extends java.util.TimerTask {
    final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(ListenerTest.class);
    private final int monitorPeriod;
    private MovingAverage avgEvtLen;
    private int numChannel = 0;
    private long numEvent = 0;
    private long numError = 0;
    private long bytesRead = 0;
    private long lastBytesRead = 0;
    private long lastNumEvent = 0;
    private long st;
    private long lt;
    private boolean first = true;
    private String template;
    private Map<Integer, Integer> eventIdMap = new HashMap<>();
    private boolean showIdCnt = false;  // true if Id counts to be shown


    public ServerMonitor(int monitor, boolean showId) {
        monitorPeriod = monitor;
        avgEvtLen = new MovingAverage(1000);
        showIdCnt = showId;
    }

    public void incEventIdCnt(Integer evtId) {
        Integer x = eventIdMap.get(evtId);
        if (null==x) {x=0;}
        eventIdMap.put(evtId, x+1);        
    }

    public void incNumChannel() {
        this.numChannel++;
    }

    public void decNumChannel() {
        this.numChannel++;
    }

    public long getNumChannel() {
        return this.numChannel;
    }

    public void incNumEvent() {
        this.numEvent++;
    }

    public void incNumError() {
        this.numError++;
    }

    public void incBytesRead(int len) {
        this.bytesRead += len;
        avgEvtLen.add(len);
    }

    public void run() {
        long et = System.currentTimeMillis();
        long numEvt = numEvent;
        long bytesR = bytesRead;
        int rt = (int) (numEvt * 1000.0 / (et - st)); // average per sec since startup
        int r1 = (int) ((numEvt - lastNumEvent) * 1000.0 / (et - lt)); // average for last second
        int kbpst = (int) (bytesR / (et - st));
        int kbps1 = (int) ((bytesR - lastBytesRead) / (et - lt));
        lastNumEvent = numEvt;
        lastBytesRead = bytesR;
        lt = et;

        if (first) {
            System.out.print("                                    Avg Evts/s     Avg kbytes/s  Avg bytes  ");
            if (showIdCnt) {
                System.out.print("numIds\n");
                template = "   %6d   %9d   %7d %7d  %6d %6d  %6d  %8.2f    %5d\r";
            } else {
                System.out.print("\n");
                template = "   %6d   %9d   %7d %7d  %6d %6d  %6d  %8.2f    \r";
            }
            System.out.println(" Channels:     Events:   Errors:    run:   spot:   run:   spot:  per evt:         ");
            //template =         "   %6d   %9d   %7d %7d  %6d %6d  %6d  %8.2f    %5d\r";
            first = false;
        }
        if (showIdCnt) {
            System.out.print(String.format(template,
                        numChannel, numEvt, numError, rt, r1, kbpst,  kbps1, avgEvtLen.getAverage(), eventIdMap.size()));
            if (!eventIdMap.isEmpty()) {
                LOGGER.debug(eventIdMap.toString());
            }
        } else {
            System.out.print(String.format(template, numChannel, numEvt, numError, rt, r1, kbpst, kbps1,
                    avgEvtLen.getAverage()));
        }

    }

    public void start() {
        new Timer(Distribute.class.getSimpleName()).schedule(this, monitorPeriod, monitorPeriod);
        st = System.currentTimeMillis();
    }

    public void stop() {
        System.out.println("\nServer Monitor stopped.");
        if (!eventIdMap.isEmpty()) {
            System.out.println(eventIdMap);
        }
        this.cancel();
    }
}
