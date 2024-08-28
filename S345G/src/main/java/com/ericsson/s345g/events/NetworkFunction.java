
/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2020
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.events;

public enum NetworkFunction {
    CUCP(0),
    CUUP(1),
    DU(2),
    UNSET(-1);

    private int value;
    private int pm_event_common_version = 0;
    private int pm_event_group_version = 0;
    private int pm_event_correction_version = 0;
    private int etcm_version = 0;
    private int etcm_correction_version = 0;

    private NetworkFunction(int value) {
        this.value = value;
    }

    public void setVersion(int pm_event_common_version, int pm_event_group_version, int pm_event_correction_version, 
        int etcm_version, int etcm_correction_version)
    {        
        this.pm_event_common_version = pm_event_common_version;
        this.pm_event_group_version = pm_event_group_version;
        this.pm_event_correction_version = pm_event_correction_version; 
        this.etcm_version = etcm_version;
        this.etcm_correction_version = etcm_correction_version;
    }

    public void setVersion(int [] values) {        
        this.pm_event_common_version = values[0];
        this.pm_event_group_version = values[1];
        this.pm_event_correction_version = values[2]; 
        this.etcm_version = values[3];
        this.etcm_correction_version = values[4];
    }

    public int getValue() {
        return value;
    }

    public int getPm_event_common_version() {
        return pm_event_common_version;
    }

    public int getPm_event_group_version() {
        return pm_event_group_version;
    }

    public int getPm_event_correction_version() {
        return pm_event_correction_version;
    }

    public int getEtcm_version() {
        return etcm_version;
    }

    public int getEtcm_correction_version() {
        return etcm_correction_version;
    }
}