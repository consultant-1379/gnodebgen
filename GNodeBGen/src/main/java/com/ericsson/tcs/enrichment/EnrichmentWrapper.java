package com.ericsson.tcs.enrichment;

import java.util.HashMap;
import java.util.Map;


/**
 * @author xjaimah
 *
 */
public class EnrichmentWrapper {

    /**
     * 
     */
    public Map<String, Object> defaultMap;
    
    /**
     * 
     */
    public Map<Long, EventWrapper> eventSpecificEnrichMent;
    
    /**
     * 
     */
    private Map<String, NetworkFunction> nf;

    /**
     * @return
     */
    public Map<String, Object> getDefaultMap() {
        if(null == defaultMap){
            defaultMap = new HashMap<>();
        }
        return defaultMap;
    }

    /**
     * @param defaultMap
     */
    public void setDefaultMap(Map<String, Object> defaultMap) {
        this.defaultMap = defaultMap;
    }

    /**
     * @return
     */
    public Map<Long, EventWrapper> getEventSpecificEnrichMent() {
        if(null == eventSpecificEnrichMent){
            eventSpecificEnrichMent = new HashMap<>();
        }
        return eventSpecificEnrichMent;
    }

    /**
     * @param eventSpecificEnrichMent
     */
    public void setEventSpecificEnrichMent(Map<Long, EventWrapper> eventSpecificEnrichMent) {
        this.eventSpecificEnrichMent = eventSpecificEnrichMent;
    }

    /**
     * @return the nf
     */
    public Map<String, NetworkFunction> getNf() {
        if (null == nf){
            nf = new HashMap<>();
        }
        return nf;
    }

    /**
     * @param nf the nf to set
     */
    public void setNf(Map<String, NetworkFunction> nf) {
        this.nf = nf;
    }
    
    
    
}
