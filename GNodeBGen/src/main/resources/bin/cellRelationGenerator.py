#!/usr/bin/python

# owner xmanabh
import json
import os.path
import sys
from math import floor
from collections import defaultdict

input_location, output_location = '', ''
repeat_per_cell, lte_cell_rel_ratio = 0, 0
max_nci = 0
total_cell_in_network = 0

SUPP_REQ_FOR_GNB_FUN = ['GNBCUCPFunction']
MO_CLASS_TUPLE = ('NRCellDU', 'NRCellCU')

moMap, attributeMap, moClass = 'moMap', 'attributeMap', 'moClass'
mcc, mnc, nci, plmnIdList, cellLocalId = 'mcc', 'mnc', 'nCI', 'pLMNIdList', 'cellLocalId'

json_file_map = {}
json_object_map = {}
node_to_cell_count = {}
inter_intra_ne_map = {}

'''
    ne_info_map = { ne : {'MCC' : [], 'MNC' : [], 'NCI' : []}}
'''
ne_info_map = defaultdict(lambda: defaultdict(list))

MO_FDN_NR = 'SubNetwork=Europe,SubNetwork=Ireland,MeContext=<src_ne_name>,ManagedElement=<src_ne_name>,' + \
            '<gnb_fun_key>=1,<cell_fun_name>=<src_ne_name>-<ne_id>,NRCellRelation=<target>'
MO_FDN_LTE = 'SubNetwork=Europe,SubNetwork=Ireland,MeContext=<src_ne_name>,ManagedElement=<src_ne_name>,' + \
             '<gnb_fun_key>=1,<cell_fun_name>=<src_ne_name>-<ne_id>,EUtranCellRelation=<target>'

final_map = defaultdict(list)


def correct_path_string():
    global input_location, output_location
    if not input_location.endswith('/'):
        input_location += '/'
    if not output_location.endswith('/'):
        output_location += '/'


def validate_input_params():
    global json_file_map, json_object_map, inter_intra_ne_map
    status = True
    supp_file_format = '.json'
    if not os.path.isdir(output_location):
        status = False
        print 'ERROR : Output loc ' + output_location + ' does not exists.'
    if os.path.isdir(input_location):
        for f in filter(None, os.listdir(input_location)):
            if f.endswith(supp_file_format):
                with open(input_location + f, 'r') as jf:
                    json_info = json.load(jf)
                    ne_name = json_info['networkElement'].split('=')[-1]
                    json_file_map[ne_name], json_object_map[ne_name] = f, json_info
        if len(json_file_map.keys()) == 0:
            status = False
            print 'ERROR : Input loc ' + input_location + ' does not contain any valid json file.'
    else:
        status = False
        print 'ERROR : Input loc ' + input_location + ' does not exists.'
    return status


def fetch_ne_param_details():
    global ne_info_map, node_to_cell_count, max_nci
    for ne, ne_object in json_object_map.iteritems():
        nci_order_map = {}
        for function in ne_object[moMap].keys():
            if function.startswith('GNB') and function.endswith('Function'):
                for element in ne_object[moMap][function]:
                    if element[moClass] in MO_CLASS_TUPLE:
                        cell_index_id = int(element['moFdn'].split('-')[-1])
                        if plmnIdList in element[attributeMap] and nci in element[attributeMap]:
                            for mcc_mnc_map in element[attributeMap][plmnIdList]:
                                ne_info_map[ne][mcc].append(mcc_mnc_map[mcc])
                                ne_info_map[ne][mnc].append(mcc_mnc_map[mnc])
                            nci_order_map[cell_index_id] = element[attributeMap][nci]
        for index in range(1, len(nci_order_map.keys()) + 1):
            ne_info_map[ne][nci].append(nci_order_map[index])
    remove_duplicate_values_across_network()
    for ne, attr_map in ne_info_map.iteritems():
        node_to_cell_count[ne] = len(attr_map[nci])
        for nci_val in attr_map[nci]:
            if nci_val > max_nci:
                max_nci = nci_val
    max_nci += 1


def print_ne_info_map():
    for ne, param_map in ne_info_map.iteritems():
        print '\n' + ne + ' :'
        for param, values in param_map.iteritems():
            print param + ' : ' + ', '.join([str(x) for x in values])


def remove_duplicate_values_across_network():
    global ne_info_map
    for ne, info_map in ne_info_map.iteritems():
        for param, values in info_map.iteritems():
            temp_values = []
            for value in values:
                if value not in temp_values:
                    temp_values.append(value)
            ne_info_map[ne][param] = temp_values
                


def generate_mo_with_lte_target_cell_relation(src_ne, src_nci, ne_id, instance):
    global max_nci
    list_of_mos = []
    temp_fdn = MO_FDN_LTE
    temp_fdn = temp_fdn.replace('<src_ne_name>', src_ne).replace('<gnb_fun_key>', SUPP_REQ_FOR_GNB_FUN[0])
    temp_fdn = temp_fdn.replace('<cell_fun_name>', 'NRCellCU')
    temp_fdn = temp_fdn.replace('<ne_id>', ne_id)
    m_o_class = 'EUtranCellRelation'
    for _ in range(instance):
        target_value = str(310) + '_' + str(410) + '_' + str(max_nci)
        d = {'moFdn': temp_fdn.replace('<target>', target_value), 'moClass': m_o_class, 'attributeMap': {'srcnCI': src_nci}}
        list_of_mos.append(d)
        max_nci += 1
    return list_of_mos


