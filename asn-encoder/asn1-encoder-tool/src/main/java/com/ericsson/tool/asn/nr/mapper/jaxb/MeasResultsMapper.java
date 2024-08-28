//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for MeasResultsMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultsMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="measId" type="{}MeasIdMapper"/&gt;
 *         &lt;element name="measResultServingMOList" type="{}MeasResultServMOListMapper"/&gt;
 *         &lt;element name="measResultNeighCells" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="measResultListNR" type="{}MeasResultListNRMapper"/&gt;
 *                   &lt;element name="measResultListEUTRA" type="{}MeasResultListEUTRAMapper"/&gt;
 *                   &lt;element name="measResultListUTRA-FDD-r16" type="{}MeasResultListUTRA-FDD-r16Mapper"/&gt;
 *                   &lt;any processContents='lax' namespace='##other'/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="measResultServFreqListEUTRA-SCG" type="{}MeasResultServFreqListEUTRA-SCGMapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultServFreqListNR-SCG" type="{}MeasResultServFreqListNR-SCGMapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultSFTD-EUTRA" type="{}MeasResultSFTD-EUTRAMapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultSFTD-NR" type="{}MeasResultCellSFTD-NRMapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultCellListSFTD-NR" type="{}MeasResultCellListSFTD-NRMapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultForRSSI-r16" type="{}MeasResultForRSSI-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="locationInfo-r16" type="{}LocationInfo-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="ul-PDCP-DelayValueResultList-r16" type="{}UL-PDCP-DelayValueResultList-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultsSL-r16" type="{}MeasResultsSL-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="measResultCLI-r16" type="{}MeasResultCLI-r16Mapper" minOccurs="0"/&gt;
 *         &lt;any processContents='lax' namespace='##other' minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasResultsMapper", namespace = "", propOrder = {
    "measId",
    "measResultServingMOList",
    "measResultNeighCells",
    "measResultServFreqListEUTRASCG",
    "measResultServFreqListNRSCG",
    "measResultSFTDEUTRA",
    "measResultSFTDNR",
    "measResultCellListSFTDNR",
    "measResultForRSSIR16",
    "locationInfoR16",
    "ulPDCPDelayValueResultListR16",
    "measResultsSLR16",
    "measResultCLIR16",
    "any"
})
public class MeasResultsMapper {

    @XmlSchemaType(name = "unsignedByte")
    protected short measId;
    @XmlElement(required = true)
    protected MeasResultServMOListMapper measResultServingMOList;
    protected MeasResultsMapper.MeasResultNeighCells measResultNeighCells;
    @XmlElement(name = "measResultServFreqListEUTRA-SCG")
    protected MeasResultServFreqListEUTRASCGMapper measResultServFreqListEUTRASCG;
    @XmlElement(name = "measResultServFreqListNR-SCG")
    protected MeasResultServFreqListNRSCGMapper measResultServFreqListNRSCG;
    @XmlElement(name = "measResultSFTD-EUTRA")
    protected MeasResultSFTDEUTRAMapper measResultSFTDEUTRA;
    @XmlElement(name = "measResultSFTD-NR")
    protected MeasResultCellSFTDNRMapper measResultSFTDNR;
    @XmlElement(name = "measResultCellListSFTD-NR")
    protected MeasResultCellListSFTDNRMapper measResultCellListSFTDNR;
    @XmlElement(name = "measResultForRSSI-r16")
    protected MeasResultForRSSIR16Mapper measResultForRSSIR16;
    @XmlElement(name = "locationInfo-r16")
    protected LocationInfoR16Mapper locationInfoR16;
    @XmlElement(name = "ul-PDCP-DelayValueResultList-r16")
    protected ULPDCPDelayValueResultListR16Mapper ulPDCPDelayValueResultListR16;
    @XmlElement(name = "measResultsSL-r16")
    protected MeasResultsSLR16Mapper measResultsSLR16;
    @XmlElement(name = "measResultCLI-r16")
    protected MeasResultCLIR16Mapper measResultCLIR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the measId property.
     * 
     */
    public short getMeasId() {
        return measId;
    }

    /**
     * Sets the value of the measId property.
     * 
     */
    public void setMeasId(short value) {
        this.measId = value;
    }

    /**
     * Gets the value of the measResultServingMOList property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultServMOListMapper }
     *     
     */
    public MeasResultServMOListMapper getMeasResultServingMOList() {
        return measResultServingMOList;
    }

