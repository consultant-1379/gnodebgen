'''
Owner xmanabh
'''

import gzip
import json
import os
import sys
import threading
from collections import defaultdict
from time import time, sleep
from ConnectionManager import ConnectionManager
from utils import Utility

u = Utility()

DEST_ADDRESS = ()
ROP_PERIOD = 900
INPUT_PATH = ''
JSON_FILE_PATH = ''

STREAM_ROP_KEY_QUEUE = []
ROP_LIST_TO_CONSUME = []
NODE_LIST = []
NF_LIST = []
'''
NF_FDN_UNIQUE_IDS = { unique_key : nf|fdn, ...}
'''
NF_FDN_UNIQUE_IDS = {}

'''
CONNECTION_MAP = { unique_key : conn_obj, ...}
'''
CONNECTION_MAP = {}

'''
FILE_DESCRIPTOR_MAP = { rop_name : { unique_key : file_descriptor}, ... }
'''
FILE_DESCRIPTOR_MAP = defaultdict(lambda: defaultdict())

'''
EVENT_PADDING_MAP = { rop : { unique_key : padding_list }, ... }
'''
EVENT_PADDING_MAP = defaultdict(lambda: defaultdict())


def generate_first_rop_stream_time():
    t = int(time())
    t = ((t/ROP_PERIOD) * ROP_PERIOD) + ROP_PERIOD
    if (t - int(time())) < (ROP_PERIOD/3):
        t += ROP_PERIOD
    return t


def generate_next_rop_stream_time(previous_time):
    return previous_time + ROP_PERIOD


def make_connections():
    global CONNECTION_MAP
    print 'Making connections.'
    for key in NF_FDN_UNIQUE_IDS:
        conn = ConnectionManager(DEST_ADDRESS[0], DEST_ADDRESS[1])
        conn.establishConnection()
        CONNECTION_MAP[key] = conn
    print 'Connection created successfully.'


def generate_node_list():
    global NODE_LIST, NF_LIST, NF_FDN_UNIQUE_IDS
    print 'Generating node list.'
    first_entry = True
    unique_id_counter = 1
    path = INPUT_PATH + '/' + ROP_LIST_TO_CONSUME[0]
    for nf_dir in filter(None, os.listdir(path)):
        if os.path.isdir(nf_dir):
            if nf_dir.upper() not in NF_LIST:
                NF_LIST.append(nf_dir.upper())
            if first_entry:
                first_entry = False
            else:
                for fdn in NODE_LIST:
                    NF_FDN_UNIQUE_IDS[unique_id_counter] = '|'.join([nf_dir.upper(), fdn])
                    unique_id_counter += 1
                continue
            for nf_file in filter(None, os.listdir(path + '/' + nf_dir)):
                if os.path.isfile(nf_file):
                    fdn = get_fdn_name(nf_file)
                    if fdn not in NODE_LIST:
                        NODE_LIST.append(fdn)
                        NF_FDN_UNIQUE_IDS[unique_id_counter] = '|'.join([nf_dir.upper(), fdn])
                        unique_id_counter += 1
    print 'Node list generate successfully.'


def load_file_descriptor():
    global ROP_LIST_TO_CONSUME, FILE_DESCRIPTOR_MAP, JSON_FILE_PATH, EVENT_PADDING_MAP, STREAM_ROP_KEY_QUEUE
    print 'Flushing un-wanted older cache information.'
    total_rop_key_list = sorted(FILE_DESCRIPTOR_MAP.keys())
    if len(total_rop_key_list) > 1:
        for rop_key in total_rop_key_list[::-1][1:]:
            for unq_key in FILE_DESCRIPTOR_MAP[rop_key]:
                FILE_DESCRIPTOR_MAP[rop_key][unq_key].close()
            del FILE_DESCRIPTOR_MAP[rop_key]
            print 'Older rop : ' + rop_key + ' cache data has been removed.'
            del EVENT_PADDING_MAP[rop_key]
    print 'All un-wanted older cache information has been removed.'
    if len(ROP_LIST_TO_CONSUME) < 1:
        STREAM_ROP_KEY_QUEUE.append('ABORT')
        return
    next_rop_folder = ROP_LIST_TO_CONSUME.pop(0)
    STREAM_ROP_KEY_QUEUE.append(next_rop_folder)
    print 'Loading file descriptor for next rop : ' + next_rop_folder
    file_path = INPUT_PATH + '/' + next_rop_folder
    JSON_FILE_PATH = file_path + '/rop_info.json'
    for nf_dir in filter(None, os.listdir(file_path)):
        if os.path.isdir(nf_dir) and nf_dir.upper() in NF_LIST:
            for nf_file in filter(None, os.listdir(file_path + '/' + nf_dir)):
                fdn_name = get_fdn_name(nf_file)
                if fdn_name in NODE_LIST:
                    full_file_path = file_path + '/' + nf_dir + '/' + nf_file
                    gz_f = gzip.open(full_file_path, 'rb')
                    FILE_DESCRIPTOR_MAP[next_rop_folder][get_unique_key(nf_dir.upper(), fdn_name)] = gz_f
    print 'File descriptor loaded successfully.'
    load_json_info()


