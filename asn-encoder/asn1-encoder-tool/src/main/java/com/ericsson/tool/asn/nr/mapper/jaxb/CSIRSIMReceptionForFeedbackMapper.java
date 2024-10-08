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
 * <p>Java class for CSI-RS-IM-ReceptionForFeedbackMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CSI-RS-IM-ReceptionForFeedbackMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxConfigNumberNZP-CSI-RS-PerCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxConfigNumberPortsAcrossNZP-CSI-RS-PerCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="2"/&gt;
 *               &lt;maxInclusive value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxConfigNumberCSI-IM-PerCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="n1"/&gt;
 *               &lt;enumeration value="n2"/&gt;
 *               &lt;enumeration value="n4"/&gt;
 *               &lt;enumeration value="n8"/&gt;
 *               &lt;enumeration value="n16"/&gt;
 *               &lt;enumeration value="n32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberSimultaneousNZP-CSI-RS-PerCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalNumberPortsSimultaneousNZP-CSI-RS-PerCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="2"/&gt;
 *               &lt;maxInclusive value="256"/&gt;
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
@XmlType(name = "CSI-RS-IM-ReceptionForFeedbackMapper", propOrder = {
    "maxConfigNumberNZPCSIRSPerCC",
    "maxConfigNumberPortsAcrossNZPCSIRSPerCC",
    "maxConfigNumberCSIIMPerCC",
    "maxNumberSimultaneousNZPCSIRSPerCC",
    "totalNumberPortsSimultaneousNZPCSIRSPerCC"
})
public class CSIRSIMReceptionForFeedbackMapper {

    @XmlElement(name = "maxConfigNumberNZP-CSI-RS-PerCC")
    protected short maxConfigNumberNZPCSIRSPerCC;
    @XmlElement(name = "maxConfigNumberPortsAcrossNZP-CSI-RS-PerCC")
    protected int maxConfigNumberPortsAcrossNZPCSIRSPerCC;
    @XmlElement(name = "maxConfigNumberCSI-IM-PerCC", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maxConfigNumberCSIIMPerCC;
    @XmlElement(name = "maxNumberSimultaneousNZP-CSI-RS-PerCC")
    protected short maxNumberSimultaneousNZPCSIRSPerCC;
    @XmlElement(name = "totalNumberPortsSimultaneousNZP-CSI-RS-PerCC")
    protected int totalNumberPortsSimultaneousNZPCSIRSPerCC;

    /**
     * Gets the value of the maxConfigNumberNZPCSIRSPerCC property.
     * 
     */
    public short getMaxConfigNumberNZPCSIRSPerCC() {
        return maxConfigNumberNZPCSIRSPerCC;
    }

    /**
     * Sets the value of the maxConfigNumberNZPCSIRSPerCC property.
     * 
     */
    public void setMaxConfigNumberNZPCSIRSPerCC(short value) {
        this.maxConfigNumberNZPCSIRSPerCC = value;
    }

    /**
     * Gets the value of the maxConfigNumberPortsAcrossNZPCSIRSPerCC property.
     * 
     */
    public int getMaxConfigNumberPortsAcrossNZPCSIRSPerCC() {
        return maxConfigNumberPortsAcrossNZPCSIRSPerCC;
    }

    /**
     * Sets the value of the maxConfigNumberPortsAcrossNZPCSIRSPerCC property.
     * 
     */
    public void setMaxConfigNumberPortsAcrossNZPCSIRSPerCC(int value) {
        this.maxConfigNumberPortsAcrossNZPCSIRSPerCC = value;
    }

    /**
     * Gets the value of the maxConfigNumberCSIIMPerCC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxConfigNumberCSIIMPerCC() {
        return maxConfigNumberCSIIMPerCC;
    }

    /**
     * Sets the value of the maxConfigNumberCSIIMPerCC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxConfigNumberCSIIMPerCC(String value) {
        this.maxConfigNumberCSIIMPerCC = value;
    }

    /**
     * Gets the value of the maxNumberSimultaneousNZPCSIRSPerCC property.
     * 
     */
    public short getMaxNumberSimultaneousNZPCSIRSPerCC() {
        return maxNumberSimultaneousNZPCSIRSPerCC;
    }

    /**
     * Sets the value of the maxNumberSimultaneousNZPCSIRSPerCC property.
     * 
     */
    public void setMaxNumberSimultaneousNZPCSIRSPerCC(short value) {
        this.maxNumberSimultaneousNZPCSIRSPerCC = value;
    }

    /**
     * Gets the value of the totalNumberPortsSimultaneousNZPCSIRSPerCC property.
     * 
     */
    public int getTotalNumberPortsSimultaneousNZPCSIRSPerCC() {
        return totalNumberPortsSimultaneousNZPCSIRSPerCC;
    }

    /**
     * Sets the value of the totalNumberPortsSimultaneousNZPCSIRSPerCC property.
     * 
     */
    public void setTotalNumberPortsSimultaneousNZPCSIRSPerCC(int value) {
        this.totalNumberPortsSimultaneousNZPCSIRSPerCC = value;
    }

}
