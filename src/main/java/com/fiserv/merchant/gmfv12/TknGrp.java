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
 * <p>Java class for TknGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TknGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknReqID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknLvl" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknLstFour" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknBlkA" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknBlkB" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PropTknFlg" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PymtTknReqInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}TknAuthInd" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PymtTknValue" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}PymtTknExpDate" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV12.04}AddTknRespInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TknGrp", propOrder = {
    "tknReqID",
    "tknLvl",
    "tknLstFour",
    "tknBlkA",
    "tknBlkB",
    "propTknFlg",
    "pymtTknReqInd",
    "tknAuthInd",
    "pymtTknValue",
    "pymtTknExpDate",
    "addTknRespInfo"
})
public class TknGrp {

    @XmlElement(name = "TknReqID")
    protected String tknReqID;
    @XmlElement(name = "TknLvl")
    protected String tknLvl;
    @XmlElement(name = "TknLstFour")
    protected String tknLstFour;
    @XmlElement(name = "TknBlkA")
    protected String tknBlkA;
    @XmlElement(name = "TknBlkB")
    protected String tknBlkB;
    @XmlElement(name = "PropTknFlg")
    protected String propTknFlg;
    @XmlElement(name = "PymtTknReqInd")
    @XmlSchemaType(name = "string")
    protected Max3ANYes pymtTknReqInd;
    @XmlElement(name = "TknAuthInd")
    protected String tknAuthInd;
    @XmlElement(name = "PymtTknValue")
    protected String pymtTknValue;
    @XmlElement(name = "PymtTknExpDate")
    protected String pymtTknExpDate;
    @XmlElement(name = "AddTknRespInfo")
    protected String addTknRespInfo;

    /**
     * Gets the value of the tknReqID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknReqID() {
        return tknReqID;
    }

    /**
     * Sets the value of the tknReqID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknReqID(String value) {
        this.tknReqID = value;
    }

    /**
     * Gets the value of the tknLvl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknLvl() {
        return tknLvl;
    }

    /**
     * Sets the value of the tknLvl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknLvl(String value) {
        this.tknLvl = value;
    }

    /**
     * Gets the value of the tknLstFour property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknLstFour() {
        return tknLstFour;
    }

    /**
     * Sets the value of the tknLstFour property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknLstFour(String value) {
        this.tknLstFour = value;
    }

    /**
     * Gets the value of the tknBlkA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknBlkA() {
        return tknBlkA;
    }

    /**
     * Sets the value of the tknBlkA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknBlkA(String value) {
        this.tknBlkA = value;
    }

    /**
     * Gets the value of the tknBlkB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknBlkB() {
        return tknBlkB;
    }

    /**
     * Sets the value of the tknBlkB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknBlkB(String value) {
        this.tknBlkB = value;
    }

    /**
     * Gets the value of the propTknFlg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropTknFlg() {
        return propTknFlg;
    }

    /**
     * Sets the value of the propTknFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropTknFlg(String value) {
        this.propTknFlg = value;
    }

    /**
     * Gets the value of the pymtTknReqInd property.
     * 
     * @return
     *     possible object is
     *     {@link Max3ANYes }
     *     
     */
    public Max3ANYes getPymtTknReqInd() {
        return pymtTknReqInd;
    }

    /**
     * Sets the value of the pymtTknReqInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Max3ANYes }
     *     
     */
    public void setPymtTknReqInd(Max3ANYes value) {
        this.pymtTknReqInd = value;
    }

    /**
     * Gets the value of the tknAuthInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTknAuthInd() {
        return tknAuthInd;
    }

    /**
     * Sets the value of the tknAuthInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTknAuthInd(String value) {
        this.tknAuthInd = value;
    }

    /**
     * Gets the value of the pymtTknValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtTknValue() {
        return pymtTknValue;
    }

    /**
     * Sets the value of the pymtTknValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtTknValue(String value) {
        this.pymtTknValue = value;
    }

    /**
     * Gets the value of the pymtTknExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtTknExpDate() {
        return pymtTknExpDate;
    }

    /**
     * Sets the value of the pymtTknExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtTknExpDate(String value) {
        this.pymtTknExpDate = value;
    }

    /**
     * Gets the value of the addTknRespInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddTknRespInfo() {
        return addTknRespInfo;
    }

    /**
     * Sets the value of the addTknRespInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddTknRespInfo(String value) {
        this.addTknRespInfo = value;
    }

}