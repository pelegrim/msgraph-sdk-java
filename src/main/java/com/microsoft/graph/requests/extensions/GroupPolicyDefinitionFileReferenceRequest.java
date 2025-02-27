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
 * The class for the Group Policy Definition File Reference Request.
 */
public class GroupPolicyDefinitionFileReferenceRequest extends BaseRequest implements IGroupPolicyDefinitionFileReferenceRequest {

    /**
     * The request for the GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionFileReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionFile.class);
    }

    public void delete(final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public GroupPolicyDefinitionFile delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (GroupPolicyDefinitionFileReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (GroupPolicyDefinitionFileReferenceRequest)this;
    }
    /**
     * Puts the GroupPolicyDefinitionFile
     *
     * @param srcGroupPolicyDefinitionFile the GroupPolicyDefinitionFile reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(GroupPolicyDefinitionFile srcGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.PUT, callback, srcGroupPolicyDefinitionFile);
    }

    /**
     * Puts the GroupPolicyDefinitionFile
     *
     * @param srcGroupPolicyDefinitionFile the GroupPolicyDefinitionFile reference to PUT
     * @return the GroupPolicyDefinitionFile
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public GroupPolicyDefinitionFile put(GroupPolicyDefinitionFile srcGroupPolicyDefinitionFile) throws ClientException {
        return send(HttpMethod.PUT, srcGroupPolicyDefinitionFile);
    }
}
