import errno
from multiprocessing import Event, Pool
from time import time, sleep
from datetime import datetime
import os
import sys
from collections import defaultdict
from traceback import print_exc
import logging
import warnings
warnings.filterwarnings(action='ignore', module='.*paramiko.*')
import paramiko

input_location = ''
sftp_user, sftp_host, sftp_pass, sftp_loc = '', '', '', ''
FILE_EXT = '.gpb.gz'
error, info, warn = 'ERROR', 'INFO', 'WARNING'
log_loc, sftp_log_loc = '', ''
next_rop_time_str = ''

sftp_instance = 7
ROP_PERIOD = 15
REQ_PREP_TIME = 45
next_rop_epoch = 0

UNIQUE_ROP_LIST = []
NF_LIST = ['CUCP', 'CUUP', 'DU']
ROP_TO_NF_MAP = defaultdict(list)

terminate_tool = Event()
terminate_tool.clear()


def initiate_logger():
    global log_loc, sftp_log_loc
    script_location = os.path.dirname(os.path.realpath(__file__))
    log_loc = os.path.join(os.path.dirname(script_location), 'logs', 'cell_trace_process.log')
    sftp_log_loc = os.path.join(os.path.dirname(script_location), 'logs', 'cell_trace_sftp.log')
    log_formatter = "%(asctime)s [%(levelname)s] %(message)s"
    logging.basicConfig(filename=log_loc, format=log_formatter, level=logging.INFO)
    logging.getLogger("paramiko").setLevel(logging.WARNING)


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
    global ROP_TO_NF_MAP, UNIQUE_ROP_LIST
    file_list = filter(None, os.listdir(input_location))
    for f in file_list:
        if f.endswith(FILE_EXT):
            file_rop = f.split('_')[0]
            file_upper = f.upper()
            for nf in NF_LIST:
                if nf in file_upper:
                    ROP_TO_NF_MAP[file_rop].append(nf)
                    break
    UNIQUE_ROP_LIST.extend(ROP_TO_NF_MAP.keys())
    UNIQUE_ROP_LIST.sort()
    logging.info('Input rop list : ' + '[' + ', '.join(UNIQUE_ROP_LIST) + ']')
    for rop in UNIQUE_ROP_LIST:
        new_nf_list = list(set(sorted(ROP_TO_NF_MAP[rop])))
        del ROP_TO_NF_MAP[rop]
        for nf in new_nf_list:
            ROP_TO_NF_MAP[rop].append(nf)


def get_next_rop_sending_time(is_first_exec=False):
    global next_rop_epoch
    epoch = get_epoch_time()
    div = int(epoch/(ROP_PERIOD * 60))
    modulo = (epoch % (ROP_PERIOD * 60))
    diff = ((ROP_PERIOD * 60) - modulo)
    if diff >= REQ_PREP_TIME:
        next_rop_epoch = (div + 1) * (ROP_PERIOD * 60)
    else:
        next_rop_epoch = (div + 2) * (ROP_PERIOD * 60)
    generate_next_rop_string()
    if is_first_exec:
        gather_celltrace_information()


def file_sftp(p_id, f_map, host, user, passwd, log):
    sftp, transport, counter = None, None, 0
    try:
        if terminate_tool.is_set():
            return
        #paramiko.util.log_to_file(log)
        logging.info('File sftp has been initiated by proc id : ' + str(p_id))
        transport = paramiko.Transport((host, 22))
        transport.connect(None, user, passwd)
        sftp = paramiko.SFTPClient.from_transport(transport)
        for f in f_map.keys():
            try:
                sftp.put(f, f_map[f])
                counter += 1
            except Exception as x:
                if x.errno == errno.ENOENT:
                    logging.error('Remote destination directory : ' + f_map[f] + ' not available. Terminating process.')
                else:
                    logging.error('Issue while doing sftp of file : ' + f + ', error code : ' + str(x.errno))
                logging.info('Number of file(s) transferred by proc id : ' + str(p_id) + ' is : ' + str(counter))
                break
        logging.info('Number of file(s) transferred by proc id : ' + str(p_id) + ' is : ' + str(counter))
    except Exception as e:
        logging.error('Issue while setting up SFTP')
        print_exc()
    finally:
        if sftp:
            sftp.close()
        if transport:
            transport.close()


