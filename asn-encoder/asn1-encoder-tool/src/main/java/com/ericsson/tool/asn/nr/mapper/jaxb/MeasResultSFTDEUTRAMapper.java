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


/**
 * <p>Java class for MeasResultSFTD-EUTRAMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultSFTD-EUTRAMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eutra-PhysCellId" type="{}EUTRA-PhysCellIdMapper"/&gt;
 *         &lt;element name="sfn-OffsetResult"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="1023"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="frameBoundaryOffsetResult"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short"&gt;
 *               &lt;minInclusive value="-30720"/&gt;
 *               &lt;maxInclusive value="30719"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="rsrp-Result" type="{}RSRP-RangeMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasResultSFTD-EUTRAMapper", namespace = "", propOrder = {
    "eutraPhysCellId",
    "sfnOffsetResult",
    "frameBoundaryOffsetResult",
    "rsrpResult"
})
public class MeasResultSFTDEUTRAMapper {

    @XmlElement(name = "eutra-PhysCellId")
    @XmlSchemaType(name = "unsignedShort")
    protected int eutraPhysCellId;
    @XmlElement(name = "sfn-OffsetResult")
    protected int sfnOffsetResult;
    protected short frameBoundaryOffsetResult;
    @XmlElement(name = "rsrp-Result")
    @XmlSchemaType(name = "unsignedByte")
    protected Short rsrpResult;

    /**
     * Gets the value of the eutraPhysCellId property.
     * 
     */
    public int getEutraPhysCellId() {
        return eutraPhysCellId;
    }

    /**
     * Sets the value of the eutraPhysCellId property.
     * 
     */
    public void setEutraPhysCellId(int value) {
        this.eutraPhysCellId = value;
    }

    /**
     * Gets the value of the sfnOffsetResult property.
     * 
     */
    public int getSfnOffsetResult() {
        return sfnOffsetResult;
    }

    /**
     * Sets the value of the sfnOffsetResult property.
     * 
     */
    public void setSfnOffsetResult(int value) {
        this.sfnOffsetResult = value;
    }

    /**
     * Gets the value of the frameBoundaryOffsetResult property.
     * 
     */
    public short getFrameBoundaryOffsetResult() {
        return frameBoundaryOffsetResult;
    }

    /**
     * Sets the value of the frameBoundaryOffsetResult property.
     * 
     */
    public void setFrameBoundaryOffsetResult(short value) {
        this.frameBoundaryOffsetResult = value;
    }

    /**
     * Gets the value of the rsrpResult property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRsrpResult() {
        return rsrpResult;
    }

    /**
     * Sets the value of the rsrpResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRsrpResult(Short value) {
        this.rsrpResult = value;
    }

}
