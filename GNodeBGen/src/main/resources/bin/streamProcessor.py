#!/usr/bin/python

from _collections import defaultdict
import gzip, json, os, sys
from multiprocessing import Pool, Process, Event, Queue
import struct, socket, errno
import threading
from time import time, sleep

from ConnectionManager import ConnectionManager
from utils import Utility

util = Utility()

script_location = os.path.dirname(os.path.realpath(__file__))
streamerArgsJsonFile = os.path.join(os.path.dirname(script_location), 'config', 'streamerArgs.json')

# string parameter
mainEngineId = None
rop_time_stamp = None
CONNECTED, DROPPED, FAILED = 'CONNECTED', 'DROPPED', 'FAILED'

# int parameters
rop_splitter_key, rop_seconds, rop_sections = 1, 900, 3
read_ahead = (rop_seconds/rop_sections)
first_rop_epoch_time = 0
fileReadProcessInstance = 1
init_feeding_after_time = 3

# boolean parameters
repeatRop = False

# list parameters
ip_table_list = None
nodeList = None
repeatitiveInputRopList = None

# map parameters
interMediatLocationMap = None
file_read_pointer_map = {}
binary_data_map = defaultdict(lambda : defaultdict(lambda : defaultdict()))

# mp queue parameters
stream_data_queue = Queue(maxsize=(read_ahead * 3))

# mp event parameters
is_terminate = Event()
is_terminate.clear()


def set_tool_termination_event():
    if not is_terminate.is_set():
        is_terminate.set()
        stream_data_queue.close()
        sleep_for(10)


def wait_till_system_time(go_ahead_time, check_time=1):
    while time() < go_ahead_time:
        sleep_for(check_time)


def sleep_for(seconds):
    sleep(seconds)


def deployEndOfRopInQueue():
    util.printStatement('INFO', 'Injecting End of ROP Object as no further ROP found in intermediate to process.')
    stream_data_queue.put('TERMINATE')


def setGlobalParameters():
    util.printStatement('INFO', 'Setting up streaming configurations.')
    try:
        global ip_table_list, first_rop_epoch_time, interMediatLocationMap, \
                rop_time_stamp, fileReadProcessInstance, nodeList, repeatRop

        refMainEngineString = 'mainEngineId=' + str(mainEngineId)
        argDataStore = None

        if not os.path.isfile(streamerArgsJsonFile):
            util.printStatement('ERROR', 'File ' + streamerArgsJsonFile + ' not found.')
            sys.exit()

        with open(streamerArgsJsonFile, 'r') as streamArgs:
            argDataStore = json.load(streamArgs)

        if not argDataStore[refMainEngineString]['isRunTimePreCook']:
            repeatRop = True

        fileReadProcessInstance = int(argDataStore[refMainEngineString]['fileReaderPerMainEngine'])

        nodeList = argDataStore[refMainEngineString]['nodeList']
        if len(nodeList) <= 0:
            util.printStatement('ERROR', 'Node list can not be empty.', True)
            sys.exit()
        util.printStatement('INFO', 'Number of nodes set for this MainEngine : ' + str(len(nodeList)))

        interMediatLocationMap = argDataStore[refMainEngineString]['interMediateMap']
        if not interMediatLocationMap:
            util.printStatement('ERROR', 'Network function key details not present for intermediate directory. Terminating process.')
            sys.exit()
        first_rop_epoch_time = int(argDataStore[refMainEngineString]['firstRopTime'])
        ip_table_list = util.getIpConfiguration(argDataStore[refMainEngineString]['address'])
        rop_time_stamp = util.convertEpochToRopTimeFormat(first_rop_epoch_time) + '_' + str(rop_splitter_key)
        util.printStatement('INFO', 'Streaming configurations has been set.')
    except Exception as e:
        util.printStatement('ERROR', 'Issue with reading ' + streamerArgsJsonFile + ' file. Terminating process.')
        util.printStatement('ERROR', e)
        sys.exit()


