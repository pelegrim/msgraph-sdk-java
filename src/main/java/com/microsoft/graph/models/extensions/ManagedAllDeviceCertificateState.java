// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.CertificateRevocationStatus;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed All Device Certificate State.
 */
public class ManagedAllDeviceCertificateState extends Entity implements IJsonBackedObject {


    /**
     * The Certificate Revoke Status.
     * Revoke status
     */
    @SerializedName("certificateRevokeStatus")
    @Expose
    public CertificateRevocationStatus certificateRevokeStatus;

    /**
     * The Managed Device Display Name.
     * Device display name
     */
    @SerializedName("managedDeviceDisplayName")
    @Expose
    public String managedDeviceDisplayName;

    /**
     * The User Principal Name.
     * User principal name
     */
    @SerializedName("userPrincipalName")
    @Expose
    public String userPrincipalName;

    /**
     * The Certificate Expiration Date Time.
     * Certificate expiry date
     */
    @SerializedName("certificateExpirationDateTime")
    @Expose
    public java.util.Calendar certificateExpirationDateTime;

    /**
     * The Certificate Issuer Name.
     * Issuer
     */
    @SerializedName("certificateIssuerName")
    @Expose
    public String certificateIssuerName;

    /**
     * The Certificate Thumbprint.
     * Thumbprint
     */
    @SerializedName("certificateThumbprint")
    @Expose
    public String certificateThumbprint;

    /**
     * The Certificate Serial Number.
     * Serial number
     */
    @SerializedName("certificateSerialNumber")
    @Expose
    public String certificateSerialNumber;

    /**
     * The Certificate Subject Name.
     * Certificate subject name
     */
    @SerializedName("certificateSubjectName")
    @Expose
    public String certificateSubjectName;

    /**
     * The Certificate Key Usages.
     * Key Usage
     */
    @SerializedName("certificateKeyUsages")
    @Expose
    public Integer certificateKeyUsages;

    /**
     * The Certificate Extended Key Usages.
     * Enhanced Key Usage
     */
    @SerializedName("certificateExtendedKeyUsages")
    @Expose
    public String certificateExtendedKeyUsages;

    /**
     * The Certificate Issuance Date Time.
     * Issuance date
     */
    @SerializedName("certificateIssuanceDateTime")
    @Expose
    public java.util.Calendar certificateIssuanceDateTime;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}
