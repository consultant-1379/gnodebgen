package com.ericsson.tcs.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.session.wrapper.PmEventSession;

/**
 * @author xjaimah
 *
 */
public class SessionIdentifierWorker implements Callable<List<PmEventSession>>, ConstantParameter {

    /**
     * The listOfFiles
     */
    private List<String> listOfFiles;

    /**
     * The sessionEventList
     */
    private List<PmEventSession> sessionEventList;

    /**
     * The sessionAttribute
     */
    private List<String> sessionAttribute;

    /**
     * The decode
     */
    private DecoderService decode;

    /**
     * specificPatterns
     */
    private List<String> specificPatterns;

    /**
     * The isSpecficPattern
     */
    private boolean isSpecficPattern;

    /**
     * This is use to append length of event
     */
    private GPBServices gpb_service;

    @Override
    public List<PmEventSession> call() throws Exception {
        gpb_service = new GPBServices();
        FileReader file = new FileReader();
        decode = new DecoderService();
        sessionEventList = new ArrayList<PmEventSession>();
        for (String filePath : listOfFiles) {
            File binaryFile = new File(filePath);
            List<byte[]> events = file.getFileEventList(binaryFile);
            processAllEvents(events);
        }
        return sessionEventList;
    }

    /**
     * This method will parse event and create pmEventSession object.
     * 
     * @param events
     */
    private void processAllEvents(List<byte[]> events) {
        Set<String> parameters = new HashSet<>();
        parameters.addAll(sessionAttribute);
        if (parameters.contains(UE_TRACE_ID)) {
            parameters.remove(UE_TRACE_ID);
        }
        if (isSpecficPattern) {
            parameters.add(GNODEBID);
        }
        parameters.add(PDU_SESSION);
        for (byte[] event : events) {
            PmEvent pmEventMessage = (PmEvent) gpb_service.getPmEventOuterMessage(event);
            if (SessionIdentifierService.getEventsToIgnore()
                    .contains(SessionIdentifierService.getEventIds().get(pmEventMessage.getEventId()).toLowerCase())) {
                continue;
            }
            PmEventSession pmEvent = new PmEventSession();
            String sessionId = String.valueOf(decode.getByteStringToLong(pmEventMessage));
            pmEvent.setUe_trace_id(sessionId);
            Integer id = (int)pmEventMessage.getEventId();
            if (Utils.getEventToNetworkFuncationMap().containsKey(id)) {
                pmEvent.setNetworkFunction(Utils.getEventToNetworkFuncationMap().get(id));
            }
            if (pmEventMessage.getGroupValue() != 1) {
                Map<String, Object> values = decode.getEventParamValue(pmEventMessage, parameters);
                if (null != values) {
                    if (values.containsKey(NCI) && isSpecficPattern
                            && !specificPatterns.contains(values.get(NCI) + ":" + sessionId)) {
                        continue;
                    }
                    for (String key : parameters) {
                        if (values.containsKey(PDU_SESSION) && key.equalsIgnoreCase(PDU_SESSION)) {
                            pmEvent.setPduCounts((int) values.get(PDU_SESSION));
                        } else if (values.containsKey(GNODEBID) && key.equalsIgnoreCase(GNODEBID)) {
                            pmEvent.setGnbID(values.get(GNODEBID));
                        } else {
                            if (values.containsKey(key)) {
                                sessionId += ":" + values.get(key);
                            }
                        }
                    }
                }
            }
            if (isSpecficPattern) {
                pmEvent.setEventData(pmEventMessage.toByteArray());
            }
            pmEvent.setSessionId(sessionId);
            pmEvent.setEventID(pmEventMessage.getEventId());
            pmEvent.setTimeStamp(pmEventMessage.getHeader().getTimeStamp());
            sessionEventList.add(pmEvent);
        }
    }

    /**
     * @param listOfFiles
     *            the listOfFiles to set
     */
    public void setListOfFiles(List<String> listOfFiles) {
        this.listOfFiles = listOfFiles;
    }

    /**
     * @param sessionAttribute
     *            the sessionAttribute to set
     */
    public void setSessionAttribute(List<String> sessionAttribute) {
        this.sessionAttribute = sessionAttribute;
    }

    /**
     * @return the specificPatterns
     */
    public List<String> getSpecificPatterns() {
        return specificPatterns;
    }

    /**
     * @param specificPatterns
     *            the specificPatterns to set
     */
    public void setSpecificPatterns(List<String> specificPatterns) {
        if (!specificPatterns.isEmpty()) {
            isSpecficPattern = true;
        }
        this.specificPatterns = specificPatterns;
    }

}
