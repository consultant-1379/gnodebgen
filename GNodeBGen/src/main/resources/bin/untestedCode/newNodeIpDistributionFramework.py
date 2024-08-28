'''
Owner xmanabh
'''

# Split nodes evenly across number of ip and main engine

from collections import defaultdict
from time import time

ipList = [ '127.0.0.1:1001', '127.0.0.1:1002', '127.0.0.1:1003']
nodeList = [ 'NR01gNodeBRadio' + str(x).zfill(5) for x in range(1, 25001)]

noOfMainEngCnt = 5

neCount = len(nodeList)
ipCnt = len(ipList)
tempNeList = nodeList

mod, remainder = int(noOfMainEngCnt/ipCnt), int(noOfMainEngCnt%ipCnt)

noOfConnToMainEng = {}
mainEngToIpToNeMap = defaultdict(lambda : defaultdict(list))

def resetNeCount():
    global neCount
    neCount = len(nodeList)

start = time()

print ('Distributing node across IP and Main Engine evenly.')

for mainEngId in range(noOfMainEngCnt, 0, -1):
    neMod = int(neCount/mainEngId)
    neCount -= neMod
    noOfConnToMainEng[mainEngId] = neMod

resetNeCount()

# DEBUG LOGS
print (mod, remainder)

if mod > 0:
    mainEngId = 1
    for ip in ipList:
        for iterId in range(1, mod + 1):
            for connIter in range(noOfConnToMainEng[mainEngId]):
                mainEngToIpToNeMap[mainEngId][ip].append(tempNeList.pop(0))
            mainEngId += 1

if remainder > 0:
    ipCounter = 0
    for mainEngId in range(noOfMainEngCnt - remainder + 1, noOfMainEngCnt + 1):
        for connIter in range(noOfConnToMainEng[mainEngId]):
            if ipCounter >= ipCnt:
                ipCounter = 0
            mainEngToIpToNeMap[mainEngId][ipList[ipCounter]].append(tempNeList.pop(0))
            ipCounter += 1

end = time()

print ('Distribution completed.')

print ('Time taken : ' + str(end - start) + ' seconds.')

print ('No of connection to Main Engine : ')
print (noOfConnToMainEng)

totalConnToIp = {}
for mainEngId, ipToNeMap in mainEngToIpToNeMap.items():
    for ip, nes in ipToNeMap.items():
        if ip in totalConnToIp:
            totalConnToIp[ip] = (totalConnToIp[ip] + len(nes))
        else:
            totalConnToIp[ip] = len(nes)

print ('No of nes to Ip : ')
print (totalConnToIp)

print ('Detailed distribution : ')
for mainEngId, ipToNeMap in mainEngToIpToNeMap.items():
    for ip, nes in ipToNeMap.items():
        print ('Main Eng id : ' + str(mainEngId) + ', IP : ' + ip + ', Ne Cnt : ' + str(len(nes)))