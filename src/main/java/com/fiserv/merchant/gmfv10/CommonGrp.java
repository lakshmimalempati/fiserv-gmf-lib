//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for CommonGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PymtType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ReversalInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}LocalDateTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TrnmsnDateTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}STAN" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RefNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}OrderNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TPPID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TermID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}AltMerchID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchCatCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}POSEntryMode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}POSCondCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TermCatCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TermEntryCapablt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnAmt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TxnCrncy" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TermLocInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CardCaptCap" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ProgramID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}GroupID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}POSID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SettleInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ClerkID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SupID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SENum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PLPOSDebitFlg" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}UPC" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}NetAccInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchEcho" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}WltID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CashAdvSerNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}NonUSMerch" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}Future" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DevBatchID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DigWltInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DigWltProgType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TranInit" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PymntSvc" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SubIntegratorID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SecSubIntegratorID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MobileInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}MerchCustom1" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ReloadType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RefundType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CustomerId" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RtFallbackInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DfrdAuthInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SSC" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SingleTapInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DupATCInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonGrp", propOrder = {
    "pymtType",
    "reversalInd",
    "txnType",
    "localDateTime",
    "trnmsnDateTime",
    "stan",
    "refNum",
    "orderNum",
    "tppid",
    "termID",
    "merchID",
    "altMerchID",
    "merchCatCode",
    "posEntryMode",
    "posCondCode",
    "termCatCode",
    "termEntryCapablt",
    "txnAmt",
    "txnCrncy",
    "termLocInd",
    "cardCaptCap",
    "programID",
    "groupID",
    "posid",
    "settleInd",
    "clerkID",
    "supID",
    "seNum",
    "plposDebitFlg",
    "upc",
    "netAccInd",
    "merchEcho",
    "wltID",
    "cashAdvSerNum",
    "nonUSMerch",
    "future",
    "devBatchID",
    "digWltInd",
    "digWltProgType",
    "tranInit",
    "pymntSvc",
    "subIntegratorID",
    "secSubIntegratorID",
    "mobileInd",
    "merchCustom1",
    "reloadType",
    "refundType",
    "customerId",
    "rtFallbackInd",
    "dfrdAuthInd",
    "ssc",
    "singleTapInd",
    "dupATCInd"
})
public class CommonGrp {

