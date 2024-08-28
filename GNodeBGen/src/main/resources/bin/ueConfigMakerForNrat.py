#!/usr/bin/python
import os
from shutil import rmtree
import sys

ueForNratFileLocation = '/netsim_users/pms/etc/.ueConfigForNrat.txt'
sim_info_file = '/netsim/genstats/tmp/sim_info.txt'
netsim_dbdir = '/netsim/netsim_dbdir/simdir/netsim/netsimdir'
ue_file = '154kb_ue_trace.gz'

nr_sim_list = []
nr_sim_node_map = {}


def collectNratSimList():
    global nr_sim_list
    if os.path.isfile(sim_info_file):
        with open(sim_info_file, 'r') as f:
            for line in f:
                line = line.strip().split(':')
                if line[1] == 'GNODEBRADIO':
                    if len(line) == 3:
                        if line[2].upper() == 'MIXEDNRAT':
                            nr_sim_list.append(line[0])
    else:
        print 'WARNING: ' + sim_info_file + ' not available. Skipping config finder operation for NRAT simulations.'
        sys.exit()


def mapNrNodeWithSim():
    global nr_sim_node_map
    for nr_sim in nr_sim_list:
        sim_path = os.path.join(netsim_dbdir, nr_sim)
        node_list = [ node for node in filter(None, os.listdir(sim_path)) if os.path.isdir(os.path.join(sim_path, node)) ]
        if node_list:
            nr_sim_node_map[nr_sim] = node_list 
        else:
            print 'ERROR: No nodes found for Nrat simulation : ' + nr_sim + ' in ' + netsim_dbdir + ' location.' 


def writeConfigFile(env_rop_period, file_count, file_io_mode):
    dataList = []
    with open(ueForNratFileLocation, file_io_mode) as f:
        start_count, end_count = 1, 0
        for sim, node_list in nr_sim_node_map.iteritems():
            node_count = len(node_list)
            end_count = end_count + (node_count * file_count)
            dataList.append(ue_file + ':' + sim + ':1:' + str(node_count) + ':' + str(start_count) + ':' + str(end_count))
            start_count = end_count + 1
        f.write('NR_UE_CONFIG_' + env_rop_period + '=' + ' '.join(dataList) + '\n')


def main():
    if os.path.isfile(ueForNratFileLocation):
        os.remove(ueForNratFileLocation)
    collectNratSimList()
    if nr_sim_list:
        mapNrNodeWithSim()
    else:
        print 'INFO: No Nrat simulation available.'
    if nr_sim_node_map:
        writeConfigFile('MAINTRACK_15_MIN', 16, 'w')  # For MainTrack 15 Min Rop
        writeConfigFile('MAINTRACK_1_MIN', 1, 'a')  # FFor MainTrack 1 Min Rop
        print 'INFO: UE configuration for Nrat written successfully in file ' + ueForNratFileLocation
        

if __name__ == '__main__':
    main()

