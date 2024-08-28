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
import com.objsys.asn1j.runtime.Asn1PerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1Type;

/**
 * Creates the appropriate ASN decoder class based on protocol and package.
 */
public abstract class Decoder {
    protected static final Logger logger = LoggerFactory.getLogger(Decoder.class);
    private static final String ASN_CLASSNAME_FORMAT = "asn.generated.%s.%s.%s";
    protected Asn1Type asnType;

    protected abstract String getName();

    protected String decode(final byte[] bytesToDecode, final String eventName) throws AsnDecodingException {
        final StringBuilder stringBuilder = new StringBuilder();
        try {
            if (asnType != null) {
                asnType.decode(new Asn1PerDecodeBuffer(bytesToDecode, isPerByteAlligned()));
                asnType.print(stringBuilder, asnType.getAsn1TypeName(), 0);
            }
        } catch (final Exception e) {
            logger.error("ASN.1 decoding failed for event name: {} using byteCode: {} and AsnTypeName: {}",
                    eventName, bytesToDecode, asnType.getAsn1TypeName());
            throw new AsnDecodingException(e);
        }
        if (logger.isTraceEnabled()) {
            logger.trace("ASN.1 decoded for event name: {} using byteCode: {} and AsnTypeName: {} produced decoded asn message: \n{}", eventName,
                    bytesToDecode == null ? "null" : bytesToDecode, asnType == null ? "null" : asnType.getAsn1TypeName(),
                    stringBuilder);
        }
        return stringBuilder.toString();
    }

    // false for RRC related protocols; true o/w
    protected boolean isPerByteAlligned() {
        return true;
    }

    @SuppressWarnings("unchecked")
    protected void createAsnTypeNewInstance(final String packageName, final String subPackageName, final String className) {
        final String fullClassName = String.format(ASN_CLASSNAME_FORMAT, packageName, subPackageName, className);
        try {
            final Class<com.objsys.asn1j.runtime.Asn1Choice> decoderPdu = (Class<com.objsys.asn1j.runtime.Asn1Choice>) Class
                    .forName(fullClassName);
            asnType = decoderPdu.newInstance();
        } catch (final Exception e) {
            logger.warn("Could not instantiate Sub Type PDU for {} class, using {} package name.", className, packageName);
        }
    }

    /**
     * Setting asnType.
     * @param asnType
     *            The asnType to set.
     */
    public void setAsnType(final Asn1Type asnType) {
        this.asnType = asnType;
    }

    /**
     * Return the asnType.
     */
    public Asn1Type getAsnType() {
        return asnType;
    }
}
