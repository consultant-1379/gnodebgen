//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MAC-ParametersSidelink-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAC-ParametersSidelink-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mac-ParametersSidelinkCommon-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MAC-ParametersSidelinkCommon-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="mac-ParametersSidelinkXDD-Diff-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MAC-ParametersSidelinkXDD-Diff-r16Mapper" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAC-ParametersSidelink-r16Mapper", propOrder = {
    "macParametersSidelinkCommonR16",
    "macParametersSidelinkXDDDiffR16",
    "any"
})
public class MACParametersSidelinkR16Mapper {

    @XmlElement(name = "mac-ParametersSidelinkCommon-r16")
    protected MACParametersSidelinkCommonR16Mapper macParametersSidelinkCommonR16;
    @XmlElement(name = "mac-ParametersSidelinkXDD-Diff-r16")
    protected MACParametersSidelinkXDDDiffR16Mapper macParametersSidelinkXDDDiffR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the macParametersSidelinkCommonR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MACParametersSidelinkCommonR16Mapper }
     *     
     */
    public MACParametersSidelinkCommonR16Mapper getMacParametersSidelinkCommonR16() {
        return macParametersSidelinkCommonR16;
    }

    /**
     * Sets the value of the macParametersSidelinkCommonR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACParametersSidelinkCommonR16Mapper }
     *     
     */
    public void setMacParametersSidelinkCommonR16(MACParametersSidelinkCommonR16Mapper value) {
        this.macParametersSidelinkCommonR16 = value;
    }

    /**
     * Gets the value of the macParametersSidelinkXDDDiffR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MACParametersSidelinkXDDDiffR16Mapper }
     *     
     */
    public MACParametersSidelinkXDDDiffR16Mapper getMacParametersSidelinkXDDDiffR16() {
        return macParametersSidelinkXDDDiffR16;
    }

    /**
     * Sets the value of the macParametersSidelinkXDDDiffR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACParametersSidelinkXDDDiffR16Mapper }
     *     
     */
    public void setMacParametersSidelinkXDDDiffR16(MACParametersSidelinkXDDDiffR16Mapper value) {
        this.macParametersSidelinkXDDDiffR16 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
    }

}
