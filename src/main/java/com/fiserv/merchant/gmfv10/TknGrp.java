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
 * <p>Java class for TknGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TknGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TknReqID" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TknLvl" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TknLstFour" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TknBlkA" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}TknBlkB" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}PropTknFlg" minOccurs="0"/>
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
    "propTknFlg"
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

}
