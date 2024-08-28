'''
Created on Jul 1, 2019

@author: xmanabh
'''


class UserConfig():
    '''
    classdocs
    '''

    configDir = None
    outputLocation = None
    ropCount = None
    filePointer = None
    processInstance = None
    fileMap = {}
    
    def __init__(self, configDir, outputLocation, ropCount, filePointer, processInstance, fileMap):
        '''
        Constructor
        '''
        self.configDir = configDir
        self.outputLocation = outputLocation
        self.ropCount = ropCount
        self.filePointer = filePointer
        self.processInstance = processInstance
        self.fileMap = fileMap

    def get_config_dir(self):
        return self.configDir

    def get_output_location(self):
        return self.outputLocation

    def get_rop_count(self):
        return self.ropCount

    def get_file_pointer(self):
        return self.filePointer

    def get_process_instance(self):
        return self.processInstance

    def get_file_map(self):
        return self.fileMap

    def set_config_dir(self, value):
        self.configDir = value

    def set_output_location(self, value):
        self.outputLocation = value

    def set_rop_count(self, value):
        self.ropCount = value

    def set_file_pointer(self, value):
        self.filePointer = value

    def set_process_instance(self, value):
        self.processInstance = value

    def set_file_map(self, value):
        self.fileMap = value
