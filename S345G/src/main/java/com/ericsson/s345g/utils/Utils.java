/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

public class Utils {

    public Utils() {
        /* handy holder so we don't have to make methods static */
    }

    private static String digits = "0123456789abcdef";

    /**
     * produce a printable string from a byte array
     *
     * @param data
     * @return
     */
    public static String toHex(byte[] data) {
        StringBuilder buf = new StringBuilder();
        buf.append("0x");
        for (int i = 0; i != data.length; i++) {
            int v = data[i] & 0xff;

            buf.append(digits.charAt(v >> 4));
            buf.append(digits.charAt(v & 0xf));
        }

        return buf.toString();

    }
    public static byte[] longToBytes(long x) {
    	ByteBuffer longBuffer = ByteBuffer.allocate(Long.SIZE / 8);
        longBuffer.putLong(0, x);
        return longBuffer.array();
    }

    public static long bytesToLong(byte[] bytes) {
    	ByteBuffer longBuffer = ByteBuffer.allocate(Long.SIZE / 8);
        longBuffer.put(bytes, 0, bytes.length);
        longBuffer.flip();// need flip
        return longBuffer.getLong();
    }

    public static byte[] intToBytes(int x) {
    	ByteBuffer intBuffer = ByteBuffer.allocate(Integer.SIZE / 8);
        intBuffer.putInt(0, x);
        return intBuffer.array();
    }

    public static long bytesToInt(byte[] bytes) {
    	ByteBuffer intBuffer = ByteBuffer.allocate(Integer.SIZE / 8);
        intBuffer.put(bytes, 0, bytes.length);
        intBuffer.flip();// need flip
        return intBuffer.getInt();
    }
        
    /**
     * Convert a string "0123ab" into byte [] = {0x01, 0x23, 0xab}
     *
     * @param s
     * @return byte []
     */
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();

        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public byte[] getTimeBuf() {
        ByteBuffer timeBuf = ByteBuffer.allocate(9);
        // get the current timestamp in UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(System.currentTimeMillis()); // UTC

        timeBuf.putShort((short) cal.get(Calendar.YEAR));
        timeBuf.put((byte) (cal.get(Calendar.MONTH) + 1)); // calender month counts from zero
        timeBuf.put((byte) cal.get(Calendar.DAY_OF_MONTH));
        timeBuf.put((byte) cal.get(Calendar.HOUR_OF_DAY));
        timeBuf.put((byte) cal.get(Calendar.MINUTE));
        timeBuf.put((byte) cal.get(Calendar.SECOND));
        timeBuf.putShort((short) cal.get(Calendar.MILLISECOND));

        return timeBuf.array();
    }

    private final ByteBuffer footer = ByteBuffer.allocate(12);

    private static final byte[] spaces = { 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20,
            0x20, 0x20, 0x20, // 16
            0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, // 32
            0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, // 48
            0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, 0x20, // 64
    };

    /**
     * make a CTRS (file) header record
     *
     */
    public ByteBuffer mkFileHeader(String[] headerBits) {
        int msgLen = 417; // 425 data + 3 padding
        String ffv, fiv1, fiv2;
        ffv = String.format("%-5s", headerBits[0]);
        fiv1 = String.format("%-13s", headerBits[1]);
        fiv2 = String.format("%-5s", headerBits[2]);
        ByteBuffer ctrsHeader = ByteBuffer.allocate(msgLen);
        ctrsHeader.clear();
        ctrsHeader.putShort((short) msgLen); // 2
        ctrsHeader.putShort((short) 0); // 2
        ctrsHeader.put(ffv.getBytes(), 0, 5); // 5
        ctrsHeader.put(fiv1.getBytes(), 0, 13); // 13
        ctrsHeader.put(fiv2.getBytes(), 0, 5); // 5
        ctrsHeader.put(getTimeBuf(), 0, 7); // YYMDhms // 7
        ctrsHeader.put(spaces, 0, 64); // User label 128
        ctrsHeader.put(spaces, 0, 64);
        ctrsHeader.put(spaces, 0, 64); // logical name 255
        ctrsHeader.put(spaces, 0, 64);
        ctrsHeader.put(spaces, 0, 64);
        ctrsHeader.put(spaces, 0, 63);

        return ctrsHeader;
    }

    private static final byte[] fixedFooter = { 0x00, 0x0c, 0x00, 0x05 };

    public ByteBuffer mkFooter() {
        footer.clear();

        footer.put(fixedFooter);
        footer.put(getTimeBuf(), 0, 7); // YYMDhms
        footer.put((byte) 0x00); // padding

        return footer;
    }

    /**
     * Pause current thread for required milliseconds
     */
    public static void snooze(int millsecs) {
        try {
            Thread.sleep(millsecs); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Return value of int or zero
     */
    public static Integer safeParseInt(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            return 0;
        }
    }

    /*
     * Return value of long or zero
     */
    public static Long safeParseLong(String s) {
        if (s == null || s.isEmpty()) {
            return 0L;
        }
        try {
            return Long.parseLong(s);
        } catch (Exception e) {
            return 0L;
        }
    }

    public static double safeParseDouble(String s, double defaultVal) {
        if (s == null || s.isEmpty()) {
            return defaultVal;
        }
        try {
            return Double.parseDouble(s);
        } catch (Exception e) {
            return defaultVal;
        }
    }

    private static long toWrite = 0L;
    private static AtomicLong written = new AtomicLong(0L);

    /** called when we want to write an event */
    public static void incToWrite() {
        toWrite++;
    }

    /** called when an event has been written [Thread safe] */
    public static void incWritten() {
        written.incrementAndGet();
    }

    /**
     * get the difference between the number of events we have asked to be written,
     * and the number actually written
     *
     * @return
     */
    public static long getWriteBacklog() {
        long res;
        res = toWrite - written.longValue();
        return res;
    }

    public static void resetBacklog() {
        written.set(0L);
        toWrite = written.get();
    }

    /**
     * get current date in string with format yyyyMMdd
     *
     * @return
     */
    public static String getStringDate() {
        String dateString = "";

        // get the current timestamp in UTC
        Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        cal.setTimeInMillis(System.currentTimeMillis()); // UTC

        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH) + 1;
        int date = cal.get(Calendar.DATE);

        dateString = "" + year;

        if (month > 9) {
            dateString += month;
        } else {
            dateString += "0" + month;
        }
        if (date > 9) {
            dateString += date;
        } else {
            dateString += "0" + date;
        }
        return dateString;
    }

    /*
     * Read the named file into a list of strings
     */
    public static List<String> readFile(String fileName) {
        List<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = br.readLine()) != null) {
                int idx = line.indexOf('#'); // strip out comments
                if (idx > -1) {
                    line = line.substring(0, idx);
                }
                line = line.trim();
                if (line.length() > 0) {
                    result.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
