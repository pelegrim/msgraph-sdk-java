// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Sync With Apple Device Enrollment Program Request Builder.
 */
public class DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequestBuilder extends BaseActionRequestBuilder implements IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequestBuilder {

    /**
     * The request builder for this DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgram
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest
     *
     * @return the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest instance
     */
    public IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest instance
     */
    public IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest request = new DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
