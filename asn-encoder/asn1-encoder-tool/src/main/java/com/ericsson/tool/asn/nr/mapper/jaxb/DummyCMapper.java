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
 * <p>Java class for DummyCMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DummyCMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxNumberTxPortsPerResource"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="p8"/&gt;
 *               &lt;enumeration value="p16"/&gt;
 *               &lt;enumeration value="p32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberResources"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="64"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalNumberTxPorts"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="2"/&gt;
 *               &lt;maxInclusive value="256"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supportedCodebookMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="mode1"/&gt;
 *               &lt;enumeration value="mode2"/&gt;
 *               &lt;enumeration value="both"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supportedNumberPanels"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="n2"/&gt;
 *               &lt;enumeration value="n4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberCSI-RS-PerResourceSet"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="8"/&gt;
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
@XmlType(name = "DummyCMapper", propOrder = {
    "maxNumberTxPortsPerResource",
    "maxNumberResources",
    "totalNumberTxPorts",
    "supportedCodebookMode",
    "supportedNumberPanels",
    "maxNumberCSIRSPerResourceSet"
})
public class DummyCMapper {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maxNumberTxPortsPerResource;
    protected short maxNumberResources;
    protected int totalNumberTxPorts;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supportedCodebookMode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String supportedNumberPanels;
    @XmlElement(name = "maxNumberCSI-RS-PerResourceSet")
    protected short maxNumberCSIRSPerResourceSet;

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
     * Gets the value of the maxNumberResources property.
     * 
     */
    public short getMaxNumberResources() {
        return maxNumberResources;
    }

    /**
     * Sets the value of the maxNumberResources property.
     * 
     */
    public void setMaxNumberResources(short value) {
        this.maxNumberResources = value;
    }

    /**
     * Gets the value of the totalNumberTxPorts property.
     * 
     */
    public int getTotalNumberTxPorts() {
        return totalNumberTxPorts;
    }

    /**
     * Sets the value of the totalNumberTxPorts property.
     * 
     */
    public void setTotalNumberTxPorts(int value) {
        this.totalNumberTxPorts = value;
    }

    /**
     * Gets the value of the supportedCodebookMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedCodebookMode() {
        return supportedCodebookMode;
    }

    /**
     * Sets the value of the supportedCodebookMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedCodebookMode(String value) {
        this.supportedCodebookMode = value;
    }

    /**
     * Gets the value of the supportedNumberPanels property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportedNumberPanels() {
        return supportedNumberPanels;
    }

    /**
     * Sets the value of the supportedNumberPanels property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportedNumberPanels(String value) {
        this.supportedNumberPanels = value;
    }

    /**
     * Gets the value of the maxNumberCSIRSPerResourceSet property.
     * 
     */
    public short getMaxNumberCSIRSPerResourceSet() {
        return maxNumberCSIRSPerResourceSet;
    }

    /**
     * Sets the value of the maxNumberCSIRSPerResourceSet property.
     * 
     */
    public void setMaxNumberCSIRSPerResourceSet(short value) {
        this.maxNumberCSIRSPerResourceSet = value;
    }

}
