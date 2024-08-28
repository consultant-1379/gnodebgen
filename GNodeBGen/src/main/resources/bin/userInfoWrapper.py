#!/usr/bin/python

''' ------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *---------------------------------------------------------------------------- '''


class userInput:

    data_source_name = None
    input_location = None
    intermediate_location = None
    isTopologyEnrichment = None
    topology_location = None
    rop_period = None
    no_of_batch = None
    isCompressed = None
    timeFormat = None
    uniqueRop = None
    startFromRop = None
    configured_no_of_rop = None
    fileNamePattern = None
    isTimeStampUpdate = None
    isStreaming = None
    main_file_processor_thread = None
    start_up_time = None
    firstRopTime = None
    runTimePreCookMode = False
    asr_specific_run = False
    nci_mapping_file_available = False
    isEventParamEnrichment = False
    isNetworkUpversionRequire = False
    isCellHandOverRequired = False

    new_rop_generation_time = []
    destinationAddress = []
    networkFunctionList = []
    cellHandOverEventIds = []

    requiredEPS = 0
    nodesInNetwork = 0
    streamerMainEngine = 1
    streamerFileReader = 1

    def __init__(self, data_source_name, input_location, intermediate_location, isTopologyEnrichment, \
                 topology_location, rop_period, no_of_batch, isCompressed, timeFormat, fileNamePattern, \
                 networkFunction, destinationAddress, main_file_processor_thread, \
                 start_up_time, isTimeStampUpdate=False, isStreaming=False, requiredEPS=0, nodesInNetwork=0):
        self.data_source_name = data_source_name.strip()
        self.input_location = input_location.strip()
        self.intermediate_location = intermediate_location.strip()
        self.isTopologyEnrichment = isTopologyEnrichment.strip()
        self.topology_location = topology_location.strip()
        self.rop_period = rop_period.strip()
        self.no_of_batch = no_of_batch.strip()
        self.isCompressed = isCompressed.strip()
        self.timeFormat = timeFormat.strip()
        self.fileNamePattern = fileNamePattern.strip()
        self.networkFunctionList = networkFunction
        self.isTimeStampUpdate = isTimeStampUpdate
        self.isStreaming = isStreaming
        self.requiredEPS = requiredEPS
        self.nodesInNetwork = nodesInNetwork
        self.destinationAddress = destinationAddress
        self.main_file_processor_thread = main_file_processor_thread
        self.start_up_time = start_up_time
        
        self.configured_no_of_rop = (int(self.no_of_batch) * 60) / int(self.rop_period)

    def get_data_source_name(self):
        return self.data_source_name

    def get_input_location(self):
        return self.input_location

    def get_intermediate_location(self):
        return self.intermediate_location

    def get_is_topology_enrichment(self):
        return self.isTopologyEnrichment

    def get_topology_location(self):
        return self.topology_location

    def get_rop_period(self):
        return self.rop_period

    def get_no_of_batch(self):
        return self.no_of_batch

    def get_is_compressed(self):
        return self.isCompressed

    def get_time_format(self):
        return self.timeFormat

    def get_unique_rop(self):
        return self.uniqueRop

    def get_start_from_rop(self):
        return self.startFromRop

    def get_configured_no_of_rop(self):
        return self.configured_no_of_rop

    def get_file_name_pattern(self):
        return self.fileNamePattern

    def get_is_time_stamp_update(self):
        return self.isTimeStampUpdate

    def get_is_streaming(self):
        return self.isStreaming

    def get_main_file_processor_thread(self):
        return self.main_file_processor_thread

    def get_start_up_time(self):
        return self.start_up_time

    def get_first_rop_time(self):
        return self.firstRopTime

    def get_run_time_pre_cook_mode(self):
        return self.runTimePreCookMode

    def get_asr_specific_run(self):
        return self.asr_specific_run

    def get_nci_mapping_file_available(self):
        return self.nci_mapping_file_available

    def get_is_event_param_enrichment(self):
        return self.isEventParamEnrichment

    def get_is_network_upversion_require(self):
        return self.isNetworkUpversionRequire

    def get_is_cell_hand_over_required(self):
        return self.isCellHandOverRequired

    def get_new_rop_generation_time(self):
        return self.new_rop_generation_time

    def get_destination_address(self):
        return self.destinationAddress

    def get_network_function_list(self):
        return self.networkFunctionList

    def get_cell_hand_over_event_ids(self):
        return self.cellHandOverEventIds

    def get_required_eps(self):
        return self.requiredEPS

    def get_nodes_in_network(self):
        return self.nodesInNetwork

    def get_streamer_main_engine(self):
        return self.streamerMainEngine

    def get_streamer_file_reader(self):
        return self.streamerFileReader

    def set_data_source_name(self, value):
        self.data_source_name = value

    def set_input_location(self, value):
        self.input_location = value

    def set_intermediate_location(self, value):
        self.intermediate_location = value

    def set_is_topology_enrichment(self, value):
        self.isTopologyEnrichment = value

    def set_topology_location(self, value):
        self.topology_location = value

    def set_rop_period(self, value):
        self.rop_period = value

    def set_no_of_batch(self, value):
        self.no_of_batch = value

    def set_is_compressed(self, value):
        self.isCompressed = value

    def set_time_format(self, value):
        self.timeFormat = value

    def set_unique_rop(self, value):
        self.uniqueRop = value

    def set_start_from_rop(self, value):
        self.startFromRop = value

    def set_configured_no_of_rop(self, value):
        self.configured_no_of_rop = value

    def set_file_name_pattern(self, value):
        self.fileNamePattern = value

    def set_is_time_stamp_update(self, value):
        self.isTimeStampUpdate = value

    def set_is_streaming(self, value):
        self.isStreaming = value

    def set_main_file_processor_thread(self, value):
        self.main_file_processor_thread = value

    def set_start_up_time(self, value):
        self.start_up_time = value

    def set_first_rop_time(self, value):
        self.firstRopTime = value

    def set_run_time_pre_cook_mode(self, value):
        if value:
            if value == 'YES':
                self.runTimePreCookMode = True

    def set_asr_specific_run(self, value):
        self.asr_specific_run = value

    def set_nci_mapping_file_available(self, value):
        self.nci_mapping_file_available = value

    def set_is_event_param_enrichment(self, value):
        self.isEventParamEnrichment = value

    def set_is_network_upversion_require(self, value):
        self.isNetworkUpversionRequire = value

    def set_is_cell_hand_over_required(self, value):
        self.isCellHandOverRequired = value

    def set_new_rop_generation_time(self, value):
        self.new_rop_generation_time = value

    def set_destination_address(self, value):
        self.destinationAddress = value

    def set_network_function_list(self, value):
        self.networkFunctionList = value

    def set_cell_hand_over_event_ids(self, value):
        if len(value) > 0:
            self.set_is_cell_hand_over_required(True)
            self.cellHandOverEventIds = value

    def set_required_eps(self, value):
        self.requiredEPS = value

    def set_nodes_in_network(self, value):
        self.nodesInNetwork = value

    def set_streamer_main_engine(self, value):
        self.streamerMainEngine = 1
        if value:
            if value.isdigit():
                value = int(value)
                if value > 0:
                    self.streamerMainEngine = value

    def set_streamer_file_reader(self, value):
        self.streamerFileReader = 1
        if value:
            if value.isdigit():
                value = int(value)
                if value > 0:
                    self.streamerFileReader = value
    
