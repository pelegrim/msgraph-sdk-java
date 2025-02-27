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
 * The class for the App Log Collection Request Collection Request.
 */
public class AppLogCollectionRequestCollectionRequest extends BaseCollectionRequest<AppLogCollectionRequestCollectionResponse, IAppLogCollectionRequestCollectionPage> implements IAppLogCollectionRequestCollectionRequest {

    /**
     * The request builder for this collection of AppLogCollectionRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppLogCollectionRequestCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppLogCollectionRequestCollectionResponse.class, IAppLogCollectionRequestCollectionPage.class);
    }

    public void get(final ICallback<IAppLogCollectionRequestCollectionPage> callback) {
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

    public IAppLogCollectionRequestCollectionPage get() throws ClientException {
        final AppLogCollectionRequestCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AppLogCollectionRequest newAppLogCollectionRequest, final ICallback<AppLogCollectionRequest> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AppLogCollectionRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppLogCollectionRequest, callback);
    }

    public AppLogCollectionRequest post(final AppLogCollectionRequest newAppLogCollectionRequest) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AppLogCollectionRequestRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAppLogCollectionRequest);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppLogCollectionRequestCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AppLogCollectionRequestCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppLogCollectionRequestCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AppLogCollectionRequestCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAppLogCollectionRequestCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AppLogCollectionRequestCollectionRequest)this;
    }

    public IAppLogCollectionRequestCollectionPage buildFromResponse(final AppLogCollectionRequestCollectionResponse response) {
        final IAppLogCollectionRequestCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AppLogCollectionRequestCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AppLogCollectionRequestCollectionPage page = new AppLogCollectionRequestCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
