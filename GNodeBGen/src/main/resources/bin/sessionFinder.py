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
import os
import sys
import ConfigParser

from utils import Utility
util = Utility()

package_path = 'com.ericsson.tcs.controller.MainController'
CALLING_NAME = 'sessionFinder'
JRE_7 = 'jre1.7.0_80'
JRE_8 = 'jre1.8.0_231'

def loadSessionFinderServiceConfig():
    config = util.return_ini_Object('config.ini')
    inputLocation = (config.get("SESSION_FINDER_PARAM", "INPUT_LOCATION")).strip()
    outputLocation = (config.get("SESSION_FINDER_PARAM", "OUTPUT_LOCATION")).strip()
    session_attribute = (config.get("SESSION_FINDER_PARAM", "SESSION_ATTRIBUTES")).strip()
    events_to_ignore = (config.get("SESSION_FINDER_PARAM", "EVENTS_TO_IGNORE")).strip()
    session_interval = (config.get("SESSION_FINDER_PARAM", "SAME_SESSIONID_MINUTES_INTERVAL_IN_SEC")).strip()
    session_end_events = (config.get("SESSION_FINDER_PARAM", "SESSION_END_EVENTS")).strip()
    specific_pattern_extration = (config.get("SESSION_FINDER_PARAM", "SPECIFIC_PATTERN_BASED_ON_NCI_AND_UE")).strip()
    isPatternBaseFileRequire = (config.get("SESSION_FINDER_PARAM", "IS_PATTERN_WISE_FILE_REQUIRE")).strip()
    appendFileLocation = (config.get("SESSION_FINDER_PARAM", "FILE_LOCATION")).strip()
    if inputLocation == "" or outputLocation == "" or session_attribute == "" or session_interval == "":
         util.printStatement('ERROR',
                            'Please provide proper configuration for session finder. Please refer config.ini inside config location.',
                            True)
    callSessionFinderService(inputLocation, outputLocation, session_attribute, events_to_ignore, session_interval, session_end_events,specific_pattern_extration,isPatternBaseFileRequire,appendFileLocation)

def callSessionFinderService(inputLocation, outputLocation, session_attribute, events_to_ignore, session_interval, session_end_events,specific_pattern_extration,isPatternBaseFileRequire,appendFileLocation):
    """ Call Java argument from here """
    try:
        JRE = JRE_8
        lib_path = os.path.join(os.path.dirname(util.CURRENT_DIR), 'lib')
        lib_args = ':'.join([os.path.join(lib_path, lib) for lib in filter(None, os.listdir(lib_path))])
        os.system(os.path.dirname(util.CURRENT_DIR) + '/jre/' + JRE + '/bin/java -server -cp ' + lib_args + ' ' + package_path + ' ' +CALLING_NAME+ ' ' + inputLocation + ' ' + outputLocation + ' '+session_attribute+ ' '+events_to_ignore +' '+str(session_interval)+' '+session_end_events+' '+specific_pattern_extration+' '+isPatternBaseFileRequire+' '+appendFileLocation)
    except Exception as e:
        print_exc()

def main(script_name):
    loadSessionFinderServiceConfig();

if __name__ == '__main__':
    main(sys.argv[0])