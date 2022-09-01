//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrigAuthGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrigAuthGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigAuthID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigResponseDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigLocalDateTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigTranDateTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigSTAN" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigRespCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigAthNtwkID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrigDebitTraceNum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrigAuthGrp", propOrder = {
    "origAuthID",
    "origResponseDate",
    "origLocalDateTime",
    "origTranDateTime",
    "origSTAN",
    "origRespCode",
    "origAthNtwkID",
    "origDebitTraceNum"
})
public class OrigAuthGrp {

    @XmlElement(name = "OrigAuthID")
    protected String origAuthID;
    @XmlElement(name = "OrigResponseDate")
    protected String origResponseDate;
    @XmlElement(name = "OrigLocalDateTime")
    protected String origLocalDateTime;
    @XmlElement(name = "OrigTranDateTime")
    protected String origTranDateTime;
    @XmlElement(name = "OrigSTAN")
    protected String origSTAN;
    @XmlElement(name = "OrigRespCode")
    protected String origRespCode;
    @XmlElement(name = "OrigAthNtwkID")
    protected String origAthNtwkID;
    @XmlElement(name = "OrigDebitTraceNum")
    protected String origDebitTraceNum;

    /**
     * Gets the value of the origAuthID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigAuthID() {
        return origAuthID;
    }

    /**
     * Sets the value of the origAuthID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigAuthID(String value) {
        this.origAuthID = value;
    }

    /**
     * Gets the value of the origResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigResponseDate() {
        return origResponseDate;
    }

    /**
     * Sets the value of the origResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigResponseDate(String value) {
        this.origResponseDate = value;
    }

    /**
     * Gets the value of the origLocalDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigLocalDateTime() {
        return origLocalDateTime;
    }

    /**
     * Sets the value of the origLocalDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigLocalDateTime(String value) {
        this.origLocalDateTime = value;
    }

    /**
     * Gets the value of the origTranDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigTranDateTime() {
        return origTranDateTime;
    }

    /**
     * Sets the value of the origTranDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigTranDateTime(String value) {
        this.origTranDateTime = value;
    }

    /**
     * Gets the value of the origSTAN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigSTAN() {
        return origSTAN;
    }

    /**
     * Sets the value of the origSTAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigSTAN(String value) {
        this.origSTAN = value;
    }

    /**
     * Gets the value of the origRespCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigRespCode() {
        return origRespCode;
    }

    /**
     * Sets the value of the origRespCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigRespCode(String value) {
        this.origRespCode = value;
    }

    /**
     * Gets the value of the origAthNtwkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigAthNtwkID() {
        return origAthNtwkID;
    }

    /**
     * Sets the value of the origAthNtwkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigAthNtwkID(String value) {
        this.origAthNtwkID = value;
    }

    /**
     * Gets the value of the origDebitTraceNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigDebitTraceNum() {
        return origDebitTraceNum;
    }

    /**
     * Sets the value of the origDebitTraceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigDebitTraceNum(String value) {
        this.origDebitTraceNum = value;
    }

}
