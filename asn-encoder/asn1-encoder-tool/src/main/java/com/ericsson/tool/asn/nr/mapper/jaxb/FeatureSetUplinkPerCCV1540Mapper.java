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
 * <p>Java class for FeatureSetUplinkPerCC-v1540Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureSetUplinkPerCC-v1540Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mimo-NonCB-PUSCH" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="maxNumberSRS-ResourcePerSet"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="maxNumberSimultaneousSRS-ResourceTx"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="4"/&gt;
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
@XmlType(name = "FeatureSetUplinkPerCC-v1540Mapper", propOrder = {
    "mimoNonCBPUSCH"
})
public class FeatureSetUplinkPerCCV1540Mapper {

    @XmlElement(name = "mimo-NonCB-PUSCH")
    protected FeatureSetUplinkPerCCV1540Mapper.MimoNonCBPUSCH mimoNonCBPUSCH;

    /**
     * Gets the value of the mimoNonCBPUSCH property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureSetUplinkPerCCV1540Mapper.MimoNonCBPUSCH }
     *     
     */
    public FeatureSetUplinkPerCCV1540Mapper.MimoNonCBPUSCH getMimoNonCBPUSCH() {
        return mimoNonCBPUSCH;
    }

    /**
     * Sets the value of the mimoNonCBPUSCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureSetUplinkPerCCV1540Mapper.MimoNonCBPUSCH }
     *     
     */
    public void setMimoNonCBPUSCH(FeatureSetUplinkPerCCV1540Mapper.MimoNonCBPUSCH value) {
        this.mimoNonCBPUSCH = value;
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
     *         &lt;element name="maxNumberSRS-ResourcePerSet"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="maxNumberSimultaneousSRS-ResourceTx"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="4"/&gt;
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
        "maxNumberSRSResourcePerSet",
        "maxNumberSimultaneousSRSResourceTx"
    })
    public static class MimoNonCBPUSCH {

        @XmlElement(name = "maxNumberSRS-ResourcePerSet")
        protected short maxNumberSRSResourcePerSet;
        @XmlElement(name = "maxNumberSimultaneousSRS-ResourceTx")
        protected short maxNumberSimultaneousSRSResourceTx;

        /**
         * Gets the value of the maxNumberSRSResourcePerSet property.
         * 
         */
        public short getMaxNumberSRSResourcePerSet() {
            return maxNumberSRSResourcePerSet;
        }

        /**
         * Sets the value of the maxNumberSRSResourcePerSet property.
         * 
         */
        public void setMaxNumberSRSResourcePerSet(short value) {
            this.maxNumberSRSResourcePerSet = value;
        }

        /**
         * Gets the value of the maxNumberSimultaneousSRSResourceTx property.
         * 
         */
        public short getMaxNumberSimultaneousSRSResourceTx() {
            return maxNumberSimultaneousSRSResourceTx;
        }

        /**
         * Sets the value of the maxNumberSimultaneousSRSResourceTx property.
         * 
         */
        public void setMaxNumberSimultaneousSRSResourceTx(short value) {
            this.maxNumberSimultaneousSRSResourceTx = value;
        }

    }

}
