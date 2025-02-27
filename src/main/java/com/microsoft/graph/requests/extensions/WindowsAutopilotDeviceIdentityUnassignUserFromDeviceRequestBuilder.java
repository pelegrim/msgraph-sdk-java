// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.FunctionOption;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Unassign User From Device Request Builder.
 */
public class WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder extends BaseActionRequestBuilder implements IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder {

    /**
     * The request builder for this WindowsAutopilotDeviceIdentityUnassignUserFromDevice
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest
     *
     * @return the IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest instance
     */
    public IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest instance
     */
    public IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest request = new WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
