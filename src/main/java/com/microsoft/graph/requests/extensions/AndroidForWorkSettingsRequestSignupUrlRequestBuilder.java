// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequestSignupUrlRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequestSignupUrlRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Request Signup Url Request Builder.
 */
public class AndroidForWorkSettingsRequestSignupUrlRequestBuilder extends BaseActionRequestBuilder implements IAndroidForWorkSettingsRequestSignupUrlRequestBuilder {

    /**
     * The request builder for this AndroidForWorkSettingsRequestSignupUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param hostName the hostName
     */
    public AndroidForWorkSettingsRequestSignupUrlRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String hostName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("hostName", hostName);
    }

    /**
     * Creates the IAndroidForWorkSettingsRequestSignupUrlRequest
     *
     * @return the IAndroidForWorkSettingsRequestSignupUrlRequest instance
     */
    public IAndroidForWorkSettingsRequestSignupUrlRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAndroidForWorkSettingsRequestSignupUrlRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidForWorkSettingsRequestSignupUrlRequest instance
     */
    public IAndroidForWorkSettingsRequestSignupUrlRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        AndroidForWorkSettingsRequestSignupUrlRequest request = new AndroidForWorkSettingsRequestSignupUrlRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("hostName")) {
            request.body.hostName = getParameter("hostName");
        }

        return request;
    }
}
