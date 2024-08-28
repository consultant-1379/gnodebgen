package com.ericsson.tool.asn.encoder;

import java.io.IOException;

import com.ericsson.tool.asn.nr.mapper.jaxb.BandNRMapper;
import com.ericsson.tool.asn.nr.mapper.jaxb.NrUeCapabilityInformation;
import com.ericsson.tool.asn.nr.mapper.jaxb.NrUeNRCapabilityMapper;
import com.ericsson.tool.asn.nr.mapper.jaxb.UECapabilityRATContainerMapper;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1OctetString;

import asn.nr.generated.NR_RRC_Definitions.AccessStratumRelease;
import asn.nr.generated.NR_RRC_Definitions.BandNR;
import asn.nr.generated.NR_RRC_Definitions.BandNR_ue_PowerClass;
import asn.nr.generated.NR_RRC_Definitions.FreqBandIndicatorNR;
import asn.nr.generated.NR_RRC_Definitions.IMS_Parameters;
import asn.nr.generated.NR_RRC_Definitions.IMS_ParametersCommon;
import asn.nr.generated.NR_RRC_Definitions.IMS_ParametersCommon_voiceOverEUTRA_5GC;
import asn.nr.generated.NR_RRC_Definitions.IMS_ParametersFRX_Diff;
import asn.nr.generated.NR_RRC_Definitions.IMS_ParametersFRX_Diff_voiceOverNR;
import asn.nr.generated.NR_RRC_Definitions.MAC_Parameters;
import asn.nr.generated.NR_RRC_Definitions.MAC_ParametersXDD_Diff;
import asn.nr.generated.NR_RRC_Definitions.MAC_ParametersXDD_Diff_logicalChannelSR_DelayTimer;
import asn.nr.generated.NR_RRC_Definitions.MAC_ParametersXDD_Diff_longDRX_Cycle;
import asn.nr.generated.NR_RRC_Definitions.MAC_ParametersXDD_Diff_multipleSR_Configurations;
import asn.nr.generated.NR_RRC_Definitions.MAC_ParametersXDD_Diff_shortDRX_Cycle;
import asn.nr.generated.NR_RRC_Definitions.PDCP_Parameters;
import asn.nr.generated.NR_RRC_Definitions.PDCP_Parameters_maxNumberROHC_ContextSessions;
import asn.nr.generated.NR_RRC_Definitions.PDCP_Parameters_shortSN;
import asn.nr.generated.NR_RRC_Definitions.PDCP_Parameters_supportedROHC_Profiles;
import asn.nr.generated.NR_RRC_Definitions.Phy_Parameters;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_bwp_SwitchingDelay;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_dynamicHARQ_ACK_Codebook;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_maxLayersMIMO_Indication;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_nzp_CSI_RS_IntefMgmt;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_pdsch_MappingTypeA;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersCommon_semiStaticHARQ_ACK_Codebook;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFR1;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFR1_pdsch_256QAM_FR1;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_absoluteTPC_Command;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_pucch_F2_WithFH;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_pucch_F3_4_HalfPi_BPSK;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_pucch_F3_WithFH;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_pusch_HalfPi_BPSK;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_supportedDMRS_TypeDL;
import asn.nr.generated.NR_RRC_Definitions.Phy_ParametersFRX_Diff_supportedDMRS_TypeUL;
import asn.nr.generated.NR_RRC_Definitions.RAT_Type;
import asn.nr.generated.NR_RRC_Definitions.RF_Parameters;
import asn.nr.generated.NR_RRC_Definitions.RF_Parameters_supportedBandListNR;
import asn.nr.generated.NR_RRC_Definitions.RLC_Parameters;
import asn.nr.generated.NR_RRC_Definitions.RLC_Parameters_am_WithShortSN;
import asn.nr.generated.NR_RRC_Definitions.RLC_Parameters_um_WithLongSN;
import asn.nr.generated.NR_RRC_Definitions.RLC_Parameters_um_WithShortSN;
import asn.nr.generated.NR_RRC_Definitions.RRC_TransactionIdentifier;
import asn.nr.generated.NR_RRC_Definitions.UECapabilityInformation;
import asn.nr.generated.NR_RRC_Definitions.UECapabilityInformation_IEs;
import asn.nr.generated.NR_RRC_Definitions.UECapabilityInformation_criticalExtensions;
import asn.nr.generated.NR_RRC_Definitions.UE_CapabilityRAT_Container;
import asn.nr.generated.NR_RRC_Definitions.UE_CapabilityRAT_ContainerList;
import asn.nr.generated.NR_RRC_Definitions.UE_NR_Capability;
import asn.nr.generated.NR_RRC_Definitions.UE_NR_Capability_v1530;
import asn.nr.generated.NR_RRC_Definitions.UE_NR_Capability_v1540;
import asn.nr.generated.NR_RRC_Definitions.UL_DCCH_Message;
import asn.nr.generated.NR_RRC_Definitions.UL_DCCH_MessageType;
import asn.nr.generated.NR_RRC_Definitions.UL_DCCH_MessageType_c1;

