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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="rrc-TransactionIdentifier" type="{http://www.obj-sys.com/NR-RRC-Definitions}RRC-TransactionIdentifierMapper"/&gt;
 *         &lt;element name="criticalExtensions"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="ueCapabilityInformation" type="{http://www.obj-sys.com/NR-RRC-Definitions}UECapabilityInformation-IEsMapper"/&gt;
 *                   &lt;element name="criticalExtensionsFuture"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
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
@XmlType(name = "", propOrder = {
    "rrcTransactionIdentifier",
    "criticalExtensions"
})
@XmlRootElement(name = "NrUeCapabilityInformation")
public class NrUeCapabilityInformation {

    @XmlElement(name = "rrc-TransactionIdentifier")
    @XmlSchemaType(name = "unsignedByte")
    protected short rrcTransactionIdentifier;
    @XmlElement(required = true)
    protected NrUeCapabilityInformation.CriticalExtensions criticalExtensions;

    /**
     * Gets the value of the rrcTransactionIdentifier property.
     * 
     */
    public short getRrcTransactionIdentifier() {
        return rrcTransactionIdentifier;
    }

    /**
     * Sets the value of the rrcTransactionIdentifier property.
     * 
     */
    public void setRrcTransactionIdentifier(short value) {
        this.rrcTransactionIdentifier = value;
    }

    /**
     * Gets the value of the criticalExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link NrUeCapabilityInformation.CriticalExtensions }
     *     
     */
    public NrUeCapabilityInformation.CriticalExtensions getCriticalExtensions() {
        return criticalExtensions;
    }

    /**
     * Sets the value of the criticalExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link NrUeCapabilityInformation.CriticalExtensions }
     *     
     */
    public void setCriticalExtensions(NrUeCapabilityInformation.CriticalExtensions value) {
        this.criticalExtensions = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="ueCapabilityInformation" type="{http://www.obj-sys.com/NR-RRC-Definitions}UECapabilityInformation-IEsMapper"/&gt;
     *         &lt;element name="criticalExtensionsFuture"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ueCapabilityInformation",
        "criticalExtensionsFuture"
    })
    public static class CriticalExtensions {

        protected UECapabilityInformationIEsMapper ueCapabilityInformation;
        protected NrUeCapabilityInformation.CriticalExtensions.CriticalExtensionsFuture criticalExtensionsFuture;

        /**
         * Gets the value of the ueCapabilityInformation property.
         * 
         * @return
         *     possible object is
         *     {@link UECapabilityInformationIEsMapper }
         *     
         */
        public UECapabilityInformationIEsMapper getUeCapabilityInformation() {
            return ueCapabilityInformation;
        }

        /**
         * Sets the value of the ueCapabilityInformation property.
         * 
         * @param value
         *     allowed object is
         *     {@link UECapabilityInformationIEsMapper }
         *     
         */
        public void setUeCapabilityInformation(UECapabilityInformationIEsMapper value) {
            this.ueCapabilityInformation = value;
        }

        /**
         * Gets the value of the criticalExtensionsFuture property.
         * 
         * @return
         *     possible object is
         *     {@link NrUeCapabilityInformation.CriticalExtensions.CriticalExtensionsFuture }
         *     
         */
        public NrUeCapabilityInformation.CriticalExtensions.CriticalExtensionsFuture getCriticalExtensionsFuture() {
            return criticalExtensionsFuture;
        }

        /**
         * Sets the value of the criticalExtensionsFuture property.
         * 
         * @param value
         *     allowed object is
         *     {@link NrUeCapabilityInformation.CriticalExtensions.CriticalExtensionsFuture }
         *     
         */
        public void setCriticalExtensionsFuture(NrUeCapabilityInformation.CriticalExtensions.CriticalExtensionsFuture value) {
            this.criticalExtensionsFuture = value;
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
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CriticalExtensionsFuture {


        }

    }

}
