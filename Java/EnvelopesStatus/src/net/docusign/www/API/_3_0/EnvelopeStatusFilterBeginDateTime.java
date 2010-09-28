/*
Copyright (C) DocuSign, Inc.  All rights reserved.

This source code is intended only as a supplement to DocuSign SDK and/or on-line documentation.

This sample is designed to demonstrate DocuSign features and is not intended for production use.
Code and policy for a production application must be developed to meet the specific data and
security requirements of the application.

THIS CODE AND INFORMATION ARE PROVIDED "AS IS" WITHOUT WARRANTY OF ANY KIND, EITHER EXPRESSED
OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED WARRANTIES OF MERCHANTABILITY AND/OR
FITNESS FOR A PARTICULAR PURPOSE.
*/

/**
 * EnvelopeStatusFilterBeginDateTime.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class EnvelopeStatusFilterBeginDateTime  implements java.io.Serializable, org.apache.axis.encoding.SimpleType {
    private java.util.Calendar _value;

    private java.lang.String statusQualifier;  // attribute

    public EnvelopeStatusFilterBeginDateTime() {
    }

    // Simple Types must have a String constructor
    public EnvelopeStatusFilterBeginDateTime(java.util.Calendar _value) {
        this._value = _value;
    }
    public EnvelopeStatusFilterBeginDateTime(java.lang.String _value) {
        java.util.Calendar cal =
            (java.util.Calendar) new org.apache.axis.encoding.ser.CalendarDeserializer(
                java.lang.String.class, org.apache.axis.Constants.XSD_STRING).makeValue(_value);
        this._value = cal;
    }

    // Simple Types must have a toString for serializing the value
    public java.lang.String toString() {
        return _value == null ? null : new org.apache.axis.encoding.ser.CalendarSerializer().getValueAsString(_value, null);
    }


    /**
     * Gets the _value value for this EnvelopeStatusFilterBeginDateTime.
     * 
     * @return _value
     */
    public java.util.Calendar get_value() {
        return _value;
    }


    /**
     * Sets the _value value for this EnvelopeStatusFilterBeginDateTime.
     * 
     * @param _value
     */
    public void set_value(java.util.Calendar _value) {
        this._value = _value;
    }


    /**
     * Gets the statusQualifier value for this EnvelopeStatusFilterBeginDateTime.
     * 
     * @return statusQualifier
     */
    public java.lang.String getStatusQualifier() {
        return statusQualifier;
    }


    /**
     * Sets the statusQualifier value for this EnvelopeStatusFilterBeginDateTime.
     * 
     * @param statusQualifier
     */
    public void setStatusQualifier(java.lang.String statusQualifier) {
        this.statusQualifier = statusQualifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EnvelopeStatusFilterBeginDateTime)) return false;
        EnvelopeStatusFilterBeginDateTime other = (EnvelopeStatusFilterBeginDateTime) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._value==null && other.get_value()==null) || 
             (this._value!=null &&
              this._value.equals(other.get_value()))) &&
            ((this.statusQualifier==null && other.getStatusQualifier()==null) || 
             (this.statusQualifier!=null &&
              this.statusQualifier.equals(other.getStatusQualifier())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (get_value() != null) {
            _hashCode += get_value().hashCode();
        }
        if (getStatusQualifier() != null) {
            _hashCode += getStatusQualifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EnvelopeStatusFilterBeginDateTime.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "EnvelopeStatusFilterBeginDateTime"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("statusQualifier");
        attrField.setXmlName(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "statusQualifier"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
          new  org.apache.axis.encoding.ser.SimpleSerializer(
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
          new  org.apache.axis.encoding.ser.SimpleDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
