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

import java.util.*;

/*
 * Handle a list of events
 */
public class EventList implements Iterable<Event> {

    List<Event> eventList;
    int terminationEventCnt = 0;

    public EventList() {
        eventList = new ArrayList<Event>();
    }

    public void add(Event evt) {
        eventList.add(evt);
    }

    public void addAll(EventList evtL) {
        for ( Event evt: evtL) {
            eventList.add(evt);
        }
    }

    public int len() {
        return eventList.size() - terminationEventCnt;
    }

    public void incTerminationEventCnt() {
    	terminationEventCnt++;
    }

    @Override
    public Iterator<Event> iterator() {
        Iterator<Event> iprof = eventList.iterator();
        return iprof;
    }
}
