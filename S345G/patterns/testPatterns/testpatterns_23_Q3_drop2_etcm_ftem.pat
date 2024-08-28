#version information

version = CUCP,16,247,0,182,0
version = CUUP,16,21,0,82,0
version = DU,16,121,0,123,0

id = CuCpProcNrHoPrepOut
set = ho_interface_type,3
set = ho_target_node_type,2
set = ho_prep_result,1
set = ho_trigger_reason,6


#old 25 events 13_79

# event Id CuCpPerCellRrcConnectedUe trigger 5 counters
 # pmEbsRrcConnLevelSumEnDc
 # pmEbsRrcConnLevelSamp
 # pmEbsRrcConnLevelMaxSa
 # pmEbsRrcConnLevelSumSa
 # pmEbsRrcConnLevelMaxEnDc
id = CuCpPerCellRrcConnectedUe
set = num_of_nr_rrc_connected_endc,1
set = num_of_nr_rrc_connected_sa,1

# event Id CuCpPerCuCpRrcConnectedUe trigger 5 counters
 # pmEbsRrcConnLevelMaxSa
 # pmEbsRrcConnLevelSumSa
 # pmEbsRrcConnLevelMaxEnDc
 # pmEbsRrcConnLevelSumEnDc
 # pmEbsRrcConnLevelSamp
id = CuCpPerCuCpRrcConnectedUe
set = num_of_nr_rrc_connected_sa,1
set = num_of_nr_rrc_connected_endc,1

# from previos patterns 23 events

# event Id CuCpProcEndcSetup trigger 2 counters
# pmEbsEndcSetupUeAtt
# pmEbsEndcSetupUeSucc
id = CuCpProcEndcSetup
set = sgnb_addition_trigger_indication,1
set = endc_setup_result,1
# event Id CuCpProcNrHoExeOut trigger 4 counters
# pmEbsHoExeAttOutInterGnb
# pmEbsHoExeAttOutIntraGnb
# pmEbsHoExeSuccOutInterGnb
# pmEbsHoExeSuccOutIntraGnb
id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set = ho_exe_result,1
set = ho_trigger_reason,6
# event Id CuCpProcNrHoPrepOut trigger 4 counters
# pmEbsHoPrepAttOutInterGnb
# pmEbsHoPrepAttOutIntraGnb
# pmEbsHoPrepSuccOutInterGnb
# pmEbsHoPrepSuccOutIntraGnb
id = CuCpProcNrHoPrepOut
set = ho_target_node_type,1
set = ho_prep_result,1
set = ho_trigger_reason,6

# event Id CuCpProcNgSigConnEstab trigger 4 counters
# pmEbsNgSigConnEstabAtt
# pmEbsNgSigConnEstabAttMos
# pmEbsNgSigConnEstabSucc
# pmEbsNgSigConnEstabSuccMos
id = CuCpProcNgSigConnEstab
set = establishment_cause,4
set = ng_sig_conn_estab_result,1
# event Id CuCpProcRrcEstab trigger 6 counters
# pmEbsRrcConnEstabAtt
# pmEbsRrcConnEstabAttMos
# pmEbsRrcConnEstabAttReatt
# pmEbsRrcConnEstabAttReattMos
# pmEbsRrcConnEstabSucc
# pmEbsRrcConnEstabSuccMos
id = CuCpProcRrcEstab
set = establishment_cause,4
set = reattempt_indicator_param,2
set = rrc_conn_estab_result,1
# event Id CuCpProcInitialCtxtEstab trigger 2 counters
# pmEbsUeCtxtEstabAtt
# pmEbsUeCtxtEstabSucc
id = CuCpProcInitialCtxtEstab
set = initial_ctxt_estab_result,1

#clubbed 13_70

id = CuCpProcEndcSetup
set = endc_setup_result,13
set = sgnb_addition_trigger_indication,1

# event Id CuCpProcNrHoExeOut trigger 8 counters
 # pmEbsHoExeAttOutEutran
 # pmEbsHoExeSuccOutIntraGnbIntraF
 # pmEbsHoExeSuccOutEutranPoorCov
 # pmEbsHoExeAttOutInterGnbIntraF
 # pmEbsHoExeSuccOutEutran
 # pmEbsHoExeAttOutEutranPoorCov
 # pmEbsHoExeSuccOutInterGnbIntraF
 # pmEbsHoExeAttOutIntraGnbIntraF

# pmEbsHoExeAttOutEutran
# pmEbsHoExeSuccOutEutranPoorCov
# pmEbsHoExeSuccOutEutran
# pmEbsHoExeAttOutEutranPoorCovn
id = CuCpProcNrHoExeOut
set = ho_target_freq,3
set = ho_trigger_reason,1
set = ho_inter_system_type,2
set = ho_exe_result,1

# pmEbsHoExeSuccOutIntraGnbIntraF
# pmEbsHoExeAttOutIntraGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_freq,1
set = ho_target_node_type,1
set = ho_exe_result,1
set = ho_trigger_reason,6


# pmEbsHoExeAttOutInterGnbIntraF
# pmEbsHoExeSuccOutInterGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_freq,1
set = ho_target_node_type,2
set = ho_exe_result,1


id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set = ho_interface_type,3
set = ho_exe_result,1


# event Id CuCpProcNrHoPrepOut trigger 8 counters
 # pmEbsHoPrepAttOutInterGnbIntraF
 # pmEbsHoPrepAttOutIntraGnbIntraF
 # pmEbsHoPrepSuccOutEutran
 # pmEbsHoPrepSuccOutIntraGnbIntraF
 # pmEbsHoPrepAttOutEutran
 # pmEbsHoPrepAttOutEutranPoorCov
 # pmEbsHoPrepSuccOutEutranPoorCov
 # pmEbsHoPrepSuccOutInterGnbIntraF

# pmEbsHoPrepAttOutInterGnbIntraF
# pmEbsHoPrepSuccOutInterGnbIntraF
id = CuCpProcNrHoPrepOut
set = ho_target_freq,1
set = ho_target_node_type, 2
set = ho_prep_result, 1

# pmEbsHoPrepAttOutIntraGnbIntraF
# pmEbsHoPrepSuccOutIntraGnbIntraFnnn
id = CuCpProcNrHoPrepOut
set = ho_target_freq,1
set = ho_target_node_type, 1
set = ho_prep_result, 1

# pmEbsHoPrepAttOutEutran
# pmEbsHoPrepSuccOutEutran
# pmEbsHoPrepAttOutEutranPoorCov
# pmEbsHoPrepSuccOutEutranPoorCov
id = CuCpProcNrHoPrepOut
set = ho_target_freq,3
set = ho_prep_result, 1
set = ho_trigger_reason,1
set = ho_inter_system_type,2


# event Id CuCpProcX2MnInitiatedSgnbModification trigger 1 counters
 # pmEbsEndcSetupScgUeFailOther
id = CuCpProcX2MnInitiatedSgnbModification
set = modification_result, 12
set = modification_type, 1

# event Id CuCpProcX2SgnbAdditionPreparation trigger 2 counters
 # pmEbsEndcPSCellChangeResAllocReqInterSgnb
 # pmEbsEndcPSCellChangeResAllocSuccInterSgnb
id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_trigger,2
set = sgnb_addition_preparation_result,1

# event Id CuCpProcX2SgnbChange trigger 2 counters
 # pmEbsEndcPSCellChangeSuccInterSgnb
 # pmEbsEndcPSCellChangeAttInterSgnb
id = CuCpProcX2SgnbChange
set = sgnb_change_result,1
set = ps_cell_change_target_freq,1
set = ho_target_node_type, 1

# event Id CuCpProcX2SnInitiatedSgnbModification trigger 2 counters
# OR conditions exist!
 # pmEbsEndcPSCellChangeAttIntraSgnb
 # pmEbsEndcPSCellChangeSuccIntraSgnb
# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set = sn_initiated_sgnb_modification_result,1
set = ps_cell_change_target_freq,1
set = ho_target_node_type, 1

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set = sn_initiated_sgnb_modification_result,3
set = ps_cell_change_target_freq,1
set = ho_target_node_type, 1
# OR conditions exist!
# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,5
set = sn_initiated_sgnb_modification_result,1
set = ho_target_node_type, 1

# event Id CuCpRwrMobilityDecision trigger 3 counters
# OR conditions exist!
 # pmEbsRwrEutranUeSuccEpsfbCritCov
 # pmEbsRwrEutranUeSuccNoIratUeCap
 # pmEbsRwrEutranUeSuccEpsfbMeasTo

# pmEbsRwrEutranUeSuccEpsfbCritCov
id = CuCpRwrMobilityDecision
set = rwr_trigger,8
set = rwr_decision,1

# pmEbsRwrEutranUeSuccNoIratUeCap
id = CuCpRwrMobilityDecision
set = rwr_trigger,5
set = rwr_decision,1
# OR condition exists!
# pmEbsRwrEutranUeSuccNoIratUeCap
id = CuCpRwrMobilityDecision
set = rwr_trigger,6
set = rwr_decision,1

# pmEbsRwrEutranUeSuccEpsfbMeasTo
id = CuCpRwrMobilityDecision
set = rwr_trigger,7
set = rwr_decision,1

#pmEbsRwrEutranUeSuccUeCapFailDu
id = CuCpRwrMobilityDecision
set = rwr_trigger,9
set = rwr_decision,1

#New counters

id = CuCpProcEndcRelease
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set = endc_release_cause,4
set = endc_release_triggering_node,1

id = CuCpProcEndcRelease
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set = endc_release_cause,6
set = endc_release_triggering_node,2

#Counter pmEbsEndcRelUeNormal will trigger
id = CuCpProcEndcRelease
set = release_complete_param,JSON{"key":42,"value":2}
set = endc_release_cause,2

id = CuCpProcEndcRelease
set = release_complete_param,JSON{"key":42,"value":2}
set = endc_release_cause,4
set = endc_release_triggering_node,1

id = CuCpProcEndcRelease
set = release_complete_param,JSON{"key":42,"value":2}
set = endc_release_cause,9
set = endc_release_triggering_node,2

id = CuCpProcPduSessionResourceRelease
set = drb_release_list,JSON[{"drb_id" :31, "mapped_5qi" : 7, "pdu_session_id" : 12, "s_nssai":"0x01","drb_session_time" : 1}]
set = pdu_session_release_list ,JSON[{"pdu_session_id" : 10, "s_nssai": "0x01"}]
set = pdu_session_resource_release_result, 1


id = CuCpProcPduSessionResourceSetup
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :27, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01"}]
set = pdu_session_setup_list,JSON[{"pdu_result": 1, "pdu_session_id" : 10, "s_nssai": "0x01"}]

