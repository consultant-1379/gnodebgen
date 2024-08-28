'''
Created on Jul 19, 2019

@author: xmanabh
'''


class ArgumentGenerator(object):
    '''
    classdocs
    '''
    
    isRunTimePreCook = None
    fileReaderPerMainEngine = None
    interMediateMap = None
    nodeList = None
    firstRopTime = None
    requiredEps = None
    address = None
    
    

    def __init__(self, isRunTimePreCook, fileReaderPerMainEngine, interMediateMap, nodeList, firstRopTime, requiredEps, address):
        '''
        Constructor
        '''
        self.isRunTimePreCook = isRunTimePreCook
        self.fileReaderPerMainEngine = fileReaderPerMainEngine
        self.nodeList = nodeList
        self.interMediateMap = interMediateMap
        self.firstRopTime = firstRopTime
        self.requiredEps = requiredEps
        self.address = address

