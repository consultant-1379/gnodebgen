# version information
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0

#USE THIS FOR 667 ONLY o/w Dropped counters (Set CellsPerNode=1  in S3.ini)
#set = nci, 16385
#set = gnb_id, 1
#set = gnb_id_length, 22

################################################################################################
# 1 CUUP events that will trigger ETCM counters
#
# Generated a total of 3 comprising of 1 ETCM events plus 1 Heartbeat events (with interval between heartbeats of 0 events) and 1 DroppedEvents for PM_EVENT_MESSAGE_GROUP_CUUP. Max Event Size is 250. Generated GZIP File size of 171 bytes
#
#--------------- CUUP 1 LOOP START -----------------
id = CuUpTestEventEnm
set = data, 1
#--------------- CUUP 1 LOOP END    -----------------