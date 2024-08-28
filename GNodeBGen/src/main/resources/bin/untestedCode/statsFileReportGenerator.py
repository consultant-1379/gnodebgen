import os
import sys

input_loc, report_loc, cell_trace_report_loc = None, None, None

xml_tag_map = {'counter_name': '<measType p=', 'counter_value': '<r p=', 'meas_obj': 'measValue measObjLdn='}


def correct_path_string(path_str):
    if not path_str.endswith('/'):
        path_str += '/'
    return path_str


def process_stats_file(file_read_obj):
    cnt_list, cnt_name_value_map = [], {}
    was_reading_value, meas_obj = True, ''
    for line in file_read_obj:
        if xml_tag_map['counter_name'] in line:
            if was_reading_value:
                was_reading_value = False
                del cnt_list[:]
                meas_obj = ''
            cnt_list.append(line.split('>')[1].split('<')[0])
        elif xml_tag_map['meas_obj'] in line:
            meas_obj = line.split(',')[-1].split('=')[0]
        elif xml_tag_map['counter_value'] in line:
            if not was_reading_value:
                was_reading_value = True
            index = int(line.split('"')[1]) - 1
            value = line.split('>')[1].split('<')[0]
            if ',' in value:
                value_list = value.split(',')
                exp_pdf_val_list_len = (int(value_list[0]) * 2) + 1
                if len(value_list) == exp_pdf_val_list_len:
                    # This can be PDF
                    value = ','.join([x for ind, x in enumerate(value_list[1:]) if ind % 2 == 1])
                else:
                    # This is surely multi value
                    value = ','.join(value_list)
            map_key = cnt_list[index] + '|' + meas_obj
            if map_key not in cnt_name_value_map:
                cnt_name_value_map[map_key] = value
            else:
                cnt_name_value_map[map_key] = cnt_name_value_map[map_key] + ',' + value
    return cnt_name_value_map


def consume_cell_trace_report_file(net_fun):
    report_map = {}
    print 'INFO : Searching for appropriate cell trace report file.'
    for report_file in filter(None, os.listdir(cell_trace_report_loc)):
        if net_fun not in report_file.upper():
            continue
        full_file_path = ''.join([cell_trace_report_loc, report_file])
        is_first_line = True
        with open(full_file_path) as report_obj:
            print 'INFO : Processing cell trace report file : ' + report_file
            for line in report_obj:
                line = line.replace(' ', '')
                if is_first_line:
                    is_first_line = False
                    continue
                line_eles = line.split('|')
                counter_mo, value = '|'.join([line_eles[1], line_eles[2]]), int(line_eles[4])
                if counter_mo not in report_map:
                    report_map[counter_mo] = value
                else:
                    report_map[counter_mo] = report_map[counter_mo] + value
            print 'INFO : Cell trace report file processing completed.'
    return report_map


def start_process():
    stats_file_list = [f for f in filter(None, os.listdir(input_loc)) if f.endswith('.xml')]
    if len(stats_file_list) > 0:
        print 'INFO : ' + str(len(stats_file_list)) + ' stats report file(s) found in input loc.'
        for stats_file in stats_file_list:
            print 'INFO : Processing stats report file : ' + stats_file
            nf_name = [x for x in ['DU', 'CUCP', 'CUUP'] if x in stats_file.upper()][0]
            cell_trace_report_map = consume_cell_trace_report_file('_' + nf_name + '_')
            if len(cell_trace_report_map.keys()) == 0:
                print 'ERROR : Cell trace report is empty for network function ' + nf_name
                continue
            input_file_path = ''.join([input_loc, stats_file])
            output_file_path = ''.join([report_loc, stats_file.split('.')[0] + '_report.txt'])
            with open(input_file_path) as file_reader:
                with open(output_file_path, 'w') as file_writer:
                    print 'INFO : Continuing process of stats report parsing.'
                    for key, value in process_stats_file(file_reader).iteritems():
                        final_value = str(0)
                        if len(list(set(value.split(',')))) == 1:
                            final_value = str(list(set(value.split(',')))[0])
                        else:
                            final_value = str(sum([int(x) for x in value.split(',')]))
                        if key not in cell_trace_report_map:
                            if int(final_value) == 0:
                                print 'WARNING : STATS COUNTER NOT FOUND IN CELL TRACE REPORT WITH 0 VALUE : ' + key
                            else:
                                print 'WARNING : STATS COUNTER NOT FOUND IN CELL TRACE REPORT : ' + key
                        else:
                            if int(final_value) != cell_trace_report_map[key]:
                                print 'WARNING : STATS COUNTER VALUE NOT MATCHING WITH CELL TRACE REPORT : ' + key
                        file_writer.write(key + '|' + final_value + '\n')
                    print 'INFO : Stats report file captured successfully.'
                    file_writer.flush()
                file_reader.flush()
        print 'INFO : Terminating process.'
    else:
        print 'ERROR : No files present at input location.'


def main(args):
    if len(args) == 3:
        print 'INFO : Capturing arguments.'
        global input_loc, report_loc, cell_trace_report_loc
        input_loc, report_loc, cell_trace_report_loc = correct_path_string(args[0]), correct_path_string(args[1]), correct_path_string(args[2])
        print 'INFO : Arguments captured and processed.'
        start_process()
    else:
        print 'ERROR : Wrong arguments given.'
        print 'INFO : python <script_name>.py <input_location> <output_location>'


if __name__ == '__main__':
    main(sys.argv[1:])