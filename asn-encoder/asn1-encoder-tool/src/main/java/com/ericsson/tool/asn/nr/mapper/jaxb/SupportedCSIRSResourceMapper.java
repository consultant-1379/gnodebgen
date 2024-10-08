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
 * <p>Java class for SupportedCSI-RS-ResourceMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupportedCSI-RS-ResourceMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxNumberTxPortsPerResource"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="p2"/&gt;
 *               &lt;enumeration value="p4"/&gt;
 *               &lt;enumeration value="p8"/&gt;
 *               &lt;enumeration value="p12"/&gt;
 *               &lt;enumeration value="p16"/&gt;
 *               &lt;enumeration value="p24"/&gt;
 *               &lt;enumeration value="p32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberResourcesPerBand"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalNumberTxPortsPerBand"&gt;
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
@XmlType(name = "SupportedCSI-RS-ResourceMapper", propOrder = {
    "maxNumberTxPortsPerResource",
    "maxNumberResourcesPerBand",
    "totalNumberTxPortsPerBand"
})
public class SupportedCSIRSResourceMapper {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maxNumberTxPortsPerResource;
    protected short maxNumberResourcesPerBand;
    protected int totalNumberTxPortsPerBand;

    /**
     * Gets the value of the maxNumberTxPortsPerResource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxNumberTxPortsPerResource() {
        return maxNumberTxPortsPerResource;
    }

    /**
     * Sets the value of the maxNumberTxPortsPerResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxNumberTxPortsPerResource(String value) {
        this.maxNumberTxPortsPerResource = value;
    }

    /**
     * Gets the value of the maxNumberResourcesPerBand property.
     * 
     */
    public short getMaxNumberResourcesPerBand() {
        return maxNumberResourcesPerBand;
    }

    /**
     * Sets the value of the maxNumberResourcesPerBand property.
     * 
     */
    public void setMaxNumberResourcesPerBand(short value) {
        this.maxNumberResourcesPerBand = value;
    }

    /**
     * Gets the value of the totalNumberTxPortsPerBand property.
     * 
     */
    public int getTotalNumberTxPortsPerBand() {
        return totalNumberTxPortsPerBand;
    }

    /**
     * Sets the value of the totalNumberTxPortsPerBand property.
     * 
     */
    public void setTotalNumberTxPortsPerBand(int value) {
        this.totalNumberTxPortsPerBand = value;
    }

}
