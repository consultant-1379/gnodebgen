package com.ericsson.tcs.services;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

public class Test {

	public static void main(String args[]){
		System.out.println(System.currentTimeMillis());
		//short in = (short) 36500;
		
		int len = 289;
		byte[] data = new byte[2];
		data[0] = (byte) ((len & 0xff) | 0x80);
		data[1] = (byte) ((len >> 8) & 0xff);
		
		
		int rec = ((data[1] & 0x7f) << 7) | (data[0] & 0x7f);
		
		System.out.println("rec  : "+ rec);
		
		
		String path = "J://xx.bin";
		//byte[] bytes = ByteBuffer.allocate(8).putLong(myIntVlaue).array();
		final char[] bits = new char[8 * data.length];
	    for(int i = 0; i < data.length; i++) {
	        final byte byteval = data[i];
	        int bytei = i << 3;
	        int mask = 0x1;
	        for(int j = 7; j >= 0; j--) {
	            final int bitval = byteval & mask;
	            if(bitval == 0) {
	                bits[bytei + j] = '0';
	            } else {
	                bits[bytei + j] = '1';
	            }
	            mask <<= 1;
	        }
	    }
	    System.out.println(String.valueOf(bits));
		writeGBP(data,path);
	}
	
	private static void writeGBP(byte[] data, String path) {
		FileOutputStream fileOuputStream = null;
		GZIPOutputStream gzOutput = null;
		try {
				fileOuputStream = new FileOutputStream(path + ".gz");
				gzOutput = new GZIPOutputStream(fileOuputStream);
					gzOutput.write(data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (gzOutput != null) {
				try {
					gzOutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOuputStream != null) {
				try {
					fileOuputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
