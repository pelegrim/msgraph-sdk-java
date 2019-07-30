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
 * The class for the Management Condition Statement Get Management Condition Statements For Platform Collection Request Builder.
 */
public class ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder {

    /**
     * The request builder for this collection of ManagementConditionStatement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param platform the platform
     */
    public ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final DevicePlatformType platform) {
        super(requestUrl, client, requestOptions);
     	 if(platform!=null){
			functionOptions.add(new FunctionOption("platform", platform));
		}
      }

    public IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequest request = new ManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
