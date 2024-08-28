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

package com.ericsson.s345g.configure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.topology.Topology;
import com.ericsson.s345g.utils.MovingAverage;
import com.ericsson.s345g.utils.Utils;

/**
 * Configuration class
 *
 * @author xpatjai
 *
 */
public class Config {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);

    private final ParamMap paramMap;
    private static final String GENERAL_SECTION = "General";
    private static Map<String, String> propMap = new HashMap<>();
    private final List<String> sections = new ArrayList<>();
    private Topology topology;
    private int avgCallLen = 0;
    private int numCells = 0;
    private int origNumCallsPerSec = S3Defaults.NUMCALLSPERSEC;
    private MovingAverage avgEventLen;
    // AtomicInt instead of int as it is accessed from multiple threads
    private AtomicInteger numCallsPerSec = new AtomicInteger(S3Defaults.NUMCALLSPERSEC);
    private AtomicInteger targetCallsPerSec = new AtomicInteger(S3Defaults.NUMCALLSPERSEC);

    /**
     *
     * @param filename
     * @param section
     * @throws FileNotFoundException is the config file name is not found
     */
    public Config(String filename, String section) throws FileNotFoundException {
        paramMap = new ParamMap();
        File file = new File(filename);
        if (!file.exists() || file.isDirectory()) {
            String text = "specified config file "+file.getAbsoluteFile()+" not found!";
            LOGGER.error(text);
            throw new FileNotFoundException(text);
        }
        LOGGER.debug("Config Reading from {} ", filename);
        addSection(GENERAL_SECTION);
        addSection(section);
        parseS3ini(filename);

        populatePatternINI();

        origNumCallsPerSec = (int) get(Param.NumCallsPerSec, S3Defaults.NUMCALLSPERSEC);
        targetCallsPerSec.lazySet(origNumCallsPerSec);
        numCallsPerSec.set((int) get(Param.InitCallsPerSec, origNumCallsPerSec));

        topology = new Topology(this);
        numCells = topology.getNumCells();
        setParam(Param.NumCells, numCells);
        avgEventLen = new MovingAverage(1000);  // get the average over the last thousand events
    }

    public Topology getTopology() {
        return topology;
    }

    /** Set value to the param list. */
    public void setParam(final Param key, final Object val) {
        paramMap.put(key, val);
    }

    /**
     * get the value to use for parameter - or return default
     */
    public Object get(Param param, Object defaultVal) {
        Object val = paramMap.get(param);
        if (val == null) {
            return defaultVal;
        } else {
            return val;
        }
    }

    public int getRoamingPlmn() {
        int roamingPLMN = 35302;
        return roamingPLMN;
    }

    /**
     * Return a value for a given property.
     *
     * @param property
     * @param defaultVal
     * @return
     */
    public String getValue(String property, String defaultVal) {
        String res = propMap.get(property.toLowerCase());
        if (res == null) {
            return defaultVal;
        }
        return res;
    }

    /**
     * Return a value for a given property.
     *
     * @param property
     * @param defaultVal
     * @return
     */
    public Integer getValue(String property, Integer defaultVal) {
        String res = getValue(property, defaultVal.toString());
        return Utils.safeParseInt(res);
    }

    /**
     * Return a value for a given property.
     *
     * @param property
     * @param defaultVal
     * @return
     */
    public double getDoubleValue(String property, double defaultVal) {
        String res = propMap.get(property.toLowerCase());
        return Utils.safeParseDouble(res, defaultVal);
    }


    public int getNumCells() {
        return topology.getNumCells();
    }

    public void logEventLen(int eventLen) {
        avgEventLen.add(eventLen);
    }

    public float getAvgEventLen() {
        return avgEventLen.getAverage();
    }

    public int getLastEventLen() {
        return avgEventLen.getLast();
    }
    /**
     */
    private void parseS3ini(String fileName) {
        String value;
        String property;
        List <String> fileText = Utils.readFile(fileName);
        boolean inSection = false;

        for (String line : fileText) {
            if (line.startsWith("[")) { // section marker
                inSection = false;
                for (String section : sections) {
                    // is it the section we want
                    if (line.equals(section)) {
                        inSection = true;
                        LOGGER.debug("In section {}", section);
                    }
                }
            }
            if (inSection) {
                // get what ever is on either side of '='
                int idx = line.indexOf('=');
                if (idx > 0 && idx < line.length()) {
                    property = line.substring(0, idx).trim();
                    value = line.substring(idx + 1).trim();
                    Param param = Param.getParamByName(property);
                    LOGGER.debug("Config {} ({}) : {}", property, param, value);
                    // check if a system property overrides config value
                    String overRide = System.getProperty(property);
                    if (overRide != null) {
                        LOGGER.debug("Config cmdLine override {} : {}", property, overRide);
                        value = overRide;
                    }
                    propMap.put(property.toLowerCase(), value);

                    // parse the value
                    // String, byte array, bool, long, int, float
                    if (param != null) {
                        // deal with strings
                        if (value.startsWith("\"")) {
                            value = value.substring(1, value.length() - 1);
                            setParam(param, value);
                            // deal with byte arrays
                        } else if (value.startsWith("b\"")) {
                            value = value.substring(1, value.length() - 1);
                            setParam(param, Utils.hexStringToByteArray(value));
                            // just a number. int, long or float?
                        } else if (value.trim().equalsIgnoreCase("true") || value.trim().equalsIgnoreCase("false")) {
                            setParam(param, Boolean.valueOf(value));
                        } else if (value.contains(".")) { //double value
                            setParam(param, new Double(Double.parseDouble(value)));
                        } else {
                            Object val = null;
                            try {
                                val = Integer.valueOf(value);
                            } catch (NumberFormatException e) {
                            	//out of range for int
                                val = new Long(Long.parseLong(value));
                            }
                            setParam(param, val);
                        }
                    }
                }

            }

        }
    }

    /**
     * Populate the pattern file specified in the patterns directory.
     */
    private void populatePatternINI() {
        // Check for the pattern.ini file in the pattern directory
        String patternFileName = (String) get(Param.PatternDir, "patterns")
                + File.separator
                + (String) get(Param.PatternINIFileName, "");

        File file = new File(patternFileName);
        if (!file.exists() || file.isDirectory()) {
            LOGGER.error("specified pattern file {} not found. Provide valid pattern file in the pattern directory.",
                file.getAbsoluteFile());
            return;
        }

        String value;
        String property;
        List <String> fileText = Utils.readFile(patternFileName);
        for (String line : fileText) {
            int idx = line.indexOf('=');
            if (idx > 0 && idx < line.length()) {
                property = line.substring(0, idx).trim();
                value = line.substring(idx + 1).trim();
                propMap.put(property.toLowerCase(), value);
                Param param = Param.getParamByName(property);

                if (param != null) {
                    setParam(param, Integer.valueOf(value));
                }
            }
        }

    }

    /*
     * This methods adds the section to the section list.
     *
     * @param section
     */
    private void addSection(String section) {
        String cn = "[" + section + "]";
        sections.add(cn);
    }

    /**
     * get the current number of calls per second
     *
     * @return
     */
    public int getCurrentCPS() {
        return numCallsPerSec.get();
    }

    /**
     * get the target number of calls per second
     *
     * @return
     */
    public int getTargetCPS() {
        return targetCallsPerSec.get();
    }

    /**
     * Adjust the current call rate by the given percentage Nothing happens for 0 or
     * 100
     *
     * @param newCallRate
     *            percentage to adjust call rate
     */
    public void adjustCurrentCPS(int adjustPerCent) {
        if (adjustPerCent != 0) {
            int oldRate = getCurrentCPS();
            int newRate = (int) (oldRate * (adjustPerCent * 0.01)); // same as dividing by 100.0 but forces auto boxing
            int maxRate = getTargetCPS();
            newRate = Math.min(newRate, maxRate);
            LOGGER.debug("Adjusting current callsPerSecond by {}% from {} to {}", adjustPerCent, oldRate, newRate);
            if (oldRate != newRate) {
                numCallsPerSec.lazySet(newRate);
            }
        }
    }

    /**
     * Adjust the target call rate by the given percentage<br>
     * Nothing happens for 0 or 100
     *
     * @param newCallRate
     *            percentage to adjust call rate
     */
    public void adjustTargetCPS(int adjustPerCent) {
        if (adjustPerCent != 0) {
            int baseRate = origNumCallsPerSec;
            int newRate = (int) (baseRate * (adjustPerCent * 0.01)); // same as dividing by 100 but forces auto boxing
            LOGGER.debug("Adjusting base rate of {} by {}% to {}.", baseRate,
                    adjustPerCent, newRate);
            if (newRate != getTargetCPS() && newRate > 0) {
                targetCallsPerSec.lazySet(newRate);
            }
        }
    }

    public void setTargetCPS(int newTargetCallsPerSec) {
        targetCallsPerSec.lazySet(newTargetCallsPerSec);
    }

    public void setAvgCallLen(int avgCallLenObj) {
        avgCallLen = avgCallLenObj;
    }

    public int getAvgCallLen() {
        return avgCallLen;
    }

}
