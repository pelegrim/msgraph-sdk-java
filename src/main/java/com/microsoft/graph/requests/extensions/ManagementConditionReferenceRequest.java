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
 * The class for the Management Condition Reference Request.
 */
public class ManagementConditionReferenceRequest extends BaseRequest implements IManagementConditionReferenceRequest {

    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementCondition.class);
    }

    public void delete(final ICallback<ManagementCondition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    public ManagementCondition delete() throws ClientException {
       return send(HttpMethod.DELETE, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagementConditionReferenceRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (ManagementConditionReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagementConditionReferenceRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (ManagementConditionReferenceRequest)this;
    }
    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition reference to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(ManagementCondition srcManagementCondition, final ICallback<ManagementCondition> callback) {
        send(HttpMethod.PUT, callback, srcManagementCondition);
    }

    /**
     * Puts the ManagementCondition
     *
     * @param srcManagementCondition the ManagementCondition reference to PUT
     * @return the ManagementCondition
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public ManagementCondition put(ManagementCondition srcManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, srcManagementCondition);
    }
}
