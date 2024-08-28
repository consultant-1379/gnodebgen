//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import asn.nr.generated.NR_RRC_Definitions.*;
import com.ericsson.tool.asn.nr.mapper.jaxb.*;
import com.ericsson.tool.asn.nr.mapper.jaxb.MeasResultNRMapper.MeasResult;
import com.ericsson.tool.asn.nr.mapper.jaxb.MeasResultNRMapper.MeasResult.CellResults;

import java.io.IOException;
import java.util.List;

public class NrRrcMeasurementReport extends Encoder {
    public NrRrcMeasurementReport() {
    }

    protected boolean isPerByteAlligned() {
        return false;
    }

    public void encodeAsn1(Object mapper) throws IOException {

        System.out.println("class name : "+mapper.getClass().getSimpleName());

        UL_DCCH_Message ulDcchMessage = new UL_DCCH_Message();
        ulDcchMessage.message = new UL_DCCH_MessageType();
        UL_DCCH_MessageType_c1 ulDcchMessageTypeC1 = new UL_DCCH_MessageType_c1();
        MeasurementReport measurementReport = new MeasurementReport();
        measurementReport.criticalExtensions = new MeasurementReport_criticalExtensions();
        MeasurementReport_IEs measurementReportIEs = new MeasurementReport_IEs(this.encodeMeasResults((NrMeasResultsMapper)mapper));
        measurementReport.criticalExtensions.set_measurementReport(measurementReportIEs);
        ulDcchMessageTypeC1.setElement(1, measurementReport);
        ulDcchMessage.message.setElement(1, ulDcchMessageTypeC1);
        StringBuilder sb = new StringBuilder();
        ulDcchMessage.print(sb, ulDcchMessage.getAsn1TypeName(), 0);
        ulDcchMessage.encode(this.getOrCreateEncodeBuffer());
        System.out.println(sb.toString());
        this.hexDump();
    }

    private MeasResults encodeMeasResults(NrMeasResultsMapper mapper) {
        List<MeasResultServMOMapper> servMOMapperList = mapper.getMeasResultServingMOList().getMeasResultServMO();
        MeasResultServMO[] resultServMOS = new MeasResultServMO[servMOMapperList.size()];

        for(int index = 0; index < servMOMapperList.size(); ++index) {
            MeasResultServMOMapper servMOMapper = (MeasResultServMOMapper)servMOMapperList.get(index);
            resultServMOS[index] = this.getMeasResultServMO(servMOMapper);
        }

        MeasResultServMOList servingMOList = new MeasResultServMOList(resultServMOS);
        MeasResults measResults = new MeasResults((long)mapper.getMeasId(), servingMOList);
        this.updateMeasResultNeighCells(mapper, measResults);
        return measResults;
    }

    private void updateMeasResultNeighCells(NrMeasResultsMapper mapper, MeasResults measResults) {
        if (mapper.getMeasResultNeighCells() != null) {
            measResults.measResultNeighCells = new MeasResults_measResultNeighCells();
            if (mapper.getMeasResultNeighCells().getMeasResultListNR() != null) {
                List<MeasResultNRMapper> measResultNRMapperList = mapper.getMeasResultNeighCells().getMeasResultListNR().getMeasResultNR();
                MeasResultNR[] measResultNRS = new MeasResultNR[measResultNRMapperList.size()];

                for(int index = 0; index < measResultNRMapperList.size(); ++index) {
                    measResultNRS[index] = this.getMeasResultNR((MeasResultNRMapper)measResultNRMapperList.get(index));
                }

                measResults.measResultNeighCells.set_measResultListNR(new MeasResultListNR(measResultNRS));
            }
        }

    }

    private MeasResultServMO getMeasResultServMO(MeasResultServMOMapper servMOMapper) {
        MeasResultNRMapper resultServingCellMapper = servMOMapper.getMeasResultServingCell();
        MeasResultNR measResultNR = this.getMeasResultNR(resultServingCellMapper);
        MeasResultNRMapper resultBestServingCellMapper = servMOMapper.getMeasResultBestNeighCell();
        MeasResultServMO measResultServMO = new MeasResultServMO((long)servMOMapper.getServCellId(), measResultNR);
        if (resultBestServingCellMapper != null) {
            measResultServMO.measResultBestNeighCell = this.getMeasResultNR(resultBestServingCellMapper);
        }

        return measResultServMO;
    }

    private MeasResultNR getMeasResultNR(MeasResultNRMapper measResultNRMapper) {
        MeasResultNR_measResult measResult = this.getMeasResultNRMeasResult(measResultNRMapper);
        MeasResultNR measResultNR = new MeasResultNR(measResult);
        if (measResultNRMapper.getPhysCellId() != null) {
            measResultNR.physCellId = new PhysCellId((long)measResultNRMapper.getPhysCellId());
        }

        if (measResultNRMapper.getCgiInfo() != null) {
            measResultNR.cgi_Info = new CGI_InfoNR();
            this.getPlmnIdentityInfoList(measResultNRMapper, measResultNR);
        }

        return measResultNR;
    }

