#!/usr/bin/python

'''
Created on Jul 18, 2019

@author: xmanabh
'''
from _collections import defaultdict
import json, sys, os
from time import time, sleep

from ArgumentGenerator import ArgumentGenerator
from ArgumentJsonEncoder import ArgumentJsonEncoder
from utils import Utility

util = Utility()

scriptLocation = os.path.realpath(__file__)

configLocation = os.path.join(os.path.dirname(os.path.dirname(scriptLocation)), 'config')

if not os.path.dirname(configLocation):
    util.printStatement('ERROR', 'Config location ' + configLocation + ' not present.', True)

topology_file_list_location = os.path.join(configLocation, 'input_topology_file_list.json')
inputFileListJson = os.path.join(configLocation, 'input_file_list.json')
streamerArgsJson = os.path.join(configLocation, 'streamerArgs.json')

intermediateLocationMap = defaultdict(list)
serObjects = []
argsMap = {}

noOfMainEngine = 1
mainEngOverride = False
rop_period = 15 * 60
invoke_epoch_time = 0
first_rop_time = 0


def getIntermediateLocations():
    global intermediateLocationMap
    locations = []
    for serObject in serObjects:
        locations.append(serObject.get_intermediate_location())
    if locations:
        locations = list(set(locations))
        for location in locations:
            for simDir in filter(None, os.listdir(location)):
                for networkFnDir in filter(None, os.listdir(os.path.join(location, simDir, '15'))):
                    intermediateLocationMap[networkFnDir].append(os.path.join(location, simDir, '15', networkFnDir))
        if len(intermediateLocationMap.keys()) > 0:
            for key, values in intermediateLocationMap.iteritems():
                temp_list = list(set(values))
                intermediateLocationMap[key] = temp_list
        else:
            util.printStatement('ERROR', 'Data producer is not running. Please check the tool status.', True)
    else:
        util.printStatement('ERROR', 'Data producer is not running. Please check the tool status.', True)


def getSerObjectList():
    global serObjects
    serObjects = util.loadSerializedFileData(os.path.dirname(configLocation))
    if not serObjects:
        util.printStatement('ERROR', 'No data source object available in SER file.', True)


def getCurrentEpochTime():
    global invoke_epoch_time
    invoke_epoch_time = int(time())


def getEpochTimeForFirstRop():
    global first_rop_time
    first_rop_time = serObjects[0].get_first_rop_time()
    while (first_rop_time - invoke_epoch_time) < (rop_period / 3):
        first_rop_time += rop_period
    util.printStatement('INFO', 'Data stream will start from ROP : ' + str(first_rop_time))


def fetchNodeDetails():
    neList = None
    if os.path.isfile(topology_file_list_location):
        neList = parseNeFromJsonFileList(topology_file_list_location, 'TOPO_LIST')
    elif os.path.isfile(inputFileListJson):
        neList = parseNeFromJsonFileList(inputFileListJson, 'INPUT_LIST')
    else:
        util.printStatement('ERROR', 'No file available to fetch node information. Terminating process.', True)
    return list(set(neList))


def parseNeFromJsonFileList(inputJson, fileType):
    ''' nodeList = [ node_1, node_2, ...] '''
    try:
        nodeList = []
        with open(inputJson, 'r') as f:
            if fileType == 'TOPO_LIST':
                nodeList = [topo_filename.split('.')[0].split('=')[1].split('_')[0] for topo_filename in json.load(f)]
            elif fileType == 'INPUT_LIST':
                import re
                for d_source, loc_map in json.load(f).iteritems():
                    for location, nf_map in loc_map.iteritems():
                        for nf, files in nf_map.iteritems():
                            for file in files:
                                elements = re.split(',|_', file)
                                for element in elements:
                                    if element.startswith('ManagedElement') or element.startswith('MeContext'):
                                        nodeList.append(element.split('=')[-1])
                                        break
                            break
                        break
                    break
        if not nodeList:
            util.printStatement('ERROR',
                                'Not able to generate node list. Perhaps, Topology/Input data missing or invalid file name. Terminating process.')
            sys.exit()
        return nodeList
    except Exception as e:
        util.printStatement('ERROR',
                            'Issue in reading ' + inputJson + ' file for fetching node information. Terminating process.')
        raise e
        sys.exit(1)


def callStreamControllerInstance():
    for id in range(noOfMainEngine):
        os.system(
            'python ' + os.path.join(os.path.dirname(scriptLocation), 'streamProcessor.py') + ' "mainEngineId=' + str(
                id) + '" &')
        sleep(0.5)
    sleep(3)


def generateArgsMap():
    global argsMap, noOfMainEngine

    if not mainEngOverride:
        noOfMainEngine = serObjects[0].get_streamer_main_engine()

    fileReaderPerMainEngine = serObjects[0].get_streamer_file_reader()
    destAddress, epsPerNode = serObjects[0].get_destination_address(), serObjects[0].get_required_eps()
    isRunTimePreCook = serObjects[0].get_run_time_pre_cook_mode()

    startProcessor = True

    noOfDestination = len(destAddress)

    if noOfDestination > noOfMainEngine:
        startProcessor = False

    mod = (noOfMainEngine % noOfDestination)

    if mod != 0:
        startProcessor = False

    if not startProcessor:
        util.printStatement('ERROR', 'No of main engine should be equal or multiple of destination. Terminating process.')
        sys.exit(1)

    nodeList = [[] for _ in range(noOfMainEngine)]

    counter = 0
    for node in fetchNodeDetails():
        if counter >= noOfMainEngine:
            counter = 0
        nodeList[counter].append(node)
        counter += 1

    destCounter = 0

    for id in range(noOfMainEngine):
        if destCounter >= len(destAddress):
            destCounter = 0
        streamerArg = ArgumentGenerator(isRunTimePreCook, fileReaderPerMainEngine, intermediateLocationMap,
                                        nodeList[id], first_rop_time, epsPerNode, [destAddress[destCounter]])
        streamrArgString = json.loads(ArgumentJsonEncoder().encode(streamerArg))
        argsMap['mainEngineId=' + str(id)] = streamrArgString
        destCounter += 1

    with open(streamerArgsJson, 'w') as argJson:
        json.dump(argsMap, argJson, indent=4)
        argJson.flush()

def tcp_retry():
    os.system('sh tcp_retrieve.sh')

def main(args):
    tcp_retry()
    global noOfMainEngine, mainEngOverride
    if len(args) > 0:
        mainEngOverride = True
        noOfMainEngine = int(args[0].strip().replace(' ', ''))
    getCurrentEpochTime()
    getSerObjectList()
    getEpochTimeForFirstRop()
    getIntermediateLocations()
    generateArgsMap()
    callStreamControllerInstance()


if __name__ == '__main__':
    main(sys.argv[1:])

