# parse a ctrs binary file
import sys
import glob 
import gzip
from collections import defaultdict

from interestingEvents import InterestingEvents
from session import Session

# nested dictionary 
def nested_dict(n, type):
    if n == 1:
        return defaultdict(type)
    else:
        return defaultdict(lambda: nested_dict(n-1, type))
    
FIVEMINUTES = 300000        
        
def parseOut(inFile):
    """ Parse a CTRS event file  
    """
    gcidDict = defaultdict(int)
    evtDict = defaultdict(int)
    evtbyCellDict = nested_dict(2,int)  # track count of evet ids by cell id
    gcidInterstDict = defaultdict(int)
    
    enbs1Dict = nested_dict(2,int) # track count of enbs1apids by cell id
    sessDict = nested_dict(2,list) # track evts by enbaps1id by cell id

    recCnt = 0
    errCnt = 0
    hdrCnt = 0
    type3 = 0
    type5 = 0
    # tracker_cell = 151201283
    #tracker = open('tracker_cell_%s'%tracker_cell,'w')
    evtCnt = 0
    interestingEvtCnt = 0
    numSessions = 0
    numClosed = 0
    numSuspect = 0
    numAbandon = 0
    numLate = 0  # late events are in evtDict but not in sessiondict
    sessionDict = {}
    # load each file into memory
    triggerlist = defaultdict(int)
    triggerCnt = 0
    basePlmnid = None
    for fname in sorted(glob.glob(inFile)):
        nodeName = fname[fname.find('_')+1:fname.find('_celltrace')]
        if fname.endswith('bin.gz'):
            #print('Processing compressed %s'%fname)
            raw = bytearray(gzip.open(fname, 'rb').read())
        else:
            #print('Processing >%s<'%fname)
            raw = bytearray(open(fname, 'rb').read())
        size = len(raw)
        offset = 0; 

        while offset < size: 
            recCnt += 1       
            ll = int((raw[offset]) * 256) + int(raw[offset+1])
            type = int((raw[offset+2]) * 256) + int(raw[offset+3])
            
            if ll < 2 or ll > 4999: # length is fucked!
                print('Bad length of %d found at offset %d. Aborting. %04d %04d '%(ll, offset, type, id))
                break;
            if type == 4 :  # event
                id =  int.from_bytes(raw[offset + 4:offset + 7], 'big')
                evtDict[id] += 1
                evtCnt += 1
                gcid  = str(int.from_bytes(raw[offset + 16:offset + 20], 'big'))
                gcidDict[gcid] += 1
                enbaps1id = int.from_bytes(raw[offset + 20:offset + 23], 'big')
                racueref = int.from_bytes(raw[offset + 34:offset + 38], 'big')
                if id == 5193:
                    trigger = raw[offset + 41]
                    dlCov = raw[offset + 74]                
                    ulCov = raw[offset + 75]
                    triggerCnt += 1
                    triggerlist[trigger] += 1   
                    if dlCov < 80 or ulCov < 80:            
                        print('Trigger %02d, dl_Cov %02x, ul_cov %02x' %( trigger, ulCov, dlCov))                                        
            elif type == 0: # File header
                yy = int(raw[offset+27]*256 + raw[offset+28])
                mm = int(raw[offset+29])
                dd = int(raw[offset+30])
                #print('%04d %04d  %d:%02d:%02d'%(ll, type, yy,mm,dd)) 
                hdrCnt += 1           
            elif type == 1: # Tcp header
                yy = int(raw[offset+27]*256 + raw[offset+28])
                mm = int(raw[offset+29])
                dd = int(raw[offset+30])
                h = int(raw[offset+31])
                m = int(raw[offset+32])
                s = int(raw[offset+33])
                cause = int(raw[offset+419]*256 + raw[offset+420])
                numDropped = int(raw[offset+422]*256*256 + raw[offset+423]*256 + raw[offset+424])
                #print('%04d %04d  %d:%02d:%02d %d:%02d:%02d cause:%d numDropped:%d'%(ll, type, yy,mm,dd, h,m,s, cause, numDropped)) 
                hdrCnt += 1
            elif type == 3: # Tcp header
                type3 +=1 
            elif type == 5: # Tcp header
                type5 +=1 
            else:
                print('UNKNOWN TYPE! ll %04d type %04d id %04d.'%(ll, type, id), end=' ')
                if h is not None:
                    print('Time stamp from previous msg: %d:%02d:%02d,%03d'%(h,m,s,ms))
                else: 
                    print()
                errCnt += 1
            offset += ll
    for t in sorted(triggerlist):
        print('Trigger %d used %d times.'%(t,triggerlist[t]))
        
    print('Totals: records %d, headers %d, errors %d' %(recCnt, hdrCnt, errCnt))

    print('Total events:%d, of which %d (%3.1f%%) were interesting.'
          %(evtCnt, interestingEvtCnt, 
            0 if evtCnt == 0 else interestingEvtCnt/evtCnt*100) )

    with open('cells.lst', 'w') as f:
        for gcid in gcidDict:
            f.write('%s : %d\n'%(gcid, gcidDict[gcid]))
    with open('cellsEventCnt.lst', 'w') as f:
        for gcid in gcidDict:
            f.write('%s : %d\n'%(gcid, gcidDict[gcid]))
    with open('cellsInterestingEventCount.lst', 'w') as f:
        for gcid in gcidInterstDict:
            f.write('%s : %d\n'%(gcid, gcidInterstDict[gcid]))

    with open('cellsEventDetail.lst', 'w') as f:
        for gcid in evtbyCellDict:
            f.write('%s : '%(gcid))
            for evt in sorted(evtbyCellDict[gcid]):
                f.write(' %d:%d,'% (evt, evtbyCellDict[gcid][evt]) )
            
                


if __name__ == '__main__':
    inFile="/home/esmipau/workspace/Telstra/Data/A20160531.0905-0910_10.45.99.40_celltracefile_1-1464652316672.bin"
    verbose = True
    
    track=''
    test = False
    for arg in sys.argv:
        if arg.startswith("inFile="):
            inFile=arg.split('=')[1]
        elif arg.startswith("verbose="):
            verbose= (True if "True" == arg.split('=')[1] else False)

    if not test:
        parseOut(inFile)
    
    if test:
        # test session stuff
        sessionDict = {}
        key = 'gcid-enbaps1-racue'
        sessionDict[key] = Session(key)
        id = 1234
        timems = 9876
        sessionDict[key].addEvt(id, timems)
        print( sessionDict[key].toString(True))
        print( sessionDict[key].toString())
    
    

