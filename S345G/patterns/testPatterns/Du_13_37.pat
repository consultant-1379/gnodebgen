# version information
version=DU,13,37,0,30,0
version=CUUP,13,5,0,11,0
version=CUCP,13,70,0,37,0

#
# 4 unique events
# 5 transmitted events
# 12 triggered counters
#

# event Id DuPerCellTrafficRep trigger 7 counters
 # pmEbsMacVolUl
 # pmEbsMacVolDl
 # pmEbsDuExampleCompressedPdfCounter
 # pmEbsPdschSchedActivity
 # pmEbsPuschSchedActivity
 # pmEbsPdschAvailTime
 # pmEbsPuschAvailTime
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
