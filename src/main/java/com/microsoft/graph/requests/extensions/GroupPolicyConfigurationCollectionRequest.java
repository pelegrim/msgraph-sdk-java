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
 * The class for the Group Policy Configuration Collection Request.
 */
public class GroupPolicyConfigurationCollectionRequest extends BaseCollectionRequest<GroupPolicyConfigurationCollectionResponse, IGroupPolicyConfigurationCollectionPage> implements IGroupPolicyConfigurationCollectionRequest {

    /**
     * The request builder for this collection of GroupPolicyConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyConfigurationCollectionResponse.class, IGroupPolicyConfigurationCollectionPage.class);
    }

    public void get(final ICallback<IGroupPolicyConfigurationCollectionPage> callback) {
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

    public IGroupPolicyConfigurationCollectionPage get() throws ClientException {
        final GroupPolicyConfigurationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GroupPolicyConfiguration newGroupPolicyConfiguration, final ICallback<GroupPolicyConfiguration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GroupPolicyConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupPolicyConfiguration, callback);
    }

    public GroupPolicyConfiguration post(final GroupPolicyConfiguration newGroupPolicyConfiguration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GroupPolicyConfigurationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGroupPolicyConfiguration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (GroupPolicyConfigurationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyConfigurationCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (GroupPolicyConfigurationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGroupPolicyConfigurationCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (GroupPolicyConfigurationCollectionRequest)this;
    }

    public IGroupPolicyConfigurationCollectionPage buildFromResponse(final GroupPolicyConfigurationCollectionResponse response) {
        final IGroupPolicyConfigurationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyConfigurationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyConfigurationCollectionPage page = new GroupPolicyConfigurationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
