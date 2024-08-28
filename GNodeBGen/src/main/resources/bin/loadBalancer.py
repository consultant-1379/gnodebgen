#!/usr/bin/python

import sys, json, os
from _collections import defaultdict


result_location = None
script_dir = os.path.dirname(os.path.realpath(__file__))
json_file_path = os.path.join(os.path.dirname(script_dir), 'config', 'enriched_node_info.json')
NE_NAME_KEY = '_NodeWrapper__managedElement'
CELL_COUNT_KEY = '_NodeWrapper__uniqueNciCount'

number_of_racks = 2

distribution_map = defaultdict(list)


def correct_dir(input_path):
	if input_path.endswith('/'):
		return input_path
	else:
		return input_path + '/'


def generate_result():
	for index, ne_list in distribution_map.iteritems():
		result_file_path = result_location + 'rack_' + str(index) + '.txt'
		with open(result_file_path, 'w') as f:
			for ne in ne_list:
				f.write(ne + '\n')
			f.flush()


def distribute_nes(_map):
	global distribution_map
	temp_map = {}
	for cell_count in _map.keys():
		counter = 0
		for ne_name in _map[cell_count]:
			if counter >= number_of_racks:
				counter = 0
			if counter not in temp_map.keys():
				temp_map[counter] = 0
			temp_map[counter] = temp_map[counter] + cell_count
			distribution_map[counter].append(ne_name)
			counter += 1
	print(temp_map)


def parse_json_and_gather_information(_list):
	cell_count_to_ne_list_map = defaultdict(list)
	for element in _list:
		if NE_NAME_KEY in element.keys() and CELL_COUNT_KEY in element.keys():
			cell_count_to_ne_list_map[int(element[CELL_COUNT_KEY])].append(element[NE_NAME_KEY])
		else:
			print('ERROR : Either ne name or cell count or both not found in map element.')
			sys.exit(1)
	distribute_nes(cell_count_to_ne_list_map)


def load_json_file():
	if os.path.isfile(json_file_path):
		global ne_element_list
		element_list = None
		with open(json_file_path, 'r') as f:
			element_list = json.load(f)
		parse_json_and_gather_information(element_list)
	else:
		print('ERROR : File ' + json_file_path + ' not present.')


def main(args):
	if len(args) == 2:
		global result_location, number_of_racks
		result_location, number_of_racks = correct_dir(args[1]), int(args[0])
		load_json_file()
		generate_result()
	else:
		print('ERROR : Invalid arguments given.')


if __name__ == '__main__':
	main(sys.argv[1:])