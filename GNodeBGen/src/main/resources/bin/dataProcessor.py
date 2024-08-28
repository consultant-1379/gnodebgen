#!/usr/bin/python
import os, json, sys, time
from utils import Utility
from multiprocessing import Pool
from _collections import defaultdict
from traceback import print_exc

util = Utility()

cur_directory = None
objectList = []
HOUR = 60
concurrent_pool_cnt = 1
sentObjMap = defaultdict(list)
package_path = 'com.ericsson.tcs.controller.MainController'
JRE_7 = 'jre1.7.0_80'
JRE_8 = 'jre1.8.0_231'


def findCurrentDirectory(name):
    global cur_directory
    cur_directory = os.path.dirname(os.path.realpath(__file__))


def callJavaWithArguments(inObj, json_obj_str, rop_string, total_rop_count):
    """ Call Java argument from here """
    try:
        JRE = JRE_8
        lib_path = os.path.join(os.path.dirname(cur_directory), 'lib')
        lib_args = ':'.join([os.path.join(lib_path, lib) for lib in filter(None, os.listdir(lib_path))])
        os.system( os.path.dirname(cur_directory) + '/jre/' + JRE + '/bin/java -server -cp ' + lib_args + ' -Djava.library.path=/netsim/GNodeBGen/jre/' + JRE + '/lib ' + package_path + ' "' + json_obj_str.replace('"', '\\"') + '" ' + rop_string + ' ' + total_rop_count + ' ' + os.path.dirname(cur_directory))
    except Exception as e:
        print_exc()
    finally:
        return inObj.get_data_source_name(), json_obj_str, rop_string, total_rop_count


def collect_result(result):
    """ This method will collect the result of invoked multi processed instance. """
    global sentObjMap
    for index, value in enumerate(result[1:]):
        sentObjMap[result[0]].append(result[index + 1])


def findRequiredBatchToCreate():
    global objectList
    ropListForGeneration = []
    sim_pool_size = Pool(concurrent_pool_cnt)
    for obj in objectList:
        if not obj.get_unique_rop():
            continue
        constantBatchCount = (int(obj.get_no_of_batch()) * HOUR)/int(obj.get_rop_period())
        newinterLocationList = [os.path.join(obj.get_intermediate_location(), obj.get_data_source_name(), obj.get_rop_period(), networkFn) for networkFn in obj.get_network_function_list()]
        countOfExistedRop = 0
        for location in newinterLocationList:
            if not os.path.isdir(location):
                os.makedirs(location), os.chmod(location, 0755)
        #countOfExistedRop = len(list(set([ x.split('_')[0] for x in os.listdir(newinterLocationList[0])])))
        countOfExistedRop = len(os.listdir(newinterLocationList[0]))
        deltaRopsCount = constantBatchCount - countOfExistedRop
        current_index, countOfUniqueRop = int(obj.get_start_from_rop()), len(obj.get_unique_rop())
        countOfRopToGenerate = 0
        for i in range(0, deltaRopsCount):
            if countOfUniqueRop > current_index:
                ropListForGeneration.append(obj.get_unique_rop()[current_index])
                current_index += 1
            else:
                ropListForGeneration.append(obj.get_unique_rop()[0])
                current_index = 1
        obj.set_start_from_rop(current_index)
        countOfRopToGenerate = len(ropListForGeneration)
        if ropListForGeneration:
            sim_pool_size.apply_async(callJavaWithArguments, args=(obj, json.dumps(obj.__dict__), ','.join(ropListForGeneration), str(countOfRopToGenerate),), callback=collect_result)
    sim_pool_size.close()
    sim_pool_size.join()
    if ropListForGeneration:
        util.createSerializedObjectFile(os.path.dirname(cur_directory), objectList)


def main(script_name):
    global objectList
    findCurrentDirectory(script_name)
    objectList = util.loadSerializedFileData(os.path.dirname(cur_directory))
    findRequiredBatchToCreate()


if __name__ == '__main__':
    main(sys.argv[0])
