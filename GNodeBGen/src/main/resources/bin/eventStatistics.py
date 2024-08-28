#!/usr/bin/python

'''
    This script is responsible for providing output of event present in each file and total size of all the events.
    python eventStatistics.py <input_location_path_of_nf_data>
'''

import os, gzip, struct, sys

path = None
fileList = []


def calculateEventsInFile():
    for file in fileList:
        in_f = gzip.open(file, 'rb')
        totalEventsPerFile = 0
        totalEventsSize = 0
        eventsLenPerSec = in_f.read(4)
        while eventsLenPerSec != '':
            thirdByte, secondByte, firstByte, zerothByte = struct.unpack('<BBBB', eventsLenPerSec)
            totalBytesToRead = (secondByte * 65536) + (firstByte * 256) + zerothByte
            index = 0
            while index < totalBytesToRead:
                eventRecordByte = in_f.read(1)
                eachEventByteLen = struct.unpack('<B', eventRecordByte)[0]
                index += 1
                totalEventsSize += 1
                if eachEventByteLen > 127:
                    eventRecordByte = in_f.read(1)
                    eachEventByteLen = (eachEventByteLen - 128) + (struct.unpack('<B', eventRecordByte)[0] * 128)
                    index += 1
                    totalEventsSize += 1
                in_f.read(eachEventByteLen)
                index += eachEventByteLen
                totalEventsSize += eachEventByteLen
                totalEventsPerFile += 1
            eventsLenPerSec = in_f.read(4)
        print 'File name : ' + file + ', Total Events : ' + str(totalEventsPerFile) + ', Total Events Size : ' + str(totalEventsSize)


def fecthFiles():
    global fileList, path
    path = sys.argv[1]
    if not path.endswith('/'):
        path += '/'
    fileList = [ path + x for x in filter(None, os.listdir(path))]


fecthFiles()
calculateEventsInFile()
