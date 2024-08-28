package com.ericsson.s345g;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.topology.Topology;

public class TestTopology {

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
    public void getNumCells() {
        int numCells = (int) config.get(Param.NumCells, 0);
        int verify = config.getNumCells();
        assertEquals("Cell count doesn't match", numCells, verify);
    }

    @Test
    public void getBaseTopology() {
        Topology topology = new Topology(config);
        assertNotNull("Failed to get Topology object", topology);

        int numCells = (int) config.get(Param.NumCells, 0);
        int verify = topology.getNumCells();
        assertEquals("Cell count doesn't match", numCells, verify);

        assertTrue("Cell count must be greater then zero", numCells > 0);
        int nextCell = topology.getRandomNetworkCellId();
    }

    @Test
    public void getConfigTopology() {

        int numCells = (int) config.get(Param.NumCells, 0);
        int verify = config.getNumCells();
        Topology topology = config.getTopology();
        assertEquals("Cell count doesn't match", numCells, verify);

        assertTrue("Cell count must be greater then zero", numCells > 0);
        int nextCell = topology.getRandomNetworkCellId();
    }

}
