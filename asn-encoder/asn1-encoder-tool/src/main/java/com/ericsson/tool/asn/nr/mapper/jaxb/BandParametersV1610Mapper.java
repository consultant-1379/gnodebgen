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
 * <p>Java class for BandParameters-v1610Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BandParameters-v1610Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="srs-TxSwitch-v1610" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="supportedSRS-TxPortSwitch-v1610"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *                         &lt;enumeration value="t1r1-t1r2"/&gt;
 *                         &lt;enumeration value="t1r1-t1r2-t1r4"/&gt;
 *                         &lt;enumeration value="t1r1-t1r2-t2r2-t2r4"/&gt;
 *                         &lt;enumeration value="t1r1-t1r2-t2r2-t1r4-t2r4"/&gt;
 *                         &lt;enumeration value="t1r1-t2r2"/&gt;
 *                         &lt;enumeration value="t1r1-t2r2-t4r4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "BandParameters-v1610Mapper", propOrder = {
    "srsTxSwitchV1610"
})
public class BandParametersV1610Mapper {

    @XmlElement(name = "srs-TxSwitch-v1610")
    protected BandParametersV1610Mapper.SrsTxSwitchV1610 srsTxSwitchV1610;

    /**
     * Gets the value of the srsTxSwitchV1610 property.
     * 
     * @return
     *     possible object is
     *     {@link BandParametersV1610Mapper.SrsTxSwitchV1610 }
     *     
     */
    public BandParametersV1610Mapper.SrsTxSwitchV1610 getSrsTxSwitchV1610() {
        return srsTxSwitchV1610;
    }

    /**
     * Sets the value of the srsTxSwitchV1610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandParametersV1610Mapper.SrsTxSwitchV1610 }
     *     
     */
    public void setSrsTxSwitchV1610(BandParametersV1610Mapper.SrsTxSwitchV1610 value) {
        this.srsTxSwitchV1610 = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="supportedSRS-TxPortSwitch-v1610"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
     *               &lt;enumeration value="t1r1-t1r2"/&gt;
     *               &lt;enumeration value="t1r1-t1r2-t1r4"/&gt;
     *               &lt;enumeration value="t1r1-t1r2-t2r2-t2r4"/&gt;
     *               &lt;enumeration value="t1r1-t1r2-t2r2-t1r4-t2r4"/&gt;
     *               &lt;enumeration value="t1r1-t2r2"/&gt;
     *               &lt;enumeration value="t1r1-t2r2-t4r4"/&gt;
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
    @XmlType(name = "", propOrder = {
        "supportedSRSTxPortSwitchV1610"
    })
    public static class SrsTxSwitchV1610 {

        @XmlElement(name = "supportedSRS-TxPortSwitch-v1610", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String supportedSRSTxPortSwitchV1610;

        /**
         * Gets the value of the supportedSRSTxPortSwitchV1610 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupportedSRSTxPortSwitchV1610() {
            return supportedSRSTxPortSwitchV1610;
        }

        /**
         * Sets the value of the supportedSRSTxPortSwitchV1610 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupportedSRSTxPortSwitchV1610(String value) {
            this.supportedSRSTxPortSwitchV1610 = value;
        }

    }

}
