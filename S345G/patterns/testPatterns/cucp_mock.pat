# version information
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,60,0,28,0


#--------------- CUCP 1 LOOP START -----------------
id = CuCpProcPduSessionResourceRelease
set = pdu_session_resource_release_result,1
set = pdu_session_release_list,JSON[{"pdu_session_id":1,"s_nssai":"0x01000001"},{"pdu_session_id":2,"s_nssai":"0x01000002"},{"pdu_session_id":3,"s_nssai":"0x01000003"}]

#id = CuCpProcUeCtxtRel
#set = ue_ctxt_rel_type,2
#set = pdu_session_release_list,JSON[{"pdu_session_id":1,"s_nssai":"0x01000001"},{"pdu_session_id":2,"s_nssai":"0x01000002"},{"pdu_session_id":3,"s_nssai":"0x01000003"}]

#id = CuCpProcX2SnInitiatedSgnbModification
#set = sn_initiated_sgnb_modification_type, 3
#set = sn_initiated_sgnb_modification_result, 1

#id = CuCpProcX2MnInitiatedSgnbModification
#set = modification_result, 12
#set = modification_type, 1

#id = CuCpProcEndcSetup
#set = endc_setup_result, 13

#id = CuCpProcNrHoPrepOut
#set = ho_type, 1
#set = ho_prep_result, 1

#id = CuCpProcNrHoPrepOut
#set = ho_type, 2
#set = ho_prep_result, 1

#id = CuCpProcNrHoExeOut
#set = ho_type,2
#set = ho_exe_result, 1

#id = CuCpProcNrHoExeOut
#set = ho_type, 1
#set = ho_exe_result, 1

#id = CuCpProcX2SgnbChange
#set = sgnb_change_result, 1

#id = CuCpProcX2SgnbAdditionPreparation
#set = sgnb_addition_preparation_result, 1
#set = sgnb_addition_preparation_trigger, 2
#--------------- CUCP 1 LOOP END -----------------
