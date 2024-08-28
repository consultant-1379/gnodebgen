# version information
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,70,0,37,0


################################################################################################
#
# 31 events triggering ETCM counters
# involving 28 ETCM counters
# grep pm CuCp_13_70.pat | sort | uniq -c | sort
#      1 # pmEbsEndcPSCellChangeAttInterSgnb
#      1 # pmEbsEndcPSCellChangeResAllocReqInterSgnb
#      1 # pmEbsEndcPSCellChangeResAllocSuccInterSgnb
#      1 # pmEbsEndcPSCellChangeSuccInterSgnb
#      1 # pmEbsEndcSetupUeFailOther
#      1 # pmEbsHoExeAttOutEutran
#      1 # pmEbsHoExeAttOutEutranPoorCov
#      1 # pmEbsHoExeAttOutInterGnbIntraF
#      1 # pmEbsHoExeAttOutIntraGnbIntraF
#      1 # pmEbsHoExeSuccOutEutran
#      1 # pmEbsHoExeSuccOutEutranPoorCov
#      1 # pmEbsHoExeSuccOutInterGnbIntraF
#      1 # pmEbsHoExeSuccOutIntraGnbIntraF
#      1 # pmEbsHoPrepAttOutEutran
#      1 # pmEbsHoPrepAttOutEutranPoorCov
#      1 # pmEbsHoPrepAttOutInterGnbIntraF
#      1 # pmEbsHoPrepAttOutIntraGnbIntraF
#      1 # pmEbsHoPrepSuccOutEutran
#      1 # pmEbsHoPrepSuccOutEutranPoorCov
#      1 # pmEbsHoPrepSuccOutInterGnbIntraF
#      1 # pmEbsHoPrepSuccOutIntraGnbIntraF
#      1 # pmEbsRwrEutranUeSuccEpsfbCritCov
#      1 # pmEbsRwrEutranUeSuccEpsfbMeasTo
#      2 # pmEbsEndcPSCellChangeAttIntraSgnb
#      2 # pmEbsEndcPSCellChangeSuccIntraSgnb
#      2 # pmEbsEndcSetupScgUeFailOther
#      2 # pmEbsRwrEutranUeSuccNoIratUeCap

# triggered by 8 unique events:
# grep id CuCp_13_70.pat | sort | uniq -c
#      2 id = CuCpProcEndcSetup
#      8 id = CuCpProcNrHoExeOut
#      8 id = CuCpProcNrHoPrepOut
#      1 id = CuCpProcX2MnInitiatedSgnbModification
#      2 id = CuCpProcX2SgnbAdditionPreparation
#      2 id = CuCpProcX2SgnbChange
#      4 id = CuCpProcX2SnInitiatedSgnbModification
#      4 id = CuCpRwrMobilityDecision


# pmEbsEndcPSCellChangeAttInterSgnb
id = CuCpProcX2SgnbChange

# pmEbsHoPrepAttOutEutran
id = CuCpProcNrHoPrepOut
set = ho_target_freq, 3

# pmEbsEndcPSCellChangeSuccInterSgnb
id = CuCpProcX2SgnbChange
set = sgnb_change_result, 1

# pmEbsHoPrepAttOutIntraGnbIntraF
id = CuCpProcNrHoPrepOut
set = ho_target_node_type, 1
set = ho_target_freq, 1

# pmEbsEndcPSCellChangeResAllocReqInterSgnb
id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_trigger,2

# same counter can be triggered in two ways
# pmEbsEndcPSCellChangeSuccIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 3

# pmEbsEndcPSCellChangeSuccIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 5

# pmEbsHoExeAttOutEutran
id = CuCpProcNrHoExeOut
set = ho_target_freq,3

# pmEbsHoExeSuccOutEutranPoorCov
id = CuCpProcNrHoExeOut
set = ho_target_freq, 3
set = ho_trigger_reason, 1
set = ho_inter_system_type, 2
set = ho_exe_result, 1

# pmEbsHoPrepSuccOutIntraGnbIntraF
id = CuCpProcNrHoPrepOut
set = ho_target_node_type, 1
set = ho_target_freq, 1
set = ho_prep_result, 1

# pmEbsRwrEutranUeSuccEpsfbMeasTo
id = CuCpRwrMobilityDecision
set = rwr_trigger, 7
set = rwr_decision, 1

# pmEbsHoExeSuccOutInterGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_node_type, 2
set = ho_target_freq, 1
set = ho_exe_result, 1

# pmEbsRwrEutranUeSuccEpsfbCritCov
id = CuCpRwrMobilityDecision
set = rwr_trigger, 8
set = rwr_decision, 1