    /**
     * Sets the value of the measResultServingMOList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultServMOListMapper }
     *     
     */
    public void setMeasResultServingMOList(MeasResultServMOListMapper value) {
        this.measResultServingMOList = value;
    }

    /**
     * Gets the value of the measResultNeighCells property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultsMapper.MeasResultNeighCells }
     *     
     */
    public MeasResultsMapper.MeasResultNeighCells getMeasResultNeighCells() {
        return measResultNeighCells;
    }

    /**
     * Sets the value of the measResultNeighCells property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultsMapper.MeasResultNeighCells }
     *     
     */
    public void setMeasResultNeighCells(MeasResultsMapper.MeasResultNeighCells value) {
        this.measResultNeighCells = value;
    }

    /**
     * Gets the value of the measResultServFreqListEUTRASCG property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultServFreqListEUTRASCGMapper }
     *     
     */
    public MeasResultServFreqListEUTRASCGMapper getMeasResultServFreqListEUTRASCG() {
        return measResultServFreqListEUTRASCG;
    }

    /**
     * Sets the value of the measResultServFreqListEUTRASCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultServFreqListEUTRASCGMapper }
     *     
     */
    public void setMeasResultServFreqListEUTRASCG(MeasResultServFreqListEUTRASCGMapper value) {
        this.measResultServFreqListEUTRASCG = value;
    }

    /**
     * Gets the value of the measResultServFreqListNRSCG property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultServFreqListNRSCGMapper }
     *     
     */
    public MeasResultServFreqListNRSCGMapper getMeasResultServFreqListNRSCG() {
        return measResultServFreqListNRSCG;
    }

    /**
     * Sets the value of the measResultServFreqListNRSCG property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultServFreqListNRSCGMapper }
     *     
     */
    public void setMeasResultServFreqListNRSCG(MeasResultServFreqListNRSCGMapper value) {
        this.measResultServFreqListNRSCG = value;
    }

    /**
     * Gets the value of the measResultSFTDEUTRA property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultSFTDEUTRAMapper }
     *     
     */
    public MeasResultSFTDEUTRAMapper getMeasResultSFTDEUTRA() {
        return measResultSFTDEUTRA;
    }

    /**
     * Sets the value of the measResultSFTDEUTRA property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultSFTDEUTRAMapper }
     *     
     */
    public void setMeasResultSFTDEUTRA(MeasResultSFTDEUTRAMapper value) {
        this.measResultSFTDEUTRA = value;
    }

    /**
     * Gets the value of the measResultSFTDNR property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultCellSFTDNRMapper }
     *     
     */
    public MeasResultCellSFTDNRMapper getMeasResultSFTDNR() {
        return measResultSFTDNR;
    }

    /**
     * Sets the value of the measResultSFTDNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultCellSFTDNRMapper }
     *     
     */
    public void setMeasResultSFTDNR(MeasResultCellSFTDNRMapper value) {
        this.measResultSFTDNR = value;
    }

    /**
     * Gets the value of the measResultCellListSFTDNR property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultCellListSFTDNRMapper }
     *     
     */
    public MeasResultCellListSFTDNRMapper getMeasResultCellListSFTDNR() {
        return measResultCellListSFTDNR;
    }

    /**
     * Sets the value of the measResultCellListSFTDNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultCellListSFTDNRMapper }
     *     
     */
    public void setMeasResultCellListSFTDNR(MeasResultCellListSFTDNRMapper value) {
        this.measResultCellListSFTDNR = value;
    }

    /**
     * Gets the value of the measResultForRSSIR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultForRSSIR16Mapper }
     *     
     */
    public MeasResultForRSSIR16Mapper getMeasResultForRSSIR16() {
        return measResultForRSSIR16;
    }

    /**
     * Sets the value of the measResultForRSSIR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultForRSSIR16Mapper }
     *     
     */
    public void setMeasResultForRSSIR16(MeasResultForRSSIR16Mapper value) {
        this.measResultForRSSIR16 = value;
    }

    /**
     * Gets the value of the locationInfoR16 property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoR16Mapper }
     *     
     */
    public LocationInfoR16Mapper getLocationInfoR16() {
        return locationInfoR16;
    }

    /**
     * Sets the value of the locationInfoR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoR16Mapper }
     *     
     */
    public void setLocationInfoR16(LocationInfoR16Mapper value) {
        this.locationInfoR16 = value;
    }

