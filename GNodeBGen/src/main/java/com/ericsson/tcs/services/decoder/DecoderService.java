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
package com.ericsson.tcs.services.decoder;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.GPBServices;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;

/**
 * @author xjaimah
 */
public class DecoderService {

	/**
	 * The GPBServices
	 */
	private static GPBServices gpbService;

	static {
		gpbService = new GPBServices();
	}

	/**
	 * This method will return time stamp of associated with event builder
	 *
	 * @param pmEventMessage
	 * @return
	 */
	public long getEventTimeStamp(PmEvent pmEventMessage) {
		return pmEventMessage.getHeader().getTimeStamp();
	}

	/**
	 * This method will decode and return the event parameters.
	 *
	 * @param outerEvent
	 * @return
	 */
	public Map<String, Object> getEventParamValue(PmEvent pmEventObject, Set<String> parameters) {
		Message payLoadMessage = gpbService.getPayloadMessage(pmEventObject);
		if (null != pmEventObject) {
			for (Map.Entry<FieldDescriptor, Object> field : payLoadMessage.getAllFields().entrySet()) {
				Message message = (Message) field.getValue();
				return fetchParameterValue(message, parameters);
			}
		}
		return null;
	}

	public Map<String, Object> getEventParamValueFromSet(PmEvent pmEventObject, Set<String> parameters) {
		Message payLoadMessage = gpbService.getPayloadMessage(pmEventObject);
		Map<String, Object> decodedValue = new HashMap<>();
		Map<String, Set<String>> msg_params = new HashMap<>();
		for (String s : parameters) {
			if (s.contains("|")) {
				String[] msg_eles = s.split("\\|");
				if (!msg_params.containsKey(msg_eles[0])) {
					msg_params.put(msg_eles[0], new HashSet<>());
				}
				msg_params.get(msg_eles[0]).add(msg_eles[1]);
			}
		}
		if (null != pmEventObject) {
			for (Map.Entry<FieldDescriptor, Object> field : payLoadMessage.getAllFields().entrySet()) {
				Message message = (Message) field.getValue();
				return genericMethodToFetchParamValue(message, parameters, decodedValue, msg_params, null);
			}
		}
		return null;
	}

	/**
	 * This method will decode and return the event parameters.
	 *
	 * @param outerEvent
	 * @return
	 */
	public Map<String, Object> getEventParamValue(PmEvent pmEventObject, String parameter) {
		Message payLoadMessage = gpbService.getPayloadMessage(pmEventObject);
		Set<String> parameters = new HashSet<String>();
		parameters.add(parameter);
		if (null != pmEventObject) {
			for (Map.Entry<FieldDescriptor, Object> field : payLoadMessage.getAllFields().entrySet()) {
				Message message = (Message) field.getValue();
				return fetchParameterValue(message, parameters);
			}
		}
		return null;
	}

	/**
	 * Decode and return normal parameters i.e. GNODEBID, NCI etc.
	 *
	 * @param message
	 * @param parameters
	 * @return Map<String, Object>
	 */
	@SuppressWarnings("unchecked")
	private Map<String, Object> fetchParameterValue(Message message, Set<String> parameters) {
		Map<String, Object> decodedValue = new HashMap<>();
		for (Map.Entry<FieldDescriptor, Object> eventField : message.getAllFields().entrySet()) {
			if (parameters.contains(eventField.getKey().getName())) {
				if (eventField.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
					if (ConstantParameter.PDU_SESSION.equalsIgnoreCase(eventField.getKey().getName())) {
						if (eventField.getValue() instanceof List) {
							List<Object> pdu_message = (List<Object>) eventField.getValue();
							decodedValue.put(eventField.getKey().getName(), pdu_message.size());
						}
					}
				} else {
					decodedValue.put(eventField.getKey().getName(), eventField.getValue());
				}
			}
		}
		return decodedValue;
	}

