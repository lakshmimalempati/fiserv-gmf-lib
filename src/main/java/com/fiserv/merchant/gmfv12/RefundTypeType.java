//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.09.02 at 12:35:42 PM IST 
//


package com.fiserv.merchant.gmfv12;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RefundTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RefundTypeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV12.04}Max8AN">
 *     &lt;enumeration value="Online"/>
 *     &lt;enumeration value="AuthOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RefundTypeType")
@XmlEnum
public enum RefundTypeType {

    @XmlEnumValue("Online")
    ONLINE("Online"),
    @XmlEnumValue("AuthOnly")
    AUTH_ONLY("AuthOnly");
    private final String value;

    RefundTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RefundTypeType fromValue(String v) {
        for (RefundTypeType c: RefundTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    @Override
    public String toString() {
        return value;
    }
}