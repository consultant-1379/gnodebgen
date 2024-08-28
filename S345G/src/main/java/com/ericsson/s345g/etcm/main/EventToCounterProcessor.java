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

import java.io.File;
import java.io.FilenameFilter;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ericsson.s345g.etcm.autogen.Counter;
import com.ericsson.s345g.etcm.autogen.Counters;
import com.ericsson.s345g.etcm.autogen.Op;
import com.ericsson.s345g.etcm.model.EventToCounterModel;

/**
 * @author xjaimah
 *
 */
public class EventToCounterProcessor {

    /**
     * Location where event counter mapping files present.
     */
    private File[] etcmFiles;

    /**
     * Location where pattern files are present.
     */
    private File[] patternsFiles;

    /**
     * Initialize class level Parameters and call parse method.
     * 
     * @param inputParameters
     */
    public void init(String[] inputParameters) {
        try {
            etcmFiles = collectFiles(inputParameters[0], ".xml");
            patternsFiles = collectFiles(inputParameters[1], ".pat");
            if (null != etcmFiles || null != patternsFiles) {
                etcmFileParser();
            } else {
                System.out.println(
                        "ERROR: Please verify the input parameters. Input parameter 1. ETCM file location(Location where file present in xml format) 2. Pattern file location (Location where file present in pat format)");
            }
        } catch (CloneNotSupportedException ex) {
            System.out.println("ERROR: Could not able to clond etcm data model object. " + ex.getMessage());
            System.exit(1);
        }
    }

    /**
     * Collect all ETCM files from the given location.
     */
    public File[] collectFiles(String fileLocation, final String format) {
        File directory = new File(fileLocation);
        File[] collectedFiles = directory.listFiles(new FilenameFilter() {
            public boolean accept(File directory, String fileName) {
                return fileName.endsWith(format);
            }
        });
        return collectedFiles;
    }

    /**
     * Parse ETCM files.
     * 
     * @param etcmFiles
     * @throws CloneNotSupportedException
     */
    private void etcmFileParser() throws CloneNotSupportedException {
        EventToCounterModel eventModel = new EventToCounterModel();
        for (File etcmFile : etcmFiles) {
            try {
                JAXBContext jaxbContext = JAXBContext.newInstance(Counters.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                Counters etcmObject = (Counters) jaxbUnmarshaller.unmarshal(etcmFile);
                createEventModel(eventModel, etcmObject);
            } catch (JAXBException e) {
                System.out.println("ERROR: Could not able to parse file " + etcmFile.getName());
            }
        }
        processPatternFile(eventModel);
    }

    /**
     * Process all available pattern file and update event parameters as per ETCM
     * file.
     * 
     * @param eventModel
     * @throws CloneNotSupportedException
     */
    private void processPatternFile(EventToCounterModel eventModel) throws CloneNotSupportedException {
        int processInstance = Runtime.getRuntime().availableProcessors();
        if (patternsFiles.length < processInstance) {
            processInstance = patternsFiles.length;
        }
        ThreadPoolExecutor threadPoolTaskExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(processInstance);
        for (File patternFile : patternsFiles) {
            EventToCounterWorker eventCouterMapWorker = new EventToCounterWorker(
                    (EventToCounterModel) eventModel.clone(), patternFile);
            threadPoolTaskExecutor.submit(eventCouterMapWorker);
        }
        threadPoolTaskExecutor.shutdown();
        while (!threadPoolTaskExecutor.isTerminated()) {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("ERROR: Error while closing thread pool instances. " + e.getMessage());
            }
        }
    }

    /**
     * This method will merge all etcm file data.
     * 
     * @param eventModel
     * @param etcmObject
     */
    private void createEventModel(EventToCounterModel eventModel, Counters etcmObject) {
        String version = "version=" + etcmObject.getManagedFunction() + "," + etcmObject.getPmEventCommonVersion() + ","
                + etcmObject.getPmEventGroupVersion() + "," + etcmObject.getPmEventCorrectionVersion() + ","
                + etcmObject.getEtcmVersion() + "," + etcmObject.getEtcmCorrectionVersion();
        if (null == eventModel.getVersion()) {
            eventModel.setVersion(version);
        } else {
            eventModel.setVersion(eventModel.getVersion() + System.lineSeparator() + version);
        }
        for (Counter counter : etcmObject.getCounter()) {
            String eventName = counter.getPmeventname();
            if (!eventModel.getEventToFieldMap().containsKey(eventName)) {
                eventModel.getEventToFieldMap().put(eventName, new HashSet<String>());
            }
            if (null == counter.getCounterdata().getCounterstepcondition()) {
                continue;
            }
            eventModel.getEventToFieldMap().get(eventName).addAll(etcmEventsParameters(counter));
        }
    }

    /**
     * @param counter
     * @return
     */
    @SuppressWarnings("rawtypes")
    private Set<String> etcmEventsParameters(Counter counter) {
        Set<String> parameterValue = new HashSet<String>();
        switch (counter.getCounterdata().getCounterstepcondition().getOp().getName().toString().toLowerCase()) {
        case "and":
            String tempHolder = "";
            for (Object obj : counter.getCounterdata().getCounterstepcondition().getOp().getContent()) {
                if (obj instanceof Op) {
                    Op operator = (Op) obj;
                    if ("eq".equalsIgnoreCase(operator.getName().toString())) {
                        String elementName = ((JAXBElement) operator.getContent().get(0)).getValue().toString();
                        String elementValue = ((JAXBElement) operator.getContent().get(1)).getValue().toString();
                        tempHolder += "set = " + elementName + ", " + elementValue + System.lineSeparator();
                    }
                }
            }
            parameterValue.add(tempHolder);
            break;
        case "eq":
            String elementName = ((JAXBElement) counter.getCounterdata().getCounterstepcondition().getOp().getContent()
                    .get(0)).getValue().toString();
            String elementValue = ((JAXBElement) counter.getCounterdata().getCounterstepcondition().getOp().getContent()
                    .get(1)).getValue().toString();
            tempHolder = "set = " + elementName + ", " + elementValue + System.lineSeparator();
            parameterValue.add(tempHolder);
            break;
        }
        return parameterValue;
    }

    /**
     * @param inputParameters
     *            inputParameters[0] = ETCM Location inputParameters[1] = Pattern
     *            Location
     */
    public static void main(String[] inputParameters) {
        if (inputParameters.length != 2) {
            System.out.println(
                    "ERROR: input parameters not configured properly. Please provide ETCM file location and Pattern file location.");
            System.exit(1);
        }
        new EventToCounterProcessor().init(inputParameters);
        System.out.println("Successfully added ETCM parameters inside pattern files.");
    }
}
