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

import asn.mdt.generated.ellipsoidArc.EllipsoidArc;
import asn.mdt.generated.ellipsoidArc.EllipsoidArc_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidArcMapper;

public class EllipsoidArcMdtEncoder implements MdtEncoder {
    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        final EllipsoidArcMapper arcMapper = (EllipsoidArcMapper) mapper;
        EllipsoidArc_latitudeSign latitudeSign = arcMapper.getLatitudeSign().equals("north") ? EllipsoidArc_latitudeSign.north() :
            EllipsoidArc_latitudeSign.south();
        final EllipsoidArc ellipsoidArc = new EllipsoidArc(latitudeSign, arcMapper.getDegreesLatitude(), arcMapper.getDegreesLongitude(),
            arcMapper.getInnerRadius(), arcMapper.getUncertaintyRadius(), arcMapper.getOffsetAngle(), arcMapper.getIncludedAngle(), arcMapper
            .getConfidence());
        try {
            final StringBuilder sb = new StringBuilder();
            ellipsoidArc.print(sb, ellipsoidArc.getAsn1TypeName(), 0);
            System.out.println(sb);
            ellipsoidArc.encode(asn1PerEncodeBuffer);

        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_ARC + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }

}
