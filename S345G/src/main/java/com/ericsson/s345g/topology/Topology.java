/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.topology;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.Config;
import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.constant.ConstantParam;
import com.ericsson.s345g.events.NetworkFunction;
import com.ericsson.s345g.topology.wrapper.NetworkFunctionAttribute;
import com.ericsson.s345g.topology.wrapper.RelationAttribute;
import com.ericsson.s345g.utils.Utils;

public class Topology implements ConstantParam {

    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);

    private Config config;
    private List<Integer> nciList; // list of all cellIds
    private Map<Integer, Integer> nci2gNodeBMap;
    private Map<String, String> gNBid2NameMap;
    private boolean havePLMNID;
    private int localPLMNid;
    private int numCells = 0;
    private byte[] plmnIdByte = new byte[3];
    private List<String> networkFunctionList = new ArrayList<>();
    private Random myRand = new Random();
    private int nextIndex = 0;
    private int gnbIdLength;
    private Map<Integer, Map<String, NetworkFunctionAttribute>> networkFunctionParameterMap;
    private Map<String, String> nodeNameToNodeIdMap = new HashMap<>();
    private static List<Integer> hoTypeEvents;

    /*
     * every cell has a uniquer nci mad up from the gnodeBId and the local cell
     * Id every node has one or more network functions (typically three). every
     * network function has its own channel to the destination. NF CUUP is
     * associated with the gnodeB NF DU and CUCP share the cells of the node.
     * every event comes from the channel associated with the cell eg. A DU
     * event from cell nci 16384 (gnodeb)
     */
    public Topology(Config configObj) {
        config = configObj;
        networkFunctionParameterMap = new HashMap<>();
        nci2gNodeBMap = new HashMap<>();
        gNBid2NameMap = new HashMap<>();
        nciList = new ArrayList<>();

        int numNodes = (int) config.get(Param.NumNodes, -1);
        if (!havePLMNID) {
            String mcc = (String) config.get(Param.TopologyPLMNmcc, S3Defaults.MCC);
            String mnc = (String) config.get(Param.TopologyPLMNmnc, S3Defaults.MNC);
            plmnIdByte = makePLMNId(mcc, mnc);
            LOGGER.debug("PLMNID mcc of {} and mnc of {} to produce plmnID of {}", mcc, mnc, plmnIdByte);
            havePLMNID = true;
        }

        gnbIdLength = (int) config.get(Param.gNodeBIdLen, S3Defaults.GNBIDLENGTH);
        if (numNodes > 0) { // generate nodes
            generateNodes();
        } else { // use the topology list file
            String useList = (String) config.get(Param.UseTopologyList, "NotSet");
            if (!"NotSet".equals(useList)) { // use the topology list file
                useTopologyList(useList);
            } else {
                String topologyDir = (String) config.get(Param.TopologyDir, "NotSet");
                readTopologyDir(topologyDir);
            }
        }
    }

    /**
     * get the number of cells
     */
    public int getNumCells() {
        return numCells;
    }

    /**
     * get a random valid gCellId for the specified Network Function every node
     * has three cells added, one for each NF
     */
    public int getRandomNetworkCellId() {
        int index = myRand.nextInt(numCells);
        return nciList.get(index);
    }

    /**
     * get a random valid gCellId for the specified Network Function every node
     * has three cells added, one for each NF
     */
    public int getNextNetworkCellId() {
        nextIndex = (nextIndex + 1) % numCells;
        return nciList.get(nextIndex);
    }

    public Integer getGnodeBId(int nci) {
        Integer x = nci2gNodeBMap.get(nci);
        if (null == x) {
            x = 0;
        }
        return x;
    }

    /**
     * @param nodeId
     * @return
     */
    public Map<String, NetworkFunctionAttribute> getNetworkFuncationAttribute(Integer nodeId) {
        if (null != networkFunctionParameterMap.get(nodeId)) {
            return networkFunctionParameterMap.get(nodeId);
        }
        return null;
    }

    /**
     * get the list of Network functions
     */
    public List<String> getNetworkFunctionList() {
        return networkFunctionList;
    }

    public String getNodeName(String gNodeBId) {
        if (gNBid2NameMap.containsKey(gNodeBId)) {
            return gNBid2NameMap.get(gNodeBId);
        } else {
            return "Unknown";
        }
    }

    public byte[] getPlmnId() {
        return plmnIdByte;
    }

    public int getPlmn() {
        return localPLMNid;
    }

    private void generateNodes() {
        int cellPerNode = (int) config.get(Param.CellsPerNode, S3Defaults.CELLSPERNODE);
        int numChannels = (int) config.get(Param.NumChannels, 1000);
        int firstNode = (int) config.get(Param.FirstChannel, 1);

        int nodeIndex = firstNode;
        String strtNode = null;
        String endNode = null;
        while (nodeIndex >= firstNode && nodeIndex < firstNode + numChannels) {
            String nodeName = String.format("Node_%05d", nodeIndex);
            addNode(nodeName, nodeIndex, null);
            for (int localCellId = 0; localCellId < cellPerNode; localCellId++) {
                addCell(nodeIndex, localCellId);
            }
            if (null == strtNode) {
                strtNode = nodeName;
            } else {
                endNode = nodeName;
            }
            nodeIndex++;
        }

        numCells = nciList.size();
        if (networkFunctionList.size() < numChannels) {
            LOGGER.warn("Number of channels reduced from {} to {} to match topology", numChannels,
                    networkFunctionList.size());
            config.setParam(Param.NumChannels, networkFunctionList.size());
        }
        LOGGER.debug("Generated nodes from {} to {} totaling {} network functions.", strtNode, endNode, numCells);

    }

    /**
     * Parse a CSV file with topology information in it.
     */
    private void useTopologyList(String topologyList) {
        int numChan = (int) config.get(Param.NumChannels, 1000);
        int firstChan = (int) config.get(Param.FirstChannel, 1);

        List<String> text = Utils.readFile(topologyList);
        // int nodeIndex = firstChan;
        int nodeIndex = 0;
        int cellsPerNode = (int) config.get(Param.CellsPerNode, S3Defaults.CELLSPERNODE);
        for (String line : text) {
            if (line.length() < 5 || line.indexOf(',') == 0) {
                continue;
            }
            /*
             * we expect name, gnodeBId, cell1Id [,cell2Id [...]] in which case
             * we will add an entry for each cell mentioned - or - name,
             * gnodeBId in which case we will add CellsPerNode entries starting
             * from 0
             */
            String[] fields = line.split(",");
            if (nodeIndex >= firstChan && nodeIndex < firstChan + numChan) {
                String nodeName = fields[0].trim();
                int nodeId = Utils.safeParseInt(fields[1].trim());
                addNode(nodeName, nodeId, null);
                if (fields.length == 2) {
                    for (int localCellId = 1; localCellId <= cellsPerNode; localCellId++) {
                        addCell(nodeId, localCellId);
                    }
                } else {
                    for (int fld = 2; fld < fields.length; fld++) {
                        addCell(nodeId, Utils.safeParseInt(fields[fld].trim()));
                    }
                }
            }
            nodeIndex++;
        }

        numCells = nciList.size();
        if (networkFunctionList.size() < numChan) {
            LOGGER.warn("Number of channels reduced from {} to {} to match topology", numChan,
                    networkFunctionList.size());
            config.setParam(Param.NumChannels, networkFunctionList.size());
        }
        LOGGER.info("Topology loaded from list file {} : number of nodes {}, number of cells {}, total channels {} .",
                topologyList, (networkFunctionList.size() / 3), nciList.size(), networkFunctionList.size());
    }

    /* read the files in the topology directory */
    private void readTopologyDir(String topologyDir) {
        // Total number of nodes and starting node information
        int numChannels = (int) config.get(Param.NumChannels, 1000);
        int startChan = (int) config.get(Param.FirstChannel, 1);

        int gnodeBIndex = 1;
        boolean isfirstTopology = true;
        int gNBCount = 0;

        // get the files names present in the topology directory
        File[] files = new File(topologyDir).listFiles();
        Arrays.sort(files); // put the files into alphabetical order
        hoTypeEvents = new ArrayList<>();
        String events = ((String) config.get(Param.HandOverTypeEvents, "NotSet"));
        if(!events.equals("NotSet")){
            for(String event : events.split(",")){
                try{
                    hoTypeEvents.add(Integer.parseInt(event.trim()));
                }catch(Exception e){
                    LOGGER.error("Please provide proper handover events Id's in S3.ini file.");
                }
            }
        }
        for (File file : files) {
            if (file.isFile() && !file.isDirectory()) {
                String fname = file.getName();
                if (fname.toLowerCase().contains("networkelement") && fname.toLowerCase().endsWith(".json")) {
                    if (gnodeBIndex >= startChan && gnodeBIndex < (startChan + numChannels)) {
                        parseJsonTopologyFile(file, isfirstTopology);
                        isfirstTopology = false;
                        gNBCount++;
                    }
                    gnodeBIndex++;
                }
            }
        }

        // resetting total number of nodes if required
        numCells = nciList.size();
        if (gNBCount < numChannels) {
            LOGGER.warn("Number of channels reduced from {} to {} to match topology", numChannels, gNBCount);
            config.setParam(Param.NumChannels, gNBCount);
        }

        LOGGER.info("Topology loaded from directory {}: {} GNodeBs and {} cells.", topologyDir, gNBCount,
                nciList.size());
    }

    private void parseJsonTopologyFile(File file, boolean isFirst) {

        String nodeName = null;
        int nodeId = -1;
        int nodeIdLen = -1;
        String mo = null;

        Set<Integer> cellLocalIdSet = new HashSet<>();
        @SuppressWarnings("serial")
        Map<String, String> gnbFuncMap = new HashMap<String, String>() {
            {
                put(GNBDUFunction, gNBDUFunctionId);
                put(GNBCUCPFunction, gNBCUCPFunctionId);
                put(GNBCUUPFunction, gNBCUUPFunctionId);
            }
        };
        Set<Long> cellNCISet = new HashSet<>();
        String filename = file.getName();
        Map<String, NetworkFunctionAttribute> attribute = new HashMap<String, NetworkFunctionAttribute>();
        Map<Long,List<RelationAttribute>> srcToTargetMap = new HashMap<>();
        try {
            // Creating file input stream object
            InputStream jsonInputStream = new FileInputStream(file);

            // Forming JSON object
            JSONTokener tokener = new JSONTokener(jsonInputStream);
            JSONObject object = new JSONObject(tokener);

            // Fetching node name
            nodeName = object.getString("networkElement").split("=")[1];

            // Fetching entire Measurement Object (MO) information from entire
            // JSON
            JSONObject moObj = object.getJSONObject("moMap");
            // Iterating on GNB(X)Function in order to fetch information related
            // to network function
            // X = CUUP, CUCP, DU
            for (String gnbFunction : gnbFuncMap.keySet()) {
                attribute.put(gnbFunction, new NetworkFunctionAttribute());
                // Fetching network function details in each iteration
                JSONArray functionInfoList = moObj.getJSONArray(gnbFunction);

                // Iterating on specific Network function elements
                for (int i = 0; i < functionInfoList.length(); i++) {

                    // Creating JSON object for each Network function element
                    JSONObject functionInfo = functionInfoList.getJSONObject(i);
                    String moClass = "";
                    if (functionInfo.has("moClass")) {
                        moClass = functionInfo.getString("moClass");
                    }
                    //fetch MOFDN if present in JSON object
                    String moFdn = "";
                    if (functionInfo.has("moFdn")) {
                        moFdn = functionInfo.getString("moFdn");
                    }
                    // Searching for "attributeMap" key in JSON Object
                    if (functionInfo.has("attributeMap")) {

                        // Creating JSON Object of "attributeMap" key's value
                        JSONObject attrObj = functionInfo.getJSONObject("attributeMap");

                        // Condition on nodeId as no need to fetch node id
                        // multiple times as this is respected to only 1
                        // topology file.
                        if (nodeId == -1) {
                            if (attrObj.has("gNBId") && nodeIdLen == -1) {
                                nodeId = attrObj.getInt("gNBId");
                                networkFunctionParameterMap.put(nodeId, attribute);
                                // dynamic gnodebIdLen needs to set only once
                                // based on first topology file.
                                if (isFirst) {
                                    nodeIdLen = attrObj.getInt("gNBIdLength");
                                    // setting gnodeBIdLen
                                    // if (nodeIdLen == 22 || nodeIdLen == 32) {
                                    // // wrong
                                    if (nodeIdLen < 22 || nodeIdLen > 32) {
                                        LOGGER.warn(
                                                "Invalid GNodeB Id Length {} found, Default length {} will be used",
                                                nodeIdLen, gnbIdLength);
                                        nodeIdLen = gnbIdLength;
                                    } else {
                                        gnbIdLength = nodeIdLen;
                                        config.setParam(Param.gNodeBIdLen, nodeIdLen);
                                        LOGGER.info("Length {} will be used for all GNodeB Ids", nodeIdLen);
                                    }
                                }
                         }
                                 }

                        if (moClass.equalsIgnoreCase(eP_NgUId) || (moClass.equalsIgnoreCase(s1ULinkId))
                                || (moClass.equalsIgnoreCase(rpUserPlaneLinkId))|| (moClass.equalsIgnoreCase(ppControlLinkId)))  {
                            if (attrObj.has(localEndPoint)) {
                                attribute.get(gnbFunction).getLocalMap().get(moClass)
                                        .add(attrObj.getString(localEndPoint));
                            }
                            if (attrObj.has(remoteEndPoint)) {
                                attribute.get(gnbFunction).getRemoteMap().get(moClass)
                                        .add(attrObj.getString(remoteEndPoint));
                            }
                        }
                        if (attrObj.has(gnbFuncMap.get(gnbFunction))) {
                            attribute.get(gnbFunction).setGnbFunctionID(attrObj.getString(gnbFuncMap.get(gnbFunction)));
                        }
                        if (attrObj.has(CELLLOCALID)) {
                            cellLocalIdSet.add(attrObj.getInt(CELLLOCALID));
                        }
                        if(attrObj.has(NCI)){
                            cellNCISet.add(attrObj.getLong(NCI));
                        }
                        if(attrObj.has(SRCNCI)){
                            if(!srcToTargetMap.containsKey(attrObj.getLong(SRCNCI))){
                                srcToTargetMap.put(attrObj.getLong(SRCNCI), new ArrayList<RelationAttribute>());
                            }
                            if(moClass.equalsIgnoreCase(NRCELLRELATION) || moClass.equalsIgnoreCase(EUTRANRELATION)){
                                String [] nrCellRelation = moFdn.split("=");
                                String[] values = nrCellRelation[nrCellRelation.length-1].split("_");
                                RelationAttribute relation = new RelationAttribute();
                                //values[0] = mcc & values[1] = mnc
                                relation.setPlmnID(makePLMNId(values[0], values[1]));
                                relation.setNci(Long.valueOf(values[2]));
                                relation.setMoClass(moClass);
                                srcToTargetMap.get(attrObj.getLong(SRCNCI)).add(relation);
                            }
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found exception occur for file : " + filename);
        } catch (NullPointerException e) {
            LOGGER.error("No data found in file : " + filename);
        } catch (Exception e) {
            LOGGER.error("Exception while parsing file : " + filename);
        }
      //distribute cell relation base on HO_TYPE
        for(Long srcNci : srcToTargetMap.keySet()){
            for(RelationAttribute relation : srcToTargetMap.get(srcNci)){
                if(relation.getMoClass().equals(NRCELLRELATION)){
                    if(!attribute.get(GNBCUCPFunction).getSrcToTargetMap().containsKey(srcNci)){
                        attribute.get(GNBCUCPFunction).getSrcToTargetMap().put(srcNci, new HashMap<Integer,List<RelationAttribute>>());
                    }
                    if(cellNCISet.contains(relation.getNci())){
                        if(!attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).containsKey(INTERHANDOVER)){
                            attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).put(INTERHANDOVER, new ArrayList<RelationAttribute>());
                        }
                        attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).get(INTERHANDOVER).add(relation);
                    }else{
                        if(!attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).containsKey(INTERAHANDOVER)){
                            attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).put(INTERAHANDOVER, new ArrayList<RelationAttribute>());
                        }
                        attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).get(INTERAHANDOVER).add(relation);
                    }
                }else{
                    if(!attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).containsKey(EUTRANHANDOVER)){
                        attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).put(EUTRANHANDOVER, new ArrayList<RelationAttribute>());
                    }
                    attribute.get(GNBCUCPFunction).getSrcToTargetMap().get(srcNci).get(EUTRANHANDOVER).add(relation);
                }
            }
        }
        srcToTargetMap.clear();
        // dumping all cellLocalId, GNodeBId, node name information in map
        if (!cellLocalIdSet.isEmpty()) {
            addNode(nodeName, nodeId, null);
            for (int cellId : cellLocalIdSet) {
                addCell(nodeId, cellId);
            }
        }

    }

    private void addNode(String nodeName, Integer nodeId, NetworkFunction nf) {
        networkFunctionList.add(nodeId.toString() + NetworkFunction.CUCP.name());
        networkFunctionList.add(nodeId.toString() + NetworkFunction.CUUP.name());
        networkFunctionList.add(nodeId.toString() + NetworkFunction.DU.name());
        String name = nodeName + ",gNodeBId=" + nodeId.toString() + "_NF=";
        nodeNameToNodeIdMap.put(nodeId.toString() + NetworkFunction.CUCP.name(),
                nodeName + "_" + NetworkFunction.CUCP.name());
        nodeNameToNodeIdMap.put(nodeId.toString() + NetworkFunction.CUUP.name(),
                nodeName + "_" + NetworkFunction.CUUP.name());
        nodeNameToNodeIdMap.put(nodeId.toString() + NetworkFunction.DU.name(),
                nodeName + "_" + NetworkFunction.DU.name());
        // gNBid2NameMap.put(nodeId.toString() + NetworkFunction.CUCP.name(),
        // name + NetworkFunction.CUCP.name());
        // gNBid2NameMap.put(nodeId.toString() + NetworkFunction.CUUP.name(),
        // name + NetworkFunction.CUUP.name());
        // gNBid2NameMap.put(nodeId.toString() + NetworkFunction.DU.name(), name
        // + NetworkFunction.DU.name());
    }

    private void addCell(int nodeId, int localCellId) {
        Integer nci = ((nodeId << (36 - gnbIdLength)) | localCellId);
        nciList.add(nci);
        nci2gNodeBMap.put(nci, nodeId);
    }

    /**
     * PLMN Identity M OCTET STRING (3) - digits 0 to 9, encoded 0000 to 1001, -
     * 1111 used as filler digit, two digits per octet, - bits 4 to 1 of octet n
     * encoding digit 2n-1 - bits 8 to 5 of octet n encoding digit 2n
     * 
     * -The PLMN identity consists of 3 digits from MCC followed by either -a
     * filler digit plus 2 digits from MNC (in case of 2 digit MNC) or -3 digits
     * from MNC (in case of a 3 digit MNC).
     * 
     * http://www.etsi.org/deliver/etsi_ts/136400_136499/136423/11.03.00_60/
     * ts_136423v110300p.pdf
     * 
     * Chapter 9.2.4
     * 
     * Encoding : For MCC(A1A2A3) and MNC(B1B2B3), PLMN id will be
     * 0xA2A1B1A3B3B2.
     * 
     * @param mcc three character country code
     * @param mnc two or three character network code
     * @return plmnid
     */
    private byte[] makePLMNId(String mcc, String mnc) {
        byte[] result = new byte[3];
        String newMnc;

        // Encoding PLMN id from MCC MNC as per JIRA EQEV-18355
        result[0] = (byte) ((mcc.charAt(1) - '0') << 4);
        result[0] += (byte) (mcc.charAt(0) - '0');

        if (mnc.length() == 2) { // short mnc code
            newMnc = " " + mnc;
            result[1] = (byte) (0x0f << 4); // filler code
        } else {
            newMnc = mnc;
            result[1] = (byte) ((newMnc.charAt(0) - '0') << 4);
        }
        result[1] += (byte) (mcc.charAt(2) - '0');

        result[2] = (byte) ((newMnc.charAt(2) - '0') << 4);
        result[2] += (byte) (newMnc.charAt(1) - '0');

        try {
            localPLMNid = Integer.parseInt(mcc);
            if (mnc.length() == 2) {
                localPLMNid *= 100;
            } else {
                localPLMNid *= 1000;
            }
            localPLMNid += Integer.parseInt(mnc);
        } catch (Exception e) {
            localPLMNid = 310410;
        }
        return result;
    }

    public Map<String, String> getNodeNameToNodeIdMap() {
        return nodeNameToNodeIdMap;
    }

    /**
     * @return the hoTypeEvents
     */
    public static List<Integer> getHoTypeEvents() {
        if(null == hoTypeEvents){
            hoTypeEvents = new ArrayList<>();
        }
        return hoTypeEvents;
    }
}
