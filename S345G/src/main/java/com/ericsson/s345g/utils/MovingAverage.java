/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 - This method
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.utils;

public class MovingAverage {

    private final int[] window;
    private float sum = 0f;
    private int fill;
    private int position;
    private int last;


    public MovingAverage(int size) {
        this.window=new int[size];
    }

    public void add(int number) {

        if(fill==window.length){
            sum-=window[position];
        }else{
            fill++;
        }

        sum+=number;
        window[position++]=number;

        if(position == window.length){
            position=0;
        }
        last = number;
    }

    public float getAverage() {
        return sum / fill;
    }

    public int getLast() {
        return last;
    }
}