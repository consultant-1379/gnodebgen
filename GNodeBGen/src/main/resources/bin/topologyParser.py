#!/usr/bin/python

from _collections import defaultdict
from multiprocessing import Pool, cpu_count
import sys, os, json, math, copy
from traceback import print_exc

from cellWrapper import CellWrapper
from networkFunctionWrapper import NetworkFunctionWrapper
from nodeDetailEncoder import NodeDetailEncoder
from nodeWrapper import NodeWrapper
from utils import Utility
import xml.etree.ElementTree as XML_TREE

util = Utility()

# Locations
scriptDirectory = None
configFile = None
conf_ini = None
topologyLocation = None
topologyFileList = None

# On Memory collection objects
''' input_data_store (JSON Object) --> Stored Input files Event's topology information '''
input_data_store = None

''' result_map = { topology_file_name_1 (String) : [ object_1 (nodeWrapper), error_with_topology_1 (boolean) ], ... } '''
result_map = {}

''' topology_nci_map = { unique_nci_count_topology (Integer) : [ fdn_1, fdn_7, ... (String) ], ... } '''
topology_nci_map = defaultdict(list)

''' input_data_nci_map = { unique_nci_count_input_data (Integer) : [ fdn_1, fdn_5, ... (String) ], ...} '''
input_data_nci_map = defaultdict(list)

''' nci_based_input_to_topo_map = { topo_fdn_1 (String) : input_fdn_9 (String) , ...} '''
nci_based_input_to_topo_map = {}

''' nci_to_nci_map = { topo_fdn (String) : { input_data_nci (Int/Long) : topology_nci (Int/Long) }, ...} '''
nci_to_nci_map = defaultdict(lambda: defaultdict())

''' networkElementList = [ nodeWrapper_1, nodeWrapper_2, ... (nodeWrapper Objects)] '''
networkElementList = []

gnb_function_id_map = {'GNBCUUPFunction': 'gNBCUUPFunctionId', 'GNBCUCPFunction': 'gNBCUCPFunctionId',
                       'GNBDUFunction': 'gNBDUFunctionId'}

input_ne_list = []

# Booleans
callThroughController = False
nci_session_mapping = False
errorFound = False

# Other variables
fileProcessInstance = 1

# File Name Variables
node_details = 'enriched_node_info.json'
topologyMapFile = 'inputFileToTopologyMapping.json'
topologyFileJson = 'input_topology_file_list.json'
input_node_info = 'input_node_info.json'
nci_mapping_file = 'nci_mapping.json'
nr_ne_name_format = 'SubNetwork=ONRM_ROOT_MO_R,MeContext=NR<ne_id>gNodeBRadio<index>'


# XML TREE Object
xmlElements = None

'''
This script can support below things
1. Best match without extrapolation of data <--- Customer data scenario (extrapolate_ne = False)
2. Extrapolate input data using topology <-- Simulated data, here required that topology should have \
   matching cells with input data. topology count >= input ne count. (extrapolate_ne = True)
'''
extrapolate_ne = False


def filterTopologyFiles():
    global topologyFileList
    topologyFileList = [file for file in filter(None, os.listdir(topologyLocation)) if file.endswith('.json')]
    if not topologyFileList:
        util.printStatement('ERROR', 'No JSON Topology found at location ' + topologyLocation + '. Exiting process.',
                            True)
    file = os.path.join(os.path.dirname(configFile), topologyFileJson)
    with open(file, 'w') as f:
        json.dump(topologyFileList, f, indent=2)


def findScriptDirectory():
    global scriptDirectory, configFile, conf_ini
    scriptDirectory = os.path.realpath(__file__)
    configFile = os.path.join(os.path.dirname(os.path.dirname(scriptDirectory)), 'config', 'user_input.xml')
    conf_ini = os.path.join(os.path.dirname(configFile), 'config.ini')
    if not os.path.isfile(configFile) or not os.path.isfile(conf_ini):
        util.printStatement('ERROR', 'Configuration file ' + configFile + ' or ' + conf_ini + ' not found. Can not parse Topology Data.',
                            True)


