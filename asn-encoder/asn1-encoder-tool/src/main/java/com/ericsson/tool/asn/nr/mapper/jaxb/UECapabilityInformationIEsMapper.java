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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for UECapabilityInformation-IEsMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UECapabilityInformation-IEsMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ue-CapabilityRAT-ContainerList" type="{http://www.obj-sys.com/NR-RRC-Definitions}UE-CapabilityRAT-ContainerListMapper" minOccurs="0"/&gt;
 *         &lt;element name="lateNonCriticalExtension" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="nonCriticalExtension" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "UECapabilityInformation-IEsMapper", propOrder = {
    "ueCapabilityRATContainerList",
    "lateNonCriticalExtension",
    "nonCriticalExtension"
})
public class UECapabilityInformationIEsMapper {

    @XmlElement(name = "ue-CapabilityRAT-ContainerList")
    protected UECapabilityRATContainerListMapper ueCapabilityRATContainerList;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] lateNonCriticalExtension;
    protected UECapabilityInformationIEsMapper.NonCriticalExtension nonCriticalExtension;

    /**
     * Gets the value of the ueCapabilityRATContainerList property.
     * 
     * @return
     *     possible object is
     *     {@link UECapabilityRATContainerListMapper }
     *     
     */
    public UECapabilityRATContainerListMapper getUeCapabilityRATContainerList() {
        return ueCapabilityRATContainerList;
    }

    /**
     * Sets the value of the ueCapabilityRATContainerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UECapabilityRATContainerListMapper }
     *     
     */
    public void setUeCapabilityRATContainerList(UECapabilityRATContainerListMapper value) {
        this.ueCapabilityRATContainerList = value;
    }

    /**
     * Gets the value of the lateNonCriticalExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getLateNonCriticalExtension() {
        return lateNonCriticalExtension;
    }

    /**
     * Sets the value of the lateNonCriticalExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateNonCriticalExtension(byte[] value) {
        this.lateNonCriticalExtension = value;
    }

    /**
     * Gets the value of the nonCriticalExtension property.
     * 
     * @return
     *     possible object is
     *     {@link UECapabilityInformationIEsMapper.NonCriticalExtension }
     *     
     */
    public UECapabilityInformationIEsMapper.NonCriticalExtension getNonCriticalExtension() {
        return nonCriticalExtension;
    }

    /**
     * Sets the value of the nonCriticalExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link UECapabilityInformationIEsMapper.NonCriticalExtension }
     *     
     */
    public void setNonCriticalExtension(UECapabilityInformationIEsMapper.NonCriticalExtension value) {
        this.nonCriticalExtension = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NonCriticalExtension {


    }

}
