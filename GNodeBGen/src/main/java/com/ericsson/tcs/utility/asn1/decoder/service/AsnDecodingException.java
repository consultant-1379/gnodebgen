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
 * ASN decoding exception.
 */
public class AsnDecodingException extends Exception {
    private static final long serialVersionUID = 5616835349423062745L;

    public AsnDecodingException(final Exception exception) {
        super(exception);
    }

    /**
     * Construct for ASN decoding exception.
     * @param message Message explaining exception reason.
     */
    public AsnDecodingException(final String message) {
        super(message);
    }
}
