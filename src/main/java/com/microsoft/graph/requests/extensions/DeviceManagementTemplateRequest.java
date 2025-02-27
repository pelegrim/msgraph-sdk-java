// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequest;
import com.microsoft.graph.models.extensions.DeviceManagementTemplate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Template Request.
 */
public class DeviceManagementTemplateRequest extends BaseRequest implements IDeviceManagementTemplateRequest {
	
    /**
     * The request for the DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceManagementTemplateRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends DeviceManagementTemplate> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceManagementTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementTemplateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementTemplate.class);
    }

    /**
     * Gets the DeviceManagementTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceManagementTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceManagementTemplate from the service
     *
     * @return the DeviceManagementTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceManagementTemplate> callback) {
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
     * Patches this DeviceManagementTemplate with a source
     *
     * @param sourceDeviceManagementTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceManagementTemplate sourceDeviceManagementTemplate, final ICallback<DeviceManagementTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceManagementTemplate);
    }

    /**
     * Patches this DeviceManagementTemplate with a source
     *
     * @param sourceDeviceManagementTemplate the source object with updates
     * @return the updated DeviceManagementTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTemplate patch(final DeviceManagementTemplate sourceDeviceManagementTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceManagementTemplate);
    }

    /**
     * Creates a DeviceManagementTemplate with a new object
     *
     * @param newDeviceManagementTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceManagementTemplate newDeviceManagementTemplate, final ICallback<DeviceManagementTemplate> callback) {
        send(HttpMethod.POST, callback, newDeviceManagementTemplate);
    }

    /**
     * Creates a DeviceManagementTemplate with a new object
     *
     * @param newDeviceManagementTemplate the new object to create
     * @return the created DeviceManagementTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceManagementTemplate post(final DeviceManagementTemplate newDeviceManagementTemplate) throws ClientException {
        return send(HttpMethod.POST, newDeviceManagementTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceManagementTemplateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DeviceManagementTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceManagementTemplateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DeviceManagementTemplateRequest)this;
     }

}