#21.Q3
id = CuCpProcPduSessionResourceSetup
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01"}]
set = limited_service_mode,2

id = CuCpProcPduSessionResourceSetup
set = drb_setup_list,JSON[{"drb_result" : 3,"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01"}]
set = limited_service_mode,2


id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_type, 3
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,2

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_type, 2
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":1, "drb_session_time":1}]
set = pdu_session_release_list, JSON[{"pdu_session_id" : 20, "s_nssai": "0x01"}]


id = CuCpProcUeCtxtRel
set = pdu_session_release_list, JSON[{"pdu_session_id" : 20, "s_nssai": "0x01"}]
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcUeCtxtRel
set = pdu_session_release_list, JSON[{"pdu_session_id" : 20, "s_nssai": "0x01"}]
set = ue_ctxt_rel_initiator,5
set = ue_ctxt_rel_type,3
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 1, "drb_rel_initiator" : 2,  "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 5,  "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 9, "drb_rel_type" : 2, "drb_rel_initiator" : 4,  "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 12, "drb_rel_type" : 3, "drb_rel_initiator" : 4,  "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = drb_setup_list,JSON[{"drb_id" :32, "drb_result" : 1, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01"}]


id = CuCpProcPduSessionResourceModify
set = pdu_session_modify_list,JSON[{"pdu_result": 1, "pdu_session_id" : 12, "s_nssai": "0x01"}]

#21.Q3
id = CuCpProcPduSessionResourceModify
set = drb_setup_list,JSON[{"drb_id" :32, "drb_result" : 1, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01"}]
set = limited_service_mode,2

id = CuCpProcPduSessionResourceModify
set = drb_setup_list,JSON[{"drb_id" :32, "drb_result" : 3, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01"}]
set = limited_service_mode,2

id = CuCpProcInitialCtxtEstab
set = pdu_session_setup_list,JSON[{"pdu_result": 1, "pdu_session_id" : 19, "s_nssai" : "0x01"}]
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :26, "mapped_5qi" : 8, "pdu_session_id" : 19, "s_nssai":"0x01"}]
set = initial_ctxt_estab_result,1

#21.Q3
id = CuCpProcInitialCtxtEstab
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :24, "mapped_5qi" : 8, "pdu_session_id" : 19, "s_nssai":"0x01"}]
set = limited_service_mode,2

id = CuCpProcInitialCtxtEstab
set = drb_setup_list,JSON[{"drb_result" : 3,"drb_id" :26, "mapped_5qi" : 8, "pdu_session_id" : 19, "s_nssai":"0x01"}]
set = limited_service_mode,2


# New

id = CuCpPerCellDrbSetup
set = num_of_drb_setup_endc,5

id = CuCpPerCellPduSession
set = num_of_pdu_session,10

id = CuCpPerCellDrbSetup
set = num_of_drb_setup_endc,10

id = CuCpPerCellPduSession
set = num_of_pdu_session,20

#21.Q3
id = CuCpPerCellDrbSetup
set = num_of_drb_setup_list_sa,JSON[{"s_nssai" : "0x01", "num_of_drb_setup_sa" :10}]

id = CuCpPerCellDrbSetup
set = num_of_drb_setup_list_sa,JSON[{"s_nssai" : "0x01", "num_of_drb_setup_sa" :20}]

#21.Q3 CuCp counters changed
id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"num_of_nr_rrc_connected_ue_endc":10,"num_of_nr_rrc_connected_ue_sa":20}]

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"num_of_nr_rrc_connected_ue_endc":30,"num_of_nr_rrc_connected_ue_sa":40}]

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"num_of_nr_rrc_connected_ue_endc":50,"num_of_nr_rrc_connected_ue_sa":60}]

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"num_of_nr_rrc_connected_ue_endc":70,"num_of_nr_rrc_connected_ue_sa":80}]

# Drop5

id = CuCpProcMnNrdcRelease
set = mn_release_with_relocation,2
set = mn_nrdc_release_result,1
set = intra_cell_handover,2

id = CuCpProcMnNrdcSetup
set = mn_nrdc_setup_result,1
set = intra_cell_handover,2


# event Id DuPerCellTrafficRep trigger 4 counters
 # pmEbsActiveUeUlSamp
 # pmEbsActiveUeUlSum
 # pmEbsActiveUeDlSum
 # pmEbsActiveUeDlSamp
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,1
set = per_cell_active_ue_ul_sum,1
set = per_cell_active_ue_dl_sum,1
set = per_cell_active_ue_dl_samp,1

# event Id DuPerCellResourceRep trigger 9 counters
 # pmEbsMacRBSymUsedPdschTypeABroadcasting
 # pmEbsMacRBSymUsedPdschTypeA
 # pmEbsMacRBSymAvailDl
 # pmEbsMacRBSymUsedPuschTypeB
 # pmEbsMacRBSymAvailUl
 # pmEbsMacRBSymCsiRs
 # pmEbsMacRBSymUsedPdcchTypeB
 # pmEbsMacRBSymUsedPuschTypeA
 # pmEbsMacRBSymUsedPdcchTypeA
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_used_pdsch_type_a_broadcast,1
set = per_cell_mac_rbsym_used_pdsch_type_a,1
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pusch_type_b,1
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_csi_rs,1
set = per_cell_mac_rbsym_used_pdcch_type_b,1
set = per_cell_mac_rbsym_used_pusch_type_a,1
set = per_cell_mac_rbsym_used_pdcch_type_a,1

# merger from previos patterns. 14 events

# event Id DuPerUeTrafficRep trigger 2 counters
# pmEbsMacTimeUlResUe
# pmEbsMacVolUlResUe
id = DuPerUeTrafficRep
# Generated using ETCM configuration file.
set = per_ue_rlc_arq_dl_ack, 1

set = per_ue_mac_time_ul_res_ue,1
set = per_ue_mac_vol_ul_res_ue,1
# event Id DuPerRadioCellMeasurement trigger 3 counters
# pmEbsRadioRaCbAttMsg2
# pmEbsRadioRaCbPreambles
# pmEbsRadioRaCbSuccMsg3
id = DuPerRadioCellMeasurement
set = per_cell_ra_cb_att_msg2,1
set = per_cell_ra_cb_preambles,1
set = per_cell_ra_cb_succ_msg3,1
# event Id DuPerCellTrafficRep trigger 2 counters
#Arithmetic counters in DU
# pmEbsActiveUeUlMax
# pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,4
set = per_cell_active_ue_dl_samp,4
# event Id DuPerCellResourceRep trigger 4 counters
#Arithmetic counters in DU
# pmEbsMacRBSymUtilUlDistr
# pmEbsMacRBSymUtilDlDistr
# pmEbsMacRBSymUtilUlMax
# pmEbsMacRBSymUtilDlMax
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,2
set = per_cell_mac_rbsym_total_avail_dl,2
# event Id DuPerCellQosTrafficRep trigger 4 counters
 # pmEbsMacLatTimeDlDrxSyncQos
 # pmEbsMacLatTimeDlDrxSyncSampQos
 # pmEbsMacLatTimeDlNoDrxSyncQos
 # pmEbsMacLatTimeDlNoDrxSyncSampQos
id = DuPerCellQosTrafficRep
set = per_qos_mac_lat_time_dl_drxinactive_insync,1
set = qos_value,1
set = per_qos_mac_lat_time_dl_drxinactive_insync_samp,1
set = per_qos_mac_lat_time_dl_drxactive_insync,1
set = per_qos_mac_lat_time_dl_drxactive_insync_samp,1
# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrbQos
 # pmEbsMacVolDlDrbQos
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = qos_value,1
set = per_rb_mac_vol_dl_drb,1
#pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_dl_samp,8
#pmEbsActiveUeUlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,8
#pmEbsUeCtxtSetupFailUeCapFail
id = DuProcUeContextSetup
set = ue_context_setup_result,5

#clubbed du_13_37

id = DuPerCellTrafficRep
set = per_cell_mac_vol_ul,1
set = per_cell_mac_vol_dl,1
set = per_cell_mac_contention_delay_dl_distr,[-1,0,1,21]
set = per_cell_pdsch_sched_activity,1
set = per_cell_pusch_sched_activity,1
set = per_cell_pdsch_avail_time,1
set = per_cell_pusch_avail_time,1

# event Id DuPerNRCellDUDowntime trigger 2 counters
 # pmEbsCellDowntimeAuto
 # pmEbsCellDowntimeMan
id = DuPerNRCellDUDowntime
set = downtime_type,2

id = DuPerNRCellDUDowntime
set = downtime_type,1

# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrb
 # pmEbsMacVolDlDrb
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = per_rb_mac_vol_dl_drb,1

# event Id DuPerUeTrafficRep trigger 1 counters
 # pmEbsDuExampleCounter
id = DuPerUeTrafficRep
set = per_ue_rlc_arq_dl_ack,1

#21.Q3
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_truesamp,1
set = per_cell_active_ue_dl_truesamp,2

#Drop 5

id = DuPerUeTrafficRep
set = per_ue_mac_harq_ul_dtx_64_qam,10
set = per_ue_mac_harq_ul_ack_qpsk,12
set = per_ue_mac_harq_ul_dtx_16_qam,13
set = per_ue_mac_harq_ul_dtx_qpsk,14
set = per_ue_mac_harq_dl_dtx_16_qam,11
set = per_ue_mac_harq_dl_dtx_256_qam,12
set = per_ue_mac_harq_dl_dtx_64_qam,9
set = per_ue_mac_harq_ul_ack_64_qam,8
set = per_ue_mac_harq_dl_nack_64_qam,6
set = per_ue_mac_harq_ul_nack_16_qam,5
set = per_ue_mac_harq_ul_nack_64_qam,11
set = per_ue_mac_harq_dl_ack_16_qam,14
set = per_ue_mac_harq_dl_ack_qpsk,16
set = per_ue_mac_harq_ul_ack_16_qam,20
set = per_ue_mac_harq_dl_nack_256_qam,4
set = per_ue_mac_harq_dl_nack_qpsk,14
set = per_ue_mac_harq_dl_ack_256_qam,18
set = per_ue_mac_harq_dl_ack_64_qam,23
set = per_ue_mac_harq_dl_nack_16_qam,22
set = per_ue_mac_harq_dl_dtx_qpsk,16
set = per_ue_mac_harq_ul_nack_qpsk,11

id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_pusch_priority_partition,12
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pdsch_ca_scell_partition,11
set = per_cell_mac_rbsym_used_pdsch_residual_partition,12
set = per_cell_mac_rbsym_used_pdsch_priority_partition,13


id = DuPerCellpartitionResourceRep
set = per_cellpartition_mac_rbsym_total_avail_dl,1
set = per_cellpartition_mac_rbsym_used_pdsch,12
set = per_cellpartition_mac_rbsym_total_avail_ul,1
set = per_cellpartition_mac_rbsym_used_pusch,11