# pmEbsHoPrepSuccOutEutran
id = CuCpProcNrHoPrepOut
set = ho_target_freq, 3
set = ho_prep_result, 1

# pmEbsHoPrepSuccOutInterGnbIntraF
id = CuCpProcNrHoPrepOut
set = ho_target_node_type, 2
set = ho_target_freq, 1
set = ho_prep_result, 1

# pmEbsHoExeSuccOutEutran
id = CuCpProcNrHoExeOut
set = ho_target_freq, 3
set = ho_exe_result, 1

# two ways of triggering same counter
# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 3

# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 5

# pmEbsEndcSetupScgUeFailOther
id = CuCpProcEndcSetup
set = endc_setup_result, 13

# pmEbsEndcSetupScgUeFailOther
id = CuCpProcX2MnInitiatedSgnbModification
set = modification_result, 12
set = modification_type, 1

# pmEbsEndcSetupUeFailOther
id = CuCpProcEndcSetup
set = endc_setup_result, 13

# pmEbsHoExeAttOutIntraGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_node_type, 1
set = ho_target_freq, 1

# pmEbsHoExeSuccOutIntraGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_node_type, 1
set = ho_target_freq, 1
set = ho_exe_result, 1

# pmEbsHoPrepAttOutEutranPoorCov
id = CuCpProcNrHoPrepOut
set = ho_target_freq, 3
set = ho_trigger_reason, 1
set = ho_inter_system_type, 2

# pmEbsEndcPSCellChangeResAllocSuccInterSgnb
id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_result, 1
set = sgnb_addition_preparation_trigger, 2

# pmEbsHoExeAttOutEutranPoorCov
id = CuCpProcNrHoExeOut
set = ho_target_freq, 3
set = ho_trigger_reason,1
set = ho_inter_system_type, 2

# pmEbsRwrEutranUeSuccNoIratUeCap
id = CuCpRwrMobilityDecision
set = rwr_trigger, 5
set = rwr_decision, 1

# pmEbsRwrEutranUeSuccNoIratUeCap
id = CuCpRwrMobilityDecision
set = rwr_trigger, 6
set = rwr_decision, 1

# pmEbsHoPrepAttOutInterGnbIntraF
id = CuCpProcNrHoPrepOut
set = ho_target_node_type, 2
set = ho_target_freq, 1

# pmEbsHoExeAttOutInterGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set = ho_target_freq, 1

# pmEbsHoPrepSuccOutEutranPoorCov
id = CuCpProcNrHoPrepOut
set = ho_target_freq, 3
set = ho_trigger_reason, 1
set = ho_inter_system_type, 2
set = ho_prep_result, 1

# pmEbsCellDowntimeMan
id = DuPerNRCellDUDowntime
set =downtime_type,1

# pmEbsCellDowntimeAuto
id = DuPerNRCellDUDowntime
set =downtime_type,2

# pmEbsDuExampleCounter
id = DuPerUeTrafficRep
set =per_ue_rlc_arq_dl_ack,1

id = DuPerUeRbTrafficRep
# pmEbsMacVolDlDrb
set =per_rb_mac_vol_dl_drb,0
# pmEbsMacTimeDlDrb
set =per_rb_mac_time_dl_drb,0


id = DuPerCellTrafficRep
# pmEbsMacVolDl
set =per_cell_mac_vol_dl,0
# pmEbsPdschAvailTime
set =per_cell_pdsch_avail_time,0
# pmEbsMacVolUl
set =per_cell_mac_vol_ul,0
# pmEbsPuschSchedActivity
set =per_cell_pusch_sched_activity,0
# pmEbsPdschSchedActivity
set =per_cell_pdsch_sched_activity,0
# pmEbsPuschAvailTime
set =per_cell_pusch_avail_time,0



# expect 20 times number of events
# pmEbsDuExampleCompressedPdfCounter
id = DuPerCellTrafficRep
set =per_cell_mac_contention_delay_dl_distr,[-1,0,20,21]



################################################################################################
# 1 CUUP events that will trigger ETCM counters
#
# Generated a total of 3 comprising of 1 ETCM events plus 1 Heartbeat events (with interval between heartbeats of 0 events) and 1 DroppedEvents for PM_EVENT_MESSAGE_GROUP_CUUP. Max Event Size is 250. Generated GZIP File size of 171 bytes
#
#--------------- CUUP 1 LOOP START -----------------
id = CuUpTestEventEnm
set = data, 1
#--------------- CUUP 1 LOOP END    -----------------