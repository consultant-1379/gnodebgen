import json, sys, os
from collections import defaultdict
import xml.etree.ElementTree as ET

ns = {'etcm': 'com.ericsson.schema.etcm', \
      'ftem': 'urn:com:ericsson:schema:xml:oss:ftem'}

oper_map = {'eq': ' == ', 'neq': ' != ', 'divide': '/', 'multiply': '*', 'plus': '+', 'minus' : '-'}


g_str, incr_value = '', None
g_p_list = []

json_location = None

etcm_counter_condition_map = defaultdict(lambda: defaultdict(lambda: defaultdict()))
ftem_filter_info_map = defaultdict(lambda: defaultdict())
temp_dict = defaultdict(list)


def correct_folder_location(_loc):
    if not _loc.endswith('/'):
        return ''.join([_loc, '/'])
    return _loc


def return_tag_obj(counter_condition, t):
    """
    :param counter_condition:   any_xml_tag_obj
    :param t:                   str_value_of_tag_which_need_to_find
    :return:                    parent_tag_obj_of_tag_which_we_are_looking

    This method will find the tag which we are looking for and will return it's parent tag object

    """
    while True:
        child_list = counter_condition.getchildren()    # getting all immediate child tags
        if len(child_list) == 0:
            return None     # in case of no child tags
        else:
            for child in child_list:    # iterating on child tags
                if child.tag.replace('{' + ns['etcm'] + '}', '') == t:      # matching tag text with search string (t)
                    return counter_condition
                else:       # searching tag string recursively in child tag by getting child of existing child tag
                    dummy = return_tag_obj(child, t)        # calling same method recursively
                    if dummy is not None:
                        return dummy        # return control to parent calling method
            return      # to break while loop, if not able to find tag in entire object


def understand_etcm_counter_condition(counter_condition, obj_type, ar_op):
    """
    :param counter_condition:   any_xml_tag_object
    :param obj_type:            non_msg_tag ==> 0, msg_tag ==> 1 (aref)
    :param ar_op:               arithmetic_operation (and, or, eq, neq)
    :return:                    boolean, expression, param_list
    """
    str_mid_exp = ''
    param_list = []

    op_len = len(counter_condition.findall('etcm:op', ns))      # getting number of operation available
    if op_len == 0:
        # in case of no immediate op available, then searching recursively in entire tag obj
        counter_condition = return_tag_obj(counter_condition, 'op')
        if counter_condition is None:       # returning to parent method if no operation available in entire tag obj.
            return False, str_mid_exp, param_list

    for index, op in enumerate(counter_condition.findall('etcm:op', ns)):       # when operation is available

        op_name = op.attrib['name']

        if op_name in ['and', 'or']:
            if op_name == 'and':
                result = understand_etcm_counter_condition(op, obj_type, ' && ')        # recursive calling
            elif op_name == 'or':
                result = understand_etcm_counter_condition(op, obj_type, ' || ')        # recursive calling
            str_mid_exp += '(' + result[1] + ')'
            param_list.extend(result[2])

        elif op_name in ['eq', 'neq', 'gt']:
            pref = return_tag_obj(op, 'pref').find('etcm:pref', ns).text

            temp_obj_type = obj_type
            if return_tag_obj(op, 'aref') is not None:
                obj_type = 1

            if obj_type == 1:       # supporing msg_list parameter
                field = return_tag_obj(op, 'field').find('etcm:field', ns).text
                pref = pref + '|' + field

            obj_type = temp_obj_type

            nconst = return_tag_obj(op, 'nconst').find('etcm:nconst', ns).text

            if op_name == 'eq':
                str_mid_exp += '(' + pref + ' == ' + nconst + ')'
            elif op_name == 'neq':
                str_mid_exp += '(' + pref + ' != ' + nconst + ')'
            elif op_name == 'gt':
                str_mid_exp += '(' + pref + ' != ' + nconst + ')'

            param_list.append(pref)

        if index + 1 < op_len:
            str_mid_exp += ar_op

    return True, str_mid_exp, param_list


def find_msg_data_type(obj):
    """
    This method is responsible to find the data type of msg parameter tag, whether it's mref or aref
    :param obj:     any_xml_tag_object
    :return:        mref/aref
    """
    for c in obj.getchildren():     # getting all childs
        if c.tag.replace('{' + ns['etcm'] + '}', '') in ['mref', 'aref']:       # matching with mref/aref
            return obj, c.tag.replace('{' + ns['etcm'] + '}', '')
        else:           # checking recursively
            return find_msg_data_type(c)


