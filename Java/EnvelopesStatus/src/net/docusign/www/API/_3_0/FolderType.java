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
 * FolderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API._3_0;

public class FolderType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FolderType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _RecycleBin = "RecycleBin";
    public static final java.lang.String _Draft = "Draft";
    public static final java.lang.String _Inbox = "Inbox";
    public static final java.lang.String _SentItems = "SentItems";
    public static final java.lang.String _Normal = "Normal";
    public static final FolderType RecycleBin = new FolderType(_RecycleBin);
    public static final FolderType Draft = new FolderType(_Draft);
    public static final FolderType Inbox = new FolderType(_Inbox);
    public static final FolderType SentItems = new FolderType(_SentItems);
    public static final FolderType Normal = new FolderType(_Normal);
    public java.lang.String getValue() { return _value_;}
    public static FolderType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FolderType enumeration = (FolderType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FolderType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FolderType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.docusign.net/API/3.0", "FolderType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
