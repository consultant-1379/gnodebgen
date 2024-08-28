#!/usr/bin/python

from datetime import datetime, timedelta

import json
import os
import time
import random
from utils import Utility
from _collections import defaultdict

util = Utility()

ROP_TIME = '15'
pms_path = '/pms_tmpfs'
cell_trace_info = '/netsim_users/pms/etc/.celltrace_info.json'

ROP_TIME_SEC = int(ROP_TIME) * 60
no_of_node_to_handle_in_batch = 4
file_copy_counter = 0
sleep_range = (0.75, 1.25)
is_first_sim = True
sleep_enable = True

toolRootLocation = os.path.dirname(os.path.dirname(os.path.realpath(__file__)))

utcTimeFormat, utcTimeSeconds, newRopName = None, None, None
nextRop = None

deletion_path = []
mounted_location_list = []
serInterRopList = []

dataStore = {}
sim_name_map = defaultdict(lambda: defaultdict(list))
result_map = defaultdict(lambda: defaultdict(lambda: defaultdict()))

serObjects = []


def processDataForSimulation(comp_key, intermediate_sim_path, nfList, node_list):
    global deletion_path, sim_name_map
    keyElements = comp_key.split('|')
    sim_name, node_type = keyElements[0], keyElements[1]
    for network_fn in nfList:
        fullpath = os.path.join(intermediate_sim_path, network_fn)
        rop_list = [dir for dir in filter(None, os.listdir(fullpath))]
        firstRop = None
        if nextRop is None:
            for date_dir in rop_list:
                if utcTimeFormat == date_dir:
                    firstRop = utcTimeFormat
                    deletion_path.append(os.path.join(fullpath, date_dir))
                elif utcTimeFormat.split('.')[0] > date_dir.split('.')[0]:
                    deletion_path.append(os.path.join(fullpath, date_dir))
                elif utcTimeFormat.split('.')[0] == date_dir.split('.')[0]:
                    if utcTimeFormat.split('.')[1] > date_dir.split('.')[1]:
                        deletion_path.append(os.path.join(fullpath, date_dir))
            if firstRop is None:
                util.printStatement('ERROR', 'No Intermediate ROP matching with required ROP name : ' + utcTimeFormat + '.')
                continue
        else:
            firstRop = serInterRopList[nextRop]
        fullpath = os.path.join(fullpath, firstRop)
        if not os.path.isdir(fullpath):
            util.printStatement('ERROR', 'Intermediate repetitive ROP ' + firstRop + ' not found to copy for ROP : ' + utcTimeFormat + '.')
            continue
        fileList = filter(None, os.listdir(fullpath))
        if len(fileList) < 1:
            util.printStatement('ERROR', 'No PM Events file present in ' + fullpath + '. Skipping Network function ' + network_fn + ' for sim ' + sim_name)
            continue
        input_node_file_count = len(fileList)
        if '{REPLACE_FDN}' not in fileList[0]:
            for node_file in fileList:
                node_name = node_file.split('_')[-1].split('.')[0]
                if node_name in node_list:
                    sim_name_map[comp_key + '|' + network_fn][node_name].append(os.path.join(fullpath, node_file))
        else:
            counter = 0
            for pms_node in node_list:
                if counter >= input_node_file_count:
                    counter = 0
                sim_name_map[comp_key + '|' + network_fn][pms_node].append(os.path.join(fullpath, fileList[counter]))
                counter += 1


def validateInformation():
    """ sim_name_map = sim_name|nodeType|NetworkFuntion : { node_name : [file with file_path] }}  """
    mounted_sim_list = [os.path.join(inter_location, sim_dir) for inter_location in mounted_location_list for sim_dir in
                        filter(None, os.listdir(inter_location))]
    if not mounted_sim_list:
        util.printStatement('ERROR', 'No simulation directory present at any of the intermediate location . Exiting process.', True)
    if not os.path.isdir(pms_path):
        util.printStatement('ERROR', pms_path + ' not available. Why to worry, please contact SIMNET team.', True)
    if not util.started_node_file:
        util.printStatement('ERROR', util.started_node_file + ' file not available.', True)
    for compo_key in dataStore.keys():
        sim_name = compo_key.split('|')[0]
        mounted_location, found = '', False
        for dir in mounted_sim_list:
            if sim_name == os.path.basename(dir):
                mounted_location, found = dir, True
                break
        if not found:
            util.printStatement('ERROR', 'Directory of simulation ' + sim_name + ' is not present in intermediate location. Skipping pm execution for this sim.')
            continue
        path = os.path.join(mounted_location, ROP_TIME)
        networkFnList = []
        if os.path.isdir(path):
            networkFnList.extend([dir for dir in filter(None, os.listdir(path))])
        else:
            util.printStatement('ERROR', 'Directory ' + path + ' not present. Skipping pm processing for sim ' + sim_name)
            continue
        if not networkFnList:
            util.printStatement('ERROR', 'No Network Function directory present at location ' + path + '. Skipping pm processing for sim ' + sim_name)
            continue
        if not os.path.isdir(os.path.join(pms_path, sim_name)):
            util.printStatement('ERROR', 'Simulation directory ' + os.path.join(pms_path, sim_name) + ' not present. Skipping pm execution for ' + sim_name)
            continue
        pms_node_list = filter(None, os.listdir(os.path.join(pms_path, sim_name)))
        started_node_list = util.getStartedNodeListForSim(sim_name)
        common_node_list = set(pms_node_list) & set(started_node_list)
        if not common_node_list:
            util.printStatement('WARNING', 'No node started for simulation ' + sim_name + ', Skipping pm execution for simulation.')
            continue
        del started_node_list[:], pms_node_list[:]
        events_path_list = dataStore[compo_key]
        if not events_path_list:
            util.printStatement('ERROR', 'PM Events path not available in json file for sim ' + sim_name + '. Skipping pm processing for this sim.')
            continue
        processDataForSimulation(compo_key, path, networkFnList, common_node_list)


