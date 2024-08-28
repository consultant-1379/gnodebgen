package com.ericsson.tcs.utility.event.alteration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.tcs.constant.Utils;
import com.google.gson.Gson;
import com.google.protobuf.Descriptors.FieldDescriptor;

public class EventAdditionService {

	/**
	 * 
	 * Limitation : This code will not be able to handle the scenario where CUCP,
	 * CUUP or DU events needs to be added before or after common events as common
	 * events does not have any node related information.
	 * 
	 */

	private static int threadCount = (Runtime.getRuntime().availableProcessors() - 1) * 2;

	private static EventConditionMap rules;
	private Map<Integer, List<String>> threadToFdns;
	private static Map<String, List<String>> fdnToFilesMap;
	private static Map<Long, Integer> refEventToOccurMap;

	private Map<Integer, FieldDescriptor> evtIdToFieldDescriptor = Utils.getEventIds();
	private Map<Integer, String> evtIdToNfmap = Utils.getEventToNetworkFuncationMap();

	public static int getRefEventIdOccurence(long o) {
		for (Map<Object, Object> element : rules.getConditions()) {
			long ref_e_id = Long.valueOf((String) element.get("ref_event_id"));
			if (ref_e_id == o) {
				return Integer.parseInt((String) element.get("ref_event_id_occur"));
			}
		}
		return -1;
	}

	public static synchronized boolean acknowledger(long l) {
		boolean status = false;
		int occur_value = refEventToOccurMap.get(l);
		occur_value -= 1;
		if (occur_value == 0) {
			status = true;
			occur_value = getRefEventIdOccurence(l);
		}
		refEventToOccurMap.put(l, occur_value);
		return status;
	}

	public void distributeWorkAcrossThreads(String outputPath) {
		int threadCounter = 0;
		threadToFdns = new HashMap<Integer, List<String>>();
		for (String fdn : fdnToFilesMap.keySet()) {
			if (threadCounter >= threadCount) {
				threadCounter = 0;
			}
			if (!threadToFdns.containsKey(threadCounter)) {
				threadToFdns.put(threadCounter, new ArrayList<String>());
			}
			threadToFdns.get(threadCounter).add(fdn);
			threadCounter += 1;
		}

		List<Thread> runningThread = new ArrayList<Thread>();
		for (int index : threadToFdns.keySet()) {
			EventAdditionWorker e = new EventAdditionWorker();
			e.setThreadId(index);
			e.setFdnList(threadToFdns.get(index));
			e.setOutFolder(outputPath);
			Thread t = new Thread(e);
			runningThread.add(t);
			t.start();
		}
		try {
			while (!runningThread.isEmpty()) {
				for (Thread t : runningThread) {
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

	public void init(String input, String output, String json_arg) {
		Gson g = new Gson();
		rules = g.fromJson(json_arg, EventConditionMap.class);

		fdnToFilesMap = new HashMap<String, List<String>>();
		Utils.collectAndArrangeFiles(input, fdnToFilesMap);

		refEventToOccurMap = new HashMap<Long, Integer>();
		for (Map<Object, Object> element : rules.getConditions()) {
			long ref_e_id = Long.valueOf((String) element.get("ref_event_id"));
			if (refEventToOccurMap.containsKey(ref_e_id)) {
				System.out.println("ERROR : Can not handle duplicate ref event id in configuration.");
				System.exit(1);
			} else {
				int ref_e_id_occur = Integer.valueOf((String) element.get("ref_event_id_occur"));
				refEventToOccurMap.put(ref_e_id, ref_e_id_occur);
			}
		}

		if (fdnToFilesMap.keySet().size() > 0) {
			if (threadCount > fdnToFilesMap.keySet().size()) {
				threadCount = fdnToFilesMap.keySet().size();
			}
			System.out.println("INFO : Finalized thread count: " + threadCount);
			distributeWorkAcrossThreads(output);
		} else {
			System.out.println("ERROR : No files found in input location: " + input);
		}
	}

	public static EventConditionMap getRules() {
		return rules;
	}

	public static Map<String, List<String>> getFdnToFilesMap() {
		return fdnToFilesMap;
	}

	public Map<Integer, FieldDescriptor> getEvtIdToFieldDescriptor() {
		return evtIdToFieldDescriptor;
	}

	public Map<Integer, String> getEvtIdToNfmap() {
		return evtIdToNfmap;
	}

}