    @XmlElement(name = "PymtType")
    @XmlSchemaType(name = "string")
    protected PymtTypeType pymtType;
    @XmlElement(name = "ReversalInd")
    @XmlSchemaType(name = "string")
    protected ReversalIndType reversalInd;
    @XmlElement(name = "TxnType")
    @XmlSchemaType(name = "string")
    protected TxnTypeType txnType;
    @XmlElement(name = "LocalDateTime")
    protected String localDateTime;
    @XmlElement(name = "TrnmsnDateTime")
    protected String trnmsnDateTime;
    @XmlElement(name = "STAN")
    protected String stan;
    @XmlElement(name = "RefNum")
    protected String refNum;
    @XmlElement(name = "OrderNum")
    protected String orderNum;
    @XmlElement(name = "TPPID")
    protected String tppid;
    @XmlElement(name = "TermID")
    protected String termID;
    @XmlElement(name = "MerchID")
    protected String merchID;
    @XmlElement(name = "AltMerchID")
    protected String altMerchID;
    @XmlElement(name = "MerchCatCode")
    protected String merchCatCode;
    @XmlElement(name = "POSEntryMode")
    protected String posEntryMode;
    @XmlElement(name = "POSCondCode")
    protected String posCondCode;
    @XmlElement(name = "TermCatCode")
    protected String termCatCode;
    @XmlElement(name = "TermEntryCapablt")
    protected String termEntryCapablt;
    @XmlElement(name = "TxnAmt")
    protected String txnAmt;
    @XmlElement(name = "TxnCrncy")
    protected String txnCrncy;
    @XmlElement(name = "TermLocInd")
    protected String termLocInd;
    @XmlElement(name = "CardCaptCap")
    protected String cardCaptCap;
    @XmlElement(name = "ProgramID")
    @XmlSchemaType(name = "string")
    protected ProgramIDType programID;
    @XmlElement(name = "GroupID")
    protected String groupID;
    @XmlElement(name = "POSID")
    protected String posid;
    @XmlElement(name = "SettleInd")
    protected String settleInd;
    @XmlElement(name = "ClerkID")
    protected String clerkID;
    @XmlElement(name = "SupID")
    protected String supID;
    @XmlElement(name = "SENum")
    protected String seNum;
    @XmlElement(name = "PLPOSDebitFlg")
    protected String plposDebitFlg;
    @XmlElement(name = "UPC")
    protected String upc;
    @XmlElement(name = "NetAccInd")
    protected String netAccInd;
    @XmlElement(name = "MerchEcho")
    protected String merchEcho;
    @XmlElement(name = "WltID")
    protected String wltID;
    @XmlElement(name = "CashAdvSerNum")
    protected String cashAdvSerNum;
    @XmlElement(name = "NonUSMerch")
    @XmlSchemaType(name = "string")
    protected NonUSMerchType nonUSMerch;
    @XmlElement(name = "Future")
    protected String future;
    @XmlElement(name = "DevBatchID")
    protected String devBatchID;
    @XmlElement(name = "DigWltInd")
    @XmlSchemaType(name = "string")
    protected DigWltIndType digWltInd;
    @XmlElement(name = "DigWltProgType")
    @XmlSchemaType(name = "string")
    protected DigWltProgTypeType digWltProgType;
    @XmlElement(name = "TranInit")
    @XmlSchemaType(name = "string")
    protected TranInitType tranInit;
    @XmlElement(name = "PymntSvc")
    @XmlSchemaType(name = "string")
    protected PymntSvcType pymntSvc;
    @XmlElement(name = "SubIntegratorID")
    protected String subIntegratorID;
    @XmlElement(name = "SecSubIntegratorID")
    protected String secSubIntegratorID;
    @XmlElement(name = "MobileInd")
    @XmlSchemaType(name = "string")
    protected MobileIndType mobileInd;
    @XmlElement(name = "MerchCustom1")
    protected String merchCustom1;
    @XmlElement(name = "ReloadType")
    @XmlSchemaType(name = "string")
    protected ReloadTypeType reloadType;
    @XmlElement(name = "RefundType")
    @XmlSchemaType(name = "string")
    protected RefundTypeType refundType;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "RtFallbackInd")
    @XmlSchemaType(name = "string")
    protected RtFallbackIndType rtFallbackInd;
    @XmlElement(name = "DfrdAuthInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes dfrdAuthInd;
    @XmlElement(name = "SSC")
    protected String ssc;
    @XmlElement(name = "SingleTapInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes singleTapInd;
    @XmlElement(name = "DupATCInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes dupATCInd;

    /**
     * Gets the value of the pymtType property.
     * 
     * @return
     *     possible object is
     *     {@link PymtTypeType }
     *     
     */
    public PymtTypeType getPymtType() {
        return pymtType;
    }

    /**
     * Sets the value of the pymtType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PymtTypeType }
     *     
     */
    public void setPymtType(PymtTypeType value) {
        this.pymtType = value;
    }

    /**
     * Gets the value of the reversalInd property.
     * 
     * @return
     *     possible object is
     *     {@link ReversalIndType }
     *     
     */
    public ReversalIndType getReversalInd() {
        return reversalInd;
    }

    /**
     * Sets the value of the reversalInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReversalIndType }
     *     
     */
    public void setReversalInd(ReversalIndType value) {
        this.reversalInd = value;
    }

    /**
     * Gets the value of the txnType property.
     * 
     * @return
     *     possible object is
     *     {@link TxnTypeType }
     *     
     */
    public TxnTypeType getTxnType() {
        return txnType;
    }

    /**
     * Sets the value of the txnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TxnTypeType }
     *     
     */
    public void setTxnType(TxnTypeType value) {
        this.txnType = value;
    }

    /**
     * Gets the value of the localDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalDateTime() {
        return localDateTime;
    }

    /**
     * Sets the value of the localDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalDateTime(String value) {
        this.localDateTime = value;
    }

    /**
     * Gets the value of the trnmsnDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrnmsnDateTime() {
        return trnmsnDateTime;
    }

    /**
     * Sets the value of the trnmsnDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrnmsnDateTime(String value) {
        this.trnmsnDateTime = value;
    }

    /**
     * Gets the value of the stan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTAN() {
        return stan;
    }

    /**
     * Sets the value of the stan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTAN(String value) {
        this.stan = value;
    }

    /**
     * Gets the value of the refNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * Sets the value of the refNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefNum(String value) {
        this.refNum = value;
    }

    /**
     * Gets the value of the orderNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNum() {
        return orderNum;
    }

    /**
     * Sets the value of the orderNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNum(String value) {
        this.orderNum = value;
    }

    /**
     * Gets the value of the tppid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTPPID() {
        return tppid;
    }

    /**
     * Sets the value of the tppid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTPPID(String value) {
        this.tppid = value;
    }

    /**
     * Gets the value of the termID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermID() {
        return termID;
    }

    /**
     * Sets the value of the termID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermID(String value) {
        this.termID = value;
    }

    /**
     * Gets the value of the merchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchID() {
        return merchID;
    }

    /**
     * Sets the value of the merchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchID(String value) {
        this.merchID = value;
    }

    /**
     * Gets the value of the altMerchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltMerchID() {
        return altMerchID;
    }

    /**
     * Sets the value of the altMerchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltMerchID(String value) {
        this.altMerchID = value;
    }

    /**
     * Gets the value of the merchCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCatCode() {
        return merchCatCode;
    }

    /**
     * Sets the value of the merchCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCatCode(String value) {
        this.merchCatCode = value;
    }

    /**
     * Gets the value of the posEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSEntryMode() {
        return posEntryMode;
    }

    /**
     * Sets the value of the posEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSEntryMode(String value) {
        this.posEntryMode = value;
    }

    /**
     * Gets the value of the posCondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSCondCode() {
        return posCondCode;
    }

    /**
     * Sets the value of the posCondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSCondCode(String value) {
        this.posCondCode = value;
    }

    /**
     * Gets the value of the termCatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermCatCode() {
        return termCatCode;
    }

    /**
     * Sets the value of the termCatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermCatCode(String value) {
        this.termCatCode = value;
    }

    /**
     * Gets the value of the termEntryCapablt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermEntryCapablt() {
        return termEntryCapablt;
    }

    /**
     * Sets the value of the termEntryCapablt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermEntryCapablt(String value) {
        this.termEntryCapablt = value;
    }

    /**
     * Gets the value of the txnAmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnAmt() {
        return txnAmt;
    }

    /**
     * Sets the value of the txnAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnAmt(String value) {
        this.txnAmt = value;
    }

    /**
     * Gets the value of the txnCrncy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxnCrncy() {
        return txnCrncy;
    }

    /**
     * Sets the value of the txnCrncy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxnCrncy(String value) {
        this.txnCrncy = value;
    }

    /**
     * Gets the value of the termLocInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermLocInd() {
        return termLocInd;
    }

    /**
     * Sets the value of the termLocInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermLocInd(String value) {
        this.termLocInd = value;
    }

    /**
     * Gets the value of the cardCaptCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCaptCap() {
        return cardCaptCap;
    }

    /**
     * Sets the value of the cardCaptCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCaptCap(String value) {
        this.cardCaptCap = value;
    }

    /**
     * Gets the value of the programID property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramIDType }
     *     
     */
    public ProgramIDType getProgramID() {
        return programID;
    }

    /**
     * Sets the value of the programID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramIDType }
     *     
     */
    public void setProgramID(ProgramIDType value) {
        this.programID = value;
    }

    /**
     * Gets the value of the groupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * Sets the value of the groupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
    }

    /**
     * Gets the value of the posid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOSID() {
        return posid;
    }

    /**
     * Sets the value of the posid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOSID(String value) {
        this.posid = value;
    }

    /**
     * Gets the value of the settleInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettleInd() {
        return settleInd;
    }

    /**
     * Sets the value of the settleInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettleInd(String value) {
        this.settleInd = value;
    }

    /**
     * Gets the value of the clerkID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClerkID() {
        return clerkID;
    }

    /**
     * Sets the value of the clerkID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClerkID(String value) {
        this.clerkID = value;
    }

    /**
     * Gets the value of the supID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupID() {
        return supID;
    }

    /**
     * Sets the value of the supID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupID(String value) {
        this.supID = value;
    }

    /**
     * Gets the value of the seNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSENum() {
        return seNum;
    }

    /**
     * Sets the value of the seNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSENum(String value) {
        this.seNum = value;
    }

    /**
     * Gets the value of the plposDebitFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLPOSDebitFlg() {
        return plposDebitFlg;
    }

    /**
     * Sets the value of the plposDebitFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLPOSDebitFlg(String value) {
        this.plposDebitFlg = value;
    }

    /**
     * Gets the value of the upc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUPC() {
        return upc;
    }

    /**
     * Sets the value of the upc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUPC(String value) {
        this.upc = value;
    }

    /**
     * Gets the value of the netAccInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetAccInd() {
        return netAccInd;
    }

    /**
     * Sets the value of the netAccInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetAccInd(String value) {
        this.netAccInd = value;
    }

    /**
     * Gets the value of the merchEcho property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchEcho() {
        return merchEcho;
    }

    /**
     * Sets the value of the merchEcho property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchEcho(String value) {
        this.merchEcho = value;
    }

    /**
     * Gets the value of the wltID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWltID() {
        return wltID;
    }

    /**
     * Sets the value of the wltID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWltID(String value) {
        this.wltID = value;
    }

    /**
     * Gets the value of the cashAdvSerNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashAdvSerNum() {
        return cashAdvSerNum;
    }

    /**
     * Sets the value of the cashAdvSerNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashAdvSerNum(String value) {
        this.cashAdvSerNum = value;
    }

    /**
     * Gets the value of the nonUSMerch property.
     * 
     * @return
     *     possible object is
     *     {@link NonUSMerchType }
     *     
     */
    public NonUSMerchType getNonUSMerch() {
        return nonUSMerch;
    }

    /**
     * Sets the value of the nonUSMerch property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonUSMerchType }
     *     
     */
    public void setNonUSMerch(NonUSMerchType value) {
        this.nonUSMerch = value;
    }

    /**
     * Gets the value of the future property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuture() {
        return future;
    }

    /**
     * Sets the value of the future property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuture(String value) {
        this.future = value;
    }

    /**
     * Gets the value of the devBatchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevBatchID() {
        return devBatchID;
    }

    /**
     * Sets the value of the devBatchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevBatchID(String value) {
        this.devBatchID = value;
    }

    /**
     * Gets the value of the digWltInd property.
     * 
     * @return
     *     possible object is
     *     {@link DigWltIndType }
     *     
     */
    public DigWltIndType getDigWltInd() {
        return digWltInd;
    }

    /**
     * Sets the value of the digWltInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigWltIndType }
     *     
     */
    public void setDigWltInd(DigWltIndType value) {
        this.digWltInd = value;
    }

    /**
     * Gets the value of the digWltProgType property.
     * 
     * @return
     *     possible object is
     *     {@link DigWltProgTypeType }
     *     
     */
    public DigWltProgTypeType getDigWltProgType() {
        return digWltProgType;
    }

    /**
     * Sets the value of the digWltProgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DigWltProgTypeType }
     *     
     */
    public void setDigWltProgType(DigWltProgTypeType value) {
        this.digWltProgType = value;
    }

    /**
     * Gets the value of the tranInit property.
     * 
     * @return
     *     possible object is
     *     {@link TranInitType }
     *     
     */
    public TranInitType getTranInit() {
        return tranInit;
    }

    /**
     * Sets the value of the tranInit property.
     * 
     * @param value
     *     allowed object is
     *     {@link TranInitType }
     *     
     */
    public void setTranInit(TranInitType value) {
        this.tranInit = value;
    }

    /**
     * Gets the value of the pymntSvc property.
     * 
     * @return
     *     possible object is
     *     {@link PymntSvcType }
     *     
     */
    public PymntSvcType getPymntSvc() {
        return pymntSvc;
    }

    /**
     * Sets the value of the pymntSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link PymntSvcType }
     *     
     */
    public void setPymntSvc(PymntSvcType value) {
        this.pymntSvc = value;
    }

    /**
     * Gets the value of the subIntegratorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubIntegratorID() {
        return subIntegratorID;
    }

    /**
     * Sets the value of the subIntegratorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubIntegratorID(String value) {
        this.subIntegratorID = value;
    }

    /**
     * Gets the value of the secSubIntegratorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecSubIntegratorID() {
        return secSubIntegratorID;
    }

    /**
     * Sets the value of the secSubIntegratorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecSubIntegratorID(String value) {
        this.secSubIntegratorID = value;
    }

    /**
     * Gets the value of the mobileInd property.
     * 
     * @return
     *     possible object is
     *     {@link MobileIndType }
     *     
     */
    public MobileIndType getMobileInd() {
        return mobileInd;
    }

    /**
     * Sets the value of the mobileInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link MobileIndType }
     *     
     */
    public void setMobileInd(MobileIndType value) {
        this.mobileInd = value;
    }

    /**
     * Gets the value of the merchCustom1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchCustom1() {
        return merchCustom1;
    }

    /**
     * Sets the value of the merchCustom1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchCustom1(String value) {
        this.merchCustom1 = value;
    }

    /**
     * Gets the value of the reloadType property.
     * 
     * @return
     *     possible object is
     *     {@link ReloadTypeType }
     *     
     */
    public ReloadTypeType getReloadType() {
        return reloadType;
    }

    /**
     * Sets the value of the reloadType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReloadTypeType }
     *     
     */
    public void setReloadType(ReloadTypeType value) {
        this.reloadType = value;
    }

    /**
     * Gets the value of the refundType property.
     * 
     * @return
     *     possible object is
     *     {@link RefundTypeType }
     *     
     */
    public RefundTypeType getRefundType() {
        return refundType;
    }

    /**
     * Sets the value of the refundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundTypeType }
     *     
     */
    public void setRefundType(RefundTypeType value) {
        this.refundType = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the rtFallbackInd property.
     * 
     * @return
     *     possible object is
     *     {@link RtFallbackIndType }
     *     
     */
    public RtFallbackIndType getRtFallbackInd() {
        return rtFallbackInd;
    }

    /**
     * Sets the value of the rtFallbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtFallbackIndType }
     *     
     */
    public void setRtFallbackInd(RtFallbackIndType value) {
        this.rtFallbackInd = value;
    }

    /**
     * Gets the value of the dfrdAuthInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getDfrdAuthInd() {
        return dfrdAuthInd;
    }

    /**
     * Sets the value of the dfrdAuthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setDfrdAuthInd(Max3ANYes value) {
        this.dfrdAuthInd = value;
    }

    /**
     * Gets the value of the ssc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSC() {
        return ssc;
    }

    /**
     * Sets the value of the ssc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSC(String value) {
        this.ssc = value;
    }

    /**
     * Gets the value of the singleTapInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getSingleTapInd() {
        return singleTapInd;
    }

    /**
     * Sets the value of the singleTapInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setSingleTapInd(Max3ANYes value) {
        this.singleTapInd = value;
    }

    /**
     * Gets the value of the dupATCInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getDupATCInd() {
        return dupATCInd;
    }

    /**
     * Sets the value of the dupATCInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setDupATCInd(Max3ANYes value) {
        this.dupATCInd = value;
    }

}