package com.ericsson.tcs.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;
import com.ericsson.tcs.session.wrapper.PmEventSession;
import com.ericsson.tcs.session.wrapper.SessionPerCall;


/**
 * @author xjaimah
 *
 */
public class SessionIdentifierService implements ConstantParameter {

    /**
     * The inputLocation
     */
    private String inputLocation;

    /**
     * The outputLocation
     */
    private String outputLocation;

    /**
     * The sessionAttribute
     */
    private List<String> sessionAttribute;

    /**
     * The eventsToIgnore
     */
    private static List<String> eventsToIgnore;

    /**
     * The endEventsList
     */
    private List<String> endEventsList;

    /**
     * The interval
     */
    private int interval;

    /**
     * The fileList
     */
    Map<String, List<String>> ropWiseMap;

    /**
     * The callBackResults
     */
    private List<Future<List<PmEventSession>>> callBackResults;

    /**
     * The sessionEventList
     */
    private List<PmEventSession> sessionEventList;

    /**
     * Event id to event name map.
     */
    private static Map<Long, String> eventIds = new HashMap<>();

    /**
     * The sessionCall
     */
    private Map<String, List<SessionPerCall>> sessionCall;

    /**
     * This will use to write the session file.
     */
    private FileWriter fileWriter = null;

    /**
     * The max number of rows counter.
     */
    private int numberOfRows = 0;

    /**
     * This variable to use to change the file name if max number of rows hit.
     */
    private int fileNumber = 1;

    /**
     * The specificPatternList
     */
    private List<String> specificPatternList;

    /**
     * The FileReader
     */
    private FileReader fileRead;

    /**
     * The isPatternBaseFileRequire
     */
    private boolean isPatternBaseFileRequire;

    /**
     * The existingFileData
     */
    private Map<String, List<byte[]>> existingFileData;

    /**
     * The networkFuncationToFileNameMap
     */
    private Map<String, String> networkFuncationToFileNameMap;

    private Map<String, Object> gnb_nci_map;

    private GPBServices gpbService;

    private EncoderService encode;
    
    private boolean isValid ;

    /**
     * @param inputParameters
     *            inputParameters[1] = input location inputParameters[2] =
     *            output location inputParameters[3] = session attribute
     *            inputParameters[4] = events to ignore inputParameters[5] =
     *            call duration inputParameters[6] = end events
     *            inputParameters[7] = extract specific pattern
     *            inputParameters[8] = pattern wise file require
     *            inputParameters[9] = File location where patterns need to
     *            append.
     */
    public void init(String[] inputParameters) {
        gpbService = new GPBServices();
        specificPatternList = new ArrayList<>();
        DecoderService decode = new DecoderService();
        this.inputLocation = inputParameters[1].trim();
        this.outputLocation = inputParameters[2].trim();
        this.sessionAttribute = Arrays.asList(inputParameters[3].trim().split(","));
        SessionIdentifierService.eventsToIgnore = Arrays.asList(inputParameters[4].trim().toLowerCase().split(","));
        this.interval = Integer.parseInt(inputParameters[5].trim());
        this.endEventsList = Arrays.asList(inputParameters[6].trim().toLowerCase().split(","));
        if (!inputParameters[7].trim().isEmpty()) {
            if (inputParameters[8].trim().equalsIgnoreCase("YES")) {
                isPatternBaseFileRequire = true;
            }
            fileRead = new FileReader();
            converUEToLong(inputParameters[7].trim().split(","), decode);
            if (!inputParameters[9].trim().isEmpty()) {
               
                encode = new EncoderService();
                gnb_nci_map = new HashMap<String, Object>();
                collectExistingFileData(inputParameters[9].trim());
            }
        }
        this.ropWiseMap = new LinkedHashMap<>();
        this.sessionEventList = new LinkedList<>();
        this.sessionCall = new HashMap<>();
        Utils.getEventNameToIdMap(eventIds);
        if (null == endEventsList || null == sessionAttribute || null == eventsToIgnore || inputLocation.isEmpty()
                || outputLocation.isEmpty()) {
             System.out.println("ERROR: Please provide proper configuration parameters.");
             System.exit(1);
        }
        Utils.collectRopsFiles(inputLocation, ropWiseMap);
        if (!ropWiseMap.isEmpty()) {
            distributionAndProcessRops();
        } else {
            System.out.println(
                    "ERROR: Error occur while processing input location, please check the files avaliable at input location or not.");
            System.exit(1);
        }
        if (!isPatternBaseFileRequire) {
            writeAllCloseSession(true);
        } else {
            writeAllCloseSessionInGPBFile(true);
        }
        if (existingFileData != null) {
            if (!existingFileData.isEmpty() && isPatternBaseFileRequire) {
                writeUpdatedFile();
            }
        }
        closeFileWriter();
        if(!isValid) {
            System.out.println("Sessions identified successfully, please refer the file at location " + outputLocation);
        }
    }

