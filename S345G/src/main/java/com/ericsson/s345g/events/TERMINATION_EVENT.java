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
package com.ericsson.s345g.events;

import java.util.ArrayList;
import java.util.List;

import com.ericsson.s345g.configure.*;

/**
 * Last event in every pattern
 * Used to release any resources used by the pattern.
 */
public class TERMINATION_EVENT extends Event {
    // fixed template for this message type

    public TERMINATION_EVENT() {
        eventLen = 0;
        eventId = 9999;
        internal = true;
    }

    /*
     * Specifiy the parameters this event requires
     */
    @Override
    public List<Param> getParamsInEvent() {
        return new ArrayList<Param>(); // return an empty list
    }

    @Override
    public void setTime(byte[] timeBuf) {
        return;
    }

    @Override
    public Event makeEvent(ParamMap paramMap) {
        return this;
    }
}
