//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FeatureSetMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureSetMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="eutra"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="downlinkSetEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetEUTRA-DownlinkIdMapper"/&gt;
 *                   &lt;element name="uplinkSetEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetEUTRA-UplinkIdMapper"/&gt;
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
 *                   &lt;element name="downlinkSetNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetDownlinkIdMapper"/&gt;
 *                   &lt;element name="uplinkSetNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetUplinkIdMapper"/&gt;
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
@XmlType(name = "FeatureSetMapper", propOrder = {
    "eutra",
    "nr"
})
public class FeatureSetMapper {

    protected FeatureSetMapper.Eutra eutra;
    protected FeatureSetMapper.Nr nr;

    /**
     * Gets the value of the eutra property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureSetMapper.Eutra }
     *     
     */
    public FeatureSetMapper.Eutra getEutra() {
        return eutra;
    }

    /**
     * Sets the value of the eutra property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureSetMapper.Eutra }
     *     
     */
    public void setEutra(FeatureSetMapper.Eutra value) {
        this.eutra = value;
    }

    /**
     * Gets the value of the nr property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureSetMapper.Nr }
     *     
     */
    public FeatureSetMapper.Nr getNr() {
        return nr;
    }

    /**
     * Sets the value of the nr property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureSetMapper.Nr }
     *     
     */
    public void setNr(FeatureSetMapper.Nr value) {
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
     *         &lt;element name="downlinkSetEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetEUTRA-DownlinkIdMapper"/&gt;
     *         &lt;element name="uplinkSetEUTRA" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetEUTRA-UplinkIdMapper"/&gt;
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
        "downlinkSetEUTRA",
        "uplinkSetEUTRA"
    })
    public static class Eutra {

        @XmlSchemaType(name = "unsignedShort")
        protected int downlinkSetEUTRA;
        @XmlSchemaType(name = "unsignedShort")
        protected int uplinkSetEUTRA;

        /**
         * Gets the value of the downlinkSetEUTRA property.
         * 
         */
        public int getDownlinkSetEUTRA() {
            return downlinkSetEUTRA;
        }

        /**
         * Sets the value of the downlinkSetEUTRA property.
         * 
         */
        public void setDownlinkSetEUTRA(int value) {
            this.downlinkSetEUTRA = value;
        }

        /**
         * Gets the value of the uplinkSetEUTRA property.
         * 
         */
        public int getUplinkSetEUTRA() {
            return uplinkSetEUTRA;
        }

        /**
         * Sets the value of the uplinkSetEUTRA property.
         * 
         */
        public void setUplinkSetEUTRA(int value) {
            this.uplinkSetEUTRA = value;
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
     *         &lt;element name="downlinkSetNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetDownlinkIdMapper"/&gt;
     *         &lt;element name="uplinkSetNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}FeatureSetUplinkIdMapper"/&gt;
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
        "downlinkSetNR",
        "uplinkSetNR"
    })
    public static class Nr {

        @XmlSchemaType(name = "unsignedShort")
        protected int downlinkSetNR;
        @XmlSchemaType(name = "unsignedShort")
        protected int uplinkSetNR;

        /**
         * Gets the value of the downlinkSetNR property.
         * 
         */
        public int getDownlinkSetNR() {
            return downlinkSetNR;
        }

        /**
         * Sets the value of the downlinkSetNR property.
         * 
         */
        public void setDownlinkSetNR(int value) {
            this.downlinkSetNR = value;
        }

        /**
         * Gets the value of the uplinkSetNR property.
         * 
         */
        public int getUplinkSetNR() {
            return uplinkSetNR;
        }

        /**
         * Sets the value of the uplinkSetNR property.
         * 
         */
        public void setUplinkSetNR(int value) {
            this.uplinkSetNR = value;
        }

    }

}