def findTopologyLocation():
    location = (xmlElements.find('GenericInfo').find('TopologyFileLocation').text).strip()
    if location:
        return location
    else:
        util.printStatement('ERROR', 'Topology location string can not be empty.', True)


def generateTopologyToNodeMapping():
    inputNodeToTopologyMap = defaultdict(lambda: defaultdict(list))
    dataStore, dataSource = None, None
    if callThroughController:
        file = os.path.join(os.path.dirname(configFile), 'input_file_list.json')
        with open(file, 'r') as f:
            dataStore = json.load(f)
    for src in xmlElements.find('DataSources').getchildren():
        dataSource = src.get('name').strip()
        # nodeList = util.getStartedNodeListForSim(src.get('name').strip())
        # if not nodeList:
        # util.printStatement('ERROR', 'No nodes are started for simulation ' + src.get('name').strip() + '. Terminating process.', True)
        for info in src.getchildren():
            inputLocation = (info.find('InputFileLocation').text).strip()
            supportedNfList = (info.find('SupportedNetworkFunction').text).upper().split(',')
            nfFolderList, fileList = [], []
            if callThroughController:
                nfFolderList = [nf for nf in dataStore[dataSource][inputLocation] if nf.upper() in supportedNfList]
                for nf in dataStore[dataSource][inputLocation]:
                    fileList += dataStore[dataSource][inputLocation][nf]
            else:
                nfFolderList = [nf for nf in filter(None, os.listdir(inputLocation)) if nf.upper() in supportedNfList]
                fileList = [file for file in filter(None, os.listdir(os.path.join(inputLocation, nfFolderList[0]))) if
                            file.endswith('gpb.gz') or file.endswith('.gz')]
            uniqueInputNodeSet = []
            for node in fileList:
                uniqueInputNodeSet.append(('_'.join(node.split('_')[1:])).split('_celltracefile')[0])
            uniqueInputNodeSet = list(set(uniqueInputNodeSet))
            index = 0
            uniqueNodeLen = len(uniqueInputNodeSet)
            for object in networkElementList:
                topoFdn = object['_NodeWrapper__managedElement']
                # if topoFdn in nodeList:
                if index == uniqueNodeLen:
                    index = 0
                inputNodeToTopologyMap[dataSource][uniqueInputNodeSet[index]].append(topoFdn)
                index += 1
    file = os.path.join(os.path.dirname(configFile), topologyMapFile)
    if not nci_session_mapping:
        with open(file, 'w') as f:
            json.dump(inputNodeToTopologyMap, f, indent=2)
    else:
        ''' temp_map = { dataSource (String) : { input_fdn (String} : [topo_fdn (String), ...]}, ...} '''
        temp_map = defaultdict(lambda: defaultdict(list))
        for topo_ne, input_ne in nci_based_input_to_topo_map.iteritems():
            temp_map[dataSource][input_ne].append(topo_ne)
        with open(file, 'w') as f:
            json.dump(temp_map, f, indent=2)


def identifyProcessCount():
    global fileProcessInstance
    if cpu_count() == 4:
        fileProcessInstance = 2
    elif cpu_count() > 4:
        fileProcessInstance = 4

    if fileProcessInstance > len(topologyFileList):
        fileProcessInstance = len(topologyFileList)


def collect_result(result):
    global result_map
    result_map[result[0]] = [result[1], result[2]]


def validateParsingResult():
    global networkElementList, topology_cell_type_to_ne_map

    for key, list_of_values in result_map.iteritems():
        if list_of_values[1]:
            util.printStatement('ERROR', 'Issue with data integrity in Topology Data.')
            sys.exit(1)

    count, f_count = 0, 0
    for key, values in result_map.iteritems():
        value = values[0]
        count += 1
        if value is None:
            f_count += 1
            util.printStatement('ERROR', 'Topology parsing failure for file ' + key)
        else:
            networkElementList.append(json.loads(NodeDetailEncoder().encode(value)))
    if f_count > 0:
        util.printStatement('ERROR', 'Total ' + str(f_count) + ' file failed for Topology parsing out of ' + str(
            count) + ' file.', True)
    else:
        util.printStatement('INFO', 'All Topology file parsed successfully.')


