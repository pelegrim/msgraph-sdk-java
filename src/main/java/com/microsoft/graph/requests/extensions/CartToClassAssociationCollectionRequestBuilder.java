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
 * The class for the Cart To Class Association Collection Request Builder.
 */
public class CartToClassAssociationCollectionRequestBuilder extends BaseRequestBuilder implements ICartToClassAssociationCollectionRequestBuilder {

    /**
     * The request builder for this collection of DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CartToClassAssociationCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ICartToClassAssociationCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ICartToClassAssociationCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new CartToClassAssociationCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ICartToClassAssociationRequestBuilder byId(final String id) {
        return new CartToClassAssociationRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