#DU 2



# event Id DuPerCellTrafficRep trigger 4 counters
 # pmEbsActiveUeUlSamp
 # pmEbsActiveUeUlSum
 # pmEbsActiveUeDlSum
 # pmEbsActiveUeDlSamp
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,1
set = per_cell_active_ue_ul_sum,1
set = per_cell_active_ue_dl_sum,1
set = per_cell_active_ue_dl_samp,1

# event Id DuPerCellResourceRep trigger 9 counters
 # pmEbsMacRBSymUsedPdschTypeABroadcasting
 # pmEbsMacRBSymUsedPdschTypeA
 # pmEbsMacRBSymAvailDl
 # pmEbsMacRBSymUsedPuschTypeB
 # pmEbsMacRBSymAvailUl
 # pmEbsMacRBSymCsiRs
 # pmEbsMacRBSymUsedPdcchTypeB
 # pmEbsMacRBSymUsedPuschTypeA
 # pmEbsMacRBSymUsedPdcchTypeA
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_used_pdsch_type_a_broadcast,1
set = per_cell_mac_rbsym_used_pdsch_type_a,1
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pusch_type_b,1
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_csi_rs,1
set = per_cell_mac_rbsym_used_pdcch_type_b,1
set = per_cell_mac_rbsym_used_pusch_type_a,1
set = per_cell_mac_rbsym_used_pdcch_type_a,1

# merger from previos patterns. 14 events

# event Id DuPerUeTrafficRep trigger 2 counters
# pmEbsMacTimeUlResUe
# pmEbsMacVolUlResUe
id = DuPerUeTrafficRep
# Generated using ETCM configuration file.
set = per_ue_rlc_arq_dl_ack, 1

set = per_ue_mac_time_ul_res_ue,1
set = per_ue_mac_vol_ul_res_ue,1
# event Id DuPerRadioCellMeasurement trigger 3 counters
# pmEbsRadioRaCbAttMsg2
# pmEbsRadioRaCbPreambles
# pmEbsRadioRaCbSuccMsg3
id = DuPerRadioCellMeasurement
set = per_cell_ra_cb_att_msg2,1
set = per_cell_ra_cb_preambles,1
set = per_cell_ra_cb_succ_msg3,1
# event Id DuPerCellTrafficRep trigger 2 counters
#Arithmetic counters in DU
# pmEbsActiveUeUlMax
# pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,4
set = per_cell_active_ue_dl_samp,4
# event Id DuPerCellResourceRep trigger 4 counters
#Arithmetic counters in DU
# pmEbsMacRBSymUtilUlDistr
# pmEbsMacRBSymUtilDlDistr
# pmEbsMacRBSymUtilUlMax
# pmEbsMacRBSymUtilDlMax
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,2
set = per_cell_mac_rbsym_total_avail_dl,2
# event Id DuPerCellQosTrafficRep trigger 4 counters
 # pmEbsMacLatTimeDlDrxSyncQos
 # pmEbsMacLatTimeDlDrxSyncSampQos
 # pmEbsMacLatTimeDlNoDrxSyncQos
 # pmEbsMacLatTimeDlNoDrxSyncSampQos
id = DuPerCellQosTrafficRep
set = per_qos_mac_lat_time_dl_drxinactive_insync,1
set = qos_value,1
set = per_qos_mac_lat_time_dl_drxinactive_insync_samp,1
set = per_qos_mac_lat_time_dl_drxactive_insync,1
set = per_qos_mac_lat_time_dl_drxactive_insync_samp,1
# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrbQos
 # pmEbsMacVolDlDrbQos
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = qos_value,1
set = per_rb_mac_vol_dl_drb,1
#pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_dl_samp,8
#pmEbsActiveUeUlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,8
#pmEbsUeCtxtSetupFailUeCapFail
id = DuProcUeContextSetup
set = ue_context_setup_result,5

#clubbed du_13_37

id = DuPerCellTrafficRep
set = per_cell_mac_vol_ul,1
set = per_cell_mac_vol_dl,1
set = per_cell_mac_contention_delay_dl_distr,[-1,0,1,21]
set = per_cell_pdsch_sched_activity,1
set = per_cell_pusch_sched_activity,1
set = per_cell_pdsch_avail_time,1
set = per_cell_pusch_avail_time,1

# event Id DuPerNRCellDUDowntime trigger 2 counters
 # pmEbsCellDowntimeAuto
 # pmEbsCellDowntimeMan
id = DuPerNRCellDUDowntime
set = downtime_type,2

id = DuPerNRCellDUDowntime
set = downtime_type,1

# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrb
 # pmEbsMacVolDlDrb
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = per_rb_mac_vol_dl_drb,1

# event Id DuPerUeTrafficRep trigger 1 counters
 # pmEbsDuExampleCounter
id = DuPerUeTrafficRep
set = per_ue_rlc_arq_dl_ack,1

#21.Q3
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_truesamp,1
set = per_cell_active_ue_dl_truesamp,2

#Drop 5

id = DuPerUeTrafficRep
set = per_ue_mac_harq_ul_dtx_64_qam,10
set = per_ue_mac_harq_ul_ack_qpsk,12
set = per_ue_mac_harq_ul_dtx_16_qam,13
set = per_ue_mac_harq_ul_dtx_qpsk,14
set = per_ue_mac_harq_dl_dtx_16_qam,11
set = per_ue_mac_harq_dl_dtx_256_qam,12
set = per_ue_mac_harq_dl_dtx_64_qam,9
set = per_ue_mac_harq_ul_ack_64_qam,8
set = per_ue_mac_harq_dl_nack_64_qam,6
set = per_ue_mac_harq_ul_nack_16_qam,5
set = per_ue_mac_harq_ul_nack_64_qam,11
set = per_ue_mac_harq_dl_ack_16_qam,14
set = per_ue_mac_harq_dl_ack_qpsk,16
set = per_ue_mac_harq_ul_ack_16_qam,20
set = per_ue_mac_harq_dl_nack_256_qam,4
set = per_ue_mac_harq_dl_nack_qpsk,14
set = per_ue_mac_harq_dl_ack_256_qam,18
set = per_ue_mac_harq_dl_ack_64_qam,23
set = per_ue_mac_harq_dl_nack_16_qam,22
set = per_ue_mac_harq_dl_dtx_qpsk,16
set = per_ue_mac_harq_ul_nack_qpsk,11

id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_pusch_priority_partition,12
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pdsch_ca_scell_partition,11
set = per_cell_mac_rbsym_used_pdsch_residual_partition,12
set = per_cell_mac_rbsym_used_pdsch_priority_partition,13


id = DuPerCellpartitionResourceRep
set = per_cellpartition_mac_rbsym_total_avail_dl,1
set = per_cellpartition_mac_rbsym_used_pdsch,12
set = per_cellpartition_mac_rbsym_total_avail_ul,1
set = per_cellpartition_mac_rbsym_used_pusch,11


# event Id DuPerCellTrafficRep trigger 4 counters
 # pmEbsActiveUeUlSamp
 # pmEbsActiveUeUlSum
 # pmEbsActiveUeDlSum
 # pmEbsActiveUeDlSamp
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,1
set = per_cell_active_ue_ul_sum,1
set = per_cell_active_ue_dl_sum,1
set = per_cell_active_ue_dl_samp,1

# event Id DuPerCellResourceRep trigger 9 counters
 # pmEbsMacRBSymUsedPdschTypeABroadcasting
 # pmEbsMacRBSymUsedPdschTypeA
 # pmEbsMacRBSymAvailDl
 # pmEbsMacRBSymUsedPuschTypeB
 # pmEbsMacRBSymAvailUl
 # pmEbsMacRBSymCsiRs
 # pmEbsMacRBSymUsedPdcchTypeB
 # pmEbsMacRBSymUsedPuschTypeA
 # pmEbsMacRBSymUsedPdcchTypeA
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_used_pdsch_type_a_broadcast,1
set = per_cell_mac_rbsym_used_pdsch_type_a,1
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pusch_type_b,1
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_csi_rs,1
set = per_cell_mac_rbsym_used_pdcch_type_b,1
set = per_cell_mac_rbsym_used_pusch_type_a,1
set = per_cell_mac_rbsym_used_pdcch_type_a,1

# merger from previos patterns. 14 events

# event Id DuPerUeTrafficRep trigger 2 counters
# pmEbsMacTimeUlResUe
# pmEbsMacVolUlResUe
id = DuPerUeTrafficRep
# Generated using ETCM configuration file.
set = per_ue_rlc_arq_dl_ack, 1

set = per_ue_mac_time_ul_res_ue,1
set = per_ue_mac_vol_ul_res_ue,1
# event Id DuPerRadioCellMeasurement trigger 3 counters
# pmEbsRadioRaCbAttMsg2
# pmEbsRadioRaCbPreambles
# pmEbsRadioRaCbSuccMsg3
id = DuPerRadioCellMeasurement
set = per_cell_ra_cb_att_msg2,1
set = per_cell_ra_cb_preambles,1
set = per_cell_ra_cb_succ_msg3,1
# event Id DuPerCellTrafficRep trigger 2 counters
#Arithmetic counters in DU
# pmEbsActiveUeUlMax
# pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,4
set = per_cell_active_ue_dl_samp,4
# event Id DuPerCellResourceRep trigger 4 counters
#Arithmetic counters in DU
# pmEbsMacRBSymUtilUlDistr
# pmEbsMacRBSymUtilDlDistr
# pmEbsMacRBSymUtilUlMax
# pmEbsMacRBSymUtilDlMax
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,2
set = per_cell_mac_rbsym_total_avail_dl,2
# event Id DuPerCellQosTrafficRep trigger 4 counters
 # pmEbsMacLatTimeDlDrxSyncQos
 # pmEbsMacLatTimeDlDrxSyncSampQos
 # pmEbsMacLatTimeDlNoDrxSyncQos
 # pmEbsMacLatTimeDlNoDrxSyncSampQos
id = DuPerCellQosTrafficRep
set = per_qos_mac_lat_time_dl_drxinactive_insync,1
set = qos_value,1
set = per_qos_mac_lat_time_dl_drxinactive_insync_samp,1
set = per_qos_mac_lat_time_dl_drxactive_insync,1
set = per_qos_mac_lat_time_dl_drxactive_insync_samp,1
# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrbQos
 # pmEbsMacVolDlDrbQos
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = qos_value,1
set = per_rb_mac_vol_dl_drb,1
#pmEbsActiveUeDlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_dl_samp,8
#pmEbsActiveUeUlMax
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,8
#pmEbsUeCtxtSetupFailUeCapFail
id = DuProcUeContextSetup
set = ue_context_setup_result,5

