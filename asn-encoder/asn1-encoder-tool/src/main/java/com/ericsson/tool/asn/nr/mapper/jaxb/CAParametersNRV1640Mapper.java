//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.08 at 04:50:40 PM IST 
//


package com.ericsson.tool.asn.nr.mapper.jaxb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CA-ParametersNR-v1640Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CA-ParametersNR-v1640Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uplinkTxDC-TwoCarrierReport-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxUpTo3Diff-NumerologiesConfigSinglePUCCH-grp-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}PUCCH-Grp-CarrierTypes-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="maxUpTo4Diff-NumerologiesConfigSinglePUCCH-grp-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}PUCCH-Grp-CarrierTypes-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="twoPUCCH-Grp-ConfigurationsList-r16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="32"&gt;
 *                   &lt;element name="TwoPUCCH-Grp-Configurations-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}TwoPUCCH-Grp-Configurations-r16Mapper"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diffNumerologyAcrossPUCCH-Group-CarrierTypes-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diffNumerologyWithinPUCCH-GroupSmallerSCS-CarrierTypes-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="diffNumerologyWithinPUCCH-GroupLargerSCS-CarrierTypes-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pdcch-MonitoringCA-NonAlignedSpan-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="2"/&gt;
 *               &lt;maxInclusive value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="pdcch-BlindDetectionCA-Mixed-NonAlignedSpan-r16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="pdcch-BlindDetectionCA1-r16"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="15"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pdcch-BlindDetectionCA2-r16"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="15"/&gt;
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
@XmlType(name = "CA-ParametersNR-v1640Mapper", propOrder = {
    "uplinkTxDCTwoCarrierReportR16",
    "maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16",
    "maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16",
    "twoPUCCHGrpConfigurationsListR16",
    "diffNumerologyAcrossPUCCHGroupCarrierTypesR16",
    "diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16",
    "diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16",
    "pdcchMonitoringCANonAlignedSpanR16",
    "pdcchBlindDetectionCAMixedNonAlignedSpanR16"
})
public class CAParametersNRV1640Mapper {

