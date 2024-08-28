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
 *------------------------------------------------------------------------------*/

package com.ericsson.tcs.config.wrapper;

import java.util.List;

public class UserConfig {

    private String input_location;
    private String data_source_name;
    private String intermediate_location;
    private String rop_period;
    private String topology_location;
    private String timeFormat;
    private String fileNamePattern;
    private String main_file_processor_thread;
    private String start_up_time;
    private String isTopologyEnrichment;
    private String isCompressed;

    private boolean asr_specific_run;
    private boolean isTimeStampUpdate;
    private boolean isStreaming;
    private boolean isCellHandOverRequired;

    private int requiredEPS;
    private int nodesInNetwork;
    private int configured_no_of_rop;
    private int totalRop;

    private List<String> networkFunctionList;
    private List<String> ropList;
    private List<String> new_rop_generation_time;
    private List<Long> cellHandOverEventIds;

    private boolean isEventParamEnrichment;
    private boolean isNetworkUpversionRequire;
    
    public boolean isCellHandOverRequired() {
        return isCellHandOverRequired;
    }

    public List<Long> getCellHandOverEventIds() {
        return cellHandOverEventIds;
    }

    public void setCellHandOverEventIds(List<Long> cellHandOverEventIds) {
        this.cellHandOverEventIds = cellHandOverEventIds;
    }

    public boolean isNetworkUpversionRequire() {
       return isNetworkUpversionRequire;
    }

    public boolean isAsr_specific_run() {
       return asr_specific_run;
    }

    public void setAsr_specific_run(boolean asr_specific_run) {
        this.asr_specific_run = asr_specific_run;
    }

    /**
     * @return the isTimeStampUpdate
     */
    public boolean isTimeStampUpdate() {
        return isTimeStampUpdate;
    }

    /**
     * @return the isStreaming
     */
    public boolean isStreaming() {
        return isStreaming;
    }

    /**
     * @return the requiredEPS
     */
    public int getRequiredEPS() {
        return requiredEPS;
    }

    /**
     * @param requiredEPS
     *            the requiredEPS to set
     */
    public void setRequiredEPS(String requiredEPS) {
        this.requiredEPS = Integer.parseInt(requiredEPS);
    }

    /**
     * @return the nodesInNetwork
     */
    public int getNodesInNetwork() {
        return nodesInNetwork;
    }

    /**
     * @param nodesInNetwork
     *            the nodesInNetwork to set
     */
    public void setNodesInNetwork(String nodesInNetwork) {
        this.nodesInNetwork = Integer.parseInt(nodesInNetwork);
    }

    public List<String> getNetworkFunctionList() {
        return networkFunctionList;
    }

    public void setNetworkFunctionList(List<String> networkFunctionList) {
        this.networkFunctionList = networkFunctionList;
    }

    public int getConfigured_no_of_rop() {
        return configured_no_of_rop;
    }

    public void setConfigured_no_of_rop(String configured_no_of_rop) {
        this.configured_no_of_rop = Integer.parseInt(configured_no_of_rop);
    }

    /**
     * @return the ropList
     */
    public List<String> getRopList() {
        return ropList;
    }

    /**
     * @param ropList
     *            the ropList to set
     */
    public void setRopList(List<String> ropList) {
        this.ropList = ropList;
    }

    /**
     * @return the totalRop
     */
    public int getTotalRop() {
        return totalRop;
    }

    /**
     * @param totalRop
     *            the totalRop to set
     */
    public void setTotalRop(String totalRop) {
        this.totalRop = Integer.parseInt(totalRop);
    }

    /**
     * @return the input_location
     */
    public String getInput_location() {
        return input_location;
    }

    /**
     * @param input_location
     *            the input_location to set
     */
    public void setInput_location(String input_location) {
        this.input_location = input_location;
    }

    /**
     * @return the data_source_name
     */
    public String getData_source_name() {
        return data_source_name;
    }

    /**
     * @param data_source_name
     *            the data_source_name to set
     */
    public void setData_source_name(String data_source_name) {
        this.data_source_name = data_source_name;
    }

    /**
     * @return the isTopologyEnrichment
     */
    public String getIsTopologyEnrichment() {
        return isTopologyEnrichment;
    }

    /**
     * @param isTopologyEnrichment
     *            the isTopologyEnrichment to set
     */
    public void setIsTopologyEnrichment(String isTopologyEnrichment) {
        this.isTopologyEnrichment = isTopologyEnrichment;
    }

    /**
     * @return the intermediate_location
     */
    public String getIntermediate_location() {
        return intermediate_location;
    }

    /**
     * @param intermediate_location
     *            the intermediate_location to set
     */
    public void setIntermediate_location(String intermediate_location ) {
        this.intermediate_location = intermediate_location;
    }

    /**
     * @return the isCompressed
     */
    public String getIsCompressed() {
        return isCompressed;
    }

    /**
     * @param isCompressed
     *            the isCompressed to set
     */
    public void setIsCompressed(String isCompressed) {
        this.isCompressed = isCompressed;
    }

    /**
     * @return the rop_period
     */
    public int getRop_period() {
       return Integer.parseInt(rop_period);
    }

    /**
     * @param rop_period
     *            the rop_period to set
     */
    public void setRop_period(String rop_period) {
        this.rop_period = rop_period;
    }

    /**
     * @return the topology_location
     */
    public String getTopology_location() {
        return topology_location;
    }

    /**
     * @param topology_location
     *            the topology_location to set
     */
    public void setTopology_location(String topology_location) {
        this.topology_location = topology_location;
    }

    /**
     * @return the timeFormat
     */
    public String getTimeFormat() {
        return timeFormat;
    }

    /**
     * @param timeFormat
     *            the timeFormat to set
     */
    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getFileNamePattern() {
        return fileNamePattern;
    }

    public void setFileNamePattern(String fileNamePattern) {
        this.fileNamePattern = fileNamePattern;
    }

    public int getMain_file_processor_thread() {
        return Integer.parseInt(main_file_processor_thread);
    }

    public void setMain_file_processor_thread(String main_file_processor_thread) {
        this.main_file_processor_thread = main_file_processor_thread;
    }

    public int getStart_up_time() {
        return Integer.parseInt(start_up_time);
    }

    public void setStart_up_time(String start_up_time) {
        this.start_up_time = start_up_time;
    }

    public List<String> getNew_rop_generation_time() {
        return new_rop_generation_time;
    }

    public void setNew_rop_generation_time(List<String> new_rop_generation_time) {
        this.new_rop_generation_time = new_rop_generation_time;
    }

    /**
     * @return the isEventParamEnrichment
     */
    public boolean isEventParamEnrichment() {
        return isEventParamEnrichment;
    }
}
