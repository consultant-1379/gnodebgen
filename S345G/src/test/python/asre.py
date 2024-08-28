# parse a ctrs binary file
import multiprocessing
import queue
import sys
import glob 
import gzip
from collections import defaultdict
import time

import sessionHandler 

from interestingEvents import InterestingEvents
#from session import Session
        
def parseOut(inFile, num_consumers = 0):
    """ Parse a CTRS event file
    
    filter interesting events
    make sessions  - sequences of events with common gcid-enbaps1id-racUeRef
    write closed sessions every 5 minutes 
      session closed when no new events for 10 seconds after session closer event
      session closed as suspect if no new event in ~5 minutes
    
    """
    
    startTs = -1

    recCnt = 0
    errCnt = 0
    hdrCnt = 0
    type3 = 0
    type5 = 0
    evtCnt = 0
    interestingEvtCnt = 0
    numSessions = 0
    numClosed = 0
    numSuspect = 0
    numLate = 0  # late events are in evtDict but not in sessiondict
    eventCounter = defaultdict(int)

    # load each file into memory
    print('Processing %d files matching the pattern %s'%(len(glob.glob(inFile)), inFile) )

    # Start consumers
    if num_consumers == 0:
        num_consumers = multiprocessing.cpu_count() * 2
    # num_consumers = 4
    print('Creating {} consumers'.format(num_consumers))
    
    # create a queue to talk to each consumer
    cq = [multiprocessing.Queue() for i in range(num_consumers)]
    # create and initialise a session handler for each consumer and give it the Q to read from
    consumers = [  
        sessionHandler.SessionHandler(cq[i], i) for i in range(num_consumers)
    ]
    # start each consumer in a seperate process
    for w in consumers:
        w.start()
    #cr = defaultdict(int)
    
    for fname in sorted(glob.glob(inFile)):
        nodeName = fname[fname.find('_')+1:fname.find('_celltrace')]
        if fname.endswith('bin.gz'):
            raw = bytearray(gzip.open(fname, 'rb').read())
        else:
            raw = bytearray(open(fname, 'rb').read())
        size = len(raw)
        offset = 0; 
        startTime = time.time()
        while offset < size: 
            recCnt += 1       
            ll = int((raw[offset]) * 256) + int(raw[offset+1])
            type = int((raw[offset+2]) * 256) + int(raw[offset+3])
            
            if ll < 2 or ll > 4999: # length is fucked!
                print('Bad length of %d found at offset %d. Aborting. '%(ll, offset))
                break;
            if type == 4 :  # event
                id =  int.from_bytes(raw[offset + 4:offset + 7], 'big')
                evtCnt += 1
                eventCounter[id] += 1
                #if not InterestingEvents.has_value(id):
                if not InterestingEvents.isASRevt(id):
                    offset += ll  # skip rest of record
                    continue
                
                interestingEvtCnt += 1
                gcid  = int.from_bytes(raw[offset+16:offset+20], 'big')
                cq[hash(str(gcid)) % num_consumers].put( (gcid, id, raw[offset:offset + ll]) )
                
                #cr[hash(gcid) % num_consumers] += 1                
                if interestingEvtCnt % 500000 == 0:
                    txt = 'EventCnt %d, Queue sizes are :' % interestingEvtCnt 
                    queued = 0
                    for i in range(num_consumers):
                        q = cq[i].qsize()
                        queued += q
                        txt += ' {}:{}'.format(i, q)
                    txt += '. Handled %d, eps %.2f'%(interestingEvtCnt - queued, interestingEvtCnt/(time.time() - startTime))
                    print(txt)
                    if queued > (50000 * num_consumers):
                        time.sleep(1)# + (queued / 10000))
                            
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
                #print('UNKNOWN TYPE! ll %04d type %04d id %04d.'%(ll, type, id), ends=' ')
                if h is not None:
                    print('Time stamp from previous msg: %d:%02d:%02d,%03d'%(h,m,s,ms))
                else: 
                    print()
                errCnt += 1
            offset += ll

    # Send a poison pill to each consumer to terminate it
    print('Waiting for consumers to finish.')
    for i in range(num_consumers):
        cq[i].put( (None, None, None) )

    # Wait for all of the tasks to finish
    while True:
        queued = 0
        txt = 'Queue sizes are : '
        for i in range(num_consumers):
            q = cq[i].qsize()
            queued += q
            txt += ' {}:{}'.format(i, q)
        txt += '. Handled %d, eps %.2f'%(interestingEvtCnt - queued, interestingEvtCnt/(time.time() - startTime))
        print(txt)
        time.sleep(5)# + (queued / 10000))
        if queued == 0:
            break
    
    print('Totals: records %d, headers %d, errors %d' %(recCnt, hdrCnt, errCnt))
    print(' Total events: %d of which %d (%.2f%%) were interesting.' % (evtCnt, interestingEvtCnt, interestingEvtCnt/evtCnt*100.0) ) 
    # write the event distribution
    with open("eventCount.txt", "w") as o:
        for evt in eventCounter:
            o.write(" %04d, %d\n"%(evt, eventCounter[evt])) 

