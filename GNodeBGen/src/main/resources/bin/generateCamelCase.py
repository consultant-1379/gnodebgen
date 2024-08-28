#!/usr/bin/python

file = 'H:/XMANABH/Bundled_GPB_Repo/GNodeBGen/GNodeBGen/src/main/resources/config/file.txt'

with open(file, 'r') as f:
    for line in f:
        line = line.strip().split('_')
        print ''.join([x.title() for x in line])
        


