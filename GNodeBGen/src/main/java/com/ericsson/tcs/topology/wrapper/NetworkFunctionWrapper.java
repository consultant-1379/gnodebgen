package com.ericsson.tcs.topology.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;

public class NetworkFunctionWrapper {

    @SerializedName("_NetworkFunctionWrapper__gNBId")
    private String __gNBId;

    @SerializedName("_NetworkFunctionWrapper__gNBIdLength")
    private String __gNBIdLength;

    @SerializedName("_NetworkFunctionWrapper__cellList")
    private List<CellWrapper> __cellList;

    @SerializedName("_NetworkFunctionWrapper__plmnIdList")
    private List<Map<String, String>> __plmnIdList;

    @SerializedName("_NetworkFunctionWrapper__gnbFunctionId")
    private String __gnbFunctionId;

    @SerializedName("_NetworkFunctionWrapper__localEndPointMap")
    private Map<String, List<String>> __localEndPointMap;

    @SerializedName("_NetworkFunctionWrapper__remoteEndPointMap")
    private Map<String, List<String>> __remoteEndPointMap;

    // { src_nci : { ho_type : [ value_1, value_2, .. ] } }
    @SerializedName("_NetworkFunctionWrapper__cellRelationMap")
    private Map<String, Map<String, List<String>>> __cellRelationMap;

    private Map<Long, Map<Integer, List<CellRelationWrapper>>> handOverCellRelationMap;

    public Map<Long, Map<Integer, List<CellRelationWrapper>>> getHandOverCellRelationMap() {
        if (null == this.handOverCellRelationMap && null != this.__cellRelationMap) {
            this.setHandOverCellRelationMap();
        }
        return handOverCellRelationMap;
    }

    public void setHandOverCellRelationMap() {
        this.handOverCellRelationMap = new HashMap<>();
        for (String srcNci : this.__cellRelationMap.keySet()) {
            Long tempNci = Long.parseLong(srcNci);
            this.handOverCellRelationMap.put(tempNci, new HashMap<>());
            for (String ho_type : this.__cellRelationMap.get(srcNci).keySet()) {
                int tempHoType = Integer.parseInt(ho_type);
                this.handOverCellRelationMap.get(tempNci).put(tempHoType, new ArrayList<CellRelationWrapper>());
                for (String combinedElement : this.__cellRelationMap.get(srcNci).get(ho_type)) {
                    String[] elements = combinedElement.split("\\|");
                    CellRelationWrapper crw = new CellRelationWrapper(Long.parseLong(elements[0]), elements[1]);
                    this.handOverCellRelationMap.get(tempNci).get(tempHoType).add(crw);
                }
            }
        }
    }

    public Map<String, List<String>> get__localEndPointMap() {
        return __localEndPointMap;
    }

    public void set__localEndPointMap(Map<String, List<String>> __localEndPointMap) {
        this.__localEndPointMap = __localEndPointMap;
    }

    public Map<String, List<String>> get__remoteEndPointMap() {
        return __remoteEndPointMap;
    }

    public void set__remoteEndPointMap(Map<String, List<String>> __remoteEndPointMap) {
        this.__remoteEndPointMap = __remoteEndPointMap;
    }

    public String get__gnbFunctionId() {
        return __gnbFunctionId;
    }

    public void set__gnbFunctionId(String __gnbFunctionId) {
        this.__gnbFunctionId = __gnbFunctionId;
    }

    /**
     * @return the __gNBId
     */
    public String get__gNBId() {
        return __gNBId;
    }

    /**
     * @param __gNBId the __gNBId to set
     */
    public void set__gNBId(String __gNBId) {
        this.__gNBId = __gNBId;
    }

    /**
     * @return the __gNBIdLength
     */
    public String get__gNBIdLength() {
        return __gNBIdLength;
    }

    /**
     * @param __gNBIdLength the __gNBIdLength to set
     */
    public void set__gNBIdLength(String __gNBIdLength) {
        this.__gNBIdLength = __gNBIdLength;
    }

    /**
     * @return the __cellList
     */
    public List<CellWrapper> get__cellList() {
        return __cellList;
    }

    /**
     * @param __cellList the __cellList to set
     */
    public void set__cellList(List<CellWrapper> __cellList) {
        this.__cellList = __cellList;
    }

    /**
     * @return the __plmnIdList
     */
    public List<Map<String, String>> get__plmnIdList() {
        return __plmnIdList;
    }

    /**
     * @param __plmnIdList the __plmnIdList to set
     */
    public void set__plmnIdList(List<Map<String, String>> __plmnIdList) {
        this.__plmnIdList = __plmnIdList;
    }

}