def return_immediate_finding_obj(obj, tag):
    """
    This method is responsible to find tag object which we are looking for on immediate next hierarchy of input xml object (obj)
    :param obj:         input_xml_tag_obj
    :param tag:         tag_search_string
    :return:            tag_object_which_we_want_to_find
    """
    for o in obj.getchildren():
        if o.tag.replace('{' + ns['etcm'] + '}', '') == tag:
            return o
    return None


def find_obj_value(obj, tag):
    """
    This method is responsible to find value of desired tag by calling recursively
    :param obj:         input xml tag
    :param tag:         string of tag which we want to find
    :return:            value of tag which we want to find
    """
    value = None
    super_obj = return_tag_obj(obj, tag)
    if super_obj is not None:
        value = return_immediate_finding_obj(super_obj, tag)
        if value is not None:
            value = value.text
    return value


def understand_set_operation(op_obj):
    global g_str, g_p_list
    operation = op_obj.attrib['name']
    g_str += '('
    child_list = op_obj.getchildren()
    for child in child_list:
        if child.tag.replace('{' + ns['etcm'] + '}', '') == 'op':
            understand_set_operation(child)
            g_str += oper_map[operation]
        if child.tag.replace('{' + ns['etcm'] + '}', '') in ['nconst', 'pref']:
            g_str += child.text
            g_p_list.append(child.text)
            if operation is not None:
                g_str += oper_map[operation]
    if g_str[-1] in ['/', '*', '+', '-']:
        g_str = g_str[:-1]
    g_str += ')'


def understand_etcm_step_expression(step_expr, type='ACC'):
    # This method will help to form step expression and to get param list for step expression
    global g_str, g_p_list, incr_value
    g_str, g_p_list, incr_value = '', [], None

    child_list = step_expr.getchildren()

    # handling for normal step expression
    if child_list[0].tag.replace('{' + ns['etcm'] + '}', '') == 'incr':
        incr_nconst = return_immediate_finding_obj(child_list[0], 'nconst')
        if incr_nconst is not None:
            incr_value = incr_nconst.text
        incr_op = return_immediate_finding_obj(child_list[0], 'op')
        if incr_op is not None:
            understand_set_operation(incr_op)
            g_p_list = [x for x in g_p_list if not x.isdigit()]
            if incr_nconst is None:
                incr_value = 'SAME_AS_EXPRESSION'
            return g_str, g_p_list
        incr_pref = return_immediate_finding_obj(child_list[0], 'pref')
        if incr_pref is not None:
            if incr_nconst is None:
                incr_value = incr_pref.text
            return '(' + incr_pref.text + ' != null )', [incr_pref.text]
        return None, []
    elif child_list[0].tag.replace('{' + ns['etcm'] + '}', '') == 'set' and type == 'MAX':
        sub_child = child_list[0].getchildren()[0]
        if sub_child.tag.replace('{' + ns['etcm'] + '}', '') == 'pref':
            return '(' + child_list[0].find('etcm:pref', ns).text + ' != null )' ,[child_list[0].find('etcm:pref', ns).text]
        elif sub_child.tag.replace('{' + ns['etcm'] + '}', '') == 'op':
            understand_set_operation(sub_child)
            g_p_list = [x for x in g_p_list if not x.isdigit()]
            return g_str, g_p_list

    # Handling for message type step expression
    elif child_list[0].tag.replace('{' + ns['etcm'] + '}', '') == 'foreach':
        msg_child_list = child_list[0].getchildren()

        pref_param = msg_child_list[0].text     # getting parameter name
        second_obj = msg_child_list[1]          # getting second tag

        if second_obj.tag.replace('{' + ns['etcm'] + '}', '') == 'if':      # This is for message type condition
            operation = return_immediate_finding_obj(second_obj, 'op')      # finding immediate operation tag
            incr = return_immediate_finding_obj(second_obj, 'incr')         # finding immediate incr tag

            if operation is not None:       # if operation tag is exist and has child
                parent_msg, msg_type = find_msg_data_type(operation)        # finding message type mref/aref

                if msg_type == 'aref':      # in case of aref
                    status, expression, _l = understand_etcm_counter_condition(second_obj, 1, None)     # to get expression from operation tag

                    incr_field_list = []        # to store and form expression through incr tag
                    for incr_child in incr.getchildren():
                        incr_field_list.append(find_obj_value(incr_child, 'field'))
                    incr_field_list = [ x for x in filter(None, incr_field_list)]

                    if len(incr_field_list) > 0:
                        incr_field_list = [pref_param + '|' + x for x in incr_field_list]
                        _l.extend(incr_field_list)
                        expression = '(' + expression
                        for inc_f in incr_field_list:
                            expression += ' && (' + inc_f + ' != null) '
                        expression += ')'
                    return expression, _l

                elif msg_type == 'mref':       # in case of mref. mref does not have any incr condition
                    mref_nconst = ' != null'
                    temp = find_obj_value(operation, 'nconst')

                    if temp is not None:
                        mref_nconst = oper_map[operation.attrib['name']] + temp
                    temp_expr = '(' + pref_param + mref_nconst + ')'
                    return temp_expr, [pref_param]

        elif second_obj.tag.replace('{' + ns['etcm'] + '}', '') == 'incr':  # in case it is incr step expression only
            incr_field_list = []
            # New Code Begins
            is_first_field_available = False
            for incr_child in second_obj.getchildren():
                if return_immediate_finding_obj(second_obj, 'nconst') is not None:
                    incr_value = return_immediate_finding_obj(second_obj, 'nconst').text
                else:
                    incr_field_list.append(find_obj_value(incr_child, 'field'))
                    if incr_value is None:
                        if not is_first_field_available:
                            incr_value = pref_param + '|' + find_obj_value(incr_child, 'field')
                            is_first_field_available = True
            # New Code Ends

            # Old Code Begins
            '''
            for incr_child in second_obj.getchildren():
                incr_field_list.append(find_obj_value(incr_child, 'field'))
            '''
            # Old Code Ends

            incr_field_list = [x for x in filter(None, incr_field_list)]
            if len(incr_field_list) > 0:
                incr_field_list = [ pref_param + '|' + x for x in incr_field_list]
                return '(' + ' && '.join([ '(' + x + ' != null )' for x in incr_field_list]) + ')', incr_field_list

        elif second_obj.tag.replace('{' + ns['etcm'] + '}', '') == 'set' and type == 'MAX':
            pref_super_obj = return_tag_obj(second_obj, 'pref')
            pref_value = pref_super_obj.find('etcm:pref', ns).text
            field_super_obj = return_tag_obj(second_obj, 'field')
            if field_super_obj is not None:
                field_value = field_super_obj.find('etcm:field', ns).text
                return '( ' + pref_value + '|' + field_value + ' != null )', [pref_value + '|' + field_value]

    return None, []


