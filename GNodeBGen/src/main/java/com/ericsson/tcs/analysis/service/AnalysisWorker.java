package com.ericsson.tcs.analysis.service;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.analysis.wrapper.AnalysisModel;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;

/**
 * @author xjaimah
 */
public class AnalysisWorker implements Callable<List<AnalysisModel>> {

    /**
     * The feederQueue
     */
    private BlockingQueue<String> feederQueue;

    /**
     * The gpbService
     */
    private GPBServices gpbService;

    /**
     * The decode
     */
    private DecoderService decode;

    /**
     * The gnodeIDMap
     */
    private Map<Object, AnalysisModel> gnodeIDMap;


    /**
     * @param feederQueue blocking queue
     */
    public AnalysisWorker(BlockingQueue<String> feederQueue) {
        this.feederQueue = feederQueue;
    }

    @Override
    public List<AnalysisModel> call() {
        gpbService = new GPBServices();
        decode = new DecoderService();
        gnodeIDMap = new HashMap<>();
        List<AnalysisModel> eventAnalysisInfo = new ArrayList<>();
        try {
            while (true) {
                String filePath = feederQueue.poll();
                if (null == filePath) {
                    break;
                }
                File file = new File(filePath);
                FileReader event = new FileReader();
                List<byte[]> eventDataList = event.getFileEventList(file);
                updateGnodeBInfo(eventDataList, file.getName());
            }
            eventAnalysisInfo.addAll(gnodeIDMap.values());
        } catch (Exception e) {
            System.out.println("ERROR: Error while processing file in worker thread. " + e.getMessage());
        }
        return eventAnalysisInfo;
    }

    /**
     * @param eventDataList event Data list
     * @param fileName      filename of the trace file
     */
    private void updateGnodeBInfo(List<byte[]> eventDataList, String fileName) {

        AnalysisModel nodeInfo = null;
        Map<Long, Integer> eventIdMap = new HashMap<>();
        Map<Long, String> eventIdToNameMap = new HashMap<>();
        Map<Long, String> eventIdToNFMap = new HashMap<>();
        Map<Long, long[]> eventIdToSizesMap = new HashMap<>();

        int eventCount = 0;
        long maxEventSizeId = 0;
        long totalEventSize = 0;
        long maxEventSize = 0;
        long eventSize;

        for (byte[] eventBytes : eventDataList) {
            eventCount++;
            eventSize = eventBytes.length;
            totalEventSize += eventSize;
            PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(eventBytes);

            if (eventSize > maxEventSize) {
                maxEventSize = eventSize;
                maxEventSizeId = pmEventMessage.getEventId();
            }
            if (pmEventMessage.getGroupValue() != 1)
                nodeInfo = getModelObject(pmEventMessage);
            if (eventIdMap.containsKey(pmEventMessage.getEventId())) {
                int count = eventIdMap.get(pmEventMessage.getEventId()) + 1;
                eventIdMap.put(pmEventMessage.getEventId(), count);
                // Min size of Event at 0th index
                // Max size of Event at 1st index
                // total size of Event at 2nd index
                if(eventSize < eventIdToSizesMap.get(pmEventMessage.getEventId())[0]){
                    eventIdToSizesMap.get(pmEventMessage.getEventId())[0] = eventSize;
                }else if(eventSize > eventIdToSizesMap.get(pmEventMessage.getEventId())[1]){
                    eventIdToSizesMap.get(pmEventMessage.getEventId())[1] = eventSize;
                }
                eventIdToSizesMap.get(pmEventMessage.getEventId())[2] += eventSize;
            } else {
                eventIdMap.put(pmEventMessage.getEventId(), 1);
                eventIdToSizesMap.put(pmEventMessage.getEventId(), new long[]{eventSize, eventSize, eventSize});
                eventIdToNameMap.put(pmEventMessage.getEventId(), decode.getEventName(pmEventMessage));
                eventIdToNFMap.put(pmEventMessage.getEventId(), decode.getEventNfName(pmEventMessage));
            }
        }
        if (null == nodeInfo) {
            System.out.println("Warning file " + fileName + "contains only common events, and hence not able to " +
                    "identify GnodeBID. skipping file..");
        } else {
        	// New code starts here
        	nodeInfo.setFdn_name(fileName.substring(20, fileName.indexOf("_celltrace")));
        	nodeInfo.getRop_time().add(fileName.split("-")[0]);
        	// New code ends here
        	
            nodeInfo.setTotalEventSize(nodeInfo.getTotalEventSize() + totalEventSize);
            if (nodeInfo.getMaxEventSize() < maxEventSize) {
                nodeInfo.setMaxEventSize(maxEventSize);
                nodeInfo.setMaxEventSizeId(maxEventSizeId);
            }
            nodeInfo.setTotalEvents(nodeInfo.getTotalEvents() + eventCount);
            updateAnalysisModel(nodeInfo, eventIdMap, eventIdToNameMap, eventIdToNFMap, eventIdToSizesMap);
        }
    }

