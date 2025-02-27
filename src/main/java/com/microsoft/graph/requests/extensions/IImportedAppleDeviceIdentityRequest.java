// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Imported Apple Device Identity Request.
 */
public interface IImportedAppleDeviceIdentityRequest extends IHttpRequest {

    /**
     * Gets the ImportedAppleDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ImportedAppleDeviceIdentity> callback);

    /**
     * Gets the ImportedAppleDeviceIdentity from the service
     *
     * @return the ImportedAppleDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedAppleDeviceIdentity get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ImportedAppleDeviceIdentity> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ImportedAppleDeviceIdentity with a source
     *
     * @param sourceImportedAppleDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ImportedAppleDeviceIdentity sourceImportedAppleDeviceIdentity, final ICallback<ImportedAppleDeviceIdentity> callback);

    /**
     * Patches this ImportedAppleDeviceIdentity with a source
     *
     * @param sourceImportedAppleDeviceIdentity the source object with updates
     * @return the updated ImportedAppleDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedAppleDeviceIdentity patch(final ImportedAppleDeviceIdentity sourceImportedAppleDeviceIdentity) throws ClientException;

    /**
     * Posts a ImportedAppleDeviceIdentity with a new object
     *
     * @param newImportedAppleDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity, final ICallback<ImportedAppleDeviceIdentity> callback);

    /**
     * Posts a ImportedAppleDeviceIdentity with a new object
     *
     * @param newImportedAppleDeviceIdentity the new object to create
     * @return the created ImportedAppleDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ImportedAppleDeviceIdentity post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IImportedAppleDeviceIdentityRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IImportedAppleDeviceIdentityRequest expand(final String value);

}

