#
# Make patterns
#
import sys
import math
from collections import defaultdict
import csv
# The CSV files being used include some very long fields. This bodge prevents it failing. 
csv.field_size_limit(2147483647)
from interestingEvents import InterestingEvents

def getTopMatches(fileHandle, patterns, scale):
    
    # File format
    # opener,closer,dur,errCode,events,ext,sessId,durs,errEvt
    #
    #print('fname',fname)
    rowCnt = 0  # number of sessions that matched a pattern
    rawCnt = 0  # total number of sessions
    patDict = {}
    patDict['Error'] = defaultdict(int)
    for p in patterns:
        patDict[p] = defaultdict(int)
    
    reader = csv.reader(fileHandle, delimiter=',', quotechar='"', quoting=csv.QUOTE_ALL, skipinitialspace=True)        
    for row in reader:
        rawCnt += 1
        if row[3].strip() != '0':  # error patterns only
            rowCnt += 1
            events = row[4].strip() +":"+ row[3].strip() +":"+ row[8].strip()
            patDict['Error'][events] += 1 
        else:
            p = row[0].strip()+row[1].strip()            
            if p in patterns and row[3].strip() == "0":  # matching success patterns only
                rowCnt += 1
                events = row[4].strip()
                patDict[p][events] += 1
    print('File %s with %d rows of data, had %d unmatched records:'%(fileHandle.name, rawCnt, rawCnt - rowCnt))

    topDict = {}
    numPat = scale
    totcoverage = 0
    patcoverage = 0
    matchCnt = {}
    selectedCnt = {}    
    for p in patDict:
        coverage = sum(patDict[p].values())
        matchCnt[p] = coverage
        totcoverage += coverage
        #print('Pattern "%s" was matched %d times with %d unique instances covering %.3lf%% of occurances.'%(p, coverage, len(patDict[p]), coverage/rawCnt * 100))
        topDict[p] = {}
        i = 0
        for key in sorted(patDict[p], key=patDict[p].get, reverse=True):
            topDict[p][key] = patDict[p][key]
            i+=1
            if i >= numPat:
                break
        numPat = max(numPat - numPat/10, 1) # reduce by 10% each time
        coverage = sum(topDict[p].values())
        selectedCnt[p] = coverage
        patcoverage += coverage
        # print(' Selecting top %d instances which cover %.3f%% of occurances.' % (scale, coverage/rawCnt * 100) ) 
    print('All patterns covered %.3lf%% of occurances, selected patterns cover %.3lf%% of occurances.\n'%(totcoverage/rawCnt * 100, patcoverage/rawCnt * 100))
    patDict = {}  # free up the pattern dict
    # Now build a patDict where the key is the eventlist and the value is the pattern it belongs to
    for p in topDict:
        for e in topDict[p]:
            patDict[e] = p
        
    # go back through file and get durations    
    durDict = {}
    for p in patterns:
        durDict[p] = defaultdict(list)
    durDict['Error'] = defaultdict(list)
    
    fileHandle.seek(0) # rewind file handle 
    reader = csv.reader(fileHandle, delimiter=',', quotechar='"', quoting=csv.QUOTE_ALL, skipinitialspace=True)     
    for row in reader:
        if row[3].strip() != '0':  # error patterns only
            events = row[4].strip() +":"+ row[3].strip() +":"+ row[8].strip()
        else:
            events = row[4].strip()
        if events in patDict:
            p = patDict[events]
            durDict[p][events].append(row[7])
    
    # work out averages for durations
    for p in durDict:
        for key in durDict[p]:  # for each pattern
            avgDur = defaultdict(int)
            numDur = len(durDict[p][key][0])  # how many events
            if numDur < 2:
                avgDur[0] = 0
            else:
                cnt = 0
                for durList in durDict[p][key]:  # for each list of duration lists 
                    cnt += 1
                    i = 0
                    for dur in durList.split(','):
                        # print("%r %d"%(dur, int(dur)))
                        try:
                            avgDur[i] += abs(int(dur))
                        except:
                            print("%r,%r,%r,%r,%r\n %r"%(i, dur, durList, cnt, key, topDict[key]))
                        i += 1
                for i in range(len(avgDur)):
                    avgDur[i] = avgDur[i] / cnt  # turn sum into average
                    #print ('i: %d, avgDuri[i] %.3f'%(i,avgDur[i]) ) 
            durDict[p][key] = avgDur    
    return durDict, topDict, matchCnt, rawCnt

