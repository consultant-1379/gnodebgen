package com.ericsson.tcs.session.wrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xjaimah
 *
 */
public class SessionPerCall {

    /**
     * The isSessionClose
     */
    private boolean isSessionClose;
    
    /**
     * The lastEventId
     */
    private long lastEventId;
    
    /**
     * The lastEventTimeStamp
     */
    private long lastEventTimeStamp;
    
    /**
     * The sessionEvents
     */
    private List<PmEventSession> sessionEvents;

    /**
     * @return the isSessionClose
     */
    public boolean isSessionClose() {
        return isSessionClose;
    }

    /**
     * @param isSessionClose the isSessionClose to set
     */
    public void setSessionClose(boolean isSessionClose) {
        this.isSessionClose = isSessionClose;
    }

    /**
     * @return the lastEventId
     */
    public long getLastEventId() {
        return lastEventId;
    }

    /**
     * @param lastEventId the lastEventId to set
     */
    public void setLastEventId(long lastEventId) {
        this.lastEventId = lastEventId;
    }

    /**
     * @return the lastEventTimeStamp
     */
    public long getLastEventTimeStamp() {
        return lastEventTimeStamp;
    }

    /**
     * @param lastEventTimeStamp the lastEventTimeStamp to set
     */
    public void setLastEventTimeStamp(long lastEventTimeStamp) {
        this.lastEventTimeStamp = lastEventTimeStamp;
    }

    /**
     * @return the sessionEvents
     */
    public List<PmEventSession> getSessionEvents() {
        if(null == sessionEvents) {
            sessionEvents = new ArrayList<PmEventSession>();
        }
        return sessionEvents;
    }

    /**
     * @param sessionEvents the sessionEvents to set
     */
    public void setSessionEvents(List<PmEventSession> sessionEvents) {
        this.sessionEvents = sessionEvents;
    }
    
}
