# ------------------------------------------------------------------------------
# *******************************************************************************
# * COPYRIGHT Ericsson 2020
# *
# * The copyright to the computer program(s) herein is the property of
# * Ericsson Inc. The programs may be used and/or copied only with written
#    * permission from Ericsson Inc. or in accordance with the terms and
# * conditions stipulated in the agreement/contract under which the
# * program(s) have been supplied.
# *******************************************************************************
# *----------------------------------------------------------------------------*/

# Read an ETCM file
# and out the events, counters and attributes used so a pattern can be generated
#
# freely stolen from Osama'a etcm_diff.py work.
#

#!/user/bin/env python
import xml.etree.ElementTree as ET
import difflib
import sys
import getopt
import argparse
from colorama import init
import logging
import datetime

try:
    from StringIO import StringIO  # for Python 2
except ImportError:
    from io import StringIO  # for Python 3

# Return type Dict
def xml_data_read(file_path_input):
    event_dict ={}
    try:
        logging.info(
            '[%s] READING THE FILE "%s" DATA'
            % (datetime.datetime.now(), file_path_input)
        )

        # Read and Creating a Tree from the xml file
        tree = ET.parse(file_path_input)
        # Get the XML file ROOT
        root = tree.getroot()
        sRoot = str(root[0])

        # getting the path from the root <Element '{com.ericsson.schema.etcm}counters' at 0x058516B8>
        # {com.ericsson.schema.etcm}
        ERICSSONPATH = (
            "{"
            + sRoot[
                sRoot.index("{")
                + len("{") : sRoot.index("}", sRoot.index("{") + len("{"))
            ]
            + "}"
        )

        # Variables to hold the data
        xml_dict_data = dict()
        pref_list = list()
        operation_list = list()
        counter_data_object = list()
        # looping inside the xml file and parse the data
        for counter in root.findall("./%scounter" % (ERICSSONPATH)):
            # read the counter name from
            # <name format="pmEbsEndcPSCellChangeSuccIntraSgnb"/>
            name = counter.find("./%sname" % (ERICSSONPATH))

            # read the PM EVENT NAME from
            # <pmeventname>test_CuCpProcX2SnInitiatedSgnbModification</pmeventname>
            pmevent_name = counter.find("./%spmeventname" % (ERICSSONPATH))
            if pmevent_name.text not in event_dict:
                event_dict[pmevent_name.text] = {'counters':[], 'attributes':[], 'or':False}
            event_dict[pmevent_name.text]['counters'].append(name.attrib['format'])
            # Loop inside the counter/counterdata tags to convert the data to list of list and save in counter_data_object:
            # XML CODE EXAMPLE:
            #      <counter>
            #     <name format="pmEbsEndcPSCellChangeSuccIntraSgnb"/>
            #     <counterdata>
            # <<<<READ ALL DATA WITH THE OPEN-CLOSE TAG>>>>>
            #     </counterdata>
            for node in counter.find("./%scounterdata" % (ERICSSONPATH)):
                for elem in node.iter():
                    if elem.tag == "%spref" % (ERICSSONPATH):
                        pref_list.append(elem.text)
                        event_dict[pmevent_name.text]['attributes'].append(elem.text)
                    if elem.tag == "%sop" % (ERICSSONPATH):
                        operation_list.append(elem.attrib["name"])
                        if elem.attrib["name"] == 'or':
                            event_dict[pmevent_name.text]['or'] = True
                    counter_data_object.append(
                        "%s,%s,%s"
                        % (
                            str(elem.tag).replace(" ", ""),
                            str(elem.attrib).replace(" ", ""),
                            str(elem.text).replace(" ", ""),
                        )
                    )
                    for elem_child in elem:
                        counter_data_object.append(
                            "%s,%s,%s"
                            % (
                                str(elem_child.tag).replace(" ", ""),
                                str(elem_child.attrib).replace(" ", ""),
                                str(elem_child.text).replace(" ", ""),
                            )
                        )

            # Save the data in a structured dict  xml_dict_data
            if name.attrib["format"] not in xml_dict_data.keys():
                xml_dict_data[name.attrib["format"]] = {
                    "pmeventname": pmevent_name.text,
                    "prefList": pref_list,
                    "opList": operation_list,
                    "counterDataObject": counter_data_object,
                }
            else:
                doublicated_counter.append(
                    file_path_input + " >> " + name.attrib["format"]
                )
                diff_total_count["doublicatedCounters"] += 1

            # Empty the lists after each counter loop
            pref_list = []
            operation_list = []
            counter_data_object = []
        # Return the xml file as dict
    except OSError:
        logging.warning(
            '[%s] THE FILE: " %s " NOT FOUND IN DIRECTORY'
            % (datetime.datetime.now(), file_path_input)
        )
        logging.error("[%s] PROCESS TERMINATED" % (datetime.datetime.now()))
        sys.exit()
    else:
        logging.info(
            '[%s] READING THE FILE "%s" DATA COMPLETED'
            % (datetime.datetime.now(), file_path_input)
        )

    return xml_dict_data, event_dict

def main():
    ## read the argument sent from the user input.
    ap = argparse.ArgumentParser()
    ap.add_argument(
        "-i", "--inFile", required=True, help="The Path to the ETCM file"
    )
    args = vars(ap.parse_args())
    etcm_earler = args["inFile"]
    # process the entered etcm files
    etcm_earler_dict_data, event_dict = xml_data_read(etcm_earler)
    # print(event_dict)
    # for evt in sorted(event_dict.keys()):
    #    # print ('event %s trigers counters %s'% ( evt, ' ,'.join(event_dict[evt]['counters'])))
    #    print('\nevent: %s'%evt)
    #    print(event_dict[evt])

    ec = 0
    cc = 0
    ac = 0
    for evt in sorted(event_dict.keys()):
        ec += 1
        print('\n# event Id %s trigger %d counters'%(evt, len(event_dict[evt]['counters'])))
        if event_dict[evt]['or']:
            print('# OR conditions exist!')
        for cntr in event_dict[evt]['counters']:
            print(' # %s'% cntr)
            cc +=1
        print('id = %s'% evt)
        for attr in set(event_dict[evt]['attributes']):
            print('set = %s'% attr)
            ac += 1
    print('\n# %d events, %d counters, %d attributes'%(ec, cc, ac))

if __name__ == "__main__":
    main()
