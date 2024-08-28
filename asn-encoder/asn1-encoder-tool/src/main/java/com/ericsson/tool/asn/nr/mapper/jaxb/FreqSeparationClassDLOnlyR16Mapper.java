//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreqSeparationClassDL-Only-r16Mapper.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FreqSeparationClassDL-Only-r16Mapper"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="mhz200"/&gt;
 *     &lt;enumeration value="mhz400"/&gt;
 *     &lt;enumeration value="mhz600"/&gt;
 *     &lt;enumeration value="mhz800"/&gt;
 *     &lt;enumeration value="mhz1000"/&gt;
 *     &lt;enumeration value="mhz1200"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FreqSeparationClassDL-Only-r16Mapper")
@XmlEnum
public enum FreqSeparationClassDLOnlyR16Mapper {

    @XmlEnumValue("mhz200")
    MHZ_200("mhz200"),
    @XmlEnumValue("mhz400")
    MHZ_400("mhz400"),
    @XmlEnumValue("mhz600")
    MHZ_600("mhz600"),
    @XmlEnumValue("mhz800")
    MHZ_800("mhz800"),
    @XmlEnumValue("mhz1000")
    MHZ_1000("mhz1000"),
    @XmlEnumValue("mhz1200")
    MHZ_1200("mhz1200");
    private final String value;

    FreqSeparationClassDLOnlyR16Mapper(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FreqSeparationClassDLOnlyR16Mapper fromValue(String v) {
        for (FreqSeparationClassDLOnlyR16Mapper c: FreqSeparationClassDLOnlyR16Mapper.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
