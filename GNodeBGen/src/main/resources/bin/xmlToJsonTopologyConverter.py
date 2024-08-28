#!/usr/bin/python

from _collections import defaultdict
import json
from multiprocessing import Pool, cpu_count
import os, sys
from traceback import print_exc

from ElementWrapper import ElementWrapper
from nodeDetailEncoder import NodeDetailEncoder
from utils import Utility
import xml.etree.ElementTree as XML_TREE

util = Utility()

xml_topology_file_path = None
json_topology_file_path = None

topology_input_file_list = []
validation_map = {}
networkFunctionList = ['NRCellDU', 'NRCellCU']
gnbFunctionList = ['GNBCUCPFunction', 'GNBCUUPFunction', 'GNBDUFunction']


def generateFinalMap(node, inputMap, jsonFile):
    try:
        dict_keys = inputMap.keys()
        finalMap = {'networkElement' : 'NetworkElement=' + node , \
                    'moMap' : {'ManagedElement' : json.loads(NodeDetailEncoder().encode(inputMap['ManagedElement']))} }
        for gnbFunction in gnbFunctionList:
            if gnbFunction in inputMap:
                finalMap['moMap'][gnbFunction] = []
                for x in json.loads(NodeDetailEncoder().encode(inputMap[gnbFunction])):
                    finalMap['moMap'][gnbFunction].append(x)
                for key in dict_keys:
                    if '|' in key and key.split('|')[-1] == gnbFunction:
                        for y in json.loads(NodeDetailEncoder().encode(inputMap[key])):
                            finalMap['moMap'][gnbFunction].append(y)
        with open(jsonFile , 'w') as f:
            json.dump(finalMap, f, indent=4)
    except Exception as e:
        print_exc()

    
def parseXmlTopologyFile(xmlFile, jsonFile):
    try:
        objectDictionary = defaultdict(list)
        node_name, swVersion, timeZone = None, 'NULL', 'GB-Eire'
        model = XML_TREE.parse(xmlFile).getroot()
        for moTag in model.getchildren():
            fdnLastElementMo = moTag.attrib['fdn'].split(',')[-1].split('=')[0]
            if fdnLastElementMo == 'ManagedElement':
                elementWrp = ElementWrapper()
                elementWrp.set_mo_fdn(moTag.attrib['fdn'])
                for attribute in moTag.getchildren():
                    attributeName = attribute.attrib['name']
                    if attributeName == 'userLabel':
                        node_name = attribute.text
                    elif attributeName == 'swVersion':
                        swVersion = attribute.text
                    elif attributeName == 'neTimeZone':
                        timeZone == attribute.text
                elementWrp.set_attribute_map({'neTimeZone' : timeZone, 'swVersion' : swVersion})
                objectDictionary['ManagedElement'].append(elementWrp)
            elif fdnLastElementMo in gnbFunctionList:
                gnbId, gnbLength, plmnList = 0, 22, []
                elementWrp = ElementWrapper()
                elementWrp.set_mo_fdn(moTag.attrib['fdn'])
                for attribute in moTag.getchildren():
                    attributeName = attribute.attrib['name']
                    if attributeName == 'gNBId':
                        gnbId = attribute.text
                    elif attributeName == 'gNBIdLength':
                        gnbLength = attribute.text
                    elif attributeName == 'pLMNIdList':
                        for seq in attribute.getchildren():
                            for item in seq.getchildren():
                                if item.tag == 'item':
                                    element = item.text.split(':')
                                    plmnList.append({'mcc' : element[0], 'mnc' : element[1]})
                if not plmnList:
                    elementWrp.set_attribute_map({'gNBId' : gnbId, 'gNBIdLength' : gnbLength})
                else:
                    elementWrp.set_attribute_map({'gNBId' : gnbId, 'gNBIdLength' : gnbLength, 'pLMNIdList' : plmnList})
                objectDictionary[fdnLastElementMo].append(elementWrp)
            elif fdnLastElementMo in networkFunctionList:
                cellId, nCi, plmnList = 0, 0, []
                parentMo = moTag.attrib['fdn'].split(',')[-2].split('=')[0]
                compositeKey = fdnLastElementMo + '|' + parentMo
                if parentMo not in objectDictionary:
                    elementWrp = ElementWrapper()
                    elementWrp.set_mo_fdn(','.join([ str for str in moTag.attrib['fdn'].split(',')[:-1] ]))
                    elementWrp.set_attribute_map({'gNBId' : 0, 'gNBIdLength' : 22})
                    objectDictionary[parentMo].append(elementWrp)
                elementWrp = ElementWrapper()
                elementWrp.set_mo_fdn(moTag.attrib['fdn'])
                for attribute in moTag.getchildren():
                    attributeName = attribute.attrib['name']
                    if attributeName == 'cellLocalId':
                        cellId = attribute.text
                    elif attributeName == 'nCI':
                        nCi == attribute.text
                    elif attributeName == 'pLMNIdList':
                        for seq in attribute.getchildren():
                            for item in seq.getchildren():
                                for struct in item.getchildren():
                                    valueMap = {}
                                    for att in struct.getchildren():
                                        valueMap[att.attrib['name'].lower()] = att.text
                                    plmnList.append(valueMap)
                if int(objectDictionary[parentMo][0].get_attribute_map()['gNBId']) != 0 and int(cellId) == 0:
                    cellId = moTag.attrib['fdn'].split('-')[-1]
                if not plmnList:
                    elementWrp.set_attribute_map({'cellLocalId' : cellId, 'nCI' : nCi})
                else:
                    elementWrp.set_attribute_map({'cellLocalId' : cellId, 'nCI' : nCi, 'pLMNIdList' : plmnList})
                objectDictionary[compositeKey].append(elementWrp)
        generateFinalMap(node_name, objectDictionary, jsonFile)
    except Exception as e:
        print_exc()


def getInstanceCount():
    topology_file_count = len(topology_input_file_list)
    process_count = 1
    
    if cpu_count() == 4:
        process_count = 2
    elif cpu_count() > 4:
        process_count = int(cpu_count() / 2)
    
    if topology_file_count < process_count:
        process_count = topology_file_count
    
    return process_count


def generateJsonTopologyFromXmlTopology():
    instance_count = getInstanceCount()
    instance = Pool(instance_count)
    for xmlFile in topology_input_file_list:
        jsonFileName = xmlFile.replace('.xml', '.json')
        instance.apply_async(parseXmlTopologyFile, args=(xmlFile, os.path.join(json_topology_file_path, os.path.basename(jsonFileName)),))
    instance.close()
    instance.join()
    

def getInputTopologyFileList():
    global topology_input_file_list
    topology_input_file_list = [ os.path.join(xml_topology_file_path, file) for file in filter(None, os.listdir(xml_topology_file_path)) if file.endswith('.xml') ]
    if not topology_input_file_list:
        util.printStatement('ERROR', 'No input topology file available at location ' + xml_topology_file_path, True)
    

def main(args):
    if not len(args) == 2:
        util.printStatement('ERROR', 'Please provide input xml and output json topology location.', True)
    
    global xml_topology_file_path, json_topology_file_path
    xml_topology_file_path = args[0].strip()
    json_topology_file_path = args[1].strip()
    
    if not os.path.isdir(xml_topology_file_path):
        util.printStatement('ERROR', 'Input topology location not available.', True)
    
    if not os.path.isdir(json_topology_file_path):
        os.makedirs(json_topology_file_path)
        os.chmod(json_topology_file_path, 0755)

    getInputTopologyFileList()
    generateJsonTopologyFromXmlTopology()


if __name__ == '__main__':
    main(sys.argv[1:])
