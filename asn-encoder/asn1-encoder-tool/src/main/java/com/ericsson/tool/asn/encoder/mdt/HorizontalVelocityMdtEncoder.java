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
package com.ericsson.tool.asn.encoder.mdt;

import java.io.IOException;

import asn.mdt.generated.horizontalVelocity.HorizontalVelocity;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.HorizontalVelocityMapper;

public class HorizontalVelocityMdtEncoder implements MdtEncoder {
    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        final HorizontalVelocityMapper velocityMapper = (HorizontalVelocityMapper) mapper;
        final HorizontalVelocity horizontalVelocity = new HorizontalVelocity(velocityMapper.getBearing(),velocityMapper.getHorizontalSpeed());
        try {
            final StringBuilder sb = new StringBuilder();
            horizontalVelocity.print(sb, horizontalVelocity.getAsn1TypeName(), 0);
            System.out.println(sb);
            horizontalVelocity.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.HORIZONTAL_VELOCITY + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }
}
