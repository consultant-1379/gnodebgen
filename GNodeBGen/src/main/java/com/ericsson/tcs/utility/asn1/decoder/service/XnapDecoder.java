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
 * XNAPDecoder attributes.
 *
 */
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.XNAP;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.XNAP_CLASS_NAME;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.XNAP_SUB_PACKAGE_NAME;

/**
 * Setting up XNAP Decoder.
 */
public class XnapDecoder extends Decoder {
    /**
     * Setting up XNAP Decoder based on package name.
     * @param packageName the package name the generated POJO's reside in.
     */
    protected XnapDecoder(final String packageName) {
        asnType = null;
        createAsnTypeNewInstance(packageName, XNAP_SUB_PACKAGE_NAME, XNAP_CLASS_NAME);
    }

    @Override
    protected String getName() {
        return XNAP;
    }

    public static boolean isXnap(final String protocolName) {
        return protocolName.contains(XNAP);
    }
}