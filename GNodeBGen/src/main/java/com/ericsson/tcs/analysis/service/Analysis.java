package com.ericsson.tcs.analysis.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

import com.ericsson.tcs.analysis.wrapper.AnalysisModel;
import com.ericsson.tcs.constant.Utils;

/**
 * @author xjaimah
 */
public class Analysis {

	/**
	 * The DecimalFormat
	 */
	private static DecimalFormat df2 = new DecimalFormat("#.######");

	/**
	 * The feederQueue
	 */
	private BlockingQueue<String> feederQueue;

	/**
	 * The inputFilesPath
	 */
	private List<String> inputFilesPath;

	/**
	 * The callBackResults
	 */
	private List<Future<List<AnalysisModel>>> callBackResults;

	/**
	 * The processInstances
	 */
	private int processInstances;

	/**
	 * The totalEvents
	 */
	private long totalEvents;

	/**
	 * The totalNodes
	 */
	private int totalNodes;

	/**
	 * The nodeWiseEventDetaisl
	 */
	private Map<Object, AnalysisModel> nodeWiseEventDetails;

	/**
	 * The output path
	 */
	private String outputPath;

	/**
	 * The total_nci
	 */
	private int totalNci;

	/**
	 * The eventSize
	 */
	private long eventSize;

	/**
	 * The eventId
	 */
	private long eventId;

	/**
	 * The maxEventSize
	 */
	private long maxEventSize;

	/**
	 * Parameters initialization method
	 *
	 * @param inputpath  inputParameters[0] = input location
	 * @param outputPath inputParameters[1] = output location
	 */
	public void init(String inputpath, String outputPath) {
		processInstances = Runtime.getRuntime().availableProcessors();
		inputFilesPath = new ArrayList<>();
		collectAllFiles(inputpath.trim());
		this.outputPath = outputPath.trim();
		if (inputFilesPath.size() < processInstances) {
			processInstances = inputFilesPath.size();
		}
		feederQueue = new ArrayBlockingQueue<>(inputFilesPath.size());
		setFeederQueue();
		generateReport();
	}

	/**
	 * This method will integrate all threads and generate report.
	 */
	private void generateReport() {
		nodeWiseIntegrateData();
		getNetworkInfo();
		System.out.println("Process completed successfully, verify the event distribution file at location : "
				+ outputPath + "" + File.separator + "eventDistribution.txt");
	}

