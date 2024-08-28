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

package com.ericsson.tcs.processor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent.Builder;
import com.ericsson.tcs.config.wrapper.UserConfig;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.constant.Utils;
import com.ericsson.tcs.controller.MainController;
import com.ericsson.tcs.enrichment.NetworkFunction;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;
import com.ericsson.tcs.topology.wrapper.CellRelationWrapper;
import com.ericsson.tcs.topology.wrapper.CellWrapper;
import com.ericsson.tcs.topology.wrapper.NetworkFunctionWrapper;
import com.ericsson.tcs.topology.wrapper.NodeWrapper;

/**
 * @author xjaimah
 *
 */
public class EventFileUpdater implements ConstantParameter {

	/**
	 *
	 */
	private UserConfig config;

	/**
	 *
	 */
	private File file;

	/**
	 *
	 */
	private long newStartEpochTime;

	/**
	 *
	 */
	private NodeWrapper node;

	private NetworkFunctionWrapper nfWrapper;

	/**
	 *
	 */
	private String dir;

	private String nfDir;

	/**
	 *
	 */
	private String newFileName;

	/**
	 * This service will help to provide gpb services like loading event messages
	 * decode gpb basic parameters
	 */
	private GPBServices gpbService;

	/**
	 * This service will help updating event parameters and header time stamp
	 */
	private EncoderService encoder;

	/**
	 * This Object will help to decode value and fetch event parameters.
	 */
	private DecoderService decoder;

	/**
	 * This map will contain event header attribute name as a key and value of that
	 * attribute as an object,Value will be update inside header message.
	 */
	private Map<String, Object> headerParameterMap;

	/**
	 * This map will contain event attribute name as a key and value of that
	 * attribute as an object, Value will be update inside event (PayLoad) message.
	 */
	private Map<String, Object> eventParameterMap;

	/**
	 * This service is use to fetch data from the files.
	 */
	private FileReader fileParser;

	private Random ranNumber = new Random();

	private String linkval;

	public Map<Long, Map<Integer, Integer>> cellRelationIndexMap;

	public boolean isCellHORelAvailable = false;

	/**
	 * @param total_size
	 * @param requiredEventPerSecond
	 * @param recordList             This method will be executed when, Input file
	 *                               has more events than total required events.
	 */
	private void processEventOne(int total_size, int requiredEventPerSecond, int total_required_events,
			List<byte[]> recordList) {

		Map<Integer, List<byte[]>> perSecondEvents = new HashMap<>();
		Map<Integer, byte[]> lenReference = new HashMap<>();

		List<byte[]> final_event_list = recordList.subList(0, total_required_events);

		int totalSecondsInRop = 60 * config.getRop_period();

		int eventCounter = 0;

		for (int second = 0; second < totalSecondsInRop; second++) {
			int lenRef = 0;
			for (int i = 0; i < requiredEventPerSecond; i++) {
				if (!perSecondEvents.containsKey(second)) {
					perSecondEvents.put(second, new ArrayList<byte[]>());
				}
				perSecondEvents.get(second).add(final_event_list.get(eventCounter));
				lenRef = lenRef + final_event_list.get(eventCounter).length;
				eventCounter++;
			}
			byte[] b = new byte[8];
			ByteBuffer.wrap(b).putLong(lenRef);
			byte[] bytes = Arrays.copyOfRange(b, 4, 8);
			lenReference.put(second, bytes);
		}

		writeStreamInformation(perSecondEvents, lenReference, false, dir + File.separator + newFileName);
	}

