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
 * <p>Java class for MAC-ParametersFRX-Diff-r16Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MAC-ParametersFRX-Diff-r16Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="directMCG-SCellActivation-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="directMCG-SCellActivationResume-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="directSCG-SCellActivation-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="directSCG-SCellActivationResume-r16" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="drx-Adaptation-r16" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="non-SharedSpectrumChAccess-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MinTimeGap-r16Mapper" minOccurs="0"/&gt;
 *                   &lt;element name="sharedSpectrumChAccess-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MinTimeGap-r16Mapper" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "MAC-ParametersFRX-Diff-r16Mapper", propOrder = {
    "directMCGSCellActivationR16",
    "directMCGSCellActivationResumeR16",
    "directSCGSCellActivationR16",
    "directSCGSCellActivationResumeR16",
    "drxAdaptationR16",
    "any"
})
public class MACParametersFRXDiffR16Mapper {

    @XmlElement(name = "directMCG-SCellActivation-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String directMCGSCellActivationR16;
    @XmlElement(name = "directMCG-SCellActivationResume-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String directMCGSCellActivationResumeR16;
    @XmlElement(name = "directSCG-SCellActivation-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String directSCGSCellActivationR16;
    @XmlElement(name = "directSCG-SCellActivationResume-r16")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String directSCGSCellActivationResumeR16;
    @XmlElement(name = "drx-Adaptation-r16")
    protected MACParametersFRXDiffR16Mapper.DrxAdaptationR16 drxAdaptationR16;
    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the directMCGSCellActivationR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectMCGSCellActivationR16() {
        return directMCGSCellActivationR16;
    }

    /**
     * Sets the value of the directMCGSCellActivationR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectMCGSCellActivationR16(String value) {
        this.directMCGSCellActivationR16 = value;
    }

    /**
     * Gets the value of the directMCGSCellActivationResumeR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectMCGSCellActivationResumeR16() {
        return directMCGSCellActivationResumeR16;
    }

    /**
     * Sets the value of the directMCGSCellActivationResumeR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectMCGSCellActivationResumeR16(String value) {
        this.directMCGSCellActivationResumeR16 = value;
    }

    /**
     * Gets the value of the directSCGSCellActivationR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectSCGSCellActivationR16() {
        return directSCGSCellActivationR16;
    }

    /**
     * Sets the value of the directSCGSCellActivationR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectSCGSCellActivationR16(String value) {
        this.directSCGSCellActivationR16 = value;
    }

    /**
     * Gets the value of the directSCGSCellActivationResumeR16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectSCGSCellActivationResumeR16() {
        return directSCGSCellActivationResumeR16;
    }

    /**
     * Sets the value of the directSCGSCellActivationResumeR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectSCGSCellActivationResumeR16(String value) {
        this.directSCGSCellActivationResumeR16 = value;
    }

    /**
     * Gets the value of the drxAdaptationR16 property.
     * 
     * @return
     *     possible object is
     *     {@link MACParametersFRXDiffR16Mapper.DrxAdaptationR16 }
     *     
     */
    public MACParametersFRXDiffR16Mapper.DrxAdaptationR16 getDrxAdaptationR16() {
        return drxAdaptationR16;
    }

    /**
     * Sets the value of the drxAdaptationR16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MACParametersFRXDiffR16Mapper.DrxAdaptationR16 }
     *     
     */
    public void setDrxAdaptationR16(MACParametersFRXDiffR16Mapper.DrxAdaptationR16 value) {
        this.drxAdaptationR16 = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="non-SharedSpectrumChAccess-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MinTimeGap-r16Mapper" minOccurs="0"/&gt;
     *         &lt;element name="sharedSpectrumChAccess-r16" type="{http://www.obj-sys.com/NR-RRC-Definitions}MinTimeGap-r16Mapper" minOccurs="0"/&gt;
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
        "nonSharedSpectrumChAccessR16",
        "sharedSpectrumChAccessR16"
    })
    public static class DrxAdaptationR16 {

        @XmlElement(name = "non-SharedSpectrumChAccess-r16")
        protected MinTimeGapR16Mapper nonSharedSpectrumChAccessR16;
        @XmlElement(name = "sharedSpectrumChAccess-r16")
        protected MinTimeGapR16Mapper sharedSpectrumChAccessR16;

        /**
         * Gets the value of the nonSharedSpectrumChAccessR16 property.
         * 
         * @return
         *     possible object is
         *     {@link MinTimeGapR16Mapper }
         *     
         */
        public MinTimeGapR16Mapper getNonSharedSpectrumChAccessR16() {
            return nonSharedSpectrumChAccessR16;
        }

        /**
         * Sets the value of the nonSharedSpectrumChAccessR16 property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinTimeGapR16Mapper }
         *     
         */
        public void setNonSharedSpectrumChAccessR16(MinTimeGapR16Mapper value) {
            this.nonSharedSpectrumChAccessR16 = value;
        }

        /**
         * Gets the value of the sharedSpectrumChAccessR16 property.
         * 
         * @return
         *     possible object is
         *     {@link MinTimeGapR16Mapper }
         *     
         */
        public MinTimeGapR16Mapper getSharedSpectrumChAccessR16() {
            return sharedSpectrumChAccessR16;
        }

        /**
         * Sets the value of the sharedSpectrumChAccessR16 property.
         * 
         * @param value
         *     allowed object is
         *     {@link MinTimeGapR16Mapper }
         *     
         */
        public void setSharedSpectrumChAccessR16(MinTimeGapR16Mapper value) {
            this.sharedSpectrumChAccessR16 = value;
        }

    }

}
