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
 * The class for the Management Condition Collection Reference Request.
 */
public class ManagementConditionCollectionReferenceRequest extends BaseCollectionRequest<ManagementConditionCollectionResponse, IManagementConditionCollectionPage> implements IManagementConditionCollectionReferenceRequest {

    /**
     * The request builder for this collection of ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionCollectionReferenceRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementConditionCollectionResponse.class, IManagementConditionCollectionPage.class);
    }

    public void post(final ManagementCondition newManagementCondition, final ICallback<ManagementCondition> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditions/" + newManagementCondition.id);
        new ManagementConditionWithReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newManagementCondition, body, callback);
    }

    public ManagementCondition post(final ManagementCondition newManagementCondition) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        final ReferenceRequestBody body = new ReferenceRequestBody(getBaseRequest().getClient().getServiceRoot() + "/deviceManagement/managementConditions/" + newManagementCondition.id);
        return new ManagementConditionWithReferenceRequestBuilder(requestUrl,getBaseRequest().getClient(), /* Options */ null)
                .buildRequest(getBaseRequest().getOptions())
                .post(newManagementCondition, body);
    }
    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionCollectionReferenceRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (ManagementConditionCollectionReferenceRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionCollectionReferenceRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (ManagementConditionCollectionReferenceRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagementConditionCollectionReferenceRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (ManagementConditionCollectionReferenceRequest)this;
    }
}
