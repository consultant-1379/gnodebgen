#!/bin/bash
LOG_FILE="/home/tcp_retrieve.log"
log()
{
echo "[${USER}] [`date`] - ${*}" >> ${LOG_FILE}
}

source=`pwd`
log "========================================="
log "Checking tcp_retries current value"
tcp_retries=8
value=`cat /proc/sys/net/ipv4/tcp_retries2`
log "Current value= $value"

if [[ $value == $tcp_retries ]]; then

        log "Tcp retries value is fine: $tcp_retries"

else

log "configuring tcp_retries as 8"

echo=`echo 8 >/proc/sys/net/ipv4/tcp_retries2`
update_value=`cat /proc/sys/net/ipv4/tcp_retries2`

log "tcp_retries value configured properly. Now value is $update_value"
fi

