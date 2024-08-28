#!/bin/bash

# ------------------------------------------------------------------------------
# *******************************************************************************
# * COPYRIGHT Ericsson 2020
# *
# * The copyright to the computer program(s) herein is the property of
# * Ericsson Inc. The programs may be used and/or copied only with written
# * permission from Ericsson Inc. or in accordance with the terms and
# * conditions stipulated in the agreement/contract under which the
# * program(s) have been supplied.
# *******************************************************************************
# *---------------------------------------------------------------------------- '''

# This script delete the ROP based on system time.
# e.g 20200710.1215 --> This ROP will be deleted at 20200710.1230

INTER_PATH=${1}

ROP_FOLDER_TILL_DELETE=$(date -u --date='-15 minutes' +"%Y%m%d.%H%M")
MODIFIED_ROP_FOLDER_TILL_DELETE=$(echo ${ROP_FOLDER_TILL_DELETE} | sed 's/\.//g')

sleep 5

# FULL PATH = /inter_path/sim_name/15/net_fun/rop_folder

if [[ -d ${INTER_PATH} ]]; then
    for SIM in `ls ${INTER_PATH}`; do
        for ROP_PERIOD in `ls ${INTER_PATH}/${SIM}`; do
            for NET_FUNC in `ls ${INTER_PATH}/${SIM}/${ROP_PERIOD}`; do
                for ROP_FOLDER in `ls ${INTER_PATH}/${SIM}/${ROP_PERIOD}/${NET_FUNC}`; do
                    MODIFIED_ROP_FOLDER=$(echo ${ROP_FOLDER} | sed 's/\.//g')
                    if [[ ${MODIFIED_ROP_FOLDER} -le ${MODIFIED_ROP_FOLDER_TILL_DELETE} ]]; then
                        echo "Deleting : ${INTER_PATH}/${SIM}/${ROP_PERIOD}/${NET_FUNC}/${ROP_FOLDER}"
                        rm -rf ${INTER_PATH}/${SIM}/${ROP_PERIOD}/${NET_FUNC}/${ROP_FOLDER}
                        echo "Deletion completed : ${INTER_PATH}/${SIM}/${ROP_PERIOD}/${NET_FUNC}/${ROP_FOLDER}"
                    fi
                done
            done
        done
    done
fi

