// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRunSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRunSummaryRequest;
import com.microsoft.graph.models.extensions.DeviceManagementScriptRunSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Script Run Summary Request.
 */
public class DeviceManagementScriptRunSummaryRequest extends BaseRequest implements IDeviceManagementScriptRunSummaryRequest {
	
    /**
     * The request for the DeviceManagementScriptRunSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptRunSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptRunSummary.class);
    }

    /**
     * Gets the DeviceManagementScriptRunSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementScriptRunSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementScriptRunSummary from the service
     *
     * @return the DeviceManagementScriptRunSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptRunSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementScriptRunSummary> callback) {
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
     * Patches this DeviceManagementScriptRunSummary with a source
     *
     * @param sourceDeviceManagementScriptRunSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementScriptRunSummary);
    }

    /**
     * Patches this DeviceManagementScriptRunSummary with a source
     *
     * @param sourceDeviceManagementScriptRunSummary the source object with updates
     * @return the updated DeviceManagementScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptRunSummary patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementScriptRunSummary);
    }

    /**
     * Creates a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementScriptRunSummary);
    }

    /**
     * Creates a DeviceManagementScriptRunSummary with a new object
     *
     * @param newDeviceManagementScriptRunSummary the new object to create
     * @return the created DeviceManagementScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementScriptRunSummary post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementScriptRunSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementScriptRunSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementScriptRunSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementScriptRunSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementScriptRunSummaryRequest)this;
     }

}