def parseJsonFile(file):
    try:
        with open(file, 'r') as f:
            return json.load(f)
    except Exception as e:
        print_exc()


def generateNewGnbValue(gnb_arr, s_right, s_left):
    right_shift, left_shift = util.get_right_shift_pad(s_right), util.get_left_shift_pad(s_left)
    gnb_arr.reverse()
    holder, return_val, result = None, None, []
    for i in xrange(0, len(gnb_arr)):
        if i == 0:
            holder = (gnb_arr[i] >> s_right) & right_shift
            return_val = (gnb_arr[i] << s_left) & left_shift
        else:
            holder = ((gnb_arr[i] << s_left) & left_shift) | holder
            result.append(holder)
            holder = (gnb_arr[i] >> s_right) & right_shift
    result.append(holder & 0xff)
    result.reverse()
    return result, return_val


def generateNewCellValue(cell_val, trnsf_val, byte_size):
    cell_byte_arr = util.int_to_bytes(cell_val, byte_size)
    cell_byte_arr[0] = (cell_byte_arr[0] | trnsf_val) & 0xff
    if byte_size > 1:
        for i in range(1, byte_size):
            cell_byte_arr[i] = cell_byte_arr[i] & 0xff
    return cell_byte_arr


def generateNciValue(gnb_id, gnb_id_len, cell_id):
    nci_total_len = 36
    cell_len = nci_total_len - gnb_id_len
    gnb_id_byte_size = int(math.ceil((gnb_id_len * 1.0) / 8.0))
    gnb_id_byte_arr = util.int_to_bytes(gnb_id, gnb_id_byte_size)
    new_gnb_val, transfer_val, new_cell_val = None, None, None
    if cell_len == 4:
        new_gnb_val, transfer_val = generateNewGnbValue(gnb_id_byte_arr, 4, 4)
        new_cell_val = generateNewCellValue(cell_id, transfer_val, 1)
    else:
        new_gnb_val, transfer_val = generateNewGnbValue(gnb_id_byte_arr, 2, 6)
        new_cell_val = generateNewCellValue(cell_id, transfer_val, 2)
    return util.bytes_to_int(new_gnb_val + new_cell_val)


def makePlmnId(_mcc, _mnc):
    result = []
    plmn_byte_size = 3

    for i in range(0, plmn_byte_size):
        result.append(0 & 0xff)

    if len(_mnc) == 2:
        _mnc = '0' + _mnc

    result[0] = int(_mcc[1]) << 4 & 0Xff
    result[0] += int(_mcc[0]) & 0xff

    if _mnc[0] == '0':
        result[1] = 15 << 4 & 0xff
    else:
        result[1] = int(_mnc[0]) << 4 & 0xff

    result[1] += int(_mcc[2]) & 0xff
    result[2] = int(_mnc[2]) << 4 & 0xff
    result[2] += int(_mnc[1]) & 0xff

    hex_str =  ''.join(format(x, '02x') for x in result)
    return hex_str