    /**
     * This method will append extracted patterns in given file.
     */
    private void writeUpdatedFile() {
        try {
            for (String key : existingFileData.keySet()) {
                File file = new File(outputLocation + File.separator + networkFuncationToFileNameMap.get(key));
                FileOutputStream fileOuputStream = new FileOutputStream(file);
                GZIPOutputStream gzOutput = new GZIPOutputStream(fileOuputStream);
                for (byte[] event : existingFileData.get(key)) {
                    PmEvent evt = (PmEvent) gpbService.getPmEventOuterMessage(event);
                    gzOutput.write(gpbService.write(evt));
                }
                gzOutput.flush();
                gzOutput.close();
                fileOuputStream.close();
            }
        } catch (Exception ex) {
            System.out.println("Error occuring while appending pattern in given file.");
            System.exit(1);
        }
    }

    /**
     * This will collect events from existing files.
     * 
     * @param fileLocation
     */
    private void collectExistingFileData(String fileLocation) {
        File directory = new File(fileLocation);
        DecoderService decode = new DecoderService();
        existingFileData = new HashMap<String, List<byte[]>>();
        networkFuncationToFileNameMap = new HashMap<String, String>();
        List<File> fList = Arrays.asList(directory.listFiles());
        for (File nfFile : fList) {
            if (nfFile.getName().endsWith(GPB_EXT) || nfFile.getName().endsWith(GZ_EXT)) {
                List<byte[]> fileData = fileRead.getFileEventList(nfFile);
                for (byte[] eventsBytes : fileData) {
                    PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(eventsBytes);
                    Integer id =  (int) pmEventMessage.getEventId();
                    String networkFuncation = Utils.getEventToNetworkFuncationMap().get(id);
                    if (!networkFuncation.equals(COMMON) && !networkFuncation.equals(CUUP)) {
                        existingFileData.put(networkFuncation, fileData);
                        networkFuncationToFileNameMap.put(networkFuncation, nfFile.getName());
                        if (gnb_nci_map.isEmpty()) {
                            Set<String> parameters = new HashSet<>();
                            parameters.add(NCI);
                            parameters.add(GNODEBID);
                            Map<String, Object> values = decode.getEventParamValue(pmEventMessage, parameters);
                            if (!values.isEmpty() && values.containsKey(NCI)) {
                                gnb_nci_map.put(NCI, values.get(NCI));
                                gnb_nci_map.put(GNODEBID, values.get(GNODEBID));
                            } else {
                                continue;
                            }
                        }
                        break;
                    } else if (networkFuncation.equals("CUUP")) {
                        existingFileData.put(networkFuncation, fileData);
                        break;
                    }
                }
            }
        }
        if (existingFileData.isEmpty()) {
            System.out.println("Location " + fileLocation
                    + "not have any GPB file to append extracted pattern. terminating process.");
            System.exit(1);
        }
    }

    /**
     * @param patterns
     * @param decode
     */
    private void converUEToLong(String[] patterns, DecoderService decode) {
        for (String key : patterns) {
            String nci_ue = key.split(":")[0].trim();
            nci_ue = nci_ue + ":" + Long.decode(key.split(":")[1].trim());
            specificPatternList.add(nci_ue);
        }
    }

    /**
     * Process callback output and create session object
     */
    public void processAvaliableEvents() {
        for (Future<List<PmEventSession>> future : callBackResults) {
            try {
                sessionEventList.addAll(future.get());
            } catch (InterruptedException | ExecutionException e) {
                closeFileWriter();
                System.out.println("ERROR: Unable to process thread results. " + e.getMessage());
            }
        }
        callBackResults.clear();
        Collections.sort(sessionEventList);
        createSessionAndWriteInFile();
        sessionEventList.clear();
        if (!isPatternBaseFileRequire) {
            writeAllCloseSession(false);
        } else {
            writeAllCloseSessionInGPBFile(false);
            
        }
    }

