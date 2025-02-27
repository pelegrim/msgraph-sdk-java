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
import com.microsoft.graph.models.generated.WindowsUserType;
import com.microsoft.graph.models.generated.WindowsDeviceUsageType;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Out Of Box Experience Settings.
 */
public class OutOfBoxExperienceSettings implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager additionalDataManager() {
        return additionalDataManager;
    }

    /**
     * The Hide Privacy Settings.
     * Show or hide privacy settings to user
     */
    @SerializedName("hidePrivacySettings")
    @Expose
    public Boolean hidePrivacySettings;

    /**
     * The Hide EULA.
     * Show or hide EULA to user
     */
    @SerializedName("hideEULA")
    @Expose
    public Boolean hideEULA;

    /**
     * The User Type.
     * Type of user
     */
    @SerializedName("userType")
    @Expose
    public WindowsUserType userType;

    /**
     * The Device Usage Type.
     * AAD join authentication type
     */
    @SerializedName("deviceUsageType")
    @Expose
    public WindowsDeviceUsageType deviceUsageType;

    /**
     * The Skip Keyboard Selection Page.
     * If set, then skip the keyboard selection page if Language and Region are set
     */
    @SerializedName("skipKeyboardSelectionPage")
    @Expose
    public Boolean skipKeyboardSelectionPage;

    /**
     * The Hide Escape Link.
     * If set to true, then the user can't start over with different account, on company sign-in
     */
    @SerializedName("hideEscapeLink")
    @Expose
    public Boolean hideEscapeLink;


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
