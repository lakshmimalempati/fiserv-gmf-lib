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
 * <p>Java class for AmexAuthIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AmexAuthIndType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max9AN">
 *     &lt;enumeration value="CrdOnFile"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AmexAuthIndType")
@XmlEnum
public enum AmexAuthIndType {

    @XmlEnumValue("CrdOnFile")
    CRD_ON_FILE("CrdOnFile");
    private final String value;

    AmexAuthIndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AmexAuthIndType fromValue(String v) {
        for (AmexAuthIndType c: AmexAuthIndType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
