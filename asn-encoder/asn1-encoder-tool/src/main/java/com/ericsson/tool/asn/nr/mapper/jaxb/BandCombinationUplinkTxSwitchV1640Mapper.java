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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BandCombination-UplinkTxSwitch-v1640Mapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BandCombination-UplinkTxSwitch-v1640Mapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bandCombination-v1640" type="{http://www.obj-sys.com/NR-RRC-Definitions}BandCombination-v1640Mapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BandCombination-UplinkTxSwitch-v1640Mapper", propOrder = {
    "bandCombinationV1640"
})
public class BandCombinationUplinkTxSwitchV1640Mapper {

    @XmlElement(name = "bandCombination-v1640")
    protected BandCombinationV1640Mapper bandCombinationV1640;

    /**
     * Gets the value of the bandCombinationV1640 property.
     * 
     * @return
     *     possible object is
     *     {@link BandCombinationV1640Mapper }
     *     
     */
    public BandCombinationV1640Mapper getBandCombinationV1640() {
        return bandCombinationV1640;
    }

    /**
     * Sets the value of the bandCombinationV1640 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BandCombinationV1640Mapper }
     *     
     */
    public void setBandCombinationV1640(BandCombinationV1640Mapper value) {
        this.bandCombinationV1640 = value;
    }

}
