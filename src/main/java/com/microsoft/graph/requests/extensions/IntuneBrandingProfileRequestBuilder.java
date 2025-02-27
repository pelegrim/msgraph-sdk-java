// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequest;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileRequest;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentRequestBuilder;
import com.microsoft.graph.models.extensions.IntuneBrandingProfileAssignment;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Request Builder.
 */
public class IntuneBrandingProfileRequestBuilder extends BaseRequestBuilder implements IIntuneBrandingProfileRequestBuilder {

    /**
     * The request builder for the IntuneBrandingProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IntuneBrandingProfileRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IIntuneBrandingProfileRequest instance
     */
    public IIntuneBrandingProfileRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IIntuneBrandingProfileRequest instance
     */
    public IIntuneBrandingProfileRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new IntuneBrandingProfileRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IIntuneBrandingProfileAssignmentCollectionRequestBuilder assignments() {
        return new IntuneBrandingProfileAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IIntuneBrandingProfileAssignmentRequestBuilder assignments(final String id) {
        return new IntuneBrandingProfileAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    public IIntuneBrandingProfileAssignRequestBuilder assign(final java.util.List<IntuneBrandingProfileAssignment> assignments) {
        return new IntuneBrandingProfileAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }
}

