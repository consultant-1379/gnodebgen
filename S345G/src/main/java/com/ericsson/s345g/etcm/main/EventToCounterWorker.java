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
package com.ericsson.s345g.etcm.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.s345g.etcm.model.EventToCounterModel;

/**
 * @author xjaimah
 *
 */
public class EventToCounterWorker implements Runnable {

    /**
     * The EventToCounterModel
     */
    private EventToCounterModel eventModel;

    /**
     * The patternFile
     */
    private File patternFile;

    /**
     * The etcmParameterHolder
     */
    private Map<String, Set<String>> etcmParameterHolder;

    /**
     * @param eventModel
     * @param patternFile
     */
    public EventToCounterWorker(EventToCounterModel eventModel, File patternFile) {
        this.eventModel = eventModel;
        this.patternFile = patternFile;
        etcmParameterHolder = new HashMap<String, Set<String>>();
        init("ALL");
    }

    public void init(String eventName) {
        for (String event_name : eventModel.getEventToFieldMap().keySet()) {
            Set<String> tempSet = new HashSet<>();
            if (eventName.equalsIgnoreCase("ALL")) {
                tempSet.addAll(eventModel.getEventToFieldMap().get(event_name));
                etcmParameterHolder.put(event_name, tempSet);
            } else {
                tempSet.addAll(eventModel.getEventToFieldMap().get(eventName));
                etcmParameterHolder.put(eventName, tempSet);
                break;
            }
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Runnable#run()
     */
    @Override
    public void run() {
        readPatternFile();
    }

    /**
     * Read the existing events and its parameters.
     */
    private void readPatternFile() {
        try {
            Map<String, String> parameterValueMap = new LinkedHashMap<>();
            long threadId = Thread.currentThread().getId();
            File tempFile = new File(threadId + ".txt");
            PrintWriter printWriter = new PrintWriter(new FileWriter(tempFile));
            printWriter.println("# version information generated through ETCM configuration file.");
            printWriter.println(eventModel.getVersion());
            printWriter.flush();
            List<String> listOfLines = readFile(patternFile.getAbsolutePath());
            String eventName = "";
            for (int lineIndex = 0; lineIndex < listOfLines.size(); lineIndex++) {
                String fileLine = listOfLines.get(lineIndex);
                if (fileLine.contains("version")) {
                    continue;
                } else if (fileLine.startsWith("id")) {
                    eventName = fileLine.split("=")[1].trim();
                    printWriter.println(fileLine);
                    parameterValueMap.clear();
                } else if (fileLine.startsWith("set")) {
                    parameterValueMap.put(fileLine.split("=")[1].split(",")[0].trim(), fileLine);
                }
                if (!eventModel.getEventToFieldMap().containsKey(eventName)) {
                    if (!fileLine.startsWith("id")) {
                        printWriter.println(fileLine);
                        printWriter.flush();
                    }
                } else {
                    if (!checkSetParameterPresent(lineIndex, listOfLines)) {
                        etcmEventsUpdateInParrentFile(printWriter, parameterValueMap, eventName);
                        eventName = "";
                    }
                    if (!fileLine.startsWith("id") && !fileLine.startsWith("set")) {
                        printWriter.println(fileLine);
                        printWriter.flush();
                    }
                }
            }
            printWriter.flush();
            printWriter.close();
            // Delete the original file
            if (!patternFile.delete()) {
                System.out.println("Could not delete file");
            }
            // Rename the new file to the filename the original file had.
            if (!tempFile.renameTo(patternFile))
                System.out.println("Could not rename file");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param lineIndex
     * @param listOfLines
     * @return
     */
    public boolean checkSetParameterPresent(int lineIndex, List<String> listOfLines) {
        boolean flag = true;
        if (listOfLines.size() - 1 == lineIndex) {
            flag = false;
        } else {
            for (int index = lineIndex + 1; index < listOfLines.size(); index++) {
                String fileContain = listOfLines.get(index);
                if (fileContain.startsWith("set")) {
                    flag = true;
                    break;
                } else if (fileContain.startsWith("id")) {
                    flag = false;
                    break;
                } else {
                    flag = false;
                }
            }
        }
        return flag;
    }

    /**
     * This will update all the events parameters which is not present inside
     * pattern file.
     * 
     * @param printWriter
     * @param fileContainsEvents
     */
    private void etcmEventsUpdateInParrentFile(PrintWriter printWriter, Map<String, String> parameterValueMap,
            String eventName) {
        if (etcmParameterHolder.get(eventName).isEmpty()) {
            init(eventName);
        }
        if (parameterValueMap.isEmpty()) {
            for (String parmValue : etcmParameterHolder.get(eventName)) {
                printWriter.println("# Generated using ETCM configuration file.");
                printWriter.println(parmValue);
                printWriter.flush();
                etcmParameterHolder.get(eventName).remove(parmValue);
                break;
            }
        } else {
            boolean check = false;
            for (String param : etcmParameterHolder.get(eventName)) {
                String parameterName = param.split("=")[1].split(",")[0].trim();
                if (parameterValueMap.containsKey(parameterName)) {
                    check = true;
                    break;
                }
            }
            for (String patternParam : parameterValueMap.keySet()) {
                if (!check) {
                    for (String parmValue : etcmParameterHolder.get(eventName)) {
                        printWriter.println("# Generated using ETCM configuration file.");
                        printWriter.println(parmValue);
                        printWriter.flush();
                        etcmParameterHolder.get(eventName).remove(parmValue);
                        break;
                    }
                }
                printWriter.println(parameterValueMap.get(patternParam));
            }
        }
    }

    /*
     * Read the named file into a list of strings
     */
    public List<String> readFile(String fileName) {
        List<String> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.length() > 0) {
                    result.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
