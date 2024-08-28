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
package com.ericsson.s345g.configure;

public class S3Defaults {
    private S3Defaults() {}

    public static final int QUEUESIZE = 10000;
    public static final int NUMCALLSPERSEC = 250;
    public static final int CONNECTIONTIMEOUT = 3000;
    public static final int CALLDURATION = 75;
    public static final String INIFILE = "etc/S345G.ini";
    public static final String INIFILETEST = "etc/S345G_testing.ini";
    public static final String TESTPATTERNS = "patterns/testPatterns/testPattern.pat";
    public static final String LOGFILE = "log/S345G.log";
    public static final String INSTRUMENTATIONFILE = "log/S3_instrumentation.log";
    public static final String LOGGER_NAME = "S3_FILE";
    public static final String INSTRUMENTATION_LOGGER = "Instrumentation";
    public static final String TOPOLOGYDIR = "topology/";
    public static final String DELTATOPOLOGYDIR = "delta/";
    public static final String TOPOLOGYHEADTEMPLATE = "template_head.xml";
    public static final String TOPOLOGYBODYTEMPLATE = "template_body.xml";
    public static final String DELTATOPOLOGYHEADTEMPLATE = "template_head.xml";
    public static final String DELTATOPOLOGYBODYTEMPLATE = "template_body.xml";
    public static final String MCC = "310";
    public static final String MNC = "410";
    public static final String UNSET = "unset";
    public static final int CELLSPERNODE = 3;
    public static final int TERMINATIONEVENTID = 9999;
    public static final int NUMNEIGHBOURS = 5;  //
    public static final int GNBIDLENGTH = 22;  //
    public static final int ROPLENGTH = 15;  // default ROP length in minutes
    // codes used to prefix TACs as part of IMEISV
    protected static final int[] RBI = { 1, 35, 1, 35, 86, 91, 33, 49, 53, 45, 0, 2, 3, 4, 5, 6, 7, 8, 9, 0 }; // US, UK, China, India,France,Germany,tests

}