def fetch_etcm_counter_conditions(files):
    global temp_dict, etcm_counter_condition_map
    etcm_event_to_counter_map = defaultdict(lambda: defaultdict(list))

    for f in files:     # read each etcm files
        root = ET.parse(f).getroot()

        for counter in root.findall('etcm:counter', ns):        # read counter data
            counter_name = counter.find('etcm:name', ns).attrib['format']
            event_name = counter.find('etcm:pmeventname', ns).text.lower()
            mo = counter.find('etcm:mo', ns).text
            counter_data = counter.find('etcm:counterdata', ns)
            session_aggr = counter_data.find('etcm:sessionaggregation', ns)
            if session_aggr is not None:
                continue
            cnt_op = counter_data.find('etcm:counteroperation', ns).text
            counter_condition = counter_data.find('etcm:counterstepcondition', ns)
            step_expression = counter_data.find('etcm:stepexpression', ns)

            etcm_event_to_counter_map[event_name][counter_name + '|' + mo + '|' + cnt_op] = []     # make entry of event and counter name in map

            if counter_condition is not None:       # if counter condition is available
                op_finder = return_immediate_finding_obj(counter_condition, 'op')
                if op_finder is None:       # For message type params availability, only mref supported.
                    if_any_condition = return_immediate_finding_obj(counter_condition, 'ifany')
                    if if_any_condition is not None:
                        # Find first op recursively
                        op_finder = return_tag_obj(if_any_condition, 'op')
                else:
                    op_finder = counter_condition
                status, expression, _l = understand_etcm_counter_condition(op_finder, 0, None)
                if status:      # verify expression is not empty
                    etcm_counter_condition_map[event_name][counter_name + '|' + mo + '|' + cnt_op]['normal'] = expression
                    for param in filter(None, _l):
                        etcm_event_to_counter_map[event_name][counter_name + '|' + mo + '|' + cnt_op].append(param)

            if step_expression is not None:     # is step expression is available
                expr, _l = understand_etcm_step_expression(step_expression, cnt_op)
                if cnt_op == 'ACC' and incr_value is not None:
                    etcm_counter_condition_map[event_name][counter_name + '|' + mo + '|' + cnt_op]['step_value'] = incr_value
                if expr is not None:        # check for expression is not empty
                    etcm_counter_condition_map[event_name][counter_name + '|' + mo + '|' + cnt_op]['step'] = expr
                    for param in filter(None, _l):
                        etcm_event_to_counter_map[event_name][counter_name + '|' + mo + '|' + cnt_op].append(param)

    for event in etcm_event_to_counter_map.keys():      # re-arranging etcm_event_to_counter_map in temp_map
        counter_list, param_list = [], []
        for counter in etcm_event_to_counter_map[event].keys():
            if counter not in counter_list:
                counter_list.append(counter)
            for param in etcm_event_to_counter_map[event][counter]:
                if param not in param_list:
                    param_list.append(param)
        param_list.sort(key=len)
        param_list.reverse()
        temp_dict[event].append(','.join(counter_list))
        temp_dict[event].append(','.join(param_list))

    with open(''.join([json_location, 'etcm_event_info.json']), 'w') as jf:
        json.dump(temp_dict, jf, indent=2)
        print 'INFO : ETCM event information created.'
    with open(''.join([json_location, 'etcm_conditions.json']), 'w') as jf:
        json.dump(etcm_counter_condition_map, jf, indent=2)
        print 'INFO : ETCM conditions json created.'


