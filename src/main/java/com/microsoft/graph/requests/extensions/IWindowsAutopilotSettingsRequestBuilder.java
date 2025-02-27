// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsRequest;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsSyncRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Autopilot Settings Request Builder.
 */
public interface IWindowsAutopilotSettingsRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsAutopilotSettingsRequest instance
     */
    IWindowsAutopilotSettingsRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsAutopilotSettingsRequest instance
     */
    IWindowsAutopilotSettingsRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IWindowsAutopilotSettingsSyncRequestBuilder sync();

}
