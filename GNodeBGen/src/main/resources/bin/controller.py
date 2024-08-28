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

import ConfigParser
import json
import os
import sys
import xml.etree.ElementTree as XML_TREE
from _collections import defaultdict
from math import ceil
from time import time

from userInfoWrapper import userInput

from utils import Utility

util = Utility()

HOUR = 60
currentDirectory, isTopoEnrichment, topologyLocation = None, None, None
configFileLocation, appConfigLocation = None, None
streaming, isTimeStampUpdate = False, False
generateEPS, total_nodes_in_network = -1, -1
objectParamList = []
first_execution = None
os_version = ''
inputFileMap = defaultdict(lambda: defaultdict(lambda: defaultdict(list)))
inputTopologyList = []
inputFileList = 'input_file_list.json'
inputTopoFileList = 'input_topology_file_list.json'

CRON_FORMAT = '{CRON_TIMING} {SCRIPT_NAME} {EXTRA_ARGS}>> {LOG_FILE_WITH_LOCATION} 2>&1'
CRON_TIMING_MAP = {'FILE_BASED': {'controller.py': '7,22,37,52 * * * *', 'ropMaintenance.sh': '*/15 * * * *',
                                  'pmFileDistributor.py': '*/15 * * * *'}, \
                   'STREAM_BASED': {'controller.py': '2,17,32,47 * * * *', 'ropMaintenance.sh': '*/15 * * * *'}}
CRON_SCRIPT_MAPPING = {'controller.py': 'pmEventGenerator.log', 'ropMaintenance.sh': 'removelogs.log',
                       'pmFileDistributor.py': 'pmFileDistributor.log'}


def generateFileListInJson(Object, fileName):
    with open(os.path.join(os.path.dirname(configFileLocation), fileName), 'w') as f:
        json.dump(Object, f, indent=4)


''' This method return the count of common nodes available in all network function's 1st ROP of input data,
    when topology enrichment is off.
'''


def getNodeCount():
    global total_nodes_in_network
    status, firstObject = False, objectParamList[0]
    dataStore, file = None, os.path.join(os.path.dirname(configFileLocation), inputFileList)
    with open(file, 'r') as f:
        dataStore = json.load(f)
    common_node_list, firstRop = [], None
    folderList = dataStore[firstObject.get_data_source_name()][firstObject.get_input_location()].keys()
    for folder in folderList:
        if folder.upper() in firstObject.get_network_function_list():
            for file in dataStore[firstObject.get_data_source_name()][firstObject.get_input_location()][folder]:
                if not firstRop:
                    firstRop = file[0:14]
            temp_list = list(set([file.split('=')[-1].split('_celltracefile')[0] for file in
                                  dataStore[firstObject.get_data_source_name()][firstObject.get_input_location()][
                                      folder] if file.startswith(firstRop)]))
            if common_node_list:
                common_node_list = list(set(common_node_list) & set(temp_list))
            else:
                common_node_list = temp_list
    total_nodes_in_network = len(common_node_list)
    if total_nodes_in_network > 0:
        util.printStatement('INFO', 'Input file node count : ' + str(total_nodes_in_network))
        status = True
    else:
        util.printStatement('ERROR', 'No common nodes found in first Rop data.')
    return status


''' This method validate the config.ini parameters for streaming aspects.
'''


def validateStreamingParameters():
    global generateEPS

    if generateEPS.isdigit():
        generateEPS = int(generateEPS)
    else:
        util.printStatement('ERROR', 'Required EPS can not be string value.')
        return False

    if generateEPS < 0:
        util.printStatement('ERROR', 'Required EPS can not be Negative')
        return False

    elif generateEPS >= 0:
        if isTopoEnrichment == 'YES':
            generateEPS = ceil((generateEPS * 1.0) / (len(inputTopologyList) * 1.0))
        else:
            status = getNodeCount()
            if not status:
                return status
            generateEPS = ceil((generateEPS * 1.0) / (total_nodes_in_network * 1.0))

    return True


def reConfigureObjectParameter():
    global objectParamList
    for dataSourceObject in objectParamList:
        dataSourceObject.set_is_streaming(streaming)
        dataSourceObject.set_required_eps(generateEPS)
        if isTopoEnrichment != 'YES':
            dataSourceObject.set_nodes_in_network(total_nodes_in_network)