	/**
	 * This method will integrate nodes events details which are distributed in
	 * threads.
	 */
	private void nodeWiseIntegrateData() {
		nodeWiseEventDetails = new HashMap<>();
		for (Future<List<AnalysisModel>> future : callBackResults) {
			try {
				for (AnalysisModel eventInfo : future.get()) {
					eventSize += eventInfo.getTotalEventSize();
					totalEvents += eventInfo.getTotalEvents();
					if (maxEventSize < eventInfo.getMaxEventSize()) {
						eventId = eventInfo.getMaxEventSizeId();
						maxEventSize = eventInfo.getMaxEventSize();
					}
					if (!nodeWiseEventDetails.containsKey(eventInfo.getNodeId())) {
						nodeWiseEventDetails.put(eventInfo.getNodeId(), eventInfo);
					} else {
						// New code starts here
						nodeWiseEventDetails.get(eventInfo.getNodeId()).getRop_time().addAll(eventInfo.getRop_time());
						// New code ends here
						nodeWiseEventDetails.get(eventInfo.getNodeId()).getNci_values()
								.addAll(eventInfo.getNci_values());
						for (Long event : eventInfo.getEventWiseCount().keySet()) {
							if (nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventWiseCount()
									.containsKey(event)) {
								int tempCount = nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventWiseCount()
										.get(event) + eventInfo.getEventWiseCount().get(event);
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventWiseCount().put(event,
										tempCount);

								if (nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap()
										.get(event)[0] > eventInfo.getEventIdToSizesMap().get(event)[0]) {
									nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap()
											.get(event)[0] = eventInfo.getEventIdToSizesMap().get(event)[0];
								}
								if (nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap()
										.get(event)[1] < eventInfo.getEventIdToSizesMap().get(event)[1]) {
									nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap()
											.get(event)[1] = eventInfo.getEventIdToSizesMap().get(event)[1];
								}
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap()
										.get(event)[2] += eventInfo.getEventIdToSizesMap().get(event)[2];

							} else {
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventWiseCount().put(event,
										eventInfo.getEventWiseCount().get(event));
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToNameMap().put(event,
										eventInfo.getEventIdToNameMap().get(event));
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToNfMap().put(event,
										eventInfo.getEventIdToNfMap().get(event));
								nodeWiseEventDetails.get(eventInfo.getNodeId()).getEventIdToSizesMap().put(event,
										eventInfo.getEventIdToSizesMap().get(event));
							}
						}
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception occurred while integrating similar nodes events.");
			}
		}
		totalNodes = nodeWiseEventDetails.size();
	}

	/**
	 * integrate all threads data.
	 */
	private void getNetworkInfo() {
		Map<Long, Integer> eventCountMap = new HashMap<>();
		Map<Long, String> eventIdToNameMap = new HashMap<>();
		Map<Long, String> eventIdToNfMap = new HashMap<>();
		Map<Long, long[]> eventIdToSizesMap = new HashMap<>();
		Map<Integer, Integer> cellCountRatioMap = new HashMap<>();
		int maxCellsInNode = 0;
		int minCellsInNode = 0;
		Object gnbIdToMaxCell = 0;
		Object gnbIdToMinCell = 0;

		for (AnalysisModel eventInfo : nodeWiseEventDetails.values()) {
			int nciInNode = eventInfo.getNci_values().size();
			if (!cellCountRatioMap.containsKey(nciInNode)) {
				cellCountRatioMap.put(nciInNode, 1);
			} else {
				cellCountRatioMap.put(nciInNode, cellCountRatioMap.get(nciInNode) + 1);
			}
			totalNci += nciInNode;
			if (eventInfo.getNci_values().size() >= maxCellsInNode) {
				if (maxCellsInNode == 0) {
					minCellsInNode = eventInfo.getNci_values().size();
					gnbIdToMinCell = eventInfo.getNodeId();
				}
				maxCellsInNode = eventInfo.getNci_values().size();
				gnbIdToMaxCell = eventInfo.getNodeId();
			}
			if (eventInfo.getNci_values().size() < minCellsInNode) {
				minCellsInNode = eventInfo.getNci_values().size();
				gnbIdToMinCell = eventInfo.getNodeId();
			}

			for (Long event : eventInfo.getEventWiseCount().keySet()) {
				if (eventCountMap.isEmpty()) {
					eventCountMap.putAll(eventInfo.getEventWiseCount());
					eventIdToNameMap.putAll(eventInfo.getEventIdToNameMap());
					eventIdToNfMap.putAll(eventInfo.getEventIdToNfMap());
					eventIdToSizesMap.putAll(eventInfo.getEventIdToSizesMap());
					break;
				} else {
					if (eventCountMap.containsKey(event)) {
						int temp = eventCountMap.get(event) + eventInfo.getEventWiseCount().get(event);
						eventCountMap.put(event, temp);
						if (eventInfo.getEventIdToSizesMap().get(event)[0] < eventIdToSizesMap.get(event)[0]) {
							eventIdToSizesMap.get(event)[0] = eventInfo.getEventIdToSizesMap().get(event)[0];
						}
						if (eventInfo.getEventIdToSizesMap().get(event)[1] > eventIdToSizesMap.get(event)[1]) {
							eventIdToSizesMap.get(event)[1] = eventInfo.getEventIdToSizesMap().get(event)[1];
						}
						eventIdToSizesMap.get(event)[2] += eventInfo.getEventIdToSizesMap().get(event)[2];
					} else {
						eventCountMap.put(event, eventInfo.getEventWiseCount().get(event));
						eventIdToNameMap.put(event, eventInfo.getEventIdToNameMap().get(event));
						eventIdToNfMap.put(event, eventInfo.getEventIdToNfMap().get(event));
						eventIdToSizesMap.put(event, eventInfo.getEventIdToSizesMap().get(event));
					}
				}
			}
		}
		generateNetworkInfo(eventCountMap, eventIdToNameMap, eventIdToNfMap, maxCellsInNode, gnbIdToMaxCell,
				minCellsInNode, gnbIdToMinCell, eventIdToSizesMap, cellCountRatioMap);
	}

	private String repeatedStringGenerator(int number, String str) {
		String s = "";
		for (int i = 0; i < number; i++) {
			s += str;
		}
		return s;
	}

	private int findInstanceOfRop() {
		Set<String> ropSet = new HashSet<>();
		for (String s : inputFilesPath) {
			ropSet.add(new File(s).getName().split("-")[0]);
		}
		return ropSet.size();
	}

	// New code starts here
	private void generateFdnWiseEventCount() throws IOException {

		Set<String> eventIdSet = new HashSet<String>();
		Map<String, Map<String, Integer>> fdnWiseEventInfo = new HashMap<String, Map<String, Integer>>();
		Map<String, Integer> fdnToTotalEventCount = new HashMap<String, Integer>();
		Map<String, Integer> fdnToRopCount = new HashMap<String, Integer>();
		for (AnalysisModel nodeInfo : nodeWiseEventDetails.values()) {
			String fdn = nodeInfo.getFdn_name();
			fdnToRopCount.put(fdn, nodeInfo.getRop_time().size());
			fdnWiseEventInfo.put(fdn, new HashMap<String, Integer>());
			int eventCount = 0;
			for (long id : nodeInfo.getEventWiseCount().keySet()) {
				String eventIdStr = String.valueOf(id);
				eventIdSet.add(eventIdStr);
				fdnWiseEventInfo.get(fdn).put(eventIdStr, nodeInfo.getEventWiseCount().get(id));
				eventCount += nodeInfo.getEventWiseCount().get(id);
			}
			fdnToTotalEventCount.put(fdn, eventCount);
		}

		FileWriter file = new FileWriter(new File(outputPath + File.separator + "fdnWiseEventIdDistribution.csv"));
		StringBuilder lineInfo = new StringBuilder();
		lineInfo.append("FDN_NAME, ROP_COUNT, TOTAL_EVENTS, EPS");
		for (String id : eventIdSet) {
			lineInfo.append(", " + id);
		}
		file.write(lineInfo + "\n");
		for (String fdn : fdnWiseEventInfo.keySet()) {
			lineInfo = new StringBuilder();
			int ropCount = fdnToRopCount.get(fdn);
			float eps = fdnToTotalEventCount.get(fdn) / (fdnToRopCount.get(fdn) * 900);
			lineInfo.append(fdn + ", " + ropCount + ", " + fdnToTotalEventCount.get(fdn) + ", " + eps);
			for (String id : eventIdSet) {
				if (fdnWiseEventInfo.get(fdn).containsKey(id)) {
					lineInfo.append(", " + fdnWiseEventInfo.get(fdn).get(id));
				} else {
					lineInfo.append(", ");
				}
			}
			file.write(lineInfo + "\n");
		}
		file.close();
	}
	// New code ends here

	/**
	 * This method will generate analysis file with network info
	 *
	 * @param eventCountMap     event id to event count map
	 * @param eventIdToNameMap  event id to event name map
	 * @param eventIdToNfMap    event id to network function map
	 * @param eventIdToSizesMap event id to event sizes map
	 * @param gnbIdToMaxCell    gnbId with Max cells
	 * @param maxCellsInNode    max cells in a gnbId
	 * @param gnbIdToMinCell    gnbId with min cells
	 * @param minCellsInNode    min cell in a gnbId
	 */
	private void generateNetworkInfo(Map<Long, Integer> eventCountMap, Map<Long, String> eventIdToNameMap,
			Map<Long, String> eventIdToNfMap, int maxCellsInNode, Object gnbIdToMaxCell, int minCellsInNode,
			Object gnbIdToMinCell, Map<Long, long[]> eventIdToSizesMap, Map<Integer, Integer> cellCountRatioMap) {
		try {
			FileWriter file = new FileWriter(new File(outputPath + File.separator + "eventDistribution.txt"));
			// Adding white space for justification
			file.write(repeatedStringGenerator(68, " ") + "NR CELL TRACE ANALYSIS\n");
			file.write(repeatedStringGenerator(154, "-") + "\n\n");

			file.write("NODE(S) INFORMATION\n");
			file.write("Nodes in Network : " + totalNodes + "\n");
			for (int cellNum : cellCountRatioMap.keySet()) {
				file.write("Nodes in network with " + cellNum + " cell(s) : " + cellCountRatioMap.get(cellNum) + "\n");
			}
			file.write("\n");

			file.write("CELL(S) INFORMATION\n");
			file.write("Cells in Network : " + totalNci + "\n");
			file.write("Average Cell(s) per Node : " + df2.format((totalNci + 0.00) / totalNodes) + "\n");
			file.write("Max Cell(S) per Node : " + maxCellsInNode + ", having GNodeBId (One of many) : "
					+ gnbIdToMaxCell + "\n");
			file.write("Min Cell(S) per Node : " + minCellsInNode + ", having GNodeBId (One of many) : "
					+ gnbIdToMinCell + "\n");
			file.write("\n");

			file.write("EVENT(S) INFORMATION\n");
			file.write("Event(s) in Network : " + totalEvents + "\n");
			file.write("Total event(s) size in Netwotk : " + eventSize + "\n");
			file.write("Average event size in Network : " + df2.format((eventSize + 0.00) / totalEvents) + "\n");
			file.write("Event ID : " + eventId + " having MAX event size : " + maxEventSize + "\n");
			file.write("\n");

			file.write("EVENTS PER SECOND (EPS) INFORMATION\n");
			file.write("EPS in Network : " + df2.format((totalEvents + 0.00) / (findInstanceOfRop() * 900)) + "\n");
			file.write("EPS per Node : " + df2.format((totalEvents + 0.00) / (findInstanceOfRop() * 900 * totalNodes))
					+ "\n");
			file.write("EPS per Cell : " + df2.format((totalEvents + 0.00) / (findInstanceOfRop() * 900) / totalNci)
					+ "\n");
			file.write("\n");

			file.write("ROP INFORMATION\n");
			file.write("Number of ROP(s) in Network : " + findInstanceOfRop() + "\n");

			file.write("\n\n\n");

			file.write(repeatedStringGenerator(69, " ") + "EVENT(S) DISTRIBUTION\n");
			file.write(repeatedStringGenerator(154, "-") + "\n");
			file.write(String.format("%5s %20s %50s %16s %17s %17s %17s \r\n", "Event ID", "Event Name", "Event Count",
					"Event %", "Min Event Size", "Max Event Size", "Avg Event Size") + "\n");

			Map<String, List<Double>> nfToDistMap = new HashMap<>();
			for (Long id : eventCountMap.keySet()) {
				double percentDist = eventCountMap.get(id) / (totalEvents + 0.00) * 100;
				List<Double> percentDistList = new ArrayList<>();
				percentDistList.add(percentDist);
				if (nfToDistMap.containsKey(eventIdToNfMap.get(id))) {
					nfToDistMap.get(eventIdToNfMap.get(id)).addAll(percentDistList);
				} else {
					nfToDistMap.put(eventIdToNfMap.get(id), percentDistList);
				}
				file.write(String.format("%-10s %-58s %-20s %-15s %-15s %-15s %-17s", id, eventIdToNameMap.get(id),
						eventCountMap.get(id), df2.format(percentDist), df2.format(eventIdToSizesMap.get(id)[0]),
						df2.format(eventIdToSizesMap.get(id)[1]),
						df2.format((eventIdToSizesMap.get(id)[2] + 0.00) / eventCountMap.get(id))) + "\n");
			}

			file.write("\n\n");

			file.write("Event Distrubution across Network Functions (in %) : \n");
			for (String nf : nfToDistMap.keySet()) {
				double distPerNf = calculateElementsSum(nfToDistMap.get(nf));
				file.write(String.format("%-18s %-65s", nf, df2.format(distPerNf)) + "\n");
			}

			file.close();

			// New code starts here
			generateFdnWiseEventCount();
			// New code ends here

		} catch (Exception e) {
			System.out.println("Error Occur while writing event info. " + e.getMessage());
		}
	}

	/**
	 * This method will feeding queue based on queue capacity.
	 */
	private void setFeederQueue() {
		for (String filePath : inputFilesPath) {
			try {
				feederQueue.put(filePath);
			} catch (InterruptedException e) {
				System.out.println("ERROR: Error while feeding files in queue. " + e.getMessage());
			}
		}
		startWorkerThreads();
	}

	/**
	 * This method invoke all the workers threads and invoke queue feeding methods.
	 */
	private void startWorkerThreads() {
		ThreadPoolExecutor threadPoolTaskExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(processInstances);
		callBackResults = new ArrayList<>();
		for (int threadindex = 0; threadindex < processInstances; threadindex++) {
			AnalysisWorker worker = new AnalysisWorker(feederQueue);
			Future<List<AnalysisModel>> callBackResult = threadPoolTaskExecutor.submit(worker);
			callBackResults.add(callBackResult);
		}
		threadPoolTaskExecutor.shutdown();
		while (!threadPoolTaskExecutor.isTerminated()) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("ERROR: Error while closing thread pool instances. " + e.getMessage());
			}
		}
	}

	/**
	 * This method will recursively iterate directories and collect files
	 *
	 * @param directoryName location at where files for analysis will be present
	 */
	private void collectAllFiles(String directoryName) {
		File directory = new File(directoryName);
		List<File> fList = Arrays.asList(directory.listFiles());
		Collections.sort(fList);
		if (null != fList) {
			for (File file : fList) {
				String fileName = file.getName();
				if (Utils.fileFilters(fileName)) {
					inputFilesPath.add(file.getAbsolutePath());
				} else if (file.isDirectory()) {
					collectAllFiles(file.getAbsolutePath());
				}
			}
		}
	}

	/**
	 * This method will return sum of elements of List
	 *
	 * @param list List of double
	 * @return double
	 */
	private double calculateElementsSum(List<Double> list) {
		double sum = 0.00;
		for (Double element : list) {
			sum += element;
		}
		return sum;
	}

}
