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
 * ASN Message decoder decoder.
 * The appropriate asn decoder is instantiated based on protocol name and package name.
 */

public class AsnNrDecoder {
    private Decoder decoder;

    /**
     * Setting up appropriate decoder using decoder factory.
     * @param protocolNameAsString for example X2AP_36_423.
     * @param packageName for example X2AP_36_423_v15_3_0.
     */
    public AsnNrDecoder(final String protocolNameAsString, final String packageName) throws AsnDecodingException {
        if ((protocolNameAsString != null) && (packageName != null)) {
            this.decoder = DecoderFactory.decoderInstance(protocolNameAsString, packageName);
        }
    }

    public String decode(final String eventName, final byte[] asnMessageContents) throws AsnDecodingException {
        return decoder == null ? null : decoder.decode(asnMessageContents, eventName);
    }

    public Decoder getDecoder() {
        return decoder;
    }
}