def read_app_config_file():
    global is_network_upversion
    config = ConfigParser.ConfigParser()
    config.read(appConfigLocation)
    main_thread = (config.get("FILE_PROCESSOR", "FILE_PROCESSOR_INSTANCE")).strip()
    start_up_time = (config.get("FILE_PROCESSOR", "FIRST_ROP_DELAY_FACTOR")).strip()
    mainEngineCount = (config.get("STREAM_PROCESSOR", "NO_OF_MAIN_ENGINE")).strip()
    fileReaderPerMainEngine = (config.get("STREAM_PROCESSOR", "FILE_READER_PER_MAIN_ENGINE")).strip()
    asr_specific_run = (config.get("TOOL_CRITERIA", "RUN_WITH_BEST_MATCH_TOPOLOGY")).strip().upper() == 'YES'
    is_network_upversion = (config.get("NETWORK_UP_VERSION_PARAM",
                                       "NETWORK_UP_VERSION_ENABLE")).strip().upper() == 'YES'

    nci_mapping_file_available = False
    if asr_specific_run:
        nci_mapping_file_available = (config.get("TOOL_CRITERIA",
                                                 "NCI_MAPPING_FILE_AVAILABLE")).strip().upper() == 'YES'

    if main_thread == "" or start_up_time == "":
        util.printStatement('ERROR',
                            'File processor configure not properly. Please refer config.ini inside config location.',
                            True)
    elif not main_thread.isdigit() or not start_up_time.isdigit():
        util.printStatement('ERROR',
                            'config file is not configured properly. Please refer app_config.ini inside config location.',
                            True)
    return main_thread, start_up_time, mainEngineCount, fileReaderPerMainEngine, asr_specific_run, nci_mapping_file_available, is_network_upversion


''' This method parse config.ini file and set UserConfig object.
'''


def parserInputConfigFile():
    util.printStatement('INFO', 'Parsing and validating data of ' + configFileLocation + ' file.')
    global objectParamList, topologyLocation, isTopoEnrichment, streaming, generateEPS, isTimeStampUpdate, total_nodes_in_network
    main_thread, start_up_time, mainEngineCount, fileReaderPerMainEngine, asr_specific_run, nci_mapping_file_available, is_net_up_ver = read_app_config_file()
    xml_elements = XML_TREE.parse(configFileLocation).getroot()
    batchPeriod, destinationAddress, cellHOEventList = None, [], []
    for sources in xml_elements.getchildren():
        if sources.tag == 'GenericInfo':
            isEventParamEnrichment = (sources.find('isEventParamEnrichment').text).strip().upper() == 'YES'
            isTopoEnrichment = (sources.find('isTopologyEnrichment').text).strip().upper()
            topologyLocation = (sources.find('TopologyFileLocation').text).strip()
            runTimePreCookMode = (sources.find('runTimePreCookMode').text).strip().upper()
            batchPeriod = (sources.find('BatchTimeInHours').text).strip()
            if (sources.find('isStreamingRequired').text).strip().upper() == 'YES':
                streaming = True
                destinationAddress = (sources.find('destinationAddress').text).strip().split(',')
            if (sources.find('isTimeStampUpdate').text).strip().upper() == 'YES':
                isTimeStampUpdate = True
            generateEPS = (sources.find('requiredEPS').text).strip()
            total_nodes_in_network = (sources.find('nodesInNetwork').text).strip()
            if (sources.find('isCellHandOverRequired').text).strip().upper() == 'YES':
                cellHOEventList = (sources.find('cellHandOverEventIds').text).strip().split(',')
        elif sources.tag == 'DataSources':
            for source in sources.getchildren():
                for info in source.getchildren():
                    dataSource = source.get('name').strip()
                    if dataSource:
                        if validateUserInputConf(dataSource, info, topologyLocation, isTopoEnrichment, batchPeriod):
                            userConf = userInput(source.get('name'), info.find('InputFileLocation').text, \
                                                 info.find('IntermediateLocation').text, isTopoEnrichment, \
                                                 topologyLocation, info.find('ROPTime').text, \
                                                 batchPeriod, info.find('isCompressed').text, \
                                                 info.find('OutputTZ').text, info.find('FileNamePattern').text, \
                                                 (info.find('SupportedNetworkFunction').text).upper().split(','), \
                                                 destinationAddress, main_thread, start_up_time, isTimeStampUpdate, \
                                                 False, -1, -1)
                            userConf.set_streamer_main_engine(mainEngineCount)
                            userConf.set_streamer_file_reader(fileReaderPerMainEngine)
                            userConf.set_run_time_pre_cook_mode(runTimePreCookMode)
                            userConf.set_asr_specific_run(asr_specific_run)
                            userConf.set_nci_mapping_file_available(nci_mapping_file_available)
                            userConf.set_is_event_param_enrichment(isEventParamEnrichment)
                            userConf.set_is_network_upversion_require(is_net_up_ver)
                            userConf.set_cell_hand_over_event_ids([ x.strip() for x in cellHOEventList])
                            objectParamList.append(userConf)
                        else:
                            util.printStatement('ERROR', 'UserInput validation failed for ' + dataSource)
                    else:
                        util.printStatement('ERROR', 'Please provide DataSource name.', True)
    generateFileListInJson(inputFileMap, inputFileList)
    if isTopoEnrichment == 'YES':
        generateFileListInJson(inputTopologyList, inputTopoFileList)
    if streaming:
        if not validateStreamingParameters():
            util.printStatement('ERROR', 'Correction needed in user_input.xml file', True)
    else:
        if not total_nodes_in_network.isdigit():
            util.printStatement('ERROR', 'Total number of node count in network can not be string value.', True)
        else:
            total_nodes_in_network = int(total_nodes_in_network)
    reConfigureObjectParameter()
    util.printStatement('INFO', 'Parsing and validation of ' + configFileLocation + ' file has been completed.')


