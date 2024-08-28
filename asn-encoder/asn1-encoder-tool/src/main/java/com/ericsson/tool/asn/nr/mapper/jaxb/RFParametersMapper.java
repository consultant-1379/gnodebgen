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
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for RF-ParametersMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RF-ParametersMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedBandListNR"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="1024"&gt;
 *                   &lt;element name="BandNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandNRMapper"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supportedBandCombinationList" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationListMapper" minOccurs="0"/&gt;
 *         &lt;element name="appliedFreqBandListFilter" type="{http://www.obj-sys.com/NR-RRC-Definitions}FreqBandListMapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-v1540" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1540Mapper" minOccurs="0"/&gt;
 *         &lt;element name="srs-SwitchingTimeRequested" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="supportedBandCombinationList-v1550" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1550Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-v1560" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1560Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-v1610" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1610Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationListSidelinkEUTRA-NR-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationListSidelinkEUTRA-NR-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-UplinkTxSwitch-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-UplinkTxSwitch-r16Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-v1630" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1630Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationListSidelinkEUTRA-NR-v1630" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationListSidelinkEUTRA-NR-v1630Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-UplinkTxSwitch-v1630" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-UplinkTxSwitch-v1630Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-v1640" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-v1640Mapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedBandCombinationList-UplinkTxSwitch-v1640" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombinationList-UplinkTxSwitch-v1640Mapper" minOccurs="0"/&gt;
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
@XmlType(name = "RF-ParametersMapper", propOrder = {
    "supportedBandListNR",
    "supportedBandCombinationList",
    "appliedFreqBandListFilter",
    "supportedBandCombinationListV1540",
    "srsSwitchingTimeRequested",
    "supportedBandCombinationListV1550",
    "supportedBandCombinationListV1560",
    "supportedBandCombinationListV1610",
    "supportedBandCombinationListSidelinkEUTRANRR16",
    "supportedBandCombinationListUplinkTxSwitchR16",
    "supportedBandCombinationListV1630",
    "supportedBandCombinationListSidelinkEUTRANRV1630",
    "supportedBandCombinationListUplinkTxSwitchV1630",
    "supportedBandCombinationListV1640",
    "supportedBandCombinationListUplinkTxSwitchV1640",
    "any"
})
public class RFParametersMapper {

    @XmlElement(required = true)
    protected RFParametersMapper.SupportedBandListNR supportedBandListNR;
    protected BandCombinationListMapper supportedBandCombinationList;
    protected FreqBandListMapper appliedFreqBandListFilter;
    @XmlElement(name = "supportedBandCombinationList-v1540")
    protected BandCombinationListV1540Mapper supportedBandCombinationListV1540;
    @XmlElement(name = "srs-SwitchingTimeRequested")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String srsSwitchingTimeRequested;
    @XmlElement(name = "supportedBandCombinationList-v1550")
    protected BandCombinationListV1550Mapper supportedBandCombinationListV1550;
    @XmlElement(name = "supportedBandCombinationList-v1560")
    protected BandCombinationListV1560Mapper supportedBandCombinationListV1560;
    @XmlElement(name = "supportedBandCombinationList-v1610")
    protected BandCombinationListV1610Mapper supportedBandCombinationListV1610;
    @XmlElement(name = "supportedBandCombinationListSidelinkEUTRA-NR-r16")
    protected BandCombinationListSidelinkEUTRANRR16Mapper supportedBandCombinationListSidelinkEUTRANRR16;
    @XmlElement(name = "supportedBandCombinationList-UplinkTxSwitch-r16")
    protected BandCombinationListUplinkTxSwitchR16Mapper supportedBandCombinationListUplinkTxSwitchR16;
    @XmlElement(name = "supportedBandCombinationList-v1630")
    protected BandCombinationListV1630Mapper supportedBandCombinationListV1630;
    @XmlElement(name = "supportedBandCombinationListSidelinkEUTRA-NR-v1630")
    protected BandCombinationListSidelinkEUTRANRV1630Mapper supportedBandCombinationListSidelinkEUTRANRV1630;
    @XmlElement(name = "supportedBandCombinationList-UplinkTxSwitch-v1630")
    protected BandCombinationListUplinkTxSwitchV1630Mapper supportedBandCombinationListUplinkTxSwitchV1630;
    @XmlElement(name = "supportedBandCombinationList-v1640")
    protected BandCombinationListV1640Mapper supportedBandCombinationListV1640;
    @XmlElement(name = "supportedBandCombinationList-UplinkTxSwitch-v1640")
    protected BandCombinationListUplinkTxSwitchV1640Mapper supportedBandCombinationListUplinkTxSwitchV1640;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the supportedBandListNR property.
     * 
     * @return
     *     possible object is
     *     {@link RFParametersMapper.SupportedBandListNR }
     *     
     */
    public RFParametersMapper.SupportedBandListNR getSupportedBandListNR() {
        return supportedBandListNR;
    }

