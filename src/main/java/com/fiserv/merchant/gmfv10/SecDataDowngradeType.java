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
 * <p>Java class for SecDataDowngradeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecDataDowngradeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max14AN">
 *     &lt;enumeration value="SecDataMissing"/>
 *     &lt;enumeration value="SecDataInvalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecDataDowngradeType")
@XmlEnum
public enum SecDataDowngradeType {

    @XmlEnumValue("SecDataMissing")
    SEC_DATA_MISSING("SecDataMissing"),
    @XmlEnumValue("SecDataInvalid")
    SEC_DATA_INVALID("SecDataInvalid");
    private final String value;

    SecDataDowngradeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecDataDowngradeType fromValue(String v) {
        for (SecDataDowngradeType c: SecDataDowngradeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
