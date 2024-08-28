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
 * <p>Java class for BandParametersMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BandParametersMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="eutra"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bandEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandIndicatorEUTRAMapper"/&gt;
 *                   &lt;element name="ca-BandwidthClassDL-EUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassEUTRAMapper" minOccurs="0"/&gt;
 *                   &lt;element name="ca-BandwidthClassUL-EUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassEUTRAMapper" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="nr"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="bandNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandIndicatorNRMapper"/&gt;
 *                   &lt;element name="ca-BandwidthClassDL-NR" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassNRMapper" minOccurs="0"/&gt;
 *                   &lt;element name="ca-BandwidthClassUL-NR" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassNRMapper" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BandParametersMapper", propOrder = {
    "eutra",
    "nr"
})
public class BandParametersMapper {

    protected BandParametersMapper.Eutra eutra;
    protected BandParametersMapper.Nr nr;

    /**
     * Gets the value of the eutra property.
     * 
     * @return
     *     possible object is
     *     {@link BandParametersMapper.Eutra }
     *     
     */
    public BandParametersMapper.Eutra getEutra() {
        return eutra;
    }

    /**
     * Sets the value of the eutra property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandParametersMapper.Eutra }
     *     
     */
    public void setEutra(BandParametersMapper.Eutra value) {
        this.eutra = value;
    }

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link BandParametersMapper.Nr }
     *     
     */
    public BandParametersMapper.Nr getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandParametersMapper.Nr }
     *     
     */
    public void setNr(BandParametersMapper.Nr value) {
        this.nr = value;
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
     *         &lt;element name="bandEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandIndicatorEUTRAMapper"/&gt;
     *         &lt;element name="ca-BandwidthClassDL-EUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassEUTRAMapper" minOccurs="0"/&gt;
     *         &lt;element name="ca-BandwidthClassUL-EUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassEUTRAMapper" minOccurs="0"/&gt;
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
        "bandEUTRA",
        "caBandwidthClassDLEUTRA",
        "caBandwidthClassULEUTRA"
    })
    public static class Eutra {

        @XmlSchemaType(name = "unsignedShort")
        protected int bandEUTRA;
        @XmlElement(name = "ca-BandwidthClassDL-EUTRA")
        protected String caBandwidthClassDLEUTRA;
        @XmlElement(name = "ca-BandwidthClassUL-EUTRA")
        protected String caBandwidthClassULEUTRA;

        /**
         * Gets the value of the bandEUTRA property.
         * 
         */
        public int getBandEUTRA() {
            return bandEUTRA;
        }

        /**
         * Sets the value of the bandEUTRA property.
         * 
         */
        public void setBandEUTRA(int value) {
            this.bandEUTRA = value;
        }

        /**
         * Gets the value of the caBandwidthClassDLEUTRA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaBandwidthClassDLEUTRA() {
            return caBandwidthClassDLEUTRA;
        }

        /**
         * Sets the value of the caBandwidthClassDLEUTRA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaBandwidthClassDLEUTRA(String value) {
            this.caBandwidthClassDLEUTRA = value;
        }

        /**
         * Gets the value of the caBandwidthClassULEUTRA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaBandwidthClassULEUTRA() {
            return caBandwidthClassULEUTRA;
        }

        /**
         * Sets the value of the caBandwidthClassULEUTRA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaBandwidthClassULEUTRA(String value) {
            this.caBandwidthClassULEUTRA = value;
        }

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
     *         &lt;element name="bandNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandIndicatorNRMapper"/&gt;
     *         &lt;element name="ca-BandwidthClassDL-NR" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassNRMapper" minOccurs="0"/&gt;
     *         &lt;element name="ca-BandwidthClassUL-NR" type="{http://www.obj-sys.com/NR-RRC-Definitions}CA-BandwidthClassNRMapper" minOccurs="0"/&gt;
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
        "bandNR",
        "caBandwidthClassDLNR",
        "caBandwidthClassULNR"
    })
    public static class Nr {

        @XmlSchemaType(name = "unsignedShort")
        protected int bandNR;
        @XmlElement(name = "ca-BandwidthClassDL-NR")
        protected String caBandwidthClassDLNR;
        @XmlElement(name = "ca-BandwidthClassUL-NR")
        protected String caBandwidthClassULNR;

        /**
         * Gets the value of the bandNR property.
         * 
         */
        public int getBandNR() {
            return bandNR;
        }

        /**
         * Sets the value of the bandNR property.
         * 
         */
        public void setBandNR(int value) {
            this.bandNR = value;
        }

        /**
         * Gets the value of the caBandwidthClassDLNR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaBandwidthClassDLNR() {
            return caBandwidthClassDLNR;
        }

        /**
         * Sets the value of the caBandwidthClassDLNR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaBandwidthClassDLNR(String value) {
            this.caBandwidthClassDLNR = value;
        }

        /**
         * Gets the value of the caBandwidthClassULNR property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaBandwidthClassULNR() {
            return caBandwidthClassULNR;
        }

        /**
         * Sets the value of the caBandwidthClassULNR property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaBandwidthClassULNR(String value) {
            this.caBandwidthClassULNR = value;
        }

    }

}
