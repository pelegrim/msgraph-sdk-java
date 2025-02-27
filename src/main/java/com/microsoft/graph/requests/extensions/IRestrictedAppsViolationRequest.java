// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RestrictedAppsViolation;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Restricted Apps Violation Request.
 */
public interface IRestrictedAppsViolationRequest extends IHttpRequest {

    /**
     * Gets the RestrictedAppsViolation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<RestrictedAppsViolation> callback);

    /**
     * Gets the RestrictedAppsViolation from the service
     *
     * @return the RestrictedAppsViolation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedAppsViolation get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<RestrictedAppsViolation> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this RestrictedAppsViolation with a source
     *
     * @param sourceRestrictedAppsViolation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final RestrictedAppsViolation sourceRestrictedAppsViolation, final ICallback<RestrictedAppsViolation> callback);

    /**
     * Patches this RestrictedAppsViolation with a source
     *
     * @param sourceRestrictedAppsViolation the source object with updates
     * @return the updated RestrictedAppsViolation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedAppsViolation patch(final RestrictedAppsViolation sourceRestrictedAppsViolation) throws ClientException;

    /**
     * Posts a RestrictedAppsViolation with a new object
     *
     * @param newRestrictedAppsViolation the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final RestrictedAppsViolation newRestrictedAppsViolation, final ICallback<RestrictedAppsViolation> callback);

    /**
     * Posts a RestrictedAppsViolation with a new object
     *
     * @param newRestrictedAppsViolation the new object to create
     * @return the created RestrictedAppsViolation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    RestrictedAppsViolation post(final RestrictedAppsViolation newRestrictedAppsViolation) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IRestrictedAppsViolationRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IRestrictedAppsViolationRequest expand(final String value);

}

