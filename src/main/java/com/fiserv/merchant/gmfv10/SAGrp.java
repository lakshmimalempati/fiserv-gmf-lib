//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for SAGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SAGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SATranSeq" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SACondCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SAEntryMode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SASysTrace" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SARRN" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SAACI" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}SAMrktSpecificDataInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SAGrp", propOrder = {
    "saTranSeq",
    "saCondCode",
    "saEntryMode",
    "saSysTrace",
    "sarrn",
    "saaci",
    "saMrktSpecificDataInd"
})
public class SAGrp {

    @XmlElement(name = "SATranSeq")
    protected String saTranSeq;
    @XmlElement(name = "SACondCode")
    protected String saCondCode;
    @XmlElement(name = "SAEntryMode")
    protected String saEntryMode;
    @XmlElement(name = "SASysTrace")
    protected String saSysTrace;
    @XmlElement(name = "SARRN")
    protected String sarrn;
    @XmlElement(name = "SAACI")
    @XmlSchemaType(name = "string")
    protected SAACIType saaci;
    @XmlElement(name = "SAMrktSpecificDataInd")
    protected String saMrktSpecificDataInd;

    /**
     * Gets the value of the saTranSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSATranSeq() {
        return saTranSeq;
    }

    /**
     * Sets the value of the saTranSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSATranSeq(String value) {
        this.saTranSeq = value;
    }

    /**
     * Gets the value of the saCondCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSACondCode() {
        return saCondCode;
    }

    /**
     * Sets the value of the saCondCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSACondCode(String value) {
        this.saCondCode = value;
    }

    /**
     * Gets the value of the saEntryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAEntryMode() {
        return saEntryMode;
    }

    /**
     * Sets the value of the saEntryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAEntryMode(String value) {
        this.saEntryMode = value;
    }

    /**
     * Gets the value of the saSysTrace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSASysTrace() {
        return saSysTrace;
    }

    /**
     * Sets the value of the saSysTrace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSASysTrace(String value) {
        this.saSysTrace = value;
    }

    /**
     * Gets the value of the sarrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSARRN() {
        return sarrn;
    }

    /**
     * Sets the value of the sarrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSARRN(String value) {
        this.sarrn = value;
    }

    /**
     * Gets the value of the saaci property.
     * 
     * @return
     *     possible object is
     *     {@link SAACIType }
     *     
     */
    public SAACIType getSAACI() {
        return saaci;
    }

    /**
     * Sets the value of the saaci property.
     * 
     * @param value
     *     allowed object is
     *     {@link SAACIType }
     *     
     */
    public void setSAACI(SAACIType value) {
        this.saaci = value;
    }

    /**
     * Gets the value of the saMrktSpecificDataInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAMrktSpecificDataInd() {
        return saMrktSpecificDataInd;
    }

    /**
     * Sets the value of the saMrktSpecificDataInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAMrktSpecificDataInd(String value) {
        this.saMrktSpecificDataInd = value;
    }

}
