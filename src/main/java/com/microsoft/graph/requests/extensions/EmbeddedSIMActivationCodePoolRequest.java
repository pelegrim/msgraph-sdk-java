// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequest;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequest;
import com.microsoft.graph.models.extensions.EmbeddedSIMActivationCodePool;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Embedded SIMActivation Code Pool Request.
 */
public class EmbeddedSIMActivationCodePoolRequest extends BaseRequest implements IEmbeddedSIMActivationCodePoolRequest {
	
    /**
     * The request for the EmbeddedSIMActivationCodePool
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmbeddedSIMActivationCodePoolRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmbeddedSIMActivationCodePool.class);
    }

    /**
     * Gets the EmbeddedSIMActivationCodePool from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EmbeddedSIMActivationCodePool> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EmbeddedSIMActivationCodePool from the service
     *
     * @return the EmbeddedSIMActivationCodePool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmbeddedSIMActivationCodePool get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EmbeddedSIMActivationCodePool> callback) {
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
     * Patches this EmbeddedSIMActivationCodePool with a source
     *
     * @param sourceEmbeddedSIMActivationCodePool the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EmbeddedSIMActivationCodePool sourceEmbeddedSIMActivationCodePool, final ICallback<EmbeddedSIMActivationCodePool> callback) {
        send(HttpMethod.PATCH, callback, sourceEmbeddedSIMActivationCodePool);
    }

    /**
     * Patches this EmbeddedSIMActivationCodePool with a source
     *
     * @param sourceEmbeddedSIMActivationCodePool the source object with updates
     * @return the updated EmbeddedSIMActivationCodePool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmbeddedSIMActivationCodePool patch(final EmbeddedSIMActivationCodePool sourceEmbeddedSIMActivationCodePool) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool, final ICallback<EmbeddedSIMActivationCodePool> callback) {
        send(HttpMethod.POST, callback, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Creates a EmbeddedSIMActivationCodePool with a new object
     *
     * @param newEmbeddedSIMActivationCodePool the new object to create
     * @return the created EmbeddedSIMActivationCodePool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmbeddedSIMActivationCodePool post(final EmbeddedSIMActivationCodePool newEmbeddedSIMActivationCodePool) throws ClientException {
        return send(HttpMethod.POST, newEmbeddedSIMActivationCodePool);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEmbeddedSIMActivationCodePoolRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (EmbeddedSIMActivationCodePoolRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEmbeddedSIMActivationCodePoolRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (EmbeddedSIMActivationCodePoolRequest)this;
     }

}

