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
 * Credential.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package net.docusign.www.API.Credential;

public interface Credential extends javax.xml.rpc.Service {
    public java.lang.String getCredentialSoapAddress();

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap() throws javax.xml.rpc.ServiceException;

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getCredentialSoap12Address();

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap12() throws javax.xml.rpc.ServiceException;

    public net.docusign.www.API.Credential.CredentialSoap getCredentialSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
