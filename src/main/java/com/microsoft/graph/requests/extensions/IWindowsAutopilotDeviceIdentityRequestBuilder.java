// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequest;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Device Identity Request Builder.
 */
public interface IWindowsAutopilotDeviceIdentityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    IWindowsAutopilotDeviceIdentityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotDeviceIdentityRequest instance
     */
    IWindowsAutopilotDeviceIdentityRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder deploymentProfile();

    /**
     * Gets the request builder for WindowsAutopilotDeploymentProfile
     *
     * @return the IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder instance
     */
    IWindowsAutopilotDeploymentProfileWithReferenceRequestBuilder intendedDeploymentProfile();
    IWindowsAutopilotDeviceIdentityAssignUserToDeviceRequestBuilder assignUserToDevice(final String userPrincipalName, final String addressableUserName);
    IWindowsAutopilotDeviceIdentityUnassignUserFromDeviceRequestBuilder unassignUserFromDevice();
    IWindowsAutopilotDeviceIdentityAssignResourceAccountToDeviceRequestBuilder assignResourceAccountToDevice(final String userPrincipalName, final String addressableUserName, final String resourceAccountName);
    IWindowsAutopilotDeviceIdentityUnassignResourceAccountFromDeviceRequestBuilder unassignResourceAccountFromDevice();

}
