//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for FileDLGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FileDLGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FileType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PenFileType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SubFileType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}LdSeqNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DMTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DBINTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DRuTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DReTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DSAFTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DPrTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DPdTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HMTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HBINTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HRuTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HReTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HSAFTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HPrTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HPdTblVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}HWVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SWVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FWVer" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FunCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}CurrFileCreationDt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FileSize" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FileCRC16" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}LdCtrlKey" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FBSeq" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ReqFBMaxSize" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ReqFileOffset" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}NextFileDLOffset" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}FBData" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLMerchName" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLStNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLMerchAddr" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLMerchCity" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLMerchState" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLMerchPostalCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLSAFBlk" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TTDay" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TTDateTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TTCutTime" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TTPassword" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RctTxtStrDt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}RctTxtEndDt" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TLTermType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileDLGrp", propOrder = {
    "fileType",
    "penFileType",
    "subFileType",
    "ldSeqNum",
    "dmTblVer",
    "dbinTblVer",
    "dRuTblVer",
    "dReTblVer",
    "dsafTblVer",
    "dPrTblVer",
    "dPdTblVer",
    "hmTblVer",
    "hbinTblVer",
    "hRuTblVer",
    "hReTblVer",
    "hsafTblVer",
    "hPrTblVer",
    "hPdTblVer",
    "hwVer",
    "swVer",
    "fwVer",
    "funCode",
    "currFileCreationDt",
    "fileSize",
    "fileCRC16",
    "ldCtrlKey",
    "fbSeq",
    "reqFBMaxSize",
    "reqFileOffset",
    "nextFileDLOffset",
    "fbData",
    "tlMerchName",
    "tlStNum",
    "tlMerchAddr",
    "tlMerchCity",
    "tlMerchState",
    "tlMerchPostalCode",
    "tlsafBlk",
    "ttDay",
    "ttDateTime",
    "ttCutTime",
    "ttPassword",
    "rctTxtStrDt",
    "rctTxtEndDt",
    "tlTermType"
})
public class FileDLGrp {