## Single processor version 
def parseOutSP(inFile):
    """ Parse a CTRS event file
    
    filter interesting events
    make sessions  - sequences of events with common gcid-enbaps1id-racUeRef
    write closed sessions every 5 minutes 
      session closed when no new events for 10 seconds after session closer event
      session closed as suspect if no new event in ~5 minutes
    
    """
    
    startTs = -1

    recCnt = 0
    errCnt = 0
    hdrCnt = 0
    type3 = 0
    type5 = 0
    evtCnt = 0
    interestingEvtCnt = 0
    numSessions = 0
    numClosed = 0
    numSuspect = 0
    numLate = 0  # late events are in evtDict but not in sessiondict
    eventCounter = defaultdict(int)
    handler = sessionHandler.SessionHandlerSP()
    
    # load each file into memory
    print('Processing %d files matching the pattern %s'%(len(glob.glob(inFile)), inFile) )
    raw = None  
    for fname in sorted(glob.glob(inFile)):
        nodeName = fname[fname.find('_')+1:fname.find('_celltrace')]
        if fname.endswith('bin.gz'):
            raw = bytearray(gzip.open(fname, 'rb').read())
        else:
            raw = bytearray(open(fname, 'rb').read())
        size = len(raw)
        offset = 0; 
        startTime = time.time()
        timeTs = 0
        while offset < size: 
            recCnt += 1       
            ll = int((raw[offset]) * 256) + int(raw[offset+1])
            type = int((raw[offset+2]) * 256) + int(raw[offset+3])
            
            if ll < 2 or ll > 4999: # length is fucked!
                print('Bad length of %d found at offset %d. Aborting. '%(ll, offset))
                break;
            if type == 4 :  # event
                id =  int.from_bytes(raw[offset + 4:offset + 7], 'big')
                evtCnt += 1
                eventCounter[id] += 1
                #if not InterestingEvents.has_value(id):
                if not InterestingEvents.isASRevt(id):
                    offset += ll  # skip rest of record
                    continue
                
                interestingEvtCnt += 1
                
                gcid  = int.from_bytes(raw[offset+16:offset+20], 'big')
                #cq[hash(str(gcid)) % num_consumers].put( (gcid, id, raw[offset:offset + ll]) )
                timeTs = handler.handleEvent(gcid, id, raw[offset:offset + ll])
                #cr[hash(gcid) % num_consumers] += 1                
                if interestingEvtCnt % 500000 == 0:
                    txt = 'EventCnt %d, ' % interestingEvtCnt 
                    txt += ' eps %.2f'%(interestingEvtCnt/(time.time() - startTime))
                    print(txt)
                            
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
                #print('UNKNOWN TYPE! ll %04d type %04d id %04d.'%(ll, type, id), ends=' ')
                if h is not None:
                    print('Time stamp from previous msg: %d:%02d:%02d,%03d'%(h,m,s,ms))
                else: 
                    print()
                errCnt += 1
            offset += ll

        handler.writeSessions(timeTs, abandon = True) 
        
    print('Totals: records %d, headers %d, errors %d' %(recCnt, hdrCnt, errCnt))
    print(' Total events: %d of which %d (%.2f%%) were interesting.' % (evtCnt, interestingEvtCnt, interestingEvtCnt/evtCnt*100.0) ) 
    print('sessions written to tmp/') 
    # write the event distribution
    with open("eventCount.txt", "w") as o:
        for evt in eventCounter:
            o.write(" %04d, %d\n"%(evt, eventCounter[evt])) 

if __name__ == '__main__':
    inFile="/home/esmipau/workspace/Telstra/Data/A20160531.0905-0910_10.45.99.40_celltracefile_1-1464652316672.bin"
    verbose = True
    
    track=''
    test = False
    numProcessors = 0
    for arg in sys.argv:
        if arg.startswith("inFile="):
            inFile=arg.split('=')[1]
        if arg.startswith("mp="):
            numProcessors=int(arg.split('=')[1])
        elif arg.startswith("verbose="):
            verbose= (True if "True" == arg.split('=')[1] else False)

    if not test:
        if numProcessors != 1:
            parseOut(inFile, numProcessors)
        else:
            parseOutSP(inFile)
    
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
    
    