def get_fdn_name(file_name):
    return file_name.split('_')[5]


def get_unique_key(nf, fdn):
    unique_key = None
    unique_value = '|'.join([nf, fdn])
    for k, v in NF_FDN_UNIQUE_IDS.iteritems():
        if v == unique_value:
            unique_key = k
            break
    return unique_key


def load_json_info():
    global EVENT_PADDING_MAP
    print 'Loading json event padding information.'
    json_f = open(JSON_FILE_PATH, 'r')
    temp_map = json.load(json_f)
    for rop, f_dict in temp_map.iteritems():
        for nf, s_dict in f_dict.iteritems():
            if nf not in NF_LIST:
                continue
            for fdn, padding_list in s_dict.iteritems():
                if fdn not in NODE_LIST:
                    continue
                EVENT_PADDING_MAP[rop][get_unique_key(nf, fdn)] = padding_list
    print 'Event padding information loaded successfully.'


def watcher(start_time):
    initiate_loader_on = start_time + 15
    while True:
        while int(time()) < initiate_loader_on:
            sleep(3)
        initiate_loader_on += ROP_PERIOD
        load_file_descriptor()


def close_connections():
    global CONNECTION_MAP
    for key, conn in CONNECTION_MAP.iteritems():
        conn.closeConnection()


def initiate_streaming():
    try:
        global STREAM_ROP_KEY_QUEUE
        while True:
            rop_to_stream = STREAM_ROP_KEY_QUEUE.pop(0)
            if rop_to_stream == 'ABORT':
                print 'Gracefully terminating tool.'
                close_connections()
                break
            if rop_to_stream not in FILE_DESCRIPTOR_MAP:
                print 'ROP : ' + rop_to_stream + ' not found in FILE_DESCRIPTOR_MAP.'
                sys.exit()
            if rop_to_stream not in EVENT_PADDING_MAP:
                print 'ROP : ' + rop_to_stream + ' not found in EVENT_PADDING_MAP.'
                sys.exit()
            rop_key_to_epoch = u.convertRopTimeStamptToEpoch(rop_to_stream[1:])
            end_rop_to_epoch = rop_key_to_epoch + ROP_PERIOD
            index = 0
            for epoch_second in range(rop_key_to_epoch, end_rop_to_epoch):
                '''
                one_sec_map = { unique_key : binary_info, ...}
                '''
                one_sec_map = {}
                for u_key, paddings in EVENT_PADDING_MAP[rop_to_stream].iteritems():
                    if index < len(paddings):
                        one_sec_map[u_key] = FILE_DESCRIPTOR_MAP[rop_to_stream][u_key].read(paddings[index])
                    else:
                        one_sec_map[u_key] = None
                index += 1
                while time() < epoch_second:
                    sleep(0.025)
                try:
                    for u_key, conn in CONNECTION_MAP.iteritems():
                        bin_info = one_sec_map[u_key]
                        if bin_info is not None:
                            conn.sendDataStream(bin_info)
                except Exception as e:
                    print 'Issue in streaming connection.'
                    print e
                    close_connections()
                    sys.exit()
    except Exception as e:
        print 'Issue in streaming method.'
        print e
        close_connections()
        sys.exit()


def main():
    generate_node_list()
    load_file_descriptor()
    make_connections()
    stream_start_time = generate_first_rop_stream_time()
    producer_thread = threading.Thread(target=watcher, args=(stream_start_time, ))
    producer_thread.daemon = True
    producer_thread.start()
    initiate_streaming()


if __name__ == '__main__':
    main()