def backgroundQueueFeeder():
    global first_rop_epoch_time, rop_time_stamp, rop_splitter_key
    init_epoch = first_rop_epoch_time
    while 1:
        if is_terminate.is_set():
            return
        if time() > (init_epoch + init_feeding_after_time):
            if rop_splitter_key == rop_sections:
                first_rop_epoch_time += rop_seconds
                rop_splitter_key = 1
                rop_time_stamp = util.convertEpochToRopTimeFormat(first_rop_epoch_time) + '_' + str(rop_splitter_key)
            else:
                rop_splitter_key += 1
                rop_time_stamp = rop_time_stamp.split('_')[0] + '_' + str(rop_splitter_key)
            util.printStatement('INFO', 'Feeding data in Queue for next ROP : ' + rop_time_stamp)
            if not processFileInformationAndInitiateQueue():
                break
            init_epoch += read_ahead
        else:
            sleep_for(0.25)


def createConnections():
    global connections

    status = False

    succ_conn, failed_conn = 0, 0
    sock_errs_set, temp_err_list = [], []

    util.printStatement('INFO', 'Creating socket connections.')

    for ne_nf, ip_info in nes_to_ip_map.iteritems():
        try:
            sock = ConnectionManager(ip_info[0], ip_info[1])
            sock.establish_connection()
            sock.set_connected()
            connections[ne_nf] = sock
            succ_conn += 1
        except socket.error as e:
            failed_conn += 1
            error_line = str(e).replace('\n', '').replace(' ', '')
            if error_line not in temp_err_list:
                temp_err_list.append(error_line)
                sock_errs_set.append(e)
        except KeyboardInterrupt as e:
            util.printStatement('ERROR', 'Keyboard interrupt.')
        except Exception as e:
            util.printStatement('ERROR', str(e))
            util.printStatement('ERROR', 'Exception while creating connections.')

    if failed_conn > 0:
        util.printStatement('ERROR', 'Connection status, passed : ' + str(succ_conn) + ', failed : ' + str(failed_conn))
        util.printStatement('ERROR', 'Captured socket exception(s) : [' + ','.join([str(line) for line in sock_errs_set]) + ']')

    if succ_conn == len(nes_to_ip_map.keys()):
        util.printStatement('INFO', 'All socket connections has been created. Total connection count : ' + str(succ_conn))
        status = True

    return status


def map_nes_with_ip():
    _map = {}
    address_counter = 0
    for ne in nodeList:
        if address_counter >= len(ip_table_list):
            address_counter = 0
        for n_f in interMediatLocationMap.keys():
            _map['|'.join([ne, n_f])] = ip_table_list[address_counter]
        address_counter += 1
    return _map


def close_all_connections():
    global connections
    util.printStatement('INFO', 'Closing all socket connection for tool termination.')
    for ne_nf in nes_to_ip_map.keys():
        if ne_nf in connections.keys():
            try:
                if connections[ne_nf] is not None:
                    connections[ne_nf].set_failed()
                    sock = connections[ne_nf].get_sock_obj()
                    sock.close()
            except Exception as e:
                pass
    util.printStatement('INFO', 'All socket connection closed.')


def reconnect_worker():
    global connections

    util.printStatement('INFO', 'Started connection maintenance worker thread.')

    while 1:
        if is_terminate.is_set():
            return
        sleep_for(5)
        new_conn_created, dropped_count = 0, 0
        for ne_nf, ip_info in nes_to_ip_map.iteritems():
            conn_class_obj = connections[ne_nf]
            conn_status = conn_class_obj.get_status()
            if conn_status == CONNECTED:
                continue
            elif conn_status == FAILED:
                close_all_connections()
                set_tool_termination_event()
                return
            elif conn_status == DROPPED:
                dropped_count += 1
                try:
                    old_socket = conn_class_obj.get_sock_obj()
                    old_socket.close()
                    new_socket = ConnectionManager(ip_info[0], ip_info[1])
                    new_socket.establish_connection()
                    connections[ne_nf] = new_socket
                    connections[ne_nf].set_connected()
                    new_conn_created += 1
                except Exception as e:
                    pass
        if dropped_count > 0:
            util.printStatement('INFO', 'New connections created : ' + str(new_conn_created) + ', against dropped connection(s) : ' + str(dropped_count))


