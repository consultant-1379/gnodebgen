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
 * <p>Java class for MeasResultServMOMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultServMOMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="servCellId" type="{}ServCellIndexMapper"/&gt;
 *         &lt;element name="measResultServingCell" type="{}MeasResultNRMapper"/&gt;
 *         &lt;element name="measResultBestNeighCell" type="{}MeasResultNRMapper" minOccurs="0"/&gt;
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
@XmlType(name = "MeasResultServMOMapper", namespace = "", propOrder = {
    "servCellId",
    "measResultServingCell",
    "measResultBestNeighCell",
    "any"
})
public class MeasResultServMOMapper {

    @XmlSchemaType(name = "unsignedByte")
    protected short servCellId;
    @XmlElement(required = true)
    protected MeasResultNRMapper measResultServingCell;
    protected MeasResultNRMapper measResultBestNeighCell;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the servCellId property.
     * 
     */
    public short getServCellId() {
        return servCellId;
    }

    /**
     * Sets the value of the servCellId property.
     * 
     */
    public void setServCellId(short value) {
        this.servCellId = value;
    }

    /**
     * Gets the value of the measResultServingCell property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultNRMapper }
     *     
     */
    public MeasResultNRMapper getMeasResultServingCell() {
        return measResultServingCell;
    }

    /**
     * Sets the value of the measResultServingCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultNRMapper }
     *     
     */
    public void setMeasResultServingCell(MeasResultNRMapper value) {
        this.measResultServingCell = value;
    }

    /**
     * Gets the value of the measResultBestNeighCell property.
     * 
     * @return
     *     possible object is
     *     {@link MeasResultNRMapper }
     *     
     */
    public MeasResultNRMapper getMeasResultBestNeighCell() {
        return measResultBestNeighCell;
    }

    /**
     * Sets the value of the measResultBestNeighCell property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasResultNRMapper }
     *     
     */
    public void setMeasResultBestNeighCell(MeasResultNRMapper value) {
        this.measResultBestNeighCell = value;
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
