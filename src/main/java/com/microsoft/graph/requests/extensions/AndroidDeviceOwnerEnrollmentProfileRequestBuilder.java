// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequest;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRequest;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRevokeTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRevokeTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Request Builder.
 */
public class AndroidDeviceOwnerEnrollmentProfileRequestBuilder extends BaseRequestBuilder implements IAndroidDeviceOwnerEnrollmentProfileRequestBuilder {

    /**
     * The request builder for the AndroidDeviceOwnerEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerEnrollmentProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IAndroidDeviceOwnerEnrollmentProfileRequest instance
     */
    public IAndroidDeviceOwnerEnrollmentProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAndroidDeviceOwnerEnrollmentProfileRequest instance
     */
    public IAndroidDeviceOwnerEnrollmentProfileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new AndroidDeviceOwnerEnrollmentProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IAndroidDeviceOwnerEnrollmentProfileRevokeTokenRequestBuilder revokeToken() {
        return new AndroidDeviceOwnerEnrollmentProfileRevokeTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.revokeToken"), getClient(), null);
    }

    public IAndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder createToken(final Integer tokenValidityInSeconds) {
        return new AndroidDeviceOwnerEnrollmentProfileCreateTokenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createToken"), getClient(), null, tokenValidityInSeconds);
    }
}

