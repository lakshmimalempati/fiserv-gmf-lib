//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonUSMerchType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonUSMerchType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max15AN">
 *     &lt;enumeration value="Canadian"/>
 *     &lt;enumeration value="Mexican"/>
 *     &lt;enumeration value="Jamaica"/>
 *     &lt;enumeration value="Barbados"/>
 *     &lt;enumeration value="Bahamas"/>
 *     &lt;enumeration value="Trinidad"/>
 *     &lt;enumeration value="StVincent"/>
 *     &lt;enumeration value="Anguilla"/>
 *     &lt;enumeration value="StKittsNevis"/>
 *     &lt;enumeration value="StLucia"/>
 *     &lt;enumeration value="Europe"/>
 *     &lt;enumeration value="APAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonUSMerchType")
@XmlEnum
public enum NonUSMerchType {

    @XmlEnumValue("Canadian")
    CANADIAN("Canadian"),
    @XmlEnumValue("Mexican")
    MEXICAN("Mexican"),
    @XmlEnumValue("Jamaica")
    JAMAICA("Jamaica"),
    @XmlEnumValue("Barbados")
    BARBADOS("Barbados"),
    @XmlEnumValue("Bahamas")
    BAHAMAS("Bahamas"),
    @XmlEnumValue("Trinidad")
    TRINIDAD("Trinidad"),
    @XmlEnumValue("StVincent")
    ST_VINCENT("StVincent"),
    @XmlEnumValue("Anguilla")
    ANGUILLA("Anguilla"),
    @XmlEnumValue("StKittsNevis")
    ST_KITTS_NEVIS("StKittsNevis"),
    @XmlEnumValue("StLucia")
    ST_LUCIA("StLucia"),
    @XmlEnumValue("Europe")
    EUROPE("Europe"),
    APAC("APAC");
    private final String value;

    NonUSMerchType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonUSMerchType fromValue(String v) {
        for (NonUSMerchType c: NonUSMerchType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