def generate_mo_with_inter_target_cell_relation(src_ne, src_nci, ne_id, instance):
    list_of_mos = []
    temp_fdn = MO_FDN_NR
    temp_fdn = temp_fdn.replace('<src_ne_name>', src_ne).replace('<gnb_fun_key>', SUPP_REQ_FOR_GNB_FUN[0])
    temp_fdn = temp_fdn.replace('<cell_fun_name>', 'NRCellCU')
    temp_fdn = temp_fdn.replace('<ne_id>', ne_id)
    m_o_class = 'NRCellRelation'
    counter = 0
    for super_ne in ne_info_map:
        if super_ne == src_ne:
            continue
        temp_ncis, temp_mccs, temp_mncs = ne_info_map[super_ne][nci], ne_info_map[super_ne][mcc], ne_info_map[super_ne][mnc]
        for index, temp_nci in enumerate(temp_ncis):
            target_value = str(temp_mccs[index]) + '_' + str(temp_mncs[index]) + '_' + str(temp_nci)
            d = {'moFdn': temp_fdn.replace('<target>', target_value), 'moClass': m_o_class, 'attributeMap': {'srcnCI': src_nci}}
            list_of_mos.append(d)
            counter += 1
            if counter >= instance:
                return list_of_mos


def generate_mo_with_intra_target_cell_relation(src_ne, src_nci, ne_id):
    temp_fdn = MO_FDN_NR
    temp_fdn = temp_fdn.replace('<src_ne_name>', src_ne).replace('<gnb_fun_key>', SUPP_REQ_FOR_GNB_FUN[0])
    temp_fdn = temp_fdn.replace('<cell_fun_name>', 'NRCellCU')
    temp_fdn = temp_fdn.replace('<ne_id>', ne_id)
    m_o_class = 'NRCellRelation'
    list_of_mos = []
    for index, temp_nci in enumerate(ne_info_map[src_ne][nci]):
        if temp_nci == src_nci:
            continue
        target_value = str(ne_info_map[src_ne][mcc][index]) + '_' + str(ne_info_map[src_ne][mnc][index]) + '_' + str(temp_nci)
        d = {'moFdn': temp_fdn.replace('<target>', target_value), 'moClass': m_o_class, 'attributeMap': {'srcnCI': src_nci}}
        list_of_mos.append(d)
    return list_of_mos


def get_cell_relation_information():
    global final_map
    for ne, param_map in ne_info_map.iteritems():
        nci_count = node_to_cell_count[ne]
        intra_nr_rel_cnt, inter_nr_rel_cnt = nci_count - 1, total_cell_in_network - nci_count
        lte_nr_rel_cnt = int(floor(((repeat_per_cell * lte_cell_rel_ratio)/100)))
        total_ne_rel_count = intra_nr_rel_cnt + inter_nr_rel_cnt + lte_nr_rel_cnt
        if total_ne_rel_count > repeat_per_cell:
            inter_nr_rel_cnt = repeat_per_cell - (intra_nr_rel_cnt + lte_nr_rel_cnt)
        total_ne_rel_count = intra_nr_rel_cnt + inter_nr_rel_cnt + lte_nr_rel_cnt
        if total_ne_rel_count > 0:
            target_list = []
            for index, nci_val in enumerate(param_map[nci]):
                if intra_nr_rel_cnt > 0:
                    target_list += generate_mo_with_intra_target_cell_relation(ne, nci_val, str(index + 1))
                if inter_nr_rel_cnt > 0:
                    target_list += generate_mo_with_inter_target_cell_relation(ne, nci_val, str(index + 1), inter_nr_rel_cnt)
                if lte_nr_rel_cnt > 0:
                    target_list += generate_mo_with_lte_target_cell_relation(ne, nci_val, str(index + 1), lte_nr_rel_cnt)
            for value in target_list:
                final_map[ne].append(value)


def write_topology_file():
    import copy
    for ne, json_info in json_object_map.iteritems():
        json_copy = copy.deepcopy(json_info)
        json_mo_map_list = json_copy[moMap][SUPP_REQ_FOR_GNB_FUN[0]]
        del json_copy[moMap][SUPP_REQ_FOR_GNB_FUN[0]]
        new_file = output_location + json_file_map[ne]
        for mo_map in final_map[ne]:
            json_mo_map_list.append(mo_map)
        json_copy[moMap][SUPP_REQ_FOR_GNB_FUN[0]] = json_mo_map_list
        with open(new_file, 'w') as f:
            json.dump(json_copy, f, indent=4)


def find_total_cell_in_network():
    global total_cell_in_network
    for ne, cell_count in node_to_cell_count.iteritems():
        total_cell_in_network += cell_count


def main(args):
    global input_location, output_location, repeat_per_cell, lte_cell_rel_ratio
    if len(args) == 4:
        input_location, output_location, repeat_per_cell, lte_cell_rel_ratio = args
        repeat_per_cell, lte_cell_rel_ratio = int(repeat_per_cell), int(lte_cell_rel_ratio)
        correct_path_string()
        if validate_input_params():
            fetch_ne_param_details()
            find_total_cell_in_network()
            get_cell_relation_information()
            write_topology_file()
    else:
        print 'ERROR : Wrong input given.'


if __name__ == '__main__':
    #arg = [ input_topo_loc, output_topo_loc, rel_per_cell, lte_cell_ratio]
    #arg = ['W:/nr_sample_topo_in', 'W:/nr_sample_topo_out', '25', '10']
    #main(arg)
    main(sys.argv[1:])
