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
 * The class for the Management Condition Statement With Reference Request Builder.
 */
public class ManagementConditionStatementWithReferenceRequestBuilder extends BaseRequestBuilder implements IManagementConditionStatementWithReferenceRequestBuilder {

    /**
     * The request builder for the ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionStatementWithReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IManagementConditionStatementWithReferenceRequest instance
     */
    public IManagementConditionStatementWithReferenceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific options instead of the existing options
	 *
     * @param requestOptions the options for this request
     * @return the IManagementConditionStatementWithReferenceRequest instance
     */
    public IManagementConditionStatementWithReferenceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ManagementConditionStatementWithReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IManagementConditionStatementReferenceRequestBuilder reference(){
        return new ManagementConditionStatementReferenceRequestBuilder(getRequestUrl() + "/$ref", getClient(), getOptions());
    }

}
