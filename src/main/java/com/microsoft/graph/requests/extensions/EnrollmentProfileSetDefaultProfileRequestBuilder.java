// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileSetDefaultProfileRequest;
import com.microsoft.graph.requests.extensions.EnrollmentProfileSetDefaultProfileRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Enrollment Profile Set Default Profile Request Builder.
 */
public class EnrollmentProfileSetDefaultProfileRequestBuilder extends BaseActionRequestBuilder implements IEnrollmentProfileSetDefaultProfileRequestBuilder {

    /**
     * The request builder for this EnrollmentProfileSetDefaultProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EnrollmentProfileSetDefaultProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IEnrollmentProfileSetDefaultProfileRequest
     *
     * @return the IEnrollmentProfileSetDefaultProfileRequest instance
     */
    public IEnrollmentProfileSetDefaultProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IEnrollmentProfileSetDefaultProfileRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IEnrollmentProfileSetDefaultProfileRequest instance
     */
    public IEnrollmentProfileSetDefaultProfileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        EnrollmentProfileSetDefaultProfileRequest request = new EnrollmentProfileSetDefaultProfileRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
