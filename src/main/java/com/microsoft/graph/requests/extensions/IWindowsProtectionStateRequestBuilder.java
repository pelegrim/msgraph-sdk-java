// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsProtectionStateRequest;
import com.microsoft.graph.requests.extensions.IWindowsDeviceMalwareStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDeviceMalwareStateRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Protection State Request Builder.
 */
public interface IWindowsProtectionStateRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWindowsProtectionStateRequest instance
     */
    IWindowsProtectionStateRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWindowsProtectionStateRequest instance
     */
    IWindowsProtectionStateRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IWindowsDeviceMalwareStateCollectionRequestBuilder detectedMalwareState();

    IWindowsDeviceMalwareStateRequestBuilder detectedMalwareState(final String id);

}
