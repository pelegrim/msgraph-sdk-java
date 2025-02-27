// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Intune Branding Profile Request.
 */
public interface IIntuneBrandingProfileRequest extends IHttpRequest {

    /**
     * Gets the IntuneBrandingProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<IntuneBrandingProfile> callback);

    /**
     * Gets the IntuneBrandingProfile from the service
     *
     * @return the IntuneBrandingProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IntuneBrandingProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<IntuneBrandingProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this IntuneBrandingProfile with a source
     *
     * @param sourceIntuneBrandingProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final IntuneBrandingProfile sourceIntuneBrandingProfile, final ICallback<IntuneBrandingProfile> callback);

    /**
     * Patches this IntuneBrandingProfile with a source
     *
     * @param sourceIntuneBrandingProfile the source object with updates
     * @return the updated IntuneBrandingProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IntuneBrandingProfile patch(final IntuneBrandingProfile sourceIntuneBrandingProfile) throws ClientException;

    /**
     * Posts a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final IntuneBrandingProfile newIntuneBrandingProfile, final ICallback<IntuneBrandingProfile> callback);

    /**
     * Posts a IntuneBrandingProfile with a new object
     *
     * @param newIntuneBrandingProfile the new object to create
     * @return the created IntuneBrandingProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    IntuneBrandingProfile post(final IntuneBrandingProfile newIntuneBrandingProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IIntuneBrandingProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IIntuneBrandingProfileRequest expand(final String value);

}

