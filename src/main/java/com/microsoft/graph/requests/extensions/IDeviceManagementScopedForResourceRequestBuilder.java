// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementScopedForResourceRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Scoped For Resource Request Builder.
 */
public interface IDeviceManagementScopedForResourceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementScopedForResourceRequest
     *
     * @return the IDeviceManagementScopedForResourceRequest instance
     */
    IDeviceManagementScopedForResourceRequest buildRequest();

    /**
     * Creates the IDeviceManagementScopedForResourceRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementScopedForResourceRequest instance
     */
    IDeviceManagementScopedForResourceRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
