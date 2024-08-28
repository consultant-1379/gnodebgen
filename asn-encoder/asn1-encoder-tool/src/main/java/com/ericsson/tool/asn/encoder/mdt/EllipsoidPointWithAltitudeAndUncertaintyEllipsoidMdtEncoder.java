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

import asn.mdt.generated.ellipsoidPointWithAltitudeAndUncertaintyEllipsoid.EllipsoidPointWithAltitudeAndUncertaintyEllipsoid;
import asn.mdt.generated.ellipsoidPointWithAltitudeAndUncertaintyEllipsoid.EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection;
import asn.mdt.generated.ellipsoidPointWithAltitudeAndUncertaintyEllipsoid.EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMapper;

public class EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMdtEncoder implements MdtEncoder {

    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMapper ellipsoidMapper = (EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMapper) mapper;

        EllipsoidPointWithAltitudeAndUncertaintyEllipsoid uncertaintyEllipsoid =
            new EllipsoidPointWithAltitudeAndUncertaintyEllipsoid(getLatitudeSign(ellipsoidMapper), ellipsoidMapper.getDegreesLatitude(),
                ellipsoidMapper.getDegreesLongitude(), getAltitudeDirection(ellipsoidMapper), ellipsoidMapper.getAltitude(),
                ellipsoidMapper.getUncertaintySemiMajor(), ellipsoidMapper.getUncertaintySemiMinor(), ellipsoidMapper.getOrientationMajorAxis(),
                ellipsoidMapper.getUncertaintyAltitude(), ellipsoidMapper.getConfidence());

        try {
            final StringBuilder sb = new StringBuilder();
            uncertaintyEllipsoid.print(sb, uncertaintyEllipsoid.getAsn1TypeName(), 0);
            System.out.println(sb);
            uncertaintyEllipsoid.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_POINT_WITH_ALTI_AND_UNCER_ELLIPSOID + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }

    private EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign getLatitudeSign(
        final EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMapper ellipsoidMapper) {
        EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign latitudeSign;
        if (ellipsoidMapper.getLatitudeSign().equals("south")) {
            latitudeSign = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign.south();
        } else {
            latitudeSign = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_latitudeSign.north();
        }
        return latitudeSign;
    }

    private EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection getAltitudeDirection(
        final EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMapper ellipsoidMapper) {
        EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection altitudeDirection;
        if (ellipsoidMapper.getAltitudeDirection().equals("height")) {
            altitudeDirection = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection.height();
        } else {
            altitudeDirection = EllipsoidPointWithAltitudeAndUncertaintyEllipsoid_altitudeDirection.depth();
        }
        return altitudeDirection;
    }
}