    private void getPlmnIdentityInfoList(MeasResultNRMapper resultServingCellMapper, MeasResultNR measResultNR) {
        PLMNIdentityInfoListMapper plmnIdentityInfoListMapper = resultServingCellMapper.getCgiInfo().getPlmnIdentityInfoList();
        if (plmnIdentityInfoListMapper != null) {
            List<PLMNIdentityInfoMapper> plmnIdentityInfoMapperList = plmnIdentityInfoListMapper.getPLMNIdentityInfo();
            PLMN_IdentityInfo[] plmnIdentityInfoArray = new PLMN_IdentityInfo[plmnIdentityInfoMapperList.size()];

            for(int index = 0; index < plmnIdentityInfoMapperList.size(); ++index) {
                PLMNIdentityInfoMapper plmnIdentityInfoMapper = (PLMNIdentityInfoMapper)plmnIdentityInfoMapperList.get(index);
                PLMN_IdentityInfo plmnIdentityInfo = new PLMN_IdentityInfo();
                plmnIdentityInfo.cellIdentity = new CellIdentity(plmnIdentityInfoMapper.getCellIdentity());
                if (plmnIdentityInfoMapper.getTrackingAreaCode() != null) {
                    plmnIdentityInfo.trackingAreaCode = new TrackingAreaCode(plmnIdentityInfoMapper.getTrackingAreaCode());
                }

                if (plmnIdentityInfoMapper.getRanac() != null) {
                    plmnIdentityInfo.ranac = new RAN_AreaCode((long)plmnIdentityInfoMapper.getRanac());
                }

                this.updateCellReservedForOperatorUse(plmnIdentityInfoMapper, plmnIdentityInfo);
                plmnIdentityInfo.plmn_IdentityList = new PLMN_IdentityInfo_plmn_IdentityList(this.getPlmnIdentities(plmnIdentityInfoMapper));
                plmnIdentityInfoArray[index] = plmnIdentityInfo;
            }

            measResultNR.cgi_Info.plmn_IdentityInfoList = new PLMN_IdentityInfoList(plmnIdentityInfoArray);
        }

    }

    private void updateCellReservedForOperatorUse(PLMNIdentityInfoMapper plmnIdentityInfoMapper, PLMN_IdentityInfo plmnIdentityInfo) {
        if ("reserved".equals(plmnIdentityInfoMapper.getCellReservedForOperatorUse())) {
            plmnIdentityInfo.cellReservedForOperatorUse = PLMN_IdentityInfo_cellReservedForOperatorUse.reserved();
        } else {
            plmnIdentityInfo.cellReservedForOperatorUse = PLMN_IdentityInfo_cellReservedForOperatorUse.notReserved();
        }

    }

    private PLMN_Identity[] getPlmnIdentities(PLMNIdentityInfoMapper plmnIdentityInfoMapper) {
        List<PLMNIdentityMapper> plmnIdentityMapperList = plmnIdentityInfoMapper.getPlmnIdentityList().getPLMNIdentity();
        PLMN_Identity[] plmnIdentities = new PLMN_Identity[plmnIdentityMapperList.size()];

        for(int index = 0; index < plmnIdentityMapperList.size(); ++index) {
            MCC mcc = this.getMcc((PLMNIdentityMapper)plmnIdentityMapperList.get(index));
            MNC mnc = this.getMnc((PLMNIdentityMapper)plmnIdentityMapperList.get(index));
            plmnIdentities[index] = new PLMN_Identity(mcc, mnc);
        }

        return plmnIdentities;
    }

    private MNC getMnc(PLMNIdentityMapper plmnIdentityMapper) {
        List<Short> mncDigitsMapper = plmnIdentityMapper.getMnc();
        MCC_MNC_Digit[] mncDigits = new MCC_MNC_Digit[mncDigitsMapper.size()];

        for(int digitIndex = 0; digitIndex < mncDigitsMapper.size(); ++digitIndex) {
            mncDigits[digitIndex] = new MCC_MNC_Digit((long)(Short)mncDigitsMapper.get(digitIndex));
        }

        return new MNC(mncDigits);
    }

    private MCC getMcc(PLMNIdentityMapper plmnIdentityMapper) {
        List<Short> mccDigitsMapper = plmnIdentityMapper.getMcc();
        MCC_MNC_Digit[] mccDigits = new MCC_MNC_Digit[mccDigitsMapper.size()];

        for(int digitIndex = 0; digitIndex < mccDigitsMapper.size(); ++digitIndex) {
            mccDigits[digitIndex] = new MCC_MNC_Digit((long)(Short)mccDigitsMapper.get(digitIndex));
        }

        return new MCC(mccDigits);
    }

