//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import asn.lte.generated.EUTRA_RRC_Definitions.*;
import com.ericsson.tool.asn.lte.mapper.jaxb.MeasResultEUTRAMapper;
import com.ericsson.tool.asn.lte.mapper.jaxb.MeasResultsMapper;

import java.io.IOException;
import java.util.List;

public class RrcMeasurementReport extends Encoder {
    public RrcMeasurementReport() {
    }

    protected boolean isPerByteAlligned() {
        return false;
    }

    public void encodeAsn1(Object mapper) throws IOException {
        UL_DCCH_Message ulDcchMessage = new UL_DCCH_Message();
        ulDcchMessage.message = new UL_DCCH_MessageType();
        UL_DCCH_MessageType_c1 ulDcchMessageTypeC1 = new UL_DCCH_MessageType_c1();
        MeasurementReport measurementReport = new MeasurementReport();
        measurementReport.criticalExtensions = new MeasurementReport_criticalExtensions();
        MeasurementReport_criticalExtensions_c1 measurementReportCriticalExtensionsC1 = new MeasurementReport_criticalExtensions_c1();
        measurementReportCriticalExtensionsC1.set_measurementReport_r8(this.enocdeMeasurementReportR8IEs((MeasResultsMapper)mapper));
        measurementReport.criticalExtensions.set_c1(measurementReportCriticalExtensionsC1);
        ulDcchMessageTypeC1.setElement(2, measurementReport);
        ulDcchMessage.message.setElement(1, ulDcchMessageTypeC1);
        StringBuilder sb = new StringBuilder();
        ulDcchMessage.print(sb, ulDcchMessage.getAsn1TypeName(), 0);
        System.out.println(sb);
        ulDcchMessage.encode(this.getOrCreateEncodeBuffer());
        this.hexDump();
    }

    private MeasurementReport_r8_IEs enocdeMeasurementReportR8IEs(MeasResultsMapper mapper) {
        MeasResults_measResultPCell measResultPCell = new MeasResults_measResultPCell((long)mapper.getMeasResultPCell().getRsrpResult(), (long)mapper.getMeasResultPCell().getRsrqResult());
        List<MeasResultEUTRAMapper> measResultEUTRAList = mapper.getMeasResultNeighCells().getMeasResultListEUTRA().getMeasResultEUTRA();
        MeasResultEUTRA[] measResultEUTRAs = new MeasResultEUTRA[measResultEUTRAList.size()];

        for(int index = 0; index < measResultEUTRAList.size(); ++index) {
            MeasResultEUTRAMapper measResult = (MeasResultEUTRAMapper)measResultEUTRAList.get(index);
            MeasResultEUTRA_measResult measResultEUTRAMeasResult = new MeasResultEUTRA_measResult();
            measResultEUTRAMeasResult.rsrpResult = new RSRP_Range((long)measResult.getMeasResult().getRsrpResult());
            measResultEUTRAMeasResult.rsrqResult = new RSRQ_Range((long)measResult.getMeasResult().getRsrqResult());
            measResultEUTRAs[index] = new MeasResultEUTRA((long)measResult.getPhysCellId(), measResultEUTRAMeasResult);
        }

        MeasResultListEUTRA measResultListEUTRA = new MeasResultListEUTRA(measResultEUTRAs);
        MeasurementReport_r8_IEs measurementReportR8IEs = new MeasurementReport_r8_IEs(new MeasResults((long)mapper.getMeasId(), measResultPCell));
        measurementReportR8IEs.measResults.measResultNeighCells = new MeasResults_measResultNeighCells();
        measurementReportR8IEs.measResults.measResultNeighCells.set_measResultListEUTRA(measResultListEUTRA);
        return measurementReportR8IEs;
    }

    private void hexDump() {
        System.out.println("########### RRC Measurement Report ############");
        this.getOrCreateEncodeBuffer().hexDump();
        System.out.println("------------------------------------------------");
    }
}
