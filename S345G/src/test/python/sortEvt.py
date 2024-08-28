import sys
import glob 

from interestingEvents import InterestingEvents

def sortEvt(inFile):
    """ parse files listing event id, and occourance 
    and sort into ASR / not ASR
    """
    
    totEvt = 0
    totASR = 0
    totEBS = 0
    totCom = 0
    for fname in sorted(glob.glob(inFile)):
        numEvt = 0
        numASR = 0
        numEBS = 0
        numCom = 0
        with open(fname, 'r') as f:
            for line in f.readlines():
                evts, occs, _ = line.split(',')
                evt = int(evts)
                occ = int(occs)
                numEvt += occ
                totEvt += occ
                if InterestingEvents.isASROnlyEvt(evt):
                    numASR += occ
                    totASR += occ
                elif InterestingEvents.isCommonEvt(evt):
                    numCom += occ
                    totCom += occ
                elif InterestingEvents.isEBSLonlyEvt(evt):
                    numEBS += occ
                    totEBS += occ

        print('  Events,  ASR, Common, EBS-L')
        print('%s: %d, %d (%.3f), %d (%.3f), %d (%.3f) '%(fname, numEvt, numASR, numASR/numEvt * 100, numCom, numCom/numEvt * 100, numEBS, numEBS/numEvt * 100))
    
    print('Total: %d, %d (%.3f), %d (%.3f), %d (%.3f) '%( totEvt, totASR, totASR/totEvt*100, totCom, totCom/totEvt*100, totEBS, totEBS/totEvt*100))

if __name__ == '__main__':
    inFile="*.evtFreq"
    verbose = True
    
    track=''
    test = False
    for arg in sys.argv:
        if arg.startswith("inFile="):
            inFile=arg.split('=')[1]

    sortEvt(inFile)