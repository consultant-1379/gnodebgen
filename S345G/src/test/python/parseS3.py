# parse a ctrs binary file
import sys
import glob 
import gzip
from collections import defaultdict

from interestingS3events import InterestingEvents
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
    gcidDict = nested_dict(2, int)
    evtDict = nested_dict(2,int)  # track count of evet ids by cell id
    enbs1Dict = nested_dict(2,int) # track count of enbs1apids by cell id
    sessDict = nested_dict(2,list) # track evts by enbaps1id by cell id
    sessionDict = {}  # Dictinary of sessions
    openSessions = {}
    startTs = -1

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
    
    for fname in sorted(glob.glob(inFile)):
        if fname.endswith('bin.gz'):
            raw = bytearray(gzip.open(fname, 'rb').read())
        else:
            raw = bytearray(open(fname, 'rb').read())
        size = len(raw)
        offset = 0; 

        while offset < size: 
            recCnt += 1       
            ll = int((raw[offset]) * 256) + int(raw[offset+1])
            type = int((raw[offset+2]) * 256) + int(raw[offset+3])
            
            if ll < 2 or ll > 4999: # length is fucked!
                raise Exception('Bad length of %d found at offset %d. Aborting. %04d %04d '%(ll, offset, type, id))
            if type == 4 :  # event
                id =  int.from_bytes(raw[offset + 4:offset + 7], 'big')
                evtCnt += 1
                if not InterestingEvents.has_value(id):
                    offset += ll  # skip rest of record
                    continue
                
                interestingEvtCnt += 1

                gcid  = str(int.from_bytes(raw[offset + 16:offset + 20], 'big'))
                gcidDict[gcid][msToStr(startTs)] += 1
                enbaps1id = int.from_bytes(raw[offset + 20:offset + 23], 'big')
                racueref = int.from_bytes(raw[offset + 34:offset + 38], 'big')
                sessId = str(enbaps1id) + ':' + str(racueref)
                evtDict[gcid][str(id)] += 1
                    
                # get the time from the event
                timems = getTime(raw[offset+7:offset+11])
                
                key = gcid+':'+sessId

                # check for late events                 
                if key not in sessionDict:  # create a new session
                    if sessId in enbs1Dict[gcid]:  # not exactly new then
                        numLate += 1
                    sessionDict[key] = Session(key)
                enbs1Dict[gcid][sessId] += 1
                    
                # add event to session
                sessionDict[key].addEvt(id, timems, raw[offset:offset + ll])
                                                            
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
                errCnt += 1
            offset += ll

    with open('input.mrg', 'w') as g:
        for key, sess in sessionDict.items():
            g.write(sess.toString())
     

def getTime(raw):
    """ extract the time (in ms) from an event """
    h = int(raw[0])
    m = int(raw[1])
    s = int(raw[2])
    ms= int((raw[3]) * 256) + int(4)
    timems = ( h * 3600 * 1000  # in milliseconds
            +m * 60 * 1000
            +s * 1000
            +ms)
    return timems

def msToStr(t):
    """ convert ms based timestamp to string """
    h = int ( t/3600000) 
    t -= h * 3600000
    m = int (t / 60000) 
    t -= m * 60000
    s = int( t / 1000)
    ms = t % 1000
    return '%02d:%02d:%02d.%03d'%(h,m,s,ms)

if __name__ == '__main__':
    inFile="logPattern.dat"
    verbose = True
    
    track=''
    test = False
    for arg in sys.argv:
        if arg.startswith("inFile="):
            inFile=arg.split('=')[1]

    parseOut(inFile)
    
    

