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
import com.microsoft.graph.models.generated.EmbeddedSIMDeviceStateValue;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMDevice State.
 */
public class EmbeddedSIMDeviceState extends Entity implements IJsonBackedObject {


    /**
     * The Created Date Time.
     * The time the embedded SIM device status was created. Generated service side.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Modified Date Time.
     * The time the embedded SIM device status was last modified. Updated service side.
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The Last Sync Date Time.
     * The time the embedded SIM device last checked in. Updated service side.
     */
    @SerializedName("lastSyncDateTime")
    @Expose
    public java.util.Calendar lastSyncDateTime;

    /**
     * The Universal Integrated Circuit Card Identifier.
     * The Universal Integrated Circuit Card Identifier (UICCID) identifying the hardware onto which a profile is to be deployed.
     */
    @SerializedName("universalIntegratedCircuitCardIdentifier")
    @Expose
    public String universalIntegratedCircuitCardIdentifier;

    /**
     * The Device Name.
     * Device name to which the subscription was provisioned e.g. DESKTOP-JOE
     */
    @SerializedName("deviceName")
    @Expose
    public String deviceName;

    /**
     * The User Name.
     * Username which the subscription was provisioned to e.g. joe@contoso.com
     */
    @SerializedName("userName")
    @Expose
    public String userName;

    /**
     * The State.
     * The state of the profile operation applied to the device.
     */
    @SerializedName("state")
    @Expose
    public EmbeddedSIMDeviceStateValue state;

    /**
     * The State Details.
     * String description of the provisioning state.
     */
    @SerializedName("stateDetails")
    @Expose
    public String stateDetails;


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
