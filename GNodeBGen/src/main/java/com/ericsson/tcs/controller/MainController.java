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
package com.ericsson.tcs.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.tcs.analysis.service.Analysis;
import com.ericsson.tcs.config.wrapper.UserConfig;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.counter.validator.CounterValidatorInitiator;
import com.ericsson.tcs.data.parser.InputParser;
import com.ericsson.tcs.enrichment.EnrichConfigParser;
import com.ericsson.tcs.enrichment.EnrichmentWrapper;
import com.ericsson.tcs.network.upversion.NetworkUpversionService;
import com.ericsson.tcs.processor.FileProcessor;
import com.ericsson.tcs.services.wrapper.FileInfoWrapper;
import com.ericsson.tcs.topology.wrapper.NodeWrapper;
import com.ericsson.tcs.utility.DataCorrectionService;
import com.ericsson.tcs.utility.ObfuscationService;
import com.ericsson.tcs.utility.SessionIdentifierService;
import com.ericsson.tcs.utility.asn1.decoder.service.Asn1Main;
import com.ericsson.tcs.utility.event.alteration.EventAdditionService;
import com.ericsson.tcs.utility.event.alteration.EventDeletion;
import com.ericsson.tcs.utility.noise.NoiseFileGenerator;
import com.ericsson.tcs.utility.noise.NoiseServiceInitializer;
import com.ericsson.tcs.utility.noise.random.generator.RandomValuesGenerator;
import com.ericsson.tcs.utility.profiler.EventAdjustment;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class MainController implements ConstantParameter {

	private static Map<String, Map<String, List<String>>> ropWiseFile;

	private static Map<String, List<NodeWrapper>> nodeToCellMap;

	private static Map<String, Map<Long, Long>> nciMapForSession;

	private static int epsPerNetworkFunction;

	private static List<Thread> processThread;

	public static int updateCount;

	public static UserConfig config;

	private static EnrichmentWrapper enrichValues;

	/*
	 * String Array[0] : Object_as_a_json_string, String Array[1] :
	 * Rop_To_Be_Process_Seprated_Space String Array[2] : Total_No_Of_ROP_Count
	 */
	public static void main(String[] inputParameters) {
		if (inputParameters[0].equalsIgnoreCase("analysis")) {
			new Analysis().init(inputParameters[1], inputParameters[2]);
		} else if (inputParameters[0].equalsIgnoreCase("obfuscation")) {
			new ObfuscationService().init(inputParameters[1].trim(), inputParameters[2].trim());
		} else if (inputParameters[0].equalsIgnoreCase("nciCorrection")) {
			new DataCorrectionService().init(inputParameters[1].trim(), inputParameters[2].trim());
		} else if (inputParameters[0].equalsIgnoreCase("inputdataparser")) {
			new InputParser().init(inputParameters[1].trim(), inputParameters[2].trim());
		} else if (inputParameters[0].equalsIgnoreCase("sessionFinder")) {
			new SessionIdentifierService().init(inputParameters);
		} else if (inputParameters[0].equalsIgnoreCase("decodeAsnMessage")) {
			// args : 1 : asnParamConfig.csv, 2 : output location
			new Asn1Main().init(inputParameters[1], inputParameters[2]);
		} else if (inputParameters[0].equalsIgnoreCase("NoiseAddition")) {
			// NOTE : THIS FRAMEWORK IS ONLY APPLICABLE TO COMPRESSED (GZ) FILES.
			// Handling for Noise Addition Utility with OPTIONAL support for File Open/Close
			// events.
			// Args : NoiseAddition, Input Location, Output Location, Cucp Size (KB), Du
			// Size (KB), Cuup Size (KB), File Delta (int, KB), NoiseFileLocation
			new NoiseServiceInitializer(inputParameters[1], inputParameters[2], inputParameters[3], inputParameters[4],
					inputParameters[5], inputParameters[6], inputParameters[7]);
		} else if (inputParameters[0].equalsIgnoreCase("GenerateNoiseFiles")) {
			// args : mainNoiseFileWithPath, outputLocation, maxSize (KB)
			// /xmanabh/11_mb.gz /xmanabh/output 2000
			new NoiseFileGenerator(inputParameters[1], inputParameters[2], inputParameters[3]);
		} else if (inputParameters[0].equalsIgnoreCase("EventAdjustment")) {
			new EventAdjustment().init(Integer.parseInt(inputParameters[1]), Integer.parseInt(inputParameters[2]),
					Integer.parseInt(inputParameters[3]), inputParameters[4], inputParameters[5], inputParameters[6],
					Integer.parseInt(inputParameters[7]), inputParameters[8], inputParameters[9]);
			// args : EventAdjustment, total_cucp_evt, total_cuup_evt, total_du_evt,
			// cucp_port, cuup_port, du_port,
			// total_rop, input_loc, out_loc
		} else if (inputParameters[0].equalsIgnoreCase("NoiseAlteration")) {
			new RandomValuesGenerator(inputParameters[1], inputParameters[2], inputParameters[3]);
			// args : NoiseAlteration, full input file path, setSystemUuid (YES/NO),
			// sizeOfSystemUuid
		} else if (inputParameters[0].equalsIgnoreCase("CounterValidator")) {
			new CounterValidatorInitiator().init(inputParameters[1], inputParameters[2], inputParameters[3]);
			// args : CounterValidator, inputFileLocation, OutputLocation,
			// configFileLocation
		} else if (inputParameters[0].equalsIgnoreCase("EventDeletion")) {
			new EventDeletion().init(inputParameters[1], inputParameters[2], inputParameters[3]);
			// args : EventDeletion, event_ids_comma_sep, input_loc, output_loc
			// example : EventDeletion 3001,3002 path/xyz path/abc
		} else if (inputParameters[0].equalsIgnoreCase("EventAddition")) {
			new EventAdditionService().init(inputParameters[1], inputParameters[2], inputParameters[3]);
			// args : EventAddition input_loc output_loc json_config
		} else {
			// GSON object to parse JSON input args
			Gson js = new Gson();
			config = js.fromJson(inputParameters[0], UserConfig.class);
			config.setRopList(Arrays.asList(inputParameters[1].split(",")));
			config.setTotalRop(inputParameters[2]);
			String baseDirectory = inputParameters[3];
			MainController main = new MainController();
			if (config.isEventParamEnrichment()) {
				enrichValues = new EnrichConfigParser().init(baseDirectory + File.separator + ENRICHMENT_FILE_PATH);
			}
			if (config.isNetworkUpversionRequire()) {
				new NetworkUpversionService().init();
				return;
			}
			if (config.getIsTopologyEnrichment().equalsIgnoreCase("YES")) {
				main.parseTopologyJson(js, baseDirectory);
			}
			epsPerNetworkFunction = (int) Math
					.ceil(((double) config.getRequiredEPS()) / (config.getNetworkFunctionList().size()));
			main.processDataSource();
		}
	}

	@SuppressWarnings("unchecked")
	public void parseTopologyJson(Gson js, String parentLocation) {
		try {
			File nodeTopologyFile = null;
			File inputFileToTopoMappingFile = null;
			File nciMappingFile = null;

			if (Utils.detectOS().equals(ConstantParameter.WINDOWS)) {
				nodeTopologyFile = new File(
						parentLocation + File.separator + "src" + File.separator + "main" + File.separator + "resources"
								+ File.separator + "config" + File.separator + "enriched_node_info.json");
				inputFileToTopoMappingFile = new File(
						parentLocation + File.separator + "src" + File.separator + "main" + File.separator + "resources"
								+ File.separator + "config" + File.separator + "inputFileToTopologyMapping.json");
				nciMappingFile = new File(
						parentLocation + File.separator + "src" + File.separator + "main" + File.separator + "resources"
								+ File.separator + "config" + File.separator + "nci_mapping.json");
			} else if (Utils.detectOS().equals(ConstantParameter.LINUX)) {
				nodeTopologyFile = new File(
						parentLocation + File.separator + "config" + File.separator + "enriched_node_info.json");
				inputFileToTopoMappingFile = new File(parentLocation + File.separator + "config" + File.separator
						+ "inputFileToTopologyMapping.json");
				nciMappingFile = new File(
						parentLocation + File.separator + "config" + File.separator + "nci_mapping.json");
			} else {
				System.out.println("ERROR : Application only supported for Linux & Windows.");
				System.exit(1);
			}

			if (nodeTopologyFile.exists() && inputFileToTopoMappingFile.exists()) {

				if (config.isAsr_specific_run()) {
					if (nciMappingFile.exists() && nciMappingFile.isFile()) {
						Gson gson = new Gson();
						FileReader reader = new FileReader(nciMappingFile);
						BufferedReader bufReader = new BufferedReader(reader);
						Map<String, Map<String, String>> tempMap = gson.fromJson(bufReader, Map.class);
						nciMapForSession = new HashMap<String, Map<Long, Long>>();
						for (String topoFdnKey : tempMap.keySet()) {
							if (!nciMapForSession.containsKey(topoFdnKey)) {
								nciMapForSession.put(topoFdnKey, new HashMap<Long, Long>());
							}
							for (String inputNciKeyStr : tempMap.get(topoFdnKey).keySet()) {
								Long inputNciKey = new Long(Long.parseLong(inputNciKeyStr));
								Long topoNciValue = new Long(
										Long.parseLong(tempMap.get(topoFdnKey).get(inputNciKeyStr)));
								nciMapForSession.get(topoFdnKey).put(inputNciKey, topoNciValue);
							}
						}
						bufReader.close();
						reader.close();
					} else {
						System.out.println(
								"ERROR : File " + nciMappingFile.getAbsolutePath() + " does not exists or not a file.");
						System.exit(1);
					}
				}

				JsonReader nodeTopologyJReader = new JsonReader(new FileReader(nodeTopologyFile));
				JsonReader inputToTopoMappingJReader = new JsonReader(new FileReader(inputFileToTopoMappingFile));

				Type nodeTopoCollectionType = new TypeToken<List<NodeWrapper>>() {
				}.getType();
				List<NodeWrapper> nodeDataStore = js.fromJson(nodeTopologyJReader, nodeTopoCollectionType);

				Type inputToTopoMapCollectionType = new TypeToken<Map<String, Map<String, List<String>>>>() {
				}.getType();
				Map<String, Map<String, List<String>>> inputToTopoMapDataStore = js.fromJson(inputToTopoMappingJReader,
						inputToTopoMapCollectionType);

				corelateInputFileWithTopology(nodeDataStore, inputToTopoMapDataStore.get(config.getData_source_name()));

			} else {
				System.out.println("ERROR : Either Json File " + nodeTopologyFile.getAbsolutePath()
						+ " not available or " + inputFileToTopoMappingFile.getAbsolutePath() + " not available.");
				System.exit(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}

	public void corelateInputFileWithTopology(List<NodeWrapper> nodeTopoStore,
			Map<String, List<String>> inputFileToTopoMapStore) {

		String simId = (config.getData_source_name().split("-")[config.getData_source_name().split("-").length - 1])
				.trim();

		nodeToCellMap = new HashMap<>();

		for (String inputFilefdn : inputFileToTopoMapStore.keySet()) {

			// Init NodeWrapper List mapped with each inputFile
			nodeToCellMap.put(inputFilefdn, new ArrayList<NodeWrapper>());

			boolean isAnyTopologyMatched = false;

			for (String topoFdn : inputFileToTopoMapStore.get(inputFilefdn)) {

				if (!config.isStreaming()) {
					if (!topoFdn.startsWith(simId)) {
						continue;
					} else {
						isAnyTopologyMatched = true;
					}

				}

				// Finding node object associated with topology FDN to map node
				// object with input file.
				for (NodeWrapper nodeObject : nodeTopoStore) {
					if (nodeObject.get__managedElement().equals(topoFdn)) {
						nodeToCellMap.get(inputFilefdn).add(nodeObject);
						break;
					}
				}
			}

			if (!isAnyTopologyMatched) {
				if (!config.isStreaming()) {
					System.out.println("WARNING : No matching topology FDN found with data source sim id " + simId);
				}
			}

		}
	}

	public void processDataSource() {
		final Set<String> uniqueRopSet = new HashSet<>(config.getRopList());
		List<String> nfDirs = Arrays.asList(new File(config.getInput_location()).list());
		ropWiseFile = new HashMap<String, Map<String, List<String>>>();

		for (String confNetworkFn : config.getNetworkFunctionList()) {
			for (String nfDir : nfDirs) {
				if (nfDir.equalsIgnoreCase(confNetworkFn)) {
					File inputNfFolder = new File(config.getInput_location() + File.separator + nfDir);
					for (String nfFile : inputNfFolder.list()) {
						if (nfFile.endsWith(".gpb") || nfFile.endsWith(".gz")) {
							String inFileRopTime = nfFile.substring(0, 14);
							if (uniqueRopSet.contains(inFileRopTime)) {
								if (!ropWiseFile.containsKey(inFileRopTime)) {
									ropWiseFile.put(inFileRopTime, new HashMap<String, List<String>>());
									ropWiseFile.get(inFileRopTime).put(nfDir, new ArrayList<String>());
								} else if (!ropWiseFile.get(inFileRopTime).containsKey(nfDir)) {
									ropWiseFile.get(inFileRopTime).put(nfDir, new ArrayList<String>());
								}
								ropWiseFile.get(inFileRopTime).get(nfDir).add(nfFile);
							}
						}
					}
				}
			}
		}

		// distributeInputFilesPerThread(ropWiseFileDistribution());

		distributeInputFilesPerThreadNewImplementation(ropWiseFileDistribution());

	}

	public Map<String, String> ropWiseFileDistribution() {
		Map<String, String> newToOldRopTimeMap = new HashMap<String, String>();
		for (int ropIndex = 0; ropIndex < config.getNew_rop_generation_time().size(); ropIndex++) {
			newToOldRopTimeMap.put(config.getNew_rop_generation_time().get(ropIndex),
					config.getRopList().get(ropIndex).substring(0, 14));
		}
		return newToOldRopTimeMap;
	}

	private static void distributeInputFilesPerThreadNewImplementation(Map<String, String> newToOldRopMap) {
		try {
			int threadCount = config.getMain_file_processor_thread();
			String fileNameCommonPattern = config.getFileNamePattern() + ".gpb";

			List<FileInfoWrapper> fileInfoList = new ArrayList<>();
			Map<Integer, List<FileInfoWrapper>> filesPerThreadMap = new HashMap<>();
			processThread = new ArrayList<>();

			for (String newRopTime : newToOldRopMap.keySet()) {

				long newStartEpochTime = Utils.convertStringToDate(newRopTime);
				String newRopEndTimeInSeconds = Utils
						.convertStringToDateWithTimeZone(((newStartEpochTime) / 1000L) + 900L, config.getTimeFormat())
						.split("\\.")[1];
				String interFileNamePattern = fileNameCommonPattern.replace("{REPLACE_START_DATE_TIME}", newRopTime)
						.replace("{REPLACE_END_TIME}", newRopEndTimeInSeconds);

				String oldRopTime = newToOldRopMap.get(newRopTime);

				for (String nfDir : ropWiseFile.get(oldRopTime).keySet()) {

					String interFilePath = Utils.createDirectory(newRopTime, nfDir);

					for (String file : ropWiseFile.get(oldRopTime).get(nfDir)) {
						FileInfoWrapper fWrapper = new FileInfoWrapper(file, nfDir, interFilePath, newStartEpochTime,
								interFileNamePattern);
						fileInfoList.add(fWrapper);
					}
				}
			}

			if (threadCount > fileInfoList.size()) {
				threadCount = fileInfoList.size();
			}

			int threadCounter = 0;

			for (int fileIndex = 0; fileIndex < fileInfoList.size(); fileIndex++) {
				if (threadCounter >= threadCount) {
					threadCounter = 0;
				}
				if (!filesPerThreadMap.containsKey(threadCounter)) {
					filesPerThreadMap.put(threadCounter, new ArrayList<FileInfoWrapper>());
				}
				filesPerThreadMap.get(threadCounter).add(fileInfoList.get(fileIndex));

				threadCounter++;
			}

			for (int threadId = 0; threadId < threadCount; threadId++) {
				FileProcessor fileProcessor = new FileProcessor();
				fileProcessor.setConfig(config);
				fileProcessor.setFileInfoWrapperList(filesPerThreadMap.get(threadId));

				Thread t = new Thread(fileProcessor);
				processThread.add(t);
				t.start();
			}

			while (!processThread.isEmpty()) {
				for (Thread t : processThread) {
					while (t.isAlive()) {
						Thread.sleep(250);
					}
				}
				break;
			}

		} catch (Exception x) {
			System.out.println("ERROR : Issue with distributing files to file processor thread.");
			x.printStackTrace();
			System.exit(1);
		}
	}

	/**
	 * @return the nodeToCellMap
	 */
	public static Map<String, List<NodeWrapper>> getNodeToCellMap() {
		return nodeToCellMap;
	}

	/**
	 * @return the epsPerNetworkFunction
	 */
	public static int getEpsPerNetworkFunction() {
		return epsPerNetworkFunction;
	}

	public static Map<String, Map<Long, Long>> getNciMapForSession() {
		return nciMapForSession;
	}

	/**
	 * @return the enrichValues
	 */
	public static EnrichmentWrapper getEnrichValues() {
		if (null == enrichValues) {
			enrichValues = new EnrichmentWrapper();
		}
		return enrichValues;
	}

}