#clubbed du_13_37

id = DuPerCellTrafficRep
set = per_cell_mac_vol_ul,1
set = per_cell_mac_vol_dl,1
set = per_cell_mac_contention_delay_dl_distr,[-1,0,1,21]
set = per_cell_pdsch_sched_activity,1
set = per_cell_pusch_sched_activity,1
set = per_cell_pdsch_avail_time,1
set = per_cell_pusch_avail_time,1

# event Id DuPerNRCellDUDowntime trigger 2 counters
 # pmEbsCellDowntimeAuto
 # pmEbsCellDowntimeMan
id = DuPerNRCellDUDowntime
set = downtime_type,2

id = DuPerNRCellDUDowntime
set = downtime_type,1

# event Id DuPerUeRbTrafficRep trigger 2 counters
 # pmEbsMacTimeDlDrb
 # pmEbsMacVolDlDrb
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb,1
set = per_rb_mac_vol_dl_drb,1

# event Id DuPerUeTrafficRep trigger 1 counters
 # pmEbsDuExampleCounter
id = DuPerUeTrafficRep
set = per_ue_rlc_arq_dl_ack,1

#21.Q3
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_truesamp,1
set = per_cell_active_ue_dl_truesamp,2


id = DuPerUeTrafficRep
set = per_ue_mac_harq_ul_dtx_64_qam,10
set = per_ue_mac_harq_ul_ack_qpsk,12
set = per_ue_mac_harq_ul_dtx_16_qam,13
set = per_ue_mac_harq_ul_dtx_qpsk,14
set = per_ue_mac_harq_dl_dtx_16_qam,11
set = per_ue_mac_harq_dl_dtx_256_qam,12
set = per_ue_mac_harq_dl_dtx_64_qam,9
set = per_ue_mac_harq_ul_ack_64_qam,8
set = per_ue_mac_harq_dl_nack_64_qam,6
set = per_ue_mac_harq_ul_nack_16_qam,5
set = per_ue_mac_harq_ul_nack_64_qam,11
set = per_ue_mac_harq_dl_ack_16_qam,14
set = per_ue_mac_harq_dl_ack_qpsk,16
set = per_ue_mac_harq_ul_ack_16_qam,20
set = per_ue_mac_harq_dl_nack_256_qam,4
set = per_ue_mac_harq_dl_nack_qpsk,14
set = per_ue_mac_harq_dl_ack_256_qam,18
set = per_ue_mac_harq_dl_ack_64_qam,23
set = per_ue_mac_harq_dl_nack_16_qam,22
set = per_ue_mac_harq_dl_dtx_qpsk,16
set = per_ue_mac_harq_ul_nack_qpsk,11

id = DuPerCellResourceRep
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_pusch_priority_partition,12
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pdsch_ca_scell_partition,11
set = per_cell_mac_rbsym_used_pdsch_residual_partition,12
set = per_cell_mac_rbsym_used_pdsch_priority_partition,13


id = DuPerCellpartitionResourceRep
set = per_cellpartition_mac_rbsym_total_avail_dl,1
set = per_cellpartition_mac_rbsym_used_pdsch,12
set = per_cellpartition_mac_rbsym_total_avail_ul,1
set = per_cellpartition_mac_rbsym_used_pusch,11

# DU 4

#DU last



# event Id DuPerCellTrafficRep trigger 4 counters
 # pmEbsActiveUeUlSamp
 # pmEbsActiveUeUlSum
 # pmEbsActiveUeDlSum
 # pmEbsActiveUeDlSamp
id = DuPerCellTrafficRep
set = per_cell_active_ue_ul_samp,1
set = per_cell_active_ue_ul_sum,1
set = per_cell_active_ue_dl_sum,1
set = per_cell_active_ue_dl_samp,1

# event Id DuPerCellResourceRep trigger 9 counters
 # pmEbsMacRBSymUsedPdschTypeABroadcasting
 # pmEbsMacRBSymUsedPdschTypeA
 # pmEbsMacRBSymAvailDl
 # pmEbsMacRBSymUsedPuschTypeB
 # pmEbsMacRBSymAvailUl
 # pmEbsMacRBSymCsiRs
 # pmEbsMacRBSymUsedPdcchTypeB
 # pmEbsMacRBSymUsedPuschTypeA
 # pmEbsMacRBSymUsedPdcchTypeA
id = DuPerCellResourceRep
set = per_cell_mac_rbsym_used_pdsch_type_a_broadcast,1
set = per_cell_mac_rbsym_used_pdsch_type_a,1
set = per_cell_mac_rbsym_total_avail_dl,1
set = per_cell_mac_rbsym_used_pusch_type_b,1
set = per_cell_mac_rbsym_total_avail_ul,1
set = per_cell_mac_rbsym_used_csi_rs,1
set = per_cell_mac_rbsym_used_pdcch_type_b,1
set = per_cell_mac_rbsym_used_pusch_type_a,1
set = per_cell_mac_rbsym_used_pdcch_type_a,1


#CUUP

#21.Q3

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120


#2

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1
set = nr_type,0
set = serving_plmn_id,"0x134001"


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2
set = nr_type,1
set = serving_plmn_id,"0x134001"


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120
set = nr_type,0
set = serving_plmn_id,"0x134001"

#3

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1
set = nr_type,2
set = serving_plmn_id,"0x134001"


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120
set = nr_type,1
set = serving_plmn_id,"0x134001"

#4

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120
set = nr_type,2
set = serving_plmn_id,"0x134001"

#5

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120

#6

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120

#7

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1


id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2


id = CuUpPerUeRbCgTrafficRep
set = qos_value,2
set = per_rb_cg_rpu_packet_loss_ul_to,2
set = per_rb_cg_rpu_packet_trans_dl,2
set = per_rb_cg_rpu_packet_rec_ul,2
set = per_rb_cg_rpu_packet_loss_ul,2
set = per_rb_cg_rpu_packet_rec_ul_ooo,2
set = per_rb_cg_rpu_packet_loss_ul_to_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc,2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm,2
set = per_rb_cg_rpu_vol_rec_ul,120
set = per_rb_cg_rpu_vol_trans_dl,120

#8

id = CuUpTestEventEnm
set = data,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,4
set = link_type,1
set = per_drb_pdcp_packet_rec_dl_disc,1
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,5
set = link_type,2
set = per_drb_pdcp_packet_rec_dl_disc,2
set = per_drb_pdcp_packet_rec_dl,2
set = per_drb_pdcp_packet_rec_dl_disc_aqm,2

#21.q4drop2

id = CuCpDrbSuspend
set = drb_suspend_list,JSON[{"drb_id" : 1, "mapped_5qi" : 2, "s_nssai" : "0x01"}]

id = CuCpProcRrcEstab
set = rrc_conn_estab_result,1
set = time_stamp_stop,3
set = time_stamp_start,2

id = CuCpProcRrcResume
set = network_action,2
set = rrc_conn_resume_result,4

id = CuCpProcRrcResume
set = rrc_conn_resume_result,1
set = time_stamp_stop,3
set = time_stamp_start,2


id = CuCpProcPduSessionResourceModify
set  = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 2, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 4, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,2
set = ca_conf_based_freq_prio_at_release,2

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_type,2
set = rrc_inactive_state,2
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceRelease
set = pdu_session_resource_release_result,1
set = rrc_inactive_state,2
set = drb_release_list,JSON[{"drb_id" :31, "mapped_5qi" : 7, "pdu_session_id" : 12, "s_nssai":"0x01", "drb_session_time" : 1}]

id = CuCpProcInitialCtxtEstab
set = initial_ctxt_estab_result,1
set = time_stamp_stop,20
set = time_stamp_start,10

id = CuCpPerCellDrbSetup
set = num_of_drb_setup_mapped_5qi_list,JSON[{"mapped_5qi" : 1, "num_of_drb_setup_sa" :20}]


#du

id = DuPerUeRbTrafficRep
set = bearer_id,1
set = qos_value,1

id = DuPerUeRbTrafficRep
set = bearer_id,1
set = per_rb_mac_vol_dl_drb_single_burst,1000000
set = per_rb_mac_vol_dl_drb_last_slot,10000
set = per_rb_mac_vol_dl_drb,10000
set = per_rb_mac_time_dl_drb,100
set = qos_value,3

id = DuPerUeTrafficRep
set = per_ue_mac_vol_ul_unres_ue_pucch_sr_grant,30000000
set = per_ue_mac_vol_ul_unres_ue_preempt_grant,30000000
set = per_ue_mac_vol_ul_unres_ue_bsr_grant,30000000
set = per_ue_mac_vol_ul_res_ue,10000
set = per_ue_mac_vol_ul_res_ue_last_slot,10000
set = per_ue_mac_vol_ul_res_ue_late,100
set = per_ue_mac_time_ul_res_ue,100


id = DuProcRrcAccess
set = rrc_access_du_result,4
set = rrc_access_type,2

id = DuProcRrcAccess
set = rrc_access_du_result,3
set = rrc_access_type,2




#21Q4_drop4

id = CuCpProcRrcReestab
set = fallback_indicator,1
set = rrc_conn_reestab_result,1

id = CuCpProcRrcReestab
set = fallback_indicator,2
set = rrc_conn_reestab_result,1

id = DuPerUeTrafficRep
set = per_ue_dl_scell_act,1
set = per_ue_dl_scell_deact,1

id = DuProcRrcAccess
set = rrc_access_type,1
set = rrc_access_du_result,5

id = DuProcRrcAccess
set = rrc_access_type,1
set = rrc_access_du_result,2

id = DuProcRrcAccess
set = rrc_access_type,3
set = rrc_access_du_result,5

id = DuProcRrcAccess
set = rrc_access_type,3
set = rrc_access_du_result,3

id = DuProcRrcAccess
set = rrc_access_type,3
set = rrc_access_du_result,4

id = DuProcRrcAccess
set = rrc_access_type,3
set = rrc_access_du_result,2

id = DuProcRrcAccess
set = rrc_access_type,2
set = rrc_access_du_result,5

id = DuProcRrcAccess
set = rrc_access_type,2
set = rrc_access_du_result,2


#22.Q1_drop2
#CUCP


id = CuCpProcNrHoExeOut
set = ho_target_freq,3
set = ho_trigger_reason,1
set = ho_exe_result,1
set = ho_target_node_type,2

id = CuCpProcNrHoExeOut
set = ho_target_freq,1
set = ho_target_node_type,2
set = ho_trigger_reason,5
set = ho_interface_type,3
set = ho_exe_result,1

id = CuCpProcNrHoExeOut
set = ho_target_node_type,1
set = ho_target_freq,1
set = ho_trigger_reason,5
set = ho_exe_result,1

