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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for PLMN-IdentityInfoMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PLMN-IdentityInfoMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plmn-IdentityList"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence maxOccurs="12"&gt;
 *                   &lt;element name="PLMN-Identity" type="{}PLMN-IdentityMapper"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trackingAreaCode" type="{}TrackingAreaCodeMapper" minOccurs="0"/&gt;
 *         &lt;element name="ranac" type="{}RAN-AreaCodeMapper" minOccurs="0"/&gt;
 *         &lt;element name="cellIdentity" type="{}CellIdentityMapper"/&gt;
 *         &lt;element name="cellReservedForOperatorUse"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="reserved"/&gt;
 *               &lt;enumeration value="notReserved"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="iab-Support-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
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
@XmlType(name = "PLMN-IdentityInfoMapper", namespace = "", propOrder = {
    "plmnIdentityList",
    "trackingAreaCode",
    "ranac",
    "cellIdentity",
    "cellReservedForOperatorUse",
    "iabSupportR16",
    "any"
})
public class PLMNIdentityInfoMapper {

    @XmlElement(name = "plmn-IdentityList", required = true)
    protected PLMNIdentityInfoMapper.PlmnIdentityList plmnIdentityList;
    protected String trackingAreaCode;
    @XmlSchemaType(name = "unsignedByte")
    protected Short ranac;
    @XmlElement(required = true)
    protected String cellIdentity;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cellReservedForOperatorUse;
    @XmlElement(name = "iab-Support-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String iabSupportR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the plmnIdentityList property.
     * 
     * @return
     *     possible object is
     *     {@link PLMNIdentityInfoMapper.PlmnIdentityList }
     *     
     */
    public PLMNIdentityInfoMapper.PlmnIdentityList getPlmnIdentityList() {
        return plmnIdentityList;
    }

    /**
     * Sets the value of the plmnIdentityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLMNIdentityInfoMapper.PlmnIdentityList }
     *     
     */
    public void setPlmnIdentityList(PLMNIdentityInfoMapper.PlmnIdentityList value) {
        this.plmnIdentityList = value;
    }

    /**
     * Gets the value of the trackingAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingAreaCode() {
        return trackingAreaCode;
    }

    /**
     * Sets the value of the trackingAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingAreaCode(String value) {
        this.trackingAreaCode = value;
    }

    /**
     * Gets the value of the ranac property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRanac() {
        return ranac;
    }

    /**
     * Sets the value of the ranac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRanac(Short value) {
        this.ranac = value;
    }

    /**
     * Gets the value of the cellIdentity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellIdentity() {
        return cellIdentity;
    }

    /**
     * Sets the value of the cellIdentity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellIdentity(String value) {
        this.cellIdentity = value;
    }

    /**
     * Gets the value of the cellReservedForOperatorUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellReservedForOperatorUse() {
        return cellReservedForOperatorUse;
    }

    /**
     * Sets the value of the cellReservedForOperatorUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellReservedForOperatorUse(String value) {
        this.cellReservedForOperatorUse = value;
    }

    /**
     * Gets the value of the iabSupportR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIabSupportR16() {
        return iabSupportR16;
    }

    /**
     * Sets the value of the iabSupportR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIabSupportR16(String value) {
        this.iabSupportR16 = value;
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
     *       &lt;sequence maxOccurs="12"&gt;
     *         &lt;element name="PLMN-Identity" type="{}PLMN-IdentityMapper"/&gt;
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
        "plmnIdentity"
    })
    public static class PlmnIdentityList {

        @XmlElement(name = "PLMN-Identity", namespace = "", required = true)
        protected List<PLMNIdentityMapper> plmnIdentity;

        /**
         * Gets the value of the plmnIdentity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the plmnIdentity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPLMNIdentity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PLMNIdentityMapper }
         * 
         * 
         */
        public List<PLMNIdentityMapper> getPLMNIdentity() {
            if (plmnIdentity == null) {
                plmnIdentity = new ArrayList<PLMNIdentityMapper>();
            }
            return this.plmnIdentity;
        }

    }

}
