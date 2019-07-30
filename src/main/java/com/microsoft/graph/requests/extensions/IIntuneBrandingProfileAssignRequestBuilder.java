// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Intune Branding Profile Assign Request Builder.
 */
public interface IIntuneBrandingProfileAssignRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IIntuneBrandingProfileAssignRequest
     *
     * @return the IIntuneBrandingProfileAssignRequest instance
     */
    IIntuneBrandingProfileAssignRequest buildRequest();

    /**
     * Creates the IIntuneBrandingProfileAssignRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IIntuneBrandingProfileAssignRequest instance
     */
    IIntuneBrandingProfileAssignRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
