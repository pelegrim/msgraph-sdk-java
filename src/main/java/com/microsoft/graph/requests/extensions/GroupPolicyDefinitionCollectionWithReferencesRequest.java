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
 * The class for the Group Policy Definition Collection With References Request.
 */
public class GroupPolicyDefinitionCollectionWithReferencesRequest extends BaseCollectionRequest<GroupPolicyDefinitionCollectionResponse, IGroupPolicyDefinitionCollectionPage> implements IGroupPolicyDefinitionCollectionWithReferencesRequest {

    /**
     * The request builder for this collection of GroupPolicyDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionCollectionWithReferencesRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionCollectionResponse.class, IGroupPolicyDefinitionCollectionPage.class);
    }

    public void get(final ICallback<IGroupPolicyDefinitionCollectionWithReferencesPage> callback) {
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

    public IGroupPolicyDefinitionCollectionWithReferencesPage get() throws ClientException {
        final GroupPolicyDefinitionCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public IGroupPolicyDefinitionCollectionWithReferencesRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (GroupPolicyDefinitionCollectionWithReferencesRequest)this;
    }

    public IGroupPolicyDefinitionCollectionWithReferencesRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (GroupPolicyDefinitionCollectionWithReferencesRequest)this;
    }

    public IGroupPolicyDefinitionCollectionWithReferencesRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (GroupPolicyDefinitionCollectionWithReferencesRequest)this;
    }

    public IGroupPolicyDefinitionCollectionWithReferencesPage buildFromResponse(final GroupPolicyDefinitionCollectionResponse response) {
        final IGroupPolicyDefinitionCollectionWithReferencesRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GroupPolicyDefinitionCollectionWithReferencesRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GroupPolicyDefinitionCollectionWithReferencesPage page = new GroupPolicyDefinitionCollectionWithReferencesPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