def validateInputLocation(d_src, location, type):
    inputFolderList, foundFile = [], False
    if not location or not os.path.isdir(location):
        util.printStatement('ERROR', 'Invalid ' + type + ' location provided. Skipping data source ' + d_src + '.')
    else:
        if type.lower() == 'input':
            inputFolderList = [folder for folder in filter(None, os.listdir(location)) if
                               os.path.isdir(os.path.join(location, folder))]
            if inputFolderList:
                for folder in inputFolderList:
                    fileList = [file for file in filter(None, os.listdir(os.path.join(location, folder))) if
                                file.endswith('gpb.gz') or file.endswith('gz')]
                    if fileList:
                        global inputFileMap
                        inputFileMap[d_src][location][folder] = fileList
                        foundFile = True
                    else:
                        util.printStatement('WARNING',
                                            'No ' + type + ' file found at location ' + os.path.join(location,
                                                                                                     folder) + ' for sim ' + d_src)
            else:
                util.printStatement('ERROR',
                                    'No directory found at input location ' + location + '. Skipping simulation ' + d_src)
        elif type.lower() == 'topology':
            fileList = filter(None, [file for file in os.listdir(location) if file.endswith('.json')])
            if fileList:
                global inputTopologyList
                inputTopologyList += fileList
                inputTopologyList = list(set(inputTopologyList))

                ''' THIS CODE LOOKS SUSPICIOUSE '''
                inputFolderList = list(set(inputFolderList))
                ''' UP TO HERE '''

                foundFile = True
            else:
                util.printStatement('ERROR',
                                    'No ' + type + ' files present at location ' + location + '. Skipping data source ' + d_src + '.')
    return foundFile


def validateIntegerValues(src, value, input):
    if value and value.isdigit():
        return True
    else:
        if input.lower() == 'rop':
            util.printStatement('ERROR', 'Please provide proper ROP Interval. Skipping data source ' + src + '.')
        elif input.lower() == 'batch':
            util.printStatement('ERROR', 'Please provide proper Batch value. Skipping data source ' + src + '.')
    return False


def validateUserInputConf(src, configObject, topoLoc, topoEnr, batchCount):
    inputDir = (configObject.find('InputFileLocation').text).strip()
    if not validateInputLocation(src, inputDir, 'input'):
        return False
    if topoEnr == 'YES':
        if not validateInputLocation(src, topoLoc, 'topology'):
            return False
    rop_period = (configObject.find('ROPTime').text).strip()
    if not validateIntegerValues(src, rop_period, 'rop'):
        return False
    if not validateIntegerValues(src, batchCount, 'batch'):
        return False
    extension = (configObject.find('isCompressed').text).strip()
    if extension.upper() != 'YES' and extension.upper() != 'NO':
        util.printStatement('ERROR',
                            'isCompression tag value should be either "YES" or "NO". Skipping data source ' + src + '.')
        return False
    timeZone = (configObject.find('OutputTZ').text).strip()
    if timeZone.upper() != 'LOCAL' and timeZone.upper() != 'UTC':
        util.printStatement('ERROR',
                            'OutputTZ tag value should be either "UTC" or "LOCAL". Skipping data source ' + src + '.')
        return False
    interLocation = (configObject.find('IntermediateLocation').text).strip()
    if not os.path.isdir(interLocation):
        os.makedirs(interLocation)
        os.chmod(interLocation, 0755)
    return True


