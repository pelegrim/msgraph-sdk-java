// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequest;
import com.microsoft.graph.requests.extensions.CartToClassAssociationRequest;
import com.microsoft.graph.models.extensions.CartToClassAssociation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cart To Class Association Request.
 */
public class CartToClassAssociationRequest extends BaseRequest implements ICartToClassAssociationRequest {
	
    /**
     * The request for the CartToClassAssociation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CartToClassAssociationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, CartToClassAssociation.class);
    }

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<CartToClassAssociation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @return the CartToClassAssociation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CartToClassAssociation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<CartToClassAssociation> callback) {
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
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final CartToClassAssociation sourceCartToClassAssociation, final ICallback<CartToClassAssociation> callback) {
        send(HttpMethod.PATCH, callback, sourceCartToClassAssociation);
    }

    /**
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @return the updated CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CartToClassAssociation patch(final CartToClassAssociation sourceCartToClassAssociation) throws ClientException {
        return send(HttpMethod.PATCH, sourceCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final CartToClassAssociation newCartToClassAssociation, final ICallback<CartToClassAssociation> callback) {
        send(HttpMethod.POST, callback, newCartToClassAssociation);
    }

    /**
     * Creates a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @return the created CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public CartToClassAssociation post(final CartToClassAssociation newCartToClassAssociation) throws ClientException {
        return send(HttpMethod.POST, newCartToClassAssociation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICartToClassAssociationRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (CartToClassAssociationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICartToClassAssociationRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (CartToClassAssociationRequest)this;
     }

}