def parseTopologyData(topologyLocation, filePath):
    topologyMissMatched = False
    moClassList, netFnMap = ('NRCellDU', 'NRCellCU'), {}
    cellRelationTypeList = ('NRCellRelation', 'EUtranCellRelation')
    nodeWrp = NodeWrapper()
    tempNciList = []
    try:
        dataStore = parseJsonFile(os.path.join(topologyLocation, filePath))
        fdnName = dataStore['networkElement'].split('=')[-1]
        nodeWrp.set_managed_element(fdnName)
        cellRelationMap = defaultdict(list)
        for function in dataStore['moMap'].keys():
            if function.startswith('GNB') and function.endswith('Function'):
                localEndPointMap, remoteEndPointMap = defaultdict(list), defaultdict(list)
                netFnWrp = NetworkFunctionWrapper()
                cellList, setPlmnBool = [], True
                for element in dataStore['moMap'][function]:
                    moClass = element['moClass']
                    if moClass == function:
                        netFnWrp.set_g_nbid(element['attributeMap']['gNBId'])
                        netFnWrp.set_g_nbid_length(element['attributeMap']['gNBIdLength'])
                        netFnWrp.set_gnb_function_id(element['attributeMap'][gnb_function_id_map[moClass]])
                    elif moClass in moClassList:
                        cellWrp = CellWrapper()
                        cellWrp.set_cell_local_id(element['attributeMap']['cellLocalId'])
                        generated_nci = generateNciValue(int(netFnWrp.get_g_nbid()), int(netFnWrp.get_g_nbid_length()),
                                                         int(cellWrp.get_cell_local_id()))
                        tempNciList.append(generated_nci)
                        fetched_nci = int(element['attributeMap']['nCI'])
                        cellWrp.set_n_ci(generated_nci)
                        if generated_nci != fetched_nci:
                            topologyMissMatched = True
                            util.printStatement('ERROR',
                                                'Provided NCI value in topology is not proper for node : ' + fdnName + ', for function : ' + function)
                        if setPlmnBool:
                            if 'pLMNIdList' in element['attributeMap']:
                                netFnWrp.set_plmn_id_list(element['attributeMap']['pLMNIdList'])
                                setPlmnBool = False
                        cellList.append(cellWrp)
                    elif moClass in cellRelationTypeList:
                        src_nci = int(element['attributeMap']['srcnCI'])
                        mcc, mnc, target_nci = element['moFdn'].split('=')[-1].split('_')
                        plmnId = makePlmnId(mcc, mnc)
                        cell_ho_type = '0'
                        if moClass == 'EUtranCellRelation':
                            cell_ho_type = '3'
                        cellRelationMap[function].append([src_nci, cell_ho_type, target_nci, plmnId])
                    else:
                        if 'attributeMap' in element:
                            if 'localEndPoint' in element['attributeMap']:
                                localEndPointMap[moClass].append(element['attributeMap']['localEndPoint'])
                            if 'remoteEndPoint' in element['attributeMap']:
                                remoteEndPointMap[moClass].append(element['attributeMap']['remoteEndPoint'])
                netFnWrp.set_local_end_point_map(localEndPointMap)
                netFnWrp.set_remote_end_point_map(remoteEndPointMap)
                netFnWrp.set_cell_list(cellList)
                netFnMap[function] = netFnWrp
        nodeWrp.set_list_of_nci(list(set(tempNciList)))
        nodeWrp.set_unique_nci_count()
        for nf_fn_name in cellRelationMap.keys():
            src_nci_list = list(set([x[0] for x in cellRelationMap[nf_fn_name]]))
            finalCellRelationMap = {}
            for s_nci in src_nci_list:
                cell_ho_map = defaultdict(list)
                for s, c, t, p in cellRelationMap[nf_fn_name]:
                    if s == s_nci:
                        cell_ho = '3'
                        if c != '3':
                            if int(t) in nodeWrp.get_list_of_nci():
                                cell_ho = '1'
                            else:
                                cell_ho = '2'
                        cell_ho_map[cell_ho].append('|'.join([t, p]))
                finalCellRelationMap[s_nci] = cell_ho_map
            netFnMap[nf_fn_name].set_cell_relation_map(finalCellRelationMap)
        nodeWrp.set_network_fn_details_map(netFnMap)
        return filePath, nodeWrp, topologyMissMatched
    except Exception as e:
        print_exc()
        return filePath, None, False


def invokeTopologyParsing():
    concurrent_process = Pool(fileProcessInstance)
    for file in topologyFileList:
        concurrent_process.apply_async(parseTopologyData, args=(topologyLocation, file), callback=collect_result)
        #collect_result(parseTopologyData(topologyLocation, file))
    concurrent_process.close()
    concurrent_process.join()


def writeEnrichedDataInJsonFile():
    file = os.path.join(os.path.dirname(configFile), node_details)
    with open(file, 'w') as f:
        json.dump(networkElementList, f, indent=2)
    generateTopologyToNodeMapping()


