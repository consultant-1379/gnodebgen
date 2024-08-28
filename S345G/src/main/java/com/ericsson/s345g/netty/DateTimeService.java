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
package com.ericsson.s345g.netty;

import java.util.Calendar;
import java.util.Date;

/**
 * @author xjaimah
 *
 */
public class DateTimeService {

    /**
     * The SECONDS_IN_MINUTES
     */
    public static int SECONDS_IN_MINUTES = 60;

    /**
     * The SECONDS_IN_DAY
     */
    public static int SECONDS_IN_DAY = 86400;

    /**
     * The MILLI_IN_SECOND
     */
    public static int MILLI_IN_SECOND = 1000;

    /**
     * The SECONDS_IN_HOUR
     */
    public static int SECONDS_IN_HOUR = 3600;

    /**
     * The ROP_BUFFER_IN_MILLI
     */
    public static int ROP_BUFFER_IN_MILLI = 20000;

    /**
     * @param epoch
     * @param rop_time
     * @return
     */
    public static int getStartHour(long epoch, int rop_time) {
        return (int) ((((epoch - (rop_time * SECONDS_IN_MINUTES * MILLI_IN_SECOND)) / MILLI_IN_SECOND) % SECONDS_IN_DAY)
                / SECONDS_IN_HOUR);
    }

    /**
     * @param epoch
     * @return
     */
    public static int getEndHore(long epoch) {
        return (int) (((epoch / MILLI_IN_SECOND) % SECONDS_IN_DAY) / SECONDS_IN_HOUR);
    }

    /**
     * @param epoch
     * @param rop_time
     * @return
     */
    public static int getStartMin(long epoch, int rop_time) {
        return (int) ((((epoch - (rop_time * SECONDS_IN_MINUTES * MILLI_IN_SECOND)) / MILLI_IN_SECOND)
                % SECONDS_IN_HOUR) / SECONDS_IN_MINUTES);
    }

    /**
     * @param epoch
     * @return
     */
    public static int getEndMin(long epoch) {
        return (int) (((epoch / MILLI_IN_SECOND) % SECONDS_IN_HOUR) / SECONDS_IN_MINUTES);
    }

    /**
     * Convert the date object in the string format : YYYYMMDD
     *
     * @param dateObj
     */
    public static String convertDateToString(Date dateObj) {
        String dateString = "";
        if (dateObj != null) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(dateObj);
            int year = cal.get(Calendar.YEAR);
            int month = cal.get(Calendar.MONTH) + 1;
            int date = cal.get(Calendar.DATE);
            dateString = year + String.format("%02d", month) + String.format("%02d", date);
        }
        return dateString;
    }
}
