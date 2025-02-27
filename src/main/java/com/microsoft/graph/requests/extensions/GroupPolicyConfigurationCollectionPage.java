// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyConfiguration;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Collection Page.
 */
public class GroupPolicyConfigurationCollectionPage extends BaseCollectionPage<GroupPolicyConfiguration, IGroupPolicyConfigurationCollectionRequestBuilder> implements IGroupPolicyConfigurationCollectionPage {

    /**
     * A collection page for GroupPolicyConfiguration
     *
     * @param response the serialized GroupPolicyConfigurationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public GroupPolicyConfigurationCollectionPage(final GroupPolicyConfigurationCollectionResponse response, final IGroupPolicyConfigurationCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