id = CuCpProcNrHoPrepOut
set = ho_target_freq,3
set = ho_trigger_reason,1
set = ho_prep_result,1
set = ho_interface_type,3
set = ho_target_node_type,2

id = CuCpProcNrHoPrepOut
set = ho_target_freq,1
set = ho_trigger_reason,5
set = ho_target_node_type,2
set = ho_prep_result,1

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,1
set = ho_target_freq,1
set = ho_trigger_reason,5
set = ho_prep_result,1


id = CuCpProcEndcRelease
set = endc_release_cause,4
set = endc_release_triggering_node,1
set = release_complete_param,JSON{"key":42,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,4
set = endc_release_triggering_node,2
set = release_complete_param,JSON{"key":42,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,1
set = release_complete_param,JSON{"key":42,"value":2}
set = endc_release_triggering_node,1

id = CuCpProcEndcRelease
set = endc_release_cause,1
set = release_complete_param,JSON{"key":42,"value":2}
set = endc_release_triggering_node,2

id = CuCpProcEndcSetup
set = sgnb_addition_trigger_indication,1
set = endc_setup_result,1
set = erab_to_be_added_list,JSON[{"erab_id":1,"qos_value":2}]

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_type,1
set = modification_result,1
set = erab_to_be_added_list,JSON[{"erab_id":1,"qos_value":2}]

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_type,1
set = modification_result,12


id = CuCpProcRrcReestabDrb
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "cause_group": 0, "cause":1}]

id = CuCpProcRrcReestabDrb
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "cause_group": 0, "cause":1}]

id = CuCpRwrMobilityDecision
set = rwr_trigger,2
set = rwr_decision,1

id = CuCpProcXnRetrieveUeCtxt
set = rrc_procedure_type,2
set = retrieve_ue_ctxt_result,1

id = CuCpProcX2SgnbChange
set = sgnb_change_result,1
set = ps_cell_change_target_freq,1
set = ho_target_node_type, 1

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set = sn_initiated_sgnb_modification_result,3
set = ho_target_node_type, 1

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set = sn_initiated_sgnb_modification_result,1
set = ps_cell_change_target_freq,1
set = ho_target_node_type, 1

#CUUP

id = CuUpPerUeRbCgTrafficRep
set = per_rb_cg_rpu_cmp_hdr_vol_trans_dl_rohc_profile_1,32
set = per_rb_cg_rpu_cmp_hdr_vol_trans_dl_rohc_profile_2,40
set = per_rb_cg_rpu_hdr_vol_rec_dl_rohc_profile_1,48
set = per_rb_cg_rpu_hdr_vol_rec_dl_rohc_profile_2,54
set = per_rb_cg_rpu_cmp_hdr_vol_rec_ul_rohc_profile_1,100
set = per_rb_cg_rpu_cmp_hdr_vol_rec_ul_rohc_profile_2,200
set = per_rb_cg_rpu_hdr_vol_trans_ul_rohc_profile_1,200
set = per_rb_cg_rpu_hdr_vol_trans_ul_rohc_profile_2,200
set = qos_value,1

#DU

id = DuPerUeRbTrafficRep
set = per_rb_mac_vol_dl_drb_last_slot,20
set = per_rb_mac_vol_dl_drb_single_burst,40

id = DuPerUeTrafficRep
set = per_ue_mac_vol_ul_res_ue_last_slot,200
set = per_ue_mac_vol_ul_res_ue_late,200

id = DuPerUeTrafficRep
set = per_ue_mac_vol_ul_unres_ue_pucch_sr_grant,100
set = per_ue_mac_vol_ul_unres_ue_preempt_grant,300
set = per_ue_mac_vol_ul_unres_ue_bsr_grant,400

#22.Q1.drop4
id = CuCpRohcSetup
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":2}]

id = CuCpRohcSetup
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":3}]

id = CuCpRohcSetup
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":4}]


#22Q2drop2

id= CuCpProcEndcRelease
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set= drb_released_in_session,JSON{"key":2,"value":2}
set= endc_release_cause, 4
set= endc_release_triggering_node, 1
set = release_complete_param,JSON{"key":42,"value":2}
set = cause_group_3gpp, 2
set = cause_3gpp,4



id= CuCpProcEndcRelease
set= endc_release_cause, 6
set= endc_release_triggering_node, 2
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set= release_complete_param,JSON{"key":42,"value":2}
set = cause_group_3gpp, 2
set = cause_3gpp,4

id= CuCpProcEndcRelease
set= endc_release_cause, 1
set= endc_release_triggering_node, 1
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set= release_complete_param,JSON{"key":42,"value":2}
set = cause_group_3gpp, 2
set = cause_3gpp,4

id= CuCpProcEndcRelease
set= endc_release_cause, 1
set= endc_release_triggering_node, 2
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set= release_complete_param,JSON{"key":42,"value":2}
set = cause_group_3gpp, 2
set = cause_3gpp,4

id= CuCpProcEndcSetup
set= endc_setup_result, 2
set= sgnb_addition_trigger_indication, 1

id= CuCpProcX2MnInitiatedSgnbModification
set= modification_result, 5
set= modification_type, 1

id= CuCpProcUeCtxtRel
set= subscriber_specific_freq_prio_at_release, 2

id = DuTestEventEnm


#22Q2drop4

id = CuCpProcNrHoIcExe
set = ho_exe_result,1

id = CuCpProcNrHoIcPrep
set = ho_prep_result,1


#ftem

id = CuCpDrbSuspend
set = pref_ue_group_id,0
set = ue_group_id,0
set = serving_plmn_id,"0x134001"
set = drb_suspend_list,JSON[{"drb_id" : 1, "mapped_5qi" : 1,"priority_level_arp" : 1, "s_nssai" : "0x01"}]


id = CuCpPerCellDrbSetup
set = num_of_drb_setup_list_sa,JSON[{"s_nssai" : "0x01","num_of_drb_setup_sa" : 2}]
set = num_of_drb_setup_mapped_5qi_list,JSON[{"mapped_5qi" : 1, "num_of_drb_setup_sa" :20}]

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"serving_plmn_id" : "0x134001","num_of_nr_rrc_connected_ue_endc" : 2,"num_of_nr_rrc_connected_ue_sa" : 3}]

