package com.ericsson.tcs.utility.event.alteration;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.tcs.constant.Utils;

public class EventDeletion {

	public static List<Long> event_id_list;
	public static String input_location;
	public static String output_location;
	public static List<String> fileList;

	public void distributeFiles() {

		int maxThreadCount = Runtime.getRuntime().availableProcessors() - 1;

		if (fileList.size() < maxThreadCount) {
			maxThreadCount = fileList.size();
		}

		Map<Integer, List<String>> threadToFilesMap = new HashMap<Integer, List<String>>();
		int threadIndex = 0;

		for (String f : fileList) {
			if (threadIndex >= maxThreadCount) {
				threadIndex = 0;
			}
			if (!threadToFilesMap.containsKey(threadIndex)) {
				List<String> newList = new ArrayList<String>();
				threadToFilesMap.put(threadIndex, newList);
			}
			threadToFilesMap.get(threadIndex).add(f);
			threadIndex = threadIndex + 1;
		}

		List<Thread> runningThreads = new ArrayList<Thread>();

		for (int index : threadToFilesMap.keySet()) {
			EventDeletionWorker e = new EventDeletionWorker();
			e.setThreadId(index);
			e.setFiles(threadToFilesMap.get(index));

			Thread t = new Thread(e);
			runningThreads.add(t);
			t.start();
		}

		try {
			while (!runningThreads.isEmpty()) {
				for (Thread t : runningThreads) {
					while (t.isAlive()) {
						Thread.sleep(500);
					}
				}
				break;
			}
		} catch (Exception x) {
			System.out.println("ERROR : Issue with checking status of worker threads.");
			x.printStackTrace();
			System.exit(1);
		}
	}

	public void capture_files() {
		fileList = new ArrayList<String>();
		Utils.collectFiles(input_location, fileList);
		if (fileList.isEmpty()) {
			System.out.println("ERROR : No file present at input location " + input_location);
			return;
		} else {
			distributeFiles();
		}
	}

	public void init(String event_ids, String in_loc, String out_loc) {

		boolean status = true;

		if (null == event_ids || event_ids.trim().isEmpty()) {
			status = false;
			System.out.println("ERROR : Please provide proper Event Id(s).");
		}

		event_id_list = new ArrayList<Long>();
		for (String s : event_ids.split(",")) {
			event_id_list.add(Long.parseLong(s.trim()));
		}

		input_location = in_loc;
		File in_file = new File(input_location);
		if (!in_file.exists() || !in_file.isDirectory()) {
			status = false;
			System.out.println("ERROR : Input location " + input_location + " does not exists.");
		}

		output_location = out_loc;
		File out_file = new File(output_location);
		if (!out_file.exists() || !out_file.isDirectory()) {
			status = false;
			System.out.println("ERROR : Output location " + output_location + " does not exists.");
		}

		if (status) {
			capture_files();
		}
	}

}
