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
 * <p>Java class for DummyFMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DummyFMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="maxNumberPeriodicCSI-ReportPerBWP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberAperiodicCSI-ReportPerBWP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="maxNumberSemiPersistentCSI-ReportPerBWP"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="0"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="simultaneousCSI-ReportsAllCC"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte"&gt;
 *               &lt;minInclusive value="5"/&gt;
 *               &lt;maxInclusive value="32"/&gt;
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
@XmlType(name = "DummyFMapper", propOrder = {
    "maxNumberPeriodicCSIReportPerBWP",
    "maxNumberAperiodicCSIReportPerBWP",
    "maxNumberSemiPersistentCSIReportPerBWP",
    "simultaneousCSIReportsAllCC"
})
public class DummyFMapper {

    @XmlElement(name = "maxNumberPeriodicCSI-ReportPerBWP")
    protected short maxNumberPeriodicCSIReportPerBWP;
    @XmlElement(name = "maxNumberAperiodicCSI-ReportPerBWP")
    protected short maxNumberAperiodicCSIReportPerBWP;
    @XmlElement(name = "maxNumberSemiPersistentCSI-ReportPerBWP")
    protected short maxNumberSemiPersistentCSIReportPerBWP;
    @XmlElement(name = "simultaneousCSI-ReportsAllCC")
    protected short simultaneousCSIReportsAllCC;

    /**
     * Gets the value of the maxNumberPeriodicCSIReportPerBWP property.
     * 
     */
    public short getMaxNumberPeriodicCSIReportPerBWP() {
        return maxNumberPeriodicCSIReportPerBWP;
    }

    /**
     * Sets the value of the maxNumberPeriodicCSIReportPerBWP property.
     * 
     */
    public void setMaxNumberPeriodicCSIReportPerBWP(short value) {
        this.maxNumberPeriodicCSIReportPerBWP = value;
    }

    /**
     * Gets the value of the maxNumberAperiodicCSIReportPerBWP property.
     * 
     */
    public short getMaxNumberAperiodicCSIReportPerBWP() {
        return maxNumberAperiodicCSIReportPerBWP;
    }

    /**
     * Sets the value of the maxNumberAperiodicCSIReportPerBWP property.
     * 
     */
    public void setMaxNumberAperiodicCSIReportPerBWP(short value) {
        this.maxNumberAperiodicCSIReportPerBWP = value;
    }

    /**
     * Gets the value of the maxNumberSemiPersistentCSIReportPerBWP property.
     * 
     */
    public short getMaxNumberSemiPersistentCSIReportPerBWP() {
        return maxNumberSemiPersistentCSIReportPerBWP;
    }

    /**
     * Sets the value of the maxNumberSemiPersistentCSIReportPerBWP property.
     * 
     */
    public void setMaxNumberSemiPersistentCSIReportPerBWP(short value) {
        this.maxNumberSemiPersistentCSIReportPerBWP = value;
    }

    /**
     * Gets the value of the simultaneousCSIReportsAllCC property.
     * 
     */
    public short getSimultaneousCSIReportsAllCC() {
        return simultaneousCSIReportsAllCC;
    }

    /**
     * Sets the value of the simultaneousCSIReportsAllCC property.
     * 
     */
    public void setSimultaneousCSIReportsAllCC(short value) {
        this.simultaneousCSIReportsAllCC = value;
    }

}
