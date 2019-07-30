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
 * The class for the Management Condition Statement Collection Request.
 */
public class ManagementConditionStatementCollectionRequest extends BaseCollectionRequest<ManagementConditionStatementCollectionResponse, IManagementConditionStatementCollectionPage> implements IManagementConditionStatementCollectionRequest {

    /**
     * The request builder for this collection of ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionStatementCollectionResponse.class, IManagementConditionStatementCollectionPage.class);
    }

    public void get(final ICallback<IManagementConditionStatementCollectionPage> callback) {
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

    public IManagementConditionStatementCollectionPage get() throws ClientException {
        final ManagementConditionStatementCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final ManagementConditionStatement newManagementConditionStatement, final ICallback<ManagementConditionStatement> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new ManagementConditionStatementRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagementConditionStatement, callback);
    }

    public ManagementConditionStatement post(final ManagementConditionStatement newManagementConditionStatement) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new ManagementConditionStatementRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagementConditionStatement);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionStatementCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagementConditionStatementCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionStatementCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagementConditionStatementCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagementConditionStatementCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagementConditionStatementCollectionRequest)this;
    }

    public IManagementConditionStatementCollectionPage buildFromResponse(final ManagementConditionStatementCollectionResponse response) {
        final IManagementConditionStatementCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ManagementConditionStatementCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final ManagementConditionStatementCollectionPage page = new ManagementConditionStatementCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
