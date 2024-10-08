//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:27 PM IST 
//


package com.ericsson.tool.asn.lte.mapper.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CriticalityMapper.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CriticalityMapper"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="reject"/&gt;
 *     &lt;enumeration value="ignore"/&gt;
 *     &lt;enumeration value="notify"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CriticalityMapper")
@XmlEnum
public enum CriticalityMapper {

    @XmlEnumValue("reject")
    REJECT("reject"),
    @XmlEnumValue("ignore")
    IGNORE("ignore"),
    @XmlEnumValue("notify")
    NOTIFY("notify");
    private final String value;

    CriticalityMapper(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CriticalityMapper fromValue(String v) {
        for (CriticalityMapper c: CriticalityMapper.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