    private MeasResultNR_measResult getMeasResultNRMeasResult(MeasResultNRMapper resultServingCellMapper) {
        MeasResult measResultMapper = resultServingCellMapper.getMeasResult();
        MeasResultNR_measResult_cellResults cellResults = this.getMeasResultNRMeasResultCellResults(measResultMapper);
        MeasResultNR_measResult measResult = new MeasResultNR_measResult(cellResults);
        if (measResultMapper.getRsIndexResults() != null) {
            measResult.rsIndexResults = new MeasResultNR_measResult_rsIndexResults();
            ResultsPerSSBIndexListMapper ssbIndexListMapper = measResultMapper.getRsIndexResults().getResultsSSBIndexes();
            if (ssbIndexListMapper != null) {
                List<ResultsPerSSBIndexMapper> ssbIndexMapperList = ssbIndexListMapper.getResultsPerSSBIndex();
                ResultsPerSSB_Index[] ssbIndexes = new ResultsPerSSB_Index[ssbIndexMapperList.size()];

                for(int index = 0; index < ssbIndexMapperList.size(); ++index) {
                    ResultsPerSSBIndexMapper ssbIndexMapper = (ResultsPerSSBIndexMapper)ssbIndexMapperList.get(index);
                    ResultsPerSSB_Index ssbIndex = new ResultsPerSSB_Index((long)ssbIndexMapper.getSsbIndex());
                    if (ssbIndexMapper.getSsbResults() != null) {
                        ssbIndex.ssb_Results = this.getMeasQuantityResults(ssbIndexMapper.getSsbResults());
                    }

                    ssbIndexes[index] = ssbIndex;
                }

                measResult.rsIndexResults.resultsSSB_Indexes = new ResultsPerSSB_IndexList(ssbIndexes);
            }

            ResultsPerCSIRSIndexListMapper csirsIndexListMapper = measResultMapper.getRsIndexResults().getResultsCSIRSIndexes();
            if (csirsIndexListMapper != null) {
                List<ResultsPerCSIRSIndexMapper> csirsIndexList = csirsIndexListMapper.getResultsPerCSIRSIndex();
                ResultsPerCSI_RS_Index[] csiRsIndexes = new ResultsPerCSI_RS_Index[csirsIndexList.size()];

                for(int index = 0; index < csirsIndexList.size(); ++index) {
                    ResultsPerCSIRSIndexMapper csiRsIndexMapper = (ResultsPerCSIRSIndexMapper)csirsIndexList.get(index);
                    ResultsPerCSI_RS_Index csiRsIndex = new ResultsPerCSI_RS_Index((long)csiRsIndexMapper.getCsiRSIndex());
                    if (csiRsIndexMapper.getCsiRSResults() != null) {
                        csiRsIndex.csi_RS_Results = this.getMeasQuantityResults(csiRsIndexMapper.getCsiRSResults());
                    }

                    csiRsIndexes[index] = csiRsIndex;
                }

                measResult.rsIndexResults.resultsCSI_RS_Indexes = new ResultsPerCSI_RS_IndexList(csiRsIndexes);
            }
        }

        return measResult;
    }

    private MeasResultNR_measResult_cellResults getMeasResultNRMeasResultCellResults(MeasResult measResultMapper) {
        CellResults cellResultsMapper = measResultMapper.getCellResults();
        MeasQuantityResultsMapper csirsCell = cellResultsMapper.getResultsCSIRSCell();
        MeasResultNR_measResult_cellResults cellResults = new MeasResultNR_measResult_cellResults();
        if (csirsCell != null) {
            cellResults.resultsCSI_RS_Cell = this.getMeasQuantityResults(csirsCell);
        }

        MeasQuantityResultsMapper ssbCell = cellResultsMapper.getResultsSSBCell();
        if (ssbCell != null) {
            cellResults.resultsSSB_Cell = this.getMeasQuantityResults(ssbCell);
        }

        return cellResults;
    }

    private MeasQuantityResults getMeasQuantityResults(MeasQuantityResultsMapper measQuantityResultMapper) {
        MeasQuantityResults measQuantityResults = new MeasQuantityResults();
        if (measQuantityResultMapper.getRsrp() != null) {
            measQuantityResults.rsrp = new RSRP_Range((long)measQuantityResultMapper.getRsrp());
        }

        if (measQuantityResultMapper.getRsrq() != null) {
            measQuantityResults.rsrq = new RSRQ_Range((long)measQuantityResultMapper.getRsrq());
        }

        if (measQuantityResultMapper.getSinr() != null) {
            measQuantityResults.sinr = new SINR_Range((long)measQuantityResultMapper.getSinr());
        }

        return measQuantityResults;
    }

    private void hexDump() {
        System.out.println("########### RRC NR Measurement Report ############");
        this.getOrCreateEncodeBuffer().hexDump();
        System.out.println("------------------------------------------------");
    }
}
