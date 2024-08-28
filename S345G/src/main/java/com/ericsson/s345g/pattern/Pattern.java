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
package com.ericsson.s345g.pattern;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.*;
import com.ericsson.s345g.events.*;
import com.ericsson.s345g.resourcePool.ResourcePool;

/**
 * A pattern describes the events that go to make up a call.
 */
public class Pattern {

    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private String patternName = "Unknown";       // name of this pattern
    private List<Param> paramList = null;         // the parameters it uses
    private int freq;                             // how frequently is it used

    /*
     * These are the raw event templates used by this pattern.
     * Do not confuse it with eventsList which are the events to be sent!
     */
    private List<Event> eventsUsed = new ArrayList<>();

    protected Pattern() {
    }

    /**
     * Is this a valid pattern?
     *
     * Return true if it has events associated with it
     */
    protected boolean isValid() {
        return !eventsUsed.isEmpty();
    }

    /**
     * make a call using this pattern and return the events.
     */
    public EventList makeCall(ResourcePool resourcePool, long callId) {
        ParamMap params = resourcePool.get(this.getParamsNeeded(), callId) ;
        // duration is in seconds, offset is in ms. remember to convert
        int duration = (Integer) params.get(Param.Duration);
        duration *= 1000;
        EventList eventList = new EventList();
        int period;
        int delay = 0;

        // handle all messages up to first periodic
        int i = 0; // pointer to current event
        for ( ; i < eventsUsed.size(); i++) {
            Event e = eventsUsed.get(i).mkCopy(); // make an event from this template
            if (e.getPeriod() > 0) {
                break;
            }
            e.makeEvent(params);
            delay += e.getOffset();
            e.setDelay(delay);
            eventList.add(e);
        }

        // handle periodic events
        // Don't restart loop, continue from next entry
        for (; i < eventsUsed.size(); i++) {
            Event e = eventsUsed.get(i).mkCopy();
            period = e.getPeriod() * 1000; // period is in seconds - convert to ms
            if (period < 1) { // finished with periodics
                delay = duration ;
                break;
            }

            e.makeEvent(params);
            int newoffset = e.getOffset();
            for (int d = delay + newoffset; d < duration; d += period) {
                Event e1 = eventsUsed.get(i).mkCopy();
                e1.setFrom(e);
                e1.setDelay(d);
                eventList.add(e1);
            }
        }

        // handle remaining messages
        for (; i < eventsUsed.size(); i++) {
            Event e = eventsUsed.get(i).mkCopy();
            e.makeEvent(params);
            delay += e.getOffset();
            e.setDelay(delay);
            eventList.add(e);
        }

        // Put a termination event on the end to ensure everything gets cleaned up
        Event evt = new TERMINATION_EVENT().makeEvent(params);
        evt.setDelay(delay + 100);
        eventList.add(evt);
        eventList.incTerminationEventCnt(); //Maintain the TERMINATION Event Count to get count for real events generated

        return eventList;
    }

    protected List<Event> getEventsUsed() {
        return eventsUsed;
    }

    protected void setEventsUsed(final List<Event> eventsUsed) {
        this.eventsUsed = eventsUsed;
    }

    /**
     * get the list of parameters for which values will be required
     */
    public List<Param> getParamsNeeded() {
        if (paramList == null) {
            paramList = new ArrayList<>();
            for (Event evt : eventsUsed) {
                paramList.addAll(evt.getParamsInEvent());
            }
            // any parameters the call it self needs
            paramList.add(Param.Duration);
        }
        return paramList;
    }

    /**
     * @return the patternName
     */
    public String getName() {
        return patternName;
    }

    /**
     * @param patternName
     *        the patternName to set
     */
    public void setName(String patternName) {
        this.patternName = patternName;
    }

    /**
     * How frequently is this pattern used
     */
    public int getFreq() {
        return freq;
    }

    /**
     * Set how frequently is this pattern should be used
     */
    public void setFreq(int freq) {
        this.freq = freq;
    }
}