    @XmlElement(name = "FileType")
    @XmlSchemaType(name = "string")
    protected FileTypeType fileType;
    @XmlElement(name = "PenFileType")
    protected String penFileType;
    @XmlElement(name = "SubFileType")
    @XmlSchemaType(name = "string")
    protected SubFileTypeType subFileType;
    @XmlElement(name = "LdSeqNum")
    protected String ldSeqNum;
    @XmlElement(name = "DMTblVer")
    protected String dmTblVer;
    @XmlElement(name = "DBINTblVer")
    protected String dbinTblVer;
    @XmlElement(name = "DRuTblVer")
    protected String dRuTblVer;
    @XmlElement(name = "DReTblVer")
    protected String dReTblVer;
    @XmlElement(name = "DSAFTblVer")
    protected String dsafTblVer;
    @XmlElement(name = "DPrTblVer")
    protected String dPrTblVer;
    @XmlElement(name = "DPdTblVer")
    protected String dPdTblVer;
    @XmlElement(name = "HMTblVer")
    protected String hmTblVer;
    @XmlElement(name = "HBINTblVer")
    protected String hbinTblVer;
    @XmlElement(name = "HRuTblVer")
    protected String hRuTblVer;
    @XmlElement(name = "HReTblVer")
    protected String hReTblVer;
    @XmlElement(name = "HSAFTblVer")
    protected String hsafTblVer;
    @XmlElement(name = "HPrTblVer")
    protected String hPrTblVer;
    @XmlElement(name = "HPdTblVer")
    protected String hPdTblVer;
    @XmlElement(name = "HWVer")
    protected String hwVer;
    @XmlElement(name = "SWVer")
    protected String swVer;
    @XmlElement(name = "FWVer")
    protected String fwVer;
    @XmlElement(name = "FunCode")
    @XmlSchemaType(name = "string")
    protected FunCodeType funCode;
    @XmlElement(name = "CurrFileCreationDt")
    protected String currFileCreationDt;
    @XmlElement(name = "FileSize")
    protected String fileSize;
    @XmlElement(name = "FileCRC16")
    protected String fileCRC16;
    @XmlElement(name = "LdCtrlKey")
    protected String ldCtrlKey;
    @XmlElement(name = "FBSeq")
    protected String fbSeq;
    @XmlElement(name = "ReqFBMaxSize")
    protected String reqFBMaxSize;
    @XmlElement(name = "ReqFileOffset")
    protected String reqFileOffset;
    @XmlElement(name = "NextFileDLOffset")
    protected String nextFileDLOffset;
    @XmlElement(name = "FBData")
    protected String fbData;
    @XmlElement(name = "TLMerchName")
    protected String tlMerchName;
    @XmlElement(name = "TLStNum")
    protected String tlStNum;
    @XmlElement(name = "TLMerchAddr")
    protected String tlMerchAddr;
    @XmlElement(name = "TLMerchCity")
    protected String tlMerchCity;
    @XmlElement(name = "TLMerchState")
    protected String tlMerchState;
    @XmlElement(name = "TLMerchPostalCode")
    protected String tlMerchPostalCode;
    @XmlElement(name = "TLSAFBlk")
    protected String tlsafBlk;
    @XmlElement(name = "TTDay")
    protected String ttDay;
    @XmlElement(name = "TTDateTime")
    protected String ttDateTime;
    @XmlElement(name = "TTCutTime")
    protected String ttCutTime;
    @XmlElement(name = "TTPassword")
    protected String ttPassword;
    @XmlElement(name = "RctTxtStrDt")
    protected String rctTxtStrDt;
    @XmlElement(name = "RctTxtEndDt")
    protected String rctTxtEndDt;
    @XmlElement(name = "TLTermType")
    protected String tlTermType;

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link FileTypeType }
     *     
     */
    public FileTypeType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTypeType }
     *     
     */
    public void setFileType(FileTypeType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the penFileType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenFileType() {
        return penFileType;
    }

    /**
     * Sets the value of the penFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenFileType(String value) {
        this.penFileType = value;
    }

    /**
     * Gets the value of the subFileType property.
     * 
     * @return
     *     possible object is
     *     {@link SubFileTypeType }
     *     
     */
    public SubFileTypeType getSubFileType() {
        return subFileType;
    }

    /**
     * Sets the value of the subFileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubFileTypeType }
     *     
     */
    public void setSubFileType(SubFileTypeType value) {
        this.subFileType = value;
    }

    /**
     * Gets the value of the ldSeqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdSeqNum() {
        return ldSeqNum;
    }

    /**
     * Sets the value of the ldSeqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdSeqNum(String value) {
        this.ldSeqNum = value;
    }

    /**
     * Gets the value of the dmTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMTblVer() {
        return dmTblVer;
    }

    /**
     * Sets the value of the dmTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMTblVer(String value) {
        this.dmTblVer = value;
    }

    /**
     * Gets the value of the dbinTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBINTblVer() {
        return dbinTblVer;
    }

    /**
     * Sets the value of the dbinTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBINTblVer(String value) {
        this.dbinTblVer = value;
    }

    /**
     * Gets the value of the dRuTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDRuTblVer() {
        return dRuTblVer;
    }

    /**
     * Sets the value of the dRuTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDRuTblVer(String value) {
        this.dRuTblVer = value;
    }

    /**
     * Gets the value of the dReTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDReTblVer() {
        return dReTblVer;
    }

    /**
     * Sets the value of the dReTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDReTblVer(String value) {
        this.dReTblVer = value;
    }

    /**
     * Gets the value of the dsafTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAFTblVer() {
        return dsafTblVer;
    }

    /**
     * Sets the value of the dsafTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAFTblVer(String value) {
        this.dsafTblVer = value;
    }

    /**
     * Gets the value of the dPrTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrTblVer() {
        return dPrTblVer;
    }

    /**
     * Sets the value of the dPrTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrTblVer(String value) {
        this.dPrTblVer = value;
    }

    /**
     * Gets the value of the dPdTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPdTblVer() {
        return dPdTblVer;
    }

    /**
     * Sets the value of the dPdTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPdTblVer(String value) {
        this.dPdTblVer = value;
    }

    /**
     * Gets the value of the hmTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHMTblVer() {
        return hmTblVer;
    }

    /**
     * Sets the value of the hmTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHMTblVer(String value) {
        this.hmTblVer = value;
    }

    /**
     * Gets the value of the hbinTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHBINTblVer() {
        return hbinTblVer;
    }

    /**
     * Sets the value of the hbinTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHBINTblVer(String value) {
        this.hbinTblVer = value;
    }

    /**
     * Gets the value of the hRuTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRuTblVer() {
        return hRuTblVer;
    }

    /**
     * Sets the value of the hRuTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRuTblVer(String value) {
        this.hRuTblVer = value;
    }

    /**
     * Gets the value of the hReTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHReTblVer() {
        return hReTblVer;
    }

    /**
     * Sets the value of the hReTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHReTblVer(String value) {
        this.hReTblVer = value;
    }

    /**
     * Gets the value of the hsafTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSAFTblVer() {
        return hsafTblVer;
    }

    /**
     * Sets the value of the hsafTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHSAFTblVer(String value) {
        this.hsafTblVer = value;
    }

    /**
     * Gets the value of the hPrTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPrTblVer() {
        return hPrTblVer;
    }

    /**
     * Sets the value of the hPrTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPrTblVer(String value) {
        this.hPrTblVer = value;
    }

    /**
     * Gets the value of the hPdTblVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHPdTblVer() {
        return hPdTblVer;
    }

    /**
     * Sets the value of the hPdTblVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHPdTblVer(String value) {
        this.hPdTblVer = value;
    }

    /**
     * Gets the value of the hwVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHWVer() {
        return hwVer;
    }

    /**
     * Sets the value of the hwVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHWVer(String value) {
        this.hwVer = value;
    }

    /**
     * Gets the value of the swVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWVer() {
        return swVer;
    }

    /**
     * Sets the value of the swVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWVer(String value) {
        this.swVer = value;
    }

    /**
     * Gets the value of the fwVer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFWVer() {
        return fwVer;
    }

    /**
     * Sets the value of the fwVer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFWVer(String value) {
        this.fwVer = value;
    }

    /**
     * Gets the value of the funCode property.
     * 
     * @return
     *     possible object is
     *     {@link FunCodeType }
     *     
     */
    public FunCodeType getFunCode() {
        return funCode;
    }

    /**
     * Sets the value of the funCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunCodeType }
     *     
     */
    public void setFunCode(FunCodeType value) {
        this.funCode = value;
    }

    /**
     * Gets the value of the currFileCreationDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrFileCreationDt() {
        return currFileCreationDt;
    }

    /**
     * Sets the value of the currFileCreationDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrFileCreationDt(String value) {
        this.currFileCreationDt = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileSize(String value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the fileCRC16 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileCRC16() {
        return fileCRC16;
    }

    /**
     * Sets the value of the fileCRC16 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileCRC16(String value) {
        this.fileCRC16 = value;
    }

    /**
     * Gets the value of the ldCtrlKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLdCtrlKey() {
        return ldCtrlKey;
    }

    /**
     * Sets the value of the ldCtrlKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLdCtrlKey(String value) {
        this.ldCtrlKey = value;
    }

    /**
     * Gets the value of the fbSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBSeq() {
        return fbSeq;
    }

    /**
     * Sets the value of the fbSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBSeq(String value) {
        this.fbSeq = value;
    }

    /**
     * Gets the value of the reqFBMaxSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqFBMaxSize() {
        return reqFBMaxSize;
    }

    /**
     * Sets the value of the reqFBMaxSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqFBMaxSize(String value) {
        this.reqFBMaxSize = value;
    }

    /**
     * Gets the value of the reqFileOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqFileOffset() {
        return reqFileOffset;
    }

    /**
     * Sets the value of the reqFileOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReqFileOffset(String value) {
        this.reqFileOffset = value;
    }

    /**
     * Gets the value of the nextFileDLOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextFileDLOffset() {
        return nextFileDLOffset;
    }

    /**
     * Sets the value of the nextFileDLOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextFileDLOffset(String value) {
        this.nextFileDLOffset = value;
    }

    /**
     * Gets the value of the fbData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFBData() {
        return fbData;
    }

    /**
     * Sets the value of the fbData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFBData(String value) {
        this.fbData = value;
    }

    /**
     * Gets the value of the tlMerchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLMerchName() {
        return tlMerchName;
    }

    /**
     * Sets the value of the tlMerchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLMerchName(String value) {
        this.tlMerchName = value;
    }

    /**
     * Gets the value of the tlStNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLStNum() {
        return tlStNum;
    }

    /**
     * Sets the value of the tlStNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLStNum(String value) {
        this.tlStNum = value;
    }

    /**
     * Gets the value of the tlMerchAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLMerchAddr() {
        return tlMerchAddr;
    }

    /**
     * Sets the value of the tlMerchAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLMerchAddr(String value) {
        this.tlMerchAddr = value;
    }

    /**
     * Gets the value of the tlMerchCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLMerchCity() {
        return tlMerchCity;
    }

    /**
     * Sets the value of the tlMerchCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLMerchCity(String value) {
        this.tlMerchCity = value;
    }

    /**
     * Gets the value of the tlMerchState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLMerchState() {
        return tlMerchState;
    }

    /**
     * Sets the value of the tlMerchState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLMerchState(String value) {
        this.tlMerchState = value;
    }

    /**
     * Gets the value of the tlMerchPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLMerchPostalCode() {
        return tlMerchPostalCode;
    }

    /**
     * Sets the value of the tlMerchPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLMerchPostalCode(String value) {
        this.tlMerchPostalCode = value;
    }

    /**
     * Gets the value of the tlsafBlk property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLSAFBlk() {
        return tlsafBlk;
    }

    /**
     * Sets the value of the tlsafBlk property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLSAFBlk(String value) {
        this.tlsafBlk = value;
    }

    /**
     * Gets the value of the ttDay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTDay() {
        return ttDay;
    }

    /**
     * Sets the value of the ttDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTDay(String value) {
        this.ttDay = value;
    }

    /**
     * Gets the value of the ttDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTDateTime() {
        return ttDateTime;
    }

    /**
     * Sets the value of the ttDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTDateTime(String value) {
        this.ttDateTime = value;
    }

    /**
     * Gets the value of the ttCutTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTCutTime() {
        return ttCutTime;
    }

    /**
     * Sets the value of the ttCutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTCutTime(String value) {
        this.ttCutTime = value;
    }

    /**
     * Gets the value of the ttPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTTPassword() {
        return ttPassword;
    }

    /**
     * Sets the value of the ttPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTTPassword(String value) {
        this.ttPassword = value;
    }

    /**
     * Gets the value of the rctTxtStrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctTxtStrDt() {
        return rctTxtStrDt;
    }

    /**
     * Sets the value of the rctTxtStrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRctTxtStrDt(String value) {
        this.rctTxtStrDt = value;
    }

    /**
     * Gets the value of the rctTxtEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRctTxtEndDt() {
        return rctTxtEndDt;
    }

    /**
     * Sets the value of the rctTxtEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRctTxtEndDt(String value) {
        this.rctTxtEndDt = value;
    }

    /**
     * Gets the value of the tlTermType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTLTermType() {
        return tlTermType;
    }

    /**
     * Sets the value of the tlTermType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTLTermType(String value) {
        this.tlTermType = value;
    }

}
