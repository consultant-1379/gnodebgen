/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.configure;

import java.util.*;

import com.ericsson.s345g.utils.Utils;

public class ParamMap {
    private final Map<Param, Object> paramMap;

    public ParamMap() {
        this.paramMap = new HashMap<>();
    }

    public Object get(Param key) {
        return paramMap.get(key);
    }

    public String toString(Param key) {
        Object obj = paramMap.get(key);
        String str = "";
        if (obj != null && obj.getClass().isArray()) { // dealing with an array
            if (obj instanceof int[]) {
                str = Arrays.toString((int[]) obj);
            } else if (obj instanceof byte[]) {
                str = Utils.toHex((byte[]) obj);
            }
        } else {
            str = obj.toString();
        }

        return str;
    }

    public void put(Param key, Object val) {
        // could add default and missing value handling here
        paramMap.put(key, val);
    }

    public Set<Param> getKeys() {
        // could add default and missing value handling here
        return paramMap.keySet();
    }

}
