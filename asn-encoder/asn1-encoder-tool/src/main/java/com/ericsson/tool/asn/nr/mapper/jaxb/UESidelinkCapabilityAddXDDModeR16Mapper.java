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


/**
 * <p>Java class for UE-SidelinkCapabilityAddXDD-Mode-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UE-SidelinkCapabilityAddXDD-Mode-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mac-ParametersSidelinkXDD-Diff-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MAC-ParametersSidelinkXDD-Diff-r16Mapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UE-SidelinkCapabilityAddXDD-Mode-r16Mapper", propOrder = {
    "macParametersSidelinkXDDDiffR16"
})
public class UESidelinkCapabilityAddXDDModeR16Mapper {

    @XmlElement(name = "mac-ParametersSidelinkXDD-Diff-r16")
    protected MACParametersSidelinkXDDDiffR16Mapper macParametersSidelinkXDDDiffR16;

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

}
