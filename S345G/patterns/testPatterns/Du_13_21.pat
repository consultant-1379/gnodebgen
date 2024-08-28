# version information
version=DU,13,21,0,14,0
version=CUUP,13,5,0,11,0
version=CUCP,13,38,0,15,0

#USE THIS FOR 667 ONLY o/w Dropped counters (Set CellsPerNode=1  in S3.ini)
#set = nci, 16385
#set = gnb_id, 1
#set = gnb_id_length, 22


################################################################################################
# 12 DU events that will trigger ETCM counters
#
# Generated a total of 14 comprising of 12 ETCM events plus 1 Heartbeat events (with interval between heartbeats of 0 events) and 1 DroppedEvents for PM_EVENT_MESSAGE_GROUP_DU. Max Event Size is 250. Generated GZIP File size of 967 bytes
#
# 2020-01-17 09:28:41,942 INFO  [EtcmHandler] DuPerUeTrafficRep : [{per_ue_rlc_arq_dl_ack=1}]
# 2020-01-17 09:28:41,942 INFO  [EtcmHandler] DuPerNRCellDUDowntime : [{downtime_type=1}, {downtime_type=2}]
# 2020-01-17 09:28:41,942 INFO  [EtcmHandler] DuPerCellTrafficRep : [{per_cell_mac_contention_delay_dl_distr=20}, {per_cell_pdsch_sched_activity=1}, {per_cell_mac_vol_dl=1}, {per_cell_pusch_sched_activity=1}, {per_cell_mac_vol_ul=1}, {per_cell_pdsch_avail_time=1}, {per_cell_pusch_avail_time=1}]
# 2020-01-17 09:28:41,942 INFO  [EtcmHandler] DuPerUeRbTrafficRep : [{per_rb_mac_vol_dl_drb=1}, {per_rb_mac_time_dl_drb=1}]

#--------------- DU 1 LOOP START -----------------

id = DuPerUeTrafficRep
set = per_ue_rlc_arq_dl_ack, 1

id = DuPerNRCellDUDowntime
set = downtime_type, 2

id = DuPerNRCellDUDowntime
set = downtime_type, 1

id = DuPerCellTrafficRep
set = per_cell_mac_contention_delay_dl_distr, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0
#-------------------

# incr
id = DuPerCellTrafficRep
set = per_cell_pdsch_sched_activity, 1
#----------------
# DuPerCellTrafficRep incr
#set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------

# incr
id = DuPerCellTrafficRep
set = per_cell_mac_vol_dl, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
#set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------

# incr
id = DuPerCellTrafficRep
set = per_cell_pusch_sched_activity, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
#set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------

# incr
id = DuPerCellTrafficRep
set = per_cell_mac_vol_ul, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
#set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------


# incr
id = DuPerCellTrafficRep
set = per_cell_pdsch_avail_time, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
#set = per_cell_pdsch_avail_time, 0
set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------

# incr
id = DuPerCellTrafficRep
set = per_cell_pusch_avail_time, 1
#----------------
# DuPerCellTrafficRep incr
set = per_cell_pdsch_sched_activity, 0
set = per_cell_mac_vol_dl, 0
set = per_cell_pusch_sched_activity, 0
set = per_cell_mac_vol_ul, 0
set = per_cell_pdsch_avail_time, 0
#set = per_cell_pusch_avail_time, 0

set = per_cell_mac_contention_delay_dl_distr, 0
#-------------------

# incr
id = DuPerUeRbTrafficRep
set = per_rb_mac_vol_dl_drb, 1
#----------------
# DuPerUeRbTrafficRep
#set = per_rb_mac_vol_dl_drb, 0
set = per_rb_mac_time_dl_drb, 0
#----------------

# incr
id = DuPerUeRbTrafficRep
set = per_rb_mac_time_dl_drb, 1
#----------------
# DuPerUeRbTrafficRep
set = per_rb_mac_vol_dl_drb, 0
#set = per_rb_mac_time_dl_drb, 0
#----------------
#--------------- DU 1 LOOP END -----------------