    /**
     * This method will write close session in gpb file.
     * 
     * @param remainingSession
     */
    private void writeAllCloseSessionInGPBFile(boolean remainingSession) {
        Map<String, List<SessionPerCall>> sessionCallMap = new HashMap<>();
        Map<Object, List<byte[]>> nodeToDataMapping = new HashMap<>();
        if(sessionCall.isEmpty()) {
            isValid=true;
            System.out.println(" INFO : Specified UetraceID and NCi combination is not found in input data ");
        }
        for (String sessionId : sessionCall.keySet()) {
            for (SessionPerCall session : sessionCall.get(sessionId)) {
                if (session.isSessionClose() || remainingSession) {
                    for (PmEventSession pm : session.getSessionEvents()) {
                        if (isPatternBaseFileRequire) {
                            if (!nodeToDataMapping.containsKey(pm.getGnbID()+ "_" + pm.getNetworkFunction())) {
                                List<byte[]> tempHolder = new ArrayList<byte[]>();
                                nodeToDataMapping.put(pm.getGnbID() + "_" + pm.getNetworkFunction(), tempHolder);
                            }
                            nodeToDataMapping.get(pm.getGnbID() + "_" + pm.getNetworkFunction()).add(pm.getEventData());
                        } else {
                            if (!nodeToDataMapping.containsKey(sessionId)) {
                                List<byte[]> tempHolder = new ArrayList<byte[]>();
                                nodeToDataMapping.put(sessionId, tempHolder);
                            }
                            nodeToDataMapping.get(sessionId).add(pm.getEventData());
                        }
                    }
                } else {
                    if (!sessionCallMap.containsKey(sessionId)) {
                        List<SessionPerCall> temp = new ArrayList<>();
                        sessionCallMap.put(sessionId, temp);
                    }
                    sessionCallMap.get(sessionId).add(session);
                }
            }
        }
        if (!nodeToDataMapping.isEmpty()) {
            write(nodeToDataMapping);
        }
        sessionCall.clear();
        sessionCall.putAll(sessionCallMap);
    }

