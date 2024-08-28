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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FeatureSetUplinkPerCCMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeatureSetUplinkPerCCMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="supportedSubcarrierSpacingUL" type="{http://www.obj-sys.com/NR-RRC-Definitions}SubcarrierSpacingMapper"/&gt;
 *         &lt;element name="supportedBandwidthUL" type="{http://www.obj-sys.com/NR-RRC-Definitions}SupportedBandwidthMapper"/&gt;
 *         &lt;element name="channelBW-90mhz" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="supported"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="mimo-CB-PUSCH" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="maxNumberMIMO-LayersCB-PUSCH" type="{http://www.obj-sys.com/NR-RRC-Definitions}MIMO-LayersULMapper" minOccurs="0"/&gt;
 *                   &lt;element name="maxNumberSRS-ResourcePerSet"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="2"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberMIMO-LayersNonCB-PUSCH" type="{http://www.obj-sys.com/NR-RRC-Definitions}MIMO-LayersULMapper" minOccurs="0"/&gt;
 *         &lt;element name="supportedModulationOrderUL" type="{http://www.obj-sys.com/NR-RRC-Definitions}ModulationOrderMapper" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeatureSetUplinkPerCCMapper", propOrder = {
    "supportedSubcarrierSpacingUL",
    "supportedBandwidthUL",
    "channelBW90Mhz",
    "mimoCBPUSCH",
    "maxNumberMIMOLayersNonCBPUSCH",
    "supportedModulationOrderUL"
})
public class FeatureSetUplinkPerCCMapper {

    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected SubcarrierSpacingMapper supportedSubcarrierSpacingUL;
    @XmlElement(required = true)
    protected SupportedBandwidthMapper supportedBandwidthUL;
    @XmlElement(name = "channelBW-90mhz")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String channelBW90Mhz;
    @XmlElement(name = "mimo-CB-PUSCH")
    protected FeatureSetUplinkPerCCMapper.MimoCBPUSCH mimoCBPUSCH;
    @XmlElement(name = "maxNumberMIMO-LayersNonCB-PUSCH")
    @XmlSchemaType(name = "token")
    protected MIMOLayersULMapper maxNumberMIMOLayersNonCBPUSCH;
    @XmlSchemaType(name = "token")
    protected ModulationOrderMapper supportedModulationOrderUL;

    /**
     * Gets the value of the supportedSubcarrierSpacingUL property.
     * 
     * @return
     *     possible object is
     *     {@link SubcarrierSpacingMapper }
     *     
     */
    public SubcarrierSpacingMapper getSupportedSubcarrierSpacingUL() {
        return supportedSubcarrierSpacingUL;
    }

    /**
     * Sets the value of the supportedSubcarrierSpacingUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubcarrierSpacingMapper }
     *     
     */
    public void setSupportedSubcarrierSpacingUL(SubcarrierSpacingMapper value) {
        this.supportedSubcarrierSpacingUL = value;
    }

    /**
     * Gets the value of the supportedBandwidthUL property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedBandwidthMapper }
     *     
     */
    public SupportedBandwidthMapper getSupportedBandwidthUL() {
        return supportedBandwidthUL;
    }

    /**
     * Sets the value of the supportedBandwidthUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedBandwidthMapper }
     *     
     */
    public void setSupportedBandwidthUL(SupportedBandwidthMapper value) {
        this.supportedBandwidthUL = value;
    }

    /**
     * Gets the value of the channelBW90Mhz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelBW90Mhz() {
        return channelBW90Mhz;
    }

    /**
     * Sets the value of the channelBW90Mhz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelBW90Mhz(String value) {
        this.channelBW90Mhz = value;
    }

    /**
     * Gets the value of the mimoCBPUSCH property.
     * 
     * @return
     *     possible object is
     *     {@link FeatureSetUplinkPerCCMapper.MimoCBPUSCH }
     *     
     */
    public FeatureSetUplinkPerCCMapper.MimoCBPUSCH getMimoCBPUSCH() {
        return mimoCBPUSCH;
    }

    /**
     * Sets the value of the mimoCBPUSCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeatureSetUplinkPerCCMapper.MimoCBPUSCH }
     *     
     */
    public void setMimoCBPUSCH(FeatureSetUplinkPerCCMapper.MimoCBPUSCH value) {
        this.mimoCBPUSCH = value;
    }

    /**
     * Gets the value of the maxNumberMIMOLayersNonCBPUSCH property.
     * 
     * @return
     *     possible object is
     *     {@link MIMOLayersULMapper }
     *     
     */
    public MIMOLayersULMapper getMaxNumberMIMOLayersNonCBPUSCH() {
        return maxNumberMIMOLayersNonCBPUSCH;
    }

    /**
     * Sets the value of the maxNumberMIMOLayersNonCBPUSCH property.
     * 
     * @param value
     *     allowed object is
     *     {@link MIMOLayersULMapper }
     *     
     */
    public void setMaxNumberMIMOLayersNonCBPUSCH(MIMOLayersULMapper value) {
        this.maxNumberMIMOLayersNonCBPUSCH = value;
    }

    /**
     * Gets the value of the supportedModulationOrderUL property.
     * 
     * @return
     *     possible object is
     *     {@link ModulationOrderMapper }
     *     
     */
    public ModulationOrderMapper getSupportedModulationOrderUL() {
        return supportedModulationOrderUL;
    }

    /**
     * Sets the value of the supportedModulationOrderUL property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModulationOrderMapper }
     *     
     */
    public void setSupportedModulationOrderUL(ModulationOrderMapper value) {
        this.supportedModulationOrderUL = value;
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
     *         &lt;element name="maxNumberMIMO-LayersCB-PUSCH" type="{http://www.obj-sys.com/NR-RRC-Definitions}MIMO-LayersULMapper" minOccurs="0"/&gt;
     *         &lt;element name="maxNumberSRS-ResourcePerSet"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="2"/&gt;
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
    @XmlType(name = "", propOrder = {
        "maxNumberMIMOLayersCBPUSCH",
        "maxNumberSRSResourcePerSet"
    })
    public static class MimoCBPUSCH {

        @XmlElement(name = "maxNumberMIMO-LayersCB-PUSCH")
        @XmlSchemaType(name = "token")
        protected MIMOLayersULMapper maxNumberMIMOLayersCBPUSCH;
        @XmlElement(name = "maxNumberSRS-ResourcePerSet")
        protected short maxNumberSRSResourcePerSet;

        /**
         * Gets the value of the maxNumberMIMOLayersCBPUSCH property.
         * 
         * @return
         *     possible object is
         *     {@link MIMOLayersULMapper }
         *     
         */
        public MIMOLayersULMapper getMaxNumberMIMOLayersCBPUSCH() {
            return maxNumberMIMOLayersCBPUSCH;
        }

        /**
         * Sets the value of the maxNumberMIMOLayersCBPUSCH property.
         * 
         * @param value
         *     allowed object is
         *     {@link MIMOLayersULMapper }
         *     
         */
        public void setMaxNumberMIMOLayersCBPUSCH(MIMOLayersULMapper value) {
            this.maxNumberMIMOLayersCBPUSCH = value;
        }

        /**
         * Gets the value of the maxNumberSRSResourcePerSet property.
         * 
         */
        public short getMaxNumberSRSResourcePerSet() {
            return maxNumberSRSResourcePerSet;
        }

        /**
         * Sets the value of the maxNumberSRSResourcePerSet property.
         * 
         */
        public void setMaxNumberSRSResourcePerSet(short value) {
            this.maxNumberSRSResourcePerSet = value;
        }

    }

}
