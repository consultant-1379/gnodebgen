//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.08.04 at 03:31:19 PM IST 
//


package com.ericsson.s345g.etcm.autogen;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OssMoc.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OssMoc">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NODE"/>
 *     &lt;enumeration value="CELL"/>
 *     &lt;enumeration value="CELL_RELATION"/>
 *     &lt;enumeration value="TERM_POINT_MME"/>
 *     &lt;enumeration value="TERM_POINT_ENB"/>
 *     &lt;enumeration value="PROCESSOR_LOAD"/>
 *     &lt;enumeration value="TAI"/>
 *     &lt;enumeration value="MME"/>
 *     &lt;enumeration value="CUUP"/>
 *     &lt;enumeration value="CUCP"/>
 *     &lt;enumeration value="DU"/>
 *     &lt;enumeration value="DU_CELL"/>
 *     &lt;enumeration value="CU_CELL"/>
 *     &lt;enumeration value="SCELL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OssMoc")
@XmlEnum
public enum OssMoc {

    NODE,
    CELL,
    CELL_RELATION,
    TERM_POINT_MME,
    TERM_POINT_ENB,
    PROCESSOR_LOAD,
    TAI,
    MME,
    CUUP,
    CUCP,
    DU,
    DU_CELL,
    CU_CELL,
    SCELL;

    public String value() {
        return name();
    }

    public static OssMoc fromValue(String v) {
        return valueOf(v);
    }

}
