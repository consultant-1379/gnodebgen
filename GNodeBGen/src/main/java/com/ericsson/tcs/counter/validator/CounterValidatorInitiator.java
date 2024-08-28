package com.ericsson.tcs.counter.validator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import com.ericsson.tcs.constant.Utils;
import com.google.gson.Gson;

public class CounterValidatorInitiator {

	private static Map<String, Map<String, Map<String, String>>> etcmConditionMap;
	private static Map<String, List<String>> etcmEventToCounterMap;
	private static Map<Integer, List<String>> threadIdToFileListMap;
	private static List<String> fileList;
	private static int maxThreadCount = Runtime.getRuntime().availableProcessors() * 10;
	public static Map<String, Map<String, Map<String, Object>>> infoCollectionMap = new ConcurrentHashMap<>();

	// New Code Start
	ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");

	private static Map<String, Map<String, Map<String, CompiledScript>>> engineMap;
	// New Code End

	public boolean loadJsonConfigInformation(String location) {
		try {
			System.out.println("INFO : Loading JSON configuration.");
			Gson g = new Gson();
			String etcmEventToCounterFile = location + File.separator + "etcm_event_info.json";
			FileReader fr = new FileReader(new File(etcmEventToCounterFile));
			BufferedReader br = new BufferedReader(fr);
			etcmEventToCounterMap = g.fromJson(br, Map.class);
			if (etcmEventToCounterMap.isEmpty()) {
				return false;
			}
			String etcmConditionFile = location + File.separator + "etcm_conditions.json";
			fr = new FileReader(new File(etcmConditionFile));
			br = new BufferedReader(fr);
			etcmConditionMap = g.fromJson(br, Map.class);
			if (etcmConditionMap.isEmpty()) {
				return false;
			}

			// New Code Start
			else {
				engineMap = new HashMap<>();
				for (String event : etcmConditionMap.keySet()) {
					if (!engineMap.containsKey(event)) {
						engineMap.put(event, new HashMap<>());
					}
					for (String counter : etcmConditionMap.get(event).keySet()) {
						if (!engineMap.get(event).containsKey(counter)) {
							engineMap.get(event).put(counter, new HashMap<>());
						}
						for (String exprType : etcmConditionMap.get(event).get(counter).keySet()) {
							if (exprType.equals("normal") || exprType.equals("step")) {
								String expr = etcmConditionMap.get(event).get(counter).get(exprType).replace("||", "@@").replace("|", "__").replace("@@", "||");
								final CompiledScript compiled = ((Compilable) engine).compile(expr);
								engineMap.get(event).get(counter).put(exprType, compiled);
							}
						}
					}
				}
			}
			// New Code End

			System.out.println("INFO : Configuration loaded.");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public void parseAndProcessCellTraceInformation(String loc) {
		System.out.println("INFO : Processing cell trace file data for counter verification.");
		try {
			List<Thread> workerList = new ArrayList<>();
			for (int id : threadIdToFileListMap.keySet()) {
				CounterValidatorWorker worker = new CounterValidatorWorker();
				worker.setThreadId(id);
				worker.setFileList(threadIdToFileListMap.get(id));
				worker.setOutLoc(loc);
				Thread t = new Thread(worker);
				workerList.add(t);
				t.start();
			}
			while (!workerList.isEmpty()) {
				for (Thread t : workerList) {
					while (t.isAlive()) {
						Thread.sleep(500);
					}
				}
				break;
			}
			System.out.println("INFO : Counter pegging information gathered successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void distributeFileList() {
		System.out.println("INFO : Assigning File(s) to threads.");
		threadIdToFileListMap = new HashMap<>();

		if (fileList.size() < maxThreadCount) {
			maxThreadCount = fileList.size();
		}

		System.out.println("INFO : Number of input files found : " + fileList.size());
		System.out.println("INFO : Initialized Thread Instances count : " + maxThreadCount);

		int threadCounter = 0;

		for (String f : fileList) {
			if (threadCounter >= maxThreadCount) {
				threadCounter = 0;
			}
			if (!threadIdToFileListMap.containsKey(threadCounter)) {
				threadIdToFileListMap.put(threadCounter, new ArrayList<>());
			}
			threadIdToFileListMap.get(threadCounter).add(f);
			threadCounter += 1;
		}
		System.out.println("INFO : File(s) distribution completed.");
	}

	public void init(String inputLoc, String outputLoc, String configLoc) {
		long start_time = System.nanoTime();
		fileList = new ArrayList<>();
		System.out.println("INFO : Collecting cell trace file list.");
		Utils.collectFiles(inputLoc, fileList);

		/*
		 * "A20220328.1200-1215_SubNetwork=NETSimW,ManagedElement=NR120gNodeBRadio00040_celltracefile_CUUP"
		 * String s = ""; for (String f : fileList) { if (f.contains(
		 * "A20220328.1200-1215_SubNetwork=NETSimW,ManagedElement=NR120gNodeBRadio00040_celltracefile_DU"
		 * )) { s = f; break; } } fileList.clear(); fileList.add(s);
		 */

		System.out.println("INFO : File collection completed.");
		if (fileList.size() > 0) {
			if (loadJsonConfigInformation(configLoc)) {
				distributeFileList();
				parseAndProcessCellTraceInformation(outputLoc);
				System.out.println("INFO : Process completed.");
			}
		} else {
			System.out.println("ERROR : No cell trace files present to process on input location.");
		}
		long end_time = System.nanoTime();
		System.out.println("Total time taken : " + ((end_time - start_time)/1000000));
	}

	public static Map<String, Map<String, Map<String, String>>> getEtcmConditionMap() {
		return etcmConditionMap;
	}

	public static Map<String, List<String>> getEtcmEventToCounterMap() {
		return etcmEventToCounterMap;
	}

	public static List<String> getFileList() {
		return fileList;
	}

	// New Code Start
	public static Map<String, Map<String, Map<String, CompiledScript>>> getEngineMap() {
		return engineMap;
	}
	// New Code End

}
