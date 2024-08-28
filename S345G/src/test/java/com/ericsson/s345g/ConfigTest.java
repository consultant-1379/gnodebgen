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
package com.ericsson.s345g;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.resourcePool.ResourcePool;
import com.ericsson.s345g.utils.Utils;

public class ConfigTest {

    private Config config;

    @Before
    public void setUp() {
        try {
            config = new Config(S3Defaults.INIFILE, "General");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetValue() {
        String result = config.getValue("NumIMSIs", "1200");
        int tmp = Utils.safeParseInt(result);
        int result2 = config.getValue("NumIMSIs", 1200);
        Assert.assertEquals("Values should be the same", result2, tmp);
        int numCells = (int) config.get(Param.NumCells, 0);
        int verify = config.getNumCells();
        Assert.assertEquals("Values should be the same!", verify, numCells);

    }

    @Test
    public void testConfigFloat() {
        // test default
        config.setParam(Param.CellSlope, 12.34);
        double result1 = (double)config.get(Param.CellSlope, 56.78);
        Assert.assertEquals("Values should be within", 12.34, result1, 0.001 );
    }

    @Test
    public void testGet() {
        config.get(Param.NumCallsPerSec, 1200);

        String ret = (String) config.get(Param.PatternINIFileName, "");
        Assert.assertEquals("PatternINI file not as expected", ret, "");
    }

    @Test
    public void testNumEnodeB() {
        config.get(Param.NumChannels, 1);
    }

    @Test
    public void testgetRoamingPlmn() {
        int ret = config.getRoamingPlmn();
        Assert.assertEquals("Unexpected Raoming PLMN returned", 35302, ret);
    }

    @Test
    public void testSetAndGetInt() {
        // this test confirms that the topology has been read
        int result1 = (int) config.get(Param.NumChannels, 1);
        config.setParam(Param.NumChannels, result1 + 1);
        int result2 = (int) config.get(Param.NumChannels, 1);
        Assert.assertEquals("Get should match set", result1+1, result2);
    }

    @Test
    public void testResourcePool() {
        // this test will get a value for each parameter it can.
        List<Param> params = new ArrayList<Param>();
        // test will fail
        ResourcePool rp = new ResourcePool(config);
        for (Param p: Param.values()) {
        	params.add(p);
        }
        ParamMap pl = rp.get(params, 2);
        for (Param p: Param.values()) {
        	pl.get(p);  // test that what ever value could be got.
        }
    }
    @Test
    public void testTraceUeTraceIdDisabled() { 
    	config.setParam(Param.TraceUeTraceId, 0);
    	
        ResourcePool rp = new ResourcePool(config);
        List<Param> params = new ArrayList<Param>();
        params.add(Param.ue_trace_id);
        
        ParamMap p1 = rp.get(params, 1);
        ParamMap p2 = rp.get(params, 2);
        
        long p1Val = Utils.bytesToLong((byte[])p1.get(Param.ue_trace_id));
        long p2Val = Utils.bytesToLong((byte[])p2.get(Param.ue_trace_id));
    	
        Assert.assertNotEquals("With random ue_trace_id generation, two back to back calls should return random values.", p1Val+1, p2Val);
    }
    
    @Test
    public void testTraceUeTraceIdEnabled() { 
    	config.setParam(Param.TraceUeTraceId, 10000);
    	
        ResourcePool rp = new ResourcePool(config);
        List<Param> params = new ArrayList<Param>();
        params.add(Param.ue_trace_id);
        
        ParamMap p1 = rp.get(params, 1);
        ParamMap p2 = rp.get(params, 2);
        
        long p1Val = Utils.bytesToLong((byte[])p1.get(Param.ue_trace_id));
        long p2Val = Utils.bytesToLong((byte[])p2.get(Param.ue_trace_id));
    	
        Assert.assertEquals("With trace for ue_trace_id enabled, two back to back calls should sequential values.", 10000, p1Val);
        Assert.assertEquals("With trace for ue_trace_id enabled, two back to back calls should sequential values.", 10001, p2Val);
    }
 }
