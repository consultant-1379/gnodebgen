#!/bin/sh

# typical usage
# bash anal_sess.sh custdata/* Cust

# files to process
GLOB=${1:-Data/A20160531.*_10.45.99.*}
# Session validaion name
SVName=${2:-sess}

# remove any old session files
rm tmp/sessions_*.txt

# analyse files 
# mp=1 restricts asre to a single processor.
# If dealing with lots (or large) files consider letting asre multitask 
python asre.py inFile=${GLOB} mp=1

cat tmp/sessions_*.txt > ${SVName}.mrg

# Num sessions 
NumSess=$(cat ${SVName}.mrg | wc -l)
echo "Number of sessions found: "$NumSess

#
# this pattern is used a lot and took me a while to build so it is worth explaining:
# uniq -c counts the unique instances and prepends the value to the line as $1
# 
# awk -v var="$NumSess" '{printf(" %s, %.3f", $1, 100*$1/var); $1=""; print $0}' 
# -- -v var="$NumSess"  -- 
#   grap the environment variable and assign it to something awk can use
# -- printf(" %s, %.3f", $1, 100*$1/var) -- 
#   formated print of teh first value (the count) and the value as a percentage of the total
# -- ; $1=""
#   clear the first value (because we have already printed it
# -- ; print $0} -- 
#   print everythin gelse on the line 
#

# Success pattern distribution
awk '$4 == "0," {print( $1, $2) }' ${SVName}.mrg | grep -v "\-1" | sort -n | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}' > ${SVName}.pat.succ
echo 'Success Pattern distribution:'
echo ' Sessions, %, opener, closer'
head -20 ${SVName}.pat.succ

# Error pattern distribution
awk '$4 != "0," {print( $9, $4, $5) }' ${SVName}.mrg | grep -v "\-1" | sort -n | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}' > ${SVName}.pat.err
echo 'Error Pattern distribution:'
echo ' Sessions, %, Error event, error result, event list'
head -20 ${SVName}.pat.err

# Failed pattern distribution - missing opener or closer
#awk '{print( $1, $2, $7, $6, $12) }' ${SVName}.mrg | grep "\-1" | sort -n | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; #print $0}' > ${SVName}.pat.failed
#echo 'Failed Pattern distribution:'
#echo ' Sessions, opener, closer'
#head -20 ${SVName}.pat.failed

# Suspect pattern distribution
#awk '$3 == "False," {print( $1, $2) }' ${SVName}.mrg | sort -n | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}' #> ${SVName}.pat.sus
#echo 'Suspect Pattern distribution:'
#echo ' Sessions, opener, closer'
#head -20 ${SVName}.pat.sus

# Suspect sessions
awk '$1 == "\-1," || $2 == "\-1," {print($5)}'  ${SVName}.mrg | sort | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}'> ${SVName}.suspect
echo "Suspect sessions:"
echo " sessions, %, event list"
head -20 ${SVName}.suspect

# Pattern Durations
awk  '$1!="-1," && $2 != "-1," {print($3 $5) }' ${SVName}.mrg | sort -n | uniq -c | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}' > ${SVName}.dur 
echo 'Sessions durations:'
echo ' Sessions, %, duration, eventList ' 
head -20 ${SVName}.dur


# Events per successful session 
awk '$1 != "-1," && $2 != "-1," && $4 == "0," { sum[$1$2] += (length($5)-2)/5; n[$1$2]+=1 } END { for (i in sum) {print i, sum[i] / n[i]; }}' ${SVName}.mrg | sort -nr > ${SVName}.evtsSess
head ${SVName}.evtsSess

