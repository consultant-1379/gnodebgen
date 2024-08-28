package com.ericsson.s345g.topology.wrapper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.s345g.constant.ConstantParam;

/**
 * @author xjaimah
 *
 */
public class NetworkFunctionAttribute implements ConstantParam {

    /**
     * The gnbFuncMap
     */
    @SuppressWarnings("serial")
    public Map<String, String[]> gnbFuncMap = new HashMap<String, String[]>() {
        {
            put(GNBDUFunction, new String[] { "" });
            put(GNBCUCPFunction, new String[] { "" });
            put(GNBCUUPFunction, new String[] { local_end_point, remote_end_point, gnb_cuup_function_id ,linkType});
        }
    };
    
    private Map<String,List<String>> localMap = new HashMap<String,List<String>>() {
        {
            put(eP_NgUId, new ArrayList<String>());
            put(s1ULinkId, new ArrayList<String>());
            put(rpUserPlaneLinkId, new ArrayList<String>());
            put(ppControlLinkId, new ArrayList<String>());
        }
    };
    private Map<String,List<String>> RemoteMap = new HashMap<String,List<String>>(){
        {
        put(eP_NgUId, new ArrayList<String>());
        put(s1ULinkId, new ArrayList<String>());
        put(rpUserPlaneLinkId, new ArrayList<String>());
        put(ppControlLinkId, new ArrayList<String>());
        }
    };

    private Map<Long,Map<Integer,List<RelationAttribute>>> srcToTargetMap;


    /**
     * The gnbFunctionID
     */
    private String gnbFunctionID;
    

    /**
     * @return the localEndPoint
     */
    
    public Map<String, List<String>> getLocalMap() {
        return localMap;
    }
   

    /**
     * @return the remoteEndPoint
     */
    
    public Map<String, List<String>> getRemoteMap() {
        return RemoteMap;
    }

    /**
     * @return the gnbFunctionID
     */
    public String getGnbFunctionID() {
        return gnbFunctionID;
    }

    /**
     * @param gnbFunctionID
     *            the gnbFunctionID to set
     */
    public void setGnbFunctionID(String gnbFunctionID) {
        this.gnbFunctionID = gnbFunctionID;
    }
    
    /**
     * @return the srcToTargetMap
     */
    public Map<Long, Map<Integer, List<RelationAttribute>>> getSrcToTargetMap() {
        if(srcToTargetMap == null){
            srcToTargetMap = new HashMap<>();
        }
        return srcToTargetMap;
    }

    /**
     * @param srcToTargetMap the srcToTargetMap to set
     */
    public void setSrcToTargetMap(
            Map<Long, Map<Integer, List<RelationAttribute>>> srcToTargetMap) {
        this.srcToTargetMap = srcToTargetMap;
    }
}
