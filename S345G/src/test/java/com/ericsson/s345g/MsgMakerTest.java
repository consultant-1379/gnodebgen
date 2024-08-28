package com.ericsson.s345g;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;
import com.ericsson.s345g.events.MsgMaker;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;

public class MsgMakerTest {
    private static final Map<String, Object> emptyValueMap = new HashMap<>();
    private static final Map<String, Object> baseValueMap = new HashMap<>();

    public void setupBaseValues() {
        baseValueMap.put("pm_event_group_version", 10);
        baseValueMap.put("pm_event_common_version", 5);
        baseValueMap.put("pm_event_correction_version", 3);
        baseValueMap.put("etcm_version", 1);
        baseValueMap.put("etcm_correction_version", 0);
    }

    @Test
    public void makeMsgInvalidId() {

        MsgMaker mm = new MsgMaker();
        Integer evtId = 999;
        assertFalse("EventId should be Invalid!", mm.isValidId(evtId));
        PmEvent evt = mm.makeMsg(evtId, emptyValueMap);
        assertNull(evt);
    }

    @Test
    public void makeMsgValidDUId() {
        MsgMaker mm = new MsgMaker();
        Integer evtId = 2001;
        assertTrue("EventId should be valid!", mm.isValidId(evtId));

        PmEvent evt = mm.makeMsg(evtId, emptyValueMap);
        assertNotNull(evt);
    }
    @Test
    public void makeMsgValidDUWithValues() {
        setupBaseValues();

        Map<String, Object> valueMap = new HashMap<>();
        valueMap.putAll(baseValueMap);
        int gNodeBId = 1235;
        valueMap.put("gnb_id", gNodeBId);
        valueMap.put("per_ue_mac_harq_dl_nack_16_qam", 98765);
        MsgMaker mm = new MsgMaker();
        int eventId = 2001;
        PmEvent evt = mm.makeMsg(eventId, valueMap);
        assertNotNull(evt);

        try {
            PmEvent decoded = PmEvent.parseFrom(evt.toByteString());
            assertEquals("decode failed", evt.getEventId(), decoded.getEventId());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        Map<String, Object> decodedEvent = mm.decodeEvent(evt);
        System.out.println("\nEvent decodes as:");
        for (Entry <String, Object> record : decodedEvent.entrySet()) {
            System.out.println("key: "+record.getKey()+" class :"+record.getValue().getClass()+" val: "+record.getValue());
            if ( record.getValue() instanceof Map) {
                System.out.println(" value is of class "+record.getValue().getClass());
            }
        }

        Long expectedId = (Long)decodedEvent.get("event_id");
        if (null == expectedId) {
            expectedId = -1L;
        }
        assertEquals("Event Id doesn't match!", Long.valueOf(eventId), expectedId);
    }

    @Test
    public void msgTest () {
        MsgMaker mm = new MsgMaker();
        for (Integer evtId = 0; evtId < 10000; evtId++ ) {
            if (mm.isValidId(evtId)) {
                makeMsg(evtId);
            }
        }
    }

    private void makeMsg(int eventId) {
        setupBaseValues();

        Map<String, Object> valueMap = new HashMap<>();
        valueMap.putAll(baseValueMap);
        int gNodeBId = 1236;
        valueMap.put("etcm_version", 14);
        valueMap.put("gnb_id", gNodeBId);
        valueMap.put("per_ue_mac_harq_dl_nack_16_qam", 98765);
        MsgMaker mm = new MsgMaker();
        PmEvent evt = mm.makeMsg(eventId, valueMap);
        assertNotNull(evt);
        int msgLen = evt.getSerializedSize();

        final int hdrLen = CodedOutputStream.computeUInt32SizeNoTag(msgLen);

        ByteBuffer msgb = ByteBuffer.allocate(hdrLen + msgLen);

        final CodedOutputStream codedOutputStream = CodedOutputStream.newInstance(msgb);
        try {
            codedOutputStream.writeUInt32NoTag(msgLen);
            codedOutputStream.writeRawBytes(evt.toByteArray());
            codedOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        msgb.flip();  // make buffer ready to be read
        /*********** msgb contains the bytes being transmitted  *******/

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
        assertTrue("Could not find length!", mostSignificantBit == 0);
        int eventLength = -1;
        try {
            eventLength = CodedInputStream.newInstance(headerPart, 0, counter).readUInt32();
        } catch (Exception e){
            e.printStackTrace();
        }
        assertEquals("byte count doesn't match", msgLen, eventLength );

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
            assertEquals("Invalid decode of event Id", (long)evt.getEventId(), decodedEvent.getEventId());
            assertEquals("expected", 14L, decodedEvent.getEtcmVersion());
            //System.out.println(decodedEvent.toString());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        try {
            PmEvent decoded = PmEvent.parseFrom(evt.toByteString());
            assertEquals("decode failed", evt.getEventId(), decoded.getEventId());
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

    }

}
