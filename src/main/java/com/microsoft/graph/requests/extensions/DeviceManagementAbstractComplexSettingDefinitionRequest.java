// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementAbstractComplexSettingDefinitionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementAbstractComplexSettingDefinitionRequest;
import com.microsoft.graph.models.extensions.DeviceManagementAbstractComplexSettingDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Abstract Complex Setting Definition Request.
 */
public class DeviceManagementAbstractComplexSettingDefinitionRequest extends BaseRequest implements IDeviceManagementAbstractComplexSettingDefinitionRequest {
	
    /**
     * The request for the DeviceManagementAbstractComplexSettingDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementAbstractComplexSettingDefinitionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementAbstractComplexSettingDefinition.class);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementAbstractComplexSettingDefinition from the service
     *
     * @return the DeviceManagementAbstractComplexSettingDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingDefinition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback) {
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
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition, final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Patches this DeviceManagementAbstractComplexSettingDefinition with a source
     *
     * @param sourceDeviceManagementAbstractComplexSettingDefinition the source object with updates
     * @return the updated DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingDefinition patch(final DeviceManagementAbstractComplexSettingDefinition sourceDeviceManagementAbstractComplexSettingDefinition) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition, final ICallback<DeviceManagementAbstractComplexSettingDefinition> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Creates a DeviceManagementAbstractComplexSettingDefinition with a new object
     *
     * @param newDeviceManagementAbstractComplexSettingDefinition the new object to create
     * @return the created DeviceManagementAbstractComplexSettingDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementAbstractComplexSettingDefinition post(final DeviceManagementAbstractComplexSettingDefinition newDeviceManagementAbstractComplexSettingDefinition) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementAbstractComplexSettingDefinition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementAbstractComplexSettingDefinitionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementAbstractComplexSettingDefinitionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementAbstractComplexSettingDefinitionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementAbstractComplexSettingDefinitionRequest)this;
     }

}