    /**
     * Gets the value of the ulPDCPDelayValueResultListR16 property.
     * 
     * @return
     *     possible object is
     *     {@link ULPDCPDelayValueResultListR16Mapper }
     *     
     */
    public ULPDCPDelayValueResultListR16Mapper getUlPDCPDelayValueResultListR16() {
        return ulPDCPDelayValueResultListR16;
    }

    /**
     * Sets the value of the ulPDCPDelayValueResultListR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ULPDCPDelayValueResultListR16Mapper }
     *     
     */
    public void setUlPDCPDelayValueResultListR16(ULPDCPDelayValueResultListR16Mapper value) {
        this.ulPDCPDelayValueResultListR16 = value;
    }

    /**
     * Gets the value of the measResultsSLR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultsSLR16Mapper }
     *     
     */
    public MeasResultsSLR16Mapper getMeasResultsSLR16() {
        return measResultsSLR16;
    }

    /**
     * Sets the value of the measResultsSLR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultsSLR16Mapper }
     *     
     */
    public void setMeasResultsSLR16(MeasResultsSLR16Mapper value) {
        this.measResultsSLR16 = value;
    }

    /**
     * Gets the value of the measResultCLIR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultCLIR16Mapper }
     *     
     */
    public MeasResultCLIR16Mapper getMeasResultCLIR16() {
        return measResultCLIR16;
    }

    /**
     * Sets the value of the measResultCLIR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultCLIR16Mapper }
     *     
     */
    public void setMeasResultCLIR16(MeasResultCLIR16Mapper value) {
        this.measResultCLIR16 = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * @return
     *     possible object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public Object getAny() {
        return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value
     *     allowed object is
     *     {@link Element }
     *     {@link Object }
     *     
     */
    public void setAny(Object value) {
        this.any = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="measResultListNR" type="{}MeasResultListNRMapper"/&gt;
     *         &lt;element name="measResultListEUTRA" type="{}MeasResultListEUTRAMapper"/&gt;
     *         &lt;element name="measResultListUTRA-FDD-r16" type="{}MeasResultListUTRA-FDD-r16Mapper"/&gt;
     *         &lt;any processContents='lax' namespace='##other'/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "measResultListNR",
        "measResultListEUTRA",
        "measResultListUTRAFDDR16",
        "any"
    })
    public static class MeasResultNeighCells {

        @XmlElement(namespace = "")
        protected MeasResultListNRMapper measResultListNR;
        @XmlElement(namespace = "")
        protected MeasResultListEUTRAMapper measResultListEUTRA;
        @XmlElement(name = "measResultListUTRA-FDD-r16", namespace = "")
        protected MeasResultListUTRAFDDR16Mapper measResultListUTRAFDDR16;
        @XmlAnyElement(lax = true)
        protected Object any;

        /**
         * Gets the value of the measResultListNR property.
         * 
         * @return
         *     possible object is
         *     {@link MeasResultListNRMapper }
         *     
         */
        public MeasResultListNRMapper getMeasResultListNR() {
            return measResultListNR;
        }

        /**
         * Sets the value of the measResultListNR property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeasResultListNRMapper }
         *     
         */
        public void setMeasResultListNR(MeasResultListNRMapper value) {
            this.measResultListNR = value;
        }

        /**
         * Gets the value of the measResultListEUTRA property.
         * 
         * @return
         *     possible object is
         *     {@link MeasResultListEUTRAMapper }
         *     
         */
        public MeasResultListEUTRAMapper getMeasResultListEUTRA() {
            return measResultListEUTRA;
        }

        /**
         * Sets the value of the measResultListEUTRA property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeasResultListEUTRAMapper }
         *     
         */
        public void setMeasResultListEUTRA(MeasResultListEUTRAMapper value) {
            this.measResultListEUTRA = value;
        }

        /**
         * Gets the value of the measResultListUTRAFDDR16 property.
         * 
         * @return
         *     possible object is
         *     {@link MeasResultListUTRAFDDR16Mapper }
         *     
         */
        public MeasResultListUTRAFDDR16Mapper getMeasResultListUTRAFDDR16() {
            return measResultListUTRAFDDR16;
        }

        /**
         * Sets the value of the measResultListUTRAFDDR16 property.
         * 
         * @param value
         *     allowed object is
         *     {@link MeasResultListUTRAFDDR16Mapper }
         *     
         */
        public void setMeasResultListUTRAFDDR16(MeasResultListUTRAFDDR16Mapper value) {
            this.measResultListUTRAFDDR16 = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * @return
         *     possible object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * Sets the value of the any property.
         * 
         * @param value
         *     allowed object is
         *     {@link Element }
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

    }

}
