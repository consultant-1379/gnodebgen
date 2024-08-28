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
 * <p>Java class for MeasResultUTRA-FDD-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultUTRA-FDD-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physCellId-r16" type="{}PhysCellIdUTRA-FDD-r16Mapper"/&gt;
 *         &lt;element name="measResult-r16"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="utra-FDD-RSCP-r16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
 *                         &lt;minInclusive value="-5"/&gt;
 *                         &lt;maxInclusive value="91"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="utra-FDD-EcN0-r16" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="0"/&gt;
 *                         &lt;maxInclusive value="49"/&gt;
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
@XmlType(name = "MeasResultUTRA-FDD-r16Mapper", namespace = "", propOrder = {
    "physCellIdR16",
    "measResultR16"
})
public class MeasResultUTRAFDDR16Mapper {

    @XmlElement(name = "physCellId-r16")
    @XmlSchemaType(name = "unsignedShort")
    protected int physCellIdR16;
    @XmlElement(name = "measResult-r16", required = true)
    protected MeasResultUTRAFDDR16Mapper.MeasResultR16 measResultR16;

    /**
     * Gets the value of the physCellIdR16 property.
     * 
     */
    public int getPhysCellIdR16() {
        return physCellIdR16;
    }

    /**
     * Sets the value of the physCellIdR16 property.
     * 
     */
    public void setPhysCellIdR16(int value) {
        this.physCellIdR16 = value;
    }

    /**
     * Gets the value of the measResultR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultUTRAFDDR16Mapper.MeasResultR16 }
     *     
     */
    public MeasResultUTRAFDDR16Mapper.MeasResultR16 getMeasResultR16() {
        return measResultR16;
    }

    /**
     * Sets the value of the measResultR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultUTRAFDDR16Mapper.MeasResultR16 }
     *     
     */
    public void setMeasResultR16(MeasResultUTRAFDDR16Mapper.MeasResultR16 value) {
        this.measResultR16 = value;
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
     *         &lt;element name="utra-FDD-RSCP-r16" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}byte"&gt;
     *               &lt;minInclusive value="-5"/&gt;
     *               &lt;maxInclusive value="91"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="utra-FDD-EcN0-r16" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="0"/&gt;
     *               &lt;maxInclusive value="49"/&gt;
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
        "utraFDDRSCPR16",
        "utraFDDEcN0R16"
    })
    public static class MeasResultR16 {

        @XmlElement(name = "utra-FDD-RSCP-r16", namespace = "")
        protected Byte utraFDDRSCPR16;
        @XmlElement(name = "utra-FDD-EcN0-r16", namespace = "")
        protected Short utraFDDEcN0R16;

        /**
         * Gets the value of the utraFDDRSCPR16 property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getUtraFDDRSCPR16() {
            return utraFDDRSCPR16;
        }

        /**
         * Sets the value of the utraFDDRSCPR16 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setUtraFDDRSCPR16(Byte value) {
            this.utraFDDRSCPR16 = value;
        }

        /**
         * Gets the value of the utraFDDEcN0R16 property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getUtraFDDEcN0R16() {
            return utraFDDEcN0R16;
        }

        /**
         * Sets the value of the utraFDDEcN0R16 property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setUtraFDDEcN0R16(Short value) {
            this.utraFDDEcN0R16 = value;
        }

    }

}
