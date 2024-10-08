//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:27 PM IST 
//


package com.ericsson.tool.asn.lte.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllocationAndRetentionPriorityMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllocationAndRetentionPriorityMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="priorityLevel" type="{}PriorityLevelMapper"/&gt;
 *         &lt;element name="pre-emptionCapability" type="{}Pre-emptionCapabilityMapper"/&gt;
 *         &lt;element name="pre-emptionVulnerability" type="{}Pre-emptionVulnerabilityMapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllocationAndRetentionPriorityMapper", propOrder = {
    "priorityLevel",
    "preEmptionCapability",
    "preEmptionVulnerability"
})
public class AllocationAndRetentionPriorityMapper {

    @XmlElement(required = true)
    protected String priorityLevel;
    @XmlElement(name = "pre-emptionCapability", required = true)
    @XmlSchemaType(name = "token")
    protected PreEmptionCapabilityMapper preEmptionCapability;
    @XmlElement(name = "pre-emptionVulnerability", required = true)
    @XmlSchemaType(name = "token")
    protected PreEmptionVulnerabilityMapper preEmptionVulnerability;

    /**
     * Gets the value of the priorityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityLevel() {
        return priorityLevel;
    }

    /**
     * Sets the value of the priorityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityLevel(String value) {
        this.priorityLevel = value;
    }

    /**
     * Gets the value of the preEmptionCapability property.
     * 
     * @return
     *     possible object is
     *     {@link PreEmptionCapabilityMapper }
     *     
     */
    public PreEmptionCapabilityMapper getPreEmptionCapability() {
        return preEmptionCapability;
    }

    /**
     * Sets the value of the preEmptionCapability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreEmptionCapabilityMapper }
     *     
     */
    public void setPreEmptionCapability(PreEmptionCapabilityMapper value) {
        this.preEmptionCapability = value;
    }

    /**
     * Gets the value of the preEmptionVulnerability property.
     * 
     * @return
     *     possible object is
     *     {@link PreEmptionVulnerabilityMapper }
     *     
     */
    public PreEmptionVulnerabilityMapper getPreEmptionVulnerability() {
        return preEmptionVulnerability;
    }

    /**
     * Sets the value of the preEmptionVulnerability property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreEmptionVulnerabilityMapper }
     *     
     */
    public void setPreEmptionVulnerability(PreEmptionVulnerabilityMapper value) {
        this.preEmptionVulnerability = value;
    }

}
