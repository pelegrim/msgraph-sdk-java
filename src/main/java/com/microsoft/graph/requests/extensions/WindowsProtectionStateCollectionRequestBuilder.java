// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Protection State Collection Request Builder.
 */
public class WindowsProtectionStateCollectionRequestBuilder extends BaseRequestBuilder implements IWindowsProtectionStateCollectionRequestBuilder {

    /**
     * The request builder for this collection of WindowsMalwareInformation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsProtectionStateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IWindowsProtectionStateCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IWindowsProtectionStateCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new WindowsProtectionStateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWindowsProtectionStateRequestBuilder byId(final String id) {
        return new WindowsProtectionStateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
