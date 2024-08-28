#!/usr/bin/python

'''
Owner xmanabh
'''

import sys
from math import ceil

cucp_epp, cuup_epp, du_epp = 0, 0, 0
cucp_epspn, cuup_epspn, du_epspn = 0, 0, 0
total_epp, total_epspn, total_epsan = 0, 0, 0
no_of_nodes = 0

ROP_PERIOD_MIN = 15
MAX_DATASET_DURATION_IN_HOUR = 12
MIN_SECOND, HOUR_SECOND = 60, 3600


def process_information():
    no_of_rop_to_consider = (MAX_DATASET_DURATION_IN_HOUR * HOUR_SECOND)/(ROP_PERIOD_MIN * MIN_SECOND)
    print 'Information needs to be generated for : ' + str(no_of_rop_to_consider) + ' ROP.'

    total_events_per_rop = total_epspn * ROP_PERIOD_MIN * MIN_SECOND

    total_events_in_n_th_rop = []
    for i in range(no_of_rop_to_consider):
        total_events_in_n_th_rop.append(total_events_per_rop + (i * total_events_per_rop))

    total_pattern_count_in_n_th_rop = []
    print 'Index | Events in Rop | Pattern Count'
    for rop_index, no_of_events in enumerate(total_events_in_n_th_rop):
        # Float value of no of pattern can be adjusted up to that nth rop
        pattern_count = (no_of_events * 1.0)/total_epp
        total_pattern_count_in_n_th_rop.append(pattern_count)
        print str(rop_index + 1) + ' | ' + str(no_of_events) + ' | ' + str(pattern_count)

    selected_rop = int(input('Please select ROP : '))

    no_of_pattern_needed_till_that_rop = ceil(total_pattern_count_in_n_th_rop[selected_rop - 1])
    no_of_events_needed_till_that_rop = no_of_pattern_needed_till_that_rop * total_epp

    print 'No of ROP needed to generate : ' + str(selected_rop)
    print 'No of pattern included in total ROP(s) : ' + str(no_of_pattern_needed_till_that_rop)
    print 'No of events included in total ROP(s) : ' + str(no_of_events_needed_till_that_rop)

    cucp_event_in_dataset = no_of_pattern_needed_till_that_rop * cucp_epp
    cuup_event_in_dataset = no_of_pattern_needed_till_that_rop * cuup_epp
    du_event_in_dataset = no_of_pattern_needed_till_that_rop * du_epp

    new_epspn = ((no_of_events_needed_till_that_rop * 1.0)/selected_rop)/(MIN_SECOND * ROP_PERIOD_MIN)
    new_epsan = new_epspn * no_of_nodes

    print 'Total cucp event in dataset : ' + str(cucp_event_in_dataset)
    print 'Total cuup event in dataset : ' + str(cuup_event_in_dataset)
    print 'Total du event in dataset : ' + str(du_event_in_dataset)

    print 'Modified eps per node : ' + str(new_epspn)
    print 'Adjusted eps per network : ' + str(new_epsan)


def main(args):
    if len(args) < 7:
        print 'cucp_epp, cuup_epp, du_epp, cucp_epspn, cuup_epspn, du_epspn, no_of_nodes'
        sys.exit()

    global cucp_epp, cuup_epp, du_epp, cucp_epspn, cuup_epspn, du_epspn, \
        no_of_nodes, total_epp, total_epspn, total_epsan
    args_list = [int(x) for x in args]
    cucp_epp, cuup_epp, du_epp, cucp_epspn, cuup_epspn, du_epspn, no_of_nodes = args_list
    total_epp = cucp_epp + cuup_epp + du_epp
    total_epspn = cucp_epspn + cuup_epspn + du_epspn
    total_epsan = total_epspn * no_of_nodes

    print 'cucp_events_per_pattern : ' + str(cucp_epp)
    print 'cuup_events_per_pattern : ' + str(cuup_epp)
    print 'du_events_per_pattern : ' + str(du_epp)
    print 'total_events_per_pattern : ' + str(total_epp)

    print 'cucp_events_per_second : ' + str(cucp_epspn)
    print 'cuup_events_per_second : ' + str(cuup_epspn)
    print 'du_events_per_second : ' + str(du_epspn)
    print 'total_events_per_second_per_nodes : ' + str(total_epspn)

    print 'total_nodes_in_network : ' + str(no_of_nodes)
    print 'total_events_per_second_across_network : ' + str(total_epsan)

    process_information()


if __name__ == '__main__':
    '''
        cucp_epp, cuup_epp, du_epp, cucp_epspn, cuup_epspn, du_epspn, no_of_nodes
        13475, 1800, 22959, 179921, 8996, 294258, 5000
    '''
    arguments = sys.argv[:1]
    #arguments = [13475, 1800, 22959, 36, 2, 59, 5000]
    main(arguments)