    @XmlElement(name = "uplinkTxDC-TwoCarrierReport-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String uplinkTxDCTwoCarrierReportR16;
    @XmlElement(name = "maxUpTo3Diff-NumerologiesConfigSinglePUCCH-grp-r16")
    protected PUCCHGrpCarrierTypesR16Mapper maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16;
    @XmlElement(name = "maxUpTo4Diff-NumerologiesConfigSinglePUCCH-grp-r16")
    protected PUCCHGrpCarrierTypesR16Mapper maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16;
    @XmlElement(name = "twoPUCCH-Grp-ConfigurationsList-r16")
    protected CAParametersNRV1640Mapper.TwoPUCCHGrpConfigurationsListR16 twoPUCCHGrpConfigurationsListR16;
    @XmlElement(name = "diffNumerologyAcrossPUCCH-Group-CarrierTypes-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String diffNumerologyAcrossPUCCHGroupCarrierTypesR16;
    @XmlElement(name = "diffNumerologyWithinPUCCH-GroupSmallerSCS-CarrierTypes-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16;
    @XmlElement(name = "diffNumerologyWithinPUCCH-GroupLargerSCS-CarrierTypes-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16;
    @XmlElement(name = "pdcch-MonitoringCA-NonAlignedSpan-r16")
    protected Short pdcchMonitoringCANonAlignedSpanR16;
    @XmlElement(name = "pdcch-BlindDetectionCA-Mixed-NonAlignedSpan-r16")
    protected CAParametersNRV1640Mapper.PdcchBlindDetectionCAMixedNonAlignedSpanR16 pdcchBlindDetectionCAMixedNonAlignedSpanR16;

    /**
     * Gets the value of the uplinkTxDCTwoCarrierReportR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUplinkTxDCTwoCarrierReportR16() {
        return uplinkTxDCTwoCarrierReportR16;
    }

    /**
     * Sets the value of the uplinkTxDCTwoCarrierReportR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUplinkTxDCTwoCarrierReportR16(String value) {
        this.uplinkTxDCTwoCarrierReportR16 = value;
    }

    /**
     * Gets the value of the maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16 property.
     * 
     * @return
     *     possible object is
     *     {@link PUCCHGrpCarrierTypesR16Mapper }
     *     
     */
    public PUCCHGrpCarrierTypesR16Mapper getMaxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16() {
        return maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16;
    }

    /**
     * Sets the value of the maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUCCHGrpCarrierTypesR16Mapper }
     *     
     */
    public void setMaxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16(PUCCHGrpCarrierTypesR16Mapper value) {
        this.maxUpTo3DiffNumerologiesConfigSinglePUCCHGrpR16 = value;
    }

    /**
     * Gets the value of the maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16 property.
     * 
     * @return
     *     possible object is
     *     {@link PUCCHGrpCarrierTypesR16Mapper }
     *     
     */
    public PUCCHGrpCarrierTypesR16Mapper getMaxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16() {
        return maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16;
    }

    /**
     * Sets the value of the maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PUCCHGrpCarrierTypesR16Mapper }
     *     
     */
    public void setMaxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16(PUCCHGrpCarrierTypesR16Mapper value) {
        this.maxUpTo4DiffNumerologiesConfigSinglePUCCHGrpR16 = value;
    }

    /**
     * Gets the value of the twoPUCCHGrpConfigurationsListR16 property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRV1640Mapper.TwoPUCCHGrpConfigurationsListR16 }
     *     
     */
    public CAParametersNRV1640Mapper.TwoPUCCHGrpConfigurationsListR16 getTwoPUCCHGrpConfigurationsListR16() {
        return twoPUCCHGrpConfigurationsListR16;
    }

    /**
     * Sets the value of the twoPUCCHGrpConfigurationsListR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRV1640Mapper.TwoPUCCHGrpConfigurationsListR16 }
     *     
     */
    public void setTwoPUCCHGrpConfigurationsListR16(CAParametersNRV1640Mapper.TwoPUCCHGrpConfigurationsListR16 value) {
        this.twoPUCCHGrpConfigurationsListR16 = value;
    }

    /**
     * Gets the value of the diffNumerologyAcrossPUCCHGroupCarrierTypesR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffNumerologyAcrossPUCCHGroupCarrierTypesR16() {
        return diffNumerologyAcrossPUCCHGroupCarrierTypesR16;
    }

    /**
     * Sets the value of the diffNumerologyAcrossPUCCHGroupCarrierTypesR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffNumerologyAcrossPUCCHGroupCarrierTypesR16(String value) {
        this.diffNumerologyAcrossPUCCHGroupCarrierTypesR16 = value;
    }

    /**
     * Gets the value of the diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16() {
        return diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16;
    }

    /**
     * Sets the value of the diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16(String value) {
        this.diffNumerologyWithinPUCCHGroupSmallerSCSCarrierTypesR16 = value;
    }

    /**
     * Gets the value of the diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16() {
        return diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16;
    }

    /**
     * Sets the value of the diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16(String value) {
        this.diffNumerologyWithinPUCCHGroupLargerSCSCarrierTypesR16 = value;
    }

    /**
     * Gets the value of the pdcchMonitoringCANonAlignedSpanR16 property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPdcchMonitoringCANonAlignedSpanR16() {
        return pdcchMonitoringCANonAlignedSpanR16;
    }

    /**
     * Sets the value of the pdcchMonitoringCANonAlignedSpanR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPdcchMonitoringCANonAlignedSpanR16(Short value) {
        this.pdcchMonitoringCANonAlignedSpanR16 = value;
    }

    /**
     * Gets the value of the pdcchBlindDetectionCAMixedNonAlignedSpanR16 property.
     * 
     * @return
     *     possible object is
     *     {@link CAParametersNRV1640Mapper.PdcchBlindDetectionCAMixedNonAlignedSpanR16 }
     *     
     */
    public CAParametersNRV1640Mapper.PdcchBlindDetectionCAMixedNonAlignedSpanR16 getPdcchBlindDetectionCAMixedNonAlignedSpanR16() {
        return pdcchBlindDetectionCAMixedNonAlignedSpanR16;
    }

    /**
     * Sets the value of the pdcchBlindDetectionCAMixedNonAlignedSpanR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAParametersNRV1640Mapper.PdcchBlindDetectionCAMixedNonAlignedSpanR16 }
     *     
     */
    public void setPdcchBlindDetectionCAMixedNonAlignedSpanR16(CAParametersNRV1640Mapper.PdcchBlindDetectionCAMixedNonAlignedSpanR16 value) {
        this.pdcchBlindDetectionCAMixedNonAlignedSpanR16 = value;
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
     *         &lt;element name="pdcch-BlindDetectionCA1-r16"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="15"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pdcch-BlindDetectionCA2-r16"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="15"/&gt;
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
        "pdcchBlindDetectionCA1R16",
        "pdcchBlindDetectionCA2R16"
    })
    public static class PdcchBlindDetectionCAMixedNonAlignedSpanR16 {

        @XmlElement(name = "pdcch-BlindDetectionCA1-r16")
        protected short pdcchBlindDetectionCA1R16;
        @XmlElement(name = "pdcch-BlindDetectionCA2-r16")
        protected short pdcchBlindDetectionCA2R16;

        /**
         * Gets the value of the pdcchBlindDetectionCA1R16 property.
         * 
         */
        public short getPdcchBlindDetectionCA1R16() {
            return pdcchBlindDetectionCA1R16;
        }

        /**
         * Sets the value of the pdcchBlindDetectionCA1R16 property.
         * 
         */
        public void setPdcchBlindDetectionCA1R16(short value) {
            this.pdcchBlindDetectionCA1R16 = value;
        }

        /**
         * Gets the value of the pdcchBlindDetectionCA2R16 property.
         * 
         */
        public short getPdcchBlindDetectionCA2R16() {
            return pdcchBlindDetectionCA2R16;
        }

        /**
         * Sets the value of the pdcchBlindDetectionCA2R16 property.
         * 
         */
        public void setPdcchBlindDetectionCA2R16(short value) {
            this.pdcchBlindDetectionCA2R16 = value;
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
     *       &lt;sequence maxOccurs="32"&gt;
     *         &lt;element name="TwoPUCCH-Grp-Configurations-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}TwoPUCCH-Grp-Configurations-r16Mapper"/&gt;
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
        "twoPUCCHGrpConfigurationsR16"
    })
    public static class TwoPUCCHGrpConfigurationsListR16 {

        @XmlElement(name = "TwoPUCCH-Grp-Configurations-r16", required = true)
        protected List<TwoPUCCHGrpConfigurationsR16Mapper> twoPUCCHGrpConfigurationsR16;

        /**
         * Gets the value of the twoPUCCHGrpConfigurationsR16 property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the twoPUCCHGrpConfigurationsR16 property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTwoPUCCHGrpConfigurationsR16().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TwoPUCCHGrpConfigurationsR16Mapper }
         * 
         * 
         */
        public List<TwoPUCCHGrpConfigurationsR16Mapper> getTwoPUCCHGrpConfigurationsR16() {
            if (twoPUCCHGrpConfigurationsR16 == null) {
                twoPUCCHGrpConfigurationsR16 = new ArrayList<TwoPUCCHGrpConfigurationsR16Mapper>();
            }
            return this.twoPUCCHGrpConfigurationsR16;
        }

    }

}
