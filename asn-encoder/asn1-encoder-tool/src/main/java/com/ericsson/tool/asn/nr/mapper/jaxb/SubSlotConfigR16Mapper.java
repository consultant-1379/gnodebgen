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
 * <p>Java class for SubSlot-Config-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubSlot-Config-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sub-SlotConfig-NCP-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="n4"/&gt;
 *               &lt;enumeration value="n5"/&gt;
 *               &lt;enumeration value="n6"/&gt;
 *               &lt;enumeration value="n7"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sub-SlotConfig-ECP-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="n4"/&gt;
 *               &lt;enumeration value="n5"/&gt;
 *               &lt;enumeration value="n6"/&gt;
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
@XmlType(name = "SubSlot-Config-r16Mapper", propOrder = {
    "subSlotConfigNCPR16",
    "subSlotConfigECPR16"
})
public class SubSlotConfigR16Mapper {

    @XmlElement(name = "sub-SlotConfig-NCP-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subSlotConfigNCPR16;
    @XmlElement(name = "sub-SlotConfig-ECP-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subSlotConfigECPR16;

    /**
     * Gets the value of the subSlotConfigNCPR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSlotConfigNCPR16() {
        return subSlotConfigNCPR16;
    }

    /**
     * Sets the value of the subSlotConfigNCPR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSlotConfigNCPR16(String value) {
        this.subSlotConfigNCPR16 = value;
    }

    /**
     * Gets the value of the subSlotConfigECPR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubSlotConfigECPR16() {
        return subSlotConfigECPR16;
    }

    /**
     * Sets the value of the subSlotConfigECPR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubSlotConfigECPR16(String value) {
        this.subSlotConfigECPR16 = value;
    }

}
