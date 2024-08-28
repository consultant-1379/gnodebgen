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
package com.ericsson.s345g.resourcePool;

import java.util.List;
import java.util.Map;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.topology.Topology;
import com.ericsson.s345g.topology.wrapper.NetworkFunctionAttribute;
import com.ericsson.s345g.configure.Config;
import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.configure.ParamMap;
import com.ericsson.s345g.utils.Utils;

/*
 * Allocate and manage resources shared among patterns
 */
public class ResourcePool {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private final Config config;
    private final Topology topology;
    private byte[] plmn = new byte[3];
    private int numDuration = -1; // number of call Durations
    private int[] callDuration;
    private static final Random random = new Random();
    private boolean useSerialCells = false;
    private long nextUeTraceId = 0;
    private boolean traceUeTraceId = false;
    private int gNodeBIdLen;

    /*
    */
    public ResourcePool(Config configObj) {
        config = configObj;
        topology = config.getTopology();

        gNodeBIdLen = (Integer) config.get(Param.gNodeBIdLen, S3Defaults.GNBIDLENGTH);
        if (gNodeBIdLen < 22 || gNodeBIdLen > 32) {
            gNodeBIdLen = 22;
        }

        plmn = topology.getPlmnId();

        /* build call duration table */
        setupCallDuration();

        /*
         * If tracing events, it is useful to control the trace
         *
         */
        Object val = config.get(Param.TraceUeTraceId, 0);
        if (val instanceof Integer) {
            nextUeTraceId = (int) val;
        } else {
            nextUeTraceId = (long) val;
        }
        if (nextUeTraceId > 0) {
            traceUeTraceId = true;
        }
        Object serial = config.get(Param.UseSerialCells, 0);
        int serialTemp=0;
        if (serial instanceof Integer) {
        	serialTemp = (int) serial;
        }
        if (serialTemp > 0) {
        	useSerialCells = true;
        }
    }

    /*
     * release resources associated with this pattern
     */
    public void release(long patternId) {
        // no resources currently need releasing
    }

    /**
     * Given a list of params, assign a value to each one
     */
    public ParamMap get(List<Param> paramsNeeded, long patternId) {
        ParamMap paramMap = new ParamMap();
        int val;
        // get the cell that is going to generate these events
        int nci;
        if (useSerialCells) {
            nci = topology.getNextNetworkCellId();
        } else {
            nci = topology.getRandomNetworkCellId();
        }

        int gnodeId = topology.getGnodeBId(nci);

        Map<String, NetworkFunctionAttribute> topologyParam = topology.getNetworkFuncationAttribute(gnodeId);
        if (null != topologyParam) {
            paramMap.put(Param.TopologyParam, topologyParam);
        }
        // int gnb_id = topology.get
        byte[] genbytes = new byte[3];

        paramMap.put(Param.PatternId, patternId);

        double pick1 = random.nextDouble();
        /*
         * every node has at least one of each three network function. every
         * node has one or more cells every network function requires a channel
         * to the destination. every network function is a source every event
         * comes from source
         */
        int unsetVal = 1; // default used for requested values when no other
                          // rule
        for (Param param : paramsNeeded) {
            if (paramMap.get(param) == null) {
                switch (param) {
                case Source:
                    paramMap.put(Param.Source, gnodeId);
                    break;
                case nci:
                    paramMap.put(param, nci);
                    break;
                case gnb_id:
                    paramMap.put(param, gnodeId);
                    break;
                case main_plmn_id:
                    paramMap.put(param, plmn);
                    break;
                case gnb_id_length:
                    paramMap.put(param, gNodeBIdLen);
                    break;
                case Duration:
                    val = callDuration[(int) (pick1 * numDuration)];
                    paramMap.put(param, val);
                    break;

                case FailReason:
                    val = 1 + (int) (pick1 * 24); // 1 to 25
                    paramMap.put(param, val);
                    break;

                case ue_trace_id:
                    long ueTraceVal = 0L;
                    if (traceUeTraceId) {
                        ueTraceVal = nextUeTraceId;
                        nextUeTraceId = (nextUeTraceId + 1) % Long.MAX_VALUE;
                    } else {
                        ueTraceVal = (long) (Math.random() * Long.MAX_VALUE); // 8
                                                                              // bytes
                                                                              // unique
                                                                              // for
                                                                              // call
                    }
                    paramMap.put(param, Utils.longToBytes(ueTraceVal));
                    break;

                case trace_recording_session_reference:
                    val = (int) (Math.random() * 2147483647);
                    genbytes[0] = (byte) (val >> 16);
                    genbytes[1] = (byte) (val >> 8);
                    genbytes[2] = (byte) val;

                    paramMap.put(param, genbytes);
                    break;

                default:
                    paramMap.put(param, unsetVal);
                    unsetVal += 1;
                    break;

                }
            }
        }

        if ((int) config.get(Param.SetUUIDLen, 0) > 0) {
            paramMap.put(Param.SetUUIDLen, (int) config.get(Param.SetUUIDLen, 0));
        }
        return paramMap;
    }

