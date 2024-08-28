#!/usr/bin/python

import httplib
import os.path
import shutil
import sys
import urllib2

from utils import Utility
util = Utility()

util.intiate_logging_function('network_up_version')

# CONSTANT VARIABLE
nexus_url = 'https://arm1s11-eiffel004.eiffel.gic.ericsson.se:8443/nexus/content/groups/public/'
project_repo_url = 'com/ericsson/oss/mediation/model/nrm/function/radionode-node-model-gpb-protofiles-src/'
jar_name = 'radionode-node-model-gpb-protofiles-src-LATEST_JAR_VERSION.jar'
backup_jar_location = os.path.join(util.getMainDirectory(), 'BACK_UP_DIR')
existing_jar_location = os.path.join(util.getMainDirectory(), 'lib')
ERROR, INFO, WARNING = 'ERROR', 'INFO', 'WARNING'

# CONFIG INI FILE PARAM
app_config_file = 'config.ini'
app_config_obj = util.return_ini_Object(app_config_file)

if app_config_obj is None:
    util.printStatement(ERROR, 'Issue while forming config.ini file object. Terminating process.', True)

# Jar version to download
jar_release_version = None
fetch_latest_delivered_jar = False

# Final url from to download
final_url_path = None


def form_full_url_path():
    """
    This method will form full url through which we can download the required jar.
    """
    global final_url_path, jar_name
    jar_name = jar_name.replace('LATEST_JAR_VERSION', jar_release_version)
    final_url_path = nexus_url + project_repo_url + jar_release_version + '/' + jar_name
    util.printStatement(INFO, 'Downloading of jar will take place through url path : ' + final_url_path)


def generate_list_from_version_id(ver_id):
    """
    This method is responsible for breaking version id by '.' to list in reverse order.
    """
    return [x for x in reversed(ver_id.split('.'))]


def get_latest_version_id(lst):
    """
    This method will find out the latest version id delivered on nexus repo by comparision.
    """
    sample_version_id_ele = generate_list_from_version_id(lst[0])
    for version in lst[1:]:
        reset = False
        for index, version_ele in enumerate([z for z in reversed(version.split('.'))]):
            if int(version_ele) > int(sample_version_id_ele[index]):
                reset = True
            elif int(version_ele) < int(sample_version_id_ele[index]):
                reset = False
        if reset:
            sample_version_id_ele = generate_list_from_version_id(version)
    return '.'.join([x for x in reversed(sample_version_id_ele)])


def process_xml_data(xml_data_list, url):
    """
    This method will process the fetched xml data by filtration and try to list all the appropriate delivered version id.
    """
    global jar_release_version
    util.printStatement(INFO, 'Processing url data...')
    ver_id_list = []
    for line in xml_data_list:
        line = line.strip()
        if line.startswith('<td><a href="' + url):
            version_id = line.split('>')[2].split('<')[0].replace('/', '')
            if any(x.isalpha() for x in version_id):
                continue
            else:
                ver_id_list.append(version_id)
    if len(ver_id_list) > 0:
        util.printStatement(INFO, 'Capturing jar version ids...')
        if fetch_latest_delivered_jar:
            jar_release_version = get_latest_version_id(ver_id_list)
            util.printStatement(INFO, 'Latest jar version ' + jar_release_version + ' found on nexus.')
        else:
            if jar_release_version in ver_id_list:
                util.printStatement(INFO, 'Given Jar version ' + jar_release_version + ' found on nexus.')
            else:
                util.printStatement(INFO, 'Given jar version ' + jar_release_version + ' not available on nexus. Terminating process.', True)
        util.printStatement(INFO, 'Processing further for downloading jar.')
    else:
        util.printStatement(WARNING, 'No delivered version found. Terminating process.', True)


def fetch_index_info_of_project():
    """
    This method will try to connect with nexus url and fetch the delivered version data from it.
    """
    url_path = nexus_url + project_repo_url
    try:
        util.printStatement(INFO, 'Trying to connect with ' + url_path)
        xml_response = urllib2.urlopen(url_path, timeout=10)
        util.printStatement(INFO, 'Connection successful.')
    except urllib2.HTTPError, e:
        util.printStatement(ERROR, 'HTTPError = ' + str(e.code), True)
    except urllib2.URLError, e:
        util.printStatement(ERROR, 'URLError = ' + str(e.reason), True)
    except httplib.HTTPException, e:
        print util.printStatement(ERROR, 'HTTPException', True)
    except Exception, e:
        util.printStatement(ERROR, 'Exception while requesting data from url.', True)
    xml_data_list = xml_response.readlines()
    if len(xml_data_list) == 0:
        util.printStatement(WARNING, 'No information available on url. Terminating process.', True)
    process_xml_data(xml_data_list, url_path)


