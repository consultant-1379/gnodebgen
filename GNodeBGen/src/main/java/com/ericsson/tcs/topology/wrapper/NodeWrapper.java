package com.ericsson.tcs.topology.wrapper;

import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class NodeWrapper {

	@SerializedName("_NodeWrapper__managedElement")
	private String __managedElement;

	@SerializedName("_NodeWrapper__networkFnDetailsMap")
	private Map<String, NetworkFunctionWrapper> __networkFnDetailsMap;

	/**
	 * @return the __managedElement
	 */
	public String get__managedElement() {
		return __managedElement;
	}

	/**
	 * @param __managedElement
	 *            the __managedElement to set
	 */
	public void set__managedElement(String __managedElement) {
		this.__managedElement = __managedElement;
	}

	/**
	 * @return the __networkFnDetailsMap
	 */
	public Map<String, NetworkFunctionWrapper> get__networkFnDetailsMap() {
		return __networkFnDetailsMap;
	}

	/**
	 * @param __networkFnDetailsMap
	 *            the __networkFnDetailsMap to set
	 */
	public void set__networkFnDetailsMap(Map<String, NetworkFunctionWrapper> __networkFnDetailsMap) {
		this.__networkFnDetailsMap = __networkFnDetailsMap;
	}

}
