// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateSummaryRequest;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device State Summary Request.
 */
public class DeviceManagementIntentDeviceStateSummaryRequest extends BaseRequest implements IDeviceManagementIntentDeviceStateSummaryRequest {
	
    /**
     * The request for the DeviceManagementIntentDeviceStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentDeviceStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentDeviceStateSummary.class);
    }

    /**
     * Gets the DeviceManagementIntentDeviceStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementIntentDeviceStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementIntentDeviceStateSummary from the service
     *
     * @return the DeviceManagementIntentDeviceStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementIntentDeviceStateSummary> callback) {
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
     * Patches this DeviceManagementIntentDeviceStateSummary with a source
     *
     * @param sourceDeviceManagementIntentDeviceStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementIntentDeviceStateSummary sourceDeviceManagementIntentDeviceStateSummary, final ICallback<DeviceManagementIntentDeviceStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementIntentDeviceStateSummary);
    }

    /**
     * Patches this DeviceManagementIntentDeviceStateSummary with a source
     *
     * @param sourceDeviceManagementIntentDeviceStateSummary the source object with updates
     * @return the updated DeviceManagementIntentDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceStateSummary patch(final DeviceManagementIntentDeviceStateSummary sourceDeviceManagementIntentDeviceStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntentDeviceStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentDeviceStateSummary with a new object
     *
     * @param newDeviceManagementIntentDeviceStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementIntentDeviceStateSummary newDeviceManagementIntentDeviceStateSummary, final ICallback<DeviceManagementIntentDeviceStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementIntentDeviceStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentDeviceStateSummary with a new object
     *
     * @param newDeviceManagementIntentDeviceStateSummary the new object to create
     * @return the created DeviceManagementIntentDeviceStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceStateSummary post(final DeviceManagementIntentDeviceStateSummary newDeviceManagementIntentDeviceStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntentDeviceStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementIntentDeviceStateSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementIntentDeviceStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementIntentDeviceStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementIntentDeviceStateSummaryRequest)this;
     }

}