    /**
     * write all close session in GPB file.
     * 
     * @param nodeToDataMapping
     */
    private void write(Map<Object, List<byte[]>> nodeToDataMapping) {
        try {
            if (gnb_nci_map != null) {
                for (Object key : nodeToDataMapping.keySet()) {
                    List<byte[]> events = nodeToDataMapping.get(key);
                    for (byte[] event : events) {
                        PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
                        Integer id = (int)pmEventMessage.getEventId();
                        int etcmVersion = (int)pmEventMessage.getEtcmVersion();
                        String networkFunction = Utils.getEventToNetworkFuncationMap().get(id);
                        PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
                        encode.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, gnb_nci_map, null);
                        if(existingFileData.containsKey(networkFunction)) {
                            byte[] Testbyte = existingFileData.get(networkFunction).get(0);
                            PmEvent TestpmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(Testbyte);
                            int existingEtcm = (int)TestpmEventMessage.getEtcmVersion();
                            if(etcmVersion!=existingEtcm) {
                                System.out.println("ERROR : Input File version and Appending file ETCM version do not match . Terminating process");
                                System.exit(1);
                            }
                            existingFileData.get(networkFunction).add(pmEventMessageBuilder.build().toByteArray());
                        }
                        else {
                            System.out.println(" WARN : Network Function " + networkFunction + " file is not avialable for appending ");
                            existingFileData.put(networkFunction, new ArrayList<byte []>());
                            existingFileData.get(networkFunction).add(pmEventMessageBuilder.build().toByteArray());
                            networkFuncationToFileNameMap.put(networkFunction,"A20200921.1330-1345_SubNetwork=ONRM_ROOT_MO_R,MeContext="
                                    + key +  "_celltracefile_1" + GPB_EXT + GZ_EXT );
                        }
                        
                    }
                }
            } else {
                for (Object key : nodeToDataMapping.keySet()) {
                    List<byte[]> events = new ArrayList<byte[]>();
                    File file = new File(
                            outputLocation + File.separator + "A20200921.1330-1345_SubNetwork=ONRM_ROOT_MO_R,MeContext="
                                    + key +  "_celltracefile_1" + GPB_EXT + GZ_EXT);
                    if (file.exists()) {
                        events = fileRead.getFileEventList(file);
                    }
                    events.addAll(nodeToDataMapping.get(key));
                    FileOutputStream fileOuputStream = new FileOutputStream(file);
                    GZIPOutputStream gzOutput = new GZIPOutputStream(fileOuputStream);
                    for (byte[] event : events) {
                        PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
                        gzOutput.write(gpbService.write(pmEventMessage));
                    }
                    gzOutput.flush();
                    gzOutput.close();
                    fileOuputStream.close();
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            System.out.println("ERROR : while writing patterns into GPB file for node." + ex.getMessage());
        }
    }

    /**
     * This method will process all close session and remove those session from
     * memory
     */
    private void writeAllCloseSession(boolean remainingSession) {
        Map<String, List<SessionPerCall>> sessionCallMap = new HashMap<>();
        if(sessionCall.isEmpty()) {
            isValid=true;
            System.out.println("INFO : Specified UetraceID and NCI combination is not found in input data ");
        }
        for (String sessionId : sessionCall.keySet()) {
            for (SessionPerCall session : sessionCall.get(sessionId)) {
                if (session.isSessionClose() || remainingSession) {
                    String eventSequence = "";
                    int pdu_count = 0;
                    int total_events = 0;
                    for (PmEventSession pm : session.getSessionEvents()) {
                        pdu_count += pm.getPduCounts();
                        eventSequence += pm.getEventID() + ":";
                        total_events += 1;
                    }
                    if (MAX_ROWS <= numberOfRows) {
                        fileNumber += 1;
                        closeFileWriter();
                    }
                    writeSessionInFile(sessionId, pdu_count, eventSequence, total_events, fileNumber);
                } else {
                    if (!sessionCallMap.containsKey(sessionId)) {
                        List<SessionPerCall> temp = new ArrayList<>();
                        sessionCallMap.put(sessionId, temp);
                    }
                    sessionCallMap.get(sessionId).add(session);
                }
            }
        }
        sessionCall.clear();
        sessionCall.putAll(sessionCallMap);
    }

    /**
     * This method will close the current file writer object in case of error
     * condition or graceful termination of this process.
     */
    public void closeFileWriter() {
        try {
            if (null != fileWriter) {
                fileWriter.close();
            }
        } catch (IOException e) {
            System.out.println("ERROR: error occure while closing file writer object. " + e.getMessage());
        }
    }

    /**
     * This method will write session inside file and if file present it will
     * append entry.
     */
    private void writeSessionInFile(String sesion_id, int pdu, String eventSequence, int total_events, int fileNumber) {
        try {
            File file = new File(
                    outputLocation + File.separator + SESSION_FILE + "_" + fileNumber + SESSION_FILE_FORMAT);
            if (!file.exists()) {
                file.createNewFile();
                fileWriter = new FileWriter(file, true);
                fileWriter.write("Session ID, Total Events In Session, Events ID's, PDU Count \n");
            }
            fileWriter.write(sesion_id + "," + total_events + ","
                    + eventSequence.substring(0, eventSequence.length() - 1) + "," + pdu + "\n");
            numberOfRows += 1;
        } catch (Exception e) {
            System.out.println("ERROR: Error occur while accessing session record file. " + e.getMessage());
            closeFileWriter();
        }
    }

    /**
     * This method will create actual session based on end events time interval
     * and write that session in file.
     */
    private void createSessionAndWriteInFile() {
        Map<String, List<PmEventSession>> tempHolder = new HashMap<>();
        for (PmEventSession pmEvent : sessionEventList) {
            if (!pmEvent.getSessionId().contains(":") && sessionAttribute.size() >= 2) {
                if (!tempHolder.containsKey(pmEvent.getSessionId())) {
                    List<PmEventSession> tempList = new ArrayList<PmEventSession>();
                    tempHolder.put(pmEvent.getSessionId(), tempList);
                }
                tempHolder.get(pmEvent.getSessionId()).add(pmEvent);
            } else {
                if (!sessionCall.containsKey(pmEvent.getSessionId())) {
                    List<SessionPerCall> tempSession = new ArrayList<SessionPerCall>();
                    sessionCall.put(pmEvent.getSessionId(), tempSession);
                }
                if (tempHolder.isEmpty()) {
                    processSessionCall(pmEvent);
                } else {
                    if (tempHolder.containsKey(pmEvent.getUe_trace_id())) {
                        for (PmEventSession commonObj : tempHolder.get(pmEvent.getUe_trace_id())) {
                            commonObj.setSessionId(pmEvent.getSessionId());
                            processSessionCall(commonObj);
                        }
                        tempHolder.remove(pmEvent.getUe_trace_id());
                        processSessionCall(pmEvent);
                    }
                }
            }
        }
    }

    /**
     * Create session start object
     * 
     * @param pmEvent
     */
    private void startSession(PmEventSession pmEvent) {
        SessionPerCall session = new SessionPerCall();
        session.getSessionEvents().add(pmEvent);
        session.setLastEventId(pmEvent.getEventID());
        session.setLastEventTimeStamp(pmEvent.getTimeStamp());
        session.setSessionClose(false);
        sessionCall.get(pmEvent.getSessionId()).add(session);
    }

    /**
     * This method will create actual session object which contains session
     * event information
     * 
     * @param pmEvent
     */
    private void processSessionCall(PmEventSession pmEvent) {
        if (sessionCall.get(pmEvent.getSessionId()).isEmpty()) {
            startSession(pmEvent);
        } else {
            for (SessionPerCall sessionEvt : sessionCall.get(pmEvent.getSessionId())) {
                if (!sessionEvt.isSessionClose()) {
                    if ((sessionEvt.getLastEventTimeStamp() + ((interval + BUFFER_SESSION_SEC)*1000)) >= pmEvent
                            .getTimeStamp() &&  !endEventsList.contains(eventIds.get(sessionEvt.getLastEventId()).toLowerCase())) {
                        sessionEvt.getSessionEvents().add(pmEvent);
                        sessionEvt.setLastEventId(pmEvent.getEventID());
                    } else {
                        sessionEvt.setSessionClose(true);
                        startSession(pmEvent);
                        break;
                    }
                }
            }
        }
    }

    /**
     * @param value
     * @return
     */
    public String getValidEventName(long value) {
        if (eventIds.containsKey(value)) {
            return eventIds.get(value);
        }
        return "";
    }

    /**
     * This method will process rop's based on given interval
     */
    public void distributionAndProcessRops() {
        callBackResults = new ArrayList<>();
        int poolSize = Runtime.getRuntime().availableProcessors();
        for (String rop : ropWiseMap.keySet()) {
            ThreadPoolExecutor threadPoolTaskExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(poolSize);
            List<String> fdnPerRopList = ropWiseMap.get(rop);
            if (fdnPerRopList.size() > 0) {
                int factor = 1;
                int mod = 0;
                int startIndex = 0;
                int endIndex = 0;
                if (fdnPerRopList.size() < poolSize) {
                    poolSize = fdnPerRopList.size();
                    mod = -1;
                } else {
                    factor = fdnPerRopList.size() / poolSize;
                    mod = fdnPerRopList.size() % poolSize;
                }
                for (int threadindex = 0; threadindex < poolSize; threadindex++) {
                    startIndex = endIndex;
                    if (threadindex == poolSize - 1) {
                        endIndex = fdnPerRopList.size();
                    } else {
                        endIndex = endIndex + factor + (mod > 0 ? 1 : 0);
                        mod--;
                    }
                    List<String> subfdnList = fdnPerRopList.subList(startIndex, endIndex);
                    SessionIdentifierWorker work = new SessionIdentifierWorker();
                    work.setListOfFiles(subfdnList);
                    work.setSessionAttribute(sessionAttribute);
                    work.setSpecificPatterns(specificPatternList);
                    Future<List<PmEventSession>> callBackResult = threadPoolTaskExecutor.submit(work);
                    callBackResults.add(callBackResult);
                }
            }
            threadPoolTaskExecutor.shutdown();
            while (!threadPoolTaskExecutor.isTerminated()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("ERROR: Error while closing thread pool instances. " + e.getMessage());
                }
            }
            processAvaliableEvents();
        }
    }

    /**
     * @return the eventsToIgnore
     */
    public static List<String> getEventsToIgnore() {
        return eventsToIgnore;
    }

    /**
     * @return the eventIds
     */
    public static Map<Long, String> getEventIds() {
        return eventIds;
    }
    
}
