//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasResultSRS-RSRP-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultSRS-RSRP-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srs-ResourceId-r16" type="{}SRS-ResourceIdMapper"/&gt;
 *         &lt;element name="srs-RSRP-Result-r16" type="{}SRS-RSRP-Range-r16Mapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasResultSRS-RSRP-r16Mapper", namespace = "", propOrder = {
    "srsResourceIdR16",
    "srsRSRPResultR16"
})
public class MeasResultSRSRSRPR16Mapper {

    @XmlElement(name = "srs-ResourceId-r16")
    @XmlSchemaType(name = "unsignedByte")
    protected short srsResourceIdR16;
    @XmlElement(name = "srs-RSRP-Result-r16")
    @XmlSchemaType(name = "unsignedByte")
    protected short srsRSRPResultR16;

    /**
     * Gets the value of the srsResourceIdR16 property.
     * 
     */
    public short getSrsResourceIdR16() {
        return srsResourceIdR16;
    }

    /**
     * Sets the value of the srsResourceIdR16 property.
     * 
     */
    public void setSrsResourceIdR16(short value) {
        this.srsResourceIdR16 = value;
    }

    /**
     * Gets the value of the srsRSRPResultR16 property.
     * 
     */
    public short getSrsRSRPResultR16() {
        return srsRSRPResultR16;
    }

    /**
     * Sets the value of the srsRSRPResultR16 property.
     * 
     */
    public void setSrsRSRPResultR16(short value) {
        this.srsRSRPResultR16 = value;
    }

}
