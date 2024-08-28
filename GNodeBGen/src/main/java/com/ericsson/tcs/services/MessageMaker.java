package com.ericsson.tcs.services;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.ericsson.pm_event.CuCpFunctionPmEventOuterClass.CuCpFunctionPmEvent;
import com.ericsson.pm_event.CuUpFunctionPmEventOuterClass.CuUpFunctionPmEvent;
import com.ericsson.pm_event.DuFunctionPmEventOuterClass.DuFunctionPmEvent;
import com.ericsson.pm_event.PmEventOuterClass;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEventMessageGroup;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.decoder.DecoderService;
import com.ericsson.tcs.services.encoder.EncoderService;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;

public class MessageMaker implements ConstantParameter {

	/**
	 * evtIdToNfmap = Utils.getEventToNetworkFuncationMap()
	 * 
	 * @param referenceEvent
	 * @param eventId
	 * @return
	 */
	public PmEventOuterClass.PmEvent init(PmEvent referenceEvent, Long eventId, Map<Integer, String> evtIdToNfmap,
			Map<Integer, FieldDescriptor> evtIdToFieldDescriptor, GPBServices gpbService, EncoderService encode,
			DecoderService decode) {
		Map<String, Object> valueMap = new HashMap<String, Object>();
		/**
		 * if (null != MainController.enrichValues) { if
		 * (!MainController.enrichValues.getEventSpecificEnrichMent().isEmpty()) { if
		 * (!MainController.enrichValues.getEventSpecificEnrichMent().get(eventId).getEventSpecificProperties().isEmpty())
		 * {
		 * valueMap.putAll(MainController.enrichValues.getEventSpecificEnrichMent().get(eventId).getEventSpecificProperties());
		 * } } valueMap.putAll(MainController.enrichValues.getDefaultMap()); }
		 **/
		Set<String> constant = new HashSet<String>();
		constant.add(NCI);
		constant.add(GNODEBID);
		constant.add(GNODEBID_Length);
		Map<String, Object> ref = decode.getEventParamValue(referenceEvent, constant);
		valueMap.put(NCI, ref.get(NCI));
		valueMap.put(GNODEBID, ref.get(GNODEBID));
		valueMap.put(GNODEBID_Length, ref.get(GNODEBID_Length));
		PmEvent mainEvent = getMessage(eventId.intValue(), referenceEvent, evtIdToNfmap, evtIdToFieldDescriptor,
				valueMap, encode);
		return mainEvent;
	}

	/**
	 * This method will create event wrapper object and also update the event as per
	 * reference event object.
	 * 
	 * @param eventId
	 * @return
	 */
	private PmEvent getMessage(Integer eventId, PmEvent referenceEvent, Map<Integer, String> evtIdToNfmap,
			Map<Integer, FieldDescriptor> evtIdToFieldDescriptor, Map<String, Object> valueMap, EncoderService encode) {
		PmEventMessageGroup group = null;
		Message mainMsg = null;
		if (evtIdToNfmap.containsKey(eventId)) {
			final FieldDescriptor eventDescriptor = evtIdToFieldDescriptor.get(eventId);
			switch (evtIdToNfmap.get(eventId)) {
			case DU:
				group = PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_DU;
				Message msgDU = (Message) DuFunctionPmEvent.newBuilder().getField(eventDescriptor);
				Message.Builder msgBuildDU = msgDU.newBuilderForType();
				encode.encodePayLoadMessageParameters(msgBuildDU, valueMap);
				final DuFunctionPmEvent.Builder functionBuilder = DuFunctionPmEvent.newBuilder();
				mainMsg = functionBuilder.setField(eventDescriptor, msgBuildDU.build()).build();
				break;
			case CUCP:
				group = PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUCP;
				Message msgCP = (Message) CuCpFunctionPmEvent.newBuilder().getField(eventDescriptor);
				Message.Builder msgBuildCP = msgCP.newBuilderForType();
				encode.encodePayLoadMessageParameters(msgBuildCP, valueMap);
				final CuCpFunctionPmEvent.Builder functionCP = CuCpFunctionPmEvent.newBuilder();
				mainMsg = functionCP.setField(eventDescriptor, msgBuildCP.build()).build();
				break;
			case CUUP:
				group = PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUUP;
				Message msgUP = (Message) CuUpFunctionPmEvent.newBuilder().getField(eventDescriptor);
				Message.Builder msgBuildUP = msgUP.newBuilderForType();
				encode.encodePayLoadMessageParameters(msgBuildUP, valueMap);
				final CuUpFunctionPmEvent.Builder functionUP = CuUpFunctionPmEvent.newBuilder();
				mainMsg = functionUP.setField(eventDescriptor, msgBuildUP.build()).build();
				break;
			case COMMON:
				group = PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_COMMON;
				Message msg = (Message) PmEventOuterClass.CommonPmEvent.newBuilder().getField(eventDescriptor);
				Message.Builder msgBuild = msg.newBuilderForType();
				final PmEventOuterClass.CommonPmEvent.Builder common = PmEventOuterClass.CommonPmEvent.newBuilder();
				mainMsg = common.setField(eventDescriptor, msgBuild.build()).build();
				break;
			}
		} else {
			System.out.println("ERROR: Event ID: " + eventId
					+ " Proto definition is not available. Please up-version the current setup.");
		}

		return getPmEvent(referenceEvent, group, eventId, valueMap, mainMsg).build();
	}

	/**
	 * This method will build main PmEvent structure with reference event header and
	 * nci, GNodeBID and its length.
	 * 
	 * @param referenceEvent
	 * @param group
	 * @param eventId
	 * @param valueMap
	 * @param msg
	 * @return
	 */
	public PmEvent.Builder getPmEvent(PmEvent referenceEvent, PmEventMessageGroup group, Integer eventId,
			Map<String, Object> valueMap, Message msg) {
		PmEvent.Builder pmBuilder = PmEvent.newBuilder();
		pmBuilder.setHeader(referenceEvent.getHeader());
		pmBuilder.setGroup(group);
		pmBuilder.setEventId(eventId);
		pmBuilder.setEtcmCorrectionVersion(referenceEvent.getEtcmCorrectionVersion());
		pmBuilder.setEtcmVersion(referenceEvent.getEtcmVersion());
		pmBuilder.setPmEventCommonVersion(referenceEvent.getPmEventCommonVersion());
		pmBuilder.setPmEventCorrectionVersion(referenceEvent.getPmEventCorrectionVersion());
		pmBuilder.setPmEventGroupVersion(referenceEvent.getPmEventGroupVersion());
		pmBuilder.setPayload(msg.toByteString());
		return pmBuilder;
	}

}
