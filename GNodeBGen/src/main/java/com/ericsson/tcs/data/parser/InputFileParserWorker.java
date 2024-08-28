package com.ericsson.tcs.data.parser;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.data.parser.wrapper.EventModel;
import com.ericsson.tcs.data.parser.wrapper.NodeModel;
import com.ericsson.tcs.services.FileReader;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.services.decoder.DecoderService;

public class InputFileParserWorker implements Runnable {

	private List<String> fdnList;

	public InputFileParserWorker(List<String> fdnList) {
		// TODO Auto-generated constructor stub
		this.fdnList = fdnList;
	}

	@Override
	public void run() {
		Set<String> decodeEventParamSet = new HashSet<>(
				Arrays.asList(ConstantParameter.GNODEBID, ConstantParameter.NCI));
		GPBServices gpbService = new GPBServices();
		DecoderService decode = new DecoderService();
		FileReader eventReader = new FileReader();
		// TODO Auto-generated method stub
		for (String fdn : fdnList) {
			NodeModel nodeModel = new NodeModel();
			Set<String> tempParamHolder = new HashSet<>();
			tempParamHolder.addAll(decodeEventParamSet);
			nodeModel.setNodeFdn(fdn);
			for (File inputFile : InputParser.getInputFileMap().get(fdn)) {
				List<byte[]> eventList = eventReader.getFileEventList(inputFile);
				for (byte[] eventBytes : eventList) {
					PmEvent pmEventMessage = (PmEvent) gpbService.getPmEventOuterMessage(eventBytes);
					int groupId = pmEventMessage.getGroupValue();
					if (groupId != 1) {
						if (!nodeModel.getNetworkFunMap()
								.containsKey(ConstantParameter.NETWORK_FUNCTION_GROUP_ID_MAP.get(groupId))) {
							EventModel eventModel = new EventModel();
							nodeModel.getNetworkFunMap()
									.put(ConstantParameter.NETWORK_FUNCTION_GROUP_ID_MAP.get(groupId), eventModel);
						}
						Map<String, Object> decodedParamMap = decode.getEventParamValue(pmEventMessage,
								ConstantParameter.decodeEventParametersSet);
						for (String paramName : decodedParamMap.keySet()) {
							switch (paramName) {
							case ConstantParameter.NCI:
								nodeModel.getUniqueNciAcrossAllNf().add(decodedParamMap.get(paramName));
								nodeModel.getNetworkFunMap()
										.get(ConstantParameter.NETWORK_FUNCTION_GROUP_ID_MAP.get(groupId))
										.setNci(decodedParamMap.get(paramName));
								break;
							case ConstantParameter.GNODEBID:
								nodeModel.setGnbId(decodedParamMap.get(paramName));
								tempParamHolder.remove(ConstantParameter.GNODEBID);
								break;
							}
						}
					}
				}
			}
			nodeModel.setNumberOfCells(nodeModel.getUniqueNciAcrossAllNf().size());
			InputParser.getNodeInfoList().add(nodeModel);
		}
	}

}

