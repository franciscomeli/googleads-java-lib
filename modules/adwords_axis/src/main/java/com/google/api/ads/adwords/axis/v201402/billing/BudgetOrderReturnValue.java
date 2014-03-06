/**
 * BudgetOrderReturnValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201402.billing;


/**
 * A container for return values from the {@link BudgetOrderService#mutate}
 * method.
 */
public class BudgetOrderReturnValue  extends com.google.api.ads.adwords.axis.v201402.cm.ListReturnValue  implements java.io.Serializable {
    /* List of {@link BudgetOrder}s affected by the mutate call. */
    private com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder[] value;

    public BudgetOrderReturnValue() {
    }

    public BudgetOrderReturnValue(
           java.lang.String listReturnValueType,
           com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder[] value) {
        super(
            listReturnValueType);
        this.value = value;
    }


    /**
     * Gets the value value for this BudgetOrderReturnValue.
     * 
     * @return value   * List of {@link BudgetOrder}s affected by the mutate call.
     */
    public com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder[] getValue() {
        return value;
    }


    /**
     * Sets the value value for this BudgetOrderReturnValue.
     * 
     * @param value   * List of {@link BudgetOrder}s affected by the mutate call.
     */
    public void setValue(com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder[] value) {
        this.value = value;
    }

    public com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder getValue(int i) {
        return this.value[i];
    }

    public void setValue(int i, com.google.api.ads.adwords.axis.v201402.billing.BudgetOrder _value) {
        this.value[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BudgetOrderReturnValue)) return false;
        BudgetOrderReturnValue other = (BudgetOrderReturnValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              java.util.Arrays.equals(this.value, other.getValue())));
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
        if (getValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BudgetOrderReturnValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201402", "BudgetOrderReturnValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201402", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/billing/v201402", "BudgetOrder"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
