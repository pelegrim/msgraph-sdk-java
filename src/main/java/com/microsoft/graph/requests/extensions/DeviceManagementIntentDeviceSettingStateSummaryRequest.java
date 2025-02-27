// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryRequest;
import com.microsoft.graph.models.extensions.DeviceManagementIntentDeviceSettingStateSummary;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Device Setting State Summary Request.
 */
public class DeviceManagementIntentDeviceSettingStateSummaryRequest extends BaseRequest implements IDeviceManagementIntentDeviceSettingStateSummaryRequest {
	
    /**
     * The request for the DeviceManagementIntentDeviceSettingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentDeviceSettingStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementIntentDeviceSettingStateSummary.class);
    }

    /**
     * Gets the DeviceManagementIntentDeviceSettingStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementIntentDeviceSettingStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementIntentDeviceSettingStateSummary from the service
     *
     * @return the DeviceManagementIntentDeviceSettingStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceSettingStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementIntentDeviceSettingStateSummary> callback) {
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
     * Patches this DeviceManagementIntentDeviceSettingStateSummary with a source
     *
     * @param sourceDeviceManagementIntentDeviceSettingStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementIntentDeviceSettingStateSummary sourceDeviceManagementIntentDeviceSettingStateSummary, final ICallback<DeviceManagementIntentDeviceSettingStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementIntentDeviceSettingStateSummary);
    }

    /**
     * Patches this DeviceManagementIntentDeviceSettingStateSummary with a source
     *
     * @param sourceDeviceManagementIntentDeviceSettingStateSummary the source object with updates
     * @return the updated DeviceManagementIntentDeviceSettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceSettingStateSummary patch(final DeviceManagementIntentDeviceSettingStateSummary sourceDeviceManagementIntentDeviceSettingStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementIntentDeviceSettingStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentDeviceSettingStateSummary with a new object
     *
     * @param newDeviceManagementIntentDeviceSettingStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementIntentDeviceSettingStateSummary newDeviceManagementIntentDeviceSettingStateSummary, final ICallback<DeviceManagementIntentDeviceSettingStateSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementIntentDeviceSettingStateSummary);
    }

    /**
     * Creates a DeviceManagementIntentDeviceSettingStateSummary with a new object
     *
     * @param newDeviceManagementIntentDeviceSettingStateSummary the new object to create
     * @return the created DeviceManagementIntentDeviceSettingStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementIntentDeviceSettingStateSummary post(final DeviceManagementIntentDeviceSettingStateSummary newDeviceManagementIntentDeviceSettingStateSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementIntentDeviceSettingStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementIntentDeviceSettingStateSummaryRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementIntentDeviceSettingStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementIntentDeviceSettingStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementIntentDeviceSettingStateSummaryRequest)this;
     }

}

