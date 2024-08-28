package com.ericsson.tcs.utility.profiler;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;

/**
 * @author xjaimah
 *
 */
public class EventAdjustment implements ConstantParameter {

    /**
     * The total_cucp_events
     */
    private int total_cucp_events;

    /**
     * The total_du_events
     */
    private int total_du_events;

    /**
     * The total_cuup_events
     */
    private int total_cuup_events;

    private String cucp_port;

    private String cuup_port;

    private String du_port;

    /**
     * The total_rop
     */
    private int total_rop;

    /**
     * The ropFileMap
     */
    private Map<String, List<String>> ropFileMap;

    /**
     * The eventMappingMap
     */
    private Map<Integer, Map<String, Integer>> eventMappingMap;

    /**
     * The nfList
     */
    private List<String> nfList;

    /**
     * The allEventsList
     */
    private List<byte[]> allEventsList;

    /**
     * The outputLocation
     */
    private String outputLocation;

    /**
     * @param total_cucp_events
     * @param total_cuup_events
     * @param total_du_events
     * @param total_rop
     * @param inputLocation
     * @param outputLocation
     */
    public void init(int total_cucp_events, int total_cuup_events, int total_du_events, String cucp_port,
            String cuup_port, String du_port, int total_rop, String inputLocation, String outputLocation) {
        this.total_cucp_events = total_cucp_events;
        this.total_cuup_events = total_cuup_events;
        this.total_du_events = total_du_events;
        this.cucp_port = cucp_port;
        this.cuup_port = cuup_port;
        this.du_port = du_port;
        this.total_rop = total_rop;
        this.outputLocation = outputLocation;
        ropFileMap = new HashMap<>();
        nfList = new ArrayList<>();
        for (String value : NETWORKFUNCTIONMAP.keySet()) {
            nfList.add(value);
        }
        calculateEvents();
        Utils.collectRopsFiles(inputLocation, ropFileMap);
        processCollectedFile();
    }

    /**
     *
     */
    private void calculateEvents() {
        eventMappingMap = new HashMap<>();
        for (int ropCount = 7; ropCount > 0; ropCount--) {
            for (String nf : nfList) {
                int mod = 0;
                switch (nf) {
                case CUUP:
                    mod = total_cuup_events / ropCount;
                    total_cuup_events -= mod;
                    break;
                case CUCP:
                    mod = total_cucp_events / ropCount;
                    total_cucp_events -= mod;
                    break;
                case DU:
                    mod = total_du_events / ropCount;
                    total_du_events -= mod;
                    break;
                }
                if (!eventMappingMap.containsKey(ropCount)) {
                    eventMappingMap.put(ropCount, new HashMap<String, Integer>());
                }
                eventMappingMap.get(ropCount).put(nf, mod);
            }
        }
    }

    /**
     *
     */
    private void processCollectedFile() {
        List<String> ropList = new ArrayList<String>();
        for (String value : ropFileMap.keySet()) {
            ropList.add(value);
        }
        Collections.sort(ropList);
        FileReader fileRead = new FileReader();
        for (String nf : nfList) {
            allEventsList = new ArrayList<>();
            for (String rop : ropList) {
                List<String> fileList = ropFileMap.get(rop);
                for (String file : fileList) {
                    File f = new File(file);
                    if (nf.equals(CUCP)) {
                        if (f.getName().contains(cucp_port)) {
                            allEventsList.addAll(fileRead.getFileEventList(f));
                        }
                    } else if (nf.equals(CUUP)) {
                        if (f.getName().contains(cuup_port)) {
                            allEventsList.addAll(fileRead.getFileEventList(f));
                        }
                    } else if (nf.equals(DU)) {
                        if (f.getName().contains(du_port)) {
                            allEventsList.addAll(fileRead.getFileEventList(f));
                        }
                    }
                    /*
                     * if (!f.getName().contains(nf)) { continue; }
                     * allEventsList.addAll(fileRead.getFileEventList(f));
                     */
                }
            }

            System.out.println("NF : " + nf + ", Total input events : " + allEventsList.size());

            for (int fileId = 1; fileId <= total_rop; fileId++) {
                int expectedEventCount = eventMappingMap.get(fileId).get(nf);
                String fileName = fileId + "_" + nf + ".gpb";
                write(allEventsList, expectedEventCount, fileName);
                for (int i = 0; i < expectedEventCount; i++) {
                    allEventsList.remove(0);
                }
            }
        }
    }

    /**
     * @param allEventsList2
     * @param expectedEventCount
     * @param fileName
     */
    private void write(List<byte[]> allEventsList2, int expectedEventCount, String fileName) {
        FileOutputStream fileOuputStream = null;
        GZIPOutputStream gzOutput = null;
        GPBServices gpb = new GPBServices();
        try {
            fileOuputStream = new FileOutputStream(
                    outputLocation + File.separator + fileName + ConstantParameter.GZ_EXT);
            gzOutput = new GZIPOutputStream(fileOuputStream);
            for (int i = 0; i < expectedEventCount; i++) {
                PmEvent pmEventMessage = (PmEvent) gpb.getPmEventOuterMessage(allEventsList2.get(i));
                gzOutput.write(gpb.write(pmEventMessage));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (gzOutput != null) {
                try {
                    gzOutput.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOuputStream != null) {
                try {
                    fileOuputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void countEventsInFile(String outLocation) {
        int cucp_cnt = 0;
        int cuup_cnt = 0;
        int du_cnt = 0;
        FileReader fr = new FileReader();
        File dir = new File(outLocation);
        for (File f : dir.listFiles()) {
            List<byte[]> eventList = fr.getFileEventList(f);
            System.out.println(f.getName() + " : " + eventList.size());
            if (f.getName().contains("CUCP")) {
                cucp_cnt += eventList.size();
            } else if (f.getName().contains("CUUP")) {
                cuup_cnt += eventList.size();
            } else {
                du_cnt += eventList.size();
            }
        }
        System.out.println("Total Events (CUCP/CUUP/DU) : " + cucp_cnt + "/" + cuup_cnt + "/" + du_cnt);
    }

}