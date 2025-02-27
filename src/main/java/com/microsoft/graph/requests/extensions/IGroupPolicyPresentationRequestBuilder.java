// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationRequest;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionWithReferenceRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Presentation Request Builder.
 */
public interface IGroupPolicyPresentationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IGroupPolicyPresentationRequest instance
     */
    IGroupPolicyPresentationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IGroupPolicyPresentationRequest instance
     */
    IGroupPolicyPresentationRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    /**
     * Gets the request builder for GroupPolicyDefinition
     *
     * @return the IGroupPolicyDefinitionWithReferenceRequestBuilder instance
     */
    IGroupPolicyDefinitionWithReferenceRequestBuilder definition();

}
