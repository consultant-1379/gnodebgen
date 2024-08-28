import os
import shutil
import sys

ne_instance_map = {'NR181gNodeBRadio00002': 3360, 'NR01gNodeBRadio00001': 4320, 'NR134gNodeBRadio00025': 2400, 'NR211gNodeBRadio00010': 1200}
ne_start_instance_map = {'NR181gNodeBRadio00002': 301, 'NR01gNodeBRadio00001': 401, 'NR134gNodeBRadio00025': 501, 'NR211gNodeBRadio00010': 601}
nf_list = ['CUCP', 'CUUP', 'DU']
start_ne_instance = 1

input_loc = ''
out_loc = ''


def correct_path_string(path_str):
    if not path_str.endswith('/'):
        path_str += '/'
    return path_str


def extrapolate_cell_trace_ne():
    global start_ne_instance
    for input_file in filter(None, os.listdir(input_loc)):
        input_file_path = ''.join([input_loc, input_file])
        if input_file.endswith('.gz'):
            for nf in nf_list:
                if nf in input_file.upper():
                    for key in ne_instance_map.keys():
                        if key.upper() in input_file.upper():
                            start_sim_instance = ne_start_instance_map[key]
                            start_ne_instance = 1
                            for copy_inst in range(0, ne_instance_map[key]):
                                ne_name = 'NR' + str(start_sim_instance).zfill(2) + 'gNodeBRadio' + str(
                                    start_ne_instance).zfill(5)
                                new_file_name = input_file.replace(key, ne_name)
                                new_file_path = ''.join([out_loc, new_file_name])
                                shutil.copy(input_file_path, new_file_path)
                                start_ne_instance += 1
                                if start_ne_instance > 160:
                                    start_ne_instance = 1
                                    start_sim_instance += 1
                            break
                    break


def main(args):
    if len(args) == 2:
        global input_loc, out_loc
        input_loc, out_loc = correct_path_string(args[0]), correct_path_string(args[1])
        extrapolate_cell_trace_ne()
    else:
        print 'ERROR : Invalid amount of arguments.'


if __name__ == '__main__':
    main(sys.argv[1:])