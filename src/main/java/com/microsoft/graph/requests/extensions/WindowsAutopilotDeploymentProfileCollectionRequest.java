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
 * The class for the Windows Autopilot Deployment Profile Collection Request.
 */
public class WindowsAutopilotDeploymentProfileCollectionRequest extends BaseCollectionRequest<WindowsAutopilotDeploymentProfileCollectionResponse, IWindowsAutopilotDeploymentProfileCollectionPage> implements IWindowsAutopilotDeploymentProfileCollectionRequest {

    /**
     * The request builder for this collection of WindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeploymentProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsAutopilotDeploymentProfileCollectionResponse.class, IWindowsAutopilotDeploymentProfileCollectionPage.class);
    }

    public void get(final ICallback<IWindowsAutopilotDeploymentProfileCollectionPage> callback) {
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

    public IWindowsAutopilotDeploymentProfileCollectionPage get() throws ClientException {
        final WindowsAutopilotDeploymentProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsAutopilotDeploymentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsAutopilotDeploymentProfile, callback);
    }

    public WindowsAutopilotDeploymentProfile post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsAutopilotDeploymentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsAutopilotDeploymentProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsAutopilotDeploymentProfileCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (WindowsAutopilotDeploymentProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsAutopilotDeploymentProfileCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (WindowsAutopilotDeploymentProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsAutopilotDeploymentProfileCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (WindowsAutopilotDeploymentProfileCollectionRequest)this;
    }

    public IWindowsAutopilotDeploymentProfileCollectionPage buildFromResponse(final WindowsAutopilotDeploymentProfileCollectionResponse response) {
        final IWindowsAutopilotDeploymentProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsAutopilotDeploymentProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsAutopilotDeploymentProfileCollectionPage page = new WindowsAutopilotDeploymentProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