id = CuCpProcEndcModification
set = pref_ue_group_id,1
set = ue_group_id,2
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcEndcRelease
set = pref_ue_group_id,1
set = ue_group_id,1
set = ue_power_class,0
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcRelease
set = pref_ue_group_id,5
set = ue_group_id,5
set = ue_power_class,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcRelease
set = pref_ue_group_id,10
set = ue_group_id,10
set = ue_power_class,2
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcRelease
set = pref_ue_group_id,20
set = ue_group_id,20
set = ue_power_class,3
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcRelease
set = pref_ue_group_id,40
set = ue_group_id,40
set = ue_power_class,4
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcRelease
set = pref_ue_group_id,45
set = ue_group_id,45
set = ue_power_class,5
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcEndcSetup
set = pref_ue_group_id,2
set = ue_group_id,2
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,9
set = ue_group_id,9
set = ue_power_class,0
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,5
set = ue_group_id,6
set = ue_power_class,1
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,3
set = ue_group_id,3
set = ue_power_class,2
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,40
set = ue_group_id,40
set = ue_power_class,3
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,50
set = ue_group_id,50
set = ue_power_class,4
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcInitialCtxtEstab
set = pref_ue_group_id,60
set = ue_group_id,60
set = ue_power_class,5
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result": 1,"pdu_session_id": 2,"s_nssai": "0x01","no_of_drbs_to_add": 2,"integrity_protection_indication":2, "maximum_integrity_protected_data_rate": 1}]
set = drb_setup_list,JSON[{"drb_result":1,"drb_id":2,"mapped_5qi":2,"pdu_session_id":1,"s_nssai": "0x01"}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcNgSigConnEstab
set = pref_ue_group_id,4
set = ue_group_id,4

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,5
set = ue_group_id,5
set = ue_power_class,0
set = nrdc_configured,0
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,0

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,10
set = ue_group_id,10
set = ue_power_class,1
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,1

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,5
set = ue_group_id,5
set = ue_power_class,2
set = nrdc_configured,2
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,2

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,50
set = ue_group_id,50
set = ue_power_class,3
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,3

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,20
set = ue_group_id,20
set = ue_power_class,4
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,0

id = CuCpProcNrHoExeOut
set = pref_ue_group_id,40
set = ue_group_id,40
set = ue_power_class,5
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,1

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,6
set = ue_group_id,6
set = ue_power_class,0
set = nrdc_configured,0
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,0

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,60
set = ue_group_id,60
set = ue_power_class,1
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,1

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,62
set = ue_group_id,62
set = ue_power_class,2
set = nrdc_configured,2
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,2

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,46
set = ue_group_id,46
set = ue_power_class,3
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,3

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,20
set = ue_group_id,20
set = ue_power_class,4
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,0

id = CuCpProcNrHoPrepOut
set = pref_ue_group_id,12
set = ue_group_id,12
set = ue_power_class,5
set = nrdc_configured,1
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = traffic_steering_type,1

id = CuCpProcPduSessionResourceModify
set = pref_ue_group_id,7
set = ue_group_id,7
set = pdu_session_modify_list,JSON[{"pdu_result":1,"pdu_session_id":2,"s_nssai": "0x01"}]
set = serving_plmn_id,"0x134001"
set  = drb_setup_list,JSON[{"drb_id" :32, "mapped_5qi" : 3, "drb_result" : 1, "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set  = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 4, "drb_rel_type" : 2, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 5, "drb_rel_type" : 3, "drb_rel_initiator" : 4, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set  = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 6, "drb_rel_type" : 3, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceRelease
set = pref_ue_group_id,8
set = ue_group_id,8
set = serving_plmn_id,"0x134001"
set = pdu_session_release_list,JSON[{"pdu_session_id":1, "s_nssai" : "0x01"}]
set = pdu_session_resource_release_result,1
set = drb_release_list,JSON[{"drb_id" :31, "mapped_5qi" : 7, "pdu_session_id" : 12, "s_nssai":"0x01", "drb_session_time" : 1}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceSetup
set = pref_ue_group_id,9
set = ue_group_id,9
set = serving_plmn_id,"0x134001"
set = pdu_session_setup_list,JSON[{"pdu_result":1,"pdu_session_id":2,"s_nssai":"0x01","no_of_drbs_to_add":3,"integrity_protection_indication":2,"maximum_integrity_protected_data_rate":2}]
set  = drb_setup_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_result" : 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuCpProcRrcReestab
set = pref_ue_group_id,18
set = ue_group_id,19
set = serving_plmn_id,"0x134001"

id = CuCpProcRrcReestabDrb
set  = drb_setup_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_result" : 1, "s_nssai" : "0x01", "pdu_session_id" : 20, "cause_group":1, "cause":1}]
set = pref_ue_group_id,18
set = ue_group_id,19
set = serving_plmn_id,"0x134001"

id = CuCpProcUeCtxtRel
set = pref_ue_group_id,10
set = ue_group_id,10
set = serving_plmn_id,"0x134001"
set = pdu_session_release_list,JSON[{"pdu_session_id":1,"s_nssai" : "0x01"}]
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 9, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_type,2
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = rrc_inactive_state,2

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = pdu_session_release_list,JSON[{"pdu_session_id":1,"s_nssai" : "0x01"}]
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 10, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = rrc_inactive_state,2

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,3
set = pdu_session_release_list,JSON[{"pdu_session_id":1,"s_nssai" : "0x01"}]
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 11, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = rrc_inactive_state,2


id = CuCpProcX2SgnbAdditionPreparation
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = pref_ue_group_id,9
set = ue_group_id,9

id = CuCpProcX2MnInitiatedSgnbModification
set = pref_ue_group_id,11
set = ue_group_id,11
set = serving_plmn_id,"0x134001"

id = CuCpProcX2SgnbChange
set = pref_ue_group_id,12
set = ue_group_id,12
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = ho_target_node_type, 1

id = CuCpProcX2SnInitiatedSgnbModification
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"
set = ho_target_node_type, 1

id = CuCpProcXnRetrieveUeCtxt
set = pref_ue_group_id,13
set = ue_group_id,13
set = serving_plmn_id,"0x134001"

id = CuCpRohcSetup
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":2}]

id = CuCpRohcSetup
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":3}]

id = CuCpRohcSetup
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = drb_list,JSON[{"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01", "rohc_required":2, "rohc_setup_result":4}]

id = CuCpRwrMobilityDecision
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12
set = serving_plmn_id,"0x134001"

id = CuCpProcNrHoIcExe
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,0

id = CuCpProcNrHoIcExe
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,1

id = CuCpProcNrHoIcExe
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,2

id = CuCpProcNrHoIcPrep
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,0

id = CuCpProcNrHoIcPrep
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,1

id = CuCpProcNrHoIcPrep
set = pref_ue_group_id,13
set = ue_group_id,13
set = nrdc_configured,2


#CUUP
id = CuUpPerUeRbCgTrafficRep
set = qos_value,1
set = nr_type,0
set = serving_plmn_id,"0x134001"
set = pref_ue_group_id,13
set = ue_group_id,13
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = CuUpPerUeRbS1NgTrafficRep
set = qos_value,2
set = nr_type,1
set = serving_plmn_id,"0x134001"

#du

id = DuPerCellQosTrafficRep
set = qos_value,1
set = nr_type,0

id = DuPerCellpartitionResourceRep
set = partition_id,1
set = service_id,0

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,0
set = ue_power_class,0
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,1
set = ue_power_class,1
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,2
set = ue_power_class,2
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,1
set = ue_power_class,3
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,1
set = ue_power_class,4
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeRbTrafficRep
set = qos_value,2
set = nr_type,1
set = ue_power_class,5
set = pref_ue_group_id,1
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,0
set = ue_power_class,0
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,1
set = ue_power_class,1
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,2
set = ue_power_class,2
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,2
set = ue_power_class,3
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,2
set = ue_power_class,4
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuPerUeTrafficRep
set = nr_type,2
set = ue_power_class,5
set = pref_ue_group_id,2
set = ue_group_id,21
set = s_nssai,"0x01"
set = serving_plmn_id,"0x134001"
set = ue_mobility_group_id,11
set = ue_service_group_id,12

id = DuProcRrcAccess
set = establishment_cause,0
set = resume_cause,0
set = reestablishment_cause,0

id = DuProcRrcAccess
set = establishment_cause,1
set = resume_cause,1
set = reestablishment_cause,1

id = DuProcRrcAccess
set = establishment_cause,2
set = resume_cause,2
set = reestablishment_cause,2

id = DuProcRrcAccess
set = establishment_cause,3
set = resume_cause,3
set = reestablishment_cause,3

id = DuProcRrcAccess
set = establishment_cause,4
set = resume_cause,4
set = reestablishment_cause,4

id = DuProcRrcAccess
set = establishment_cause,5
set = resume_cause,5
set = reestablishment_cause,0

id = DuProcRrcAccess
set = establishment_cause,6
set = resume_cause,6
set = reestablishment_cause,1

id = DuProcRrcAccess
set = establishment_cause,7
set = resume_cause,7
set = reestablishment_cause,2

id = DuProcRrcAccess
set = establishment_cause,8
set = resume_cause,8
set = reestablishment_cause,3

id = DuProcRrcAccess
set = establishment_cause,9
set = resume_cause,9
set = reestablishment_cause,4

id = DuProcRrcAccess
set = establishment_cause,10
set = resume_cause,10
set = reestablishment_cause,0

id = DuProcRrcAccess
set = establishment_cause,11
set = resume_cause,11
set = reestablishment_cause,1

id = DuProcRrcAccess
set = establishment_cause,0
set = resume_cause,12
set = reestablishment_cause,2

id = DuProcUeContextSetup
set = pref_ue_group_id,3
set = ue_group_id,21


#22Q3drop2

id = CuCpProcLocationReporting
set = loc_report_result, 1

id = CuCpNgLocationReport

id = CuCpProcEndcModification
set = endc_modification_result,1
set = no_of_scells_to_release, 2

id = CuCpProcEndcRelease
set = endc_release_cause,6
set = no_of_scells_to_release,3

id = CuCpProcX2SgnbChange
set = no_of_scells_to_release,3
set = sgnb_change_result,2


id = CuCpProcEndcRelease
set = endc_release_cause,4
set = endc_release_triggering_node,1
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,6
set = endc_release_triggering_node,2
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}

id = CuCpProcNrHoExeOut
set = ho_target_freq,3
set = ho_exe_drb_setup_result_list,JSON[{"ho_exe_drb_result" : 1,"drb_id" :31, "pdu_session_id" : 2, "s_nssai"  : "0x01", "mapped_5qi" : 1}]
set = ho_target_node_type,2

id = CuCpProcNrHoExeOut
set = ho_exe_drb_setup_result_list,JSON[{"ho_exe_drb_result" : 1,"drb_id" :31, "pdu_session_id" : 2, "s_nssai"  : "0x01", "mapped_5qi" : 1}]
set = ho_target_node_type,1

id = CuCpProcNrHoExeOut
set = ho_exe_drb_setup_result_list,JSON[{"ho_exe_drb_result" : 1,"drb_id" :31, "pdu_session_id" : 2, "s_nssai"  : "0x01", "mapped_5qi" : 1}]
set = ho_target_node_type,3


id = CuCpProcNrHoPrepOut
set = ho_target_node_type,3
set = ho_prep_drb_setup_result_list,JSON[{"hor_prep_drb_result" : 1,"drb_id" :2,"s_nssai":"0x010120" ,"mapped_5qi" : 6}]

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,2
set = ho_target_freq,3
set = ho_prep_drb_setup_result_list,JSON[{"hor_prep_drb_result" : 1,"drb_id" :2,"s_nssai":"0x010120" ,"mapped_5qi" : 6}]

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,1
set = ho_prep_drb_setup_result_list,JSON[{"hor_prep_drb_result" : 1,"drb_id" :2,"s_nssai":"0x010120" ,"mapped_5qi" : 6}]

id = CuCpProcNgSigConnEstab
set = ng_sig_conn_estab_result,1

id = CuCpPerCellPduSession
set = num_of_pdu_session_snssai_list,JSON[{"num_of_pdu_session" : 4,"s_nssai" :"0x01"}]


id = CuCpPerCellPduSession
set = num_of_pdu_session_snssai_list,JSON[{"num_of_pdu_session" : 4,"s_nssai" :"0x01"}]

id = CuCpProcRrcEstab
set = rrc_conn_estab_result,1

id = CuCpProcRrcReestab
set = fallback_indicator,1
set = rrc_conn_reestab_result,1

id = CuCpProcRrcReestab
set = fallback_indicator,2
set = rrc_conn_reestab_result,1

id = CuCpProcRrcResume
set = network_action,1

id = CuCpProcRrcResume
set = network_action,2
set = rrc_conn_resume_result,4


id = CuUpPerUeRbS1NgTrafficRepAggr10
set = link_type,2
set = per_drb_pdcp_packet_rec_dl,1
set = per_drb_pdcp_packet_rec_dl_disc, 1
set = per_drb_pdcp_packet_rec_dl_disc_aqm, 1
set = qos_value,1


id = CuUpPerUeRbS1NgTrafficRepAggr10
set = link_type, 1
set = per_drb_pdcp_packet_rec_dl_disc_aqm,1
set = per_drb_pdcp_packet_rec_dl_disc, 1
set = per_drb_pdcp_packet_rec_dl, 1
set = qos_value, 2

id = CuUpPerDrbSetup
set = num_of_drb_endc,10 
set = num_of_drb_sa,20


id = CuUpPerPduSession
set = num_of_pdu_session, 3


id = CuUpPerUeRbCgTrafficRepAggr10
set = qos_value, 2
set = per_rb_cg_rpu_packet_loss_ul, 2
set = per_rb_cg_rpu_packet_loss_ul_to_disc, 2
set = per_rb_cg_rpu_packet_loss_ul_to, 2
set = per_rb_cg_rpu_packet_rec_ul_ooo, 2
set = per_rb_cg_rpu_packet_rec_ul, 2 
set = per_rb_cg_rpu_packet_trans_dl_ack, 2
set = per_rb_cg_rpu_packet_trans_dl_disc_aqm, 2
set = per_rb_cg_rpu_packet_trans_dl_disc, 2
set = per_rb_cg_rpu_packet_trans_dl, 2
set = per_rb_cg_rpu_vol_rec_ul, 120
set = per_rb_cg_rpu_vol_trans_dl_aggr, 2
set = per_rb_cg_rpu_vol_trans_dl, 120
set = per_rb_cg_rpu_cmp_hdr_vol_trans_dl_rohc_profile_1,32  
set = per_rb_cg_rpu_cmp_hdr_vol_trans_dl_rohc_profile_2,40
set = per_rb_cg_rpu_hdr_vol_rec_dl_rohc_profile_1,48
set = per_rb_cg_rpu_hdr_vol_rec_dl_rohc_profile_2,54
set = per_rb_cg_rpu_cmp_hdr_vol_rec_ul_rohc_profile_1,100
set = per_rb_cg_rpu_cmp_hdr_vol_rec_ul_rohc_profile_2,200
set = per_rb_cg_rpu_hdr_vol_trans_ul_rohc_profile_1,200
set = per_rb_cg_rpu_hdr_vol_trans_ul_rohc_profile_2,200
set = per_rb_cg_rpu_packet_loss_ulper_rb_cg_rpu_packet_loss_ul,2



id = DuProcUeContextSetup
set = ue_context_setup_result, 1


id = DuPerUeRbTrafficRepAggr10
set = per_rb_mac_vol_dl_drb ,100
set = per_rb_mac_vol_dl_drb_single_burst, 1000
set = per_rb_mac_vol_dl_drb_last_slot,100
set = per_rb_mac_time_dl_drb,8
set = qos_value, 2
set = per_rb_rlc_delay_pkt_trans_dl, 100
set = per_rb_rlc_delay_time_dl, 200

id = DuPerUeRbTrafficRepAggr10
set = bearer_id,1
set = per_rb_mac_vol_dl_drb_single_burst,1000000
set = per_rb_mac_vol_dl_drb_last_slot,10000
set = per_rb_mac_vol_dl_drb,10000
set = per_rb_mac_time_dl_drb,100
set = per_rb_rlc_delay_pkt_trans_dl, 10
set = per_rb_rlc_delay_time_dl, 20
set = qos_value,4

id = DuPerUeTrafficRepAggr10
set = per_ue_dl_scell_act, 2
set = per_ue_dl_scell_deact, 3
set = per_ue_mac_harq_dl_ack_16_qam, 1
set = per_ue_mac_harq_dl_ack_256_qam, 4
set = per_ue_mac_harq_dl_ack_64_qam, 6
set = per_ue_mac_harq_dl_ack_qpsk, 7
set = per_ue_mac_harq_dl_dtx_16_qam, 1
set = per_ue_mac_harq_dl_dtx_256_qam, 4
set = per_ue_mac_harq_dl_dtx_64_qam, 6
set = per_ue_mac_harq_dl_dtx_qpsk, 8
set = per_ue_mac_harq_dl_nack_16_qam,1
set = per_ue_mac_harq_dl_nack_256_qam, 4
set = per_ue_mac_harq_dl_nack_64_qam, 7
set = per_ue_mac_harq_dl_nack_qpsk, 9
set = per_ue_mac_harq_ul_ack_16_qam,1
set = per_ue_mac_harq_ul_ack_64_qam, 4
set = per_ue_mac_harq_ul_ack_qpsk, 3
set = per_ue_mac_harq_ul_dtx_16_qam, 2
set = per_ue_mac_harq_ul_dtx_64_qam, 5
set = per_ue_mac_harq_ul_dtx_qpsk, 1
set = per_ue_mac_harq_ul_nack_16_qam, 9
set = per_ue_mac_harq_ul_nack_64_qam, 7
set = per_ue_mac_harq_ul_nack_qpsk, 8 
set = per_ue_mac_vol_ul_unres_ue_pucch_sr_grant, 10
set = per_ue_mac_vol_ul_unres_ue_preempt_grant, 12
set = per_ue_mac_vol_ul_unres_ue_bsr_grant, 14
set = per_ue_mac_vol_ul_res_ue, 16
set = per_ue_mac_vol_ul_res_ue_last_slot, 18
set = per_ue_mac_vol_ul_res_ue_late, 20 
set = per_ue_mac_time_ul_res_ue, 21

id = DuPerUeTrafficRepAggr10
set = per_ue_mac_vol_ul_unres_ue_pucch_sr_grant,30000000
set = per_ue_mac_vol_ul_unres_ue_preempt_grant,30000000
set = per_ue_mac_vol_ul_unres_ue_bsr_grant,30000000
set = per_ue_mac_vol_ul_res_ue,10000
set = per_ue_mac_vol_ul_res_ue_last_slot,10000
set = per_ue_mac_vol_ul_res_ue_late,100
set = per_ue_mac_time_ul_res_ue,100


#22Q3drop4


#CUCP
id = CuCpProcPduSessionResourceModify
set = rrc_inactive_state,1
set = drb_release_list,JSON[{"drb_rel_initiator" : 4,"drb_rel_type" : 3,"drb_released_in_session": 2,"mapped_5qi": 5}]

id = CuCpProcPduSessionResourceModify
set = rrc_inactive_state,1
set = drb_release_list,JSON[{"drb_rel_initiator" : 2,"drb_rel_type" : 3,"drb_released_in_session": 2,"mapped_5qi": 4}]

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,1
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,1
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcEndcRelease
set = endc_release_cause,4
set = endc_release_triggering_node,1
set = drb_release_list,JSON[{"drb_id": 1, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 1}]
set = drb_released_in_session,JSON{"key":5,"value":2}
set = release_complete_param,JSON{"key":47,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,4
set = endc_release_triggering_node,2
set = drb_release_list,JSON[{"drb_id": 1, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 1}]
set = drb_released_in_session,JSON{"key":9,"value":2}
set = release_complete_param,JSON{"key":46,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,2
set = endc_release_triggering_node,1
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]
set = drb_released_in_session,JSON{"key":2,"value":2}
set = release_complete_param,JSON{"key":8,"value":2}

id = CuCpProcEndcRelease
set = endc_release_cause,2
set = endc_release_triggering_node,2
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set = release_complete_param,JSON{"key":42,"value":2}


id = CuCpPerCuCpRrcInactiveUe
set = total_num_of_rrc_inactive_ue_sa,10
set = num_of_rrc_inactive_ue_list,JSON[{"num_of_nr_rrc_inactive_ue_sa": 11}]


id = CuCpProcInitialCtxtEstab
set = drb_setup_list,JSON[{"drb_result" : 1,"drb_id" :26, "mapped_5qi" : 8, "pdu_session_id" : 19, "s_nssai":"0x01"}]

id = CuCpProcRrcResume
set = drb_resume_list,JSON[{"drb_result":1,"mapped_5qi":2}]

id = CuCpProcEndcModification
set = endc_modification_type,2

id = CuCpMnNrdcSetupBufMonConfig
set = buf_mon_config_type,1

id = CuCpMnNrdcSetupBufMonReport

id = CuCpPerCellRrcInactiveUe
set = total_num_of_rrc_inactive_ue_sa,12
set = num_of_rrc_inactive_ue_list,JSON[{"num_of_nr_rrc_inactive_ue_sa": 15}]

id = CuCpProcRrcResume
set = network_action,1
set = rrc_conn_resume_result,4

id = CuCpProcRrcResume
set = network_action,1
set = rrc_conn_resume_result,1
#CUUP

id = CuUpDrbRelease
set = num_of_ip_flows_dl_rohc_profile_1, 13
set = num_of_ip_flows_dl_rohc_profile_2, 12

id = CuUpPerUeRbCgTrafficRepAggr10
set = per_rb_cg_rpu_packet_lost_ul_rohc_fail_profile_1, 11
set = per_rb_cg_rpu_packet_lost_ul_rohc_fail_profile_2, 10
set = per_rb_cg_rpu_packet_rec_ul_rohc_profile_0, 9 
set = per_rb_cg_rpu_packet_rec_ul_rohc_profile_1, 8
set = per_rb_cg_rpu_packet_rec_ul_rohc_profile_2, 7
set = per_rb_cg_rpu_packet_disc_overl_dl_rohc, 6
set = per_rb_cg_rpu_packet_trans_dl_rohc_profile_0, 5
set = per_rb_cg_rpu_packet_trans_dl_rohc_profile_1, 4
set = per_rb_cg_rpu_packet_trans_dl_rohc_profile_2, 3
set = per_rb_cg_rpu_packet_uncmp_hdr_overl_trans_dl_rohc_profile_1, 2
set = per_rb_cg_rpu_packet_uncmp_hdr_overl_trans_dl_rohc_profile_2, 1
set = qos_value,12

#DU

id = DuProcUeContextModification
set = ue_context_modification_result, 1
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 4}]

id = DuProcUeContextModification
set = ue_context_modification_result, 1
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 3}]


