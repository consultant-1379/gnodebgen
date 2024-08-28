# sessionHandler.py

"""
read events from a queue and make sessions from them
"""

import multiprocessing
import time
from interestingEvents import InterestingEvents
from session import Session


FIVEMINUTES = 300000  # millisecs in five minutes     

class SessionHandler(multiprocessing.Process):

    def __init__(self, event_queue, processId):
        multiprocessing.Process.__init__(self)
        self.event_queue = event_queue
        self.processId = processId
        self.startTs = -1
        self.handler = SessionHandlerSP(processId)
        
    def run(self):
        proc_name = self.name
        print('Process %d ready.' % self.processId)
        while True:
            gcid, evt_id, event = self.event_queue.get()  # wait for next event to be processed
            if gcid is None:
                # Poison pill means shutdown
                # 
                self.handler.writeSessions(self.startTs, abandon = True )
                break
            self.startTs = self.handler.handleEvent(gcid, evt_id, event)

#
# Single process version
#  (No queueing or hashing etc.) 
#
class SessionHandlerSP():
    def __init__(self, processId = 0):
        self.sessionDict = {}  # Dictinary of sessions    
        self.startTs = -1
        self.numClosed = 0
        self.numSuspect = 0
        self.processId = processId
        
    def handleEvent(self, gcid, evt_id, raw):
        """ 

        """
        #gcid  = str(int.from_bytes(raw[16:20], 'big'))
        enbaps1id = int.from_bytes(raw[ 20: 23], 'big')
        racueref = int.from_bytes(raw[ 34: 38], 'big')
        sessId = str(enbaps1id) + ':' + str(racueref)

        # get the time from the event
        timems = getTime(raw[7:11])

        key = str(gcid)+':'+sessId

        # check for late events                 
        if key not in self.sessionDict:  # create a new session
            self.sessionDict[key] = Session(key)

        # add event to session
        self.sessionDict[key].addEvt(evt_id, timems, raw)
        # write some session files
        if timems > self.startTs + FIVEMINUTES:  # five minutes since last check (or no check)                    
            if self.startTs > 0:  # there has been a previous check
                self.sessionDict,c,s = self.writeSessions(timems) 
                self.numClosed += c
                self.numSuspect += s
            self.startTs = timems - (timems % FIVEMINUTES) 
        return self.startTs

    def writeSessions(self, timems, abandon = False):
        """ write the closed and known suspect sessions to files, return the open ones """
        numClosed = 0
        numSuspect =0
        numAbandon = 0
        numHndld = 0
        openSessions = {}  # open valid sessions will be copied here
        with open('tmp/sessions_%s_%d.txt'%(msToStr(self.startTs), self.processId), 'w') as g:
            g.write(Session().toString(header = True))
            for key, sess in self.sessionDict.items():
                if abandon:
                    g.write(sess.toString())
                    numAbandon += 1  
                    numHndld += 1
                elif sess.ended() and timems - sess.getLastEventTime() > 10000: # nothing in the last 10s
                    g.write(sess.toString())
                    numClosed += 1
                    numHndld += 1
                elif timems - sess.getLastEventTime() > 4*FIVEMINUTES: # nothing in last five menutes
                    g.write(sess.toString())
                    numSuspect += 1
                    numHndld += 1
                else:
                    openSessions[key] = sess  # session still open and valid
        print('Process %d, %s, hndld %d, opn %d, suspct %d'
              %(self.processId, msToStr(timems), numClosed, len(openSessions) 
                , numSuspect
                ))
        return openSessions, numClosed, numSuspect

    
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
