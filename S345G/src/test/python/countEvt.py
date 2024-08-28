# parse a ctrs binary file
# produce event distribution
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
    evtCounter = defaultdict(int)

    recCnt = 0
    evtCnt = 0
    errCnt = 0
    hdrCnt = 0
    type3 = 0
    type5 = 0
    # tracker_cell = 151201283
    #tracker = open('tracker_cell_%s'%tracker_cell,'w')
    evtCnt = 0
        
    for fname in sorted(glob.glob(inFile)):
        if fname.endswith('bin.gz'):
            print('Processing compressed %s'%fname)
            raw = bytearray(gzip.open(fname, 'rb').read())
        else:
            print('Processing %s'%fname)
            raw = bytearray(open(fname, 'rb').read())
        size = len(raw)
        offset = 0;
        lineCnt = 0 

        while offset < size: 
            recCnt += 1
            lineCnt += 1
            ll = int((raw[offset]) * 256) + int(raw[offset+1])
            type = int((raw[offset+2]) * 256) + int(raw[offset+3])
            
            if ll < 2 or ll > 4999: # length is fucked!
                print('Bad length of %d found at offset %d. Aborting. %04d %04d '%(ll, offset, type, id))
                break;
            if type == 4 :  # event
                id =  int.from_bytes(raw[offset + 4:offset + 7], 'big')
                evtCounter[id] += 1
                evtCnt += 1
                offset += ll  # skip rest of record
                                                            
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
                print('UNKNOWN TYPE! record %d, ll %04d type %04d id %04d.'%(lineCnt, ll, type, id), end=' ')
                errCnt += 1
            offset += ll
    print("Records: %d, events: %d"%(recCnt, evtCnt))
    print(" EventId, count:")
    for evt in sorted(evtCounter):
        print(" %04d: %d"%(evt,evtCounter[evt]))
    print("\nDone.")


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
    
    

