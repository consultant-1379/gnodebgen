import os
import shutil
import sys

input_file_path = None
input_config_file = None
output_location = None

config_map = {}


def correct_path_string(path_str):
    if not path_str.endswith('/'):
        path_str += '/'
    return path_str


def create_new_data():
    for f in filter(None, os.listdir(input_file_path)):
        for key in config_map:
            new_key = '=' + key + '_'
            if new_key in f:
                old_file_path = ''.join([input_file_path, f])
                #new_file_name = f.replace(new_key, '=' + new_key + '_' + config_map[key] + '_')
                new_file_name = f.replace(new_key, '=' + config_map[key] + '_')
                new_file_path = ''.join([output_location, new_file_name])
                shutil.copy(old_file_path, new_file_path)
                break


def create_cofig_map():
    global config_map
    with open(input_config_file) as config:
        for line in config:
            line = line.replace(' ', '').replace('\n', '')
            ip_port, fdn = line.split('=')
            config_map[ip_port.replace(':', '_')] = fdn


def main(args):
    if len(args) == 3:
        global input_file_path, input_config_file, output_location
        input_file_path, output_location = correct_path_string(args[0]), correct_path_string(args[1])
        input_config_file = args[2]
        create_cofig_map()
        create_new_data()
    else:
        print 'ERROR : Invalid args count. Expected 3.'


if __name__ == '__main__':
    main(sys.argv[1:])
