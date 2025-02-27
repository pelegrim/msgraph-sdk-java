// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Create Google Play Web Token Request Builder.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder extends BaseActionRequestBuilder implements IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder {

    /**
     * The request builder for this AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parentUri the parentUri
     */
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions, final String parentUri) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("parentUri", parentUri);
    }

    /**
     * Creates the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest
     *
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest instance
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest request = new AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("parentUri")) {
            request.body.parentUri = getParameter("parentUri");
        }

        return request;
    }
}
