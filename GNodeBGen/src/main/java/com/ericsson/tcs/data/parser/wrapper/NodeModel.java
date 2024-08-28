package com.ericsson.tcs.data.parser.wrapper;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NodeModel {

	private String nodeFdn;
	private Object gnbId;
	private int numberOfCells;
	private Set<Object> uniqueNciAcrossAllNf;
	private Map<String, EventModel> networkFunMap;

	public String getNodeFdn() {
		return nodeFdn;
	}

	public void setNodeFdn(String nodeFdn) {
		this.nodeFdn = nodeFdn;
	}

	public Object getGnbId() {
		return gnbId;
	}

	public void setGnbId(Object gnbId) {
		this.gnbId = gnbId;
	}

	public int getNumberOfCells() {
		return numberOfCells;
	}

	public void setNumberOfCells(int numberOfCells) {
		this.numberOfCells = numberOfCells;
	}

	public Map<String, EventModel> getNetworkFunMap() {
		if (null == networkFunMap) {
			networkFunMap = new HashMap<String, EventModel>();
		}
		return networkFunMap;
	}

	public void setNetworkFunMap(Map<String, EventModel> networkFunMap) {
		this.networkFunMap = networkFunMap;
	}

	public Set<Object> getUniqueNciAcrossAllNf() {
		if (null == uniqueNciAcrossAllNf) {
			uniqueNciAcrossAllNf = new HashSet<>();
		}
		return uniqueNciAcrossAllNf;
	}

	public void setUniqueNciAcrossAllNf(Set<Object> uniqueNciAcrossAllNf) {
		this.uniqueNciAcrossAllNf = uniqueNciAcrossAllNf;
	}

}

