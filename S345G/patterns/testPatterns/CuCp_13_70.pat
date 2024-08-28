# version information
version=DU,13,37,0,30,0
version=CUUP,13,5,0,11,0
version=CUCP,13,70,0,37,0

#
# 8 unique events - 16  events generated
# 28 unique ETCM counters
# 31 counters triggered
# 20 attributes
#

# event Id CuCpProcEndcSetup trigger 2 counters
 # pmEbsEndcSetupScgUeFailOther
 # pmEbsEndcSetupUeFailOther
id = CuCpProcEndcSetup
set = endc_setup_result,13

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

# pmEbsHoExeAttOutInterGnbIntraF
# pmEbsHoExeSuccOutInterGnbIntraF
id = CuCpProcNrHoExeOut
set = ho_target_freq,1
set = ho_target_node_type,2
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

# event Id CuCpProcX2SnInitiatedSgnbModification trigger 2 counters
# OR conditions exist!
 # pmEbsEndcPSCellChangeAttIntraSgnb
 # pmEbsEndcPSCellChangeSuccIntraSgnb
# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set = sn_initiated_sgnb_modification_result,1
# OR conditions exist!
# pmEbsEndcPSCellChangeAttIntraSgnb
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,5
set = sn_initiated_sgnb_modification_result,1

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
