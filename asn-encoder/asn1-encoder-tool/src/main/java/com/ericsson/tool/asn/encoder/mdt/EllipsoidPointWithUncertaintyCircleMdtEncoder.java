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

import asn.mdt.generated.ellipsoidPointWithUncertaintyCircle.Ellipsoid_PointWithUncertaintyCircle;
import asn.mdt.generated.ellipsoidPointWithUncertaintyCircle.Ellipsoid_PointWithUncertaintyCircle_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidPointWithUncertaintyCircleMapper;

public class EllipsoidPointWithUncertaintyCircleMdtEncoder implements MdtEncoder {

    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        final EllipsoidPointWithUncertaintyCircleMapper circleMapper = (EllipsoidPointWithUncertaintyCircleMapper) mapper;
        Ellipsoid_PointWithUncertaintyCircle uncertaintyCircle = new Ellipsoid_PointWithUncertaintyCircle(getLatitudeSign(circleMapper),
            circleMapper.getDegreesLatitude(), circleMapper.getDegreesLongitude(), circleMapper.getUncertainty());
        try {
            final StringBuilder sb = new StringBuilder();
            uncertaintyCircle.print(sb, uncertaintyCircle.getAsn1TypeName(), 0);
            System.out.println(sb);
            uncertaintyCircle.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_POINT_WITH_UNCER_CIRCLE + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }

    private Ellipsoid_PointWithUncertaintyCircle_latitudeSign getLatitudeSign(final EllipsoidPointWithUncertaintyCircleMapper circleMapper) {
        Ellipsoid_PointWithUncertaintyCircle_latitudeSign latitudeSign;
        if (circleMapper.getLatitudeSign().equals("south")) {
            latitudeSign = Ellipsoid_PointWithUncertaintyCircle_latitudeSign.south();
        } else {
            latitudeSign = Ellipsoid_PointWithUncertaintyCircle_latitudeSign.north();
        }
        return latitudeSign;
    }

}
