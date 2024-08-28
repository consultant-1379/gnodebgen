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

import static org.junit.Assert.assertEquals;

import com.ericsson.s345g.utils.MovingAverage;
import org.junit.Test;

public class MovingAverageTest {

    @Test
    public void hundredValuesWindow10() {

        MovingAverage ma = new MovingAverage(10);  // moving average tracking last ten values
        for (int i = 0; i < 100 ; i ++) {
            ma.add(i);
        }
        // last ten values are 90->99 => avg should be 94.5
        assertEquals(94.5, ma.getAverage(), 0.1);
    }
    @Test
    public void hundredValuesWindow5() {

        MovingAverage ma = new MovingAverage(5);  // moving average tracking last ten values
        for (int i = 0; i < 100 ; i ++) {
            ma.add(i);
        }
        // last five values are 95->99 => avg should be 97.0
        assertEquals(97.0, ma.getAverage(), 0.1);
    }
}

