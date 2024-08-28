#!/usr/bin/python
'''
Created on Jul 18, 2019

@author: xmanabh
'''

import ConfigParser
import cPickle, datetime, logging, os, errno, sys
from shutil import copy, rmtree
from subprocess import Popen, PIPE
from time import strftime, gmtime
from traceback import print_exc


class Utility(object):
    
    started_node_file = '/tmp/showstartednodes.txt'
    netsimdir = '/netsim/netsimdir'
    
    ''' CONSTANTS '''
    ONE_MIN, FIVE_MIN, FIFTEEN_MIN = 1, 5, 15
    ONE_MIN_IN_SEC, FIVE_MIN_IN_SEC, FIFTEEN_MIN_IN_SEC = 60, 300, 900
    ONE_SEC, THREE_SEC, FIVE_SEC, TEN_SEC, THIRTY_SEC, FIFTY_SEC = 1, 3, 5, 10, 30, 50
    TWENTY_FIVE_MILLS, FIFTY_MILLS, HUNDRED_MILLS, TWO_FIFTY_MILLS, FIVE_HUNDRED_MILLS = 0.025, 0.05, 0.1, 0.25, 0.5
    ZERO, ONE, THREE, FIVE = 0, 1, 3, 5
    READ_ONLY_MODE, WRITE_ONLY_MODE = 'r', 'w'
    GZIP_EXT, JSON_EXT, XML_EXT, BIN_EXT = '.gz', '.json', '.xml', '.bin'
    PIPE_SEP, COLON_SEP, COMMA_SEP, EQUAL_SEP, UNDERSCORE_SEP, DASH_SEP, DOUBLE_QUOTE, PATH_SEP, EMPTY = '|', ':', ',', '=', '_', '-', '"', '/', ''
    INFO, INSTR, DEBUG, WARN, ERROR = 'INFO', 'INSTR', 'DEBUG', 'WARNING', 'ERROR'
    FIRST_INDEX, LAST_INDEX = 0, -1
    BACKUP_CRON_PATH = '/tmp/5G_CRON_BACKUP'
    CURRENT_DIR = os.path.dirname(os.path.realpath(__file__))
    CONFIG_DIR = os.path.join(os.path.dirname(CURRENT_DIR), 'config')


    def getMainDirectory(self):
        return os.path.dirname(os.path.dirname(os.path.realpath(__file__)))
    
    def getLogDirectory(self):
        return os.path.join(self.getMainDirectory(), 'logs')
    
    def intiate_logging_function(self, log_file_name):
        common_loging = log_file_name + '.log'
        log_formatter = "%(asctime)s [%(levelname)s] %(message)s"
        logging.basicConfig(filename=os.path.join(self.getLogDirectory(), common_loging) , format=log_formatter, level=logging.INFO)
    
    def initiate_streaming_logging_function(self, mainEngineId):
        stream_processor_log = 'streaming_mainEngine_' + str(mainEngineId) + '.log'
        log_formatter = "%(asctime)s [%(levelname)s] %(message)s"
        logging.basicConfig(filename=os.path.join(self.getLogDirectory(), stream_processor_log) , format=log_formatter, level=logging.INFO)
    
    def getDateTime(self):
        return strftime("%Y-%m-%d %H:%M:%S", gmtime())
    
    def getStartedNodeListForSim(self, sim):
        searchString = self.netsimdir + '/' + sim
        resultList = []
        with open(self.started_node_file, 'r') as f:
            for line in f:
                line = line.strip()
                if not line.startswith('#') and searchString in line:
                    resultList.append(line.split()[0])
        return resultList

    def get_ser_file_location(self, directory):
        return os.path.join(directory, 'config', '.user_input.ser')

    def createSerializedObjectFile(self, directory, objectParamList):
        ser_user_input = self.get_ser_file_location(directory)
        self.printStatement('INFO', 'Creating ' + ser_user_input + ' serialized file.')
        if os.path.isfile(ser_user_input):
            os.remove(ser_user_input)
        ser_file = open(ser_user_input, 'wb')
        cPickle.dump(objectParamList, ser_file)
        ser_file.close()
        self.printStatement('INFO', 'Serialized file ' + ser_user_input + ' created.')

    def printStatement(self, msg_level_type, msg, exitStatus=False):
        msg_level = msg_level_type.upper()
        if msg_level == 'INFO':
            logging.info(msg)
        elif msg_level == 'WARNING':
            logging.warn(msg)
        elif msg_level == 'ERROR':
            logging.error(msg)
        if exitStatus:
            sys.exit()
    
    def simpleConsolePrinter(self, msg_level_type, msg, exitStatus=False):
        print self.getDateTime() + ' ' + msg_level_type.upper() + ': ' + msg
        if exitStatus:
            sys.exit()

    def loadSerializedFileData(self, directory):
        objectList = []
        serPath = self.get_ser_file_location(directory)
        if not os.path.isfile(serPath):
            self.printStatement('ERROR', 'Serialized file ' + serPath + ' is not available. Exiting process.', True)
        serFileObj = open(serPath, 'rb')
        objectList = cPickle.load(serFileObj)
        serFileObj.close()
        return objectList

    def makeUniqueDataList(self, inputList):
        uniqueList = []
        for index, value in enumerate(inputList):
            if index == 0:
                uniqueList.append(value)
            else:
                if value not in uniqueList:
                    uniqueList.append(value)
        return uniqueList

    def copyFileFromSourceToDest(self, srcFile, destLocation):
        try:
            copy(srcFile, destLocation)
            return True
        except Exception as e:
            if e.errno == errno.ENOENT:
                self.printStatement('ERROR', 'Destination location ' + destLocation + ' is not exist.')
                return False
            elif e.errno == errno.EEXIST:
                self.printStatement('WARNING', 'File ' + os.path.basename(srcFile) + ' is already exists at ' + destLocation + '.')
                return True
            else:
                self.printStatement('ERROR', 'Something went wrong while copying file.')
                print_exc()
                return False

    def removeDirectory(self, directory):
        try:
            rmtree(directory)
            self.printStatement('INFO', 'Directory ' + directory + ' successfully deleted')
            return True
        except Exception as e:
            if e.errno == errno.ENOENT:
                self.printStatement('WARNING', 'Can not delete as directory ' + directory + ' is not exist.')
                return True
            else:
                print_exc()
                return False
    
    def int_to_bytes(self, value, length):
        result = []
        for i in range(0, length):
            result.append(value >> (i * 8) & 0xff)
        result.reverse()
        return result
    
    def bytes_to_int(self, bytes):
        result = 0
        for b in bytes:
            result = result * 256 + int(b)
        return result
    
    def get_left_shift_pad(self, shift):
        if shift == 1:
            return 0xfe
        elif shift == 2:
            return 0xfc
        elif shift == 3:
            return 0xf8
        elif shift == 4:
            return 0xf0
        elif shift == 5:
            return 0xe0
        elif shift == 6:
            return 0xc0
        elif shift == 7:
            return 0x80

    def get_right_shift_pad(self, shift):
        if shift == 1:
            return 0x7f
        elif shift == 2:
            return 0x3f
        elif shift == 3:
            return 0x1f
        elif shift == 4:
            return 0x0f
        elif shift == 5:
            return 0x07
        elif shift == 6:
            return 0x03
        elif shift == 7:
            return 0x01
    
    def convertEpochToRopTimeFormat(self, epochInSeconds):
        return datetime.datetime.utcfromtimestamp(epochInSeconds).strftime('%Y%m%d.%H%M')
    
    def convertToSeconds(self, datetime_obj):
        return (datetime_obj.seconds + (datetime_obj.days * 3600 * 24))
    
    def convertRopTimeStamptToEpoch(self, rop_time):
        return int(self.convertToSeconds(datetime.datetime.strptime(rop_time, '%Y%m%d.%H%M') - datetime.datetime(1970, 1, 1)))
    
    def getIpConfiguration(self, input_address_list):
        ip_table_list = []
        for destAddress in input_address_list:
            elements = destAddress.split(':')
            ip_table_list.append((elements[0], int(elements[1])))
        return ip_table_list
    
    def getServerName(self):
        from _socket import gethostname
        return gethostname()
    
    def getCpuCount(self):
        from multiprocessing import cpu_count
        return cpu_count()
    
    def run_shell_command(self, input):
        output = Popen(input, stdout=PIPE, shell=True).communicate()[0]
        return output

    def return_ini_Object(self, appConfigLocation):
        config_object = None
        try:
            location = os.path.join(self.CONFIG_DIR, appConfigLocation)
            if not os.path.isfile(location):
                self.printStatement('ERROR', 'Location : ' + location + ' does not exists.', True)
            config_object = ConfigParser.ConfigParser()
            config_object.read(location)
        except Exception, e:
            print str(e)
        finally:
            return config_object

