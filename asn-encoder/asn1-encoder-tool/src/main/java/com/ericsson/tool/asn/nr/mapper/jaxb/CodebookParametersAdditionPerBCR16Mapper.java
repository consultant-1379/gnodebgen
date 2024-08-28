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
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodebookParametersAdditionPerBC-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodebookParametersAdditionPerBC-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="etype2R1-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction&gt;
 *               &lt;simpleType&gt;
 *                 &lt;list&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxInclusive value="511"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/list&gt;
 *               &lt;/simpleType&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="etype2R2-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction&gt;
 *               &lt;simpleType&gt;
 *                 &lt;list&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxInclusive value="511"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/list&gt;
 *               &lt;/simpleType&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="etype2R1-PortSelection-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction&gt;
 *               &lt;simpleType&gt;
 *                 &lt;list&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxInclusive value="511"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/list&gt;
 *               &lt;/simpleType&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="16"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="etype2R2-PortSelection-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction&gt;
 *               &lt;simpleType&gt;
 *                 &lt;list&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedShort"&gt;
 *                       &lt;minInclusive value="0"/&gt;
 *                       &lt;maxInclusive value="511"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/list&gt;
 *               &lt;/simpleType&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="16"/&gt;
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
@XmlType(name = "CodebookParametersAdditionPerBC-r16Mapper", propOrder = {
    "etype2R1R16",
    "etype2R2R16",
    "etype2R1PortSelectionR16",
    "etype2R2PortSelectionR16"
})
public class CodebookParametersAdditionPerBCR16Mapper {

    @XmlList
    @XmlElement(name = "etype2R1-r16", type = Integer.class)
    protected List<Integer> etype2R1R16;
    @XmlList
    @XmlElement(name = "etype2R2-r16", type = Integer.class)
    protected List<Integer> etype2R2R16;
    @XmlList
    @XmlElement(name = "etype2R1-PortSelection-r16", type = Integer.class)
    protected List<Integer> etype2R1PortSelectionR16;
    @XmlList
    @XmlElement(name = "etype2R2-PortSelection-r16", type = Integer.class)
    protected List<Integer> etype2R2PortSelectionR16;

    /**
     * Gets the value of the etype2R1R16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etype2R1R16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtype2R1R16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEtype2R1R16() {
        if (etype2R1R16 == null) {
            etype2R1R16 = new ArrayList<Integer>();
        }
        return this.etype2R1R16;
    }

    /**
     * Gets the value of the etype2R2R16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etype2R2R16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtype2R2R16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEtype2R2R16() {
        if (etype2R2R16 == null) {
            etype2R2R16 = new ArrayList<Integer>();
        }
        return this.etype2R2R16;
    }

    /**
     * Gets the value of the etype2R1PortSelectionR16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etype2R1PortSelectionR16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtype2R1PortSelectionR16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEtype2R1PortSelectionR16() {
        if (etype2R1PortSelectionR16 == null) {
            etype2R1PortSelectionR16 = new ArrayList<Integer>();
        }
        return this.etype2R1PortSelectionR16;
    }

    /**
     * Gets the value of the etype2R2PortSelectionR16 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the etype2R2PortSelectionR16 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEtype2R2PortSelectionR16().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getEtype2R2PortSelectionR16() {
        if (etype2R2PortSelectionR16 == null) {
            etype2R2PortSelectionR16 = new ArrayList<Integer>();
        }
        return this.etype2R2PortSelectionR16;
    }

}
