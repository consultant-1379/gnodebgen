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
 * <p>Java class for UE-MRDC-CapabilityAddXDD-ModeMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UE-MRDC-CapabilityAddXDD-ModeMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measAndMobParametersMRDC-XDD-Diff" type="{http://www.obj-sys.com/NR-RRC-Definitions}MeasAndMobParametersMRDC-XDD-DiffMapper" minOccurs="0"/&gt;
 *         &lt;element name="generalParametersMRDC-XDD-Diff" type="{http://www.obj-sys.com/NR-RRC-Definitions}GeneralParametersMRDC-XDD-DiffMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UE-MRDC-CapabilityAddXDD-ModeMapper", propOrder = {
    "measAndMobParametersMRDCXDDDiff",
    "generalParametersMRDCXDDDiff"
})
public class UEMRDCCapabilityAddXDDModeMapper {

    @XmlElement(name = "measAndMobParametersMRDC-XDD-Diff")
    protected MeasAndMobParametersMRDCXDDDiffMapper measAndMobParametersMRDCXDDDiff;
    @XmlElement(name = "generalParametersMRDC-XDD-Diff")
    protected GeneralParametersMRDCXDDDiffMapper generalParametersMRDCXDDDiff;

    /**
     * Gets the value of the measAndMobParametersMRDCXDDDiff property.
     * 
     * @return
     *     possible object is
     *     {@link MeasAndMobParametersMRDCXDDDiffMapper }
     *     
     */
    public MeasAndMobParametersMRDCXDDDiffMapper getMeasAndMobParametersMRDCXDDDiff() {
        return measAndMobParametersMRDCXDDDiff;
    }

    /**
     * Sets the value of the measAndMobParametersMRDCXDDDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasAndMobParametersMRDCXDDDiffMapper }
     *     
     */
    public void setMeasAndMobParametersMRDCXDDDiff(MeasAndMobParametersMRDCXDDDiffMapper value) {
        this.measAndMobParametersMRDCXDDDiff = value;
    }

    /**
     * Gets the value of the generalParametersMRDCXDDDiff property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralParametersMRDCXDDDiffMapper }
     *     
     */
    public GeneralParametersMRDCXDDDiffMapper getGeneralParametersMRDCXDDDiff() {
        return generalParametersMRDCXDDDiff;
    }

    /**
     * Sets the value of the generalParametersMRDCXDDDiff property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralParametersMRDCXDDDiffMapper }
     *     
     */
    public void setGeneralParametersMRDCXDDDiff(GeneralParametersMRDCXDDDiffMapper value) {
        this.generalParametersMRDCXDDDiff = value;
    }

}
