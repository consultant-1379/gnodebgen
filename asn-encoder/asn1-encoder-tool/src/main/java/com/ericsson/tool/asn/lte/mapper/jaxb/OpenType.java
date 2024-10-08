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
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OpenType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="uEAggregateMaximumBitrate" type="{}UEAggregateMaximumBitrateMapper"/&gt;
 *         &lt;element name="e-RABToBeSetupListHOReq" type="{}E-RABToBeSetupListHOReqMapper"/&gt;
 *         &lt;element name="e-RABToBeSetupItemHOReq" type="{}E-RABToBeSetupItemHOReqMapper"/&gt;
 *         &lt;element name="source-ToTarget-TransparentContainer" type="{}Source-ToTarget-TransparentContainerMapper"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenType", propOrder = {
    "ueAggregateMaximumBitrate",
    "erabToBeSetupListHOReq",
    "erabToBeSetupItemHOReq",
    "sourceToTargetTransparentContainer"
})
public class OpenType {

    @XmlElement(name = "uEAggregateMaximumBitrate")
    protected UEAggregateMaximumBitrateMapper ueAggregateMaximumBitrate;
    @XmlElement(name = "e-RABToBeSetupListHOReq")
    protected ERABToBeSetupListHOReqMapper erabToBeSetupListHOReq;
    @XmlElement(name = "e-RABToBeSetupItemHOReq")
    protected ERABToBeSetupItemHOReqMapper erabToBeSetupItemHOReq;
    @XmlElement(name = "source-ToTarget-TransparentContainer", type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sourceToTargetTransparentContainer;

    /**
     * Gets the value of the ueAggregateMaximumBitrate property.
     * 
     * @return
     *     possible object is
     *     {@link UEAggregateMaximumBitrateMapper }
     *     
     */
    public UEAggregateMaximumBitrateMapper getUEAggregateMaximumBitrate() {
        return ueAggregateMaximumBitrate;
    }

    /**
     * Sets the value of the ueAggregateMaximumBitrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link UEAggregateMaximumBitrateMapper }
     *     
     */
    public void setUEAggregateMaximumBitrate(UEAggregateMaximumBitrateMapper value) {
        this.ueAggregateMaximumBitrate = value;
    }

    /**
     * Gets the value of the erabToBeSetupListHOReq property.
     * 
     * @return
     *     possible object is
     *     {@link ERABToBeSetupListHOReqMapper }
     *     
     */
    public ERABToBeSetupListHOReqMapper getERABToBeSetupListHOReq() {
        return erabToBeSetupListHOReq;
    }

    /**
     * Sets the value of the erabToBeSetupListHOReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERABToBeSetupListHOReqMapper }
     *     
     */
    public void setERABToBeSetupListHOReq(ERABToBeSetupListHOReqMapper value) {
        this.erabToBeSetupListHOReq = value;
    }

    /**
     * Gets the value of the erabToBeSetupItemHOReq property.
     * 
     * @return
     *     possible object is
     *     {@link ERABToBeSetupItemHOReqMapper }
     *     
     */
    public ERABToBeSetupItemHOReqMapper getERABToBeSetupItemHOReq() {
        return erabToBeSetupItemHOReq;
    }

    /**
     * Sets the value of the erabToBeSetupItemHOReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link ERABToBeSetupItemHOReqMapper }
     *     
     */
    public void setERABToBeSetupItemHOReq(ERABToBeSetupItemHOReqMapper value) {
        this.erabToBeSetupItemHOReq = value;
    }

    /**
     * Gets the value of the sourceToTargetTransparentContainer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSourceToTargetTransparentContainer() {
        return sourceToTargetTransparentContainer;
    }

    /**
     * Sets the value of the sourceToTargetTransparentContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceToTargetTransparentContainer(byte[] value) {
        this.sourceToTargetTransparentContainer = value;
    }

}
