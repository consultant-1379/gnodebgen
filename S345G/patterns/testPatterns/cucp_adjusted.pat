
# 
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0

# 10 cuup events for balance
# + 7 repeated cucp events 
# to total 20 cucp + 10 cuup events 
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1
id = CuUpTestEventEnm
set = data, 1

#
# 7 repeated cucp events
# 
id=CuCpProcNrHoExeOut
set=ho_type,2
set=ho_exe_result,1


# <managed_function>CUCP</managed_function>

# <name format="pmEbsHoExeSuccOutInterGnbIntraF"/>
#        <documentation>
#            Description: Number of successful outgoing NR intra-frequency inter-gNodeB NG handover executions in source NR cell.
#            Trigger: Stepped at receiving NGAP: UE CONTEXT RELEASE COMMAND indicating successful handover.
#        </documentation>

id=CuCpProcNrHoExeOut
set=ho_type,2
set=ho_exe_result,1

id = CuCpProcNrHoExeOut
set=ho_type,1
set=ho_exe_result,1

id = CuCpProcX2SgnbChange
set = sgnb_change_result, 1

id=CuCpProcX2SgnbChange

id = CuCpProcNrHoPrepOut
set = ho_type,1
set = ho_prep_result,1

id = CuCpProcX2MnInitiatedSgnbModification
set=modification_result,12
set=modification_type, 1
                    
id = CuCpProcNrHoExeOut
set =ho_type,1

#        <name format="pmEbsHoExeSuccOutIntraGnbIntraF"/>
#        <documentation>
#            Description: Number of successful NR intra-frequency intra-gNodeB handover executions in source NR cell.
#            Trigger: Stepped at receiving RRC: RRCReconfigurationComplete message.
#        </documentation>
id = CuCpProcNrHoExeOut
set=ho_type,1
set=ho_exe_result,1

#     <name format="pmEbsEndcPSCellChangeSuccInterSgnb"/>
#        <documentation>
#            Description: Number of successful inter-sgNodeB Primary Secondary Cell (PSCell) changes for EN-DC in source NR cell. See 3GPP TS 37.340 for definition of PSCell.
#            Trigger: Stepped at reception of X2AP: SGNB CHANGE CONFIRM message from master eNodeB (meNodeB), not conditional on RRC Reconfiguration Complete from UE.
#        </documentation>
id = CuCpProcX2SgnbChange
set = sgnb_change_result, 1
                
#        <name format="pmEbsEndcSetupUeFailOther"/>
#        <documentation>
#            Description: Number of SGNB ADDITION attempts for EN-DC that fail with result OTHER. A probable cause for this is mismatch between UE capability and cell configuration.
#            Trigger: Stepped when X2AP: SGNB ADDITION procedure ends with one of the following and result is OTHER: - X2AP: SGNB ADDITION REQUEST REJECT. - X2AP: SGNB RELEASE REQUEST.
#        </documentation>
id = CuCpProcEndcSetup
set=endc_setup_result, 13

#         <name format="pmEbsEndcPSCellChangeAttInterSgnb"/>
#         <documentation>
#            Description: Number of inter-sgNodeB Primary Secondary Cell (PSCell) change attempts for EN-DC in source NR cell. See 3GPP TS 37.340 for definition of #PSCell.
#            Trigger: Stepped when source NR cell sends X2AP: SGNB CHANGE REQUIRED message to master eNodeB (meNodeB).
#        </documentation>
id=CuCpProcX2SgnbChange

#        <name format="pmEbsEndcPSCellChangeAttIntraSgnb"/>
#        <documentation>
#            Description: Number of intra-sgNodeB Primary Secondary Cell (PSCell) change attempts for EN-DC in source NR cell. See 3GPP TS 37.340 for definition of #PSCell.
#            Trigger: Stepped at transmission of X2AP: SGNB MODIFICATION REQUIRED message with SCG Mobility cause.
#        </documentation>
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3

#        <name format="pmEbsHoPrepSuccOutIntraGnbIntraF"/>
#        <documentation>
#            Description: Number of successful NR intra-frequency intra-gNodeB handover preparations in source NR cell.
#            Trigger: Stepped at transmission of RRC: RRCReconfiguration message.
#        </documentation>
id = CuCpProcNrHoPrepOut
set = ho_type,1
set = ho_prep_result,1

#        <name format="pmEbsEndcSetupScgUeFailOther"/>
#        <documentation>
#            Description: Number of SGNB ADDITION attempts for EN-DC that fail with result OTHER. A probable cause for this is mismatch between UE capability and cell configuration.
#            Trigger: Stepped for each of the following two scenarios:
#  X2AP: SGNB ADDITION procedure ends with one of the following and result is OTHER:
#    - X2AP: SGNB ADDITION REQUEST REJECT.
#    - X2AP: SGNB RELEASE REQUEST.
#  X2AP: SGNB MODIFICATION procedure for the purpose of SCG ADDITION ends with one of the following and result is OTHER:
#    - X2AP: SGNB MODFICATION REJECT.
#    - X2AP: SGNB RELEASE REQUEST.
#        </documentation>
id = CuCpProcEndcSetup
set = endc_setup_result, 13

