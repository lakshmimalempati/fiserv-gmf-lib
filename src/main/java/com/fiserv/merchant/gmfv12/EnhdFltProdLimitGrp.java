//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.02 at 12:35:42 PM IST 
//


package com.fiserv.merchant.gmfv12;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnhdFltProdLimitGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhdFltProdLimitGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltProdCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltAmtLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhdFltProdLimitGrp", propOrder = {
    "enhdFltProdCode",
    "enhdFltAmtLimit"
})
public class EnhdFltProdLimitGrp {

    @XmlElement(name = "EnhdFltProdCode")
    protected String enhdFltProdCode;
    @XmlElement(name = "EnhdFltAmtLimit")
    protected String enhdFltAmtLimit;

    /**
     * Gets the value of the enhdFltProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltProdCode() {
        return enhdFltProdCode;
    }

    /**
     * Sets the value of the enhdFltProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltProdCode(String value) {
        this.enhdFltProdCode = value;
    }

    /**
     * Gets the value of the enhdFltAmtLimit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltAmtLimit() {
        return enhdFltAmtLimit;
    }

    /**
     * Sets the value of the enhdFltAmtLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltAmtLimit(String value) {
        this.enhdFltAmtLimit = value;
    }

}
