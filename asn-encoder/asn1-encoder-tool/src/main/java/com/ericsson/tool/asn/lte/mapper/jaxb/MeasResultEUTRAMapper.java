//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:27 PM IST 
//


package com.ericsson.tool.asn.lte.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasResultEUTRAMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultEUTRAMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="physCellId" type="{}PhysCellIdMapper"/&gt;
 *         &lt;element name="measResult"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="rsrpResult" type="{}RSRPRangeMapper" minOccurs="0"/&gt;
 *                   &lt;element name="rsrqResult" type="{}RSRQRangeMapper" minOccurs="0"/&gt;
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
@XmlType(name = "MeasResultEUTRAMapper", propOrder = {
    "physCellId",
    "measResult"
})
public class MeasResultEUTRAMapper {

    @XmlSchemaType(name = "unsignedShort")
    protected int physCellId;
    @XmlElement(required = true)
    protected MeasResultEUTRAMapper.MeasResult measResult;

    /**
     * Gets the value of the physCellId property.
     * 
     */
    public int getPhysCellId() {
        return physCellId;
    }

    /**
     * Sets the value of the physCellId property.
     * 
     */
    public void setPhysCellId(int value) {
        this.physCellId = value;
    }

    /**
     * Gets the value of the measResult property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultEUTRAMapper.MeasResult }
     *     
     */
    public MeasResultEUTRAMapper.MeasResult getMeasResult() {
        return measResult;
    }

    /**
     * Sets the value of the measResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultEUTRAMapper.MeasResult }
     *     
     */
    public void setMeasResult(MeasResultEUTRAMapper.MeasResult value) {
        this.measResult = value;
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
     *         &lt;element name="rsrpResult" type="{}RSRPRangeMapper" minOccurs="0"/&gt;
     *         &lt;element name="rsrqResult" type="{}RSRQRangeMapper" minOccurs="0"/&gt;
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
        "rsrpResult",
        "rsrqResult"
    })
    public static class MeasResult {

        @XmlSchemaType(name = "unsignedByte")
        protected Short rsrpResult;
        @XmlSchemaType(name = "unsignedByte")
        protected Short rsrqResult;

        /**
         * Gets the value of the rsrpResult property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getRsrpResult() {
            return rsrpResult;
        }

        /**
         * Sets the value of the rsrpResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setRsrpResult(Short value) {
            this.rsrpResult = value;
        }

        /**
         * Gets the value of the rsrqResult property.
         * 
         * @return
         *     possible object is
         *     {@link Short }
         *     
         */
        public Short getRsrqResult() {
            return rsrqResult;
        }

        /**
         * Sets the value of the rsrqResult property.
         * 
         * @param value
         *     allowed object is
         *     {@link Short }
         *     
         */
        public void setRsrqResult(Short value) {
            this.rsrqResult = value;
        }

    }

}