#        <name format="pmEbsEndcSetupScgUeFailOther"/>
#        <documentation>
#            Description: Number of SGNB ADDITION attempts for EN-DC that fail with result OTHER. A probable cause for this is mismatch between UE capability and cell #configuration.
#            Trigger: Stepped for each of the following two scenarios:
#  X2AP: SGNB ADDITION procedure ends with one of the following and result is OTHER:
#    - X2AP: SGNB ADDITION REQUEST REJECT.
#    - X2AP: SGNB RELEASE REQUEST.
#  X2AP: SGNB MODIFICATION procedure for the purpose of SCG ADDITION ends with one of the following and result is OTHER:
#    - X2AP: SGNB MODFICATION REJECT.
#    - X2AP: SGNB RELEASE REQUEST.
#        </documentation>
id = CuCpProcX2MnInitiatedSgnbModification
set=modification_result,12
set=modification_type, 1
                    
#        <name format="pmEbsHoPrepSuccOutInterGnbIntraF"/>
#        <documentation>
#            Description: Number of successful outgoing NR intra-frequency inter-gNodeB NG handover preparations in source NR cell.
#            Trigger: Stepped at reception of NGAP: HANDOVER COMMAND message.
#        </documentation>
id = CuCpProcNrHoPrepOut
set = ho_type, 2
set = ho_prep_result, 1

#       <name format="pmEbsHoPrepAttOutInterGnbIntraF"/>
#        <documentation>
#            Description: Number of outgoing NR intra-frequency Inter-gNodeB NG handover preparation attempts in source NR cell.
#            Trigger: Stepped at receiving RRC: MeasurementReport from UE indicating an intra-frequency inter-gNodeB handover.
#        </documentation>
id = CuCpProcNrHoPrepOut
set = ho_type,2

#        <name format="pmEbsHoPrepAttOutIntraGnbIntraF"/>
#        <documentation>
#            Description: Number of NR intra-frequency intra-gNB handover preparation attempts in source NR cell.
#            Trigger: Stepped at receiving of RRC: MeasurementReport from UE indicating an intra-frequency intra-gNodeB handover.
#        </documentation>
id = CuCpProcNrHoPrepOut
set = ho_type, 1

#        <name format="pmEbsEndcPSCellChangeResAllocReqInterSgnb"/>
#        <documentation>
#            Description: Number of inter-sgNodeB Primary Secondary Cell (PSCell) change resource allocation requests for EN-DC in target NR cell. See 3GPP TS 37.340 for definition of PSCell.
#            Trigger: Stepped when target NR cell receives X2AP: SGNB ADDITION REQUEST message with trigger indication SN change.
#        </documentation>
id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_trigger,2

#        <name format="pmEbsHoExeAttOutIntraGnbIntraF"/>
#        <documentation>
#            Description: Number of NR intra-frequency intra-gNodeB handover execution attempts in source NR cell.
#            Trigger: Stepped at transmission of RRC: RRCReconfiguration message.
#        </documentation>
id = CuCpProcNrHoExeOut
set =ho_type,1

#        <name format="pmEbsHoExeAttOutInterGnbIntraF"/>
#        <documentation>
#            Description: Number of outgoing NR intra-frequency inter-gNodeB NG handover execution attempts in source NR cell.
#            Trigger: Stepped at transmission of RRC: RRCReconfiguration message.
#        </documentation>
id = CuCpProcNrHoExeOut
set = ho_type,2

#        <name format="pmEbsEndcPSCellChangeResAllocSuccInterSgnb"/>
#        <documentation>
#            Description: Number of successful inter-sgNodeB Primary Secondary Cell (PSCell) change resource allocations for EN-DC in target NR cell. See 3GPP TS 37.340 for definition of PSCell.
#            Trigger: Stepped when target NR cell sends X2AP: SGNB ADDITION REQUEST ACKNOWLEDGE message for request with trigger indication SN change.
#        </documentation>
id = CuCpProcX2SgnbAdditionPreparation
set = sgnb_addition_preparation_result, 1
set = sgnb_addition_preparation_trigger, 2

#        <name format="pmEbsEndcPSCellChangeSuccIntraSgnb"/>
#        <documentation>
#            Description: Number of successful intra-sgNodeB Primary Secondary Cell (PSCell) changes for EN-DC in source NR cell. See 3GPP TS 37.340 for definition of #PSCell.
#            Trigger: Stepped at reception of X2AP: SGNB MODIFICATION CONFIRM message from master eNodeB (meNodeB) indicating RRC Reconfiguration Complete from UE.
#        </documentation>
id = CuCpProcX2SnInitiatedSgnbModification
set = sn_initiated_sgnb_modification_type,3
set =sn_initiated_sgnb_modification_result,1

