import shutil
from multiprocessing import Event, Pool
from time import time, sleep
from datetime import datetime
import os
import sys
from collections import defaultdict
from traceback import print_exc
import logging


input_location = ''
output_location = ''
FILE_EXT = '.gpb.gz'
error, info, warn = 'ERROR', 'INFO', 'WARNING'

copy_instance = 3
rop_start_pointer = 0
MAX_ROP_POINTER = 0
ROP_PERIOD = 15
REQ_PREP_TIME = 90
next_rop_epoch = 0
next_rop_time_str = ''

UNIQUE_ROPS = []
PROC_TO_NE_MAP = defaultdict(list)
ROP_TO_FILE_MAP = defaultdict(lambda: defaultdict(list))

terminate_tool = Event()
terminate_tool.clear()


def initiate_logger():
    log_dir = os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
    file_transfer_log_path = os.path.join(log_dir, 'logs', 'file_transfer.log')
    log_formatter = "%(asctime)s [%(levelname)s] %(message)s"
    logging.basicConfig(filename=file_transfer_log_path, format=log_formatter, level=logging.INFO)


def terminate_script():
    sleep(10)
    sys.exit()


def set_terminate_event():
    if not terminate_tool.is_set():
        terminate_tool.set()
    terminate_script()


def get_epoch_time():
    return time()


def correct_path(path):
    if not path.endswith('/'):
        return path
    else:
        return path[:-1]


def gather_celltrace_information():
    global UNIQUE_ROPS, MAX_ROP_POINTER, PROC_TO_NE_MAP, ROP_TO_FILE_MAP, copy_instance
    file_list = filter(None, os.listdir(input_location))
    for f in file_list:
        if f.endswith(FILE_EXT):
            file_rop = f.split('_')[0]
            ne_name = f.split('_celltracefile')[0].split('_')[1]
            ROP_TO_FILE_MAP[file_rop][ne_name].append(os.path.join(input_location, f))
    UNIQUE_ROPS.extend(ROP_TO_FILE_MAP.keys())
    UNIQUE_ROPS.sort()
    MAX_ROP_POINTER = len(UNIQUE_ROPS)
    ne_count = len(ROP_TO_FILE_MAP[UNIQUE_ROPS[0]].keys())
    if ne_count < copy_instance:
        copy_instance = len(ROP_TO_FILE_MAP[UNIQUE_ROPS[0]].keys())
    logging.info('Number of Nodes found in input source : ' + str(ne_count))
    logging.info('Initiating number of processes : ' + str(copy_instance))
    counter = 0
    for ne in ROP_TO_FILE_MAP[UNIQUE_ROPS[0]].keys():
        if counter >= copy_instance:
            counter = 0
        PROC_TO_NE_MAP[counter].append(ne)
        counter += 1


def get_first_rop_sending_time(is_first_exec=False):
    global next_rop_epoch
    epoch = get_epoch_time()
    div = int(epoch/(ROP_PERIOD * 60))
    modulo = (epoch % (ROP_PERIOD * 60))
    diff = ((ROP_PERIOD * 60) - modulo)
    if diff >= REQ_PREP_TIME:
        next_rop_epoch = (div + 1) * (ROP_PERIOD * 60)
    else:
        next_rop_epoch = (div + 2) * (ROP_PERIOD * 60)
    if is_first_exec:
        gather_celltrace_information()


def file_copying(in_file, dest_file):
    try:
        shutil.copy(in_file, dest_file)
    except Exception:
        logging.error('Issue with copying file, ' + in_file)
        print_exc()


def file_sftp():
    pass


def generate_next_rop_string():
    global next_rop_time_str
    end_rop_epoch = next_rop_epoch + ((ROP_PERIOD) * 60)
    start_rop, end_rop = datetime.utcfromtimestamp(next_rop_epoch), datetime.utcfromtimestamp(end_rop_epoch)
    next_rop_time_str = start_rop.strftime('A%Y%m%d.%H%M') + '-' + end_rop.strftime('%H%M')


def file_transfer_process(rop, next_rop, ne_file_list_map, ne_list, out_loc):
    try:
        for ne in ne_list:
            if terminate_tool.is_set():
                return
            if ne in ne_file_list_map:
                for ne_file in ne_file_list_map[ne]:
                    dest_file_path = os.path.join(out_loc, os.path.basename(ne_file).replace(rop, next_rop))
                    file_copying(ne_file, dest_file_path)
            else:
                logging.warn('Node, ' + ne + ' does not found for ROP, ' + rop)
    except Exception:
        logging.error('Issue in file transfer pool. Terminating process.')
        print_exc()
        set_terminate_event()


def file_transfer_process_pool():
    global rop_start_pointer
    transfer_pool = Pool(copy_instance)
    try:
        rop_name = UNIQUE_ROPS[rop_start_pointer]
        ne_to_file_map = ROP_TO_FILE_MAP[rop_name]
        logging.info('Input source rop, ' + rop_name + ' will be used to transfer this rop, ' + next_rop_time_str)
        rop_start_pointer += 1
        if rop_start_pointer >= MAX_ROP_POINTER:
            rop_start_pointer = 0
        for proc_id in PROC_TO_NE_MAP.keys():
            transfer_pool.apply_async(file_transfer_process, \
                                      args=(rop_name, next_rop_time_str, ne_to_file_map, \
                                            PROC_TO_NE_MAP[proc_id], output_location))
        transfer_pool.close()
    except KeyboardInterrupt:
        logging.error('Key Board Interrupt acknowledged. Terminating process.')
        print_exc()
        set_terminate_event()
    except Exception:
        logging.error('Issue with initiating file transfer process pool. Terminating process.')
        print_exc()
        set_terminate_event()
    finally:
        transfer_pool.join()


def initiate_file_transfer():
    logging.info('Next file transfer will start by ' + (datetime.fromtimestamp(next_rop_epoch)).strftime('%Y-%m-%d %H:%M:%S') + ' LOCAL')
    try:
        while get_epoch_time() < next_rop_epoch:
            sleep(0.1)
    except KeyboardInterrupt:
        logging.error('Key Board Interrupt acknowledged. Terminating process.')
        print_exc()
        set_terminate_event()
    except Exception:
        logging.error('Issue while waiting for file transfer wait time. Terminating process.')
        print_exc()
        set_terminate_event()
    logging.info('File transfer started.')
    file_transfer_process_pool()
    logging.info('File transfer completed.')
    get_first_rop_sending_time()


def main(args):
    if len(args) != 2:
        print ('ERROR : Invalid arguments given.')
        print ('/path/script.py <input_data_location> <output_data_location/sftp_ip>')
        sys.exit()
    global input_location, output_location
    initiate_logger()
    input_location, output_location = correct_path(args[0]), correct_path(args[1])
    if os.path.isdir(input_location) and os.path.isdir(output_location):
        get_first_rop_sending_time(True)
        if len(UNIQUE_ROPS) > 0:
            while True:
                generate_next_rop_string()
                initiate_file_transfer()
        else:
            logging.error('No input found at location, ' + input_location)
    else:
        logging.error('Either Input or Output location does not exist.')


if __name__ == '__main__':
    main(sys.argv[1:])