def load_topology_json_objects():
    global topology_nci_map
    counter = 0
    for topo_file in result_map:
        ne_wrapper = result_map[topo_file][0]
        topology_nci_map[ne_wrapper.get_unique_nci_count()].append(ne_wrapper.get_managed_element())
        counter += 1
    return counter


def load_input_data_json_objects():
    global input_data_nci_map, input_data_store, input_ne_list
    counter = 0
    input_node_json = os.path.join(os.path.dirname(configFile), input_node_info)
    input_data_store = None
    with open(input_node_json, 'r') as f:
        input_data_store = json.load(f)
    for ne_info_map in input_data_store:
        input_data_nci_map[int(ne_info_map['numberOfCells'])].append(ne_info_map['nodeFdn'])
        input_ne_list.append(ne_info_map['nodeFdn'])
        counter += 1
    return counter


def get_reverse_input_map():
    reverse_map = {}
    for k, vs in input_data_nci_map.iteritems():
        for v in vs:
            reverse_map[v] = k
    return reverse_map


def extrapolate_input_nes():
    global input_data_nci_map
    input_nci_keys = input_data_nci_map.keys()
    for nci_key in input_nci_keys:
        if nci_key in topology_nci_map.keys():
            diff = (len(topology_nci_map[nci_key]) - len(input_data_nci_map[nci_key]))
            if diff > 0:
                nci_ne_list = input_data_nci_map[nci_key]
                for i in range(diff):
                    name = nci_ne_list.pop(0)
                    nci_ne_list.append(name)
                    input_data_nci_map[nci_key].append(name)
        else:
            util.printStatement('ERROR', 'To extrapolate input data from topology, \
            Input cell count variation should exactly match with Topology cell count variation.')
            sys.exit(1)


def best_match_approach(diff):
    global input_data_nci_map
    input_rev_map = get_reverse_input_map()
    input_sorted_node = sorted(input_rev_map.keys())
    temp_list, c = [], 0
    for i in range(diff):
        if c >= len(input_sorted_node):
            c = 0
        temp_list.append(input_sorted_node[c] + '|' + str(input_rev_map[input_sorted_node[c]]))
        c += 1
    for v in temp_list:
        cell_count = int(v.split('|')[1])
        ne_name = v.split('|')[0]
        input_data_nci_map[cell_count].append(ne_name)


def match_exact_cells():
    global input_data_nci_map, topology_nci_map, nci_based_input_to_topo_map
    for matched_key in [x for x in input_data_nci_map.keys() if x in topology_nci_map.keys()]:
        topo_values, input_values, index = topology_nci_map[matched_key], input_data_nci_map[matched_key], 0
        for input_ne in input_values:
            if index >= len(topo_values):
                break
            nci_based_input_to_topo_map[topo_values[index]] = input_ne
            index += 1
        del topology_nci_map[matched_key][0:index]
        del input_data_nci_map[matched_key][0:index]
        if len(input_data_nci_map[matched_key]) == 0:
            del input_data_nci_map[matched_key]
        if len(topology_nci_map[matched_key]) == 0:
            del topology_nci_map[matched_key]


def map_nearest_cells():
    global input_data_nci_map, topology_nci_map, nci_based_input_to_topo_map
    sorted_input_keys, sorted_topo_keys = sorted(input_data_nci_map.keys()), sorted(topology_nci_map.keys())
    while len(sorted_input_keys) > 0:
        first_input_key = sorted_input_keys[0]
        nearest_topo_key = min(sorted_topo_keys, key=lambda x: abs(x - first_input_key))
        if nearest_topo_key < first_input_key:
            nearest_topo_key_index = sorted_topo_keys.index(nearest_topo_key) + 1
            if len(sorted_topo_keys) > nearest_topo_key_index:
                nearest_topo_key = sorted_topo_keys[nearest_topo_key_index]
        topo_values, input_values, index = topology_nci_map[nearest_topo_key], input_data_nci_map[first_input_key], 0
        for input_ne in input_values:
            if index >= len(topo_values):
                break
            nci_based_input_to_topo_map[topo_values[index]] = input_ne
            index += 1
        del topology_nci_map[nearest_topo_key][0:index]
        del input_data_nci_map[first_input_key][0:index]
        if len(input_data_nci_map[first_input_key]) == 0:
            del input_data_nci_map[first_input_key]
            sorted_input_keys.remove(first_input_key)
        if len(topology_nci_map[nearest_topo_key]) == 0:
            del topology_nci_map[nearest_topo_key]
            sorted_topo_keys.remove(nearest_topo_key)


