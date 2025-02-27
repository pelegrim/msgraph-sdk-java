// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequest;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequest;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMDeviceStateRequestBuilder;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePoolAssignment;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Request Builder.
 */
public class EmbeddedSIMActivationCodePoolRequestBuilder extends BaseRequestBuilder implements IEmbeddedSIMActivationCodePoolRequestBuilder {

    /**
     * The request builder for the EmbeddedSIMActivationCodePool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmbeddedSIMActivationCodePoolRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IEmbeddedSIMActivationCodePoolRequest instance
     */
    public IEmbeddedSIMActivationCodePoolRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IEmbeddedSIMActivationCodePoolRequest instance
     */
    public IEmbeddedSIMActivationCodePoolRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new EmbeddedSIMActivationCodePoolRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IEmbeddedSIMActivationCodePoolAssignmentCollectionRequestBuilder assignments() {
        return new EmbeddedSIMActivationCodePoolAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IEmbeddedSIMActivationCodePoolAssignmentRequestBuilder assignments(final String id) {
        return new EmbeddedSIMActivationCodePoolAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IEmbeddedSIMDeviceStateCollectionRequestBuilder deviceStates() {
        return new EmbeddedSIMDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    public IEmbeddedSIMDeviceStateRequestBuilder deviceStates(final String id) {
        return new EmbeddedSIMDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }

    public IEmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder assign(final java.util.List<EmbeddedSIMActivationCodePoolAssignment> assignments) {
        return new EmbeddedSIMActivationCodePoolAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}

