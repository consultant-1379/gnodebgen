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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EllipsoidPointWithUncertaintyCircleMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EllipsoidPointWithUncertaintyCircleMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitudeSign"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="north"/&gt;
 *               &lt;enumeration value="south"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="degreesLatitude"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedInt"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="8388607"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="degreesLongitude"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-8388608"/&gt;
 *               &lt;maxInclusive value="8388607"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="uncertainty"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="127"/&gt;
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
@XmlType(name = "EllipsoidPointWithUncertaintyCircleMapper", propOrder = {
    "latitudeSign",
    "degreesLatitude",
    "degreesLongitude",
    "uncertainty"
})
public class EllipsoidPointWithUncertaintyCircleMapper {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String latitudeSign;
    protected long degreesLatitude;
    protected int degreesLongitude;
    protected short uncertainty;

    /**
     * Gets the value of the latitudeSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeSign() {
        return latitudeSign;
    }

    /**
     * Sets the value of the latitudeSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeSign(String value) {
        this.latitudeSign = value;
    }

    /**
     * Gets the value of the degreesLatitude property.
     * 
     */
    public long getDegreesLatitude() {
        return degreesLatitude;
    }

    /**
     * Sets the value of the degreesLatitude property.
     * 
     */
    public void setDegreesLatitude(long value) {
        this.degreesLatitude = value;
    }

    /**
     * Gets the value of the degreesLongitude property.
     * 
     */
    public int getDegreesLongitude() {
        return degreesLongitude;
    }

    /**
     * Sets the value of the degreesLongitude property.
     * 
     */
    public void setDegreesLongitude(int value) {
        this.degreesLongitude = value;
    }

    /**
     * Gets the value of the uncertainty property.
     * 
     */
    public short getUncertainty() {
        return uncertainty;
    }

    /**
     * Sets the value of the uncertainty property.
     * 
     */
    public void setUncertainty(short value) {
        this.uncertainty = value;
    }

}
