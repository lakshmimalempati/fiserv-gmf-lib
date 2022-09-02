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
 * <p>Java class for DfrdPymtPlanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DfrdPymtPlanType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV12.04}Max10AN">
 *     &lt;enumeration value="NoInterest"/>
 *     &lt;enumeration value="Interest"/>
 *     &lt;enumeration value="PayLater"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DfrdPymtPlanType")
@XmlEnum
public enum DfrdPymtPlanType {

    @XmlEnumValue("NoInterest")
    NO_INTEREST("NoInterest"),
    @XmlEnumValue("Interest")
    INTEREST("Interest"),
    @XmlEnumValue("PayLater")
    PAY_LATER("PayLater");
    private final String value;

    DfrdPymtPlanType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DfrdPymtPlanType fromValue(String v) {
        for (DfrdPymtPlanType c: DfrdPymtPlanType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}