	/**
	 * @param total_size
	 * @param requiredEventPerSecond
	 * @param recordList             This method will be executed when total events
	 *                               present in input file is less than number of
	 *                               required events needs to be generated.
	 */
	private void processEventTwo(int total_size, int requiredEventPerSecond, List<byte[]> recordList) {

		Map<Integer, List<byte[]>> perSecondEvents = new HashMap<>();
		Map<Integer, byte[]> lenReference = new HashMap<>();

		int totalSecondsInRop = config.getRop_period() * 60;

		int inputEventCounter = 0;

		for (int second = totalSecondsInRop; second > 0; second--) {
			int lenRef = 0;
			int tempSecond = (second - totalSecondsInRop) * -1;

			int maxNumOfEventsCanbeUsed = total_size / second; // 2.22
			int parentRemainder = total_size % second;
			if (parentRemainder > 0) {
				maxNumOfEventsCanbeUsed++; // 3
			}
			total_size = total_size - maxNumOfEventsCanbeUsed; // 2000 - 3 = 1997

			int tempRequiredEventsPerSecond = requiredEventPerSecond;

			for (int j = 0; j < requiredEventPerSecond; j++) {
				int mod = tempRequiredEventsPerSecond / maxNumOfEventsCanbeUsed;
				int remainder = tempRequiredEventsPerSecond % maxNumOfEventsCanbeUsed;
				if (remainder > 0) {
					mod++;
				}
				tempRequiredEventsPerSecond = tempRequiredEventsPerSecond - mod;
				maxNumOfEventsCanbeUsed--;
				for (int i = 0; i < mod; i++) {
					if (!perSecondEvents.containsKey(tempSecond)) {
						perSecondEvents.put(tempSecond, new ArrayList<byte[]>());
					}
					perSecondEvents.get(tempSecond).add(recordList.get(inputEventCounter));
					lenRef = lenRef + recordList.get(inputEventCounter).length;
					j++;
				}
				inputEventCounter++;
			}
			byte[] b = new byte[8];
			ByteBuffer.wrap(b).putLong(lenRef);
			byte[] bytes = Arrays.copyOfRange(b, 4, 8);
			lenReference.put(tempSecond, bytes);
		}

		writeStreamInformation(perSecondEvents, lenReference, false, dir + File.separator + newFileName);

	}

	/**
	 * This method introduced for Stream Based play back (without extrapolation)
	 * This method distribute total input file records/event over a rop duration.
	 *
	 * @param : total_records (int) : count of total records fetched from input file
	 * @param : records (List<byte[]>) : List of byte array, each records defined as
	 *          seperate byte array
	 */
	private void distributeEventRecordsForPlayBack(int total_records, List<byte[]> records) {

		Map<Integer, List<byte[]>> listOfEventsPerSecond = new HashMap<>();
		Map<Integer, byte[]> perSecondEventsLenRefMap = new HashMap<>();

		int ropTimeInSeconds = config.getRop_period() * 60;

		int eventCounter = 0;

		for (int second = ropTimeInSeconds; second > 0; second--) {
			int lenRef = 0;
			int tempSecond = (second - ropTimeInSeconds) * -1;
			int eventsToTake = total_records / second;
			int remainder = total_records % second;
			if (remainder > 0) {
				eventsToTake++;
			}
			total_records = total_records - eventsToTake;
			for (int i = 0; i < eventsToTake; i++) {
				if (!listOfEventsPerSecond.containsKey(tempSecond)) {
					listOfEventsPerSecond.put(tempSecond, new ArrayList<byte[]>());
				}
				listOfEventsPerSecond.get(tempSecond).add(records.get(eventCounter));
				lenRef = lenRef + records.get(eventCounter).length;
				eventCounter++;
			}

			byte[] b = new byte[8];
			ByteBuffer.wrap(b).putLong(lenRef);
			byte[] bytes = Arrays.copyOfRange(b, 4, 8);
			perSecondEventsLenRefMap.put(tempSecond, bytes);

			if (total_records <= 0) {
				break;
			}
		}

		writeStreamInformation(listOfEventsPerSecond, perSecondEventsLenRefMap, false,
				dir + File.separator + newFileName);
	}

	/**
	 * @param recordList
	 */
	private void generateEventRecords(List<byte[]> recordList) {
		int total_size = recordList.size(); // total number of events present in input file.
		int requiredEventPerSecond = MainController.getEpsPerNetworkFunction();
		// total_required_events
		int total_required_events = requiredEventPerSecond * config.getRop_period() * 60;

		if (total_required_events == 0 || total_size == total_required_events) {
			// Streaming Play Back
			distributeEventRecordsForPlayBack(total_size, recordList);
		} else {
			if (total_size > total_required_events) {
				// When input file has more events than required.
				processEventOne(total_size, requiredEventPerSecond, total_required_events, recordList);
			} else {
				// When input file has less events than required.
				processEventTwo(total_size, requiredEventPerSecond, recordList);
			}
		}
	}

