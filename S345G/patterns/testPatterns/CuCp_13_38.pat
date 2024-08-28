# version information
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0

#USE THIS FOR 667 ONLY o/w Dropped counters (Set CellsPerNode=1  in S3.ini)
#set = nci, 16385
#set = gnb_id, 1
#set = gnb_id_length, 22


################################################################################################
#
# 9 CUCP events triggering ETCM counters listed below
#
# Generated a total of 11 comprising of 9 ETCM events plus 1 Heartbeat events (with interval between heartbeats of 0 events) and 1 DroppedEvents for PM_EVENT_MESSAGE_GROUP_CUCP. Max Event Size is 250. Generated GZIP File size of 548 bytes
#
# 2020-07-17 14:04:31,610 INFO  [EtcmMap] ETCM Map: Found ECTM XML Counter file /home/efitleo/gitrepos/5g/gpb-decoder/gpb-decoder-jar/target/test-classes/etcm/etcm_cucp_13_38_0_15_0.xml
# 2020-07-17 14:04:31,636 INFO  [EtcmHandler] CuCpProcX2SnInitiatedSgnbModification : [{sn_initiated_sgnb_modification_type=3, sn_initiated_sgnb_modification_result=1}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcX2MnInitiatedSgnbModification : [{modification_result=12, modification_type=1}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcEndcSetup : [{endc_setup_result=13}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcNrHoPrepOut : [{ho_type=1, ho_prep_result=1}, {ho_type=2, ho_prep_result=1}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcNrHoExeOut : [{ho_type=2, ho_exe_result=1}, {ho_type=1, ho_exe_result=1}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcX2SgnbChange : [{sgnb_change_result=1}]
# 2020-07-17 14:04:31,637 INFO  [EtcmHandler] CuCpProcX2SgnbAdditionPreparation : [{sgnb_addition_preparation_result=1, sgnb_addition_preparation_trigger=2}]

#--------------- CUCP 1 LOOP START -----------------
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 3
set = sn_initiated_sgnb_modification_result, 1

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_result, 12
set = modification_type, 1

id = CuCpProcEndcSetup
set = endc_setup_result, 13

id = CuCpProcNrHoPrepOut
set = ho_type, 1
set = ho_prep_result, 1

id = CuCpProcNrHoPrepOut
set = ho_type, 2
set = ho_prep_result, 1

id = CuCpProcNrHoExeOut
set = ho_type,2
set = ho_exe_result, 1

id = CuCpProcNrHoExeOut
set = ho_type, 1
set = ho_exe_result, 1

id = CuCpProcX2SgnbChange
set = sgnb_change_result, 1

id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_result, 1
set = sgnb_addition_preparation_trigger, 2
#--------------- CUCP 1 LOOP END -----------------
