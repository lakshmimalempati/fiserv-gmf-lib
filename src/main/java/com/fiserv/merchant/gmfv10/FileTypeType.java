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
 * <p>Java class for FileTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileTypeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max10AN">
 *     &lt;enumeration value="EMV2KEY"/>
 *     &lt;enumeration value="MAIL"/>
 *     &lt;enumeration value="CARDTABLE"/>
 *     &lt;enumeration value="DYNCRDTBL"/>
 *     &lt;enumeration value="SITECFG"/>
 *     &lt;enumeration value="FUELRPT"/>
 *     &lt;enumeration value="HOSTDISC"/>
 *     &lt;enumeration value="RECTXT"/>
 *     &lt;enumeration value="TABLE"/>
 *     &lt;enumeration value="TERMAIL"/>
 *     &lt;enumeration value="MEXLOCBIN"/>
 *     &lt;enumeration value="MEXPVLBIN"/>
 *     &lt;enumeration value="JAMLOCBIN"/>
 *     &lt;enumeration value="BHSLOCBIN"/>
 *     &lt;enumeration value="BRBLOCBIN"/>
 *     &lt;enumeration value="ECBNLOCBIN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileTypeType")
@XmlEnum
public enum FileTypeType {

    @XmlEnumValue("EMV2KEY")
    EMV_2_KEY("EMV2KEY"),
    MAIL("MAIL"),
    CARDTABLE("CARDTABLE"),
    DYNCRDTBL("DYNCRDTBL"),
    SITECFG("SITECFG"),
    FUELRPT("FUELRPT"),
    HOSTDISC("HOSTDISC"),
    RECTXT("RECTXT"),
    TABLE("TABLE"),
    TERMAIL("TERMAIL"),
    MEXLOCBIN("MEXLOCBIN"),
    MEXPVLBIN("MEXPVLBIN"),
    JAMLOCBIN("JAMLOCBIN"),
    BHSLOCBIN("BHSLOCBIN"),
    BRBLOCBIN("BRBLOCBIN"),
    ECBNLOCBIN("ECBNLOCBIN");
    private final String value;

    FileTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileTypeType fromValue(String v) {
        for (FileTypeType c: FileTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
