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
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorStatus;
import com.microsoft.graph.models.generated.DeviceManagementExchangeConnectorType;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Exchange Connector.
 */
public class DeviceManagementExchangeConnector extends Entity implements IJsonBackedObject {


    /**
     * The Last Sync Date Time.
     * Last sync time for the Exchange Connector
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Status.
     * Exchange Connector Status
     */
    @SerializedName("status")
    @Expose
    public DeviceManagementExchangeConnectorStatus status;

    /**
     * The Primary Smtp Address.
     * Email address used to configure the Service To Service Exchange Connector.
     */
    @SerializedName("primarySmtpAddress")
    @Expose
    public String primarySmtpAddress;

    /**
     * The Server Name.
     * The name of the Exchange server.
     */
    @SerializedName("serverName")
    @Expose
    public String serverName;

    /**
     * The Connector Server Name.
     * The name of the server hosting the Exchange Connector.
     */
    @SerializedName("connectorServerName")
    @Expose
    public String connectorServerName;

    /**
     * The Exchange Connector Type.
     * The type of Exchange Connector Configured.
     */
    @SerializedName("exchangeConnectorType")
    @Expose
    public DeviceManagementExchangeConnectorType exchangeConnectorType;

    /**
     * The Version.
     * The version of the ExchangeConnectorAgent
     */
    @SerializedName("version")
    @Expose
    public String version;

    /**
     * The Exchange Alias.
     * An alias assigned to the Exchange server
     */
    @SerializedName("exchangeAlias")
    @Expose
    public String exchangeAlias;

    /**
     * The Exchange Organization.
     * Exchange Organization to the Exchange server
     */
    @SerializedName("exchangeOrganization")
    @Expose
    public String exchangeOrganization;


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
