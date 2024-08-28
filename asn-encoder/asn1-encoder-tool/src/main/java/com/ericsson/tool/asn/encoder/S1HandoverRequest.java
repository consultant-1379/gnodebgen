//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import asn.lte.generated.S1AP_CommonDataTypes.Criticality;
import asn.lte.generated.S1AP_IEs.UEAggregateMaximumBitrate;
import asn.lte.generated.S1AP_PDU_Contents.*;
import asn.lte.generated.S1AP_PDU_Descriptions.InitiatingMessage;
import asn.lte.generated.S1AP_PDU_Descriptions.S1AP_PDU;
import com.ericsson.tool.asn.lte.mapper.jaxb.*;
import com.objsys.asn1j.runtime.Asn1Type;

import java.io.IOException;
import java.util.List;

public class S1HandoverRequest extends Encoder {
    public S1HandoverRequest() {
    }

    public void encodeAsn1(Object mapper) throws IOException {
        S1ApPduMapper s1ApPduMapper = (S1ApPduMapper)mapper;
        HandoverRequestMapper handoverRequestMapper = s1ApPduMapper.getHandoverRequest();
        ProtocolIEContainerMapper protocolIEContainerMapper = handoverRequestMapper.getProtocolIEs();
        List<ProtocolIEFieldMapper> protocolIEFieldMappers = protocolIEContainerMapper.getProtocolIEField();
        HandoverRequest_protocolIEs_element[] protocolIEsElements = new HandoverRequest_protocolIEs_element[protocolIEFieldMappers.size()];

        for(int index = 0; index < protocolIEFieldMappers.size(); ++index) {
            ProtocolIEFieldMapper containerMapper = (ProtocolIEFieldMapper)protocolIEFieldMappers.get(index);
            S1apProtocolIEId protocolIEId = S1apProtocolIEId.fromName(containerMapper.getId());
            Criticality criticality = this.getCriticality(containerMapper.getCriticality());
            Asn1Type asn1Type = this.getAsn1Type(containerMapper.getValue(), protocolIEId);
            protocolIEsElements[index] = new HandoverRequest_protocolIEs_element(protocolIEId.getId(), criticality, asn1Type);
        }

        HandoverRequest handoverRequest = new HandoverRequest(new HandoverRequest_protocolIEs(protocolIEsElements));
        InitiatingMessage initiatingMessage = new InitiatingMessage(1L, Criticality.reject(), handoverRequest);
        S1AP_PDU s1apPdu = new S1AP_PDU();
        s1apPdu.set_initiatingMessage(initiatingMessage);
        StringBuilder sb = new StringBuilder();
        s1apPdu.print(sb, s1apPdu.getAsn1TypeName(), 0);
        System.out.println(sb);
        s1apPdu.encode(this.getOrCreateEncodeBuffer());
    }

    private Asn1Type getAsn1Type(OpenType openType, S1apProtocolIEId protocolIEId) {
        switch(protocolIEId) {
        case ID_UE_AGG_MAX_BIT_RATE:
            UEAggregateMaximumBitrateMapper ueAggMaxBitRateMapper = openType.getUEAggregateMaximumBitrate();
            return new UEAggregateMaximumBitrate(ueAggMaxBitRateMapper.getUEaggregateMaximumBitRateDL().longValue(), ueAggMaxBitRateMapper.getUEaggregateMaximumBitRateUL().longValue());
        case ID_RAB_TO_BE_SETUP_LIST_HO_REQ:
            ERABToBeSetupListHOReqMapper erabToBeSetupListHOReqMapper = openType.getERABToBeSetupListHOReq();
            List<ProtocolIESingleContainerMapper> singleContainerMapperList = erabToBeSetupListHOReqMapper.getProtocolIESingleContainer();
            E_RABToBeSetupListHOReq_element[] rabToBeSetupListHOReqElements = new E_RABToBeSetupListHOReq_element[singleContainerMapperList.size()];

            for(int index = 0; index < singleContainerMapperList.size(); ++index) {
                ProtocolIESingleContainerMapper containerMapper = (ProtocolIESingleContainerMapper)singleContainerMapperList.get(index);
                S1apProtocolIEId s1apProtocolId = S1apProtocolIEId.fromName(containerMapper.getId());
                Asn1Type asn1Type = this.getAsn1Type(containerMapper.getValue(), s1apProtocolId);
                Criticality criticality = this.getCriticality(containerMapper.getCriticality());
                rabToBeSetupListHOReqElements[index] = new E_RABToBeSetupListHOReq_element(s1apProtocolId.getId(), criticality, asn1Type);
            }

            return new E_RABToBeSetupListHOReq(rabToBeSetupListHOReqElements);
        case ID_RAB_TO_BE_SETUP_ITEAM_HO_REQ:
        case ID_SOURCE_TARGET_TRANSPARENT_CONTAINER:
            return null;
        default:
            throw new IllegalArgumentException("Unsupported " + protocolIEId + " protocol type");
        }
    }

    private Criticality getCriticality(CriticalityMapper criticalityMapper) {
        switch(criticalityMapper) {
        case IGNORE:
            return Criticality.ignore();
        case NOTIFY:
            return Criticality.notify_();
        case REJECT:
            return Criticality.reject();
        default:
            throw new IllegalArgumentException("Unsupported " + criticalityMapper + " type");
        }
    }

    private void hexDump() {
        System.out.println("########### S1 Handover Request ############");
        this.getOrCreateEncodeBuffer().hexDump();
        System.out.println("------------------------------------------------");
    }
}