	/**
	 * This method is use to read binary file and update the necessary parameters
	 * like time stamp, gnodeBID etc
	 *
	 * @param binaryFile
	 * @param new_start_epoch_time_mills
	 * @return
	 */
	private List<byte[]> processFile(File binaryFile, long new_start_epoch_time_mills) {
		// This method reads input events from given input file.
		try {
			List<byte[]> eventsList = fileParser.getFileEventList(binaryFile);
			updateConstantEventParameterMap();
			try {
				List<byte[]> fileEvents = new ArrayList<byte[]>();
				long fileStartEPochTime = Utils.convertStringToDate(binaryFile.getName().substring(1, 14));
				long deltaTime = new_start_epoch_time_mills - fileStartEPochTime;
				for (byte[] event : eventsList) {
					Map<String, Long> preFetchedParamMap = new HashMap<>();
					Set<String> fetchParamList = new HashSet<String>();
					PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(event);
					PmEvent.Builder pmEventMessageBuilder = pmEventMessage.toBuilder();
					Map<String, Object> specificEventParamMap = new HashMap<String, Object>();
					// If Time stamp update enabled
					if (config.isTimeStampUpdate()) {
						// long latestTimeEvent =
						// decoder.getEventTimeStamp(pmEventMessage) +
						// deltaTime;
						updateHeaderParameterMap(decoder.getEventTimeStamp(pmEventMessage) + deltaTime);
						encoder.encodeHeaderParameters(pmEventMessageBuilder, getHeaderParameterMap());
					}
					if (config.isEventParamEnrichment()) {
						// update header 5 basic parameters i.e. etcm version etc
						updateEventBuilderAndParameterMap(pmEventMessageBuilder, specificEventParamMap);
					}
					if (null != node) {
						if (isCellHORelAvailable
								&& config.getCellHandOverEventIds().contains(pmEventMessage.getEventId())) {
							fetchParamList.add(NCI);
							fetchParamList.add(HOTYPE);
						}
						if (config.isAsr_specific_run()) {
							fetchParamList.add(NCI);
						}
						if (fetchParamList.size() > 0) {
							preFetchedParamMap = encoder.preFetchEventParams(pmEventMessage, fetchParamList);
						}
						updateEventParameterMap(pmEventMessage, preFetchedParamMap);
						specificEventParamMap.putAll(getEventParameterMap());
					}
					if (!specificEventParamMap.isEmpty()) {
						encoder.encodePayLoadMessage(pmEventMessageBuilder, pmEventMessage, specificEventParamMap,
								node);
					}
					fileEvents.add(gpbService.write(pmEventMessageBuilder.build()));
				}
				return fileEvents;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(
						"Exception occured during processing file " + file.getName() + "Error :" + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Exception occured while reading " + file.getName() + "Error :" + e.getMessage());
		}
		return null;
	}

	/**
	 * @param pmEventMessageBuilder
	 */
	private void updateEventBuilderAndParameterMap(Builder pmEventMessageBuilder, Map<String, Object> enrichMap) {
		if (MainController.getEnrichValues().getNf().containsKey(nfDir)) {
			NetworkFunction nf = MainController.getEnrichValues().getNf().get(nfDir);
			pmEventMessageBuilder.setEtcmCorrectionVersion(nf.getEtcm_correction_version());
			pmEventMessageBuilder.setEtcmVersion(nf.getEtcm_version());
			pmEventMessageBuilder.setPmEventCommonVersion(nf.getPm_event_common_version());
			pmEventMessageBuilder.setPmEventCorrectionVersion(nf.getPm_event_correction_version());
			pmEventMessageBuilder.setPmEventGroupVersion(nf.getPm_event_group_version());
		}
		if (MainController.getEnrichValues().getEventSpecificEnrichMent()
				.containsKey(pmEventMessageBuilder.getEventId())) {
			enrichMap.putAll(MainController.getEnrichValues().getEventSpecificEnrichMent()
					.get(pmEventMessageBuilder.getEventId()).getEventSpecificProperties());
		}
	}

	/**
	 * @param eventsMap
	 * @param lengthMap
	 * @param isCounter
	 * @param path
	 */
	private void writeStreamInformation(Map<Integer, List<byte[]>> eventsMap, Map<Integer, byte[]> lengthMap,
			boolean isCounter, String path) {
		FileOutputStream fileOuputStream = null;
		GZIPOutputStream gzOutput = null;
		try {
			int totalSecondsInRop = config.getRop_period() * 60;

			if (config.getIsCompressed().equalsIgnoreCase("YES")) {
				fileOuputStream = new FileOutputStream(path + ConstantParameter.GZ_EXT);
				gzOutput = new GZIPOutputStream(fileOuputStream);

				for (int i = 0; i < totalSecondsInRop; i++) {
					if (eventsMap.containsKey(i)) {
						gzOutput.write(lengthMap.get(i));
						for (byte[] b : eventsMap.get(i)) {
							gzOutput.write(b);
						}
					}
				}
			} else {

				fileOuputStream = new FileOutputStream(path);

				for (int i = 0; i < totalSecondsInRop; i++) {
					if (eventsMap.containsKey(i)) {
						fileOuputStream.write(lengthMap.get(i));
						for (byte[] b : eventsMap.get(i)) {
							fileOuputStream.write(b);
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (gzOutput != null) {
				try {
					gzOutput.flush();
					gzOutput.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fileOuputStream != null) {
				try {
					fileOuputStream.flush();
					fileOuputStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @param data
	 * @param path
	 */
	private void writeGBP(List<byte[]> data, String path) {
		FileOutputStream fileOuputStream = null;
		GZIPOutputStream gzOutput = null;
		try {
			if (config.getIsCompressed().equalsIgnoreCase("YES")) {
				fileOuputStream = new FileOutputStream(path + ConstantParameter.GZ_EXT);
				gzOutput = new GZIPOutputStream(fileOuputStream);
				for (byte[] dt : data) {
					gzOutput.write(dt);
				}
			} else {
				fileOuputStream = new FileOutputStream(path);
				for (byte[] dt : data) {
					fileOuputStream.write(dt);
				}
			}
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

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Runnable#run()
	 */
	public void init() {
		gpbService = new GPBServices();
		encoder = new EncoderService();
		decoder = new DecoderService();
		fileParser = new FileReader();
		List<byte[]> events = processFile(file, newStartEpochTime);
		if (null != events) {
			if (config.isStreaming()) {
				// Streaming logic
				generateEventRecords(events);
			} else {
				// File play back logic
				writeGBP(events, dir + File.separator + newFileName);
			}
		} else {
			System.out.println("Unable to parse " + file.getName() + " or this file is empty.");
		}
	}

	/**
	 * This will update parameters which require to update constantly for all the
	 * events.
	 */
	public void updateConstantEventParameterMap() {
		if (null != node) {

			if (null != nfWrapper.getHandOverCellRelationMap()
					&& !nfWrapper.getHandOverCellRelationMap().keySet().isEmpty() && config.isCellHandOverRequired()) {
				cellRelationIndexMap = new HashMap<>();
				for (Long srcNci : nfWrapper.getHandOverCellRelationMap().keySet()) {
					cellRelationIndexMap.put(srcNci, new HashMap<>());
					for (int ho_type : nfWrapper.getHandOverCellRelationMap().get(srcNci).keySet()) {
						cellRelationIndexMap.get(srcNci).put(ho_type, 0);
					}
				}
				isCellHORelAvailable = true;
			}

			getEventParameterMap().put(ConstantParameter.GNODEBID, Long.parseLong(nfWrapper.get__gNBId()));
			// System.out.println("hello " + getEventParameterMap().toString());
			getEventParameterMap().put(ConstantParameter.GNODEBID_Length, Long.parseLong(nfWrapper.get__gNBIdLength()));
			if (nfDir.equalsIgnoreCase(ConstantParameter.CUUP)) {
				getEventParameterMap().put(ConstantParameter.GNB_CUUP_FN_ID, nfWrapper.get__gnbFunctionId());
			}
		}

		// This will add default parameters for all events.
		if (!MainController.getEnrichValues().getDefaultMap().isEmpty()) {
			getEventParameterMap().putAll(MainController.getEnrichValues().getDefaultMap());
		}
	}

	/**
	 * This will update parameters for a specific event.
	 */
	public void updateEventParameterMap(PmEvent pmEventMessage, Map<String, Long> preFetchedParams) {

		Long src_nci = 0L;

		// For EBS-N only run NCI Random mapping
		if (!config.isAsr_specific_run()) {
			if (!nfWrapper.get__cellList().isEmpty()) {
				List<CellWrapper> cellList = nfWrapper.get__cellList();
				src_nci = Long.parseLong(cellList.get(ranNumber.nextInt(cellList.size())).get__nCI());
			}
		} else { // ASR-N Specific run NCI mapping
			src_nci = MainController.getNciMapForSession().get(node.get__managedElement())
					.get(preFetchedParams.get(NCI));
		}
		getEventParameterMap().put(ConstantParameter.NCI, src_nci);

		if (preFetchedParams.containsKey(HOTYPE) && null != preFetchedParams.get(HOTYPE)
				&& nfWrapper.getHandOverCellRelationMap().containsKey(src_nci)) {
			int intHoValue = preFetchedParams.get(HOTYPE).intValue();
			if (nfWrapper.getHandOverCellRelationMap().get(src_nci).containsKey(intHoValue)) {
				List<CellRelationWrapper> crwList = nfWrapper.getHandOverCellRelationMap().get(src_nci).get(intHoValue);
				int len = crwList.size();
				if (len > 0) {
					int index = cellRelationIndexMap.get(src_nci).get(intHoValue);
					if (index >= len) {
						index = 0;
					}
					getEventParameterMap().put(TARGETCELL, crwList.get(index).getTarget_nci());
					getEventParameterMap().put(SERVINGID, crwList.get(index).getPlmnByteArr());
					index = index + 1;
					cellRelationIndexMap.get(src_nci).put(intHoValue, index);
				}
			}
		}

		/*
		 * Updates LocalEndPoint and RemoteEndPoint based on Link Value
		 */
		if (!nfWrapper.get__localEndPointMap().isEmpty()) {
			if (nfDir.equalsIgnoreCase(ConstantParameter.CUUP)) {
				String mo = null;
				if (RP_USER_PLANE_LINK_EVENT_ID.contains(pmEventMessage.getEventId())) {
					// RpUserPlaneLink Handling, event id : 4008
					mo = "RpUserPlaneLink";
				} else if (PP_CONTROL_LINK.contains(pmEventMessage.getEventId())) {
					// PpControlLink Handling, event id : 4009, 4010
					mo = "PpControlLink";
				} else {
					// EP_NgU & S1ULINK Handling for other events
					Map<String, Object> cuupMap = decoder.getEventParamValue(pmEventMessage, LINK_TYPE);
					if (null != cuupMap.get(LINK_TYPE)) {
						linkval = cuupMap.get(LINK_TYPE).toString();
						if (linkval.equalsIgnoreCase(EP_NgU)) {
							mo = "EP_NgU";
						} else if (linkval.equalsIgnoreCase(S1ULink)) {
							mo = "S1ULink";
						}
					}
				}
				if (null != mo && nfWrapper.get__localEndPointMap().containsKey(mo)) {
					int size = nfWrapper.get__localEndPointMap().get(mo).size();
					if (size != 0) {
						int index = new Random().nextInt(size);
						eventParameterMap.put(LOCAL_END_POINT, nfWrapper.get__localEndPointMap().get(mo).get(index));
						eventParameterMap.put(REMOTE_END_POINT, nfWrapper.get__remoteEndPointMap().get(mo).get(index));
					}
				}
			}
		}
	}

	/**
	 * This method will return map with parameters and associated value of that
	 * parameters which require to update inside input file.
	 *
	 * @param node
	 * @param deltaTime
	 * @param outerEvent
	 */
	public void updateHeaderParameterMap(long latestTimeEvent) {
		getHeaderParameterMap().put(ConstantParameter.TIME_STAMP, latestTimeEvent);
	}

	/**
	 * @param config
	 */
	public void setConfig(UserConfig config) {
		this.config = config;
	}

	/**
	 * @param file
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/**
	 * @param newStartEpochTime
	 */
	public void setNewStartEpochTime(long newStartEpochTime) {
		this.newStartEpochTime = newStartEpochTime;
	}

	/**
	 * @param node
	 */
	public void setNode(NodeWrapper node) {
		if (null != node) {
			this.node = node;
			this.nfWrapper = this.node.get__networkFnDetailsMap().get(ConstantParameter.NETWORKFUNCTIONMAP.get(nfDir));
		} else {
			this.node = null;
			this.nfWrapper = null;
		}
	}

	/**
	 * @param dir
	 */
	public void setDir(String dir) {
		this.dir = dir;
	}

	/**
	 * @param newFileName
	 */
	public void setNewFileName(String newFileName) {
		this.newFileName = newFileName;
	}

	/**
	 * @return the enrichMap
	 */
	private Map<String, Object> getHeaderParameterMap() {
		if (null == headerParameterMap) {
			headerParameterMap = new HashMap<>();
			return headerParameterMap;
		}
		return headerParameterMap;
	}

	/**
	 * @return the enrichMap
	 */
	private Map<String, Object> getEventParameterMap() {
		if (null == eventParameterMap) {
			eventParameterMap = new HashMap<>();
			return eventParameterMap;
		}
		return eventParameterMap;
	}

	public String getNfDir() {
		return nfDir;
	}

	public void setNfDir(String nfDir) {
		this.nfDir = nfDir;
	}
}
