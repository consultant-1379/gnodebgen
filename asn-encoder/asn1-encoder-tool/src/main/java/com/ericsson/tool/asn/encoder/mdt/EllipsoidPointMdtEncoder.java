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

import asn.mdt.generated.ellipsoidPoint.Ellipsoid_Point;
import asn.mdt.generated.ellipsoidPoint.Ellipsoid_Point_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidPointMapper;

public class EllipsoidPointMdtEncoder implements MdtEncoder {
    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        EllipsoidPointMapper ellipsoidPointMapper = (EllipsoidPointMapper) mapper;
        Ellipsoid_Point_latitudeSign latitudeSign = ellipsoidPointMapper.getLatitudeSign().equals("south") ? Ellipsoid_Point_latitudeSign.south() :
            Ellipsoid_Point_latitudeSign.north();
        Ellipsoid_Point ellipsoid_Point = new Ellipsoid_Point(latitudeSign, ellipsoidPointMapper.getDegreesLatitude(), ellipsoidPointMapper
            .getDegreesLongitude());
        try {
            final StringBuilder sb = new StringBuilder();
            ellipsoid_Point.print(sb, ellipsoid_Point.getAsn1TypeName(), 0);
            System.out.println(sb);
            ellipsoid_Point.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_POINT + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }
}
