#!/usr/bin/python

import ConfigParser
import json
import os.path
import sys

JRE_8 = 'jre1.8.0_231'

rules_arg_str = None
script_path = None
input_dir = None
output_dir = None

possible_placement = ['before', 'after']

def call_jar():
    tool_location = os.path.dirname(script_path)
    java_path = tool_location + '/jre/' + JRE_8 + '/bin/java'
    jar_loc = tool_location + '/lib/GNodeBGen-0.0.1-SNAPSHOT.jar'
    calling_arg = java_path + ' -jar ' + jar_loc + ' eventaddition ' + input_dir + ' ' + output_dir + ' "' + rules_arg_str + '"'
    os.system(calling_arg)


def load_event_configuration(config_file):
    global rules_arg_str
    config_map = ConfigParser.ConfigParser()
    config_map.read(config_file)
    condition_list = [ x for x in config_map._sections]
    condition_list.sort()
    rules_list = []
    for condition_name in condition_list:
        temp_holder_d = {}
        temp_holder_d['ref_event_id'] = config_map._sections[condition_name]['ref_event_id']
        temp_holder_d['ref_event_id_occur'] = config_map._sections[condition_name]['no_of_ref_event_id_occur']
        temp_holder_d['event_id_to_add'] = config_map._sections[condition_name]['event_id_to_add']
        temp_holder_d['no_of_new_event_id_put'] = config_map._sections[condition_name]['no_of_new_event_id_put']
        temp_holder_d['placement'] =  config_map._sections[condition_name]['placement']
        if temp_holder_d['placement'].lower() not in possible_placement:
            print 'ERROR : Placement can be either after or before.'
            sys.exit(1)
        rules_list.append(temp_holder_d)
    rules_arg_str = json.dumps({'conditions' : rules_list})
    rules_arg_str = rules_arg_str.replace('"', '\\"')
    call_jar()


def validate_dir(dir):
    if os.path.isdir(dir):
        return True
    else:
        return False


def correct_dir(dir):
    if not dir.endswith('/'):
        return dir + '/'
    else:
        return dir


def main(args):
    global script_path, input_dir, output_dir
    script_path = os.path.dirname(os.path.realpath(__file__))
    if validate_dir(args[0]) and validate_dir(args[1]):
        input_dir, output_dir = correct_dir(args[0]), correct_dir(args[1])
    else:
        print 'ERROR :  Please provide proper arguments.'
        print 'INFO : Calling script argument, \n<script_name> <input_data_location> <output_data_location>'
        print 'INFO : Terminating process.'
        return
    config_file = os.path.join(os.path.dirname(script_path), 'config', 'eventAdditionConfig.ini')
    #config_file = 'W:/ede_nr_event_addition/repo/gnodebgen/GNodeBGen/src/main/resources/config/eventAdditionConfig.ini'
    if not os.path.isfile(config_file):
        print 'ERROR : Event configuration file ' + config_file + ' does not exist.'
    else:
        load_event_configuration(config_file)


if __name__ == '__main__':
    main(sys.argv[1:])