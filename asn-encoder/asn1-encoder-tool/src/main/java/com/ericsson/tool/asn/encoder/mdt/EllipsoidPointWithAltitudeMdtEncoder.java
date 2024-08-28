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

import asn.mdt.generated.ellipsoidPointWithAltitude.EllipsoidPointWithAltitude;
import asn.mdt.generated.ellipsoidPointWithAltitude.EllipsoidPointWithAltitude_altitudeDirection;
import asn.mdt.generated.ellipsoidPointWithAltitude.EllipsoidPointWithAltitude_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidPointWithAltitudeMapper;

public class EllipsoidPointWithAltitudeMdtEncoder implements MdtEncoder {

    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        final EllipsoidPointWithAltitudeMapper altitudeMapper = (EllipsoidPointWithAltitudeMapper) mapper;
        final EllipsoidPointWithAltitude altitude = new EllipsoidPointWithAltitude(getLatitudeSign(altitudeMapper),
            altitudeMapper.getDegreesLatitude(), altitudeMapper.getDegreesLongitude(), getAltitudeDirection(altitudeMapper), altitudeMapper
            .getAltitude());
        try {
            final StringBuilder sb = new StringBuilder();
            altitude.print(sb, altitude.getAsn1TypeName(), 0);
            System.out.println(sb);
            altitude.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_POINT_WITH_ALTI + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }

    private EllipsoidPointWithAltitude_latitudeSign getLatitudeSign(final EllipsoidPointWithAltitudeMapper altitudeMapper) {
        EllipsoidPointWithAltitude_latitudeSign latitudeSign;
        if (altitudeMapper.getLatitudeSign().equals("south")) {
            latitudeSign = EllipsoidPointWithAltitude_latitudeSign.south();
        } else {
            latitudeSign = EllipsoidPointWithAltitude_latitudeSign.north();
        }
        return latitudeSign;
    }

    private EllipsoidPointWithAltitude_altitudeDirection getAltitudeDirection(final EllipsoidPointWithAltitudeMapper ellipsoidMapper) {
        EllipsoidPointWithAltitude_altitudeDirection altitudeDirection;
        if (ellipsoidMapper.getAltitudeDirection().equals("height")) {
            altitudeDirection = EllipsoidPointWithAltitude_altitudeDirection.height();
        } else {
            altitudeDirection = EllipsoidPointWithAltitude_altitudeDirection.depth();
        }
        return altitudeDirection;
    }

}
