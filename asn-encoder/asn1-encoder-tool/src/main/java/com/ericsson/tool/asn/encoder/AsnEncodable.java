//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import java.io.IOException;

public interface AsnEncodable {
    void hexDump();

    void encodeAsn1(Object var1) throws IOException;

    boolean isPerByteAlligned();
}
