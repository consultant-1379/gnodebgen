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

import com.ericsson.tool.asn.lte.mapper.jaxb.MdtReportMapper;

public enum MdtFields {
    HORIZONTAL_VELOCITY {
        final MdtEncoder instance = new HorizontalVelocityMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getHorizontalVelocity();
        }
    },
    ELLIPSOID_POINT {
        final MdtEncoder instance = new EllipsoidPointMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidPoint();
        }
    },
    ELLIPSOID_POINT_WITH_ALTI {
        final MdtEncoder instance = new EllipsoidPointWithAltitudeMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidPointWithAltitude();
        }
    },
    ELLIPSOID_POINT_WITH_UNCER_CIRCLE {
        final MdtEncoder instance = new EllipsoidPointWithUncertaintyCircleMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidPointWithUncertaintyCircle();
        }
    },
    ELLIPSOID_POINT_WITH_UNCER_ELLIPSE {
        final MdtEncoder instance = new EllipsoidPointWithUncertaintyEllipseMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidPointWithUncertaintyEllipse();
        }
    },
    ELLIPSOID_POINT_WITH_ALTI_AND_UNCER_ELLIPSOID {
        final MdtEncoder instance = new EllipsoidPointWithAltitudeAndUncertaintyEllipsoidMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidPointWithAltitudeAndUncertaintyEllipsoid();
        }
    },
    ELLIPSOID_ARC {
        final MdtEncoder instance = new EllipsoidArcMdtEncoder();

        @Override
        public MdtEncoder getEncoder() {
            return instance;
        }

        @Override
        public Object getMapper(final MdtReportMapper mdtReportMapper) {
            return mdtReportMapper.getEllipsoidArc();
        }
    };

    public abstract MdtEncoder getEncoder();

    public abstract Object getMapper(final MdtReportMapper mdtReportMapper);
}
