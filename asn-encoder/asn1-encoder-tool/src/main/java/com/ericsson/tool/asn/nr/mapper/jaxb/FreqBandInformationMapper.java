//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FreqBandInformationMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreqBandInformationMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="bandInformationEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandInformationEUTRAMapper"/&gt;
 *         &lt;element name="bandInformationNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandInformationNRMapper"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FreqBandInformationMapper", propOrder = {
    "bandInformationEUTRA",
    "bandInformationNR"
})
public class FreqBandInformationMapper {

    protected FreqBandInformationEUTRAMapper bandInformationEUTRA;
    protected FreqBandInformationNRMapper bandInformationNR;

    /**
     * Gets the value of the bandInformationEUTRA property.
     * 
     * @return
     *     possible object is
     *     {@link FreqBandInformationEUTRAMapper }
     *     
     */
    public FreqBandInformationEUTRAMapper getBandInformationEUTRA() {
        return bandInformationEUTRA;
    }

    /**
     * Sets the value of the bandInformationEUTRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqBandInformationEUTRAMapper }
     *     
     */
    public void setBandInformationEUTRA(FreqBandInformationEUTRAMapper value) {
        this.bandInformationEUTRA = value;
    }

    /**
     * Gets the value of the bandInformationNR property.
     * 
     * @return
     *     possible object is
     *     {@link FreqBandInformationNRMapper }
     *     
     */
    public FreqBandInformationNRMapper getBandInformationNR() {
        return bandInformationNR;
    }

    /**
     * Sets the value of the bandInformationNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqBandInformationNRMapper }
     *     
     */
    public void setBandInformationNR(FreqBandInformationNRMapper value) {
        this.bandInformationNR = value;
    }

}