def getCommonFileList(object):
    file = os.path.join(os.path.dirname(configFileLocation), inputFileList)
    dataStore = None
    fileListMap = {}
    with open(file, 'r') as f:
        dataStore = json.load(f)
    folderList = dataStore[object.get_data_source_name()][object.get_input_location()].keys()
    for networkFn in object.get_network_function_list():
        found = False
        for folder in folderList:
            if networkFn == folder.upper():
                found = True
                fileListMap[networkFn] = list(set([file[0:14] for file in dataStore[object.get_data_source_name()][
                    object.get_input_location()][folder]]))
                break
        if not found:
            util.printStatement('ERROR',
                                'Folder for network function ' + networkFn + ' not available.\nSkipping process for network function ' + networkFn + ' for simulation ' + object.get_data_source_name())
            object.set_network_function_list(object.get_network_function_list().pop(networkFn))
    commonFileSetList = []
    for networkFn in object.get_network_function_list():
        if not commonFileSetList:
            commonFileSetList = fileListMap[networkFn]
        else:
            commonFileSetList = list(set(commonFileSetList) & set(fileListMap[networkFn]))
    return sorted(commonFileSetList)


def createBatchIndex():
    global objectParamList
    rop_list = ropListCreator(objectParamList[0])
    for obj in objectParamList:
        if first_execution:
            obj.set_first_rop_time(util.convertRopTimeStamptToEpoch(sorted(rop_list)[0]))
        obj.set_new_rop_generation_time(rop_list)
        uniqueRopList = getCommonFileList(obj)
        if not uniqueRopList:
            util.printStatement('ERROR',
                                'No common rop found in input location for simulation ' + obj.get_data_source_name() + '. Skipping Rop generation for simulation')
        if not os.path.isfile(util.get_ser_file_location(os.path.dirname(currentDirectory))):
            obj.set_unique_rop(uniqueRopList)
            obj.set_start_from_rop(0)


def findCurrentDirectory(name):
    global currentDirectory, configFileLocation, appConfigLocation
    currentDirectory = os.path.dirname(os.path.realpath(__file__))
    configFileLocation = os.path.join(os.path.dirname(currentDirectory), 'config', 'user_input.xml')
    appConfigLocation = os.path.join(os.path.dirname(currentDirectory), 'config', 'config.ini')


def ropListCreator(obj):
    global first_execution
    start_up_time, rop_time = int(obj.get_start_up_time()), int(obj.get_rop_period())
    rop_to_create = (int(obj.get_no_of_batch()) * HOUR) / rop_time
    intermediate_location = os.path.join(obj.get_intermediate_location(), obj.get_data_source_name(),
                                         obj.get_rop_period(), obj.get_network_function_list()[0])
    firstEpochTime = int(time())
    extraSeconds = firstEpochTime % (rop_time * 60)
    if first_execution:
        epochTime = firstEpochTime - extraSeconds + (start_up_time * rop_time * 60) + (rop_time * 60)
        return createRopList(epochTime, rop_to_create, rop_time)
    else:
        intermediate_rop = filter(None, os.listdir(intermediate_location))
        if len(intermediate_rop) < rop_to_create:
            latest_new_start_rop_epoch = util.convertRopTimeStamptToEpoch(
                sorted(obj.get_new_rop_generation_time())[-1]) + (rop_time * 60)
            rop_super_set = createRopList(latest_new_start_rop_epoch, (rop_to_create - len(intermediate_rop)), rop_time)
            return [rop for rop in rop_super_set if rop not in intermediate_rop]
        else:
            sys.exit()


def createRopList(epochTime, rop_to_create, rop_time):
    return [util.convertEpochToRopTimeFormat(epochTime + (rop * rop_time * 60)) for rop in range(rop_to_create)]


def remove_cron_job():
    try:
        util.printStatement('INFO', 'Backing up existing cron entries.')
        shell_command = 'crontab -l | grep -v "#" | egrep -v "'
        for scrp_name in CRON_SCRIPT_MAPPING.keys():
            shell_command += currentDirectory + util.PATH_SEP + scrp_name + util.PIPE_SEP
        shell_command = shell_command[:-1] + '" > ' + util.BACKUP_CRON_PATH
        util.run_shell_command(shell_command)
        util.printStatement('INFO', 'Backup of cron entries successful.')
    except Exception as x:
        util.printStatement('ERROR', 'Exception while taking backup of cron entries. Terminating tool process.')
        sys.exit(1)


