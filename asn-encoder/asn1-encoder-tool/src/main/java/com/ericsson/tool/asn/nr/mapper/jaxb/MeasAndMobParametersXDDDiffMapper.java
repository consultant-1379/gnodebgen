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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * <p>Java class for MeasAndMobParametersXDD-DiffMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasAndMobParametersXDD-DiffMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intraAndInterF-MeasAndReport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eventA-MeasAndReport" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="handoverInterF" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="handoverLTE-EPC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="handoverLTE-5GC" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sftd-MeasNR-Neigh" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sftd-MeasNR-Neigh-DRX" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dummy" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
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
@XmlType(name = "MeasAndMobParametersXDD-DiffMapper", propOrder = {
    "intraAndInterFMeasAndReport",
    "eventAMeasAndReport",
    "handoverInterF",
    "handoverLTEEPC",
    "handoverLTE5GC",
    "sftdMeasNRNeigh",
    "sftdMeasNRNeighDRX",
    "dummy",
    "any"
})
public class MeasAndMobParametersXDDDiffMapper {

    @XmlElement(name = "intraAndInterF-MeasAndReport")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String intraAndInterFMeasAndReport;
    @XmlElement(name = "eventA-MeasAndReport")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String eventAMeasAndReport;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handoverInterF;
    @XmlElement(name = "handoverLTE-EPC")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handoverLTEEPC;
    @XmlElement(name = "handoverLTE-5GC")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String handoverLTE5GC;
    @XmlElement(name = "sftd-MeasNR-Neigh")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sftdMeasNRNeigh;
    @XmlElement(name = "sftd-MeasNR-Neigh-DRX")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sftdMeasNRNeighDRX;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dummy;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the intraAndInterFMeasAndReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntraAndInterFMeasAndReport() {
        return intraAndInterFMeasAndReport;
    }

    /**
     * Sets the value of the intraAndInterFMeasAndReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntraAndInterFMeasAndReport(String value) {
        this.intraAndInterFMeasAndReport = value;
    }

    /**
     * Gets the value of the eventAMeasAndReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventAMeasAndReport() {
        return eventAMeasAndReport;
    }

    /**
     * Sets the value of the eventAMeasAndReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventAMeasAndReport(String value) {
        this.eventAMeasAndReport = value;
    }

    /**
     * Gets the value of the handoverInterF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverInterF() {
        return handoverInterF;
    }

    /**
     * Sets the value of the handoverInterF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverInterF(String value) {
        this.handoverInterF = value;
    }

    /**
     * Gets the value of the handoverLTEEPC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverLTEEPC() {
        return handoverLTEEPC;
    }

    /**
     * Sets the value of the handoverLTEEPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverLTEEPC(String value) {
        this.handoverLTEEPC = value;
    }

    /**
     * Gets the value of the handoverLTE5GC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverLTE5GC() {
        return handoverLTE5GC;
    }

    /**
     * Sets the value of the handoverLTE5GC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverLTE5GC(String value) {
        this.handoverLTE5GC = value;
    }

    /**
     * Gets the value of the sftdMeasNRNeigh property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSftdMeasNRNeigh() {
        return sftdMeasNRNeigh;
    }

    /**
     * Sets the value of the sftdMeasNRNeigh property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSftdMeasNRNeigh(String value) {
        this.sftdMeasNRNeigh = value;
    }

    /**
     * Gets the value of the sftdMeasNRNeighDRX property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSftdMeasNRNeighDRX() {
        return sftdMeasNRNeighDRX;
    }

    /**
     * Sets the value of the sftdMeasNRNeighDRX property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSftdMeasNRNeighDRX(String value) {
        this.sftdMeasNRNeighDRX = value;
    }

    /**
     * Gets the value of the dummy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDummy() {
        return dummy;
    }

    /**
     * Sets the value of the dummy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDummy(String value) {
        this.dummy = value;
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
