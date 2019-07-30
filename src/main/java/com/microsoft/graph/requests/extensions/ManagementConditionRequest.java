// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IManagementConditionRequest;
import com.microsoft.graph.requests.extensions.ManagementConditionRequest;
import com.microsoft.graph.models.extensions.ManagementCondition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Management Condition Request.
 */
public class ManagementConditionRequest extends BaseRequest implements IManagementConditionRequest {
	
    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ManagementConditionRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ManagementCondition> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagementConditionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagementCondition.class);
    }

    /**
     * Gets the ManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ManagementCondition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ManagementCondition from the service
     *
     * @return the ManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementCondition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ManagementCondition> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ManagementCondition sourceManagementCondition, final ICallback<ManagementCondition> callback) {
        send(HttpMethod.PATCH, callback, sourceManagementCondition);
    }

    /**
     * Patches this ManagementCondition with a source
     *
     * @param sourceManagementCondition the source object with updates
     * @return the updated ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementCondition patch(final ManagementCondition sourceManagementCondition) throws ClientException {
        return send(HttpMethod.PATCH, sourceManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ManagementCondition newManagementCondition, final ICallback<ManagementCondition> callback) {
        send(HttpMethod.POST, callback, newManagementCondition);
    }

    /**
     * Creates a ManagementCondition with a new object
     *
     * @param newManagementCondition the new object to create
     * @return the created ManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ManagementCondition post(final ManagementCondition newManagementCondition) throws ClientException {
        return send(HttpMethod.POST, newManagementCondition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IManagementConditionRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ManagementConditionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IManagementConditionRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ManagementConditionRequest)this;
     }

}