public class NrRrcUeCapabilityInformation extends Encoder {

    public NrRrcUeCapabilityInformation() {

    }

    protected boolean isPerByteAlligned() {
        return false;
    }

    public boolean checkCaseInSensitiveString(String inputStr) {
        if (inputStr.equalsIgnoreCase("supported")) {
            return true;
        }
        return false;
    }

    @Override
    public void encodeAsn1(Object mapper) throws IOException {

        System.out.println("class name : " + mapper.getClass().getSimpleName());

        if (mapper.getClass().getSimpleName().endsWith("NrUeNRCapabilityMapper")) {

            NrUeNRCapabilityMapper mappedObject = (NrUeNRCapabilityMapper) mapper;

            UE_NR_Capability nr_capability = new UE_NR_Capability();

            switch (mappedObject.getAccessStratumRelease()) {
            case "rel15": {
                nr_capability.accessStratumRelease = AccessStratumRelease.rel15();
                break;
            }
            case "rel16": {
                nr_capability.accessStratumRelease = AccessStratumRelease.rel16();
                break;
            }
            }

            PDCP_Parameters pdcp_parameters = new PDCP_Parameters();

            PDCP_Parameters_supportedROHC_Profiles rohc_profiles = new PDCP_Parameters_supportedROHC_Profiles();
            rohc_profiles.profile0x0000 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0000());
            rohc_profiles.profile0x0001 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0001());
            rohc_profiles.profile0x0002 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0002());
            rohc_profiles.profile0x0003 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0003());
            rohc_profiles.profile0x0004 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0004());
            rohc_profiles.profile0x0006 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0006());
            rohc_profiles.profile0x0101 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0101());
            rohc_profiles.profile0x0102 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0102());
            rohc_profiles.profile0x0103 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0103());
            rohc_profiles.profile0x0104 = new Asn1Boolean(
                    mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0104());

            pdcp_parameters.supportedROHC_Profiles = rohc_profiles;

            switch (mappedObject.getPdcpParameters().getMaxNumberROHCContextSessions()) {
            case "cs2": {
                pdcp_parameters.maxNumberROHC_ContextSessions = PDCP_Parameters_maxNumberROHC_ContextSessions.cs2();
                break;
            }
            case "cs4": {
                pdcp_parameters.maxNumberROHC_ContextSessions = PDCP_Parameters_maxNumberROHC_ContextSessions.cs4();
                break;
            }
            }

            if (mappedObject.getPdcpParameters().getShortSN() != null
                    && mappedObject.getPdcpParameters().getShortSN().equals("supported")) {
                pdcp_parameters.shortSN = PDCP_Parameters_shortSN.supported();
            }

            {
                nr_capability.pdcp_Parameters = pdcp_parameters;
            }

            // RLC Parameters support - START

            if (null != mappedObject.getRlcParameters()) {
                RLC_Parameters rlc_params = new RLC_Parameters();
                if (mappedObject.getRlcParameters().getAmWithShortSN() != null
                        && checkCaseInSensitiveString(mappedObject.getRlcParameters().getAmWithShortSN())) {
                    rlc_params.am_WithShortSN = RLC_Parameters_am_WithShortSN.supported();
                }
                if (mappedObject.getRlcParameters().getUmWithShortSN() != null
                        && checkCaseInSensitiveString(mappedObject.getRlcParameters().getUmWithShortSN())) {
                    rlc_params.um_WithShortSN = RLC_Parameters_um_WithShortSN.supported();
                }
                if (mappedObject.getRlcParameters().getUmWithLongSN() != null
                        && checkCaseInSensitiveString(mappedObject.getRlcParameters().getUmWithLongSN())) {
                    rlc_params.um_WithLongSN = RLC_Parameters_um_WithLongSN.supported();
                }

                nr_capability.rlc_Parameters = rlc_params;
            }

            // RLC Parameters support - END

            // MAC Parameters support - START

            if (null != mappedObject.getMacParameters()) {

                MAC_Parameters mac_params = new MAC_Parameters();

                MAC_ParametersXDD_Diff mac_params_xdd_diff = new MAC_ParametersXDD_Diff();

                if (null != mappedObject.getMacParameters().getMacParametersXDDDiff().getLogicalChannelSRDelayTimer()
                        && checkCaseInSensitiveString(mappedObject.getMacParameters().getMacParametersXDDDiff()
                                .getLogicalChannelSRDelayTimer())) {
                    mac_params_xdd_diff.logicalChannelSR_DelayTimer = MAC_ParametersXDD_Diff_logicalChannelSR_DelayTimer
                            .supported();
                }
                if (null != mappedObject.getMacParameters().getMacParametersXDDDiff().getLongDRXCycle()
                        && checkCaseInSensitiveString(
                                mappedObject.getMacParameters().getMacParametersXDDDiff().getLongDRXCycle())) {
                    mac_params_xdd_diff.longDRX_Cycle = MAC_ParametersXDD_Diff_longDRX_Cycle.supported();
                }
                if (null != mappedObject.getMacParameters().getMacParametersXDDDiff().getShortDRXCycle()
                        && checkCaseInSensitiveString(
                                mappedObject.getMacParameters().getMacParametersXDDDiff().getShortDRXCycle())) {
                    mac_params_xdd_diff.shortDRX_Cycle = MAC_ParametersXDD_Diff_shortDRX_Cycle.supported();
                }
                if (null != mappedObject.getMacParameters().getMacParametersXDDDiff().getMultipleSRConfigurations()
                        && checkCaseInSensitiveString(mappedObject.getMacParameters().getMacParametersXDDDiff()
                                .getMultipleSRConfigurations())) {
                    mac_params_xdd_diff.multipleSR_Configurations = MAC_ParametersXDD_Diff_multipleSR_Configurations
                            .supported();
                }

                mac_params.mac_ParametersXDD_Diff = mac_params_xdd_diff;
                nr_capability.mac_Parameters = mac_params;
            }

            // MAC Parameters support - END

            // Phy Parameters support - START

            Phy_Parameters phy_params = new Phy_Parameters();

            if (null != mappedObject.getPhyParameters().getPhyParametersCommon()) {

                Phy_ParametersCommon phy_params_common = new Phy_ParametersCommon();

                if (mappedObject.getPhyParameters().getPhyParametersCommon().getBwpSwitchingDelay()
                        .equalsIgnoreCase("type1")) {
                    phy_params_common.bwp_SwitchingDelay = Phy_ParametersCommon_bwp_SwitchingDelay.type1();
                } else if (mappedObject.getPhyParameters().getPhyParametersCommon().getBwpSwitchingDelay()
                        .equalsIgnoreCase("type2")) {
                    phy_params_common.bwp_SwitchingDelay = Phy_ParametersCommon_bwp_SwitchingDelay.type2();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersCommon().getNzpCSIRSIntefMgmt())) {
                    phy_params_common.nzp_CSI_RS_IntefMgmt = Phy_ParametersCommon_nzp_CSI_RS_IntefMgmt.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersCommon().getDynamicHARQACKCodebook())) {
                    phy_params_common.dynamicHARQ_ACK_Codebook = Phy_ParametersCommon_dynamicHARQ_ACK_Codebook
                            .supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersCommon().getSemiStaticHARQACKCodebook())) {
                    phy_params_common.semiStaticHARQ_ACK_Codebook = Phy_ParametersCommon_semiStaticHARQ_ACK_Codebook
                            .supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersCommon().getPdschMappingTypeA())) {
                    phy_params_common.pdsch_MappingTypeA = Phy_ParametersCommon_pdsch_MappingTypeA.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersCommon().getMaxLayersMIMOIndication())) {
                    phy_params_common.maxLayersMIMO_Indication = Phy_ParametersCommon_maxLayersMIMO_Indication
                            .supported();
                }

                phy_params.phy_ParametersCommon = phy_params_common;
            }

            if (null != mappedObject.getPhyParameters().getPhyParametersFRXDiff()) {
                Phy_ParametersFRX_Diff phy_params_frx_diff = new Phy_ParametersFRX_Diff();

                /**
                 * if (null !=
                 * mappedObject.getPhyParameters().getPhyParametersFRXDiff().getTwoFLDMRS() &&
                 * !mappedObject.getPhyParameters().getPhyParametersFRXDiff().getTwoFLDMRS().isEmpty())
                 * { phy_params_frx_diff.twoFL_DMRS = new Asn1BitString(
                 * mappedObject.getPhyParameters().getPhyParametersFRXDiff().getTwoFLDMRS().getBytes());
                 * }
                 **/

                if (mappedObject.getPhyParameters().getPhyParametersFRXDiff().getSupportedDMRSTypeDL()
                        .equals("type1")) {
                    phy_params_frx_diff.supportedDMRS_TypeDL = Phy_ParametersFRX_Diff_supportedDMRS_TypeDL.type1();
                } else if (mappedObject.getPhyParameters().getPhyParametersFRXDiff().getSupportedDMRSTypeDL()
                        .equals("type1And2")) {
                    phy_params_frx_diff.supportedDMRS_TypeDL = Phy_ParametersFRX_Diff_supportedDMRS_TypeDL.type1And2();
                }

                if (mappedObject.getPhyParameters().getPhyParametersFRXDiff().getSupportedDMRSTypeUL()
                        .equals("type1")) {
                    phy_params_frx_diff.supportedDMRS_TypeUL = Phy_ParametersFRX_Diff_supportedDMRS_TypeUL.type1();
                } else if (mappedObject.getPhyParameters().getPhyParametersFRXDiff().getSupportedDMRSTypeUL()
                        .equals("type1And2")) {
                    phy_params_frx_diff.supportedDMRS_TypeUL = Phy_ParametersFRX_Diff_supportedDMRS_TypeUL.type1And2();
                }

                /**
                 * if (null !=
                 * mappedObject.getPhyParameters().getPhyParametersFRXDiff().getOnePortsPTRS()
                 * &&
                 * !mappedObject.getPhyParameters().getPhyParametersFRXDiff().getOnePortsPTRS().isEmpty())
                 * { phy_params_frx_diff.onePortsPTRS = new Asn1BitString(
                 * mappedObject.getPhyParameters().getPhyParametersFRXDiff().getOnePortsPTRS().getBytes());
                 * }
                 **/

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFRXDiff().getPucchF2WithFH())) {
                    phy_params_frx_diff.pucch_F2_WithFH = Phy_ParametersFRX_Diff_pucch_F2_WithFH.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFRXDiff().getPucchF3WithFH())) {
                    phy_params_frx_diff.pucch_F3_WithFH = Phy_ParametersFRX_Diff_pucch_F3_WithFH.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFRXDiff().getAbsoluteTPCCommand())) {
                    phy_params_frx_diff.absoluteTPC_Command = Phy_ParametersFRX_Diff_absoluteTPC_Command.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFRXDiff().getPuschHalfPiBPSK())) {
                    phy_params_frx_diff.pusch_HalfPi_BPSK = Phy_ParametersFRX_Diff_pusch_HalfPi_BPSK.supported();
                }

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFRXDiff().getPucchF34HalfPiBPSK())) {
                    phy_params_frx_diff.pucch_F3_4_HalfPi_BPSK = Phy_ParametersFRX_Diff_pucch_F3_4_HalfPi_BPSK
                            .supported();
                }

                phy_params.phy_ParametersFRX_Diff = phy_params_frx_diff;
            }

            if (null != mappedObject.getPhyParameters().getPhyParametersFR1()) {

                Phy_ParametersFR1 phy_params_fr1 = new Phy_ParametersFR1();

                if (checkCaseInSensitiveString(
                        mappedObject.getPhyParameters().getPhyParametersFR1().getPdsch256QAMFR1())) {
                    phy_params_fr1.pdsch_256QAM_FR1 = Phy_ParametersFR1_pdsch_256QAM_FR1.supported();
                }

                phy_params.phy_ParametersFR1 = phy_params_fr1;
            }

            nr_capability.phy_Parameters = phy_params;

            // Phy Parameters support - END

            int size = mappedObject.getRfParameters().getSupportedBandListNR().getBandNR().size();
            BandNR[] bandNRArray = new BandNR[size];

            int i = 0;
            for (BandNRMapper bandNRMapper : mappedObject.getRfParameters().getSupportedBandListNR().getBandNR()) {
                BandNR bandNR = new BandNR();
                bandNR.bandNR = new FreqBandIndicatorNR(bandNRMapper.getBandNR());

                switch (bandNRMapper.getUePowerClass()) {
                case "pc1": {
                    bandNR.ue_PowerClass = BandNR_ue_PowerClass.pc1();
                    break;
                }
                case "pc2": {
                    bandNR.ue_PowerClass = BandNR_ue_PowerClass.pc2();
                    break;
                }
                case "pc3": {
                    bandNR.ue_PowerClass = BandNR_ue_PowerClass.pc3();
                    break;
                }
                case "pc4": {
                    bandNR.ue_PowerClass = BandNR_ue_PowerClass.pc4();
                    break;
                }
                }

                bandNRArray[i] = bandNR;
                i++;
            }

            RF_Parameters rf_parameters = new RF_Parameters();
            rf_parameters.supportedBandListNR = new RF_Parameters_supportedBandListNR(bandNRArray);

            nr_capability.rf_Parameters = rf_parameters;

            if (null != mappedObject.getNonCriticalExtension()) {

                IMS_Parameters ims_parameters = new IMS_Parameters();
                IMS_ParametersCommon ims_parametersCommon = new IMS_ParametersCommon();

                if ("supported".equals(mappedObject.getNonCriticalExtension().getNonCriticalExtension()
                        .getImsParameters().getImsParametersCommon().getVoiceOverEUTRA5GC())) {
                    ims_parametersCommon.voiceOverEUTRA_5GC = IMS_ParametersCommon_voiceOverEUTRA_5GC.supported();
                }

                ims_parameters.ims_ParametersCommon = ims_parametersCommon;

                IMS_ParametersFRX_Diff ims_parametersFRX_diff = new IMS_ParametersFRX_Diff();
                if ("supported".equals(mappedObject.getNonCriticalExtension().getNonCriticalExtension()
                        .getImsParameters().getImsParametersFRXDiff().getVoiceOverNR())) {
                    ims_parametersFRX_diff.voiceOverNR = IMS_ParametersFRX_Diff_voiceOverNR.supported();
                }

                ims_parameters.ims_ParametersFRX_Diff = ims_parametersFRX_diff;

                UE_NR_Capability_v1530 ue_nr_capability_v1530 = new UE_NR_Capability_v1530();
                UE_NR_Capability_v1540 ue_nr_capability_v1540 = new UE_NR_Capability_v1540();
                ue_nr_capability_v1540.ims_Parameters = ims_parameters;

                ue_nr_capability_v1530.nonCriticalExtension = ue_nr_capability_v1540;

                nr_capability.nonCriticalExtension = ue_nr_capability_v1530;
            }

            StringBuilder sb = new StringBuilder();
            nr_capability.print(sb, nr_capability.getAsn1TypeName(), 0);
            nr_capability.encode(this.getOrCreateEncodeBuffer());
            System.out.println(sb.toString());
            this.hexDump();

            // System.out.println(mappedObject.getAccessStratumRelease());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0000());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0001());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0002());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0003());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0004());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0006());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0101());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0102());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0103());
            // System.out.println(mappedObject.getPdcpParameters().getSupportedROHCProfiles().isProfile0X0104());
            // System.out.println(mappedObject.getPdcpParameters().getMaxNumberROHCContextSessions());
            // System.out.println(mappedObject.getPdcpParameters().getShortSN());
            // System.out.println(mappedObject.getPhyParameters().getPhyParametersCommon().getMaxLayersMIMOIndication());
            // System.out.println(mappedObject.getPhyParameters().getPhyParametersFR1().getPdsch256QAMFR1());
            // System.out.println(mappedObject.getRfParameters().getSupportedBandListNR().getBandNR().get(0).getBandNR());
            // System.out.println(mappedObject.getRfParameters().getSupportedBandListNR().getBandNR().get(0).getUePowerClass());
            // System.out.println(mappedObject.getNonCriticalExtension().getNonCriticalExtension().getImsParameters().getImsParametersCommon().getVoiceOverEUTRA5GC());
            // System.out.println(mappedObject.getNonCriticalExtension().getNonCriticalExtension().getImsParameters().getImsParametersFRXDiff().getVoiceOverNR());

        } else {

            NrUeCapabilityInformation mapperObject = (NrUeCapabilityInformation) mapper;
            UL_DCCH_Message ulDcchMessage = new UL_DCCH_Message();
            ulDcchMessage.message = new UL_DCCH_MessageType();
            UL_DCCH_MessageType_c1 ulDcchMessageTypeC1 = new UL_DCCH_MessageType_c1();
            UECapabilityInformation ueCapabilityInformation = new UECapabilityInformation();
            ueCapabilityInformation.rrc_TransactionIdentifier = new RRC_TransactionIdentifier(
                    mapperObject.getRrcTransactionIdentifier());

            UECapabilityInformation_IEs ueCapabilityInformation_IEs = new UECapabilityInformation_IEs();
            UE_CapabilityRAT_Container[] ue_capabilityRAT_containers = new UE_CapabilityRAT_Container[1];
            int i = 0;
            for (UECapabilityRATContainerMapper ratContainerMapper : mapperObject.getCriticalExtensions()
                    .getUeCapabilityInformation().getUeCapabilityRATContainerList().getUECapabilityRATContainer()) {
                UE_CapabilityRAT_Container container = new UE_CapabilityRAT_Container();

                switch (ratContainerMapper.getRatType()) {
                case "nr": {
                    container.rat_Type = RAT_Type.nr();
                    break;
                }
                case "eutra": {
                    container.rat_Type = RAT_Type.eutra();
                    break;
                }
                }
                container.ue_CapabilityRAT_Container = new Asn1OctetString(
                        ratContainerMapper.getUeCapabilityRATContainer());
                ue_capabilityRAT_containers[i] = container;
            }

            UE_CapabilityRAT_ContainerList ue_capabilityRAT_containerList = new UE_CapabilityRAT_ContainerList(
                    ue_capabilityRAT_containers);
            ueCapabilityInformation_IEs.ue_CapabilityRAT_ContainerList = ue_capabilityRAT_containerList;
            ueCapabilityInformation.criticalExtensions = new UECapabilityInformation_criticalExtensions();
            ueCapabilityInformation.criticalExtensions.set_ueCapabilityInformation(ueCapabilityInformation_IEs);
            ulDcchMessageTypeC1.setElement(10, ueCapabilityInformation);
            ulDcchMessage.message.setElement(1, ulDcchMessageTypeC1);
            StringBuilder sb = new StringBuilder();
            ulDcchMessage.print(sb, ulDcchMessage.getAsn1TypeName(), 0);
            ulDcchMessage.encode(this.getOrCreateEncodeBuffer());
            System.out.println(sb.toString());
            this.hexDump();

            // System.out.println(mapperObject.getRrcTransactionIdentifier());
            // System.out.println(mapperObject.getCriticalExtensions().getUeCapabilityInformation().getUeCapabilityRATContainerList().getUECapabilityRATContainer().get(0).getRatType());
            // System.out.println(mapperObject.getCriticalExtensions().getUeCapabilityInformation().getUeCapabilityRATContainerList().getUECapabilityRATContainer().get(0).getUeCapabilityRATContainer());
            // System.out.println(Arrays.toString(mapperObject.getCriticalExtensions().getUeCapabilityInformation().getUeCapabilityRATContainerList().getUECapabilityRATContainer().get(0).getUeCapabilityRATContainer()));

        }

        System.out.println("out of the encode message");
    }

    private void hexDump() {
        System.out.println("########### RRC NR Measurement Report ############");
        this.getOrCreateEncodeBuffer().hexDump();
        System.out.println("------------------------------------------------");
    }
}
