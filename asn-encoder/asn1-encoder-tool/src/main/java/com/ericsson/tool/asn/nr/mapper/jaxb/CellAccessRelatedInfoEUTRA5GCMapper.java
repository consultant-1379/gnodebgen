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
 * <p>Java class for CellAccessRelatedInfo-EUTRA-5GCMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CellAccessRelatedInfo-EUTRA-5GCMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plmn-IdentityList-eutra-5gc" type="{}PLMN-IdentityList-EUTRA-5GCMapper"/&gt;
 *         &lt;element name="trackingAreaCode-eutra-5gc" type="{}TrackingAreaCodeMapper"/&gt;
 *         &lt;element name="ranac-5gc" type="{}RAN-AreaCodeMapper" minOccurs="0"/&gt;
 *         &lt;element name="cellIdentity-eutra-5gc" type="{}CellIdentity-EUTRA-5GCMapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CellAccessRelatedInfo-EUTRA-5GCMapper", namespace = "", propOrder = {
    "plmnIdentityListEutra5Gc",
    "trackingAreaCodeEutra5Gc",
    "ranac5Gc",
    "cellIdentityEutra5Gc"
})
public class CellAccessRelatedInfoEUTRA5GCMapper {

    @XmlElement(name = "plmn-IdentityList-eutra-5gc", required = true)
    protected PLMNIdentityListEUTRA5GCMapper plmnIdentityListEutra5Gc;
    @XmlElement(name = "trackingAreaCode-eutra-5gc", required = true)
    protected String trackingAreaCodeEutra5Gc;
    @XmlElement(name = "ranac-5gc")
    @XmlSchemaType(name = "unsignedByte")
    protected Short ranac5Gc;
    @XmlElement(name = "cellIdentity-eutra-5gc", required = true)
    protected CellIdentityEUTRA5GCMapper cellIdentityEutra5Gc;

    /**
     * Gets the value of the plmnIdentityListEutra5Gc property.
     * 
     * @return
     *     possible object is
     *     {@link PLMNIdentityListEUTRA5GCMapper }
     *     
     */
    public PLMNIdentityListEUTRA5GCMapper getPlmnIdentityListEutra5Gc() {
        return plmnIdentityListEutra5Gc;
    }

    /**
     * Sets the value of the plmnIdentityListEutra5Gc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PLMNIdentityListEUTRA5GCMapper }
     *     
     */
    public void setPlmnIdentityListEutra5Gc(PLMNIdentityListEUTRA5GCMapper value) {
        this.plmnIdentityListEutra5Gc = value;
    }

    /**
     * Gets the value of the trackingAreaCodeEutra5Gc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingAreaCodeEutra5Gc() {
        return trackingAreaCodeEutra5Gc;
    }

    /**
     * Sets the value of the trackingAreaCodeEutra5Gc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingAreaCodeEutra5Gc(String value) {
        this.trackingAreaCodeEutra5Gc = value;
    }

    /**
     * Gets the value of the ranac5Gc property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getRanac5Gc() {
        return ranac5Gc;
    }

    /**
     * Sets the value of the ranac5Gc property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setRanac5Gc(Short value) {
        this.ranac5Gc = value;
    }

    /**
     * Gets the value of the cellIdentityEutra5Gc property.
     * 
     * @return
     *     possible object is
     *     {@link CellIdentityEUTRA5GCMapper }
     *     
     */
    public CellIdentityEUTRA5GCMapper getCellIdentityEutra5Gc() {
        return cellIdentityEutra5Gc;
    }

    /**
     * Sets the value of the cellIdentityEutra5Gc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CellIdentityEUTRA5GCMapper }
     *     
     */
    public void setCellIdentityEutra5Gc(CellIdentityEUTRA5GCMapper value) {
        this.cellIdentityEutra5Gc = value;
    }

}