# Average events per session 
awk -v var="${SVName}" '{ sum += (length($5)-2)/5; n++ } END { if (n > 0); {print var " has an average of " sum / n " events per session for all sessions."; }}'  ${SVName}.mrg 
awk -v var="${SVName}" '$1 != "-1," && $2 != "-1," { sum += (length($5)-2)/5; n++ } END { if (n > 0); {print var " has an average of " sum / n " events per successful session."; }}'  ${SVName}.mrg 
awk -v var="${SVName}" '$4 != "0," { sum += (length($5)-2)/5; n++ } END { if (n > 0); {print var " has an average events per error session of: " sum / n ; }}'  ${SVName}.mrg 
awk -v var="${SVName}" '$1 == "-1," || $2 == "-1," { sum += (length($5)-2)/5; n++ } END { if (n > 0); {print var " has an average events per suspect session of:  " sum / n ; }}'  ${SVName}.mrg 


# Average Durations per successful session
awk '$1 != "-1," && $2 != "-1," && $4 == "0," { sum[$1$2] += $3; n[$1$2]+=1 } END { for (i in sum) {print i, sum[i] / n[i]; }}' ${SVName}.mrg | sort -nr > ${SVName}.durSess
head ${SVName}.durSess
awk -v var="${SVName}" '$1 != "-1," && $2 != "-1," && $4 == "0," { sum += $3; n+=1 } END { print var " has a duration on average of "sum / n" seconds per successful session"; }' ${SVName}.mrg 
awk -v var="${SVName}" '$1 != "-1," && $2 != "-1," && $4 != "0," { sum += $3; n+=1 } END { print var " has a duration on average of "sum / n" seconds per error session"; }' ${SVName}.mrg 
awk -v var="${SVName}" '$1 == "-1," || $2 == "-1," { sum += $3; n+=1 } END { print var " has a duration on average of "sum / n" seconds per suspect session"; }' ${SVName}.mrg 

# sessions per cell
#awk '{print($7)}' ${SVName}.mrg | awk -F: '{n[$1] += 1} END {for (i in n) {print(n[i], i)}}' | sort -nr | awk -v var="$NumSess" '{printf(" %s, %.3f,", $1, 100*$1/var); $1=""; print $0}' > ${SVName}.spc
#NumCell=$(cat ${SVName}.spc | wc -l)
# calculate the percentage of sessions each percentage of cells generates
#awk '{print($7)}' ${SVName}.mrg | awk -F: '{n[$1] += 1} END {for (i in n) {print(n[i])}}' | sort -nr | awk -v var="$NumSess" -v nc="$NumCell" '{j++; k=int(j/nc*20); n[k] += $1;} END { for (i in n) { printf("%d, %.3f", i*5, 100*n[i]/var); print ""}}' > ${SVName}.spcp

# $10 is starttime in millisec
# sessions by starttime
#awk '$1 != " -1," && $2 != " -1," {t = int($10/300000); n[t] += 1} END {for (i in n) {print(i, n[i])}}' ${SVName}.mrg | sort -n > ${SVName}.sp5min

# sessions per cell
#awk '{print($7,":",$10)}' ${SVName}.mrg | awk -F: '{t=int($4/300000); k=t","$1; n[k] += 1} END {for (i in n) {print(i,"," n[i])}}' | sort -n > ${SVName}.spc5min

# Event frequency
# extract the event list, strip the quotes, break on commas, strip blank lines
#awk '{print($5)}' ${SVName}.mrg | awk '{gsub(/"/, "", $1); print($1)}' | awk '{print($0)}' RS=',' | awk 'NF {print($0)}' > tt
#  count total number of events
#NumEvts=$(cat tt | wc -l)
#  sort and count unique instances in descending order, print evt id, count, percentage of total, 
#sort tt | uniq -c | sort -nr | awk -v var="$NumEvts" '{printf(" %s, %s, %.3f\n", $2, $1, 100*$1/var)}' > ${SVName}.evtFreq
#echo "EvtId, Count, %"
#cat ${SVName}.evtFreq

# Order sessions based on RacUeRef code
awk '{print($7, $5, $3, $8)}' ${SVName}.mrg | awk -F: '{print ($3)}' | sort -n > ${SVName}.rac 

