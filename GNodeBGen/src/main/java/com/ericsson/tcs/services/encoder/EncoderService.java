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
package com.ericsson.tcs.services.encoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEventHeader;
import com.ericsson.tcs.constant.ConstantParameter;
import com.ericsson.tcs.services.GPBServices;
import com.ericsson.tcs.topology.wrapper.NodeWrapper;
import com.google.protobuf.ByteString;
import com.google.protobuf.Descriptors;
import com.google.protobuf.Descriptors.FieldDescriptor;
import com.google.protobuf.Message;

/**
 * @author xjaimah
 *
 */
public class EncoderService implements ConstantParameter {

    /**
     * This is use to use get gpb api functionality.
     */
    private GPBServices gpbService;

    /**
     * The longValue
     */

    private static long longValue = 10001L;

    /**
     * The intValue
     */
    private static int intValue = 33;

    /**
     * Construct object of GPBService class.
     */
    public EncoderService() {
        this.gpbService = new GPBServices();
    }

    /**
     * This method is use to build event header present inside PmEvent and update
     * the parameters associated with it.
     * 
     * @param outerEvent
     * @param outerEvent
     * @return
     */
    public void encodeHeaderParameters(PmEvent.Builder pmEventOuterMessage, Map<String, Object> headerParameterMap) {
        PmEventHeader.Builder pmEventHeaderBuilder = pmEventOuterMessage.getHeader().toBuilder();
        for (FieldDescriptor field : pmEventHeaderBuilder.getAllFields().keySet()) {
            if (headerParameterMap.containsKey(field.getName())) {
                if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                    encodeLongTypeField(field, pmEventHeaderBuilder, headerParameterMap.get(field.getName()));
                }
            }
        }
        if (null != pmEventHeaderBuilder) {
            pmEventOuterMessage.setHeader(pmEventHeaderBuilder.build());
        }
    }

    /**
     * This method is use to build event payload message present inside PmEvent and
     * update the parameters associated with it.
     * 
     * @param pmEventMessageBuilder
     * @return
     */
    public void encodePayLoadMessage(PmEvent.Builder pmEventMessageBuilder, PmEvent pmEventMessage,
            Map<String, Object> eventParameterMap) {
        Message.Builder eventMessageBuilder = gpbService.getPayloadMessageBuilder(pmEventMessage);
        PmEventHeader.Builder headerMessagebuilder = pmEventMessage.getHeader().toBuilder();
        encodePayLoadMessageParameters(headerMessagebuilder, eventParameterMap);
        pmEventMessageBuilder.setHeader(headerMessagebuilder.build());

        /*
         * if (pmEventMessage.getEventId() == 3055) { System.out.println(""); }
         */

        if (null != eventMessageBuilder) {

            for (Map.Entry<FieldDescriptor, Object> entry : eventMessageBuilder.getAllFields().entrySet()) {
                /*
                 * This entrySet will always have one entry as there is always one event
                 * associated with one pmOuter class object. i.e PmEvent outer class object will
                 * always contain single event associated with network function for example:
                 * CuCpProcUeCtxtRel
                 */
                Message message = (Message) entry.getValue();
                Message.Builder messageBuilder = message.toBuilder();

                encodePayLoadMessageParameters(messageBuilder, eventParameterMap);
                eventMessageBuilder.setField(entry.getKey(), messageBuilder.build());
                pmEventMessageBuilder.setPayload(eventMessageBuilder.build().toByteString());
            }
        }
    }

    public Map<String, Long> preFetchEventParams(PmEvent pmEvent, Set<String> paramList) {
        Map<String, Long> preFetchedParams = new HashMap<>();
        Message payLoadMsg = gpbService.getPayloadMessage(pmEvent);
        int maxIndex = paramList.size();
        int index = 0;
        for (Map.Entry<FieldDescriptor, Object> payLoadField : payLoadMsg.getAllFields().entrySet()) {
            Message payLoadFieldMsg = (Message) payLoadField.getValue();
            for (Map.Entry<FieldDescriptor, Object> eachParam : payLoadFieldMsg.getAllFields().entrySet()) {
                if (paramList.contains(eachParam.getKey().getName())) {
                    // NCI and HOTYPE is handled
                    if (eachParam.getKey().getName().equals(ConstantParameter.HOTYPE)) {
                        long longHoValue = eachParam.getKey().getEnumType().getValues().indexOf(eachParam.getValue());
                        preFetchedParams.put(ConstantParameter.HOTYPE, longHoValue);
                    } else if (eachParam.getKey().getName().equals(ConstantParameter.NCI)) {
                        long longSrcNci = 0;
                        if (eachParam.getValue() instanceof Long) {
                            longSrcNci = (long) eachParam.getValue();
                        } else {
                            int intSrcNci = (int) eachParam.getValue();
                            longSrcNci = intSrcNci;
                        }
                        preFetchedParams.put(ConstantParameter.NCI, longSrcNci);
                    }
                    index += 1;
                    if (index >= maxIndex) {
                        return preFetchedParams;
                    }
                }
            }
        }
        return preFetchedParams;
    }

    /**
     * This method is use to build event payload message present inside PmEvent and
     * update the parameters associated with it.
     * 
     * @param pmEventMessageBuilder
     * @return
     */
    public void encodePayLoadMessage(PmEvent.Builder pmEventMessageBuilder, PmEvent pmEventMessage,
            Map<String, Object> eventParameterMap, NodeWrapper ne) {
        Message.Builder eventMessageBuilder = gpbService.getPayloadMessageBuilder(pmEventMessage);
        if (null != eventMessageBuilder) {

            for (Map.Entry<FieldDescriptor, Object> entry : eventMessageBuilder.getAllFields().entrySet()) {
                /*
                 * This entrySet will always have one entry as there is always one event
                 * associated with one pmOuter class object. i.e PmEvent outer class object will
                 * always contain single event associated with network function for example:
                 * CuCpProcUeCtxtRel
                 */

                Message message = (Message) entry.getValue();
                Message.Builder messageBuilder = message.toBuilder();
                encodePayLoadMessageParameters(messageBuilder, eventParameterMap, ne);
                eventMessageBuilder.setField(entry.getKey(), messageBuilder.build());
                pmEventMessageBuilder.setPayload(eventMessageBuilder.build().toByteString());
            }
        }
    }

    /**
     * This method will take event payload message(network function events) and
     * update its associated parameters.
     * 
     * @param messageBuilder
     * @param eventMessageParameterMap
     */
    public void encodePayLoadMessageParameters(Message.Builder messageBuilder,
            Map<String, Object> eventMessageParameterMap, NodeWrapper ne) {
        for (Map.Entry<FieldDescriptor, Object> field : messageBuilder.getAllFields().entrySet()) {
            if (eventMessageParameterMap.containsKey(field.getKey().getName())) {
                if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                    encodeLongTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
                    encodeByteStringTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
                    encodeIntTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
                    encodeENUMTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BOOLEAN)) {
                    encodeBooleanTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
                    encodeStringTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                } else if (field.getKey().getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
                    encodeMessageTypeField(field.getKey(), messageBuilder,
                            eventMessageParameterMap.get(field.getKey().getName()));
                }
            }
        }
    }

    /**
     * @param field
     * @param messageBuilder
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void validateParametersValueAndUpdate(FieldDescriptor field, Message.Builder messageBuilder) {
        Object value = messageBuilder.getField(field);

        if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)
                || field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
            if (value instanceof Integer) {
                if ((int) value == 0) {
                    if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                        encodeLongTypeField(field, messageBuilder, longValue++);
                    } else {
                        encodeIntTypeField(field, messageBuilder, longValue++);
                    }
                }
            } else if (value instanceof Long) {
                if ((Long) value == 0L) {
                    if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                        encodeLongTypeField(field, messageBuilder, longValue++);
                    } else {
                        encodeIntTypeField(field, messageBuilder, longValue++);
                    }
                }
            } else {
                List<Long> valueList = (List<Long>) value;
                if (valueList.isEmpty()) {
                    encodeLongTypeField(field, messageBuilder, longValue++);
                }
            }
        } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
            if (value instanceof String) {
                String val = (String) value;
                if (val.isEmpty()) {
                    encodeStringTypeField(field, messageBuilder, "PM DEFAULT VALUE");
                }
            } else {
                List<Long> valueList = (List<Long>) value;
                if (valueList.isEmpty()) {
                    encodeStringTypeField(field, messageBuilder, "PM DEFAULT VALUE");
                }
            }
        } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
            List<Object> valuesToSet = new ArrayList<Object>();
            int enumVal = 0;
            if (value instanceof List) {
                List<Object> temp = ((List) value);
                if (temp.isEmpty()) {
                    Object enumObj = field.getEnumType().findValueByNumber(enumVal);
                    if (null == enumObj) {
                        enumObj = field.getEnumType().findValueByNumber(1);
                    }
                    valuesToSet.add(enumObj);
                    if (field.isRepeated()) {
                        messageBuilder.setField(field, valuesToSet);
                    } else {
                        messageBuilder.setField(field, valuesToSet.get(0));
                    }
                }
            }
        } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
            ByteString s = (ByteString) value;
            if (s.toByteArray().length == 0) {
                messageBuilder.setField(field, ByteString.copyFrom((byte[]) hexStringToByteArray("0123")));
            }
        } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
            List<Message> tempHolder = new ArrayList<Message>();
            List<Message> holder = new ArrayList<Message>();
            if (field.isRepeated()) {
                tempHolder = (List<Message>) messageBuilder.getField(field);
                Message.Builder subMessageBuilder = null;
                if (tempHolder.isEmpty()) {
                    subMessageBuilder = messageBuilder.newBuilderForField(field);
                    getUpversionEventMessage(subMessageBuilder);
                    holder.add(subMessageBuilder.build());
                } else {
                    for (int index = 0; index < tempHolder.size(); index++) {
                        subMessageBuilder = tempHolder.get(index).toBuilder();
                        getUpversionEventMessage(subMessageBuilder);
                        holder.add(subMessageBuilder.build());
                    }
                }
                messageBuilder.setField(field, holder);
            } else {
                Message.Builder tempMessage = (Message.Builder) messageBuilder.getFieldBuilder(field);
                getUpversionEventMessage(tempMessage);
            }
        }
    }

    /**
     * This method will take event payload message(network function events) and
     * update its associated parameters.
     * 
     * @param messageBuilder
     * @param eventMessageParameterMap
     */
    public void encodePayLoadMessageParameters(Message.Builder messageBuilder,
            Map<String, Object> eventMessageParameterMap) {
        Descriptors.Descriptor descriptor = messageBuilder.getDescriptorForType();
        for (final Descriptors.FieldDescriptor field : descriptor.getFields()) {
            if (field.getName().equalsIgnoreCase("global_gnb_id")) {

            }
            if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeLongTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeByteStringTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeIntTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeENUMTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BOOLEAN)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeBooleanTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeStringTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
                if (eventMessageParameterMap.containsKey(field.getName())) {
                    encodeMessageTypeField(field, messageBuilder, eventMessageParameterMap.get(field.getName()));
                    getUpversionEventMessage(messageBuilder);
                } else {
                    validateParametersValueAndUpdate(field, messageBuilder);
                }
            }

        }
    }

    /**
     * 
     * This method will specially written to enrich message type parameters. In
     * message type parameters get all field method not present, hence we need to
     * use descriptor.
     * 
     * @param builder
     * @param type
     * @param valueMap
     */
    private void getEventMessage(final Message.Builder builder, final Map<String, Object> valueMap) {
        final Descriptors.Descriptor descriptor = builder.getDescriptorForType();
        for (final Descriptors.FieldDescriptor field : descriptor.getFields()) {
            if (valueMap.containsKey(field.getName())) {
                if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                    encodeLongTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
                    encodeByteStringTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
                    encodeIntTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
                    encodeENUMTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BOOLEAN)) {
                    encodeBooleanTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
                    encodeStringTypeField(field, builder, valueMap.get(field.getName()));
                } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
                    encodeMessageTypeField(field, builder, valueMap.get(field.getName()));
                }
            } else {
                validateParametersValueAndUpdate(field, builder);
            }
        }
    }

    /**
     * 
     * This method will specially written to enrich message type parameters. In
     * message type parameters get all field method not present, hence we need to
     * use descriptor.
     * 
     * @param builder
     * @param type
     * @param valueMap
     */
    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void getUpversionEventMessage(final Message.Builder builder) {
        final Descriptors.Descriptor descriptor = builder.getDescriptorForType();
        for (final Descriptors.FieldDescriptor field : descriptor.getFields()) {
            Object value = builder.getField(field);
            if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)
                    || field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.INT)) {
                if (value instanceof Integer) {
                    if ((int) value == 0) {
                        if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                            encodeLongTypeField(field, builder, longValue++);
                        } else {
                            encodeIntTypeField(field, builder, longValue++);
                        }
                    }
                } else if (value instanceof Long) {
                    if ((Long) value == 0L) {
                        if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.LONG)) {
                            encodeLongTypeField(field, builder, longValue++);
                        } else {
                            encodeIntTypeField(field, builder, longValue++);
                        }
                    }
                } else {
                    List<Long> valueList = (List<Long>) value;
                    if (valueList.isEmpty()) {
                        encodeLongTypeField(field, builder, longValue++);
                    }
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.STRING)) {
                if (value instanceof String) {
                    String val = (String) value;
                    if (val.isEmpty()) {
                        encodeStringTypeField(field, builder, "PM DEFAULT VALUE");
                    }
                } else {
                    List<Long> valueList = (List<Long>) value;
                    if (valueList.isEmpty()) {
                        encodeStringTypeField(field, builder, "PM DEFAULT VALUE");
                    }
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.ENUM)) {
                List<Object> valuesToSet = new ArrayList<Object>();
                int enumVal = ((intValue++) % field.getEnumType().getValues().size()) + 1;
                if (value instanceof List) {
                    List<Object> temp = ((List) value);
                    if (temp.isEmpty()) {
                        Object enumObj = field.getEnumType().findValueByNumber(enumVal);
                        if (null == enumObj) {
                            enumObj = field.getEnumType().findValueByNumber(1);
                        }
                        valuesToSet.add(enumObj);
                        if (field.isRepeated()) {
                            builder.setField(field, valuesToSet);
                        } else {
                            builder.setField(field, valuesToSet.get(0));
                        }
                    }
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.BYTE_STRING)) {
                ByteString s = (ByteString) value;
                if (s.toByteArray().length == 0) {
                    builder.setField(field, ByteString.copyFrom((byte[]) hexStringToByteArray("0123")));
                }
            } else if (field.getJavaType().equals(Descriptors.FieldDescriptor.JavaType.MESSAGE)) {
                validateParametersValueAndUpdate(field, builder);
            }
        }
    }

    /**
     * @param field
     * @param payLoadMessage
     * @param parameterValue
     */
    public void encodeBooleanTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {
        payLoadMessage.setField(field, parameterValue);
    }

    /**
     * @param field
     * @param payLoadMessage
     * @param parameterValue
     */
    @SuppressWarnings("unchecked")
    public void encodeIntTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {
        List<Integer> valuesToSet = new ArrayList<Integer>();
        if (parameterValue instanceof Integer) {
            valuesToSet.add((int) parameterValue);
        } else if (parameterValue instanceof Long) {
            valuesToSet.add((int) ((long) parameterValue));
        } else {
            @SuppressWarnings("rawtypes")
            Object temp = ((List) parameterValue).get(0);
            if (temp instanceof Long) {
                for (Long num : (List<Long>) parameterValue) {
                    valuesToSet.add(num.intValue());
                }
            } else {
                valuesToSet = (List<Integer>) parameterValue;
            }
        }
        if (field.isRepeated()) {
            payLoadMessage.setField(field, valuesToSet);
        } else {
            payLoadMessage.setField(field, valuesToSet.get(0));
        }

    }

    /**
     * This method will update all string type of parameters value inside network
     * function events.
     * 
     * @param field
     * @param payLoadMessage
     */
    @SuppressWarnings("unchecked")
    public void encodeStringTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {
        List<String> valuesToSet = new ArrayList<String>();
        if (parameterValue instanceof String) {
            valuesToSet.add((String) parameterValue);
        } else {
            valuesToSet = (List<String>) parameterValue;
        }
        if (field.isRepeated()) {
            payLoadMessage.setField(field, valuesToSet);
        } else {
            payLoadMessage.setField(field, valuesToSet.get(0));
        }
    }

    /**
     * This method will update all long and integer type of parameters value inside
     * network function events.
     * 
     * @param field
     * @param payLoadMessage
     */
    @SuppressWarnings("unchecked")
    public void encodeLongTypeField(Descriptors.FieldDescriptor field, Message.Builder eventMessage,
            Object parameterValue) {
        List<Long> valuesToSet = new ArrayList<Long>();
        if (parameterValue instanceof Long) {
            valuesToSet.add((long) parameterValue);
        } else if (parameterValue instanceof Integer) {
            valuesToSet.add((long) ((int) parameterValue));
        } else {
            valuesToSet = (List<Long>) parameterValue;
        }
        if (field.isRepeated()) {
            eventMessage.setField(field, valuesToSet);
        } else {
            eventMessage.setField(field, valuesToSet.get(0));
        }
    }

    /**
     * @param field
     * @param payLoadMessage
     * @param parameterValue
     */
    @SuppressWarnings("unchecked")
    public void encodeMessageTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {
        List<Message> msgList = new ArrayList<>();
        List<Message> tempHolder = new ArrayList<>();
        if (field.isRepeated()) {
            tempHolder = (List<Message>) payLoadMessage.getField(field);
        } else {
            Message tempMessage = (Message) payLoadMessage.getField(field);
            tempHolder.add(tempMessage);
        }

        if (parameterValue instanceof JSONArray) {
            JSONArray jsonArray = (JSONArray) parameterValue;
            for (int index = 0; index < jsonArray.length(); index++) {
                Message.Builder subMessageBuilder = null;
                if (!tempHolder.isEmpty() && tempHolder.size() > index) {
                    subMessageBuilder = tempHolder.get(index).toBuilder();
                } else {
                    subMessageBuilder = payLoadMessage.newBuilderForField(field);
                }
                Map<String, Object> tempMap = new HashMap<>();
                if (jsonArray.get(index) instanceof JSONObject) {
                    tempMap = ((JSONObject) jsonArray.get(index)).toMap();
                } else {
                    tempMap = (Map<String, Object>) parameterValue;
                }
                getEventMessage(subMessageBuilder, tempMap);
                msgList.add(subMessageBuilder.build());
            }
            /*
             * int counter = msgList.size(); for (int position = counter; position <
             * tempHolder.size(); position++) { msgList.add(tempHolder.get(position)); }
             */
        } else if (parameterValue instanceof JSONObject || parameterValue instanceof Map) {
            Message.Builder subMessageBuilder = tempHolder.get(0).toBuilder();
            Map<String, Object> tempMap = new HashMap<>();
            if (parameterValue instanceof JSONObject) {
                tempMap = ((JSONObject) parameterValue).toMap();
            } else {
                tempMap = (Map<String, Object>) parameterValue;
            }
            getEventMessage(subMessageBuilder, tempMap);
            msgList.add(subMessageBuilder.build());
        }
        if (field.isRepeated()) {
            payLoadMessage.setField(field, msgList);
        } else {
            payLoadMessage.setField(field, msgList.get(0));
        }

    }

    /**
     * This method will update all ENUM type of parameters value inside network
     * function events.
     * 
     * @param field
     * @param payLoadMessage
     */
    @SuppressWarnings("unchecked")
    public void encodeENUMTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {

        List<Object> valuesToSet = new ArrayList<Object>();
        List<Integer> valueSet = new ArrayList<Integer>();
        if (parameterValue instanceof List) {
            @SuppressWarnings("rawtypes")
            Object temp = ((List) parameterValue).get(0);
            if (temp instanceof Long) {
                for (Long num : (List<Long>) parameterValue) {
                    valueSet.add(num.intValue());
                }
            } else {
                valueSet = (List<Integer>) parameterValue;
            }
        } else {
            if (parameterValue instanceof Integer) {
                valueSet.add((int) parameterValue);
            } else {
                valueSet.add((int) ((long) parameterValue));
            }
        }
        for (Integer enumValTmp : valueSet) {
            Object enumObj = field.getEnumType().findValueByNumber(enumValTmp);
            if (null == enumObj) {
                enumObj = field.getEnumType().findValueByNumber(1);
            }
            valuesToSet.add(enumObj);
        }
        if (field.isRepeated()) {
            payLoadMessage.setField(field, valuesToSet);
        } else {
            payLoadMessage.setField(field, valuesToSet.get(0));
        }
    }

    /**
     * This method will update all Byte String type of parameters value inside
     * network function events.
     * 
     * @param field
     * @param payLoadMessage
     */
    public void encodeByteStringTypeField(Descriptors.FieldDescriptor field, Message.Builder payLoadMessage,
            Object parameterValue) {
        if (parameterValue instanceof String) {
            String tempVal = (String) parameterValue;
            tempVal = tempVal.substring(2, tempVal.length());
            tempVal = tempVal.replaceAll(" ", "");
            if (0 != (tempVal.length() % 2)) {
                System.out.println("Warning! length of binary string is not an even number!" + tempVal);
            } else {
                parameterValue = hexStringToByteArray(tempVal);
                payLoadMessage.setField(field, ByteString.copyFrom((byte[]) parameterValue));
            }
        } else if (parameterValue instanceof byte[]) {
            payLoadMessage.setField(field, ByteString.copyFrom((byte[]) parameterValue));
        }
    }

    /**
     * This method will form PLMN ID
     * 
     * @param mcc
     * @param mnc
     * @return
     */
    public byte[] makePLMNId(String mcc, String mnc) {
        byte[] result = new byte[3];
        String newMnc;
        // Encoding PLMN id from MCC MNC as per JIRA EQEV-18355
        result[0] = (byte) ((mcc.charAt(1) - '0') << 4);
        result[0] += (byte) (mcc.charAt(0) - '0');
        if (mnc.length() == 2) { // short mnc code
            newMnc = " " + mnc;
            result[1] = (byte) (0x0f << 4); // filler code
        } else {
            newMnc = mnc;
            result[1] = (byte) ((newMnc.charAt(0) - '0') << 4);
        }
        result[1] += (byte) (mcc.charAt(2) - '0');
        result[2] = (byte) ((newMnc.charAt(2) - '0') << 4);
        result[2] += (byte) (newMnc.charAt(1) - '0');
        return result;
    }

    /**
     * Convert a string "0123ab" into byte [] = {0x01, 0x23, 0xab}
     *
     * @param s
     * @return byte []
     */
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();

        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

}
