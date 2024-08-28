#!/usr/bin/python
file = 'H:/XMANABH/Bundled_GPB_Repo/GNodeBGen/GNodeBGen/src/main/resources/config/file.txt'
newFile = 'H:/XMANABH/Bundled_GPB_Repo/GNodeBGen/GNodeBGen/src/main/resources/config/newFile.txt'
id = 2001
event = 'du'

methods = event + 'EventBuilder.set{REPLACE_METHOD_NAME}(' + event + 'EventBuilder.get{REPLACE_METHOD_NAME}().toBuilder().setGnbId(Long.parseLong(enrichedData.get__gNBId())));' + event + 'EventBuilder.set{REPLACE_METHOD_NAME}(' + event + 'EventBuilder.get{REPLACE_METHOD_NAME}().toBuilder().setGnbIdLength(Long.parseLong(enrichedData.get__gNBIdLength())));' + event + 'EventBuilder.set{REPLACE_METHOD_NAME}(' + event + 'EventBuilder.get{REPLACE_METHOD_NAME}().toBuilder().setNci(Long.parseLong(cellData.get(0).get__nCI())));break;'

dataList = []

with open(file, 'r') as f:
    for line in f:
        line = line.strip().replace(';','').replace('return', '').split(':')[1].strip().split('_')
        dataList.append(''.join([x.title() for x in line]))



wf = open(newFile, 'w')

list_one = []
list_two = []

for line in dataList:
    line = line.strip()
    list_two.append('case ' + str(id) + ':')
    list_two.append(methods.replace('{REPLACE_METHOD_NAME}', line))
    id += 1


 
for line in list_two:
    wf.write(line + '\n\n\n')

wf.flush()
wf.close()
print 'complete'

        