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
 * <p>Java class for SDAP-ParametersMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SDAP-ParametersMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="as-ReflectiveQoS" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="true"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sdap-QOS-IAB-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sdapHeaderIAB-r16" minOccurs="0"&gt;
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
@XmlType(name = "SDAP-ParametersMapper", propOrder = {
    "asReflectiveQoS",
    "sdapQOSIABR16",
    "sdapHeaderIABR16",
    "any"
})
public class SDAPParametersMapper {

    @XmlElement(name = "as-ReflectiveQoS")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String asReflectiveQoS;
    @XmlElement(name = "sdap-QOS-IAB-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sdapQOSIABR16;
    @XmlElement(name = "sdapHeaderIAB-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sdapHeaderIABR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the asReflectiveQoS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAsReflectiveQoS() {
        return asReflectiveQoS;
    }

    /**
     * Sets the value of the asReflectiveQoS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAsReflectiveQoS(String value) {
        this.asReflectiveQoS = value;
    }

    /**
     * Gets the value of the sdapQOSIABR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdapQOSIABR16() {
        return sdapQOSIABR16;
    }

    /**
     * Sets the value of the sdapQOSIABR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdapQOSIABR16(String value) {
        this.sdapQOSIABR16 = value;
    }

    /**
     * Gets the value of the sdapHeaderIABR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSdapHeaderIABR16() {
        return sdapHeaderIABR16;
    }

    /**
     * Sets the value of the sdapHeaderIABR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdapHeaderIABR16(String value) {
        this.sdapHeaderIABR16 = value;
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
