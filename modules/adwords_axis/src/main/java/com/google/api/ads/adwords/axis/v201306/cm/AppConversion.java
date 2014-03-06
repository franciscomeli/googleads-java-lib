/**
 * AppConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201306.cm;


/**
 * A ConversionTracker for mobile apps.
 */
public class AppConversion  extends com.google.api.ads.adwords.axis.v201306.cm.ConversionTracker  implements java.io.Serializable {
    /* App id of the app conversion tracker.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private java.lang.String appId;

    /* App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span> */
    private com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppPlatform appPlatform;

    /* The user-supplied revenue value for this conversion tracker.
     * This value is passed
     *                     through directly to the conversion tracker snippet.
     * This field is no longer used as of v201402 - see ConversionTracker.defaultRevenueValue.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppUserRevenueValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span> */
    private java.lang.String userRevenueValue;

    /* The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span> */
    private java.lang.String snippet;

    /* The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform. */
    private com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppConversionType appConversionType;

    public AppConversion() {
    }

    public AppConversion(
           java.lang.Long id,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201306.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201306.cm.ConversionTrackerCategory category,
           com.google.api.ads.adwords.axis.v201306.cm.ConversionTrackerStats stats,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Boolean isProductAdsChargeable,
           java.lang.Integer productAdsChargeableConversionWindow,
           java.lang.String conversionTrackerType,
           java.lang.String appId,
           com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppPlatform appPlatform,
           java.lang.String userRevenueValue,
           java.lang.String snippet,
           com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppConversionType appConversionType) {
        super(
            id,
            name,
            status,
            category,
            stats,
            viewthroughLookbackWindow,
            isProductAdsChargeable,
            productAdsChargeableConversionWindow,
            conversionTrackerType);
        this.appId = appId;
        this.appPlatform = appPlatform;
        this.userRevenueValue = userRevenueValue;
        this.snippet = snippet;
        this.appConversionType = appConversionType;
    }


    /**
     * Gets the appId value for this AppConversion.
     * 
     * @return appId   * App id of the app conversion tracker.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public java.lang.String getAppId() {
        return appId;
    }


    /**
     * Sets the appId value for this AppConversion.
     * 
     * @param appId   * App id of the app conversion tracker.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppId".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAppId(java.lang.String appId) {
        this.appId = appId;
    }


    /**
     * Gets the appPlatform value for this AppConversion.
     * 
     * @return appPlatform   * App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppPlatform getAppPlatform() {
        return appPlatform;
    }


    /**
     * Sets the appPlatform value for this AppConversion.
     * 
     * @param appPlatform   * App platform of the app conversion tracker. This field defaults
     * to NONE.
     *                     Once it is set to a value other than NONE it cannot
     * be changed again. It must be
     *                     set at the same time as AppConversionType.
     *                     <span class="constraint Selectable">This field
     * can be selected using the value "AppPlatform".</span><span class="constraint
     * Filterable">This field can be filtered on.</span>
     */
    public void setAppPlatform(com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppPlatform appPlatform) {
        this.appPlatform = appPlatform;
    }


    /**
     * Gets the userRevenueValue value for this AppConversion.
     * 
     * @return userRevenueValue   * The user-supplied revenue value for this conversion tracker.
     * This value is passed
     *                     through directly to the conversion tracker snippet.
     * This field is no longer used as of v201402 - see ConversionTracker.defaultRevenueValue.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppUserRevenueValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public java.lang.String getUserRevenueValue() {
        return userRevenueValue;
    }


    /**
     * Sets the userRevenueValue value for this AppConversion.
     * 
     * @param userRevenueValue   * The user-supplied revenue value for this conversion tracker.
     * This value is passed
     *                     through directly to the conversion tracker snippet.
     * This field is no longer used as of v201402 - see ConversionTracker.defaultRevenueValue.
     * <span class="constraint Selectable">This field can be selected using
     * the value "AppUserRevenueValue".</span><span class="constraint Filterable">This
     * field can be filtered on.</span>
     */
    public void setUserRevenueValue(java.lang.String userRevenueValue) {
        this.userRevenueValue = userRevenueValue;
    }


    /**
     * Gets the snippet value for this AppConversion.
     * 
     * @return snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public java.lang.String getSnippet() {
        return snippet;
    }


    /**
     * Sets the snippet value for this AppConversion.
     * 
     * @param snippet   * The generated snippet for this conversion tracker. This snippet
     * is
     *                     auto-generated by the API, and will be ignored
     * in mutate operands. This
     *                     field will always be returned.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API.</span>
     */
    public void setSnippet(java.lang.String snippet) {
        this.snippet = snippet;
    }


    /**
     * Gets the appConversionType value for this AppConversion.
     * 
     * @return appConversionType   * The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform.
     */
    public com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppConversionType getAppConversionType() {
        return appConversionType;
    }


    /**
     * Sets the appConversionType value for this AppConversion.
     * 
     * @param appConversionType   * The type of AppConversion, which identifies a conversion as
     * being either download or
     *                     in-app purchase. This field can only be set once
     * and future reads will populate the type
     *                     appropriately. It is an error to change the value
     * once it is set. This field must be set
     *                     at the same time as AppPlatform.
     */
    public void setAppConversionType(com.google.api.ads.adwords.axis.v201306.cm.AppConversionAppConversionType appConversionType) {
        this.appConversionType = appConversionType;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppConversion)) return false;
        AppConversion other = (AppConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.appId==null && other.getAppId()==null) || 
             (this.appId!=null &&
              this.appId.equals(other.getAppId()))) &&
            ((this.appPlatform==null && other.getAppPlatform()==null) || 
             (this.appPlatform!=null &&
              this.appPlatform.equals(other.getAppPlatform()))) &&
            ((this.userRevenueValue==null && other.getUserRevenueValue()==null) || 
             (this.userRevenueValue!=null &&
              this.userRevenueValue.equals(other.getUserRevenueValue()))) &&
            ((this.snippet==null && other.getSnippet()==null) || 
             (this.snippet!=null &&
              this.snippet.equals(other.getSnippet()))) &&
            ((this.appConversionType==null && other.getAppConversionType()==null) || 
             (this.appConversionType!=null &&
              this.appConversionType.equals(other.getAppConversionType())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAppId() != null) {
            _hashCode += getAppId().hashCode();
        }
        if (getAppPlatform() != null) {
            _hashCode += getAppPlatform().hashCode();
        }
        if (getUserRevenueValue() != null) {
            _hashCode += getUserRevenueValue().hashCode();
        }
        if (getSnippet() != null) {
            _hashCode += getSnippet().hashCode();
        }
        if (getAppConversionType() != null) {
            _hashCode += getAppConversionType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AppConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "appId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appPlatform");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "appPlatform"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AppConversion.AppPlatform"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userRevenueValue");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "userRevenueValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snippet");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "snippet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appConversionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "appConversionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201306", "AppConversion.AppConversionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
