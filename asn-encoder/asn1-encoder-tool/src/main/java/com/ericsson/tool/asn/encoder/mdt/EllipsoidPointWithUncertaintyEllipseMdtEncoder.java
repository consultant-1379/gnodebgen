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

import asn.mdt.generated.ellipsoidPointWithUncertaintyEllipse.EllipsoidPointWithUncertaintyEllipse;
import asn.mdt.generated.ellipsoidPointWithUncertaintyEllipse.EllipsoidPointWithUncertaintyEllipse_latitudeSign;
import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;

import com.ericsson.tool.asn.lte.mapper.jaxb.EllipsoidPointWithUncertaintyEllipseMapper;

public class EllipsoidPointWithUncertaintyEllipseMdtEncoder implements MdtEncoder {

    final Asn1PerEncodeBuffer asn1PerEncodeBuffer = new Asn1PerEncodeBuffer(false);

    @Override
    public void encode(final Object mapper) {
        asn1PerEncodeBuffer.reset();
        final EllipsoidPointWithUncertaintyEllipseMapper ellipseMapper = (EllipsoidPointWithUncertaintyEllipseMapper) mapper;
        final EllipsoidPointWithUncertaintyEllipse uncertaintyEllipse = new EllipsoidPointWithUncertaintyEllipse(getLatitudeSign(ellipseMapper),
            ellipseMapper.getDegreesLatitude(), ellipseMapper.getDegreesLongitude(), ellipseMapper.getUncertaintySemiMajor(),
            ellipseMapper.getUncertaintySemiMinor(), ellipseMapper.getOrientationMajorAxis(), ellipseMapper.getConfidence());
        try {
            final StringBuilder sb = new StringBuilder();
            uncertaintyEllipse.print(sb, uncertaintyEllipse.getAsn1TypeName(), 0);
            System.out.println(sb);
            uncertaintyEllipse.encode(asn1PerEncodeBuffer);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }


    @Override
    public void print() {
        System.out.println("########## " + MdtFields.ELLIPSOID_POINT_WITH_UNCER_ELLIPSE + " ################");
        asn1PerEncodeBuffer.hexDump();
        System.out.println("-----------------------------------------------------------");
    }

    private EllipsoidPointWithUncertaintyEllipse_latitudeSign getLatitudeSign(final EllipsoidPointWithUncertaintyEllipseMapper ellipseMapper) {
        EllipsoidPointWithUncertaintyEllipse_latitudeSign latitudeSign;
        if (ellipseMapper.getLatitudeSign().equals("south")) {
            latitudeSign = EllipsoidPointWithUncertaintyEllipse_latitudeSign.south();
        } else {
            latitudeSign = EllipsoidPointWithUncertaintyEllipse_latitudeSign.north();
        }
        return latitudeSign;
    }

}