def writePatterns(p, grp, pattern, durDict, topDict, matchCnt, rowCnt, bias, targetRatio, suspectRatio):
    '''
    topDict is a dictionary of top occouring patterns
      key is the event list, val is teh number of occurances
    targetRatio is a float giving number of ASR-Only : number of common events. 
      ASR only decorator events will be added to patterns to restore ratio
      set to zero for no padding
    matchCnt is the number of sessions that matche dthe pattern
    rowCnt is the number of sessions in the File
    '''
    # what proportion of the patterns have we selected ?
    sumSelected = sum(topDict.values())  
    if sumSelected == 0:
        return  # nothing to do
    # adjustor to bring overall proportion back in line
    adjustor = matchCnt / sumSelected  # what portion of matchs have been selected
    
    asrOnly = 0
    common = 0
    for evtLst in topDict:
        evts = evtLst.split(':')[0].split(',')
        for evt in evts:
            if InterestingEvents.isASROnlyEvt(int(evt)):
                asrOnly += 1
            else:
                common += 1
    # current ratio is asrOnly / common
    # targetAsrOnly = common * targetRatio
    # padding = targetAsrOnly - asrOnly
    # for each common event, inject padding additional padding events

    numPadNeeded = 0
    padPer = 0
    if common > 0:
        numPadNeeded = max((common * targetRatio) - asrOnly, 0)  # total number of padding events needed
        padPer = int(math.ceil(targetRatio - (asrOnly/common)))  # max number of pads per common evt
    #print(' NumPadNeeded %d, pad per common is %d, asrOnly %d, common %d'%(numPadNeeded, padPer, asrOnly,common)) 
    
    i = 0

    for key in sorted(topDict, key=topDict.get, reverse=True):
        s = ('%s_%s_%d.pat' %(grp, pattern, i))
        #
        # Pattern 'n' occured topDict[n] times
        # selected patterns account for adjustor of the matched patterns
        #
        cnt = topDict[key] * adjustor / rowCnt
        # Adjust to 100000 sessions according to bias 
        cnt2 = (cnt* 100000 * bias) /6
        if '-1' in pattern:
            cnt2 /= suspectRatio
        freq = max( int( cnt2 ), 1) # minimum occurance is 1
        #print (topDict[n], adjustor, rowCnt, cnt, cnt2, freq)
        
        p.write('%s = %d\n'%(s, freq))  # update ini to have pattern called
        with open('Patterns/%s'%(s), 'w') as f:
            f.write('# Generated by mkPat.py\n')        
            j = 0  
            errEvent = 0 
            if pattern == 'Error':
                evts, errCode, errEvent = key.split(':')
            else:
                evts = key
            evtLst = evts.split(',')
            for evt in evtLst:
                f.write('# %s\nid = %s\n'%(evt,InterestingEvents(int(evt)).name) )
                if durDict[key][j] > 50 and durDict[key][j] < 15001:  # 5 minutes 
                    f.write('offset = %d\n'%(durDict[key][j]) )
                if evt == errEvent:
                    f.write('set=%s,%s\n'%(InterestingEvents.rcInfo(int(evt))[2], errCode)) 
                f.write(getEvtTxt(evt))
                if numPadNeeded > 0 and InterestingEvents.isCommonEvt(int(evt)):
                    #print('about to write %d pads'%padPer)
                    for pad in range(padPer):  # may need more then one pad per common event
                        padEvt = InterestingEvents.getPadding()
                        f.write('# Padding\nid = %s\n'%(padEvt.name) )
                        numPadNeeded -= 1
                j += 1
            i += 1

