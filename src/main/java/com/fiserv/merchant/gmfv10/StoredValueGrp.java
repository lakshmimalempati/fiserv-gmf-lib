//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for StoredValueGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StoredValueGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}EschtblTxn" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardClass" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardCost" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FACode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FrstTrnNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnCnt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnHstDtl" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnRtn" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SVActType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SCV" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}EAN" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PromoCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PostDate" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoredValueGrp", propOrder = {
    "eschtblTxn",
    "cardClass",
    "cardCost",
    "faCode",
    "frstTrnNum",
    "txnCnt",
    "txnHstDtl",
    "txnRtn",
    "svActType",
    "scv",
    "ean",
    "promoCode",
    "postDate"
})
public class StoredValueGrp {

    @XmlElement(name = "EschtblTxn")
    @XmlSchemaType(name = "string")
    protected EschtblTxnType eschtblTxn;
    @XmlElement(name = "CardClass")
    protected String cardClass;
    @XmlElement(name = "CardCost")
    protected String cardCost;
    @XmlElement(name = "FACode")
    protected String faCode;
    @XmlElement(name = "FrstTrnNum")
    protected String frstTrnNum;
    @XmlElement(name = "TxnCnt")
    protected String txnCnt;
    @XmlElement(name = "TxnHstDtl")
    protected String txnHstDtl;
    @XmlElement(name = "TxnRtn")
    protected String txnRtn;
    @XmlElement(name = "SVActType")
    @XmlSchemaType(name = "string")
    protected SVActTypeType svActType;
    @XmlElement(name = "SCV")
    protected String scv;
    @XmlElement(name = "EAN")
    protected String ean;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "PostDate")
    protected String postDate;

    /**
     * Gets the value of the eschtblTxn property.
     * 
     * @return
     *     possible object is
     *     {@link EschtblTxnType }
     *     
     */
    public EschtblTxnType getEschtblTxn() {
        return eschtblTxn;
    }

    /**
     * Sets the value of the eschtblTxn property.
     * 
     * @param value
     *     allowed object is
     *     {@link EschtblTxnType }
     *     
     */
    public void setEschtblTxn(EschtblTxnType value) {
        this.eschtblTxn = value;
    }

    /**
     * Gets the value of the cardClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardClass() {
        return cardClass;
    }

    /**
     * Sets the value of the cardClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardClass(String value) {
        this.cardClass = value;
    }

    /**
     * Gets the value of the cardCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCost() {
        return cardCost;
    }

    /**
     * Sets the value of the cardCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCost(String value) {
        this.cardCost = value;
    }

    /**
     * Gets the value of the faCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFACode() {
        return faCode;
    }

    /**
     * Sets the value of the faCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFACode(String value) {
        this.faCode = value;
    }

    /**
     * Gets the value of the frstTrnNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrstTrnNum() {
        return frstTrnNum;
    }

    /**
     * Sets the value of the frstTrnNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrstTrnNum(String value) {
        this.frstTrnNum = value;
    }

    /**
     * Gets the value of the txnCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnCnt() {
        return txnCnt;
    }

    /**
     * Sets the value of the txnCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnCnt(String value) {
        this.txnCnt = value;
    }

    /**
     * Gets the value of the txnHstDtl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnHstDtl() {
        return txnHstDtl;
    }

    /**
     * Sets the value of the txnHstDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnHstDtl(String value) {
        this.txnHstDtl = value;
    }

    /**
     * Gets the value of the txnRtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnRtn() {
        return txnRtn;
    }

    /**
     * Sets the value of the txnRtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnRtn(String value) {
        this.txnRtn = value;
    }

    /**
     * Gets the value of the svActType property.
     * 
     * @return
     *     possible object is
     *     {@link SVActTypeType }
     *     
     */
    public SVActTypeType getSVActType() {
        return svActType;
    }

    /**
     * Sets the value of the svActType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SVActTypeType }
     *     
     */
    public void setSVActType(SVActTypeType value) {
        this.svActType = value;
    }

    /**
     * Gets the value of the scv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSCV() {
        return scv;
    }

    /**
     * Sets the value of the scv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSCV(String value) {
        this.scv = value;
    }

    /**
     * Gets the value of the ean property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEAN() {
        return ean;
    }

    /**
     * Sets the value of the ean property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEAN(String value) {
        this.ean = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the postDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostDate() {
        return postDate;
    }

    /**
     * Sets the value of the postDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostDate(String value) {
        this.postDate = value;
    }

}
