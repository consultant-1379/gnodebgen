#!/usr/bin/python

import sys, os
from multiprocessing import Pool, cpu_count
from _collections import defaultdict
from traceback import print_exc
import gzip, struct

input_path, output_path, rop_times = None, None, None
file_count = 0
required_core_count = 1
file_locations = defaultdict(lambda : defaultdict(list))
nf_list = []


def removePaddingFromBinaryFile(in_f, out_f):
    in_f_o, out_f_o = None, None
    try:
        in_f_o = gzip.open(in_f, 'rb')
        out_f_o = gzip.open(out_f, 'wb')
        for s in range(0, 900):
            byte_three, byte_two, byte_one, byte_zero = struct.unpack('<BBBB', in_f_o.read(4))
            total_bytes_to_read = (byte_one * 256) + byte_zero
            out_f_o.write(in_f_o.read(total_bytes_to_read))
            out_f_o.flush()
    except Exception as x:
        print_exc()
    finally:
        out_f_o.close()
        in_f_o.close()

        
def validateArguments(param):
    status = True
    if param == 'input':
        if not os.path.isdir(input_path):
            print 'ERROR : Given input path : ' + input_path + ' does not exists.'
            status = False
    elif param == 'rop_time':
        global file_locations
        for x in nf_list:
            for rop in rop_times:
                _path = input_path + x + '/' + rop
                if not os.path.isdir(_path):
                    status = False
                    print 'ERROR : ROP ' + str(rop) + ' not found on location : ' + input_path + x
                else:
                    file_locations[x][rop].append(_path + '/')
    elif param == 'output':
        for nf in file_locations.keys():
            for rop in file_locations[nf].keys():
                _path = output_path + nf + '/' + rop
                if not os.path.isdir(_path):
                    try:
                        os.makedirs(_path, 0755)
                    except Exception as x:
                        print 'ERROR : Issue while creating output path : ' + _path
                        print str(x)
    return status


def getNetworkFunctionDirectory():
    global nf_list
    nf_list += [ x for x in filter(None, os.listdir(input_path)) ]
    if len(nf_list) == 0:
        print 'ERROR : No Network function directory found in input location : ' + input_path
        return False
    return True


def generateFileList():
    global file_count
    for nf in file_locations.keys():
        for rop in file_locations[nf].keys():
            for l in file_locations[nf][rop]:
                file_count += len([ x for x in filter(None, os.listdir(l)) ])
    if file_count == 0:
        print 'ERROR : No files found in intermediate ROP folders.'
        return False
    return True


def configureCpuCoreCount():
    global required_core_count
    required_core_count = int(cpu_count()/2)
    if required_core_count > 1:
        if required_core_count > 5:
            required_core_count = 5
        if required_core_count >= int(file_count/2):
            required_core_count = int(file_count/2)
    else:
        required_core_count = 1
    return required_core_count


def restructureBinaryFiles():
    input_to_ouput_map = {}
    for nf, rop_location_map in file_locations.iteritems():
        for rop, locations in rop_location_map.iteritems():
            for location in locations:
                for in_f in filter(None, os.listdir(location)):
                    input_to_ouput_map[ location +  in_f ] = output_path + nf + '/' + rop + '/' + in_f
    file_pool = Pool(required_core_count)
    for in_file, out_file in input_to_ouput_map.iteritems():
        file_pool.apply_async(removePaddingFromBinaryFile, args=(in_file, out_file))
    file_pool.close()
    file_pool.join()


def scriptExecutor():
    if validateArguments('input'):
        if getNetworkFunctionDirectory():
            if validateArguments('rop_time'):
                validateArguments('output')
                if generateFileList():
                    configureCpuCoreCount()
                    restructureBinaryFiles()


def main(args):
    global input_path, output_path, rop_times
    args = [ x for x in filter(None,args) ]
    if len(args) == 3:
        input_path = args[0]
        input_path = input_path.replace('\\', '/')
        if not input_path.endswith('/'):
            input_path += '/'
        output_path = args[1]
        output_path = output_path.replace('\\', '/')
        if not output_path.endswith('/'):
            output_path += '/'
        rop_times = args[2].split(',')
        scriptExecutor()
    else:
        print 'ERROR : Invalid number of arguments given.'
        print 'INFO : Expected arguments,\n       <input_path> <ouput_path> <rop_time_comma_seperated_if_more_than_one>'


if __name__ == '__main__':
    main(sys.argv[1:])
