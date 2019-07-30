// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RestrictedAppsViolation;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Apps Violation Collection Page.
 */
public class RestrictedAppsViolationCollectionPage extends BaseCollectionPage<RestrictedAppsViolation, IRestrictedAppsViolationCollectionRequestBuilder> implements IRestrictedAppsViolationCollectionPage {

    /**
     * A collection page for RestrictedAppsViolation
     *
     * @param response the serialized RestrictedAppsViolationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RestrictedAppsViolationCollectionPage(final RestrictedAppsViolationCollectionResponse response, final IRestrictedAppsViolationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
