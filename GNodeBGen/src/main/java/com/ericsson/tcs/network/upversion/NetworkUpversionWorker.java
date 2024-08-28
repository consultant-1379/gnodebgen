package com.ericsson.tcs.network.upversion;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent.Builder;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.controller.MainController;
import com.ericsson.tcs.enrichment.NetworkFunction;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.encoder.EncoderService;

/**
 * @author xjaimah
 *
 */
public class NetworkUpversionWorker implements Runnable{
    /**
     * The fileToProcess
     */
    private List<File> fileToProcess;
    /**
     * The networkFuncation
     */
    private String networkFuncation;
    /**
     * The gpbService
     */
    private GPBServices gpbService;
    /**
     * The encode
     */
    private EncoderService encode;
    /**
     * The fileReader
     */
    private FileReader fileReader;
    /**
     * This map will contain event attribute name as a key and value of that
     * attribute as an object, Value will be update inside event (PayLoad)
     * message.
     */
    private Map<String, Object> eventParameterMap;

    @Override
    public void run() {
        eventParameterMap = new HashMap<>();
        gpbService = new GPBServices();
        encode = new EncoderService();
        fileReader = new FileReader();
        for(File file : fileToProcess){
            processFile(file);
        }
    }
    /**
     * This method is use to process files and update newly added parameters.
     */
    private void processFile(File file){
        List<byte[]> events = fileReader.getFileEventList(file);
        List<byte[]> fileEvents = new ArrayList<byte[]>();
        for(byte[] event : events){
            PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
            PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
            if (MainController.config.isEventParamEnrichment()) {
                updateEventBuilderAndParameterMap(pmEventMessageBuilder);
                if (!MainController.getEnrichValues().getDefaultMap().isEmpty()) {
                    eventParameterMap.putAll(MainController.getEnrichValues().getDefaultMap());
                }
            }
            encode.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, getEventParameterMap());
            getEventParameterMap().clear();
            fileEvents.add(gpbService.write(pmEventMessageBuilder.build()));
        }
        writeGPBFile(fileEvents, file.getName());
    }
    /**
     * Write GPB file in intermediate location.
     * @param fileEvents
     */
    private void writeGPBFile(List<byte[]> fileEvents, String fileName) {

        FileOutputStream fileOuputStream = null;
        GZIPOutputStream gzOutput = null;
        try {
            fileOuputStream = new FileOutputStream(MainController.config.getIntermediate_location()
                    + File.separator + MainController.config.getData_source_name() + File.separator 
                    + MainController.config.getRop_period() + File.separator + networkFuncation + File.separator + fileName);
            if (fileName.endsWith(ConstantParameter.GZ_EXT)){
                gzOutput = new GZIPOutputStream(fileOuputStream);
                for (byte[] dt : fileEvents) {
                    gzOutput.write(dt);
                }
            } else {
                for (byte[] dt : fileEvents) {
                    fileOuputStream.write(dt);
                }
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

    /**
     * @param pmEventMessageBuilder
     */
    private void updateEventBuilderAndParameterMap(Builder pmEventMessageBuilder) {
        if (MainController.getEnrichValues().getNf().containsKey(networkFuncation)) {
            NetworkFunction nf = MainController.getEnrichValues().getNf().get(networkFuncation);
            pmEventMessageBuilder.setEtcmCorrectionVersion(nf.getEtcm_correction_version());
            pmEventMessageBuilder.setEtcmVersion(nf.getEtcm_version());
            pmEventMessageBuilder.setPmEventCommonVersion(nf.getPm_event_common_version());
            pmEventMessageBuilder.setPmEventCorrectionVersion(nf.getPm_event_correction_version());
            pmEventMessageBuilder.setPmEventGroupVersion(nf.getPm_event_group_version());
        }
        if (MainController.getEnrichValues().getEventSpecificEnrichMent()
                .containsKey(pmEventMessageBuilder.getEventId())) {
            getEventParameterMap().putAll(MainController.getEnrichValues().getEventSpecificEnrichMent()
                    .get(pmEventMessageBuilder.getEventId()).getEventSpecificProperties());
        }
    }

    /**
     * @return the fileToProcess
     */
    public List<File> getFileToProcess() {
        return fileToProcess;
    }

    /**
     * @param fileToProcess the fileToProcess to set
     */
    public void setFileToProcess(List<File> fileToProcess) {
        this.fileToProcess = fileToProcess;
    }

    /**
     * @return the networkFuncation
     */
    public String getNetworkFuncation() {
        return networkFuncation;
    }

    /**
     * @param networkFuncation the networkFuncation to set
     */
    public void setNetworkFuncation(String networkFuncation) {
        this.networkFuncation = networkFuncation;
    }

    /**
     * @return the eventParameterMap
     */
    public Map<String, Object> getEventParameterMap() {
        return eventParameterMap;
    }

    /**
     * @param eventParameterMap the eventParameterMap to set
     */
    public void setEventParameterMap(Map<String, Object> eventParameterMap) {
        this.eventParameterMap = eventParameterMap;
    }

}