def rest_for_some_time():
    if sleep_enable:
        sleep_time = random.uniform(sleep_range[0], sleep_range[1])
        time.sleep(sleep_time)


def moveFilesBySimulation(comp_key, param_map):
    global is_first_sim, file_copy_counter
    compKeyElement = comp_key.split('|')
    sim_name, node_type, networkFn = compKeyElement[0], compKeyElement[1], compKeyElement[2]
    util.printStatement('INFO', 'Copying files for network Function ' + networkFn + ' for sim ' + sim_name)
    validation_map = {}
    real_event_path = ''

    if is_first_sim:
        is_first_sim = False
        rest_for_some_time()

    for path in dataStore[sim_name + '|' + node_type]:
        if networkFn in path.replace('/', '').split('_'):
            real_event_path = path.replace('/', '')
            break
    try:
        pm_data_path = os.path.join(pms_path, sim_name, '{REPLACE_NODE_PATH}', real_event_path)
        for node, files in param_map.iteritems():
            event_data_path = pm_data_path.replace('{REPLACE_NODE_PATH}', node)
            if not os.path.isdir(event_data_path):
                os.makedirs(event_data_path)
                os.chmod(event_data_path, 0755)
            maniFestFileName = os.path.basename(files[0]).split('_')[0] + '_Trace.manifest'
            if nextRop is not None:
                maniFestFileName = newRopName + '_Trace.manifest'
            with open(os.path.join(event_data_path, maniFestFileName), 'w') as f:
                for file in files:
                    destFile = os.path.basename(file)
                    if nextRop is not None:
                        oldTimeFormat = destFile.split('_')[0]
                        destFile = destFile.replace(oldTimeFormat, newRopName)
                    if '{REPLACE_FDN}' in destFile:
                        destFile = destFile.replace('{REPLACE_FDN}', networkFn + '1_1_1')
                    else:
                        destFile = destFile.replace(node, networkFn + '1_1_1')
                    validation_map[node + '|' + file] = util.copyFileFromSourceToDest(file, os.path.join(event_data_path, destFile))
                    f.write('./' + destFile + '\n')
                    destFile = destFile.replace('1_1_1', '1_3_1')
                    validation_map[node + '|' + file] = util.copyFileFromSourceToDest(file, os.path.join(event_data_path, destFile))
                    f.write('./' + destFile + '\n')
                    f.flush()
            file_copy_counter += 1
            if file_copy_counter >= no_of_node_to_handle_in_batch:
                file_copy_counter = 0
                rest_for_some_time()
    except Exception as e:
        util.printStatement('ERROR', 'Exception while copying file')
        util.printStatement('ERROR', str(e))
    finally:
        return validation_map


def collect_result(result_one, result_two):
    global result_map
    composite_key = result_one
    for node_with_file, status in result_two.iteritems():
        splitted_values = node_with_file.split('|')
        result_map[composite_key][splitted_values[0]][splitted_values[1]] = status


def copyNodeFiles():
    for comp_key, value_map in sim_name_map.iteritems():
        collect_result(comp_key, moveFilesBySimulation(comp_key, value_map))


def read_json_file():
    global dataStore
    if os.path.isfile(cell_trace_info):
        with open(cell_trace_info, 'r') as sim_info:
            dataStore = json.load(sim_info)


def deleteProcessedDirectories():
    global deletion_path
    deletion_path = list(set(deletion_path))
    del deletion_path[:]
    for dir in deletion_path:
        if not util.removeDirectory(dir):
            util.printStatement('ERROR', 'Not able to delete directory ' + dir)


def getIntermediateLocations():
    global mounted_location_list
    for object in serObjects:
        mounted_location_list.append(object.get_intermediate_location())
    mounted_location_list = list(set(mounted_location_list))


def validateForRepetitiveRopGeneration():
    global nextRop, serInterRopList, newRopName
    configFolder = toolRootLocation + '/config'
    serInterRopList = serObjects[0].get_new_rop_generation_time()
    if not serObjects[0].get_run_time_pre_cook_mode():
        utcRopEndTimeSeconds = utcTimeSeconds + timedelta(seconds=ROP_TIME_SEC)
        newRopName = 'A' + utcTimeFormat + '-' + utcRopEndTimeSeconds.strftime('%H%M')
        for f in filter(None, os.listdir(configFolder)):
            if f.startswith('.nextRopIndex_'):
                nextRop = int(f.split('_')[1]) + 1
                if nextRop >= len(serInterRopList):
                    nextRop = 0
                os.remove(configFolder + '/' + f)
                break
        if nextRop is None:
            nextRop = 0
        nextRopIndexFile = configFolder + '/.nextRopIndex_' + str(nextRop)
        with open(nextRopIndexFile, 'w') as fout:
            pass


def getSerObjects():
    global serObjects
    serObjects = util.loadSerializedFileData(toolRootLocation)
    if len(serObjects) == 0:
        util.printStatement('ERROR', 'No serialize objects found.', True)


def main():
    global utcTimeFormat, utcTimeSeconds

    utcTimeSeconds = datetime.utcfromtimestamp((int(time.time()) / ROP_TIME_SEC) * ROP_TIME_SEC)
    utcTimeFormat = utcTimeSeconds.strftime('%Y%m%d.%H%M')

    getSerObjects()
    read_json_file()
    getIntermediateLocations()
    validateForRepetitiveRopGeneration()
    validateInformation()
    copyNodeFiles()
    deleteProcessedDirectories()


if __name__ == '__main__':
    main()