    /**
     * @param nodeInfo          node info
     * @param eventIdMap        event id to event count map
     * @param eventIdToNFMap    event id to network function map
     * @param eventIdToNameMap  event id to event name map
     */
    private void updateAnalysisModel(AnalysisModel nodeInfo, Map<Long, Integer> eventIdMap,
                                     Map<Long, String> eventIdToNameMap, Map<Long, String> eventIdToNFMap,
                                     Map<Long, long[]> eventIdToSizesMap) {

        if (nodeInfo.getEventWiseCount().isEmpty()) {
            nodeInfo.getEventWiseCount().putAll(eventIdMap);
            nodeInfo.getEventIdToNameMap().putAll(eventIdToNameMap);
            nodeInfo.getEventIdToNfMap().putAll(eventIdToNFMap);
            nodeInfo.getEventIdToSizesMap().putAll(eventIdToSizesMap);
        } else {
            for (Long event : eventIdMap.keySet()) {
                if (nodeInfo.getEventWiseCount().containsKey(event)) {
                    int tempCount = nodeInfo.getEventWiseCount().get(event) + eventIdMap.get(event);
                    nodeInfo.getEventWiseCount().put(event, tempCount);
                    if (eventIdToSizesMap.get(event)[0] < nodeInfo.getEventIdToSizesMap().get(event)[0]) {
                        nodeInfo.getEventIdToSizesMap().get(event)[0] = eventIdToSizesMap.get(event)[0];
                    }
                    if (eventIdToSizesMap.get(event)[1] > nodeInfo.getEventIdToSizesMap().get(event)[1]) {
                        nodeInfo.getEventIdToSizesMap().get(event)[1] = eventIdToSizesMap.get(event)[1];
                    }
                    nodeInfo.getEventIdToSizesMap().get(event)[2] += eventIdToSizesMap.get(event)[2];
                } else {
                    nodeInfo.getEventWiseCount().put(event, eventIdMap.get(event));
                    nodeInfo.getEventIdToNameMap().put(event, eventIdToNameMap.get(event));
                    nodeInfo.getEventIdToNfMap().put(event, eventIdToNFMap.get(event));
                    nodeInfo.getEventIdToSizesMap().put(event, eventIdToSizesMap.get(event));
                }
            }
        }
    }

    /**
     * @param pmEventMessage Message
     * @return AnalysisModel object
     */
    private AnalysisModel getModelObject(PmEvent pmEventMessage) {
        Set<String> param = new HashSet<>();
        param.add(ConstantParameter.GNODEBID);
        param.add(ConstantParameter.NCI);
        Map<String, Object> decodedParamMap = decode.getEventParamValue(pmEventMessage, param);
        if (null != decodedParamMap && decodedParamMap.containsKey(ConstantParameter.GNODEBID)) {
            if (gnodeIDMap.containsKey(decodedParamMap.get(ConstantParameter.GNODEBID))) {
                if (null != decodedParamMap.get(ConstantParameter.NCI)) {
                    gnodeIDMap.get(decodedParamMap.get(ConstantParameter.GNODEBID)).getNci_values()
                            .add(decodedParamMap.get(ConstantParameter.NCI));
                }
                return gnodeIDMap.get(decodedParamMap.get(ConstantParameter.GNODEBID));
            } else {
                AnalysisModel modelObject = new AnalysisModel();
                modelObject.setNodeId(decodedParamMap.get(ConstantParameter.GNODEBID));
                if (null != decodedParamMap.get(ConstantParameter.NCI)) {
                    modelObject.getNci_values().add(decodedParamMap.get(ConstantParameter.NCI));
                }
                gnodeIDMap.put(decodedParamMap.get(ConstantParameter.GNODEBID), modelObject);
                return modelObject;
            }
        } else {
            return null;
        }
    }
}