package com.ericsson.tcs.data.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.data.parser.wrapper.NodeModel;

public class InputParser {

	private int threadInstance = Runtime.getRuntime().availableProcessors() - 1;

	private static Map<String, List<File>> inputFileMap = new HashMap<>();

	private static List<NodeModel> nodeInfoList = Collections.synchronizedList(new ArrayList<>());

	private Map<Integer, List<String>> nodesToThreadMap = new HashMap<>();

	private List<Thread> threadProcesses = new ArrayList<>();

	private String outputLocation;

	public void init(String inputLocation, String outputLocation) {
		this.outputLocation = outputLocation;
		generateNodeToFilesMapping(inputLocation);
	}

	public void generateNodeToFilesMapping(String inputLocation) {
		File inputPath = new File(inputLocation);
		if (inputPath.exists() && inputPath.isDirectory()) {
			for (File nfDir : inputPath.listFiles()) {
				if (nfDir.isDirectory()) {
					for (File inputFile : nfDir.listFiles()) {
						if (inputFile.getName().endsWith(ConstantParameter.GZ_EXT)
								|| inputFile.getName().endsWith(ConstantParameter.GPB_EXT)) {
							String fullFdn = Utils.getFdnWithAllDetails(inputFile.getName());
							if (!inputFileMap.containsKey(fullFdn)) {
								inputFileMap.put(fullFdn, new ArrayList<File>());
							}
							inputFileMap.get(fullFdn).add(inputFile);
						}
					}
				}
			}
			if (!inputFileMap.isEmpty()) {
				distributeNodesToThread();
				callWorkers();
			} else {
				System.out.println("ERROR: No appropriate files found to process at location " + inputLocation + ".");
			}
		} else {
			System.out.println(
					"ERROR: Provided input location " + inputLocation + " is not a directory or does not exists.");
		}
	}

	public void distributeNodesToThread() {
		if (inputFileMap.keySet().size() < threadInstance) {
			threadInstance = inputFileMap.keySet().size();
		}
		
		int threadCounter = 0;
		for (String fdn : inputFileMap.keySet()) {
			// System.out.println("FDN_NAME : " + fdn);
			// System.out.println("FILE COUNT : " + inputFileMap.get(fdn).size());
			if (threadCounter >= threadInstance) {
				threadCounter = 0;
			}
			if (!nodesToThreadMap.containsKey(threadCounter)) {
				nodesToThreadMap.put(threadCounter, new ArrayList<String>());
			}
			nodesToThreadMap.get(threadCounter).add(fdn);
			threadCounter++;
		}
	}

	public void callWorkers() {
		try {
			for (int threadId : nodesToThreadMap.keySet()) {
				InputFileParserWorker inputFileWorker = new InputFileParserWorker(nodesToThreadMap.get(threadId));
				Thread t = new Thread(inputFileWorker);
				threadProcesses.add(t);
				t.start();
			}
			while (!threadProcesses.isEmpty()) {
				for (Thread t : threadProcesses) {
					while (t.isAlive()) {
						Thread.sleep(500);
					}
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("ERROR: Issue while invoking file parser worker threads.");
			e.printStackTrace();
		}
		Utils.convertObjectToJson(nodeInfoList, ConstantParameter.INPUT_NODE_INFO_JSON, outputLocation);
	}

	public static Map<String, List<File>> getInputFileMap() {
		return inputFileMap;
	}

	public static List<NodeModel> getNodeInfoList() {
		return nodeInfoList;
	}

	public static void setNodeInfoList(List<NodeModel> nodeInfoList) {
		InputParser.nodeInfoList = nodeInfoList;
	}

	public static void main(String[] args) {
		new InputParser().init("Z:\\xjaimah\\latest_code\\inter", "Z:\\xjaimah\\latest_code");
		System.out.println("Completed");
	}
}