# text to add to pattern for event
_evtDict = {
    # S1_INITIAL_UE_MESSAGE
    '1040':'set=EVENT_PARAM_L3MESSAGE_CONTENTS,b"00 0C 40 38 00 00 06 00 08 00 03 40 06 2F 00 1A 00 05 04 C7 1C E5 AF 00 43 00 06 00 44 F0 02 18 1F 00 64 40 08 00 44 F0 01 08 57 90 30 00 86 40 01 40 00 60 00 06 10 00 D0 08 3E 50"\n',
    # S1_INITIAL_CONTEXT_SETUP_REQUEST.value,  
    '1038':'set=EVENT_PARAM_L3MESSAGE_CONTENTS,b"00 09 00 80 A6 00 00 08 00 00 00 05 C0 04 75 8F 5F 00 08 00 03 40 06 2F 00 42 00 0A 18 11 E1 A3 00 60 04 78 68 C0 00 18 00 13 00 00 34 00 0E 05 00 09 09 0F 80 0A EF 8B 22 4F D3 A3 89 00 6B 00 05 18 00 0C 00 00 00 49 00 20 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 00 29 40 04 00 44 F0 02 00 4A 40 35 34 01 90 01 02 FC 51 80 04 00 10 72 24 82 44 F9 3F FC 4F 93 FF C4 F9 3F FC 4F 93 FF C4 F9 3F FA E0 7E E4 04 41 40 11 90 A7 0C A7 4A 92 20 20 58 00 00 00 00 00"\n',
    # S1_HANDOVER_REQUEST.value,  # 
    '1034':'set=EVENT_PARAM_MESSAGE_DIRECTION,0\nset=EVENT_PARAM_L3MESSAGE_CONTENTS,b"00 01 00 81 49 00 00 09 00 00 00 05 C0 C7 05 B5 4D 00 01 00 01 00 00 02 40 02 02 00 00 42 00 0A 18 FF FF FE D8 60 FF FF FE D8 00 35 00 12 00 00 1B 00 0D 0A 1F AC 14 36 E8 00 03 89 45 00 09 21 00 68 00 80 CE 80 CC 60 80 A2 0E 10 14 C5 98 08 0A 00 00 BF 06 EC 4F 00 14 03 02 C0 00 00 00 00 00 95 E8 00 00 50 28 5A 03 02 84 05 79 70 00 06 46 94 80 1B D8 0F FD 4E 01 83 81 C0 FF D4 E0 19 38 01 F5 13 70 1E BA 9C 50 EC 5E 7D 00 27 75 74 AF 72 63 FF 92 16 F0 C3 92 C0 FE 0A 95 50 38 70 00 10 8A 1F 13 87 21 6B F4 00 03 C2 21 59 7A BF 80 04 34 41 08 68 80 50 D9 50 81 24 98 04 90 28 00 02 66 00 78 C1 59 BE 6C 9B 30 D8 16 40 05 00 04 10 02 94 19 75 7A 2A C6 E8 03 A0 50 A0 ED 02 80 08 24 09 56 00 02 04 D9 ED D5 00 00 00 4E 40 02 45 00 00 44 F0 05 02 4E C0 10 00 10 00 44 F1 01 02 49 30 01 80 00 05 00 44 F1 01 02 4E C0 10 00 00 54 00 6B 00 05 18 00 0C 00 00 00 29 40 09 48 44 F0 05 00 44 F0 05 80 00 28 00 21 18 69 60 B1 0F 30 52 DE DD BC EC 3D 26 19 7D 55 FC D3 7D 16 C4 1E 4E EE CB D2 74 D2 8C 5A 0B F1 7F"\n',
    #X2_HANDOVER_REQUEST.value,  # 
    '2058':'set=EVENT_PARAM_MESSAGE_DIRECTION,0\nset=EVENT_PARAM_L3MESSAGE_CONTENTS,b"00 00 00 81 43 00 00 06 00 0A 00 02 07 F6 00 05 40 02 10 00 00 0B 00 08 00 44 F0 02 08 57 90 30 00 17 00 07 00 44 F0 02 E2 80 42 00 0E 00 81 08 26 18 68 86 F6 18 00 0C 00 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 03 11 E1 A3 00 60 04 78 68 C0 00 00 04 40 0E 45 00 09 09 01 F0 0A F0 8C E3 37 B3 DB B7 80 BB 0A 10 2F C5 18 00 40 01 07 22 48 24 4F 93 FF C4 F9 3F FC 4F 93 FF C4 F9 3F FC 4F 93 FF AE 07 EE 40 44 14 01 19 0A 70 CA 74 A9 22 02 05 80 00 00 00 00 15 D8 40 00 03 38 84 10 00 07 08 21 80 14 41 2A D3 84 08 A1 1D 0D C4 06 80 9F 0D C6 0C A4 56 82 03 00 00 10 04 40 10 C2 36 2A 64 60 DE C0 7F EA 70 2E 07 FE A7 02 0F A8 9B 80 F5 D4 E2 87 62 13 E6 01 BB CC A0 5C FE 55 8F FD 15 35 86 1C 86 C8 A1 84 4D 06 AD 00 00 00 68 80 00 D1 00 41 30  16 03 2F C0 28 18 21 00 81 84 4C 23 63 03 E5 69 D9 22 80 46 03 9C 80 08 00 04 01 E4 12 29 D4 AA F2 BD C8 01 D0 67 18 10 68 4A 00 44 F0 02 00 0F 40 0C 00 00 44 F0 00 03 2F C0 20 00 00 03"\n',
    # inject an X2_CONTEXT_FETCH_RESPONSE after each X2 handout
    '4112': 'id=X2_CONTEXT_FETCH_RESPONSE\nset=EVENT_PARAM_MESSAGE_DIRECTION,0\nset=EVENT_PARAM_L3MESSAGE_CONTENTS,b"00 0B 40 81 7B 00 00 00 80 05 04 00 7F 00 05 40 81 6E 00 81 6B 20 00 0C 00 81 65 00 00 09 00 1F 00 02 0D 26 00 1E 00 02 0A 60 00 1C 40 03 00 00 14 00 1B 40 02 30 49 00 21 40 02 26 6D 00 1D 00 07 00 44 F0 02 E2 80 41 00 24 00 81 04 23 17 07 92 F4 18 00 0C 00 00 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF 03 11 E1 A3 00 60 04 78 68 C0 00 00 1A 40 0E 05 00 09 09 03 E0 0A EF 8B 39 17 A2 70 2E 80 B7 0E 10 2F C5 18 00 40 01 07 22 48 24 4F 93 FF C4 F9 3F FC 4F 93 FF C4 F9 3F FC 4F 93 FF AE 07 EE 40 44 14 01 19 0A 70 CA 74 A9 22 02 05 80 00 00 00 00 15 D8 00 00 03 38 84 30 02 88 25 5A 70 81 14 23 A1 B8 80 D0 13 E1 B8 C1 40 15 AD 00 C0 00 04 01 10 04 30 0D 8A 90 37 B0 1F FA 9C 0B 81 FF A9 C0 83 EA 26 E0 3D 75 38 A1 D8 84 F9 80 6E F3 2F B7 3F 95 63 FF 45 4D 61 87 21 B2 28 61 11 82 4B 40 00 00 1A 20 00 34 40 10 4C 05 80 CC 4C 0E 06 08 40 20 61 13 08 D8 C0 F9 5A 76 48 C8 15 80 E7 20 02 00 01 00 79 03 8A 75 2A BC AF 72 00 74 19 C5 0E 05 02 11 C0 00 44 F0 02 00 25 40 17 10 00 44 F0 00 03 31 30 30 00 00 27 00 44 F0 00 03 31 30 30 00 00 26 00 19 40 10 00 00 18 40 0B 05 00 03 F2 00 00 00 0D 06 00 00"\n',
    # S1_PATH_SWITCH_REQUEST_ACKNOWLEDGE.value,  # 
    '1045': 'set=EVENT_PARAM_MESSAGE_DIRECTION,0\nset=EVENT_PARAM_L3MESSAGE_CONTENTS,b"20 03 00 38 00 00 03 00 00 40 05 C0 06 D1 8C 47 00 08 40 03 40 06 34 00 28 00 21 10 FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF FF"\n',
    # S1_UPLINK_NAS_TRANSPORT.value, # 
    '1067': '',
    }
