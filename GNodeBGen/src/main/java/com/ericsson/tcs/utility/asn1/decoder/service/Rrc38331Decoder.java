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
 * RRCDecoder attributes.
 *
 */
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.MESSAGE;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.NR_RRC_SUB_PACKAGE_NAME;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.PROTOCOL_NAME_RRC_38_331;
import static com.ericsson.tcs.utility.asn1.constant.GpbDecoderAsnConstants.RRC_38_331;

/**
 * Setting up the Rrc38331Decoder.
 */
public class Rrc38331Decoder extends Decoder {
    protected Rrc38331Decoder(final String protocolName, final String packageName) {
        /**
         * For RRC there are more than one class option that could be instantiated.
         * For this reason we need to take the protocolname and single out the classname and tag on Message to it.
         * For example class BCCH_BCH_Message was constructed with protocol PROTOCOL_NAME_RRC_38_331_BCCH_BCH_MESSAGE
         */
    	
        asnType = null;
        final int startPos = protocolName.indexOf(PROTOCOL_NAME_RRC_38_331) + PROTOCOL_NAME_RRC_38_331.length();
        // Package Name is Case Sensitive, So 'Message' not MESSAGE
        final int endPos = protocolName.indexOf(MESSAGE);
        final String className = protocolName.substring(startPos, endPos) + "Message";

        createAsnTypeNewInstance(packageName, NR_RRC_SUB_PACKAGE_NAME, className);
    }

    @Override
    protected String getName() {
        return RRC_38_331;
    }

    // false for RRC related protocols; true o/w
    @Override
    protected boolean isPerByteAlligned() {
        return false;
    }

    public static boolean isRrc38331(final String protocolName) {
        return protocolName.contains(RRC_38_331);
    }
}
