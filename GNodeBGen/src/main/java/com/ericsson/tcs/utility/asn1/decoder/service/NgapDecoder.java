/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2019
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/

package com.ericsson.tcs.utility.asn1.decoder.service;

/**
 * NGAPDecoder attributes.
 *
 */
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.NGAP;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.NGAP_CLASS_NAME;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.NGAP_SUB_PACKAGE_NAME;

/**
 * Setting up NGAP Decoder.
 */
public class NgapDecoder extends Decoder {
    /**
     * Setting up ASN decoder based on package name.
     * @param packageName the package name the generated POJO's reside in.
     */
    protected NgapDecoder(final String packageName) {
        asnType = null;
        createAsnTypeNewInstance(packageName, NGAP_SUB_PACKAGE_NAME, NGAP_CLASS_NAME);
    }

    @Override
    protected String getName() {
        return NGAP;
    }

    public static boolean isNgap(final String protocolName) {
        return protocolName.contains(NGAP);
    }
}