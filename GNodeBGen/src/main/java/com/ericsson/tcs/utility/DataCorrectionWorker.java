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
package com.ericsson.tcs.utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;

/**
 * @author xjaimah
 *
 */
public class DataCorrectionWorker implements Runnable {

    /**
     * The outputLocation
     */
    private String outputLocation;

    /**
     * The fdnToFileList
     */
    private Map<String, List<String>> fdnToFileList;

    /**
     * The fdnList
     */
    private List<String> fdnList;

    /**
     * The gpbService
     */
    private GPBServices gpbService;

    /**
     * The decode
     */
    private DecoderService decode;

    /**
     * The encode
     */
    private EncoderService encode;
    
    /**
     * The ueTraceToNCIMap
     */
    private Map<Long, Long> ueTraceToNCIMap;

    /**
     * @param fdnList
     *            the fdnList to set
     */
    public void setFdnList(List<String> fdnList) {
        this.fdnList = fdnList;
    }

    /**
     * @param outputLocation
     *            the outputLocation to set
     */
    public void setOutputLocation(String outputLocation) {
        this.outputLocation = outputLocation;
    }

    /**
     * @param fdnToFileList
     *            the fdnToFileList to set
     */
    public void setFdnToFileList(Map<String, List<String>> fdnToFileList) {
        this.fdnToFileList = fdnToFileList;
    }

    @Override
    public void run() {
        gpbService = new GPBServices();
        decode = new DecoderService();
        encode = new EncoderService();
        FileReader file = new FileReader();
        for (String fdn : fdnList) {
            ueTraceToNCIMap = new HashMap<>();
            for (String fileLocation : fdnToFileList.get(fdn)) {
                startDataCorrection(fileLocation, file);
            }
        }
    }


    /**
     * This method will update nci value with the help of ue trace if nci is -1
     */
    private void startDataCorrection(String filePath, FileReader fileReader) {
        File file = new File(filePath);
        List<byte[]> eventList = fileReader.getFileEventList(file);
        Set<String> parameters = new HashSet<>();
        parameters.add(ConstantParameter.NCI);
        parameters.add(ConstantParameter.UE_TRACE_ID);
        List<byte[]> fileEvents = new ArrayList<byte[]>();
        for (byte[] event : eventList) {
            PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
            if(pmEventMessage.getGroupValue() != 1) {
                Map<String, Object> values = decode.getEventParamValue(pmEventMessage, parameters);
                if(null != values && values.containsKey(ConstantParameter.NCI)) {
                    long nciValue = (long) values.get(ConstantParameter.NCI);
                    long ue = decode.getByteStringToLong(pmEventMessage);
                    Map<String, Object> paramToEnrich = new HashMap<String, Object>();
                    if(nciValue != -1) {
                        ueTraceToNCIMap.put(ue, nciValue);
                        fileEvents.add(gpbService.write(pmEventMessage));
                    }else {
                        PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
                        if(ueTraceToNCIMap.containsKey(ue)) {
                            paramToEnrich.put(ConstantParameter.NCI, ueTraceToNCIMap.get(ue));
                            encode.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, paramToEnrich, null);
                        }
                        fileEvents.add(gpbService.write(pmEventMessageBuilder.build()));
                    }
                }else {
                    fileEvents.add(gpbService.write(pmEventMessage));
                }
            }else {
                fileEvents.add(gpbService.write(pmEventMessage));
            }
        }
        writeGBP(fileEvents, file.getName().replace(ConstantParameter.GZ_EXT, ""));
    }
    

    /**
     * This method will write data in GPB file at given location.
     * 
     * @param data
     * @param path
     */
    private void writeGBP(List<byte[]> data, String fileName) {
        FileOutputStream fileOuputStream = null;
        GZIPOutputStream gzOutput = null;
        try {
            fileOuputStream = new FileOutputStream(
                    outputLocation + File.separator + fileName + ConstantParameter.GZ_EXT);
            gzOutput = new GZIPOutputStream(fileOuputStream);
            for (byte[] dt : data) {
                gzOutput.write(dt);
            }
        } catch (IOException e) {
            System.out.println("Error while writing events into the files. " + e.getMessage());
        } finally {
            try {
                if (gzOutput != null) {
                    gzOutput.close();
                }
                if (fileOuputStream != null) {
                    fileOuputStream.close();
                }
            } catch (Exception e) {
                System.out.println("Error while closing file and output stream " + e.getMessage());
            }
        }
    }

}

