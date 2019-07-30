// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementDerivedCredentialSettingsRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementDerivedCredentialSettingsRequest;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Derived Credential Settings Request Builder.
 */
public class DeviceManagementDerivedCredentialSettingsRequestBuilder extends BaseRequestBuilder implements IDeviceManagementDerivedCredentialSettingsRequestBuilder {

    /**
     * The request builder for the DeviceManagementDerivedCredentialSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementDerivedCredentialSettingsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementDerivedCredentialSettingsRequest instance
     */
    public IDeviceManagementDerivedCredentialSettingsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementDerivedCredentialSettingsRequest instance
     */
    public IDeviceManagementDerivedCredentialSettingsRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceManagementDerivedCredentialSettingsRequest(getRequestUrl(), getClient(), requestOptions);
    }


}

