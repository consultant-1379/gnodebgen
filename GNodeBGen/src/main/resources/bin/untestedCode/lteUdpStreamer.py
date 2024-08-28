import gzip
import sys
import socket
import time

msgBuffer = None
udp_addr = None
udp_conn = None
start_stream_time = None


def read_binary_ue_trace_file(compressedFile):
    global msgBuffer
    fileObj = None
    try:
        fileObj = gzip.open(compressedFile, 'rb')
        binaryInfo = fileObj.read()
        if binaryInfo != '':
            msgBuffer = binaryInfo
        else:
            print 'ERROR : No data present in input files.'
            fileObj.close()
            return None
    except Exception, e:
        print e
        print 'ERROR : Issue with reading files.'
        fileObj.close()
    fileObj.close()
    return msgBuffer


def close_udp_connection():
    global udp_conn
    try:
        if udp_conn is not None:
            udp_conn.close()
    except Exception, e:
        pass


def recursive_call_for_udp_conn_creation(status):
    time.sleep(3)
    create_udp_connections(status)


def create_udp_connections(isFirst=True):
    global udp_conn
    try:
        udp_conn = socket.socket(family=socket.AF_INET, type=socket.SOCK_DGRAM)
        udp_conn.settimeout(3)
    except Exception, e:
        print e
        close_udp_connection()
        if isFirst:
            print 'ERROR : Issue with making connection first time.'
            sys.exit()
        else:
            print 'ERROR : Issue with making connection. Will retry after 3 seconds.'
            recursive_call_for_udp_conn_creation(False)


def recursive_udp_streamer():
    global start_stream_time
    stream_status = True
    start_stream_time = int(time.time())
    is_first_data = True
    while stream_status:
        if is_first_data:
            is_first_data = False
        else:
            while time.time() < start_stream_time:
                time.sleep(0.1)
        try:
            udp_conn.sendto(msgBuffer, udp_addr)
            start_stream_time += 1
            print 'INFO : Amount of sent data to Server is : ' + str(len(msgBuffer)) + '.'
        except socket.error, se:
            print se
            print 'ERROR : Socket error while sending data through socket.'
            close_udp_connection()
            recursive_call_for_udp_conn_creation(False)
            start_stream_time = int(time.time())
        except Exception, e:
            print e
            print 'ERROR : Issue while sending data through socket.'
            close_udp_connection()
            stream_status = False
    print 'INFO : Exiting process.'


def main(args):
    global udp_addr
    inputFile = args[0]
    udp_addr = (args[1], int(args[2]))
    if read_binary_ue_trace_file(inputFile) is not None:
        create_udp_connections()
        recursive_udp_streamer()
    else:
        print 'INFO : Exiting process.'


if __name__ == '__main__':
    main(sys.argv[1:])