def eventStreamProcess():
    global connections, nes_to_ip_map
    stream_epoch = first_rop_epoch_time
    first_connection_time = stream_epoch - 90
    nes_to_ip_map = map_nes_with_ip()

    util.printStatement('INFO', 'Streaming will start on : ' + str(stream_epoch) + ' OR ' + rop_time_stamp + ' UTC.')

    wait_till_system_time(first_connection_time, 0.25)

    connections = {}
    if not createConnections():
        util.printStatement('ERROR', 'Issue while creating connections first time. Terminating process.')
        close_all_connections()
        set_tool_termination_event()
        return

    try:
        reconnect = threading.Thread(target=reconnect_worker, args=())
        reconnect.daemon = True
        reconnect.start()
    except Exception as e:
        util.printStatement('ERROR', e)
        util.printStatement('ERROR', 'Issue with reconnect worker. Terminating tool.')
        close_all_connections()
        set_tool_termination_event()
        return

    while 1:
        try:
            if is_terminate.is_set():
                break

            each_second_data = stream_data_queue.get()

            if each_second_data == 'TERMINATE':
                util.printStatement('WARNING', 'Termination object found.')
                break

            stream_info = each_second_data[stream_epoch]

            wait_till_system_time(stream_epoch, 0.1)

            sent_counter, sent_volume = 0, 0
            for node_nf, byte_array_data in stream_info.iteritems():
                conn_class_obj = connections[node_nf]
                if conn_class_obj is None:
                    continue
                conn_status = conn_class_obj.get_status()
                if conn_status == FAILED:
                    set_tool_termination_event()
                    break
                if conn_status == DROPPED:
                    continue
                my_socket = conn_class_obj.get_sock_obj()
                if byte_array_data is None:
                    util.printStatement('WARNING', 'Stream info not present for element ' + node_nf + ' for epoch : ' + str(stream_epoch))
                    sent_counter += 1
                else:
                    remaining_attempt = 3
                    while len(byte_array_data) > 0 and remaining_attempt > 0:
                        try:
                            sent = my_socket.send(byte_array_data)
                            sent_volume, byte_array_data = (sent_volume + sent), byte_array_data[sent:]
                            if len(byte_array_data) > 0:
                                remaining_attempt -= 1
                                sleep_for(0.05)
                            else:
                                sent_counter += 1
                                break
                        except socket.error, e:
                            util.printStatement('ERROR', e)
                            if e.errno == errno.EAGAIN:
                                util.printStatement('ERROR', 'Socket writing failed due to resource temporarily un-available.')
                            else:
                                util.printStatement('ERROR', 'Facing issue while writing information on socket. Probably LVS is shut down.')
                            conn_class_obj.set_dropped()
                            break
                        except Exception, x:
                            util.printStatement('ERROR', x)
                            util.printStatement('ERROR', 'Exception while streaming data. Terminating tool.')
                            close_all_connections()
                            set_tool_termination_event()
                            return
                    if remaining_attempt == 0:
                        util.printStatement('ERROR', 'Socket writing attempt left : 0 for Node element : ' + node_nf)
            util.printStatement('INFO', 'Stream statistics : { epoch: ' + str(stream_epoch) + ', #connection(s): ' + str(sent_counter) + ', volume: ' + str(sent_volume) + ' bytes}')
            stream_epoch += 1
        except Exception as e:
            util.printStatement('ERROR', e)
            util.printStatement('ERROR', 'Exception occurred while streaming data on socket. Terminating tool.')
            set_tool_termination_event()
            break

    close_all_connections()
    set_tool_termination_event()
    return


