// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryRequest;
import com.microsoft.graph.models.extensions.DeviceConfigurationConflictSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Conflict Summary Request.
 */
public class DeviceConfigurationConflictSummaryRequest extends BaseRequest implements IDeviceConfigurationConflictSummaryRequest {
	
    /**
     * The request for the DeviceConfigurationConflictSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationConflictSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfigurationConflictSummary.class);
    }

    /**
     * Gets the DeviceConfigurationConflictSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceConfigurationConflictSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceConfigurationConflictSummary from the service
     *
     * @return the DeviceConfigurationConflictSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationConflictSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceConfigurationConflictSummary> callback) {
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
     * Patches this DeviceConfigurationConflictSummary with a source
     *
     * @param sourceDeviceConfigurationConflictSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceConfigurationConflictSummary sourceDeviceConfigurationConflictSummary, final ICallback<DeviceConfigurationConflictSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceConfigurationConflictSummary);
    }

    /**
     * Patches this DeviceConfigurationConflictSummary with a source
     *
     * @param sourceDeviceConfigurationConflictSummary the source object with updates
     * @return the updated DeviceConfigurationConflictSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationConflictSummary patch(final DeviceConfigurationConflictSummary sourceDeviceConfigurationConflictSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary, final ICallback<DeviceConfigurationConflictSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceConfigurationConflictSummary);
    }

    /**
     * Creates a DeviceConfigurationConflictSummary with a new object
     *
     * @param newDeviceConfigurationConflictSummary the new object to create
     * @return the created DeviceConfigurationConflictSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceConfigurationConflictSummary post(final DeviceConfigurationConflictSummary newDeviceConfigurationConflictSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceConfigurationConflictSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceConfigurationConflictSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceConfigurationConflictSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceConfigurationConflictSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceConfigurationConflictSummaryRequest)this;
     }

}

