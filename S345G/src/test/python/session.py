from interestingEvents import InterestingEvents

   
class Session(object):
    
    def __init__(self, sessionId = -1):
        self.id = sessionId
        self.evtList = []  # all the events in this session
        self.delayList = []  # how long since the previous event
        #self.patList = []  # the pattern events
        self.startTime = 99999999
        self.endTime = -1
        self.opener = -1  # Id of opening event
        self._started = False  # until an opener recieved
        self.closer = -1  # Id of closeing event
        self._ended = False
        self.suspect = True
        self.failed = True  # True if closed with error code or not closed
        self.errorCode = 0
        self.errorEvent = 0
        self.lastEvt = 0  # timestampt from last event recieved
        self.externals = 0  # number of external events
        self.asnLen = 0
        self.x2_dir = -1
        self.x2_len = -1
        
    def toString(self, header = False):
        if header:
            return '' #'Start, End, time, suspect, failed, duration'
            
        return '%5d, %5d, %4d, %3d, "%s", %5r, %s, "%s", %d, %d\n' %(
            self.opener, self.closer,                 
                int((self.endTime - self.startTime)/1000)*1,
                self.errorCode, ','.join(map(str, self.evtList)),
                self.externals > 0, self.id, 
                ','.join(map(str, self.delayList[1:])),
                self.errorEvent, self.startTime,
             )
       
    def toString1(self, header = False):
        if header:
            return '%30s,    %s,    %s, %s, %s, %s, %s, %s, %s\n' %(
                'SessionId', 'Len(ms)', 'NumEvts', 'starter', 'ender', 'suspect', 'failed', 'resultCode', 'Evts')
            
        return '%32s, %7d, %6d, %5d, %5d, %5r, %5r, %3d, "%s"\n' %(
                self.id, (self.endTime - self.startTime), 
                len(self.evtList), self.opener, self.closer, 
                self.suspect, self.failed, self.resultCode, ','.join(map(str, self.evtList)))

    def numEvts(self):
        ''' How many events in this session '''
        return len(self.evtList)
    
    def lenSession(self):
        ''' How long did this session last ?'''
        return self.endTime - self.startTime
    
    def addEvt(self, evt_id, timestamp, rawEvt):
        """ add an event to the session """
        self.evtList.append(evt_id)
        self.delayList.append(timestamp - self.lastEvt)  # how long has it been since this session 
                                                         # last received an event 
        
        self.lastEvt = timestamp  # record the time of the last event recieved
                                  # some events are out of sequence
        
        if timestamp < self.startTime:
            self.startTime = timestamp
        if timestamp > self.endTime:
            self.endTime = timestamp
        if InterestingEvents.isStarter(evt_id):
            self.opener = evt_id            
        if InterestingEvents.isOpener(evt_id):                
            self._started = True
        if InterestingEvents.isEnder(evt_id) :
            if not self._ended:
                self.closer = evt_id            
            self.suspect = False
            self._ended = True
            if self.opener != -1:
                self.failed = False
        if InterestingEvents.isCloser(evt_id):  # a failed opener can be a closer
            # get result code information
            pos, noerror, name = InterestingEvents.rcInfo(evt_id)
            # rcPos = sessionDict[key].getResultCodePosition(evt_id)
            rc = int(rawEvt[pos])            
            if rc != noerror:
                if self.errorCode == noerror:  # capture first error only
                    self.errorCode = rc
                    self.errorEvent = evt_id
                self.closer = evt_id  # only a closer event if in error
                self._ended = True
                self.failed = True
                self.suspect = False
        #if InterestingEvents.isExternal(evt_id):
        #    self.externals += 1
        #    pos = InterestingEvents.asnInfo(evt_id)
        #    self.asnLen = int(rawEvt[pos]*256 + rawEvt[pos+1])
        #    # asn = rawEvt[pos+2:pos+asnLen]
        if evt_id == InterestingEvents.X2_HANDOVER_REQUEST.value: # 2058:
            #x2_dir = int(rawEvt[41])
            racueref = int.from_bytes(rawEvt[ 34: 38], 'big')
            if 2147483648 == racueref: # invalid
                self._ended = True  # no point keeping this one open. 
            
            # self.x2_len = int(rawEvt[42]*256 + rawEvt[43])
    
    def setResult(self, code):
        self.resultCode = code

    def getLastEventTime(self):
        return self.lastEvt

    def ended(self):
        """ has this session recieved an end event? """
        return self._ended

    def started(self):
        """ has this session recieved an end event? """
        return self._ended
    
if __name__ == '__main__':
    sessionDict = {}
    key = 'gcid-enbaps1-racue'
    sessionDict[key] = Session(key)
    id = 1234
    timems = 9876
    rc = -1
    sessionDict[key].addEvt(id, timems, rc)
    print( sessionDict[key].toHeader())
    print( sessionDict[key].toString())