def waitForStreaming():
    try:
        util.printStatement('INFO', 'Invoking queue feeder thread.')
        feederThread = threading.Thread(target=backgroundQueueFeeder, args=())
        feederThread.daemon = True
        feederThread.start()
        util.printStatement('INFO', 'Queue feeder thread invoked.')
    except Exception as e:
        util.printStatement('ERROR', e)
        util.printStatement('ERROR', 'Issue faced while initiating background feeder thread.')
        set_tool_termination_event()

    if is_terminate.is_set():
        return

    event_streamer = None
    try:
        event_streamer = Process(target=eventStreamProcess, args=())
        event_streamer.start()
    except KeyboardInterrupt as k:
        util.printStatement('ERROR', 'Acknowledged keyboard interrupt. Terminating process.')
        set_tool_termination_event()
    except Exception as e:
        util.printStatement('ERROR', e)
        util.printStatement('ERROR', 'Issue with event streaming process. Terminating tool.')
        set_tool_termination_event()
    finally:
        event_streamer.join()


def fetchRepeatitiveRop(parentPath):
    global repeatitiveInputRopList
    fullPath = os.path.join(parentPath, repeatitiveInputRopList[0])
    repeatitiveInputRopList = repeatitiveInputRopList[1:] + [repeatitiveInputRopList[0]]
    if os.path.isdir(fullPath):
        return fullPath
    else:
        util.printStatement('ERROR', 'Repetitive ROP folder ' + fullPath + ' not found for next ROP data.')
        deployEndOfRopInQueue()
        return None


def collectFileList():
    ''' fileDataListPerNode = { node_name : { nf : file } } '''
    fileDataListPerNode = defaultdict(lambda : defaultdict())

    util.printStatement('INFO', 'Listing intermediate files.')

    rop_dir = rop_time_stamp.split('_')[0]

    for nf, locations in interMediatLocationMap.iteritems():
        for location in locations:
            rop_path = os.path.join(location, rop_dir)
            if not os.path.isdir(rop_path):
                if repeatRop:
                    rop_path = fetchRepeatitiveRop(location)
                    if not rop_path:
                        return {}
                else:
                    util.printStatement('WARNING',
                                        'Next ROP folder ' + rop_path + ' not found. Streaming will stop after completing current ROP.')
                    deployEndOfRopInQueue()
                    return {}
            inputFileList = filter(None, os.listdir(rop_path))
            if len(inputFileList) > 0:
                for inputFile in inputFileList:
                    node_name = inputFile.split('_CellTrace_')[-1].split('.')[0]
                    if node_name in nodeList:
                        fileDataListPerNode[node_name][nf] = os.path.join(rop_path, inputFile)
            else:
                util.printStatement('ERROR',
                                    'Files not found at path ' + rop_path + '. Streaming will stop after completing current ROP.')
                deployEndOfRopInQueue()
                return {}
    util.printStatement('INFO', 'Intermediate file listing completed.')
    return fileDataListPerNode


def getBinaryFileData(node, nf_map):
    ''' nf_map = { nf : file } '''
    ''' events_map = {epoch_sec : event_bytearry } '''
    ''' node_nf_events_map = { node|nf : events_map } '''

    if is_terminate.is_set():
        return None, None

    file_instance = int(rop_time_stamp.split('_')[1])
    node_nf_events_map = {}
    file_pointer_map = {}

    for nf, f in nf_map.iteritems():
        custom_key = '|'.join([node, nf])
        binaryFile = None
        events_map = {}
        try:
            binaryFile = gzip.open(f, 'rb')
            if file_instance != 1:
                binaryFile.seek(file_read_pointer_map[f])
            event_start_time = first_rop_epoch_time + ((file_instance - 1) * read_ahead)
            event_end_time = event_start_time + read_ahead
            byteInfo = binaryFile.read(4)
            while byteInfo != '':
                byte_three, byte_two, byte_one, byte_zero = struct.unpack('<BBBB', byteInfo)
                read_length = (byte_two * 65536) + (byte_one * 256) + byte_zero
                events_map[event_start_time] = binaryFile.read(read_length)
                event_start_time += 1
                if event_start_time < event_end_time:
                    byteInfo = binaryFile.read(4)
                else:
                    break
            node_nf_events_map[custom_key] = events_map
            if file_instance != rop_sections:
                file_pointer_map[f] = binaryFile.tell()
        except Exception as e:
            is_terminate.is_set()
            util.printStatement('ERROR', 'Issue while reading binary file for node ' + node + ' having network function ' + nf + '. Terminating process.')
        finally:
            binaryFile.close()

    return node_nf_events_map, file_pointer_map