def add_cron_job(support_type, cron_args):
    try:
        thisScriptLogs = os.path.dirname(currentDirectory) + util.PATH_SEP + 'logs'

        if os.path.isfile(util.BACKUP_CRON_PATH):
            shell_command = ''
            for scrp_name in cron_args:

                cron_time = CRON_TIMING_MAP[support_type][scrp_name]
                scrp_path = currentDirectory + util.PATH_SEP + scrp_name
                scrp_log_path = thisScriptLogs + util.PATH_SEP + CRON_SCRIPT_MAPPING[scrp_name]

                shell_command += 'echo "' + CRON_FORMAT.replace('{CRON_TIMING}', cron_time).replace('{SCRIPT_NAME}',
                                                                                                    scrp_path).replace(
                    '{LOG_FILE_WITH_LOCATION}', scrp_log_path) + '"'

                if scrp_name == 'ropMaintenance.sh':
                    shell_command = shell_command.replace('{EXTRA_ARGS}',
                                                          objectParamList[0].get_intermediate_location() + ' ')
                else:
                    shell_command = shell_command.replace('{EXTRA_ARGS}', '')

                shell_command += ' >> ' + util.BACKUP_CRON_PATH + ';'

            shell_command = shell_command[:-1]
            util.run_shell_command(shell_command)

            shell_command = 'crontab ' + util.BACKUP_CRON_PATH
            util.run_shell_command(shell_command)

            util.printStatement('INFO', 'Cron set up has been completed successfully.')

        else:
            util.printStatement('ERROR',
                                'Back up cron file ' + util.BACKUP_CRON_PATH + ' not found. Terminating tool process.')
            sys.exit(1)

    except Exception as x:
        util.printStatement('ERROR', 'Exception while setting up new cron entries. Terminating tool process.')
        sys.exit(1)


def setCronJob():
    serFirstObj = objectParamList[0]

    remove_cron_job()

    # network up version is enable
    if is_network_upversion == True:
        util.printStatement('INFO', 'No cron entries required to set for existing tool configuration.')
    # run time precook ENABLE and streaming is OFF/ file based solution ON
    elif serFirstObj.get_run_time_pre_cook_mode() and not streaming:
        add_cron_job('FILE_BASED', ['controller.py', 'pmFileDistributor.py', 'ropMaintenance.sh'])

    # run time precook ENABLE and streaming is ON/ file based solution OFF
    elif serFirstObj.get_run_time_pre_cook_mode() and streaming:
        add_cron_job('STREAM_BASED', ['controller.py', 'ropMaintenance.sh'])

    # run time precook DISABLE and streaming is OFF/ file based solution ON
    elif not serFirstObj.get_run_time_pre_cook_mode() and not streaming:
        add_cron_job('FILE_BASED', ['pmFileDistributor.py'])

    # run time precook DISABLE and streaming is ON/ file based solution OFF
    elif not serFirstObj.get_run_time_pre_cook_mode() and streaming:
        util.printStatement('INFO', 'No cron entries required to set for existing tool configuration.')
        util.printStatement('INFO', 'Cron set up has been completed successfully.')


def main(script_name):
    global objectParamList, first_execution
    findCurrentDirectory(script_name)
    if not os.path.isfile(util.get_ser_file_location(os.path.dirname(currentDirectory))):
        first_execution = True
        parserInputConfigFile()
        execution_status = 0
        if isTopoEnrichment == 'YES' and objectParamList:
            if objectParamList[0].get_asr_specific_run():   #RUN_WITH_BEST_MATCH_TOPOLOGY = YES
                if not objectParamList[0].get_nci_mapping_file_available(): #NCI_MAPPING_FILE_AVAILABLE = NO
                    execution_status = os.system('python ' + os.path.join(currentDirectory,
                                                                          'topologyParser.py') + ' "' + topologyLocation + '" "MAP_NCI"')
            else:
                execution_status = os.system(
                    'python ' + os.path.join(currentDirectory, 'topologyParser.py') + ' "' + topologyLocation + '"')
        if execution_status != 0:
            util.printStatement('ERROR', 'Issue(s) found while running topology parser module.')
            sys.exit(1)
    else:
        first_execution = False
        objectParamList = util.loadSerializedFileData(os.path.dirname(currentDirectory))
    if objectParamList:
        createBatchIndex()
        util.createSerializedObjectFile(os.path.dirname(currentDirectory), objectParamList)
        if os_version == 'windows':
            os.system('C:/Python27/python ' + os.path.join(currentDirectory, 'dataProcessor.py'))
        else:
            os.system('python ' + os.path.join(currentDirectory, 'dataProcessor.py'))
        if first_execution:
            util.printStatement('INFO', 'Setting up cron entries as per tool configuration.')
            setCronJob()


if __name__ == '__main__':
    main(sys.argv[0])

