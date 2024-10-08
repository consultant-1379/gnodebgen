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
 * <p>Java class for CA-ParametersNRDC-v1610Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA-ParametersNRDC-v1610Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intraFR-NR-DC-PwrSharingMode1-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="intraFR-NR-DC-PwrSharingMode2-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="intraFR-NR-DC-DynamicPwrSharing-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="short"/&gt;
 *               &lt;enumeration value="long"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="asyncNRDC-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
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
@XmlType(name = "CA-ParametersNRDC-v1610Mapper", propOrder = {
    "intraFRNRDCPwrSharingMode1R16",
    "intraFRNRDCPwrSharingMode2R16",
    "intraFRNRDCDynamicPwrSharingR16",
    "asyncNRDCR16"
})
public class CAParametersNRDCV1610Mapper {

    @XmlElement(name = "intraFR-NR-DC-PwrSharingMode1-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intraFRNRDCPwrSharingMode1R16;
    @XmlElement(name = "intraFR-NR-DC-PwrSharingMode2-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intraFRNRDCPwrSharingMode2R16;
    @XmlElement(name = "intraFR-NR-DC-DynamicPwrSharing-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intraFRNRDCDynamicPwrSharingR16;
    @XmlElement(name = "asyncNRDC-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String asyncNRDCR16;

    /**
     * Gets the value of the intraFRNRDCPwrSharingMode1R16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraFRNRDCPwrSharingMode1R16() {
        return intraFRNRDCPwrSharingMode1R16;
    }

    /**
     * Sets the value of the intraFRNRDCPwrSharingMode1R16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraFRNRDCPwrSharingMode1R16(String value) {
        this.intraFRNRDCPwrSharingMode1R16 = value;
    }

    /**
     * Gets the value of the intraFRNRDCPwrSharingMode2R16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraFRNRDCPwrSharingMode2R16() {
        return intraFRNRDCPwrSharingMode2R16;
    }

    /**
     * Sets the value of the intraFRNRDCPwrSharingMode2R16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraFRNRDCPwrSharingMode2R16(String value) {
        this.intraFRNRDCPwrSharingMode2R16 = value;
    }

    /**
     * Gets the value of the intraFRNRDCDynamicPwrSharingR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraFRNRDCDynamicPwrSharingR16() {
        return intraFRNRDCDynamicPwrSharingR16;
    }

    /**
     * Sets the value of the intraFRNRDCDynamicPwrSharingR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraFRNRDCDynamicPwrSharingR16(String value) {
        this.intraFRNRDCDynamicPwrSharingR16 = value;
    }

    /**
     * Gets the value of the asyncNRDCR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsyncNRDCR16() {
        return asyncNRDCR16;
    }

    /**
     * Sets the value of the asyncNRDCR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsyncNRDCR16(String value) {
        this.asyncNRDCR16 = value;
    }

}
