package com.ericsson.tcs.session.wrapper;

/**
 * @author xjaimah
 *
 */
public class PmEventSession implements Comparable<Object>{

    /**
     * The Session id
     */
    private String sessionId;
    
    /**
     * The eventID
     */
    private long eventID;
    
    /**
     * The pduCounts
     */
    private int pduCounts;
    
    /**
     * The timeStamp
     */
    private long timeStamp;
    
    /**
     * The UE_TRACE
     */
    private String ue_trace_id;
    
    /**
     * The eventData
     */
    private byte[] eventData;
    
    /**
     * The gnbID
     */
    private Object gnbID;
    
    /**
     * The networkFunction
     */
    private String networkFunction;

    /**
     * @return the eventID
     */
    public long getEventID() {
        return eventID;
    }

    /**
     * @param eventID the eventID to set
     */
    public void setEventID(long eventID) {
        this.eventID = eventID;
    }

    /**
     * @return the pduCounts
     */
    public int getPduCounts() {
        return pduCounts;
    }

    /**
     * @param pduCounts the pduCounts to set
     */
    public void setPduCounts(int pduCounts) {
        this.pduCounts = pduCounts;
    }

    /**
     * @return the timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    @Override
    public int compareTo(Object o) {
        PmEventSession obj = (PmEventSession) o;
        if(this.getTimeStamp() < obj.getTimeStamp()){
            return -1;
        } else if(this.getTimeStamp() > obj.getTimeStamp()){
            return 1;
        }
        return 0;
    }

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return the ue_trace_id
     */
    public String getUe_trace_id() {
        return ue_trace_id;
    }

    /**
     * @param ue_trace_id the ue_trace_id to set
     */
    public void setUe_trace_id(String ue_trace_id) {
        this.ue_trace_id = ue_trace_id;
    }

    /**
     * @return the eventData
     */
    public byte[] getEventData() {
        return eventData;
    }

    /**
     * @param eventData the eventData to set
     */
    public void setEventData(byte[] eventData) {
        this.eventData = eventData;
    }

    /**
     * @return the gnbID
     */
    public Object getGnbID() {
        return gnbID;
    }

    /**
     * @param gnbID the gnbID to set
     */
    public void setGnbID(Object gnbID) {
        this.gnbID = gnbID;
    }

    /**
     * @return the networkFunction
     */
    public String getNetworkFunction() {
        return networkFunction;
    }

    /**
     * @param networkFunction the networkFunction to set
     */
    public void setNetworkFunction(String networkFunction) {
        this.networkFunction = networkFunction;
    }
    
}
