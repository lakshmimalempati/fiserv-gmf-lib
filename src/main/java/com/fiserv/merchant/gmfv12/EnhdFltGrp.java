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
 * <p>Java class for EnhdFltGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnhdFltGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltSetInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltPayeeName" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltChkNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltChkCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltAuthNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltDrivMsg" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltCustName" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltCustCity" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltCustState" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}EnhdFltCustAcctCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnhdFltGrp", propOrder = {
    "enhdFltSetInd",
    "enhdFltPayeeName",
    "enhdFltChkNum",
    "enhdFltChkCode",
    "enhdFltAuthNum",
    "enhdFltDrivMsg",
    "enhdFltCustName",
    "enhdFltCustCity",
    "enhdFltCustState",
    "enhdFltCustAcctCode"
})
public class EnhdFltGrp {

    @XmlElement(name = "EnhdFltSetInd")
    protected String enhdFltSetInd;
    @XmlElement(name = "EnhdFltPayeeName")
    protected String enhdFltPayeeName;
    @XmlElement(name = "EnhdFltChkNum")
    protected String enhdFltChkNum;
    @XmlElement(name = "EnhdFltChkCode")
    protected String enhdFltChkCode;
    @XmlElement(name = "EnhdFltAuthNum")
    protected String enhdFltAuthNum;
    @XmlElement(name = "EnhdFltDrivMsg")
    protected String enhdFltDrivMsg;
    @XmlElement(name = "EnhdFltCustName")
    protected String enhdFltCustName;
    @XmlElement(name = "EnhdFltCustCity")
    protected String enhdFltCustCity;
    @XmlElement(name = "EnhdFltCustState")
    protected String enhdFltCustState;
    @XmlElement(name = "EnhdFltCustAcctCode")
    protected String enhdFltCustAcctCode;

    /**
     * Gets the value of the enhdFltSetInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltSetInd() {
        return enhdFltSetInd;
    }

    /**
     * Sets the value of the enhdFltSetInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltSetInd(String value) {
        this.enhdFltSetInd = value;
    }

    /**
     * Gets the value of the enhdFltPayeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltPayeeName() {
        return enhdFltPayeeName;
    }

    /**
     * Sets the value of the enhdFltPayeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltPayeeName(String value) {
        this.enhdFltPayeeName = value;
    }

    /**
     * Gets the value of the enhdFltChkNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltChkNum() {
        return enhdFltChkNum;
    }

    /**
     * Sets the value of the enhdFltChkNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltChkNum(String value) {
        this.enhdFltChkNum = value;
    }

    /**
     * Gets the value of the enhdFltChkCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltChkCode() {
        return enhdFltChkCode;
    }

    /**
     * Sets the value of the enhdFltChkCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltChkCode(String value) {
        this.enhdFltChkCode = value;
    }

    /**
     * Gets the value of the enhdFltAuthNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltAuthNum() {
        return enhdFltAuthNum;
    }

    /**
     * Sets the value of the enhdFltAuthNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltAuthNum(String value) {
        this.enhdFltAuthNum = value;
    }

    /**
     * Gets the value of the enhdFltDrivMsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltDrivMsg() {
        return enhdFltDrivMsg;
    }

    /**
     * Sets the value of the enhdFltDrivMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltDrivMsg(String value) {
        this.enhdFltDrivMsg = value;
    }

    /**
     * Gets the value of the enhdFltCustName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltCustName() {
        return enhdFltCustName;
    }

    /**
     * Sets the value of the enhdFltCustName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltCustName(String value) {
        this.enhdFltCustName = value;
    }

    /**
     * Gets the value of the enhdFltCustCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltCustCity() {
        return enhdFltCustCity;
    }

    /**
     * Sets the value of the enhdFltCustCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltCustCity(String value) {
        this.enhdFltCustCity = value;
    }

    /**
     * Gets the value of the enhdFltCustState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltCustState() {
        return enhdFltCustState;
    }

    /**
     * Sets the value of the enhdFltCustState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltCustState(String value) {
        this.enhdFltCustState = value;
    }

    /**
     * Gets the value of the enhdFltCustAcctCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnhdFltCustAcctCode() {
        return enhdFltCustAcctCode;
    }

    /**
     * Sets the value of the enhdFltCustAcctCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnhdFltCustAcctCode(String value) {
        this.enhdFltCustAcctCode = value;
    }

}