id= DuProcUeContextSetup
set = ue_context_setup_result, 1
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 4}]

id= DuProcUeContextSetup
set = ue_context_setup_result, 1
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 3}]


#22Q4 drop2

id = CuCpProcEndcSetup
set = sgnb_addition_trigger_indication,1
set = endc_setup_result,1
set = erab_to_be_added_list,JSON[{"erab_id":1, "qos_value":2, "priority_level_arp": 2, "setup_complete_ind": 2}]

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_type,1
set = modification_result,1
set = erab_to_be_added_list,JSON[{"erab_id":1,"qos_value":2, "priority_level_arp": 2, "setup_complete_ind": 2}]

id = CuCpProcInitialCtxtEstab
set = initial_ctxt_estab_result,2
set = no_of_scells_to_add,2

id = CuCpProcNrHoExeIn
set = ho_exe_result,2
set = ho_interface_type,1
set = no_of_scells_to_add,2

id = CuCpProcNrHoExeIn
set = ho_exe_result,2
set = ho_interface_type,3
set = no_of_scells_to_add,2

id = CuCpProcPduSessionResourceSetup
set = pdu_session_resource_setup_result,2
set = no_of_scells_to_add,2

id = CuCpProcRrcReestabDrb
set = rrc_conn_reestab_result,2
set = no_of_scells_to_add,2

id = CuCpProcRrcResume
set = rrc_conn_resume_result,2
set = no_of_scells_to_add,2

id = CuCpProcNrScellUpdate
set = scell_update_result,2
set = no_of_scells_to_add,2

id = CuCpProcInitialCtxtEstab
set = drb_setup_list,JSON[{"drb_result" : 2,"drb_id" :24, "mapped_5qi" : 8, "pdu_session_id" : 19, "s_nssai":"0x01"}]

id = CuCpProcPduSessionResourceModify
set = drb_setup_list,JSON[{"drb_id" :32, "drb_result" : 2, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01"}]

id = CuCpProcPduSessionResourceSetup
set = drb_setup_list,JSON[{"drb_result" : 2,"drb_id" :25, "mapped_5qi" : 5, "pdu_session_id" : 14, "s_nssai":"0x01"}]

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 4, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,1

id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,1

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 4, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,4
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,1


id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,1

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 3, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2


id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,3
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceModify
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "drb_rel_type" : 2, "drb_rel_initiator" : 2, "drb_released_in_session": 2,  "drb_session_time": 1, "s_nssai" : "0x01", "pdu_session_id" : 20}]
set = rrc_inactive_state,2

id = CuCpProcPduSessionResourceRelease
set = pdu_session_resource_release_result,1
set = rrc_inactive_state,2

id = CuCpProcUeCtxtRel
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_type,2
set = rrc_inactive_state,2

id = CuCpProcEndcModification
set = endc_modification_result,2
set = no_of_scells_to_add,2

