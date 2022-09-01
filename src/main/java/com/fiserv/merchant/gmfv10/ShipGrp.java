//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for ShipGrp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipGrp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToFirstNm" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToLastNm" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToAddr1" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToAddr2" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToCity" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToState" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToCtry" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToPostalCode" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToTelNum" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShipToTelType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}DelivType" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShippingCarrier" minOccurs="0"/>
 *         &lt;element ref="{com/fiserv/Merchant/gmfV10.02}ShippingMthd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipGrp", propOrder = {
    "shipToFirstNm",
    "shipToLastNm",
    "shipToAddr1",
    "shipToAddr2",
    "shipToCity",
    "shipToState",
    "shipToCtry",
    "shipToPostalCode",
    "shipToTelNum",
    "shipToTelType",
    "delivType",
    "shippingCarrier",
    "shippingMthd"
})
public class ShipGrp {

    @XmlElement(name = "ShipToFirstNm")
    protected String shipToFirstNm;
    @XmlElement(name = "ShipToLastNm")
    protected String shipToLastNm;
    @XmlElement(name = "ShipToAddr1")
    protected String shipToAddr1;
    @XmlElement(name = "ShipToAddr2")
    protected String shipToAddr2;
    @XmlElement(name = "ShipToCity")
    protected String shipToCity;
    @XmlElement(name = "ShipToState")
    protected String shipToState;
    @XmlElement(name = "ShipToCtry")
    protected String shipToCtry;
    @XmlElement(name = "ShipToPostalCode")
    protected String shipToPostalCode;
    @XmlElement(name = "ShipToTelNum")
    protected String shipToTelNum;
    @XmlElement(name = "ShipToTelType")
    @XmlSchemaType(name = "string")
    protected ShipToTelTypeType shipToTelType;
    @XmlElement(name = "DelivType")
    @XmlSchemaType(name = "string")
    protected DelivTypeType delivType;
    @XmlElement(name = "ShippingCarrier")
    @XmlSchemaType(name = "string")
    protected ShippingCarrierType shippingCarrier;
    @XmlElement(name = "ShippingMthd")
    @XmlSchemaType(name = "string")
    protected ShippingMthdType shippingMthd;

    /**
     * Gets the value of the shipToFirstNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToFirstNm() {
        return shipToFirstNm;
    }

    /**
     * Sets the value of the shipToFirstNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToFirstNm(String value) {
        this.shipToFirstNm = value;
    }

    /**
     * Gets the value of the shipToLastNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToLastNm() {
        return shipToLastNm;
    }

    /**
     * Sets the value of the shipToLastNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToLastNm(String value) {
        this.shipToLastNm = value;
    }

    /**
     * Gets the value of the shipToAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddr1() {
        return shipToAddr1;
    }

    /**
     * Sets the value of the shipToAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddr1(String value) {
        this.shipToAddr1 = value;
    }

    /**
     * Gets the value of the shipToAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToAddr2() {
        return shipToAddr2;
    }

    /**
     * Sets the value of the shipToAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToAddr2(String value) {
        this.shipToAddr2 = value;
    }

    /**
     * Gets the value of the shipToCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCity() {
        return shipToCity;
    }

    /**
     * Sets the value of the shipToCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCity(String value) {
        this.shipToCity = value;
    }

    /**
     * Gets the value of the shipToState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToState() {
        return shipToState;
    }

    /**
     * Sets the value of the shipToState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToState(String value) {
        this.shipToState = value;
    }

    /**
     * Gets the value of the shipToCtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToCtry() {
        return shipToCtry;
    }

    /**
     * Sets the value of the shipToCtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToCtry(String value) {
        this.shipToCtry = value;
    }

    /**
     * Gets the value of the shipToPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToPostalCode() {
        return shipToPostalCode;
    }

    /**
     * Sets the value of the shipToPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToPostalCode(String value) {
        this.shipToPostalCode = value;
    }

    /**
     * Gets the value of the shipToTelNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToTelNum() {
        return shipToTelNum;
    }

    /**
     * Sets the value of the shipToTelNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToTelNum(String value) {
        this.shipToTelNum = value;
    }

    /**
     * Gets the value of the shipToTelType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipToTelTypeType }
     *     
     */
    public ShipToTelTypeType getShipToTelType() {
        return shipToTelType;
    }

    /**
     * Sets the value of the shipToTelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipToTelTypeType }
     *     
     */
    public void setShipToTelType(ShipToTelTypeType value) {
        this.shipToTelType = value;
    }

    /**
     * Gets the value of the delivType property.
     * 
     * @return
     *     possible object is
     *     {@link DelivTypeType }
     *     
     */
    public DelivTypeType getDelivType() {
        return delivType;
    }

    /**
     * Sets the value of the delivType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DelivTypeType }
     *     
     */
    public void setDelivType(DelivTypeType value) {
        this.delivType = value;
    }

    /**
     * Gets the value of the shippingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingCarrierType }
     *     
     */
    public ShippingCarrierType getShippingCarrier() {
        return shippingCarrier;
    }

    /**
     * Sets the value of the shippingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingCarrierType }
     *     
     */
    public void setShippingCarrier(ShippingCarrierType value) {
        this.shippingCarrier = value;
    }

    /**
     * Gets the value of the shippingMthd property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingMthdType }
     *     
     */
    public ShippingMthdType getShippingMthd() {
        return shippingMthd;
    }

    /**
     * Sets the value of the shippingMthd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingMthdType }
     *     
     */
    public void setShippingMthd(ShippingMthdType value) {
        this.shippingMthd = value;
    }

}
