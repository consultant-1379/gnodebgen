version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0

# 13 Du events situations triggering etcm rules
# 7 repeated du events to bring the number to 20
# 10 cuup events to bring the total to 30 

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

id = DuPerUeTrafficRep
set= per_ue_rlc_arq_dl_ack,1
id = DuPerCellTrafficRep
set= per_cell_mac_vol_dl, 1
id = DuPerUeRbTrafficRep
set= per_rb_mac_time_dl_drb,1
id = DuPerCellTrafficRep
set= per_cell_mac_vol_ul,1
id = DuPerNRCellDUDowntime
set= downtime_type,2
id = DuPerUeRbTrafficRep
set= per_rb_mac_time_dl_drb,1
id = DuPerUeRbTrafficRep
set= per_rb_mac_time_dl_drb,1

#    <managed_function>DU</managed_function>

#        <name format="pmEbsDuExampleCounter"/>
#        <documentation>
#            Description: This test counter is stepped by 1 when DuPerUeTrafficRep is received
#            Trigger: This test counter is only stepped when per_ue_rlc_arq_dl_ack == 1
#        </documentation>
id = DuPerUeTrafficRep
set =per_ue_rlc_arq_dl_ack,1

#        <name format="pmEbsPdschSchedActivity"/>
#        <documentation>
#            Description: Total duration of slots where there is DL PDSCH scheduling activity. Unit: 125 us
#            Trigger: Stepped for each slot where there is at least one SRB or DRB PDSCH scheduling activity. Other scheduling activities (Msg2 or Msg4, paging, SI, and so on) have to be excluded.
#        </documentation>
id = DuPerCellTrafficRep
set=per_cell_pdsch_sched_activity,2
id = DuPerCellTrafficRep
set=per_cell_pusch_avail_time,1


#        <name format="pmEbsMacVolDl"/>
#        <documentation>
#            Description: Aggregated volume of successfully transmitted downlink MAC PDUs for DRB or SRB using cell as PCell or SCell. Unit: Bytes
#            Trigger: All successfully transmitted DL MAC PDUs for DRB or SRB from cell are included. Possible padding bits in DL MAC PDUs are counted. Cell can be PCell or SCell. Msg4 excluded. Bandwidth-reduced UE instances are excluded.
#        </documentation>
id = DuPerCellTrafficRep
set = per_cell_mac_vol_dl, 1

#        <name format="pmEbsDuExampleCompressedPdfCounter"/>
#        <documentation>
#            Description: This test counter is stepped when DuPerCellTrafficRep is received. The bins stepped are given by parameter per_cell_mac_contention_delay_dl_distr values.
#            Trigger: The bin given by parameter per_cell_mac_contention_delay_dl_distr value is stepped by 1 if between zero and 20.
#        </documentation>
id =DuPerCellTrafficRep
set=per_cell_mac_contention_delay_dl_distr,10

#        <name format="pmEbsPuschSchedActivity"/>
#        <documentation>
#            Description: Total duration of slots where at least one MAC SDU is received on PUSCH. Unit: 125 us
#            Trigger: Stepped for each slot where at least one MAC SDU is successfully received.
#        </documentation>
id =DuPerCellTrafficRep
set = per_cell_pusch_sched_activity,1


#        <name format="pmEbsMacVolDlDrb"/>
#        <documentation>
#            Description: Aggregated volume of downlink MAC SDUs transmitted for HARQ initial transmission for each DRB. HARQ retransmission is #excluded. Unit: Bytes
#            Trigger: HARQ initial transmission in single-burst and in last slot of burst is excluded. In case of carrier aggregation, all DL MAC #SDUs transmitted from PCell and SCell are included.
#        </documentation>
id = DuPerUeRbTrafficRep
set=per_rb_mac_vol_dl_drb,2


#        <name format="pmEbsPuschAvailTime"/>
#        <documentation>
#            Description: Total duration of slots where gNodeB scheduler can schedule on PUSCH. Unit: 125 us
#            Trigger: Stepped for each slot where PUSCH is available, regardless if any UE is scheduled.
#        </documentation>
id = DuPerCellTrafficRep
set=per_cell_pusch_avail_time,1

#        <name format="pmEbsMacTimeDlDrb"/>
#        <documentation>
#            Description: Aggregated time for HARQ initial transmission scheduling downlink of DRB since DRB was last scheduled (delta-time #between scheduling occasions). Meanwhile, there is data in buffer. Unit: 125 us
#            Trigger: First scheduling occasion for new packet arriving to empty DRB buffer is excluded. Last scheduling occasion for HARQ initial #transmission to drain DRB buffer is excluded. HARQ retransmission is excluded. In case of carrier aggregation, HARQ initial transmission #scheduling can be in PCell or SCell.
#        </documentation>
id=DuPerUeRbTrafficRep
set=per_rb_mac_time_dl_drb,1

#        <name format="pmEbsPdschAvailTime"/>
#        <documentation>
#            Description: Total duration of slots where gNodeB scheduler can schedule on PDSCH. Unit: 125 us
#            Trigger: Stepped for each slot where PDSCH is available, regardless if any UE is scheduled.
#        </documentation>
id = DuPerCellTrafficRep
set =per_cell_pdsch_avail_time,1

#        <name format="pmEbsCellDowntimeMan"/>
#        <documentation>
#            Description: Length of time when cell is disabled because NRCellDU.administrativeState, or another MO the cell depends on, is locked #by operator. Incremented only when gNodeB is operational. Unit: seconds
#            Trigger: Stepped each second when conditions are met.        
#        </documentation>
id = DuPerNRCellDUDowntime
set=downtime_type,1


#        <name format="pmEbsCellDowntimeAuto"/>
#        <documentation>
#            Description: Length of time cell is disabled because NRCellDU.serviceStatus is set to OUT_OF_SERVICE. Counter is only incremented #when gNodeB is operational. Unit: seconds
#            Trigger: Stepped each second when conditions are met.        
#        </documentation>
id=DuPerNRCellDUDowntime
set=downtime_type,2

#        <name format="pmEbsMacVolUl"/>
#        <documentation>
#            Description: Data volume in MAC SDUs successfully received in uplink. Unit: Bytes
#            Trigger: Stepped when data is successfully received from DRBs and SRBs when cell is used as PCell or SCell.
#        </documentation>
id=DuPerCellTrafficRep
set=per_cell_mac_vol_ul,1


