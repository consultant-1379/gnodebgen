#!/usr/bin/python

''' ------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *---------------------------------------------------------------------------- '''
 
'''
Created on Jul 2, 2019

@author: xmanabh
'''

import os, sys

from utils import Utility
u = Utility()

sim_data_file = '/netsim/genstats/tmp/sim_data.txt'
user_input_file = os.path.join(u.getMainDirectory(), 'config/user_input.xml')
headerEndTag, sampleStartTag, sampleEndTag, footerStartTag = '<DataSources>', '<DataSource name=', '</DataSource>', '</DataSources>'
fiveGNodeTypeList = ['GNODEBRADIO']
simReplaceString = '<DataSource name='
xmlDataList, nr_sim_list = [], []


''' This method reads sim_data.txt file store all the fiveg sim name in nr_sim_list '''
def readSimulationInformation():
    global nr_sim_list
    if os.path.isfile(sim_data_file):
        with open(sim_data_file, 'r') as f:
            for line in f:
                lineElement = line.split()
                sim_name, ne = lineElement[1].strip(), lineElement[5].strip().upper()
                if ne in fiveGNodeTypeList:
                    nr_sim_list.append(sim_name)
    else:
        u.printStatement('ERROR', sim_data_file + ' does not exists.', True)


''' This method generate the new user_input.xml file from header, sample and footer information in xmlDataList ''' 
def generateUserInputFile():
    with open(user_input_file, 'w') as fout:
        for line in xmlDataList:
            fout.write(line)
        fout.flush()


''' This method reads existing user_input.xml file and store header information in xmlDataList '''
def readHeaderInformation():
    global xmlDataList
    if os.path.isfile(user_input_file):
        with open(user_input_file, 'r') as fin:
            for line in fin:
                if 'isTopologyEnrichment' in line:
                    line = '                <isTopologyEnrichment>YES</isTopologyEnrichment>\n'
                if '<isStreamingRequired>' in line:
                    line = '                <isStreamingRequired>NO</isStreamingRequired>\n'
                xmlDataList.append(line)
                if headerEndTag in line:
                    break
    else:
        u.printStatement('ERROR', user_input_file + ' does not exists. Terminating process.', True)


''' This method reEvaluate Sample Data list according to 5G sims available on server '''
def reEvaluateSampleInformation(infoList):
    global xmlDataList
    for sim in nr_sim_list:
        for info in infoList:
            if sampleStartTag in info:
                info = info.replace( info.split('"')[1] , sim)
            xmlDataList.append(info)


''' This method reads existing user_input.xml file and store sample information in xmlDataList '''
def readSampleInformation():
    sampleList = []
    with open(user_input_file, 'r') as fin:
        startReading = False
        for line in fin:
            if not startReading:
                if sampleStartTag in line:
                    startReading = True
                    sampleList.append(line)
            else:
                sampleList.append(line)
                if sampleEndTag in line:
                    break
    reEvaluateSampleInformation(sampleList)
    

''' This method reads existing user_input.xml file and store footer information in xmlDataList '''
def readFooterInformation():
    global xmlDataList
    with open(user_input_file, 'r') as fin:
        startReading = False
        for line in fin:
            if not startReading:
                if footerStartTag in line:
                    startReading = True
                    xmlDataList.append(line)
                continue
            xmlDataList.append(line)
            

def main():
    readSimulationInformation()
    if nr_sim_list:
        readHeaderInformation()
        readSampleInformation()
        readFooterInformation()
        generateUserInputFile()
    else:
        print 'No NRAT simulation present. Can not create user input file.'
        sys.exit()


if __name__ == '__main__':
    main()

