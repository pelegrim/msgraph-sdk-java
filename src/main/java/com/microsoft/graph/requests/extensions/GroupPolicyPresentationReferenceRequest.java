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
 * The class for the Group Policy Presentation Reference Request.
 */
public class GroupPolicyPresentationReferenceRequest extends BaseRequest implements IGroupPolicyPresentationReferenceRequest {

    /**
     * The request for the GroupPolicyPresentation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentation.class);
    }

    public void delete(final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GroupPolicyPresentation delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyPresentationReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (GroupPolicyPresentationReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyPresentationReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (GroupPolicyPresentationReferenceRequest)this;
    }
    /**
     * Puts the GroupPolicyPresentation
     *
     * @param srcGroupPolicyPresentation the GroupPolicyPresentation reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GroupPolicyPresentation srcGroupPolicyPresentation, final ICallback<GroupPolicyPresentation> callback) {
        send(HttpMethod.PUT, callback, srcGroupPolicyPresentation);
    }

    /**
     * Puts the GroupPolicyPresentation
     *
     * @param srcGroupPolicyPresentation the GroupPolicyPresentation reference to PUT
     * @return the GroupPolicyPresentation
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPolicyPresentation put(GroupPolicyPresentation srcGroupPolicyPresentation) throws ClientException {
        return send(HttpMethod.PUT, srcGroupPolicyPresentation);
    }
}