	@SuppressWarnings("unchecked")
	private Map<String, Object> genericMethodToFetchParamValue(Message message, Set<String> parameters,
			Map<String, Object> decodedValue, Map<String, Set<String>> msg_map, String key) {
		for (Map.Entry<FieldDescriptor, Object> eventField : message.getAllFields().entrySet()) {
			if (eventField.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
				// Message parameters
				if (eventField.getValue() instanceof List) {
					List<Message> msgList = (List<Message>) eventField.getValue();
					if (parameters.contains(eventField.getKey().getName())) {
						// Singular Map parameter
						if (msgList.size() > 1) {
							System.out.println(
									"WARNING : Multiple messages detected, as of now tool only supports for very first element of message list parameter, "
											+ eventField.getKey().getName());
						}
						Message m = msgList.get(0);
						for (Map.Entry<FieldDescriptor, Object> f : m.getAllFields().entrySet()) {
							if (f.getKey().getName().equalsIgnoreCase("value")) {
								if (f.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
									decodedValue.put(eventField.getKey().getName(),
											f.getKey().getEnumType().getIndex());
								} else {
									decodedValue.put(eventField.getKey().getName(), f.getValue());
								}
							}
						}
					} else {
						if (null != msg_map && !msg_map.isEmpty()) {
							if (msg_map.keySet().contains(eventField.getKey().getName())) {
								for (Message m : msgList) {
									genericMethodToFetchParamValue(m, msg_map.get(eventField.getKey().getName()),
											decodedValue, null, eventField.getKey().getName());
								}
							}
						}
					}
				} else {
					genericMethodToFetchParamValue((Message) eventField.getValue(), parameters, decodedValue, null,
							null);
				}
			} else if (parameters.contains(eventField.getKey().getName())) {
				if (eventField.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
					// ENUM parameters
					if (null != key) {
						decodedValue.put(key + "|" + eventField.getKey().getName(),
								eventField.getKey().getEnumType().getValues().indexOf(eventField.getValue()));
					} else {
						decodedValue.put(eventField.getKey().getName(),
								eventField.getKey().getEnumType().getValues().indexOf(eventField.getValue()));
					}

				} else {
					// Normal parameters
					if (null != key) {
						decodedValue.put(key + "|" + eventField.getKey().getName(), eventField.getValue());
					} else {
						decodedValue.put(eventField.getKey().getName(), eventField.getValue());
					}
				}
			}
		}
		return decodedValue;
	}

	/**
	 * This method give the event name.
	 *
	 * @param pmEventObject
	 * @return
	 */
	public String getEventName(PmEvent pmEventObject) {
		Message payLoadMessage = gpbService.getPayloadMessage(pmEventObject);
		if (null != pmEventObject) {
			for (Map.Entry<FieldDescriptor, Object> field : payLoadMessage.getAllFields().entrySet()) {
				return field.getKey().getName();
			}
		}
		return null;
	}

	/**
	 * This method will return Network Function of given Event
	 *
	 * @param pmEventObject PmEvent
	 * @return String
	 */
	public String getEventNfName(PmEvent pmEventObject) {
		if (null != pmEventObject) {
			int nFgroupId = pmEventObject.getGroupValue();
			switch (nFgroupId) {
			case 4:
				return "CUUP";
			case 3:
				return "CUCP";
			case 2:
				return "DU";
			case 1:
				return "COMMON EVENTS";
			default:
				return null;
			}
		}
		return null;
	}

	/**
	 * This method will convert byteString to long
	 *
	 * @param bytes
	 * @param pmEventMessage
	 * @return
	 */
	public long getByteStringToLong(PmEvent pmEventMessage) {
		ByteString ueTrace = pmEventMessage.getHeader().getUeTraceId();
		byte[] value = new byte[8];
		value = ueTrace.toByteArray();
		ByteBuffer longBuffer = ByteBuffer.allocate(Long.SIZE / 8);
		longBuffer.put(value, 0, value.length);
		longBuffer.flip();
		return longBuffer.getLong();
	}

	/**
	 * This method will convert byte[] to long
	 *
	 * @param pmEventMessage Byte array
	 * @return
	 */
	public long getByteArrayToLong(byte[] pmEventMessage) {
		ByteBuffer longBuffer = ByteBuffer.allocate(Long.SIZE / 8);
		longBuffer.put(pmEventMessage, 0, pmEventMessage.length);
		longBuffer.flip();
		return longBuffer.getLong();
	}
}
