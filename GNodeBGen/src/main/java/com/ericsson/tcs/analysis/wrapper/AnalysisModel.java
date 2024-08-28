package com.ericsson.tcs.analysis.wrapper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author xjaimah
 */
public class AnalysisModel {

	/**
	 * The rop_time
	 */
	// New code starts here
	private Set<String> rop_time;
	private String fdn_name;
	// New code ends here

	/**
	 * The node_name
	 */
	private Object node_id;

	/**
	 * The eventWiseCount
	 */
	private Map<Long, Integer> eventWiseCount;

	/**
	 * The eventIdToNameMap
	 */
	private Map<Long, String> eventIdToNameMap;

	/**
	 * The eventIdToNfMap
	 */
	private Map<Long, String> eventIdToNfMap;

	/**
	 * The {Event Id : [MIN, MAX, TOTAL]} Map
	 */

	private Map<Long, long[]> eventIdToSizesMap;

	/**
	 * The totalEvents
	 */
	private int totalEvents;

	/**
	 * The nci_values
	 */
	private Set<Object> nci_values;

	/**
	 * The maxEventSizeId
	 */
	private long maxEventSizeId;

	/**
	 * The totalEventSize
	 */
	private long totalEventSize;

	/**
	 * The maxEventSize
	 */
	private long maxEventSize;

	/**
	 * @return {Event Id : [MIN, MAX, TOTAL]} Map
	 */
	public Map<Long, long[]> getEventIdToSizesMap() {
		if (null == eventIdToSizesMap) {
			eventIdToSizesMap = new HashMap<>();
		}
		return eventIdToSizesMap;
	}

	public Set<String> getRop_time() {
		if (null == rop_time) {
			rop_time = new HashSet<String>();
		}
		return rop_time;
	}

	/**
	 * @return node_id
	 */
	public Object getNodeId() {
		return node_id;
	}

	/**
	 * @param nodeId node Id
	 */
	public void setNodeId(Object nodeId) {
		this.node_id = nodeId;
	}

	/**
	 * @return eventWiseCount
	 */
	public Map<Long, Integer> getEventWiseCount() {
		if (null == eventWiseCount) {
			eventWiseCount = new HashMap<Long, Integer>();
		}
		return eventWiseCount;
	}

	/**
	 * @param eventWiseCount event id to event count Map
	 */
	public void setEventWiseCount(Map<Long, Integer> eventWiseCount) {
		this.eventWiseCount = eventWiseCount;
	}

	/**
	 * @return eventIdToNameMap event id to event name Map
	 */
	public Map<Long, String> getEventIdToNameMap() {
		if (null == eventIdToNameMap) {
			eventIdToNameMap = new HashMap<Long, String>();
		}
		return eventIdToNameMap;
	}

	/**
	 * @param eventIdToNameMap e
	 */
	public void setEventIdToNameMap(Map<Long, String> eventIdToNameMap) {
		this.eventIdToNameMap = eventIdToNameMap;
	}

	/**
	 * @return total Event count
	 */
	public int getTotalEvents() {
		return totalEvents;
	}

	/**
	 * @param totalEvents Total events
	 */
	public void setTotalEvents(int totalEvents) {
		this.totalEvents = totalEvents;
	}

	/**
	 * @return the nci_values
	 */
	public Set<Object> getNci_values() {
		if (null == nci_values) {
			nci_values = new HashSet<>();
		}
		return nci_values;
	}

	/**
	 * @param nci_values the nci_values to set
	 */
	public void setNci_values(Set<Object> nci_values) {
		this.nci_values = nci_values;
	}

	/**
	 * @return the maxEventSizeId
	 */
	public long getMaxEventSizeId() {
		return maxEventSizeId;
	}

	/**
	 * @param maxEventSizeId the maxEventSizeId to set
	 */
	public void setMaxEventSizeId(long maxEventSizeId) {
		this.maxEventSizeId = maxEventSizeId;
	}

	/**
	 * @return the totalEventSize
	 */
	public long getTotalEventSize() {
		return totalEventSize;
	}

	/**
	 * @param totalEventSize the totalEventSize to set
	 */
	public void setTotalEventSize(long totalEventSize) {
		this.totalEventSize = totalEventSize;
	}

	/**
	 * @return the maxEventSize
	 */
	public long getMaxEventSize() {
		return maxEventSize;
	}

	/**
	 * @param maxEventSize the maxEventSize to set
	 */
	public void setMaxEventSize(long maxEventSize) {
		this.maxEventSize = maxEventSize;
	}

	public Map<Long, String> getEventIdToNfMap() {
		if (null == eventIdToNfMap) {
			eventIdToNfMap = new HashMap<Long, String>();
		}
		return eventIdToNfMap;
	}

	public void setEventIdToNfMap(Map<Long, String> eventIdToNfMap) {
		this.eventIdToNfMap = eventIdToNfMap;
	}

	// New code starts here
	public String getFdn_name() {
		return fdn_name;
	}

	public void setFdn_name(String fdn_name) {
		this.fdn_name = fdn_name;
	}
	// New code ends here

}