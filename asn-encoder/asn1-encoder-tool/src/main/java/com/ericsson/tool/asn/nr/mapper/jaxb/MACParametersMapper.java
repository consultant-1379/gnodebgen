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
 * <p>Java class for MAC-ParametersMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAC-ParametersMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mac-ParametersCommon" type="{http://www.obj-sys.com/NR-RRC-Definitions}MAC-ParametersCommonMapper" minOccurs="0"/&gt;
 *         &lt;element name="mac-ParametersXDD-Diff" type="{http://www.obj-sys.com/NR-RRC-Definitions}MAC-ParametersXDD-DiffMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MAC-ParametersMapper", propOrder = {
    "macParametersCommon",
    "macParametersXDDDiff"
})
public class MACParametersMapper {

    @XmlElement(name = "mac-ParametersCommon")
    protected MACParametersCommonMapper macParametersCommon;
    @XmlElement(name = "mac-ParametersXDD-Diff")
    protected MACParametersXDDDiffMapper macParametersXDDDiff;

    /**
     * Gets the value of the macParametersCommon property.
     * 
     * @return
     *     possible object is
     *     {@link MACParametersCommonMapper }
     *     
     */
    public MACParametersCommonMapper getMacParametersCommon() {
        return macParametersCommon;
    }

    /**
     * Sets the value of the macParametersCommon property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACParametersCommonMapper }
     *     
     */
    public void setMacParametersCommon(MACParametersCommonMapper value) {
        this.macParametersCommon = value;
    }

    /**
     * Gets the value of the macParametersXDDDiff property.
     * 
     * @return
     *     possible object is
     *     {@link MACParametersXDDDiffMapper }
     *     
     */
    public MACParametersXDDDiffMapper getMacParametersXDDDiff() {
        return macParametersXDDDiff;
    }

    /**
     * Sets the value of the macParametersXDDDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACParametersXDDDiffMapper }
     *     
     */
    public void setMacParametersXDDDiff(MACParametersXDDDiffMapper value) {
        this.macParametersXDDDiff = value;
    }

}
