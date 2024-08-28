//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import asn.lte.generated.X2AP_CommonDataTypes.Criticality;
import asn.lte.generated.X2AP_IEs.*;
import asn.lte.generated.X2AP_PDU_Contents.*;
import com.ericsson.tool.asn.lte.mapper.jaxb.*;
import com.objsys.asn1j.runtime.Asn1Type;

import java.io.IOException;
import java.util.List;

public class X2HandoverRequest extends Encoder {
    public X2HandoverRequest() {
    }

    public void encodeAsn1(Object mapper) throws IOException {
        X2ApPduMapper x2ApPduMapper = (X2ApPduMapper)mapper;
        X2HandoverRequestMapper handoverRequestMapper = x2ApPduMapper.getHandoverRequest();
        X2ProtocolIEContainerMapper protocolIEContainerMapper = handoverRequestMapper.getProtocolIEs();
        List<X2ProtocolIEFieldMapper> protocolIEFieldMappers = protocolIEContainerMapper.getProtocolIEField();
        HandoverRequest_protocolIEs_element[] protocolIEsElements = new HandoverRequest_protocolIEs_element[protocolIEFieldMappers.size()];

        for(int index = 0; index < protocolIEFieldMappers.size(); ++index) {
            X2ProtocolIEFieldMapper containerMapper = (X2ProtocolIEFieldMapper)protocolIEFieldMappers.get(index);
            S1apProtocolIEId protocolIEId = S1apProtocolIEId.fromName(containerMapper.getId());
            Criticality criticality = this.getCriticality(containerMapper.getCriticality());
            Asn1Type asn1Type = this.getAsn1Type(containerMapper.getValue(), protocolIEId);
            protocolIEsElements[index] = new HandoverRequest_protocolIEs_element(protocolIEId.getId(), criticality, asn1Type);
        }

        new HandoverRequest(new HandoverRequest_protocolIEs(protocolIEsElements));
    }

