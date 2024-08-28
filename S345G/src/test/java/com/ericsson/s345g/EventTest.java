package com.ericsson.s345g;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import java.nio.ByteBuffer;
import java.util.HashMap;

import org.junit.Test;

import com.ericsson.pm_event.CuCpFunctionPmEventOuterClass.CuCpFunctionPmEvent;
import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.configure.ParamMap;
import com.ericsson.s345g.events.Event;
import com.ericsson.s345g.events.MsgMaker;
import com.ericsson.s345g.utils.Utils;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;

public class EventTest {

    /*
     * create and populate and event
     * generate corresponding gpb msg
     *
     */
    @Test
    public void makeMsg() {
        // generate original event with the specified parameters
        Event evt = new Event();
        ParamMap paramMap = new ParamMap();
        paramMap.put(Param.PatternId, 1L);
        paramMap.put(Param.Source, 2);
        paramMap.put(Param.gnb_id, 3);
        paramMap.put(Param.nci, 4);
        paramMap.put(Param.pm_event_common_version, 5);
        paramMap.put(Param.pm_event_correction_version, 6);
        paramMap.put(Param.pm_event_group_version, 7);

        evt.setEventId(2001);

        // create corresponding gpb event
        Event newEvt = evt.makeEvent(paramMap);
        assertNotNull(newEvt);

        int eventLen = evt.getLen();
        // make copy of generated message
        // as if sent over the wire
        ByteBuffer msgb = evt.getMsgBB();

        assertEquals("Size error", eventLen, msgb.limit());

        //decode the event length
        int mostSignificantBit = 1;
        int counter = 0;
        byte[] headerPart = new byte[5];

        while (mostSignificantBit == 1 && msgb.hasRemaining() ) {
            byte currentByte = msgb.get();
            headerPart[counter] = currentByte;
            counter++;
            mostSignificantBit = (currentByte & 0xff) >> 7;
        }
        assertEquals("Could not find length!", 0, mostSignificantBit);
        int eventLength = -1;
        try {
            eventLength = CodedInputStream.newInstance(headerPart, 0, counter).readUInt32();
        } catch (Exception e){
            e.printStackTrace();
        }

        // create and fill a buffer with the actual message
        ByteBuffer readBuffer = ByteBuffer.allocate(eventLength);
        int count = 0;
        while (msgb.hasRemaining() && count < eventLength) {
            readBuffer.put(msgb.get());
            count++;
        }
        assertFalse("Unread bytes remain", msgb.hasRemaining());
        assertFalse("Not enough bytes read", count < eventLength);
        readBuffer.flip();

        // decode the new buffer
        PmEvent decodedEvent;
        try {
            decodedEvent = PmEvent.parseFrom(readBuffer);
            //System.out.println("Decoded event Id " + decodedEvent.getEventId());
            assertEquals("Invalid decode of event Id", (long)evt.getEventId(), decodedEvent.getEventId());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void makeAnotherMsg() {
        // generate original event with the specified parameters
        Event evt = new Event();
        ParamMap paramMap = new ParamMap();
        paramMap.put(Param.PatternId, 2L);
        paramMap.put(Param.Source, 3);
        paramMap.put(Param.gnb_id, 4L);
        paramMap.put(Param.nci, 5L);
        paramMap.put(Param.pm_event_common_version, 5);
        paramMap.put(Param.pm_event_correction_version, 6);
        paramMap.put(Param.pm_event_group_version, 7);
        paramMap.put(Param.etcm_version, 8);
        paramMap.put(Param.etcm_correction_version, 9);

        evt.setEventId(2001);

        // create corresponding gpb event
        Event newEvt = evt.makeEvent(paramMap);
        assertNotNull(newEvt);
        PmEvent pmEvent = evt.getPmEvent();
        assertEquals("Error decoding", 5, pmEvent.getPmEventCommonVersion());
        assertEquals("Error decoding", 7, pmEvent.getPmEventGroupVersion());
        assertEquals("Error decoding", 6, pmEvent.getPmEventCorrectionVersion());
        assertEquals("Error decoding", 8, pmEvent.getEtcmVersion());
        assertEquals("Error decoding", 9, pmEvent.getEtcmCorrectionVersion());
    }

    @Test
    public void makeMsgWithASN1() {
        // generate original event with the specified parameters
        Event evt = new Event();
        ParamMap paramMap = new ParamMap();
        paramMap.put(Param.PatternId, 2L);
        paramMap.put(Param.Source, 3);
        paramMap.put(Param.gnb_id, 4L);
        paramMap.put(Param.nci, 5L);
        paramMap.put(Param.pm_event_common_version, 5);
        paramMap.put(Param.pm_event_correction_version, 6);
        paramMap.put(Param.pm_event_group_version, 7);
        paramMap.put(Param.etcm_version, 8);
        paramMap.put(Param.etcm_correction_version, 9);
        String val = "48 82 06  60  00 00  FC  01  05  10  08  0C  02  00  08 00  09  A2  00  00  02  01  00  38  9A 00  00  00  00";
        val = val.replaceAll(" ", "");
        Object value = Utils.hexStringToByteArray(val);

        evt.setEventId(3012);
        paramMap.put(Param.msg_content, value);
        paramMap.put(Param.msg_direction, 1);
        paramMap.put(Param.protocol_name, 14);

        //id = CuCpXnSetupRequest
        //set = msg_direction, 1 # MSG_DIRECTION_SEND
        //set = msg_content, b"48 82 06  60  00 00  FC  01  05  10  08  0C  02  00  08 00  09  A2  00  00  02  01  00  38  9A 00  00  00  00"
        //set = protocol_name, 14  # PROTOCOL_NAME_RRC_38_331_UL_DCCH_MESSAGE

        // create corresponding gpb event
        Event newEvt = evt.makeEvent(paramMap);
        assertNotNull(newEvt);
        PmEvent pmEvent = evt.getPmEvent();
        pmEvent.getPayload();
        assertEquals("Error decoding", 5, pmEvent.getPmEventCommonVersion());
        assertEquals("Error decoding", 7, pmEvent.getPmEventGroupVersion());
        assertEquals("Error decoding", 6, pmEvent.getPmEventCorrectionVersion());
        assertEquals("Error decoding", 8, pmEvent.getEtcmVersion());
        assertEquals("Error decoding", 9, pmEvent.getEtcmCorrectionVersion());
        MsgMaker mm = new MsgMaker();
        HashMap <String, Object> fullDecode = mm.decodeEvent(pmEvent);
        System.out.println(fullDecode);

        /* wont work because "asn1" is not a field of pm_event but of its payload instead
        final Descriptors.FieldDescriptor fieldDescriptor = pmEvent.getDescriptorForType().findFieldByName("asn1");
        if (fieldDescriptor == null) {
            System.out.println("No asn1 field!");
        }
        */
        try {
            final CuCpFunctionPmEvent event = CuCpFunctionPmEvent.parseFrom(pmEvent.getPayload());
            System.out.println("Pm Event Outer " + pmEvent.toString());
            System.out.println("Pm Event Event " + event.toString());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }

}
