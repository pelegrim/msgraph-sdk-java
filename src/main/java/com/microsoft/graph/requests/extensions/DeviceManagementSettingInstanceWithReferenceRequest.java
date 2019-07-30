// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Instance With Reference Request.
 */
public class DeviceManagementSettingInstanceWithReferenceRequest extends BaseRequest implements IDeviceManagementSettingInstanceWithReferenceRequest {

    /**
     * The request for the DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingInstanceWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingInstance.class);
    }

    public void post(final DeviceManagementSettingInstance newDeviceManagementSettingInstance, final IJsonBackedObject payload, final ICallback<DeviceManagementSettingInstance> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceManagementSettingInstance post(final DeviceManagementSettingInstance newDeviceManagementSettingInstance, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceManagementSettingInstance;
        }
        return null;
    }

    public void get(final ICallback<DeviceManagementSettingInstance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceManagementSettingInstance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<DeviceManagementSettingInstance> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance, final ICallback<DeviceManagementSettingInstance> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceManagementSettingInstance);
	}

	public DeviceManagementSettingInstance patch(final DeviceManagementSettingInstance sourceDeviceManagementSettingInstance) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceManagementSettingInstance);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementSettingInstanceWithReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (IDeviceManagementSettingInstanceWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementSettingInstanceWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DeviceManagementSettingInstanceWithReferenceRequest)this;
    }
}
