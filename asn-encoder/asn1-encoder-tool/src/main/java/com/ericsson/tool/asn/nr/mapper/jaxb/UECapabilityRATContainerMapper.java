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
 * <p>Java class for UE-CapabilityRAT-ContainerMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UE-CapabilityRAT-ContainerMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rat-Type" type="{http://www.obj-sys.com/NR-RRC-Definitions}RAT-TypeMapper"/&gt;
 *         &lt;element name="ue-CapabilityRAT-Container" type="{http://www.w3.org/2001/XMLSchema}hexBinary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UE-CapabilityRAT-ContainerMapper", propOrder = {
    "ratType",
    "ueCapabilityRATContainer"
})
public class UECapabilityRATContainerMapper {

    @XmlElement(name = "rat-Type", required = true)
    protected String ratType;
    @XmlElement(name = "ue-CapabilityRAT-Container", required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] ueCapabilityRATContainer;

    /**
     * Gets the value of the ratType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatType() {
        return ratType;
    }

    /**
     * Sets the value of the ratType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatType(String value) {
        this.ratType = value;
    }

    /**
     * Gets the value of the ueCapabilityRATContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getUeCapabilityRATContainer() {
        return ueCapabilityRATContainer;
    }

    /**
     * Sets the value of the ueCapabilityRATContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUeCapabilityRATContainer(byte[] value) {
        this.ueCapabilityRATContainer = value;
    }

}
