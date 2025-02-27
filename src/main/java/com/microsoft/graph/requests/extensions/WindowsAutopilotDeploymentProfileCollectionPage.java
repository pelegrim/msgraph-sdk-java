// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Collection Page.
 */
public class WindowsAutopilotDeploymentProfileCollectionPage extends BaseCollectionPage<WindowsAutopilotDeploymentProfile, IWindowsAutopilotDeploymentProfileCollectionRequestBuilder> implements IWindowsAutopilotDeploymentProfileCollectionPage {

    /**
     * A collection page for WindowsAutopilotDeploymentProfile
     *
     * @param response the serialized WindowsAutopilotDeploymentProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsAutopilotDeploymentProfileCollectionPage(final WindowsAutopilotDeploymentProfileCollectionResponse response, final IWindowsAutopilotDeploymentProfileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
