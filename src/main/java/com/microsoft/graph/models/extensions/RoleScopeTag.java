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
import com.microsoft.graph.models.extensions.RoleScopeTagAutoAssignment;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.RoleScopeTagAutoAssignmentCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Role Scope Tag.
 */
public class RoleScopeTag extends Entity implements IJsonBackedObject {


    /**
     * The Display Name.
     * The display or friendly name of the Role Scope Tag.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * Description of the Role Scope Tag.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Assignments.
     * The list of assignments for this Role Scope Tag.
     */
    public RoleScopeTagAutoAssignmentCollectionPage assignments;


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


        if (json.has("assignments")) {
            final RoleScopeTagAutoAssignmentCollectionResponse response = new RoleScopeTagAutoAssignmentCollectionResponse();
            if (json.has("assignments@odata.nextLink")) {
                response.nextLink = json.get("assignments@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("assignments").toString(), JsonObject[].class);
            final RoleScopeTagAutoAssignment[] array = new RoleScopeTagAutoAssignment[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), RoleScopeTagAutoAssignment.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            assignments = new RoleScopeTagAutoAssignmentCollectionPage(response, null);
        }
    }
}
