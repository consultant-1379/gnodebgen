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
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.etcm.model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


/**
 * @author xjaimah
 *
 */
public class EventToCounterModel implements Cloneable{

	/**
	 * It will hold all the version defined inside etcm.
	 */
	private String version;
	
	/**
	 * The eventToFieldMap
	 */
	private Map<String, Set<String>> eventToFieldMap;

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the eventToFieldMap
	 */
	public Map<String, Set<String>> getEventToFieldMap() {
		if(null == eventToFieldMap) {
			eventToFieldMap = new LinkedHashMap<String, Set<String>>();
		}
		return eventToFieldMap;
	}

	/**
	 * @param eventToFieldMap the eventToFieldMap to set
	 */
	public void setEventToFieldMap(Map<String, Set<String>> eventToFieldMap) {
		this.eventToFieldMap = eventToFieldMap;
	}
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
}
