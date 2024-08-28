package com.ericsson.tcs.utility.event.alteration;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;

public class TestClass {

	public static String input = "W:/ede_nr_event_addition/output/";
	
	public static List<String> files;
	
	
	public static void main(String[] args) {
		
		List<String> x = new ArrayList<String>();
		List<String> y = new ArrayList<String>();
		
		y.add("Abhishek");
		y.add("Mandlewala");
		
		x = y;
		y = new ArrayList<String>();
		
		System.out.println(x);
		System.out.println(y);
		System.exit(0);
		
		files = new ArrayList<String>();
		Utils.collectFiles(input, files);
		
		FileReader r = new FileReader();
		GPBServices g = new GPBServices();
		List<Long> uniqEventIdList = new ArrayList<Long>();
		
		for (String f : files) {
			File fp = new File(f);
			List<byte[]> eventList = r.getFileEventList(fp);
			for (byte[] b : eventList) {
				PmEvent msg = (PmEvent) g.getPmEventOuterMessage(b);
				if (!uniqEventIdList.contains(msg.getEventId())) {
					uniqEventIdList.add(msg.getEventId());
				}
			}
		}
		Collections.sort(uniqEventIdList);
		
		System.out.println(uniqEventIdList);
		
	}
	
	
}
