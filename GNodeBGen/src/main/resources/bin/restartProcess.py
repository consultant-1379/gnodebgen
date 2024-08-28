#!/usr/bin/python
import os, sys, shutil

from utils import Utility


interMediateLocationList = []
EXCLUDE_FILE_LIST = ['user_input.xml', 'config.ini', 'asnParamConfig.csv', 'eventAdditionConfig.ini']
EXCLUDE_FOLDER_LIST = [ 'EVENT_PARAM_ENRICHMENT']
bin_directory = None
CONFIG_FILEPATH = None
CONFIG_INI = None

util = Utility()

def deleteData():
    for directory in list(set(interMediateLocationList)):
        if not util.removeDirectory(directory):
            util.printStatement('ERROR', 'Unable to delete intermediate directory ' + directory + '. Kindly try to delete it manually.')
    for file in filter(None, os.listdir(os.path.dirname(CONFIG_FILEPATH))):
        file_with_path = os.path.join(os.path.dirname(CONFIG_FILEPATH), file)
        if os.path.isfile(file_with_path):
            if file not in EXCLUDE_FILE_LIST:
                os.remove(file_with_path)
        elif os.path.isdir(file_with_path):
            if file not in EXCLUDE_FOLDER_LIST:
                shutil.rmtree(file_with_path)


def findInterMediateLocation():
    global interMediateLocationList
    import xml.etree.ElementTree as XML_TREE
    xml_elements = XML_TREE.parse(CONFIG_FILEPATH).getroot()
    for sources in xml_elements.getchildren():
        for source in sources.getchildren():
            for info in source.getchildren():
                interMediateLocationList.append(info.find('IntermediateLocation').text)


def findCurrentDirectory(name):
    global bin_directory, CONFIG_FILEPATH, SER_FILEPATH, CONFIG_INI
    bin_directory = os.path.dirname(os.path.realpath(__file__))
    CONFIG_FILEPATH = os.path.join(os.path.dirname(bin_directory), 'config', 'user_input.xml')
    CONFIG_INI = os.path.join(os.path.dirname(bin_directory), 'config', 'config.ini')


def triggerControllerScript():
    os.system('python ' + os.path.join(bin_directory, 'controller.py'))


def set_parameters():
    global EXCLUDE_FILE_LIST
    asr_run, nci_map_file_available, is_extrapolation = False, False, False
    with open(CONFIG_INI, 'r') as f:
        for line in f:
            if line.startswith('RUN_WITH_BEST_MATCH_TOPOLOGY'):
                asr_run = line.split('=')[1].strip().upper() == 'YES'
                EXCLUDE_FILE_LIST.append('input_node_info.json')
            if line.startswith('NCI_MAPPING_FILE_AVAILABLE'):
                nci_map_file_available = line.split('=')[1].strip().upper() == 'YES'
            if line.startswith('EXTRAPOLATE_NES_FROM_TOPOLOGY'):
                is_extrapolation = line.split('=')[1].strip().upper() == 'YES'
        if asr_run:
            if is_extrapolation and nci_map_file_available:
                util.printStatement('ERROR', 'Can not support Ne Extrapolation with Nci map file availability.')
                sys.exit()
            elif nci_map_file_available:
                EXCLUDE_FILE_LIST.extend(['enriched_node_info.json', 'inputFileToTopologyMapping.json', \
                                              'input_topology_file_list.json', 'nci_mapping.json'])


def main(script_name):
    util.printStatement('INFO', 'Clean up process started.')
    findCurrentDirectory(script_name)
    findInterMediateLocation()
    set_parameters()
    deleteData()
    util.printStatement('INFO', 'Clean up process completed.')
    util.printStatement('INFO', 'Restarting Tool.')
    triggerControllerScript()
    util.printStatement('INFO', 'Tool Restarted.')


if __name__ == '__main__':
    main(sys.argv[0])

