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
 * <p>Java class for ResultsPerCSI-RS-IndexMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResultsPerCSI-RS-IndexMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="csi-RS-Index" type="{}CSI-RS-IndexMapper"/&gt;
 *         &lt;element name="csi-RS-Results" type="{}MeasQuantityResultsMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResultsPerCSI-RS-IndexMapper", namespace = "", propOrder = {
    "csiRSIndex",
    "csiRSResults"
})
public class ResultsPerCSIRSIndexMapper {

    @XmlElement(name = "csi-RS-Index")
    @XmlSchemaType(name = "unsignedByte")
    protected short csiRSIndex;
    @XmlElement(name = "csi-RS-Results")
    protected MeasQuantityResultsMapper csiRSResults;

    /**
     * Gets the value of the csiRSIndex property.
     * 
     */
    public short getCsiRSIndex() {
        return csiRSIndex;
    }

    /**
     * Sets the value of the csiRSIndex property.
     * 
     */
    public void setCsiRSIndex(short value) {
        this.csiRSIndex = value;
    }

    /**
     * Gets the value of the csiRSResults property.
     * 
     * @return
     *     possible object is
     *     {@link MeasQuantityResultsMapper }
     *     
     */
    public MeasQuantityResultsMapper getCsiRSResults() {
        return csiRSResults;
    }

    /**
     * Sets the value of the csiRSResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasQuantityResultsMapper }
     *     
     */
    public void setCsiRSResults(MeasQuantityResultsMapper value) {
        this.csiRSResults = value;
    }

}
