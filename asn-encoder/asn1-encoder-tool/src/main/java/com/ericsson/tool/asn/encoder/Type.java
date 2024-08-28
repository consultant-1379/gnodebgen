//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import com.ericsson.tool.asn.lte.mapper.jaxb.MdtReportMapper;
import com.ericsson.tool.asn.lte.mapper.jaxb.MeasResultsMapper;
import com.ericsson.tool.asn.lte.mapper.jaxb.S1ApPduMapper;
import com.ericsson.tool.asn.nr.mapper.jaxb.NrMeasResultsMapper;
import com.ericsson.tool.asn.nr.mapper.jaxb.NrUeCapabilityInformation;
import com.ericsson.tool.asn.nr.mapper.jaxb.NrUeNRCapabilityMapper;

import java.util.*;

public enum Type {
    LTE(getLTESupportedEvents()),
    NR(getNRupportedEvents());

    private Map<Integer, Event> idToEventMap = new HashMap();

    private Type(List<Event> events) {
        events.forEach((event) -> {
            Event var10000 = (Event)this.idToEventMap.put(event.getId(), event);
        });
    }

    public Event getEventFromId(int id) {
        Event event = (Event)this.idToEventMap.get(id);
        if (Objects.isNull(event)) {
            throw new IllegalArgumentException("Event Id " + id + " not supported");
        } else {
            return event;
        }
    }

    public static Type fromString(String type) {
        return valueOf(type.toUpperCase(Locale.ENGLISH));
    }

    private static List<Event> getLTESupportedEvents() {
        List<Event> events = new ArrayList();
        events.add(new Event("S1_HANDOVER_REQUEST", 1038, new S1HandoverRequest(), S1ApPduMapper.class));
        events.add(new Event("MDT_M1_REPORT", 1054, new MdtM1Report(), MdtReportMapper.class));
        events.add(new Event("RRC_MEASUREMENT_REPORT", 11, new RrcMeasurementReport(), MeasResultsMapper.class));
        return events;
    }

    private static List<Event> getNRupportedEvents() {
        List<Event> events = new ArrayList();
        events.add(new Event("CUCP_RRC_MEASUREMENT_REPORT", 3005, new NrRrcMeasurementReport(), NrMeasResultsMapper.class));
        events.add(new Event("CUCP_RRC_UE_CAPABILITY_INFORMATION",3040,new NrRrcUeCapabilityInformation(), NrUeNRCapabilityMapper.class));
        events.add(new Event("CUCP_RRC_UE_CAPABILITY_INFORMATION",3041,new NrRrcUeCapabilityInformation(), NrUeCapabilityInformation.class));
        return events;
    }
}