def feedInformationInMap(result):
    ''' result[0] = node_name
        result[1] = node_nf_info_map = { node|nf : {epoch_Sec : binary_data} }
        result[2] = f_pointer_map = { f : file_pointer}
    '''
    global binary_data_map, file_read_pointer_map
    node_nf_info_map, f_pointer_map = result[0], result[1]
    if node_nf_info_map:
        for node_nf, epoch_event_map in node_nf_info_map.iteritems():
            for epoch, event_array in epoch_event_map.iteritems():
                binary_data_map[rop_time_stamp][epoch][node_nf] = event_array
    if f_pointer_map:
        for f, position in f_pointer_map.iteritems():
            file_read_pointer_map[f] = position


def clearFileReadPointerMap():
    if int(rop_time_stamp.split('_')[1]) == rop_sections:
        file_read_pointer_map.clear()


def generate_stream_data_queue():
    if rop_time_stamp in binary_data_map.keys():
        util.printStatement('INFO', 'Transferring stream data to streaming queue for rop : ' + rop_time_stamp)
        sorted_keys = sorted(binary_data_map[rop_time_stamp].keys())
        for epoch_value in sorted_keys:
            stream_data_queue.put({epoch_value: binary_data_map[rop_time_stamp][epoch_value]})
            binary_data_map[rop_time_stamp].pop(epoch_value, None)
        binary_data_map.pop(rop_time_stamp, None)
        util.printStatement('INFO', 'Transfer of stream data to streaming queue is completed for rop : ' + rop_time_stamp)
        util.printStatement('INFO', 'Queue size : ' + str(stream_data_queue.qsize()))
    else:
        util.printStatement('ERROR', 'Not able to find next ROP key to load streaming queue. Terminating process.')
        set_tool_termination_event()


def loadFileData(fileListBasedOnNode):
    ''' fileListBasedOnNode = { node_name : { nf : file } '''
    util.printStatement('INFO', 'Collecting binary data from intermediate files.')
    status = True
    processInstance = Pool(fileReadProcessInstance)
    try:
        for node, nf_file_map in fileListBasedOnNode.iteritems():
            processInstance.apply_async(getBinaryFileData, args=(node, nf_file_map), callback=feedInformationInMap)
        processInstance.close()
    except KeyboardInterrupt:
        status = False
        util.printStatement('ERROR', 'Key Board Interrupt acknowledged. Terminating tool.')
        processInstance.terminate()
    except Exception as x:
        status = False
        util.printStatement('ERROR', 'Issue while initiating pool for binary file reader.')
        util.printStatement('ERROR', x)
        processInstance.terminate()
    finally:
        processInstance.join()

    if status:
        util.printStatement('INFO', 'Binary data collection completed.')
        generate_stream_data_queue()
        clearFileReadPointerMap()
    else:
        set_tool_termination_event()


def processFileInformationAndInitiateQueue(firstExecution=False):
    status = False
    if firstExecution and repeatRop:
        global repeatitiveInputRopList
        countOfNetFun = len(interMediatLocationMap.keys())
        refPath = interMediatLocationMap[interMediatLocationMap.keys()[0]][0]
        repeatitiveInputRopList = sorted([x for x in filter(None, os.listdir(refPath))] * rop_sections * countOfNetFun)
        if len(repeatitiveInputRopList) <= 0:
            util.printStatement('ERROR', 'No ROP data present at location : ' + refPath + '. Terminating process.', True)
            sys.exit()

    result = collectFileList()

    if len(result.keys()) > 0:
        loadFileData(result)
        status = True

    if firstExecution and not status:
        sys.exit()

    return status


def main(args):
    global mainEngineId
    mainEngineId = args.split('=')[1]
    util.initiate_streaming_logging_function(mainEngineId)
    setGlobalParameters()
    processFileInformationAndInitiateQueue(True)
    waitForStreaming()


if __name__ == '__main__':
    main(sys.argv[1])