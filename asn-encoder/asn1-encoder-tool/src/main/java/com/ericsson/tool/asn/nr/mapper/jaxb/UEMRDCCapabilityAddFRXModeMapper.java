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


/**
 * <p>Java class for UE-MRDC-CapabilityAddFRX-ModeMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UE-MRDC-CapabilityAddFRX-ModeMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measAndMobParametersMRDC-FRX-Diff" type="{http://www.obj-sys.com/NR-RRC-Definitions}MeasAndMobParametersMRDC-FRX-DiffMapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UE-MRDC-CapabilityAddFRX-ModeMapper", propOrder = {
    "measAndMobParametersMRDCFRXDiff"
})
public class UEMRDCCapabilityAddFRXModeMapper {

    @XmlElement(name = "measAndMobParametersMRDC-FRX-Diff", required = true)
    protected MeasAndMobParametersMRDCFRXDiffMapper measAndMobParametersMRDCFRXDiff;

    /**
     * Gets the value of the measAndMobParametersMRDCFRXDiff property.
     * 
     * @return
     *     possible object is
     *     {@link MeasAndMobParametersMRDCFRXDiffMapper }
     *     
     */
    public MeasAndMobParametersMRDCFRXDiffMapper getMeasAndMobParametersMRDCFRXDiff() {
        return measAndMobParametersMRDCFRXDiff;
    }

    /**
     * Sets the value of the measAndMobParametersMRDCFRXDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasAndMobParametersMRDCFRXDiffMapper }
     *     
     */
    public void setMeasAndMobParametersMRDCFRXDiff(MeasAndMobParametersMRDCFRXDiffMapper value) {
        this.measAndMobParametersMRDCFRXDiff = value;
    }

}
