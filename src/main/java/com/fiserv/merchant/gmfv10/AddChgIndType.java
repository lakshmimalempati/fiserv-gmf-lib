//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package com.fiserv.merchant.gmfv10;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddChgIndType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AddChgIndType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Len1AN">
 *     &lt;enumeration value="Y"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AddChgIndType")
@XmlEnum
public enum AddChgIndType {

    Y;

    public String value() {
        return name();
    }

    public static AddChgIndType fromValue(String v) {
        return valueOf(v);
    }

}
