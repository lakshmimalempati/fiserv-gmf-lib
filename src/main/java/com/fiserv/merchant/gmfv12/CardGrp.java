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
 * <p>Java class for CardGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AcctNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CardActivDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CardExpiryDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}Track1Data" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}Track2Data" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CardType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AVSResultCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CCVInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CCVData" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}CCVResultCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}MVVMAID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}InfoReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}FndAcctNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PymtAcctRefReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PymtAcctRef" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}ALMSvcCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}ALMProdCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}ALMProdClass" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}ALMRateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardGrp", propOrder = {
    "acctNum",
    "cardActivDate",
    "cardExpiryDate",
    "track1Data",
    "track2Data",
    "cardType",
    "avsResultCode",
    "ccvInd",
    "ccvData",
    "ccvResultCode",
    "mvvmaid",
    "infoReqInd",
    "fndAcctNum",
    "pymtAcctRefReqInd",
    "pymtAcctRef",
    "almSvcCode",
    "almProdCode",
    "almProdClass",
    "almRateType"
})
public class CardGrp {

    @XmlElement(name = "AcctNum")
    protected String acctNum;
    @XmlElement(name = "CardActivDate")
    protected String cardActivDate;
    @XmlElement(name = "CardExpiryDate")
    protected String cardExpiryDate;
    @XmlElement(name = "Track1Data")
    protected String track1Data;
    @XmlElement(name = "Track2Data")
    protected String track2Data;
    @XmlElement(name = "CardType")
    @XmlSchemaType(name = "string")
    protected CardTypeType cardType;
    @XmlElement(name = "AVSResultCode")
    protected String avsResultCode;
    @XmlElement(name = "CCVInd")
    @XmlSchemaType(name = "string")
    protected CCVIndType ccvInd;
    @XmlElement(name = "CCVData")
    protected String ccvData;
    @XmlElement(name = "CCVResultCode")
    @XmlSchemaType(name = "string")
    protected CCVResultCodeType ccvResultCode;
    @XmlElement(name = "MVVMAID")
    protected String mvvmaid;
    @XmlElement(name = "InfoReqInd")
    @XmlSchemaType(name = "string")
    protected InfoReqIndType infoReqInd;
    @XmlElement(name = "FndAcctNum")
    protected String fndAcctNum;
    @XmlElement(name = "PymtAcctRefReqInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes pymtAcctRefReqInd;
    @XmlElement(name = "PymtAcctRef")
    protected String pymtAcctRef;
    @XmlElement(name = "ALMSvcCode")
    protected String almSvcCode;
    @XmlElement(name = "ALMProdCode")
    protected String almProdCode;
    @XmlElement(name = "ALMProdClass")
    protected String almProdClass;
    @XmlElement(name = "ALMRateType")
    protected String almRateType;

    /**
     * Gets the value of the acctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNum() {
        return acctNum;
    }

    /**
     * Sets the value of the acctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNum(String value) {
        this.acctNum = value;
    }

    /**
     * Gets the value of the cardActivDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardActivDate() {
        return cardActivDate;
    }

    /**
     * Sets the value of the cardActivDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardActivDate(String value) {
        this.cardActivDate = value;
    }

    /**
     * Gets the value of the cardExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardExpiryDate() {
        return cardExpiryDate;
    }

    /**
     * Sets the value of the cardExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardExpiryDate(String value) {
        this.cardExpiryDate = value;
    }

    /**
     * Gets the value of the track1Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack1Data() {
        return track1Data;
    }

    /**
     * Sets the value of the track1Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack1Data(String value) {
        this.track1Data = value;
    }

    /**
     * Gets the value of the track2Data property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrack2Data() {
        return track2Data;
    }

    /**
     * Sets the value of the track2Data property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrack2Data(String value) {
        this.track2Data = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link CardTypeType }
     *     
     */
    public CardTypeType getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTypeType }
     *     
     */
    public void setCardType(CardTypeType value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the avsResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAVSResultCode() {
        return avsResultCode;
    }

    /**
     * Sets the value of the avsResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAVSResultCode(String value) {
        this.avsResultCode = value;
    }

    /**
     * Gets the value of the ccvInd property.
     * 
     * @return
     *     possible object is
     *     {@link CCVIndType }
     *     
     */
    public CCVIndType getCCVInd() {
        return ccvInd;
    }

    /**
     * Sets the value of the ccvInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVIndType }
     *     
     */
    public void setCCVInd(CCVIndType value) {
        this.ccvInd = value;
    }

    /**
     * Gets the value of the ccvData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCVData() {
        return ccvData;
    }

    /**
     * Sets the value of the ccvData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCVData(String value) {
        this.ccvData = value;
    }

    /**
     * Gets the value of the ccvResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link CCVResultCodeType }
     *     
     */
    public CCVResultCodeType getCCVResultCode() {
        return ccvResultCode;
    }

    /**
     * Sets the value of the ccvResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CCVResultCodeType }
     *     
     */
    public void setCCVResultCode(CCVResultCodeType value) {
        this.ccvResultCode = value;
    }

    /**
     * Gets the value of the mvvmaid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMVVMAID() {
        return mvvmaid;
    }

    /**
     * Sets the value of the mvvmaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMVVMAID(String value) {
        this.mvvmaid = value;
    }

    /**
     * Gets the value of the infoReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link InfoReqIndType }
     *     
     */
    public InfoReqIndType getInfoReqInd() {
        return infoReqInd;
    }

    /**
     * Sets the value of the infoReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoReqIndType }
     *     
     */
    public void setInfoReqInd(InfoReqIndType value) {
        this.infoReqInd = value;
    }

    /**
     * Gets the value of the fndAcctNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFndAcctNum() {
        return fndAcctNum;
    }

    /**
     * Sets the value of the fndAcctNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFndAcctNum(String value) {
        this.fndAcctNum = value;
    }

    /**
     * Gets the value of the pymtAcctRefReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getPymtAcctRefReqInd() {
        return pymtAcctRefReqInd;
    }

    /**
     * Sets the value of the pymtAcctRefReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setPymtAcctRefReqInd(Max3ANYes value) {
        this.pymtAcctRefReqInd = value;
    }

    /**
     * Gets the value of the pymtAcctRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtAcctRef() {
        return pymtAcctRef;
    }

    /**
     * Sets the value of the pymtAcctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtAcctRef(String value) {
        this.pymtAcctRef = value;
    }

    /**
     * Gets the value of the almSvcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALMSvcCode() {
        return almSvcCode;
    }

    /**
     * Sets the value of the almSvcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALMSvcCode(String value) {
        this.almSvcCode = value;
    }

    /**
     * Gets the value of the almProdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALMProdCode() {
        return almProdCode;
    }

    /**
     * Sets the value of the almProdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALMProdCode(String value) {
        this.almProdCode = value;
    }

    /**
     * Gets the value of the almProdClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALMProdClass() {
        return almProdClass;
    }

    /**
     * Sets the value of the almProdClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALMProdClass(String value) {
        this.almProdClass = value;
    }

    /**
     * Gets the value of the almRateType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALMRateType() {
        return almRateType;
    }

    /**
     * Sets the value of the almRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALMRateType(String value) {
        this.almRateType = value;
    }

}