    /**
     * Sets the value of the supportedBandListNR property.
     * 
     * @param value
     *     allowed object is
     *     {@link RFParametersMapper.SupportedBandListNR }
     *     
     */
    public void setSupportedBandListNR(RFParametersMapper.SupportedBandListNR value) {
        this.supportedBandListNR = value;
    }

    /**
     * Gets the value of the supportedBandCombinationList property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListMapper }
     *     
     */
    public BandCombinationListMapper getSupportedBandCombinationList() {
        return supportedBandCombinationList;
    }

    /**
     * Sets the value of the supportedBandCombinationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListMapper }
     *     
     */
    public void setSupportedBandCombinationList(BandCombinationListMapper value) {
        this.supportedBandCombinationList = value;
    }

    /**
     * Gets the value of the appliedFreqBandListFilter property.
     * 
     * @return
     *     possible object is
     *     {@link FreqBandListMapper }
     *     
     */
    public FreqBandListMapper getAppliedFreqBandListFilter() {
        return appliedFreqBandListFilter;
    }

    /**
     * Sets the value of the appliedFreqBandListFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreqBandListMapper }
     *     
     */
    public void setAppliedFreqBandListFilter(FreqBandListMapper value) {
        this.appliedFreqBandListFilter = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1540 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1540Mapper }
     *     
     */
    public BandCombinationListV1540Mapper getSupportedBandCombinationListV1540() {
        return supportedBandCombinationListV1540;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1540 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1540Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1540(BandCombinationListV1540Mapper value) {
        this.supportedBandCombinationListV1540 = value;
    }

    /**
     * Gets the value of the srsSwitchingTimeRequested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsSwitchingTimeRequested() {
        return srsSwitchingTimeRequested;
    }

    /**
     * Sets the value of the srsSwitchingTimeRequested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsSwitchingTimeRequested(String value) {
        this.srsSwitchingTimeRequested = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1550 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1550Mapper }
     *     
     */
    public BandCombinationListV1550Mapper getSupportedBandCombinationListV1550() {
        return supportedBandCombinationListV1550;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1550 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1550Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1550(BandCombinationListV1550Mapper value) {
        this.supportedBandCombinationListV1550 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1560 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1560Mapper }
     *     
     */
    public BandCombinationListV1560Mapper getSupportedBandCombinationListV1560() {
        return supportedBandCombinationListV1560;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1560 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1560Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1560(BandCombinationListV1560Mapper value) {
        this.supportedBandCombinationListV1560 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1610 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1610Mapper }
     *     
     */
    public BandCombinationListV1610Mapper getSupportedBandCombinationListV1610() {
        return supportedBandCombinationListV1610;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1610 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1610Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1610(BandCombinationListV1610Mapper value) {
        this.supportedBandCombinationListV1610 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListSidelinkEUTRANRR16 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListSidelinkEUTRANRR16Mapper }
     *     
     */
    public BandCombinationListSidelinkEUTRANRR16Mapper getSupportedBandCombinationListSidelinkEUTRANRR16() {
        return supportedBandCombinationListSidelinkEUTRANRR16;
    }

    /**
     * Sets the value of the supportedBandCombinationListSidelinkEUTRANRR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListSidelinkEUTRANRR16Mapper }
     *     
     */
    public void setSupportedBandCombinationListSidelinkEUTRANRR16(BandCombinationListSidelinkEUTRANRR16Mapper value) {
        this.supportedBandCombinationListSidelinkEUTRANRR16 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListUplinkTxSwitchR16 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListUplinkTxSwitchR16Mapper }
     *     
     */
    public BandCombinationListUplinkTxSwitchR16Mapper getSupportedBandCombinationListUplinkTxSwitchR16() {
        return supportedBandCombinationListUplinkTxSwitchR16;
    }

    /**
     * Sets the value of the supportedBandCombinationListUplinkTxSwitchR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListUplinkTxSwitchR16Mapper }
     *     
     */
    public void setSupportedBandCombinationListUplinkTxSwitchR16(BandCombinationListUplinkTxSwitchR16Mapper value) {
        this.supportedBandCombinationListUplinkTxSwitchR16 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1630 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1630Mapper }
     *     
     */
    public BandCombinationListV1630Mapper getSupportedBandCombinationListV1630() {
        return supportedBandCombinationListV1630;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1630 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1630Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1630(BandCombinationListV1630Mapper value) {
        this.supportedBandCombinationListV1630 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListSidelinkEUTRANRV1630 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListSidelinkEUTRANRV1630Mapper }
     *     
     */
    public BandCombinationListSidelinkEUTRANRV1630Mapper getSupportedBandCombinationListSidelinkEUTRANRV1630() {
        return supportedBandCombinationListSidelinkEUTRANRV1630;
    }

    /**
     * Sets the value of the supportedBandCombinationListSidelinkEUTRANRV1630 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListSidelinkEUTRANRV1630Mapper }
     *     
     */
    public void setSupportedBandCombinationListSidelinkEUTRANRV1630(BandCombinationListSidelinkEUTRANRV1630Mapper value) {
        this.supportedBandCombinationListSidelinkEUTRANRV1630 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListUplinkTxSwitchV1630 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListUplinkTxSwitchV1630Mapper }
     *     
     */
    public BandCombinationListUplinkTxSwitchV1630Mapper getSupportedBandCombinationListUplinkTxSwitchV1630() {
        return supportedBandCombinationListUplinkTxSwitchV1630;
    }

    /**
     * Sets the value of the supportedBandCombinationListUplinkTxSwitchV1630 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListUplinkTxSwitchV1630Mapper }
     *     
     */
    public void setSupportedBandCombinationListUplinkTxSwitchV1630(BandCombinationListUplinkTxSwitchV1630Mapper value) {
        this.supportedBandCombinationListUplinkTxSwitchV1630 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListV1640 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListV1640Mapper }
     *     
     */
    public BandCombinationListV1640Mapper getSupportedBandCombinationListV1640() {
        return supportedBandCombinationListV1640;
    }

    /**
     * Sets the value of the supportedBandCombinationListV1640 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListV1640Mapper }
     *     
     */
    public void setSupportedBandCombinationListV1640(BandCombinationListV1640Mapper value) {
        this.supportedBandCombinationListV1640 = value;
    }

    /**
     * Gets the value of the supportedBandCombinationListUplinkTxSwitchV1640 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationListUplinkTxSwitchV1640Mapper }
     *     
     */
    public BandCombinationListUplinkTxSwitchV1640Mapper getSupportedBandCombinationListUplinkTxSwitchV1640() {
        return supportedBandCombinationListUplinkTxSwitchV1640;
    }

    /**
     * Sets the value of the supportedBandCombinationListUplinkTxSwitchV1640 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationListUplinkTxSwitchV1640Mapper }
     *     
     */
    public void setSupportedBandCombinationListUplinkTxSwitchV1640(BandCombinationListUplinkTxSwitchV1640Mapper value) {
        this.supportedBandCombinationListUplinkTxSwitchV1640 = value;
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
     *       &lt;sequence maxOccurs="1024"&gt;
     *         &lt;element name="BandNR" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandNRMapper"/&gt;
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
        "bandNR"
    })
    public static class SupportedBandListNR {

        @XmlElement(name = "BandNR", required = true)
        protected List<BandNRMapper> bandNR;

        /**
         * Gets the value of the bandNR property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bandNR property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBandNR().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BandNRMapper }
         * 
         * 
         */
        public List<BandNRMapper> getBandNR() {
            if (bandNR == null) {
                bandNR = new ArrayList<BandNRMapper>();
            }
            return this.bandNR;
        }

    }

}
