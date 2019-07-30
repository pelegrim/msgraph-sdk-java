// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequest;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequest;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Request Builder.
 */
public class WindowsAutopilotDeviceIdentityRequestBuilder extends BaseRequestBuilder implements IWindowsAutopilotDeviceIdentityRequestBuilder {

    /**
     * The request builder for the WindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    public IWindowsAutopilotDeviceIdentityRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    public IWindowsAutopilotDeviceIdentityRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsAutopilotDeviceIdentityRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    public IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder deploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentProfile"), getClient(), null);
    }

    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    public IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder intendedDeploymentProfile() {
        return new WindowsAutopilotDeploymentProfileWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("intendedDeploymentProfile"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder assignUserToDevice(final String userPrincipalName, final String addressableUserName) {
        return new WindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignUserToDevice"), getClient(), null, userPrincipalName, addressableUserName);
    }

    public IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder unassignUserFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignUserFromDevice"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder assignResourceAccountToDevice(final String userPrincipalName, final String addressableUserName, final String resourceAccountName) {
        return new WindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assignResourceAccountToDevice"), getClient(), null, userPrincipalName, addressableUserName, resourceAccountName);
    }

    public IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder unassignResourceAccountFromDevice() {
        return new WindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unassignResourceAccountFromDevice"), getClient(), null);
    }
}