    private Asn1Type getAsn1Type(X2OpenType openType, S1apProtocolIEId protocolIEId) {
        switch(protocolIEId) {
        case ID_UE_CONTEXT_INFORMATION:
            UEContextInformationMapper ueContextInformationMapper = openType.getUeContextInformation();
            long mmeUeS1ApId = ueContextInformationMapper.getMMEUES1APID();
            List<X2ProtocolIESingleContainerMapper> singleContainerMappers = ueContextInformationMapper.getERABsToBeSetupList().getProtocolIESingleContainer();
            E_RABs_ToBeSetup_List_element[] erabsToBeSetupListElements = new E_RABs_ToBeSetup_List_element[singleContainerMappers.size()];

            for(int index = 0; index < singleContainerMappers.size(); ++index) {
                X2ProtocolIESingleContainerMapper containerMapper = (X2ProtocolIESingleContainerMapper)singleContainerMappers.get(index);
                S1apProtocolIEId s1apProtocolId = S1apProtocolIEId.fromName(containerMapper.getId());
                Asn1Type asn1Type = this.getAsn1Type(containerMapper.getValue(), s1apProtocolId);
                Criticality criticality = this.getCriticality(containerMapper.getCriticality());
                erabsToBeSetupListElements[index] = new E_RABs_ToBeSetup_List_element(s1apProtocolId.getId(), criticality, asn1Type);
            }

            E_RABs_ToBeSetup_List erabsToBeSetupList = new E_RABs_ToBeSetup_List(erabsToBeSetupListElements);
            UEAggregateMaximumBitrateMapper bitrateMapper = ueContextInformationMapper.getUEaggregateMaximumBitRate();
            UEAggregateMaximumBitRate bitRate = new UEAggregateMaximumBitRate(bitrateMapper.getUEaggregateMaximumBitRateDL().longValue(), bitrateMapper.getUEaggregateMaximumBitRateUL().longValue());
            UESecurityCapabilitiesMapper capabilitiesMapper = ueContextInformationMapper.getUESecurityCapabilities();
            UESecurityCapabilities securityCapabilities = new UESecurityCapabilities(new EncryptionAlgorithms(capabilitiesMapper.getEncryptionAlgorithms()), new IntegrityProtectionAlgorithms(capabilitiesMapper.getEncryptionAlgorithms()));
            ASSecurityInformationMapper informationMapper = ueContextInformationMapper.getASSecurityInformation();
            AS_SecurityInformation securityInformation = new AS_SecurityInformation(new Key_eNodeB_Star(informationMapper.getKeyENodeBStar()), new NextHopChainingCount((long)informationMapper.getNextHopChainingCount()));
            return new UE_ContextInformation(mmeUeS1ApId, securityCapabilities, securityInformation, bitRate, erabsToBeSetupList, ueContextInformationMapper.getRRCContext());
        case ID_RAB_TO_BE_SETUP_ITEAM_HO_REQ:
            X2ERABsToBeSetupItemMapper setupItemMapper = openType.getERABsToBeSetupItem();
            ERABLevelQoSParametersMapper qosParametersMapper = setupItemMapper.getERABLevelQoSParameters();
            AllocationAndRetentionPriorityMapper priorityMapper = qosParametersMapper.getAllocationRetentionPriority();
            AllocationAndRetentionPriority allocationAndRetentionPriority = new AllocationAndRetentionPriority(this.getPriorityLevel(priorityMapper), this.getPreemptionCapability(priorityMapper), this.getPreemptionVulnerability(priorityMapper));
            E_RAB_Level_QoS_Parameters qoS_parameters = new E_RAB_Level_QoS_Parameters(new QCI((long)qosParametersMapper.getQCI()), allocationAndRetentionPriority);
            return new E_RABs_ToBeSetup_Item(setupItemMapper.getERABID(), qoS_parameters, this.getGTPtunnelEndpoint(setupItemMapper));
        default:
            throw new IllegalArgumentException("Unsupported " + protocolIEId + " protocol type");
        }
    }

    private GTPtunnelEndpoint getGTPtunnelEndpoint(X2ERABsToBeSetupItemMapper setupItemMapper) {
        GTPtunnelEndpointMapper tunnelEndpointMapper = setupItemMapper.getULGTPtunnelEndpoint();
        return new GTPtunnelEndpoint(new TransportLayerAddress(tunnelEndpointMapper.getTransportLayerAddress()), new GTP_TEI(tunnelEndpointMapper.getGTPTEID()));
    }

    private PriorityLevel getPriorityLevel(AllocationAndRetentionPriorityMapper retentionPriority) {
        if (retentionPriority.getPriorityLevel().equals("highest")) {
            return new PriorityLevel(1L);
        } else {
            return retentionPriority.getPriorityLevel().equals("lowest") ? new PriorityLevel(14L) : new PriorityLevel(15L);
        }
    }

    private Pre_emptionVulnerability getPreemptionVulnerability(AllocationAndRetentionPriorityMapper retentionPriority) {
        return retentionPriority.getPreEmptionVulnerability() == PreEmptionVulnerabilityMapper.PRE_EMPTABLE ? Pre_emptionVulnerability.pre_emptable() : Pre_emptionVulnerability.not_pre_emptable();
    }

    private Pre_emptionCapability getPreemptionCapability(AllocationAndRetentionPriorityMapper retentionPriority) {
        return retentionPriority.getPreEmptionCapability() == PreEmptionCapabilityMapper.SHALL_NOT_TRIGGER_PRE_EMPTION ? Pre_emptionCapability.shall_not_trigger_pre_emption() : Pre_emptionCapability.may_trigger_pre_emption();
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
        System.out.println("########### X2 Handover Request ############");
        this.getOrCreateEncodeBuffer().hexDump();
        System.out.println("------------------------------------------------");
    }
}
