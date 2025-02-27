// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Statement Get Management Condition Statement Expression String Request Builder.
 */
public interface IManagementConditionStatementGetManagementConditionStatementExpressionStringRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest
     *
     * @return the IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest instance
     */
    IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest buildRequest();

    /**
     * Creates the IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest instance
     */
    IManagementConditionStatementGetManagementConditionStatementExpressionStringRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
