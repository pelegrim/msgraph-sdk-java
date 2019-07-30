// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityRequest;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityRequest;
import com.microsoft.graph.models.extensions.ImportedAppleDeviceIdentity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Apple Device Identity Request.
 */
public class ImportedAppleDeviceIdentityRequest extends BaseRequest implements IImportedAppleDeviceIdentityRequest {
	
    /**
     * The request for the ImportedAppleDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ImportedAppleDeviceIdentityRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends ImportedAppleDeviceIdentity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ImportedAppleDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedAppleDeviceIdentityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedAppleDeviceIdentity.class);
    }

    /**
     * Gets the ImportedAppleDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ImportedAppleDeviceIdentity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ImportedAppleDeviceIdentity from the service
     *
     * @return the ImportedAppleDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedAppleDeviceIdentity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ImportedAppleDeviceIdentity> callback) {
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
     * Patches this ImportedAppleDeviceIdentity with a source
     *
     * @param sourceImportedAppleDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ImportedAppleDeviceIdentity sourceImportedAppleDeviceIdentity, final ICallback<ImportedAppleDeviceIdentity> callback) {
        send(HttpMethod.PATCH, callback, sourceImportedAppleDeviceIdentity);
    }

    /**
     * Patches this ImportedAppleDeviceIdentity with a source
     *
     * @param sourceImportedAppleDeviceIdentity the source object with updates
     * @return the updated ImportedAppleDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedAppleDeviceIdentity patch(final ImportedAppleDeviceIdentity sourceImportedAppleDeviceIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceImportedAppleDeviceIdentity);
    }

    /**
     * Creates a ImportedAppleDeviceIdentity with a new object
     *
     * @param newImportedAppleDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity, final ICallback<ImportedAppleDeviceIdentity> callback) {
        send(HttpMethod.POST, callback, newImportedAppleDeviceIdentity);
    }

    /**
     * Creates a ImportedAppleDeviceIdentity with a new object
     *
     * @param newImportedAppleDeviceIdentity the new object to create
     * @return the created ImportedAppleDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedAppleDeviceIdentity post(final ImportedAppleDeviceIdentity newImportedAppleDeviceIdentity) throws ClientException {
        return send(HttpMethod.POST, newImportedAppleDeviceIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IImportedAppleDeviceIdentityRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ImportedAppleDeviceIdentityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IImportedAppleDeviceIdentityRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ImportedAppleDeviceIdentityRequest)this;
     }

}

