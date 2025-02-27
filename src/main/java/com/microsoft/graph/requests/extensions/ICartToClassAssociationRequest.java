// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CartToClassAssociation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cart To Class Association Request.
 */
public interface ICartToClassAssociationRequest extends IHttpRequest {

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<CartToClassAssociation> callback);

    /**
     * Gets the CartToClassAssociation from the service
     *
     * @return the CartToClassAssociation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CartToClassAssociation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<CartToClassAssociation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CartToClassAssociation sourceCartToClassAssociation, final ICallback<CartToClassAssociation> callback);

    /**
     * Patches this CartToClassAssociation with a source
     *
     * @param sourceCartToClassAssociation the source object with updates
     * @return the updated CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CartToClassAssociation patch(final CartToClassAssociation sourceCartToClassAssociation) throws ClientException;

    /**
     * Posts a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CartToClassAssociation newCartToClassAssociation, final ICallback<CartToClassAssociation> callback);

    /**
     * Posts a CartToClassAssociation with a new object
     *
     * @param newCartToClassAssociation the new object to create
     * @return the created CartToClassAssociation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CartToClassAssociation post(final CartToClassAssociation newCartToClassAssociation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICartToClassAssociationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICartToClassAssociationRequest expand(final String value);

}

