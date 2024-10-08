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
 * <p>Java class for UE-BasedPerfMeas-Parameters-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UE-BasedPerfMeas-Parameters-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barometerMeasReport-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="immMeasBT-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="immMeasWLAN-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loggedMeasBT-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loggedMeasurements-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="loggedMeasWLAN-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="orientationMeasReport-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="speedMeasReport-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gnss-Location-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ulPDCP-Delay-r16" minOccurs="0"&gt;
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
@XmlType(name = "UE-BasedPerfMeas-Parameters-r16Mapper", propOrder = {
    "barometerMeasReportR16",
    "immMeasBTR16",
    "immMeasWLANR16",
    "loggedMeasBTR16",
    "loggedMeasurementsR16",
    "loggedMeasWLANR16",
    "orientationMeasReportR16",
    "speedMeasReportR16",
    "gnssLocationR16",
    "ulPDCPDelayR16",
    "any"
})
public class UEBasedPerfMeasParametersR16Mapper {

    @XmlElement(name = "barometerMeasReport-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String barometerMeasReportR16;
    @XmlElement(name = "immMeasBT-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String immMeasBTR16;
    @XmlElement(name = "immMeasWLAN-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String immMeasWLANR16;
    @XmlElement(name = "loggedMeasBT-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loggedMeasBTR16;
    @XmlElement(name = "loggedMeasurements-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loggedMeasurementsR16;
    @XmlElement(name = "loggedMeasWLAN-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loggedMeasWLANR16;
    @XmlElement(name = "orientationMeasReport-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String orientationMeasReportR16;
    @XmlElement(name = "speedMeasReport-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String speedMeasReportR16;
    @XmlElement(name = "gnss-Location-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gnssLocationR16;
    @XmlElement(name = "ulPDCP-Delay-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ulPDCPDelayR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the barometerMeasReportR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarometerMeasReportR16() {
        return barometerMeasReportR16;
    }

    /**
     * Sets the value of the barometerMeasReportR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarometerMeasReportR16(String value) {
        this.barometerMeasReportR16 = value;
    }

    /**
     * Gets the value of the immMeasBTR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmMeasBTR16() {
        return immMeasBTR16;
    }

    /**
     * Sets the value of the immMeasBTR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmMeasBTR16(String value) {
        this.immMeasBTR16 = value;
    }

    /**
     * Gets the value of the immMeasWLANR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImmMeasWLANR16() {
        return immMeasWLANR16;
    }

    /**
     * Sets the value of the immMeasWLANR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImmMeasWLANR16(String value) {
        this.immMeasWLANR16 = value;
    }

    /**
     * Gets the value of the loggedMeasBTR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedMeasBTR16() {
        return loggedMeasBTR16;
    }

    /**
     * Sets the value of the loggedMeasBTR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedMeasBTR16(String value) {
        this.loggedMeasBTR16 = value;
    }

    /**
     * Gets the value of the loggedMeasurementsR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedMeasurementsR16() {
        return loggedMeasurementsR16;
    }

    /**
     * Sets the value of the loggedMeasurementsR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedMeasurementsR16(String value) {
        this.loggedMeasurementsR16 = value;
    }

    /**
     * Gets the value of the loggedMeasWLANR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoggedMeasWLANR16() {
        return loggedMeasWLANR16;
    }

    /**
     * Sets the value of the loggedMeasWLANR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoggedMeasWLANR16(String value) {
        this.loggedMeasWLANR16 = value;
    }

    /**
     * Gets the value of the orientationMeasReportR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientationMeasReportR16() {
        return orientationMeasReportR16;
    }

    /**
     * Sets the value of the orientationMeasReportR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientationMeasReportR16(String value) {
        this.orientationMeasReportR16 = value;
    }

    /**
     * Gets the value of the speedMeasReportR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpeedMeasReportR16() {
        return speedMeasReportR16;
    }

    /**
     * Sets the value of the speedMeasReportR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpeedMeasReportR16(String value) {
        this.speedMeasReportR16 = value;
    }

    /**
     * Gets the value of the gnssLocationR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGnssLocationR16() {
        return gnssLocationR16;
    }

    /**
     * Sets the value of the gnssLocationR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGnssLocationR16(String value) {
        this.gnssLocationR16 = value;
    }

    /**
     * Gets the value of the ulPDCPDelayR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlPDCPDelayR16() {
        return ulPDCPDelayR16;
    }

    /**
     * Sets the value of the ulPDCPDelayR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlPDCPDelayR16(String value) {
        this.ulPDCPDelayR16 = value;
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
