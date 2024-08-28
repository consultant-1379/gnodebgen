package com.ericsson.tcs.services;
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


import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import com.ericsson.pm_event.CuCpFunctionPmEventOuterClass.CuCpFunctionPmEvent;
import com.ericsson.pm_event.CuUpFunctionPmEventOuterClass.CuUpFunctionPmEvent;
import com.ericsson.pm_event.DuFunctionPmEventOuterClass.DuFunctionPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.CommonPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEventMessageGroup;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Message;
import com.google.protobuf.Parser;

/**
 * @author xjaimah
 *
 */
public class GPBServices {

    /**
     * This map contain network function event outer class
     */
    private static Map <PmEventMessageGroup, Parser<? extends Message>> parserCache = new HashMap<>();
    static {
        parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_DU, DuFunctionPmEvent.parser());
        parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUCP, CuCpFunctionPmEvent.parser());
        parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_CUUP, CuUpFunctionPmEvent.parser());
        parserCache.put(PmEventMessageGroup.PM_EVENT_MESSAGE_GROUP_COMMON, CommonPmEvent.parser());
    }


	/**
	 * This method will give PmEvent object.
	 * @param event
	 * @return Message
	 */
	public Message getPmEventOuterMessage(byte[] eventBytes) {
		Parser<? extends Message> parser = PmEvent.parser();
		Message actual_event = null;
		try {
			actual_event = parser.parseFrom(eventBytes);
        } catch (Exception e) {
            System.out.println("Error: Failed to create PmEvent message object. " +e.getMessage());
        }
		return actual_event;
	}

	/**
	 * This method will return payload message builder present inside PmEvent outer
	 * @param event
	 * @return Message.Builder
	 */
	public Message.Builder getPayloadMessageBuilder(PmEvent event) {
		PmEventMessageGroup group = event.getGroup();
		Message.Builder payloadMessageBuilder = null;
		try {
			payloadMessageBuilder = parserCache.get(group).parseFrom(event.getPayload()).toBuilder();
        } catch (Exception e) {
        	 System.out.println("Error: Failed to create payload message builder object. " +e.getMessage());
        }
		return payloadMessageBuilder;
	}

	/**
	 * This method will return payload message present inside PmEvent outer
	 * @param event
	 * @return Message
	 */
	public Message getPayloadMessage(PmEvent event) {
		PmEventMessageGroup group = event.getGroup();
		Message payloadMessage = null;
		try {
			payloadMessage = parserCache.get(group).parseFrom(event.getPayload());
        } catch (Exception e) {
        	 System.out.println("Error: Failed to create payload message object. " +e.getMessage());
        }
		return payloadMessage;
	}
	
    /**
     * This method will return byte[] after adding record length
     * @param msg
     */
    public byte[] write(PmEvent msg) {
        int msgLen = msg.getSerializedSize();
        final int hdrLen = CodedOutputStream.computeUInt32SizeNoTag(msgLen);
        ByteBuffer msgb = ByteBuffer.allocate(hdrLen + msgLen);
        final CodedOutputStream codedOutputStream = CodedOutputStream.newInstance(msgb);
        try {
            codedOutputStream.writeUInt32NoTag(msgLen);
            msg.writeTo(codedOutputStream);
            codedOutputStream.flush();
            // msgb.flip();
            return msgb.array();
        } catch (Exception e) {
            System.out.println("ERROR : Issue with processing 5G events. " + e.getMessage());
            return null;
        }
    }
}