def change_file_permission(file, permission):
    """
    This method is responsible for changing permission of file so that it can be accessible.
    """
    util.printStatement(INFO, 'Changing Jar file permissions.')
    try:
        os.chmod(file, permission)
        util.printStatement(INFO, 'Jar file permission changed successfully.')
    except Exception, e:
        util.printStatement(ERROR, 'Issue while setting permission for Jar file.', True)


def download_jar():
    """
    This method will download the jar in memory and try to write the jar data in lib location.
    """
    info_to_write = None
    try:
        util.printStatement(INFO, 'Downloading jar...')
        jar_data = urllib2.urlopen(final_url_path, timeout=10)
        info_to_write = jar_data.read()
        util.printStatement(INFO, 'Data downloaded and has been cached in memory.')
    except Exception, e:
        util.printStatement(ERROR, 'Exception while downloading jar from url.', True)
    try:
        transfer_location = os.path.join(existing_jar_location, jar_name)
        util.printStatement(INFO, 'Transferring cached data from memory to file at location : ' + transfer_location)
        with open(transfer_location, 'wb') as j_f:
            j_f.write(info_to_write)
            j_f.flush()
        util.printStatement(INFO, 'Transfer completed.')
        change_file_permission(transfer_location, 0755)
    except Exception, e:
        util.printStatement(ERROR, 'Exception while transferring jar data from memory to file.', True)


def fetch_jar_version_from_cfg_file():
    """
        This method will read the config.ini file and fetch the required information related to network up-version like,
        NETWORK_UP_VERSION_ENABLE & NETWORK_UP_VERSION_RELEASE
        In case of NETWORK_UP_VERSION_ENABLE = YES, then code will proceed for further process otherwise it will terminate.
    """
    global jar_release_version, fetch_latest_delivered_jar
    util.printStatement(INFO, 'Fetching network up-version details from config.ini file')
    is_network_up_version = app_config_obj.get('NETWORK_UP_VERSION_PARAM', 'NETWORK_UP_VERSION_ENABLE').strip().upper() == 'YES'
    if is_network_up_version:
        jar_release_version = app_config_obj.get('NETWORK_UP_VERSION_PARAM', 'NETWORK_UP_VERSION_RELEASE').strip().upper()
        if jar_release_version == 'LATEST':
            fetch_latest_delivered_jar = True
        util.printStatement(INFO, jar_release_version + ' version jar will be downloaded.')
    else:
        util.printStatement(INFO, 'NETWORK_UP_VERSION_ENABLE param is not YES. Terminating process.', True)


def backup_existing_jar():
    """
    This method will back up the existing jar to avoid any data loss before downloading new jar in lib location.
    """
    existing_jar_list = []
    try:
        if not os.path.isdir(existing_jar_location):
            util.printStatement(ERROR, 'Path ' + existing_jar_location + ' does not exists. Can not take back up of jar. Terminating process.', True)
        util.printStatement(INFO, 'Taking back up of existing jar(s).')
        for lib_file in filter(None, os.listdir(existing_jar_location)):
            if lib_file.startswith('radionode-node-model-gpb-protofiles-src') and lib_file.endswith('.jar'):
                existing_jar_list.append(lib_file)
        if len(existing_jar_list) > 0:
            if not os.path.isdir(backup_jar_location):
                util.printStatement(WARNING, 'Back up location ' + backup_jar_location + ' created.')
                os.makedirs(backup_jar_location, 0755)
            for jar_file in existing_jar_list:
                jar_file = os.path.join(existing_jar_location, jar_file)
                if not os.path.isfile(jar_file):
                    continue
                shutil.move(jar_file, backup_jar_location)
            util.printStatement(INFO, 'Existing jar backed up successfully.')
        else:
            util.printStatement(INFO, 'No jar to back up.')
    except Exception, e:
        print 'ERROR while taking bakup of jar may be same jar is already present in backup dir'
        util.printStatement(ERROR, 'Exception while taking back up of existing jar. Terminating process.', True)


# Main method
def main():
    print 'Process started.'
    util.printStatement(INFO, 'Process started.')
    fetch_jar_version_from_cfg_file()
    fetch_index_info_of_project()
    form_full_url_path()
    backup_existing_jar()
    download_jar()
    util.printStatement(INFO, 'Process completed.')
    print 'Process completed.'


if __name__ == '__main__':
    main()