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
package com.ericsson.s345g.channel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.zip.GZIPOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.s345g.configure.Config;
import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.events.Event;
import com.ericsson.s345g.topology.Topology;
import com.ericsson.s345g.utils.Utils;
import com.google.protobuf.CodedInputStream;

/**
 * manage output channels
 *
 * for each gNodeB we need a channel per network function
 * every Network function is its own source and has its own channel
 *
 * (it may have more the one cell - but cells are shared by gNodeB)
 */
public class ChannelMgr extends java.util.TimerTask {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private Config config;
    private Topology topology;
    private Map<String, Connection> src2destMap;
    private List<Connection> connectionList;
    private List<SocketAddress> destAddresses;
    private boolean logToFile = false;
    private BufferedWriter logToFileHandle = null;
    private GZIPOutputStream logToFileGZ=null;
    private Timer timer;
    private int lastChecked = 0;
    private boolean running = false;  // execution state of reconnection task

    public ChannelMgr(Config configObj) {
        config = configObj;
        Connection connection;
        topology = config.getTopology();
        src2destMap = new HashMap<>();
        connectionList = new ArrayList<>();

        logToFile = (int) (config.get(Param.LogToFile, 0)) > 0;
        if (logToFile) {
            try {
                // These handles are closed in the close() method
                logToFileHandle = new BufferedWriter(new FileWriter("NrGPB.decode", false));
                logToFileGZ = new GZIPOutputStream(new FileOutputStream(new File("NRGPB.gpb.gz")));
            } catch (Exception e) {
                logToFile = false;
            }
        }
        // Do we need to create individual CTR files
        Boolean logCTRFiles = false;
        String logCTRFilesPath = (String) config.get(Param.LogCTRPath, S3Defaults.UNSET);
        String symLinkPath = S3Defaults.UNSET;
        if (!S3Defaults.UNSET.equals(logCTRFilesPath)) {
            logCTRFiles = true;
            int lenROP = (int) config.get(Param.ROPlen, S3Defaults.ROPLENGTH);
            LOGGER.info("Writing CTR files to output directory {} using ROP length of {} minutes.", logCTRFilesPath, lenROP);
            symLinkPath = (String) config.get(Param.SymLinkPath, S3Defaults.UNSET);
            if (!S3Defaults.UNSET.equals(symLinkPath)) {
                LOGGER.info("Writing symbolic links to {}.", symLinkPath);
            }
        }

        if (getAddresses() == 0) {
            LOGGER.warn("No TCP/IP channels to process.");// No tcp output channels - nothing to do
            return;
        }

        /*
        * each gNodeB needs a connection per NF
        * each event will be sent on the connection for its gNB for its NF
        * events with NF = UNSET will not get sent.
        */
        List<String> networkFunctionList = topology.getNetworkFunctionList();  // gNB + NF
        int nextDest = 0;
        LOGGER.info("creating {} connections.", networkFunctionList.size());

        int i = 0;
        for (String nodeId : networkFunctionList ) {

        	System.out.println(nodeId);
        	String nodeName = topology.getNodeName(nodeId);
            connection = new Connection(destAddresses.get(nextDest), nodeName, logCTRFiles, logCTRFilesPath, symLinkPath);
            if (connection.getLocalAddress() != null) {
			System.out.println(connection.getLocalAddress().replace("/", "")+"="+ topology.getNodeNameToNodeIdMap().get(nodeId));
            }
            if (i++ % 100 == 0) {
                Utils.snooze(10); // take a short pause every now and again when opening lots of connections
            }
            src2destMap.put(nodeId, connection);
            connectionList.add(connection);
            nextDest = (nextDest + 1) % destAddresses.size();
        }

        timer = new Timer(ChannelMgr.class.getSimpleName());
        timer.schedule(this, 2000, 1000);
    }

    public boolean write(Event evt) {
        Utils.incToWrite();
        String dest = evt.getSource().toString() + evt.getNf().name();
        int eventLen = 0;
        Connection cnct = src2destMap.get(dest);
        if (cnct != null && cnct.getStatus() == CState.READY) {
            if (logToFile) {
                logToFile(evt.getMsgBB().duplicate());
            }
            eventLen = cnct.write(evt.getMsgBB());  // count the bytes written
            Utils.incWritten();
            if (eventLen == 0) { // write was unsuccessful
                LOGGER.warn("write failed!");
                return false;
            }
            config.logEventLen(eventLen);  // keep track of event lengths for msg sizing etc.
            return true;
        }
        LOGGER.warn("write ended!");
        return false;
    }

    public void rollROP(String rop) {
        for (Connection cnct : connectionList ) {
            cnct.rollCTRFile(rop);
        }
    }

    private void logToFile(ByteBuffer eventBB) {
        try {
        	logToFileGZ.write(eventBB.array());
        	CodedInputStream inStream = CodedInputStream.newInstance(eventBB);
        	inStream.pushLimit(inStream.readRawVarint32());
            PmEvent pmEvt = PmEvent.parseFrom(inStream);
            logToFileHandle.write(pmEvt.toString()+"\n");
        } catch (IOException e) {
            e.printStackTrace();
            logToFile = false;
        }
    }
    public void close() {
        timer.cancel(); // cancel the timer task looking after reconnects etc.
        timer.purge();

        for (Connection cnct : src2destMap.values()) {
            cnct.close();
        }
        if (logToFile) {
            try {
                logToFileHandle.close();
                logToFileGZ.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            logToFile = false;
        }
    }

    /**
     * populate the destAddress arraylists<br>
     *
     * @return the number of possible destination
     */
    private int getAddresses() {
        destAddresses = new ArrayList<>();
        String destIp = (String) config.get(Param.DestIp, "localhost");
        String destPort = (String) config.get(Param.DestPort, "10102");

        List <Integer> portList = parserPorts(destPort);

        try{
            for (Integer port : portList) {
                SocketAddress addr = new InetSocketAddress(destIp, port);
                destAddresses.add(addr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (destAddresses.isEmpty()) {
            return 0; // with no destinations, there can be no connections
        }

        return destAddresses.size();
    }

    private List<Integer> parserPorts(String ports) {
        List <Integer> portList = new ArrayList<>();
        Integer port;
        String [] splt = null;
        if (ports.contains(":")){
            splt = ports.split(":");
        } else if ( ports.contains("-")) {
            splt = ports.split("-");
        } else {
            port = Utils.safeParseInt(ports);
            portList.add(port);
        }
        if (null != splt && splt.length > 1) {
            int strt = Utils.safeParseInt(splt[0]);
            int end = Utils.safeParseInt(splt[1]);
            for (int val = strt; val <= end; val++){
                portList.add(val);
            }
        }
        return portList;
    }

    /**
     * Handle reconnects etc.
     * This is called every second, but reconnects can take three seconds or more to fail
     * so do nothing if already running
     */
    @Override
    public void run() {
        if (running) { // avoid multiple instances
            return;
        }
        running = true;
        boolean done = false;
        int index;
        for (index = 0; index < connectionList.size() && !done; index++ ) {
            Connection cnct = connectionList.get((index + lastChecked) % connectionList.size());
            switch (cnct.getStatus()) {
            case DROPPED: // write attempt has failed
            case CLOSED:  // connection attempt not successful
                if (!cnct.reconnect()) {
                    done = true;  // if reconnect fails, break loop
                }
                break;
            default:
                break;
            }
        }
        lastChecked = (index + lastChecked + 1) % connectionList.size();
        running = false;
    }

}
