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
 * The class for the Device Management Setting Instance Collection With References Request.
 */
public class DeviceManagementSettingInstanceCollectionWithReferencesRequest extends BaseCollectionRequest<DeviceManagementSettingInstanceCollectionResponse, IDeviceManagementSettingInstanceCollectionPage> implements IDeviceManagementSettingInstanceCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of DeviceManagementSettingInstance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementSettingInstanceCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementSettingInstanceCollectionResponse.class, IDeviceManagementSettingInstanceCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementSettingInstanceCollectionWithReferencesPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IDeviceManagementSettingInstanceCollectionWithReferencesPage get() throws ClientException {
        final DeviceManagementSettingInstanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IDeviceManagementSettingInstanceCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceManagementSettingInstanceCollectionWithReferencesRequest)this;
    }

    public IDeviceManagementSettingInstanceCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceManagementSettingInstanceCollectionWithReferencesRequest)this;
    }

    public IDeviceManagementSettingInstanceCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceManagementSettingInstanceCollectionWithReferencesRequest)this;
    }

    public IDeviceManagementSettingInstanceCollectionWithReferencesPage buildFromResponse(final DeviceManagementSettingInstanceCollectionResponse response) {
        final IDeviceManagementSettingInstanceCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementSettingInstanceCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementSettingInstanceCollectionWithReferencesPage page = new DeviceManagementSettingInstanceCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
