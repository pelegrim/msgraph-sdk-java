// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentRequest;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Request.
 */
public class DeviceManagementIntentRequest extends BaseRequest implements IDeviceManagementIntentRequest {
	
    /**
     * The request for the DeviceManagementIntent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntent.class);
    }

    /**
     * Gets the DeviceManagementIntent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementIntent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementIntent from the service
     *
     * @return the DeviceManagementIntent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementIntent> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DeviceManagementIntent with a source
     *
     * @param sourceDeviceManagementIntent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementIntent sourceDeviceManagementIntent, final ICallback<DeviceManagementIntent> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementIntent);
    }

    /**
     * Patches this DeviceManagementIntent with a source
     *
     * @param sourceDeviceManagementIntent the source object with updates
     * @return the updated DeviceManagementIntent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntent patch(final DeviceManagementIntent sourceDeviceManagementIntent) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntent);
    }

    /**
     * Creates a DeviceManagementIntent with a new object
     *
     * @param newDeviceManagementIntent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementIntent newDeviceManagementIntent, final ICallback<DeviceManagementIntent> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementIntent);
    }

    /**
     * Creates a DeviceManagementIntent with a new object
     *
     * @param newDeviceManagementIntent the new object to create
     * @return the created DeviceManagementIntent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntent post(final DeviceManagementIntent newDeviceManagementIntent) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementIntentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementIntentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementIntentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementIntentRequest)this;
     }

}

