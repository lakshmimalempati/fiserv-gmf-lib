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
 * <p>Java class for ReversalIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReversalIndType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max7AN">
 *     &lt;enumeration value="Timeout"/>
 *     &lt;enumeration value="Void"/>
 *     &lt;enumeration value="VoidFr"/>
 *     &lt;enumeration value="TORVoid"/>
 *     &lt;enumeration value="Partial"/>
 *     &lt;enumeration value="EditErr"/>
 *     &lt;enumeration value="MACVeri"/>
 *     &lt;enumeration value="MACSync"/>
 *     &lt;enumeration value="EncrErr"/>
 *     &lt;enumeration value="SystErr"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReversalIndType")
@XmlEnum
public enum ReversalIndType {

    @XmlEnumValue("Timeout")
    TIMEOUT("Timeout"),
    @XmlEnumValue("Void")
    VOID("Void"),
    @XmlEnumValue("VoidFr")
    VOID_FR("VoidFr"),
    @XmlEnumValue("TORVoid")
    TOR_VOID("TORVoid"),
    @XmlEnumValue("Partial")
    PARTIAL("Partial"),
    @XmlEnumValue("EditErr")
    EDIT_ERR("EditErr"),
    @XmlEnumValue("MACVeri")
    MAC_VERI("MACVeri"),
    @XmlEnumValue("MACSync")
    MAC_SYNC("MACSync"),
    @XmlEnumValue("EncrErr")
    ENCR_ERR("EncrErr"),
    @XmlEnumValue("SystErr")
    SYST_ERR("SystErr");
    private final String value;

    ReversalIndType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReversalIndType fromValue(String v) {
        for (ReversalIndType c: ReversalIndType.values()) {
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