def getEvtTxt(evt):
    ''' get additional text for event
        really simple version - return dictionary entry! '''
    if evt in _evtDict:
        return _evtDict[evt]
    return ''
    
    
if __name__ == '__main__':
    """ make S3 patterns 
    
    given a merge file, a pattern definition, a scale, an output count
    extract top scale matching patterns
    for each top pattern extract top scale durations
    
    """
    cust = "sprint"
    pattern='41064125'
    scale = 40
    errPatterns = 40
    targetRatio = 2.05  # ratio of ASRonly to common events (1.5:0.6)
    suspectRatio = 15.0  # the current 30% reduced to target 3% 
    for i in range(1,len(sys.argv)-1):
        if sys.argv[i] == "-g":
            cust = sys.argv[i+1]
        if sys.argv[i] == "-p":
            pattern = sys.argv[i+1]
        if sys.argv[i] == "-e":
            scale = int(sys.argv[i+1])
        if sys.argv[i] == "-e":
            errPatterns = int(sys.argv[i+1])
        if sys.argv[i] == "-t":
            targetRatio = float(sys.argv[i+1])
            
        if sys.argv[i] == "-sr":
            suspectRatio = float(sys.argv[i+1])
    print ('Scale %d, targetRatio %.2f, suspectRatio %.2f. '%(scale, targetRatio, suspectRatio))
    mrgs = ["sprint", "KDDI", "Telstra", ]
    biases = [3,2,1]
    patterns = [    
            '41064125',
            '41134112',
            '41064112',
            '41134125',
            '41214125',
            '41214112',
            '41054112',
            '41054125',
            '41134104',
            '41054104',
            '41064104',
            '41214104',
            '-1-1',   # suspects
            '-14125',
            '-14112',
            '-14104',
            '4106-1',
            '4113-1',
            '4121-1',
            '4105-1',            
        ]
    
    # topDict contains the number of instances 
    #import io
    #fileHandle=io.StringIO(testData)
    with open('Patterns/Patterns.ini', 'w') as iniF:
        for cnt in range(len(mrgs)):
            cust = mrgs[cnt]
            bias = biases[cnt]
            fileHandle=open(cust+".mrg", 'r')
            durDict, topDict, matchCnt, rowCnt = getTopMatches(fileHandle, patterns, scale)
            fileHandle.close() 
            for p in topDict:
                writePatterns(iniF, cust, p, durDict[p], topDict[p], matchCnt[p], rowCnt,
                              bias, targetRatio, suspectRatio)