id = CuCpProcEndcPscellChangeIntraSgnbIn
set = result,2
set = rrc_inactive_state,2

id = CuCpProcEndcSetup
set = endc_setup_result,2
set = rrc_inactive_state,2

id = CuCpProcX2SgnbChange
set = sgnb_change_result,2
set = ps_cell_change_target_freq,1

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,5
set = sn_initiated_sgnb_modification_result,2
set = ps_cell_change_target_freq,1


id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set = ho_target_freq,3
set = ho_interface_type,1
set = ho_exe_result,2


id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set= ho_target_freq,1
set = ho_interface_type,3
set = ho_exe_result,2

id = CuCpProcNrHoExeOut
set = ho_target_node_type,2
set = ho_target_freq,1
set = ho_interface_type,1
set = ho_exe_result,2

id = CuCpProcNrHoExeOut
set = ho_target_node_type,1
set= ho_target_freq,1
set = ho_exe_result,2


id = CuCpProcNrHoPrepOut
set = ho_target_node_type,2
set = ho_target_freq,3
set = ho_interface_type,1
set = ho_prep_result,2


id = CuCpProcNrHoPrepOut
set = ho_target_node_type,2
set = ho_target_freq,3
set = ho_interface_type,3
set = ho_prep_result,2

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,2
set = ho_target_freq,1
set = ho_interface_type,1
set = ho_prep_result,2

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,2
set = ho_target_freq,1
set = ho_interface_type,3
set = ho_prep_result,2

id = CuCpProcNrHoPrepOut
set = ho_target_node_type,1
set = ho_target_freq,1
set = ho_prep_result,2


id = CuCpProcInitialCtxtEstab
set = pdu_session_setup_list,JSON[{"pdu_result": 2, "pdu_session_id" : 19, "s_nssai" : "0x01"}]

id = CuCpProcPduSessionResourceSetup
set = pdu_session_setup_list,JSON[{"pdu_result": 2, "pdu_session_id" : 10, "s_nssai": "0x01"}]

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_connected_ue_list,JSON[{"num_of_nr_rrc_connected_ue_endc":10,"num_of_nr_rrc_connected_ue_sa":20}]
set = num_of_nr_rrc_connected_sa,1
id = CuCpPerCellRrcConnectedUe
set = num_of_nr_rrc_connected_endc,11
set = num_of_nr_rrc_connected_sa,12

id = CuCpProcInitialCtxtEstab
set = initial_ctxt_estab_result,2

#Du

id = DuPerCellUlConfGrant
set = ul_conf_grant_ue_count,1

id = DuPerUeTrafficRepAggr10
set = per_ue_mac_harq_ul_ack_256_qam,1
set = per_ue_mac_harq_ul_dtx_256_qam,1
set = per_ue_mac_harq_ul_nack_256_qam,1


#22q4drop5

#CuCp

id = CuCpProcEndcModification
set = endc_modification_type,2
set = cause_group_3gpp, 2
set = cause_3gpp,4

#Du

id = DuPerUeTrafficRepAggr10
set = per_ue_mac_pdu_vol_dl_pcell,1
set = per_ue_mac_pdu_vol_dl_scell,1


#23Q1D2

id = CuCpProcEndcModification
set = endc_modification_result,4
set = no_of_scells_to_add,2
set = endc_modification_type,2

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_type,1
set = modification_result,10
set = erab_to_be_added_list,JSON[{"erab_id":1,"qos_value":2, "priority_level_arp": 2, "setup_complete_ind": 2}]


#23Q1drop4

id = CuCpProcNrScellUpdate
set = scell_update_trigger,6
set = scell_update_result,1

id = CuCpProcMnNrdcRelease
set = overheating,2

id = CuCpPerTsPeriodEnd
set = action,2

id = CuCpRrcUeAssistanceInformation
set = overheating_type,1

id = CuCpRrcUeAssistanceInformation
set = overheating_type,2

id = CuCpProcInitialCtxtEstab
set = initial_ctxt_estab_result,5

#23Q2drop2

id = CuCpProcEndcMnHoKeepSn
set = keep_sn_result, 8
set = select_ps_cell_result, 1

id = CuCpProcEndcSetup
set = endc_setup_result, 15
set = sgnb_addition_trigger_indication, 1

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 5
set = sn_initiated_sgnb_modification_result, 4

id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_trigger, 2
set = sgnb_addition_preparation_result, 3

id = CuCpProcX2MnInitiatedSgnbModification
set = modification_result, 14
set = modification_type, 1

id = CuCpProcNrHoPrepIn
set = ho_interface_type, 3
set = ho_prep_result, 1

id = CuCpProcNrHoPrepIn
set = ho_interface_type, 3
set = ho_prep_result, 5 

id = CuCpProcNrHoIcPrep
set = ho_prep_result, 7

id = CuCpProcNrHoPrepOut
set = ho_prep_result, 9 
set = ho_target_node_type, 1

id = CuCpProcSnNrdcSetup
set = sn_nrdc_setup_result, 4
set = sn_addition_trigger_indication, 2

id = CuCpProcSnNrdcSetup
set = sn_nrdc_setup_result, 4
set = sn_addition_trigger_indication, 1

id = CuCpPerCellRrcConnectedUe
set = num_of_rrc_conn_ue_adm_prio_list,JSON[{"num_of_rrc_conn_ue_en_dc":3,"num_of_rrc_conn_ue_nr_dc":4,"num_of_rrc_conn_ue_sa":2,"ue_admission_priority":1}]

id = CuCpProcRrcReestab
set = fallback_indicator,1 
set = rrc_conn_reestab_result, 5

id = CuCpProcRrcResume
set = network_action, 1
set = rrc_conn_resume_result, 14

id = CuCpProcUeCtxtRel
set = ue_ctxt_rel_type,3
set = ue_ctxt_rel_initiator,2
set = ue_ctxt_rel_preempt_cause, 8
set = rrc_inactive_state, 1
set = drb_release_list,JSON[{"drb_id" :32, "mapped_5qi" : 8, "pdu_session_id" : 20, "s_nssai":"0x01", "drb_released_in_session":2, "drb_session_time":1}]

id = CuCpProcEndcRelease
set = endc_release_cause, 4
set = endc_release_triggering_node, 1
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]
set = scg_failure_type, 3

id = CuCpProcEndcRelease
set = endc_release_cause, 2
set = endc_release_triggering_node, 1
set = scg_failure_type, 3
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]

id = CuCpProcEndcRelease
set = endc_release_cause, 12
set = endc_release_triggering_node, 2
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]

id = CuCpProcEndcRelease
set = endc_release_cause, 4
set = endc_release_triggering_node, 2
set = drb_release_list,JSON[{"drb_id": 2, "release_complete": 2,"drb_released_in_session": 2, "priority_level_arp": 2}]
set = cause_group_3gpp, 2
set = cause_3gpp, 2


# 23Q2drop4

id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type, 3
set = sn_initiated_sgnb_modification_result, 4 

id = CuCpProcEndcRelease
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set = drb_released_in_session,JSON{"key":4,"value":2}
set = endc_release_cause,6
set = endc_release_triggering_node,2


id= CuCpProcEndcRelease
set = drb_release_list,JSON[{"drb_id" :31, "release_complete" : 2, "drb_released_in_session" : 2, "priority_level_arp" : 1}]
set= drb_released_in_session,JSON{"key":2,"value":2}
set= endc_release_cause, 4
set= endc_release_triggering_node, 2
set = cause_group_3gpp, 2
set = cause_3gpp,4


id = CuCpProcSnNrdcRelease
set = sn_nrdc_release_type, 0
set = sn_nrdc_release_initiating_node , 2
set = active_data_transmission , 2
set = sn_nrdc_release_preempt_cause , 1

id = CuCpProcSnNrdcRelease
set = sn_nrdc_release_type, 0
set = sn_nrdc_release_initiating_node, 0
set = sn_nrdc_release_preempt_cause, 1


id = DuPerUeRbTrafficRepAggr10
set = per_rb_mac_rbsym_used_pdsch , 5 

id = DuPerUeTrafficRepAggr10
set = per_ue_mac_rbsym_used_pusch, 3

#23Q3D2

id = CuCpProcPduSessionResourceModify
set = drb_modify_list,JSON[{"drb_id" :32, "drb_modify_result" : 1, "old_mapped_5qi" : 2, "mapped_5qi" : 2, "pdu_session_id": 2,  "old_priority_level_arp": 1, "priority_level_arp" : 5, "s_nssai" : "0x01", "CauseGroup" : 1, "cause_3gpp" : 2}]

id = CuCpProcPduSessionResourceModify
set = drb_modify_list,JSON[{"drb_id" :32, "drb_modify_result" : 2, "old_mapped_5qi" : 2, "mapped_5qi" : 2, "pdu_session_id": 2,  "old_priority_level_arp": 1, "priority_level_arp" : 5, "s_nssai" : "0x01", "CauseGroup" : 1, "cause_3gpp" : 2}]

id = CuCpEcidMeasurementInitiationRequest
set = report_characteristics,1

id = CuCpEcidMeasurementInitiationResponse
set = ecid_measurement_result_sent,2

id = CuCpProcNrHoPrepIn
set = ho_system_type,2
set = ho_prep_result,6

id = CuCpProcNrHoPrepIn
set = ho_interface_type,1
set = ho_system_type,1
set = ho_prep_result,6

id = CuCpProcNrHoPrepIn
set = ho_interface_type,2
set = ho_prep_result,6

id = CuCpRwrMobilityDecision
set = rwr_decision,1
set = target_system,1

id = CuCpRwrMobilityDecision
set = rwr_decision,1
set = target_system,2

#Du

id = DuProcUeContextModification
set = drb_failed_to_setup_list,JSON[{"drb_id" :26, "prioritized_rate_reject" : 2}]
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 4, "scheduling_algorithm_dl" : 2, "scheduling_algorithm_ul" :2, "rate_control_status_dl" : 3, "rate_control_status_ul" : 3}]
set = drb_failed_to_modify_list,JSON[{"drb_id" :26, "prioritized_rate_reject" : 2}]
set = ue_context_modification_result, 1
set = num_of_drb_mod_succ_schd_rate, 10
set = num_of_drb_mod_succ_schd_rate_basic,10


id = DuProcUeContextSetup
set = drb_failed_to_setup_list,JSON[{"drb_id" :26, "prioritized_rate_reject" : 2}]
set = drb_setup_list,JSON[{"drb_id" :26, "qos_value" : 8, "s_nssai":"0x01", "pusch_rep_type_a": 4, "scheduling_algorithm_dl" : 2, "scheduling_algorithm_ul" :2, "rate_control_status_dl" : 3, "rate_control_status_ul" : 3}]
set = ue_context_setup_result,1