    private void setupCallDuration() {
        String key = null;
        String val = null;
        int idx;
        int callLen = 1;
        int maxCallLen = 1;
        int callNum = 1;
        long sumCallLen = 1;
        numDuration = 0;
        // 1st pass, work out how many entries are needed
        for (int i = 0; i <= 99; i++) {
            key = "Duration" + i;
            val = config.getValue(key, ""); // we are expecting
                                            // callLength,quantity
            if (val != "") {
                idx = val.indexOf(',');
                if (idx > 0 && idx < val.length()) {
                    callLen = Utils.safeParseInt(val.substring(0, idx).trim());
                    callNum = Utils.safeParseInt(val.substring(idx + 1).trim());
                    if (callNum > 0 && callLen > 0) {
                        numDuration += callNum;
                        sumCallLen += callLen * callNum;
                        if (callLen > maxCallLen) {
                            maxCallLen = callLen;
                        }
                    }
                }
            }
        }
        if (numDuration < 1) {
            LOGGER.warn("No valid call duration rules loaded - using default of {} seconds", S3Defaults.CALLDURATION);
            numDuration = 1;
            callDuration = new int[numDuration];
            callDuration[0] = S3Defaults.CALLDURATION;
        }
        if (numDuration > 1000) {
            LOGGER.warn("More than 1000 calls specified, limiting rules to 1st thousand calls.");
            numDuration = 1000;
        }
        callDuration = new int[numDuration];
        int numCalls = 1;
        // 2nd Pass, work out individual call durations
        for (int i = 0; i <= 99 && numCalls < numDuration; i++) {
            key = "Duration" + i;
            val = config.getValue(key, ""); // we are expecting
                                            // callLength,quantity
            if (val != "") {
                idx = val.indexOf(',');
                if (idx > 0 && idx < val.length()) {
                    callLen = Utils.safeParseInt(val.substring(0, idx).trim());
                    callNum = Utils.safeParseInt(val.substring(idx + 1).trim());
                    if (callNum > 0 && callLen > 0) {
                        for (int j = 0; j < callNum && numCalls < numDuration; j++) {
                            callDuration[numCalls] = callLen;
                            numCalls++;
                        }
                    }
                }
            }
        }

        config.setAvgCallLen((int) (sumCallLen / numCalls * 1.0));
        LOGGER.debug("Loaded call duration rules for {} calls with an average duration of {} seconds.", numDuration,
                sumCallLen / numCalls);

        int monitorPeriod = (int) config.get(Param.DistMonitor, 125);
        int queueSize = config.getValue(Param.QueueSize.name(), S3Defaults.QUEUESIZE);
        if ((maxCallLen * 1000) > monitorPeriod * queueSize) { // convert to
                                                               // millisecs
            LOGGER.error(
                    "Queue is not large enough for longest call to be scheduled successfully! Expect unpredictable behaviour.");
            LOGGER.error("Longest call is {}, maximum queue length is {}", maxCallLen,
                    (monitorPeriod * queueSize) / 1000);
        }
    }

    public int[] getDurationValues() {
        return callDuration;
    }

}
