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
 * The class for the Device Management Script Group Assignment Collection Request.
 */
public class DeviceManagementScriptGroupAssignmentCollectionRequest extends BaseCollectionRequest<DeviceManagementScriptGroupAssignmentCollectionResponse, IDeviceManagementScriptGroupAssignmentCollectionPage> implements IDeviceManagementScriptGroupAssignmentCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementScriptGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementScriptGroupAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementScriptGroupAssignmentCollectionResponse.class, IDeviceManagementScriptGroupAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IDeviceManagementScriptGroupAssignmentCollectionPage> callback) {
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

    public IDeviceManagementScriptGroupAssignmentCollectionPage get() throws ClientException {
        final DeviceManagementScriptGroupAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementScriptGroupAssignment newDeviceManagementScriptGroupAssignment, final ICallback<DeviceManagementScriptGroupAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementScriptGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementScriptGroupAssignment, callback);
    }

    public DeviceManagementScriptGroupAssignment post(final DeviceManagementScriptGroupAssignment newDeviceManagementScriptGroupAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementScriptGroupAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newDeviceManagementScriptGroupAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementScriptGroupAssignmentCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (DeviceManagementScriptGroupAssignmentCollectionRequest)this;
    }

    public IDeviceManagementScriptGroupAssignmentCollectionPage buildFromResponse(final DeviceManagementScriptGroupAssignmentCollectionResponse response) {
        final IDeviceManagementScriptGroupAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementScriptGroupAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementScriptGroupAssignmentCollectionPage page = new DeviceManagementScriptGroupAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
