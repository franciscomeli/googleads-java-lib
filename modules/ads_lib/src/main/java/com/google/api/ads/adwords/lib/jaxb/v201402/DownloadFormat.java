//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.05 at 08:37:31 PM PST 
//


package com.google.api.ads.adwords.lib.jaxb.v201402;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DownloadFormat.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DownloadFormat">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CSVFOREXCEL"/>
 *     &lt;enumeration value="CSV"/>
 *     &lt;enumeration value="TSV"/>
 *     &lt;enumeration value="XML"/>
 *     &lt;enumeration value="GZIPPED_CSV"/>
 *     &lt;enumeration value="GZIPPED_XML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DownloadFormat")
@XmlEnum
public enum DownloadFormat {

    CSVFOREXCEL,
    CSV,
    TSV,
    XML,
    GZIPPED_CSV,
    GZIPPED_XML;

    public String value() {
        return name();
    }

    public static DownloadFormat fromValue(String v) {
        return valueOf(v);
    }

}
