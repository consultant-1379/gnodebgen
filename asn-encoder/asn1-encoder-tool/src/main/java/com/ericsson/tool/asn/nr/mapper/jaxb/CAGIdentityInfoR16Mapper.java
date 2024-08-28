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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CAG-IdentityInfo-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CAG-IdentityInfo-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cag-Identity-r16"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.obj-sys.com/v1.0/XMLSchema}BitString"&gt;
 *               &lt;length value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="manualCAGselectionAllowed-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CAG-IdentityInfo-r16Mapper", namespace = "", propOrder = {
    "cagIdentityR16",
    "manualCAGselectionAllowedR16"
})
public class CAGIdentityInfoR16Mapper {

    @XmlElement(name = "cag-Identity-r16", required = true)
    protected String cagIdentityR16;
    @XmlElement(name = "manualCAGselectionAllowed-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String manualCAGselectionAllowedR16;

    /**
     * Gets the value of the cagIdentityR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCagIdentityR16() {
        return cagIdentityR16;
    }

    /**
     * Sets the value of the cagIdentityR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCagIdentityR16(String value) {
        this.cagIdentityR16 = value;
    }

    /**
     * Gets the value of the manualCAGselectionAllowedR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManualCAGselectionAllowedR16() {
        return manualCAGselectionAllowedR16;
    }

    /**
     * Sets the value of the manualCAGselectionAllowedR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManualCAGselectionAllowedR16(String value) {
        this.manualCAGselectionAllowedR16 = value;
    }

}
