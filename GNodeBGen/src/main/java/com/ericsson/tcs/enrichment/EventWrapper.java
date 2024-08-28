package com.ericsson.tcs.enrichment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xjaimah
 *
 */
public class EventWrapper {

    /**
     * 
     */
    public long eventName;
    
    /**
     * 
     */
    public Map<String, Object> eventSpecificProperties;

    /**
     * @return
     */
    public Map<String, Object> getEventSpecificProperties() {
        if(null == eventSpecificProperties){
            eventSpecificProperties = new HashMap<String, Object>();
        }
        return eventSpecificProperties;
    }

    /**
     * @param eventSpecificProperties
     */
    public void setEventSpecificProperties(Map<String, Object> eventSpecificProperties) {
        this.eventSpecificProperties = eventSpecificProperties;
    }
    
    /**
     * @return
     */
    public long getEventName() {
        return eventName;
    }

    /**
     * @param eventName
     */
    public void setEventName(long eventName) {
        this.eventName = eventName;
    }

    
}
