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
package com.ericsson.tool.asn.encoder;

import java.io.IOException;

import com.ericsson.tool.asn.encoder.mdt.MdtFields;
import com.ericsson.tool.asn.lte.mapper.jaxb.MdtReportMapper;

public class MdtM1Report extends Encoder {


    private void hexDump() {
        for (MdtFields mdtFields : MdtFields.values()) {
            mdtFields.getEncoder().print();
        }
    }

    @Override
    public void encodeAsn1(final Object mapper) throws IOException {
        validateInput(mapper);
        for (MdtFields mdtFields : MdtFields.values()) {
            Object coordinateMapper = mdtFields.getMapper((MdtReportMapper) mapper);
            if (coordinateMapper != null) {
                mdtFields.getEncoder().encode(coordinateMapper);
            }
        }
        hexDump();
    }

    private void validateInput(final Object mapper) {
        if (!(mapper instanceof MdtReportMapper)) {
            throw new IllegalArgumentException("Input mapper is not instance of MdtReportMapper");
        }
    }
}
