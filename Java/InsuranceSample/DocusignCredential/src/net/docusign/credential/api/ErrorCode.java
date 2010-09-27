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

package net.docusign.credential.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ErrorCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ErrorCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="User_Does_Not_Exist_In_System"/>
 *     &lt;enumeration value="Account_Lacks_Permissions"/>
 *     &lt;enumeration value="User_Lacks_Permissions"/>
 *     &lt;enumeration value="User_Authentication_Failed"/>
 *     &lt;enumeration value="Unspecified_Error"/>
 *     &lt;enumeration value="Success"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ErrorCode")
@XmlEnum
public enum ErrorCode {

    @XmlEnumValue("User_Does_Not_Exist_In_System")
    USER_DOES_NOT_EXIST_IN_SYSTEM("User_Does_Not_Exist_In_System"),
    @XmlEnumValue("Account_Lacks_Permissions")
    ACCOUNT_LACKS_PERMISSIONS("Account_Lacks_Permissions"),
    @XmlEnumValue("User_Lacks_Permissions")
    USER_LACKS_PERMISSIONS("User_Lacks_Permissions"),
    @XmlEnumValue("User_Authentication_Failed")
    USER_AUTHENTICATION_FAILED("User_Authentication_Failed"),
    @XmlEnumValue("Unspecified_Error")
    UNSPECIFIED_ERROR("Unspecified_Error"),
    @XmlEnumValue("Success")
    SUCCESS("Success");
    private final String value;

    ErrorCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrorCode fromValue(String v) {
        for (ErrorCode c: ErrorCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
