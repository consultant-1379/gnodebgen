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
package com.ericsson.s345g.utils;

public class Range {
    private long min;
    private long max;
    private int len;

    /**
     * A random number generator that returns a byte array of numBytes bytes x such that <br>minValue <= x < maxValue
     * @param minValue
     * @param maxValue
     * @param numBytes length of returned byte array
     */
    public Range(long minValue, long maxValue, int numBytes) {
        min = minValue;
        max = maxValue;
        len = numBytes;
    }

    public int getVal() {
        return (int)min + (int)((max-min) * Math.random());
    }

    public byte [] getByte() {
        long val = min + (long)((max-min) * Math.random());
        byte [] result = new byte [len];
        System.arraycopy(Utils.longToBytes(val), (8 - len), result, 0, len);
        //System.out.println("Range.getByte got "+val+" from min "+min+" max "+max+" result "+Utils.toHex(result));
        return result;
    }

    @Override
    public String toString() {
        return "Range("+min+","+max+"), len "+len;
    }
}
