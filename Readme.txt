DocuSign Web Services API 3.5 SDK

DEPRECIATED:
Please use https://github.com/docusign/DocuSign-eSignature-SDK

===========================================================================

The DocuSign Web Services API provides methods that allow developers to
integrate the DocuSign service into their applications. By building
DocuSign into existing applications, those applications gain the ability to
gather electronic signatures and data.  

Transactions are completely defined on the host application side by
generating XML  envelopes  that contain a PDF and the XML signing
instructions. Because the transactions could be defined on the fly by the
host application, the workflow and processing can be completely defined by
the developer.
 
The service allows developers to build solutions that are able to perform
the following:
-	Send documents for signature through the web service from host
	applications either one at a time, or as a group in an electronic
	envelope
-	Define the authentication required to sign or access the envelope
	including 3 different types, or pass through authentication from
	the host application
-	Define the signature locations using either static or relative
	signature location descriptions on any page in the document
-	Define data field locations, masks, and if they are optional or
	required, and if they contain pre-populated data if those fields
	are locked or editable.
-	Assign specific signing tasks or data fields to specific
	individuals
-	Support embedded signing where the signing process is invoked with
	a token that allows the signing to be embedded in an iframe of a
	host application
-	Support remote signing where the signing process generates an email
	to return to sign
-	Select the workflow the  routing of signing  either in parallel or
	in serial or a combination
-	Submit completely specified envelopes that are immediately
	processed for delivery. 
-	Submit partially specified envelopes for later completion by the
	customer.
-	Void an envelope that has been submitted but not yet completed.
-	Retrieve the status of an envelope including sent, signed, voided,
	forwarded, etc.
-	Retrieve the digitally signed completed PDF of every document in an
	envelope.
-	Retrieve the completed PDF for each separate document in an
	envelope.
-	Retrieve the e-sign status of a recipient.
-	Retrieve the certificate and audit log of the transaction
-	Transfer an envelope to another DocuSign user or account.
-	Correct recipient information for an existing envelope.
-	Resend a notification email to an existing recipient.
-	Correct the workflow for envelopes have already been submitted
-	Retrieve the Member level permissions for the optional features.
-	 Turn on or off the envelope ID stamp
-	Retrieve data entered by signers filling in the data fields. 
-	Submit documents for signature without any signing tabs at all,
	which invokes a freeform signing process that the recipient will
	follow to place signatures
-	Specify electronic vaulting for Envelopes.
-	Extract and remove original copies of documents from the DocuSign
	systems.

Full Documentation can be downloaded or viewed online by going here:
http://www.docusign.com/developers-center/documentation


In order to help developers get started with the Web Services API, we have
developed sample code and documentation for .NET, PHP, Ruby and Java
environments.  

The SDK includes samples in Java, .NET, Ruby and PHP.  You will need to
apply here http://www.docusign.com/devcenter in order to get a development
account which is required to run the samples.
 
System requirements for Microsoft .NET samples:
-	Visual Studio 2008+ (with applicable system requirements)
-	NUnit 2.5.7+ (from http://www.nunit.org/?p=download)
 
System requirements for Java samples:
-	Java Development Kit 1.6
-	Apache Ant 1.6

System requirements for PHP samples:
-	PHP Version 5.3+
- 	mcrypt/2.5.7 libcurl/7.19.4 OpenSSL/0.9.8k zlib/1.2.3 

System requirements for Ruby samples:
-	Ruby 1.8.6+

WSDL files can be downloaded directly from our webservice end point.

https://demo.docusign.net/api/3.0/api.asmx?WSDL - main web service
description https://demo.docusign.net/api/3.0/credential.asmx?WSDL -
credential web service that has a subset of functions and doesn't require
WS-Security SOAP headers

To get started, go to our DevCenter (http://www.docusign.com/devcenter/)
and arrange for a demo account and credentials for your project.
Professional Services is also available to help define and implement your
project fast.
