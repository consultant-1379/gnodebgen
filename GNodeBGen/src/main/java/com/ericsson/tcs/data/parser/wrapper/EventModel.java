package com.ericsson.tcs.data.parser.wrapper;

import java.util.ArrayList;
import java.util.List;

public class EventModel {

	private List<Object> nci;

	public void setNci(Object nciValue) {
		if (null == this.nci) {
			this.nci = new ArrayList<>();
		}
		if (!this.nci.contains(nciValue)) {
			this.nci.add(nciValue);
		}
	}
}

