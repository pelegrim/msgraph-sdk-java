// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequest;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequest;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Request Builder.
 */
public class WindowsAutopilotDeploymentProfileRequestBuilder extends BaseRequestBuilder implements IWindowsAutopilotDeploymentProfileRequestBuilder {

    /**
     * The request builder for the WindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeploymentProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsAutopilotDeploymentProfileRequest instance
     */
    public IWindowsAutopilotDeploymentProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotDeploymentProfileRequest instance
     */
    public IWindowsAutopilotDeploymentProfileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsAutopilotDeploymentProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IWindowsAutopilotDeviceIdentityCollectionRequestBuilder assignedDevices() {
        return new WindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityRequestBuilder assignedDevices(final String id) {
        return new WindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("assignedDevices") + "/" + id, getClient(), null);
    }
    public IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder assignments() {
        return new WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder assignments(final String id) {
        return new WindowsAutopilotDeploymentProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IWindowsAutopilotDeploymentProfileAssignRequestBuilder assign(final java.util.List<String> deviceIds) {
        return new WindowsAutopilotDeploymentProfileAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, deviceIds);
    }
}

