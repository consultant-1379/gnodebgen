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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Finds event decoder based on Protocol Name specified in NR Event.
 */

public final class DecoderFactory {
    private static final Logger logger = LoggerFactory.getLogger(DecoderFactory.class);

    private DecoderFactory() {
    }
    /**
     * Setting up the decoder instance based on protocol name and package name.
     * @param protocolName for example X2AP_36_423.
     * @param packageName for example X2AP_36_423_v15_3_0.
     */

    protected static Decoder decoderInstance(final String protocolName, final String packageName) throws AsnDecodingException {
        Decoder decoder = null;
        if (X2apDecoder.isX2ap(protocolName)) {
            decoder = new X2apDecoder(packageName);
        } else if (Rrc38331Decoder.isRrc38331(protocolName)) {
            decoder = new Rrc38331Decoder(protocolName, packageName);
        } else if (NgapDecoder.isNgap(protocolName)) {
            decoder = new NgapDecoder(packageName);
        } else if (XnapDecoder.isXnap(protocolName)) {
            decoder = new XnapDecoder(packageName);
        } else {
            logger.error("No decoder could be found using package name: {}", packageName);
            throw new AsnDecodingException(String.format("No decoder could be found using package name: %s", packageName));
        }

        return decoder;
    }

}
