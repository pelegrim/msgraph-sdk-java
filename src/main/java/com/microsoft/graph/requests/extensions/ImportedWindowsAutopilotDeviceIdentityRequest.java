// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequest;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityRequest;
import com.microsoft.graph.models.extensions.ImportedWindowsAutopilotDeviceIdentity;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Request.
 */
public class ImportedWindowsAutopilotDeviceIdentityRequest extends BaseRequest implements IImportedWindowsAutopilotDeviceIdentityRequest {
	
    /**
     * The request for the ImportedWindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedWindowsAutopilotDeviceIdentityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedWindowsAutopilotDeviceIdentity.class);
    }

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ImportedWindowsAutopilotDeviceIdentity from the service
     *
     * @return the ImportedWindowsAutopilotDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedWindowsAutopilotDeviceIdentity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback) {
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
     * Patches this ImportedWindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ImportedWindowsAutopilotDeviceIdentity sourceImportedWindowsAutopilotDeviceIdentity, final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.PATCH, callback, sourceImportedWindowsAutopilotDeviceIdentity);
    }

    /**
     * Patches this ImportedWindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceImportedWindowsAutopilotDeviceIdentity the source object with updates
     * @return the updated ImportedWindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedWindowsAutopilotDeviceIdentity patch(final ImportedWindowsAutopilotDeviceIdentity sourceImportedWindowsAutopilotDeviceIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceImportedWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a ImportedWindowsAutopilotDeviceIdentity with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ImportedWindowsAutopilotDeviceIdentity newImportedWindowsAutopilotDeviceIdentity, final ICallback<ImportedWindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.POST, callback, newImportedWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a ImportedWindowsAutopilotDeviceIdentity with a new object
     *
     * @param newImportedWindowsAutopilotDeviceIdentity the new object to create
     * @return the created ImportedWindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedWindowsAutopilotDeviceIdentity post(final ImportedWindowsAutopilotDeviceIdentity newImportedWindowsAutopilotDeviceIdentity) throws ClientException {
        return send(HttpMethod.POST, newImportedWindowsAutopilotDeviceIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IImportedWindowsAutopilotDeviceIdentityRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (ImportedWindowsAutopilotDeviceIdentityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IImportedWindowsAutopilotDeviceIdentityRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (ImportedWindowsAutopilotDeviceIdentityRequest)this;
     }

}