def populate_nci_to_nci_map():
    global nci_to_nci_map
    for topo_ne, input_ne in nci_based_input_to_topo_map.iteritems():
        topo_ne_nci_list, topo_ne_nci_count, input_ne_nci_list = None, None, None
        for networkObject in networkElementList:
            if networkObject['_NodeWrapper__managedElement'] == topo_ne:
                topo_ne_nci_list, topo_ne_nci_count = networkObject['_NodeWrapper__listOfNci'], networkObject[
                    '_NodeWrapper__uniqueNciCount']
                break
        for input_fdn_obj in input_data_store:
            if input_fdn_obj['nodeFdn'] == input_ne:
                input_ne_nci_list = input_fdn_obj['uniqueNciAcrossAllNf']
                break
        for index, nci_value in enumerate(input_ne_nci_list):
            value = str(-1)
            if topo_ne_nci_count > index:
                value = str(topo_ne_nci_list[index])
            nci_to_nci_map[topo_ne][nci_value] = value


def write_nci_to_nci_map_json():
    file = os.path.join(os.path.dirname(configFile), nci_mapping_file)
    with open(file, 'w') as f:
        json.dump(nci_to_nci_map, f, indent=2)
        f.flush()


''' Best Fit Algorithm '''


def map_input_to_topology_nci_for_session():
    total_topology_values = load_topology_json_objects()
    total_input_values = load_input_data_json_objects()

    # do the extrapolation only without best match
    if extrapolate_ne:
        extrapolate_input_nes()
    else:
        if total_input_values > total_topology_values:
            util.printStatement('ERROR', 'Input node count is greater than provided topology count.')
            sys.exit(1)
        else:
            if total_input_values < total_topology_values:
                best_match_approach(total_topology_values - total_input_values)

    match_exact_cells()
    if len(input_data_nci_map.keys()) > 0:
        map_nearest_cells()

    populate_nci_to_nci_map()
    write_nci_to_nci_map_json()


def setXmlEtObject():
    global xmlElements
    xmlElements = XML_TREE.parse(configFile).getroot()


def check_ne_extrapolation():
    global extrapolate_ne
    with open(conf_ini) as f:
        for line in f:
            if line.startswith('EXTRAPOLATE_NES_FROM_TOPOLOGY'):
                extrapolate_ne = line.split('=')[1].strip().upper() == 'YES'
                break


def main(argv):
    global topologyLocation, callThroughController, nci_session_mapping

    findScriptDirectory()
    setXmlEtObject()

    if len(argv) == 2:
        nci_session_mapping, callThroughController = argv[1].upper() == 'MAP_NCI', True
    elif len(argv) == 1:
        callThroughController = True

    check_ne_extrapolation()

    if nci_session_mapping:
        input_node_json = os.path.join(os.path.dirname(configFile), input_node_info)
        if not os.path.isfile(input_node_json):
            util.printStatement('ERROR', input_node_json + ' file not present.')
            sys.exit(1)

    if callThroughController:
        topologyLocation = argv[0]
    else:
        topologyLocation = findTopologyLocation()

    if not os.path.isdir(topologyLocation):
        util.printStatement('ERROR', 'Topology Location does not exists', True)

    file = os.path.join(os.path.dirname(configFile), topologyFileJson)
    if not os.path.isfile(file):
        filterTopologyFiles()
    else:
        global topologyFileList
        with open(file, 'r') as f:
            topologyFileList = json.load(f)
    identifyProcessCount()
    invokeTopologyParsing()
    validateParsingResult()
    if nci_session_mapping:
        map_input_to_topology_nci_for_session()
    writeEnrichedDataInJsonFile()


if __name__ == '__main__':
    main(sys.argv[1:])
