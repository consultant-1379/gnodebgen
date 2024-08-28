//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

import com.objsys.asn1j.runtime.Asn1PerEncodeBuffer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public abstract class Encoder {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());
    private Asn1PerEncodeBuffer encodeBuffer;

    public Encoder() {
    }

    public abstract void encodeAsn1(Object var1) throws IOException;

    public Asn1PerEncodeBuffer getOrCreateEncodeBuffer() {
        if (this.encodeBuffer == null) {
            this.encodeBuffer = new Asn1PerEncodeBuffer(this.isPerByteAlligned());
        }

        return this.encodeBuffer;
    }

    protected boolean isPerByteAlligned() {
        return true;
    }
}
