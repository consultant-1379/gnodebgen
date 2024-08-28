/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2014
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.ericsson.s345g.events;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.ericsson.pm_event.PmEventOuterClass.PmEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.s345g.configure.Param;
import com.ericsson.s345g.configure.ParamMap;
import com.ericsson.s345g.configure.S3Defaults;
import com.google.protobuf.CodedOutputStream;

/**
 * Generic Event class. Expect parts to be overridden by specific events
 *
 */
public class Event {
    static final Logger LOGGER = LoggerFactory.getLogger(S3Defaults.LOGGER_NAME);
    private static MsgMaker msgMaker = new MsgMaker();

    private int offset; // delay in milliseconds from prev msg before this message should be sent - used in templates
    private int delay;  // delay in milliseconds from begining before this message should be sent - used in events
    private int period = 0; // repeat time in seconds for periodic events
    private HashMap<Param, Object> props; // key value map of event specific properties
    // specific properties

    private long patternId; // The id of the pattern instance this event belongs to
    private Integer source; // Where this event is to be sent from
    private NetworkFunction nf = NetworkFunction.UNSET;  // where this event is to be sent to
    protected Integer eventId;

    protected boolean internal = false;  // Set to true for S3 internal housekeeping events
    protected int eventLen = 80;
    private PmEvent pmEvent;
    private ByteBuffer msgb = null;  // encoded pmEvent includeing length header
    private int changeSource = 0;  // 0 - do nothing, 1- change cell, 2- change node

    public Event() {
        props = new HashMap<Param, Object>();
    }

    /*
     * Build standard message with default parameters
     */
    public Event makeEvent(ParamMap paramMap) {
        patternId = (Long) paramMap.get(Param.PatternId);

        source = (Integer) paramMap.get(Param.Source);

        pmEvent = msgMaker.makeMsg(eventId, paramMap, props);

        // encode length of message
        int msgLen = pmEvent.getSerializedSize();

        final int hdrLen = CodedOutputStream.computeUInt32SizeNoTag(msgLen);
        msgb = ByteBuffer.allocate(hdrLen + msgLen);
        eventLen = hdrLen+msgLen;
        final CodedOutputStream codedOutputStream = CodedOutputStream.newInstance(msgb);
        try {
            codedOutputStream.writeUInt32NoTag(msgLen);
            pmEvent.writeTo(codedOutputStream);
            codedOutputStream.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        msgb.flip();  // make buffer ready to be read
        return this;
    }

    public PmEvent getPmEvent() {
        return pmEvent;
    }

    /*
     * Deep copy an event. You do not want to do this unless you really have to (and you better know exactly what you are doing and why!)
     */
    public Event setFrom(Event evt) {
        patternId = evt.patternId;
        source = evt.source;
        eventId = evt.eventId;
        offset = evt.offset;
        eventLen = evt.eventLen;
        period = -1;
        nf = evt.nf;
        setupByteBuffer();
        msgb.put(evt.getMsg(), 0, eventLen);
        return this;
    }

    public Event mkCopy() {
        Event e1 = new Event();
        e1.eventId = eventId;
        e1.patternId = patternId;
        e1.source = source;
        e1.offset = offset;
        e1.eventLen = eventLen;
        e1.props = props;
        e1.period = period;
        e1.nf = nf;
        return e1;
    }

    public void setProps(Param key, Object value) {
        try {
            props.put(key, value);
        } catch (Exception e) {
            LOGGER.debug("Error, Invalid value for property {}. got {} ", key, value);
        }
    }

    public Object getProps(Param key, Object defaultVal) {
        Object val = props.get(key);
        if (val == null) {
            val = defaultVal;
        }
        return val;
    }

    public NetworkFunction getNf() {
        return nf;
    }

    public void setNf(NetworkFunction nf) {
        this.nf = nf;
        props.put(Param.pm_event_common_version, nf.getPm_event_common_version());
        props.put(Param.pm_event_group_version, nf.getPm_event_group_version());
        props.put(Param.pm_event_correction_version, nf.getPm_event_correction_version());
        props.put(Param.etcm_version, nf.getEtcm_version());
        props.put(Param.etcm_correction_version, nf.getEtcm_correction_version());
    }

    public int changeSource() {
        return changeSource;
    }

    public Object getProps(Param key) {
        return props.get(key);
    }

    public long getPatternId() {
        return patternId;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offsetToSet) {
        offset = Math.max(offsetToSet, 0); // negative offsets not allowed!
    }

    public int getDelay() {
        return delay;
    }

    public int getLen() {
        return eventLen;
    }

    public void setDelay(int delayToSet) {
        delay = delayToSet; // negative offsets not allowed!
    }

    public void setPatternId(long patternIdentifier) {
        patternId = patternIdentifier;
    }

    public void setSource(Integer sourceOfMessage) {
        source = sourceOfMessage;
    }

    public void setGlobalCellId(int gci) {
        msgb.putInt(16, gci);
    }

    /* initialise a ByteBuffer for use */
    public void setupByteBuffer() {
        msgb = ByteBuffer.allocate(eventLen);
    }

    /*
     * Get the parameters this event needs
     * I am being a bit lazy here as the overridig classes should be setting the specific parameters they require
     */
    public List<Param> getParamsInEvent() {
        List<Param> paramList = new ArrayList<Param>();
        paramList.add(Param.Source);
        paramList.add(Param.Duration);
        paramList.add(Param.gnb_id);
        paramList.add(Param.main_plmn_id);
        paramList.add(Param.gnb_id_length);
        paramList.add(Param.nci);
        paramList.add(Param.ue_trace_id);
        paramList.add(Param.pm_event_common_version);
        paramList.add(Param.pm_event_correction_version);
        paramList.add(Param.pm_event_group_version);
        paramList.add(Param.etcm_version);
        paramList.add(Param.etcm_correction_version);

        return paramList;
    }

    /**
     * get the actual message as a byte []
     */
    public byte[] getMsg() {
        return msgb.array();
    }

    /**
     * get the actual message as a ByteBuffer
     */
    public ByteBuffer getMsgBB() {
        return msgb;
    }

    /*
     * Get the source for this message - this indicates where the message originated and so where it should be sent to
     */
    public Integer getSource() {
        return source;
    }

    /**
     * @return the eventId
     */
    public Integer getEventId() {
        return eventId;
    }

    /**
     * @param eventId
     *        the eventId to set
     */
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public void setTime(byte[] timeBuf) {
        // On my list of things todo
    }

    /**
     * @return the period
     */
    public int getPeriod() {
        return period;
    }

    /**
     * @param period
     *        the period to set
     */
    public void setPeriod(int period) {
        this.period = period;
    }

    public boolean isInternal() {
        return internal;
    }

    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder();
        buf.append("EventId " + eventId + ", ");
        buf.append("len " + eventLen + ", ");
        buf.append("source " + source + ", ");
        buf.append("period " + period + ", ");
        buf.append("offset " + offset + ", ");
        if (props.size() > 0) {
            buf.append(" props =");
            buf.append(props);
        } else {
            buf.append(" No props!");
        }

        return buf.toString();
    }

    /**
     * Make a valid fake ASN1 message
     */
    public byte[] fakeASN1msg(Integer length) {
        Random rand = new Random();
        byte [] l3Msg = new byte[length];
        rand.nextBytes(l3Msg);
        // now turn it into a valid(ish) ASN.1 msg
        if (length > 4) {
            l3Msg[0] = 0x20;
            l3Msg[1] = 0x00;
            l3Msg[2] = (byte)((length-4)/256);
            l3Msg[3] = (byte)((length-4)%256);
        }
        return l3Msg;
    }
}
