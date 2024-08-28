package com.ericsson.tcs.topology.wrapper;

import com.ericsson.tcs.constant.Utils;

public class CellRelationWrapper {

    private Long target_nci;
    private byte[] plmnByteArr;

    public CellRelationWrapper(Long target_nci, String plmnHexStr) {
        // TODO Auto-generated constructor stub
        this.target_nci = target_nci;
        this.plmnByteArr = Utils.hexStringToByteArray(plmnHexStr);
    }

    public Long getTarget_nci() {
        return target_nci;
    }

    public byte[] getPlmnByteArr() {
        return plmnByteArr;
    }

}
