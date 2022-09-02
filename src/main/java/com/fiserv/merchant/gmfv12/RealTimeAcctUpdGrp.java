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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealTimeAcctUpdGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RealTimeAcctUpdGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctUpdReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctUpdCardStat" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctUpdCardNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctUpdExpDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctUpdResultCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RealTimeAcctUpdGrp", propOrder = {
    "acctUpdReqInd",
    "acctUpdCardStat",
    "acctUpdCardNum",
    "acctUpdExpDate",
    "acctUpdResultCode"
})
public class RealTimeAcctUpdGrp {

    @XmlElement(name = "AcctUpdReqInd")
    @XmlSchemaType(name = "string")
    protected AcctUpdReqIndType acctUpdReqInd;
    @XmlElement(name = "AcctUpdCardStat")
    protected String acctUpdCardStat;
    @XmlElement(name = "AcctUpdCardNum")
    protected String acctUpdCardNum;
    @XmlElement(name = "AcctUpdExpDate")
    protected String acctUpdExpDate;
    @XmlElement(name = "AcctUpdResultCode")
    protected String acctUpdResultCode;

    /**
     * Gets the value of the acctUpdReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link AcctUpdReqIndType }
     *     
     */
    public AcctUpdReqIndType getAcctUpdReqInd() {
        return acctUpdReqInd;
    }

    /**
     * Sets the value of the acctUpdReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctUpdReqIndType }
     *     
     */
    public void setAcctUpdReqInd(AcctUpdReqIndType value) {
        this.acctUpdReqInd = value;
    }

    /**
     * Gets the value of the acctUpdCardStat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUpdCardStat() {
        return acctUpdCardStat;
    }

    /**
     * Sets the value of the acctUpdCardStat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUpdCardStat(String value) {
        this.acctUpdCardStat = value;
    }

    /**
     * Gets the value of the acctUpdCardNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUpdCardNum() {
        return acctUpdCardNum;
    }

    /**
     * Sets the value of the acctUpdCardNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUpdCardNum(String value) {
        this.acctUpdCardNum = value;
    }

    /**
     * Gets the value of the acctUpdExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUpdExpDate() {
        return acctUpdExpDate;
    }

    /**
     * Sets the value of the acctUpdExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUpdExpDate(String value) {
        this.acctUpdExpDate = value;
    }

    /**
     * Gets the value of the acctUpdResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctUpdResultCode() {
        return acctUpdResultCode;
    }

    /**
     * Sets the value of the acctUpdResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctUpdResultCode(String value) {
        this.acctUpdResultCode = value;
    }

}