//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.ericsson.tool.asn.encoder;

public class Event {
    private final String name;
    private final int id;
    private final Encoder encoder;
    private final Class mapperClass;

    public Event(String name, int id, Encoder encoder, Class mapperClass) {
        this.name = name;
        this.id = id;
        this.encoder = encoder;
        this.mapperClass = mapperClass;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public Encoder getEncoder() {
        return this.encoder;
    }

    public Class getMapperClass() {
        return this.mapperClass;
    }
}
