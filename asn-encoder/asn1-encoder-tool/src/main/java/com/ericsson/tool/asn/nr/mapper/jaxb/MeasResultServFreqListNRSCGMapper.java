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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasResultServFreqListNR-SCGMapper complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasResultServFreqListNR-SCGMapper"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="32"&gt;
 *         &lt;element name="MeasResult2NR" type="{}MeasResult2NRMapper"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasResultServFreqListNR-SCGMapper", namespace = "", propOrder = {
    "measResult2NR"
})
public class MeasResultServFreqListNRSCGMapper {

    @XmlElement(name = "MeasResult2NR", required = true)
    protected List<MeasResult2NRMapper> measResult2NR;

    /**
     * Gets the value of the measResult2NR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measResult2NR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasResult2NR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasResult2NRMapper }
     * 
     * 
     */
    public List<MeasResult2NRMapper> getMeasResult2NR() {
        if (measResult2NR == null) {
            measResult2NR = new ArrayList<MeasResult2NRMapper>();
        }
        return this.measResult2NR;
    }

}
