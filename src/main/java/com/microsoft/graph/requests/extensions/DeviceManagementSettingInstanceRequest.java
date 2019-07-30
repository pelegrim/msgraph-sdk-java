// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequest;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Instance Request.
 */
public class DeviceManagementSettingInstanceRequest extends BaseRequest implements IDeviceManagementSettingInstanceRequest {
	
    /**
     * The request for the DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementSettingInstanceRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DeviceManagementSettingInstance> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingInstanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingInstance.class);
    }

    /**
     * Gets the DeviceManagementSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementSettingInstance from the service
     *
     * @return the DeviceManagementSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementSettingInstance> callback) {
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
     * Patches this DeviceManagementSettingInstance with a source
     *
     * @param sourceDeviceManagementSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance, final ICallback<DeviceManagementSettingInstance> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementSettingInstance);
    }

    /**
     * Patches this DeviceManagementSettingInstance with a source
     *
     * @param sourceDeviceManagementSettingInstance the source object with updates
     * @return the updated DeviceManagementSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingInstance patch(final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementSettingInstance newDeviceManagementSettingInstance, final ICallback<DeviceManagementSettingInstance> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementSettingInstance);
    }

    /**
     * Creates a DeviceManagementSettingInstance with a new object
     *
     * @param newDeviceManagementSettingInstance the new object to create
     * @return the created DeviceManagementSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementSettingInstance post(final DeviceManagementSettingInstance newDeviceManagementSettingInstance) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementSettingInstance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementSettingInstanceRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementSettingInstanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementSettingInstanceRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementSettingInstanceRequest)this;
     }

}

