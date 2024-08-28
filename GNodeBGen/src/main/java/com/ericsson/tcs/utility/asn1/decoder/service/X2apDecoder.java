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
 * X2APDecoder attributes.
 *
 */
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.X2AP;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.X2AP_CLASS_NAME;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.X2AP_SUB_PACKAGE_NAME;

/**
 * Setting up X2AP Decoder.
 */
public class X2apDecoder extends Decoder {

    /**
     * Setting up X2AP Decoder based on package name.
     * @param packageName the package name the generated POJO's reside in.
     */

    protected X2apDecoder(final String packageName) {
        asnType = null;
        createAsnTypeNewInstance(packageName, X2AP_SUB_PACKAGE_NAME, X2AP_CLASS_NAME);
    }

    @Override
    protected String getName() {
        return X2AP;
    }

    public static boolean isX2ap(final String protocolName) {
        return protocolName.contains(X2AP);
    }
}
