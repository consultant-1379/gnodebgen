package com.ericsson.tcs.utility.event.alteration;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class EventConditionMap {

	private List<Map<Object, Object>> conditions;

	public List<Map<Object, Object>> getConditions() {
		if (null == conditions) {
			conditions = new ArrayList<Map<Object, Object>>();
		}
		return conditions;
	}

}
