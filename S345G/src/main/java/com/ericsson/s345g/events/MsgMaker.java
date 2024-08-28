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

package com.ericsson.s345g.events;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.S3Defaults;
import com.ericsson.s345g.constant.ConstantParam;
import com.ericsson.s345g.topology.Topology;
import com.ericsson.s345g.topology.wrapper.NetworkFunctionAttribute;
import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.configure.ParamMap;
import com.ericsson.s345g.utils.Utils;
import com.ericsson.pm_event.CuCpFunctionPmEventOuterClass.CuCpFunctionPmEvent;
import com.ericsson.pm_event.CuUpFunctionPmEventOuterClass.CuUpFunctionPmEvent;
import com.ericsson.pm_event.DuFunctionPmEventOuterClass.DuFunctionPmEvent;
import com.ericsson.pm_event.PmEventOuterClass;
import com.ericsson.pm_event.PmEventOuterClass.CommonPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEventHeader;
import com.ericsson.pm_event.PmEventOuterClass.PmEventMessageGroup;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Descriptors.OneofDescriptor;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;

/**
 * Make 5G messages.
 *
 * Message Maker
 */
public class MsgMaker implements ConstantParam {
	private static final Logger logger = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);

	private static final String DU = "DU";
	private static final String CUCP = "CUCP";
	private static final String CUUP = "CUUP";
	private static final String CMN = "COMMON";
	private static final Map<String, Object> emptyValueMap = new HashMap<>();

	private static int intValue = 33;
	private static long longValue = 10001L;

	private static Map<Integer, FieldDescriptor> eventIds = new HashMap<>();
	private Map<Integer, FieldDescriptor> duFieldDescriptors = new HashMap<>();
	private Map<Integer, FieldDescriptor> cucpFieldDescriptors = new HashMap<>();
	private Map<Integer, FieldDescriptor> cuupFieldDescriptors = new HashMap<>();
	private Map<Integer, FieldDescriptor> commonFieldDescriptors = new HashMap<>();

	/**
	 * This will contain the parameters which should not be alter with default value
	 * Since few parameters are header parameters and we are not aware the
	 * significance of those parameters And one parameter is payload that should not
	 * be alter with default value as it is an event data.
	 */
	private static List<String> paramsToIgnore = new ArrayList<>();

	static {
		paramsToIgnore.add("payload");
		paramsToIgnore.add("system_uuid");
		paramsToIgnore.add("ue_trace_id");
		paramsToIgnore.add("trace_reference");
		paramsToIgnore.add("trace_recording_session_reference");
	}

	public MsgMaker() {
		setEventIds();
	}

	public boolean isValidId(final Integer msgId) {
		return eventIds.containsKey(msgId);
	}

	public Integer isValidId(String eventName) {
		for (Entry<Integer, FieldDescriptor> evt : eventIds.entrySet()) {
			if (eventName.equalsIgnoreCase(evt.getValue().getJsonName())) {
				return evt.getKey();
			}
		}
		return -1;
	}

	public boolean isValidCommonId(final Integer msgId) {
		return commonFieldDescriptors.containsKey(msgId);
	}

	public boolean isValidCuCpId(final Integer msgId) {
		return cucpFieldDescriptors.containsKey(msgId) || isValidCommonId(msgId);
	}

	public boolean isValidCuUpId(final Integer msgId) {
		return cuupFieldDescriptors.containsKey(msgId) || isValidCommonId(msgId);
	}

	public boolean isValidDuId(final Integer msgId) {
		return duFieldDescriptors.containsKey(msgId) || isValidCommonId(msgId);
	}

	public String getEventName(final Integer msgId) {
		return eventIds.get(msgId).getName();
	}

	public NetworkFunction getNetworkFunction(final Integer msgId) {
		NetworkFunction nf;
		if (isValidCuUpId(msgId)) {
			nf = NetworkFunction.CUUP;
		} else if (isValidCommonId(msgId)) {
			nf = NetworkFunction.UNSET;
		} else if (isValidDuId(msgId)) {
			nf = NetworkFunction.DU;
		} else {
			nf = NetworkFunction.CUCP;
		}
		return nf;
	}

	// make messages with given Id
	// work from inside out,
	// event message, group message, outer message
	public PmEvent makeMsg(final Integer msgId, final ParamMap origMap) {
		Map<String, Object> valueMap = new HashMap<>();
		for (Param param : origMap.getKeys()) {
			valueMap.put(param.name(), origMap.get(param));
		}
		return makeMsg(msgId, valueMap);
	}

	public PmEvent makeMsg(final Integer msgId, final ParamMap origMap, HashMap<Param, Object> props) {
		Map<String, Object> valueMap = new HashMap<>();
		for (Param param : origMap.getKeys()) {
			valueMap.put(param.name(), origMap.get(param));
		}
		for (HashMap.Entry<Param, Object> param : props.entrySet()) {
			valueMap.put(param.getKey().name(), param.getValue());
		}
		return makeMsg(msgId, valueMap);
	}

	// make messages with given Id
	// work from inside out,
	// event message, group message, outer message
	public PmEvent makeMsg(final Integer msgId, final Map<String, Object> origMap) {
		if (!eventIds.containsKey(msgId)) {
			logger.warn("attempt to build msg for unknown ID {}", msgId);
			return null;
		}
		Map<String, Object> valueMap = origMap;
		if (null == origMap) {
			valueMap = emptyValueMap;
		}
		PmEvent pmEvent = null;

		if (duFieldDescriptors.containsKey(msgId)) {
			updateValueMapWithTopologyParam(valueMap, GNBDUFunction, msgId);
			pmEvent = mkDuMsg(msgId, valueMap);
		} else if (cucpFieldDescriptors.containsKey(msgId)) {
			updateValueMapWithTopologyParam(valueMap, GNBCUCPFunction, msgId);
			pmEvent = mkCucpMsg(msgId, valueMap);
		} else if (cuupFieldDescriptors.containsKey(msgId)) {
			updateValueMapWithTopologyParam(valueMap, GNBCUUPFunction, msgId);
			pmEvent = mkCuupMsg(msgId, valueMap);
		} else if (commonFieldDescriptors.containsKey(msgId)) {
			pmEvent = mkCommonMsg(msgId, valueMap);
		}

		return pmEvent;
	}

	/**
	 * This method will update cell relationship inside events
	 * 
	 * @param attributes
	 * @param valueMap
	 */
	private void updateCellRelation(NetworkFunctionAttribute attributes, Map<String, Object> valueMap) {
		long sourceNci = 0;
		if (valueMap.get("nci") instanceof Long) {
			sourceNci = (long) valueMap.get("nci");
		} else {
			int nciId = (int) valueMap.get("nci");
			sourceNci = nciId;
		}
		if (valueMap.containsKey(HOTYPE) && attributes.getSrcToTargetMap().containsKey(sourceNci)) {
			int hoType = 0;
			if (valueMap.get(HOTYPE) instanceof Long) {
				long ho = (long) valueMap.get(HOTYPE);
				hoType = (int) ho;
			} else {
				hoType = (int) valueMap.get(HOTYPE);
			}
			if (attributes.getSrcToTargetMap().get(sourceNci).containsKey(hoType)) {
				int itemIndex = new Random().nextInt(attributes.getSrcToTargetMap().get(sourceNci).get(hoType).size()); // check
																														// 0
																														// and
																														// 199
																														// generate
																														// or
																														// not
				valueMap.put(SERVINGID,
						attributes.getSrcToTargetMap().get(sourceNci).get(hoType).get(itemIndex).getPlmnID());
				valueMap.put(TARGETCELL,
						attributes.getSrcToTargetMap().get(sourceNci).get(hoType).get(itemIndex).getNci());
			}
		}
	}

	/**
	 * @param valueMap
	 * @param networkFuncation
	 */
	@SuppressWarnings("unchecked")
	private void updateValueMapWithTopologyParam(Map<String, Object> valueMap, String networkFunction, int eventID) {
		if (valueMap.containsKey(Param.TopologyParam.name())) {
			Map<String, NetworkFunctionAttribute> tempMap = (Map<String, NetworkFunctionAttribute>) valueMap
					.get(Param.TopologyParam.name());
			if (tempMap.containsKey(networkFunction)) {
				NetworkFunctionAttribute attributes = tempMap.get(networkFunction);
				if (null != attributes) {
					if (Topology.getHoTypeEvents().contains(eventID)) {
						updateCellRelation(attributes, valueMap);
					}
					int itemIndex = 0;
					String mo = null;
					long val = 0L;
					if (valueMap.containsKey(linkType)) {
						val = (long) valueMap.get(linkType);
					}

					// mo=(val==1)? s1ULinkId : ((val==2)? eP_NgUId :rpUserPlaneLinkId);
					if (val == 1) {
						mo = s1ULinkId;
					} else if (val == 2) {
						mo = eP_NgUId;

					} else if (eventID == 4008 || eventID == 4012) { // This code need to be change..currently its
																		// hardcoded
						mo = rpUserPlaneLinkId;
					} else {
						mo = ppControlLinkId;
					}

					int check = attributes.getLocalMap().get(mo).size();

					for (String str : attributes.gnbFuncMap.get(networkFunction)) {
						switch (str) {
						case gnb_cuup_function_id:
							valueMap.put(gnb_cuup_function_id, attributes.getGnbFunctionID());
							break;

						case local_end_point:
							if (check == 0) {
								continue;
							}
							itemIndex = new Random().nextInt(attributes.getLocalMap().get(mo).size());
							// itemIndex = attributes.getLocalMap().get(mo).size();
							int index = 0;
							for (String ip : attributes.getLocalMap().get(mo)) {
								if (index == itemIndex) {
									valueMap.put(local_end_point, ip);
									break;
								}
								index++;
							}

							break;
						case remote_end_point:
							if (check == 0) {
								continue;
							}
							int counter = 0;
							for (String ip : attributes.getRemoteMap().get(mo)) {
								if (counter == itemIndex) {
									valueMap.put(remote_end_point, ip);
									break;
								}
								counter++;
							}
							break;
						}
					}
				}
			}
		}
	}

	private PmEvent mkDuMsg(final Integer msgId, final Map<String, Object> valueMap) {
		final FieldDescriptor eventDescriptor = duFieldDescriptors.get(msgId);
		final Message msg = (Message) DuFunctionPmEvent.newBuilder().getField(eventDescriptor);
		final Message.Builder evtBuilder = msg.newBuilderForType();
		// populate of the fields of the event
		final Message eventMsg = getEventMessage(evtBuilder, DU, valueMap);
		final DuFunctionPmEvent.Builder functionBuilder = DuFunctionPmEvent.newBuilder();
		final Message functionMessage = functionBuilder.setField(eventDescriptor, eventMsg).build();

		// create a PmEvent message and set the details
		return getMainMessage(msgId, PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_DU, functionMessage.toByteString(),
				valueMap);
	}

	private PmEvent mkCucpMsg(final Integer msgId, final Map<String, Object> valueMap) {
		final FieldDescriptor eventDescriptor = cucpFieldDescriptors.get(msgId);
		final Message msg = (Message) CuCpFunctionPmEvent.newBuilder().getField(eventDescriptor);
		final Message.Builder evtBuilder = msg.newBuilderForType();
		// populate of the fields of the event
		final Message eventMsg = getEventMessage(evtBuilder, CUCP, valueMap);
		final CuCpFunctionPmEvent.Builder functionBuilder = CuCpFunctionPmEvent.newBuilder();
		final Message functionMessage = functionBuilder.setField(eventDescriptor, eventMsg).build();

		// create a PmEvent message and set the details
		return getMainMessage(msgId, PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUCP, functionMessage.toByteString(),
				valueMap);
	}

	private PmEvent mkCuupMsg(final Integer msgId, final Map<String, Object> valueMap) {
		final FieldDescriptor eventDescriptor = cuupFieldDescriptors.get(msgId);
		final Message msg = (Message) CuUpFunctionPmEvent.newBuilder().getField(eventDescriptor);
		final Message.Builder evtBuilder = msg.newBuilderForType();
		// populate of the fields of the event
		final Message eventMsg = getEventMessage(evtBuilder, CUUP, valueMap);
		final CuUpFunctionPmEvent.Builder functionBuilder = CuUpFunctionPmEvent.newBuilder();
		final Message functionMessage = functionBuilder.setField(eventDescriptor, eventMsg).build();

		// create a PmEvent message and set the details
		return getMainMessage(msgId, PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUUP, functionMessage.toByteString(),
				valueMap);
	}

	private PmEvent mkCommonMsg(final Integer msgId, final Map<String, Object> valueMap) {
		final FieldDescriptor eventDescriptor = commonFieldDescriptors.get(msgId);
		final Message msg = (Message) PmEventOuterClass.CommonPmEvent.newBuilder().getField(eventDescriptor);
		final Message.Builder evtBuilder = msg.newBuilderForType();
		// populate of the fields of the event
		final Message eventMsg = getEventMessage(evtBuilder, CMN, valueMap);
		final PmEventOuterClass.CommonPmEvent.Builder functionBuilder = PmEventOuterClass.CommonPmEvent.newBuilder();
		final Message functionMessage = functionBuilder.setField(eventDescriptor, eventMsg).build();

		// create a PmEvent message and set the details
		return getMainMessage(msgId, PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_COMMON, functionMessage.toByteString(),
				valueMap);
	}

	private void setEventIds() {
		List<OneofDescriptor> oneOfs;
		oneOfs = DuFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				duFieldDescriptors.put(eventId, event);
			}
		}
		oneOfs = CuCpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				cucpFieldDescriptors.put(eventId, event);
			}
		}
		oneOfs = CuUpFunctionPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				cuupFieldDescriptors.put(eventId, event);
			}
		}
		oneOfs = CommonPmEvent.getDescriptor().getOneofs();
		for (final OneofDescriptor oneof : oneOfs) {
			final List<FieldDescriptor> fieldDescriptors = oneof.getFields();
			for (final FieldDescriptor event : fieldDescriptors) {
				final Integer eventId = event.getNumber();
				eventIds.put(eventId, event);
				commonFieldDescriptors.put(eventId, event);
			}
		}
	}

	private PmEvent getMainMessage(final long eventId, final PmEventMessageGroup group, final ByteString load,
			final Map<String, Object> valueMap) {
		PmEvent.Builder pmBuilder = PmEvent.newBuilder();
		pmBuilder = (PmEvent.Builder) buildMessageFromMap(pmBuilder, valueMap);
		pmBuilder.setHeader(getHeader(valueMap));
		pmBuilder.setPayload(load);
		pmBuilder.setGroup(group);
		pmBuilder.setEventId(eventId);

		return pmBuilder.build();
	}

	// really long string used for padding out the uuid to manage average
	// message
	// sizes
	private static String longStr = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 50
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 100
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 150
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 200
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 250
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX" // 300
			+ "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUZWX"; // 350

	private PmEventHeader getHeader(final Map<String, Object> valueMap) {
		PmEventHeader.Builder headerBuilder = PmEventHeader.newBuilder();
		headerBuilder = (PmEventHeader.Builder) buildMessageFromMap(headerBuilder, valueMap);
		/* tweak to allow control of average message length */
		Integer uuidLen = (Integer) valueMap.get("SetUUIDLen");
		if (null == uuidLen || uuidLen < 10 || uuidLen >= longStr.length()) {
			uuidLen = 10; // reset to a safe value
		}
		headerBuilder.setSystemUuid(ByteString.copyFrom(longStr.substring(0, uuidLen).getBytes()));
		headerBuilder.setComputeName("msgMaker");
		headerBuilder.addPmEventJobIds(5);
		// adjust this to transmission time
		headerBuilder.setTimeStamp(new Date().getTime());
		return headerBuilder.build();
	}

	private Message getEventMessage(final Message.Builder builder, final String type,
			final Map<String, Object> valueMap) {
		// System.out.println(" Print Value_Map " + valueMap.toString());
		final Descriptors.Descriptor descriptor = builder.getDescriptorForType();
		Object valueToUse = null;
		boolean useValue;
		for (final Descriptors.FieldDescriptor field : descriptor.getFields()) {
			try {
				useValue = false;
				if (valueMap.containsKey(field.getName())) {
					valueToUse = valueMap.get(field.getName());
					useValue = true;
				}
				if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
					List<String> valuesToSet = new ArrayList<String>();
					if (useValue) {
						if (valueToUse instanceof String) {
							valuesToSet.add((String) valueToUse);
						} else {
							valuesToSet = (List<String>) valueToUse;
						}
					} else {
						if (field.getName().equals("pm_event_type")) {
							valuesToSet.add(type);
						} else {
							// if values not set, just generate some random
							// string
							valuesToSet.add("joe");
							valuesToSet.add("kenny");
						}
					}
					if (field.isRepeated()) {
						builder.setField(field, valuesToSet);
					} else {
						builder.setField(field, valuesToSet.get(0));
					}

				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BOOLEAN)) {

					if (useValue) {
						builder.setField(field, valueToUse);
					} else {
						builder.setField(field, false);
					}

				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
					List<Integer> valuesToSet = new ArrayList<Integer>();
					if (useValue) {
						if (valueToUse instanceof Long || valueToUse instanceof Integer) {

							if (valueToUse instanceof Integer) {
								valuesToSet.add((int) valueToUse);
							} else {
								valuesToSet.add((int) ((long) valueToUse));
							}
						} else {
							Object temp = ((List) valueToUse).get(0);
							if (temp instanceof Long) {
								for (Long num : (List<Long>) valueToUse) {
									valuesToSet.add(num.intValue());
								}
							} else {
								valuesToSet = (List<Integer>) valueToUse;
							}
						}
					} else {
						valuesToSet.add(1);
						valuesToSet.add((int) longValue++);

					}
					if (field.isRepeated()) {
						builder.setField(field, valuesToSet);
					} else {
						builder.setField(field, valuesToSet.get(0));
					}
				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
					List<Long> valuesToSet = new ArrayList<Long>();
					if (useValue) {
						if (valueToUse instanceof Long || valueToUse instanceof Integer) {

							if (valueToUse instanceof Long) {
								valuesToSet.add((long) valueToUse);
							} else {
								valuesToSet.add((long) ((int) valueToUse));
							}
						} else {
							valuesToSet = (List<Long>) valueToUse;
						}
					} else {
						valuesToSet.add(1L);
						valuesToSet.add(longValue++);
					}
					if (field.isRepeated()) {
						builder.setField(field, valuesToSet);
					} else {
						builder.setField(field, valuesToSet.get(0));
					}
				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
					List<Object> valuesToSet = new ArrayList<Object>();
					List<Integer> valueSet = new ArrayList<Integer>();
					// int enumVal = ((intValue++) % field.getEnumType().getValues().size()) + 1;
					// This is affecting on deviation so we make it this as 0
					int enumVal = 0;
					if (useValue) {
						if (valueToUse instanceof List) {

							Object temp = ((List) valueToUse).get(0);
							if (temp instanceof Long) {
								for (Long num : (List<Long>) valueToUse) {
									valueSet.add(num.intValue());
								}
							} else {
								valueSet = (List<Integer>) valueToUse;
							}

						} else {
							if (valueToUse instanceof Integer) {
								valueSet.add((int) valueToUse);
							} else {
								valueSet.add((int) ((long) valueToUse));
							}

						}
					} else {
						valueSet.add(enumVal);
					}
					for (Integer enumValTmp : valueSet) {
						Object enumObj = field.getEnumType().findValueByNumber(enumValTmp);
						if (null == enumObj) {
							enumObj = field.getEnumType().findValueByNumber(1);
						}
						valuesToSet.add(enumObj);
					}
					if (field.isRepeated()) {
						// builder.addRepeatedField(field, valuesToSet);
						builder.setField(field, valuesToSet);
					} else {
						builder.setField(field, valuesToSet.get(0));
					}
				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
					// not supported yet
					if (useValue) {
						if (valueToUse instanceof String) {
							String tempVal = (String) valueToUse;
							tempVal = tempVal.substring(2, tempVal.length());
							tempVal = tempVal.replaceAll(" ", "");
							// change "ab cd ef" to "abcdef"
							if (0 != (tempVal.length() % 2)) {
								System.out.println("Warning! length of binary string is not an even number!" + tempVal);
								continue;
							}
							valueToUse = Utils.hexStringToByteArray(tempVal);
							builder.setField(field, ByteString.copyFrom((byte[]) valueToUse));
						} else if (valueToUse instanceof byte[]) {
							builder.setField(field, ByteString.copyFrom((byte[]) valueToUse));
						}
					} else {
						if (!paramsToIgnore.contains(field.getName())) {
							ByteString s = (ByteString) builder.getField(field);
							if (s.toByteArray().length == 0) {
								builder.setField(field,
										ByteString.copyFrom((byte[]) Utils.hexStringToByteArray("21F894")));
							}
						}
					}
				} else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
					if (useValue) {
						List<Message> msgList = new ArrayList<>();
						if (valueToUse instanceof JSONArray) {
							JSONArray jsonArray = (JSONArray) valueToUse;
							for (int i = 0; i < jsonArray.length(); i++) {
								Message.Builder subMessageBuilder = builder.newBuilderForField(field);
								Map<String, Object> tempMap = new HashMap<>();
								if (jsonArray.get(i) instanceof JSONObject) {
									tempMap = ((JSONObject) jsonArray.get(i)).toMap();
								} else {
									tempMap = (Map<String, Object>) valueToUse;
								}
								Message msgBuild = getEventMessage(subMessageBuilder, "", tempMap);
								msgList.add(msgBuild);
							}
						} else if (valueToUse instanceof JSONObject || valueToUse instanceof Map) {
							Message.Builder subMessageBuilder = builder.newBuilderForField(field);
							Map<String, Object> tempMap = new HashMap<>();
							if (valueToUse instanceof JSONObject) {
								tempMap = ((JSONObject) valueToUse).toMap();
							} else {
								tempMap = (Map<String, Object>) valueToUse;
							}

							Message msgBuild = getEventMessage(subMessageBuilder, "", tempMap);
							msgList.add(msgBuild);
						}
						if (field.isRepeated()) {
							builder.setField(field, msgList);
						} else {
							builder.setField(field, msgList.get(0));
						}
					} else {
						List<Message> msgList = new ArrayList<>();
						Message.Builder subMessageBuilder = builder.newBuilderForField(field);
						Message msgBuild = getEventMessage(subMessageBuilder, "", valueMap);
						msgList.add(msgBuild);

						if (field.isRepeated()) {
							builder.setField(field, msgList);
						} else {
							builder.setField(field, msgList.get(0));
						}
					}
				}
			} catch (ClassCastException e) {
				logger.error("ClassCast for field {} of type {}. Attempt to set to {} of type {}", field.getName(),
						field.getJavaType().name(), valueToUse, valueToUse.getClass());
			}

		}
		return builder.build();
	}

	private Message.Builder buildMessageFromMap(Message.Builder builder, final Map<String, Object> valueMap) {
		Message message = getEventMessage(builder, "", valueMap);
		return message.toBuilder();
	}

	public HashMap<String, Object> decodeEvent(PmEvent evt) {
		return decodeEvent(evt.toByteArray());
	}

	private static Map<PmEventMessageGroup, Parser<? extends Message>> parserCache = new HashMap<>();
	static {
		parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_DU, DuFunctionPmEvent.parser());
		parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUCP, CuCpFunctionPmEvent.parser());
		parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUUP, CuUpFunctionPmEvent.parser());
		parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_COMMON, CommonPmEvent.parser());
	}

	public HashMap<String, Object> decodeEvent(byte[] messageAsBytes) {

		HashMap<String, Object> result = new HashMap<>();
		Map<FieldDescriptor, Object> decodedMsg = null;

		Parser<? extends Message> parser = PmEvent.parser();
		PmEvent evt = null;
		try {
			evt = (PmEvent) parser.parseFrom(messageAsBytes);
			decodedMsg = evt.getAllFields();
		} catch (Exception e) {
			e.printStackTrace();
		}
		// todo - handle pmHeader msg

		for (FieldDescriptor fd : decodedMsg.keySet()) {
			result.put(fd.getName(), decodedMsg.get(fd));
		}

		PmEventMessageGroup group = evt.getGroup();
		Message functionMsg;
		try {
			functionMsg = parserCache.get(group).parseFrom(evt.getPayload());
			decodedMsg = functionMsg.getAllFields();
			for (FieldDescriptor fd : decodedMsg.keySet()) {
				result.put(fd.getName(), decodedMsg.get(fd));
			}

			for (FieldDescriptor fd : decodedMsg.keySet()) {
				result.put(fd.getName(), decodedMsg.get(fd));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

}