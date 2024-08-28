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
 * <p>Java class for CA-ParametersNRDCMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA-ParametersNRDCMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ca-ParametersNR-ForDC" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-ParametersNRMapper" minOccurs="0"/&gt;
 *         &lt;element name="ca-ParametersNR-ForDC-v1540" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-ParametersNR-v1540Mapper" minOccurs="0"/&gt;
 *         &lt;element name="ca-ParametersNR-ForDC-v1550" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-ParametersNR-v1550Mapper" minOccurs="0"/&gt;
 *         &lt;element name="ca-ParametersNR-ForDC-v1560" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-ParametersNR-v1560Mapper" minOccurs="0"/&gt;
 *         &lt;element name="featureSetCombinationDC" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetCombinationIdMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CA-ParametersNRDCMapper", propOrder = {
    "caParametersNRForDC",
    "caParametersNRForDCV1540",
    "caParametersNRForDCV1550",
    "caParametersNRForDCV1560",
    "featureSetCombinationDC"
})
public class CAParametersNRDCMapper {

    @XmlElement(name = "ca-ParametersNR-ForDC")
    protected CAParametersNRMapper caParametersNRForDC;
    @XmlElement(name = "ca-ParametersNR-ForDC-v1540")
    protected CAParametersNRV1540Mapper caParametersNRForDCV1540;
    @XmlElement(name = "ca-ParametersNR-ForDC-v1550")
    protected CAParametersNRV1550Mapper caParametersNRForDCV1550;
    @XmlElement(name = "ca-ParametersNR-ForDC-v1560")
    protected CAParametersNRV1560Mapper caParametersNRForDCV1560;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer featureSetCombinationDC;

    /**
     * Gets the value of the caParametersNRForDC property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRMapper }
     *     
     */
    public CAParametersNRMapper getCaParametersNRForDC() {
        return caParametersNRForDC;
    }

    /**
     * Sets the value of the caParametersNRForDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRMapper }
     *     
     */
    public void setCaParametersNRForDC(CAParametersNRMapper value) {
        this.caParametersNRForDC = value;
    }

    /**
     * Gets the value of the caParametersNRForDCV1540 property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRV1540Mapper }
     *     
     */
    public CAParametersNRV1540Mapper getCaParametersNRForDCV1540() {
        return caParametersNRForDCV1540;
    }

    /**
     * Sets the value of the caParametersNRForDCV1540 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRV1540Mapper }
     *     
     */
    public void setCaParametersNRForDCV1540(CAParametersNRV1540Mapper value) {
        this.caParametersNRForDCV1540 = value;
    }

    /**
     * Gets the value of the caParametersNRForDCV1550 property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRV1550Mapper }
     *     
     */
    public CAParametersNRV1550Mapper getCaParametersNRForDCV1550() {
        return caParametersNRForDCV1550;
    }

    /**
     * Sets the value of the caParametersNRForDCV1550 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRV1550Mapper }
     *     
     */
    public void setCaParametersNRForDCV1550(CAParametersNRV1550Mapper value) {
        this.caParametersNRForDCV1550 = value;
    }

    /**
     * Gets the value of the caParametersNRForDCV1560 property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRV1560Mapper }
     *     
     */
    public CAParametersNRV1560Mapper getCaParametersNRForDCV1560() {
        return caParametersNRForDCV1560;
    }

    /**
     * Sets the value of the caParametersNRForDCV1560 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRV1560Mapper }
     *     
     */
    public void setCaParametersNRForDCV1560(CAParametersNRV1560Mapper value) {
        this.caParametersNRForDCV1560 = value;
    }

    /**
     * Gets the value of the featureSetCombinationDC property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFeatureSetCombinationDC() {
        return featureSetCombinationDC;
    }

    /**
     * Sets the value of the featureSetCombinationDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFeatureSetCombinationDC(Integer value) {
        this.featureSetCombinationDC = value;
    }

}
