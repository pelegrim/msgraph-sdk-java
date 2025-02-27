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
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionResponse;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition.
 */
public class ManagementCondition extends Entity implements IJsonBackedObject {


    /**
     * The Unique Name.
     * Unique name for the management condition. Used in management condition expressions.
     */
    @SerializedName("uniqueName")
    @Expose
    public String uniqueName;

    /**
     * The Display Name.
     * The admin defined name of the management condition.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * The admin defined description of the management condition.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Created Date Time.
     * The time the management condition was created. Generated service side.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Modified Date Time.
     * The time the management condition was last modified. Updated service side.
     */
    @SerializedName("modifiedDateTime")
    @Expose
    public java.util.Calendar modifiedDateTime;

    /**
     * The ETag.
     * ETag of the management condition. Updated service side.
     */
    @SerializedName("eTag")
    @Expose
    public String eTag;

    /**
     * The Applicable Platforms.
     * The applicable platforms for this management condition.
     */
    @SerializedName("applicablePlatforms")
    @Expose
    public java.util.List<DevicePlatformType> applicablePlatforms;

    /**
     * The Management Condition Statements.
     * The management condition statements associated to the management condition.
     */
    public ManagementConditionStatementCollectionPage managementConditionStatements;


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


        if (json.has("managementConditionStatements")) {
            final ManagementConditionStatementCollectionResponse response = new ManagementConditionStatementCollectionResponse();
            if (json.has("managementConditionStatements@odata.nextLink")) {
                response.nextLink = json.get("managementConditionStatements@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("managementConditionStatements").toString(), JsonObject[].class);
            final ManagementConditionStatement[] array = new ManagementConditionStatement[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ManagementConditionStatement.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            managementConditionStatements = new ManagementConditionStatementCollectionPage(response, null);
        }
    }
}
