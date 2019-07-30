// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Collection Page.
 */
public class IntuneBrandingProfileCollectionPage extends BaseCollectionPage<IntuneBrandingProfile, IIntuneBrandingProfileCollectionRequestBuilder> implements IIntuneBrandingProfileCollectionPage {

    /**
     * A collection page for IntuneBrandingProfile
     *
     * @param response the serialized IntuneBrandingProfileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IntuneBrandingProfileCollectionPage(final IntuneBrandingProfileCollectionResponse response, final IIntuneBrandingProfileCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