def generate_next_rop_string():
    global next_rop_time_str
    end_rop_epoch = (next_rop_epoch + (ROP_PERIOD * 60))
    start_rop, end_rop = datetime.utcfromtimestamp(next_rop_epoch), datetime.utcfromtimestamp(end_rop_epoch)
    next_rop_time_str = start_rop.strftime('A%Y%m%d.%H%M') + '-' + end_rop.strftime('%H%M')


def fetch_and_generate_new_file_names(rop):
    nf_list = ROP_TO_NF_MAP[rop]
    file_map = {}
    for f in filter(None, os.listdir(input_location)):
        if f.startswith(rop) and f.endswith(FILE_EXT):
            for nf in nf_list:
                if nf in f.upper():
                    old_file_path = os.path.join(input_location, f)
                    new_file_name = f.replace(rop, next_rop_time_str)
                    dest_file_path = os.path.join(sftp_loc, new_file_name)
                    file_map[old_file_path] = dest_file_path
                    break
    return file_map


def distribute_work_and_start_file_transfer(proc_map):
    logging.info('Initiating file sftp process.')
    transfer_pool = None
    try:
        logging.info('Initiating process pool.')
        transfer_pool = Pool(sftp_instance)
        for proc_id in proc_map.keys():
            proc_args = (proc_id, proc_map[proc_id], sftp_host, sftp_user, sftp_pass, sftp_log_loc)
            transfer_pool.apply_async(file_sftp, args=proc_args)
        transfer_pool.close()
    except KeyboardInterrupt:
        logging.error('Key Board Interrupt acknowledged. Terminating process.')
        set_terminate_event()
    except Exception:
        logging.error('Issue with initiating file transfer process pool. Terminating process.')
        print_exc()
        set_terminate_event()
    finally:
        transfer_pool.join()
    if terminate_tool.is_set():
        terminate_script()


def prepare_file_naming():
    global UNIQUE_ROP_LIST, sftp_instance
    try:
        src_rop_name = UNIQUE_ROP_LIST.pop(0)
        UNIQUE_ROP_LIST.append(src_rop_name)
        logging.info('Input source rop, ' + src_rop_name + ' will be used to generate rop, ' + next_rop_time_str)
        f_map = fetch_and_generate_new_file_names(src_rop_name)
        logging.info('New name generated for old rop : ' + src_rop_name)

        if len(f_map.keys()) < sftp_instance:
            sftp_instance = len(f_map.keys())
        logging.info('Number of sftp proc instance : ' + str(sftp_instance))

        sftp_proc_counter = 0
        sftp_proc_to_file_map = defaultdict(lambda: defaultdict())
        for f in f_map.keys():
            if sftp_proc_counter >= sftp_instance:
                sftp_proc_counter = 0
            sftp_proc_to_file_map[sftp_proc_counter][f] = f_map[f]
            sftp_proc_counter += 1
        logging.info('File distribution completed across process.')

        keys = f_map.keys()
        for key in keys:
            del f_map[key]
        del keys[:]

        logging.info('Next file transfer will start by ' + (datetime.fromtimestamp(next_rop_epoch)).strftime('%Y-%m-%d %H:%M:%S') + ' LOCAL')
        # wait till time logic
        try:
            while get_epoch_time() < next_rop_epoch:
                sleep(0.1)
        except KeyboardInterrupt:
            logging.error('Key Board Interrupt acknowledged. Terminating process.')
            set_terminate_event()
        except Exception:
            logging.error('Issue while waiting for file transfer wait time. Terminating process.')
            print_exc()
            set_terminate_event()

        distribute_work_and_start_file_transfer(sftp_proc_to_file_map)
    except Exception:
        print_exc()
        set_terminate_event()


def initiate_file_transfer():
    prepare_file_naming()
    get_next_rop_sending_time()


def main(args):
    global input_location, sftp_loc, sftp_host, sftp_pass, sftp_user
    if len(args) != 5:
        print ('ERROR : Invalid arguments given.')
        print ('/path/script.py <input_data_location> <sftp_host> <sftp_user> <sftp_pass> <location>')
        sys.exit()
    initiate_logger()
    input_location, sftp_host, sftp_user, sftp_pass, sftp_loc = correct_path(args[0]), args[1], args[2], args[3], correct_path(args[4])
    if os.path.isdir(input_location):
        get_next_rop_sending_time(True)
        if len(UNIQUE_ROP_LIST) > 0:
            while True:
                initiate_file_transfer()
        else:
            logging.error('No input found at location, ' + input_location)
    else:
        logging.error('Either Input or Output location does not exist.')


if __name__ == '__main__':
    main(sys.argv[1:])
