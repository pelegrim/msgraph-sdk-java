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
 * The class for the Restricted Apps Violation Collection Request.
 */
public class RestrictedAppsViolationCollectionRequest extends BaseCollectionRequest<RestrictedAppsViolationCollectionResponse, IRestrictedAppsViolationCollectionPage> implements IRestrictedAppsViolationCollectionRequest {

    /**
     * The request builder for this collection of RestrictedAppsViolation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedAppsViolationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedAppsViolationCollectionResponse.class, IRestrictedAppsViolationCollectionPage.class);
    }

    public void get(final ICallback<IRestrictedAppsViolationCollectionPage> callback) {
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

    public IRestrictedAppsViolationCollectionPage get() throws ClientException {
        final RestrictedAppsViolationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final RestrictedAppsViolation newRestrictedAppsViolation, final ICallback<RestrictedAppsViolation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new RestrictedAppsViolationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newRestrictedAppsViolation, callback);
    }

    public RestrictedAppsViolation post(final RestrictedAppsViolation newRestrictedAppsViolation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RestrictedAppsViolationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newRestrictedAppsViolation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    public IRestrictedAppsViolationCollectionPage buildFromResponse(final RestrictedAppsViolationCollectionResponse response) {
        final IRestrictedAppsViolationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new RestrictedAppsViolationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final RestrictedAppsViolationCollectionPage page = new RestrictedAppsViolationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