def process_filter_information(f):
    return_map = {}
    if f.find('ftem:range', ns) is not None:
        return_map['_TYPE'] = 'INT'
        return_map['MIN'] = f.find('ftem:range', ns).find('ftem:min', ns).text
        return_map['MAX'] = f.find('ftem:range', ns).find('ftem:max', ns).text
    elif f.find('ftem:enumeration', ns) is not None:
        members = f.find('ftem:enumeration', ns).findall('ftem:member', ns)
        return_map['_TYPE'] = 'ENUM'
        for m in members:
            return_map[m.attrib['name']] = m.text
    else:
        return_map['_TYPE'] = 'UNDEFINED'
    return return_map


def process_ftem_event_information(e):
    return


def fetch_ftem_counter_conditions(files):
    global ftem_filter_info_map, ftem_event_to_filter_map
    for f in files:

        root = ET.parse(f).getroot()
        function = root.find('ftem:managed_function', ns).text
        filters = root.find('ftem:filters', ns)
        events = root.find('ftem:events', ns)
        for filter in filters.findall('ftem:filter', ns):
            ftem_filter_info_map[function][filter.attrib['name']] = process_filter_information(filter)
        sys.exit()
        for event in events.findall('ftem:event', ns):
            ftem_event_to_filter_map[function][event.attrib['name']] = process_ftem_event_information(event)
    with open(''.join([json_location, 'ftem_filters_info.json']), 'w') as jf:
        json.dump(ftem_filter_info_map, jf, indent=4)
    with open(''.join([json_location, 'ftem_event_to_filter_info.json']), 'w') as jf:
        json.dump(ftem_event_to_filter_map, jf, indent=4)
        print 'INFO : FTEM related information has been generated.'


def main(args):     # Main method
    global json_location

    if len(args) == 3:      # checking args counts

        etcm_xml_location, ftem_xml_location, json_location = correct_folder_location(args[0]), \
                correct_folder_location(args[1]), correct_folder_location(args[2])      # correcting path string

        # fetching file list
        etcm_file_list = [ ''.join([etcm_xml_location, x]) for x in filter(None, os.listdir(etcm_xml_location)) if x.startswith('etcm') and x.endswith('.xml')]
        ftem_file_list = [ ''.join([ftem_xml_location, x]) for x in filter(None, os.listdir(ftem_xml_location)) if x.startswith('ftem') and x.endswith('.xml')]

        if len(etcm_file_list) > 0:     # processing etcm files
            print 'INFO : Generating ETCM conditions json file.'
            fetch_etcm_counter_conditions(etcm_file_list)
        else:
            print 'WARN : No etcm files present to process.'
            sys.exit(1)

        if len(ftem_file_list) > 0:     # processing ftem files
            print 'INFO : Generating FTEM conditions json file.'
            fetch_ftem_counter_conditions(ftem_file_list)
        else:
            print 'WARN : No ftem files present to process.'
    else:
        print 'ERROR : Please provide appropriate input parameters.'


if __name__ == '__main__':      # Main
    '''
        python script.py etcm_folder ftem_folder out_folder    
    '''
    
    main(sys.argv[1:])
    '''
    main(['W:/nilesh/new_release_etcm_validation/etcm/', \
          'W:/nilesh/new_release_etcm_validation/ftem/', \
          'W:/nilesh/new_release_etcm_validation/json_report/'])
    '''
