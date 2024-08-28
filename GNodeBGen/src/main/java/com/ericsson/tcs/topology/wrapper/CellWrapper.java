package com.ericsson.tcs.topology.wrapper;

import com.google.gson.annotations.SerializedName;

public class CellWrapper {

	@SerializedName("_CellWrapper__cellLocalId")
	private String __cellLocalId;
	
	@SerializedName("_CellWrapper__nCI")
	private String __nCI;

	/**
	 * @return the __cellLocalId
	 */
	public String get__cellLocalId() {
		return __cellLocalId;
	}

	/**
	 * @param __cellLocalId
	 *            the __cellLocalId to set
	 */
	public void set__cellLocalId(String __cellLocalId) {
		this.__cellLocalId = __cellLocalId;
	}

	/**
	 * @return the __nCI
	 */
	public String get__nCI() {
		return __nCI;
	}

	/**
	 * @param __nCI
	 *            the __nCI to set
	 */
	public void set__nCI(String __nCI) {
		this.__nCI = __nCI;
	}

}
