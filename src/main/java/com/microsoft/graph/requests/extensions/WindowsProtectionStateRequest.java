// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsProtectionStateRequest;
import com.microsoft.graph.requests.extensions.WindowsProtectionStateRequest;
import com.microsoft.graph.models.extensions.WindowsProtectionState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Protection State Request.
 */
public class WindowsProtectionStateRequest extends BaseRequest implements IWindowsProtectionStateRequest {
	
    /**
     * The request for the WindowsProtectionState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsProtectionStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsProtectionState.class);
    }

    /**
     * Gets the WindowsProtectionState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsProtectionState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsProtectionState from the service
     *
     * @return the WindowsProtectionState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsProtectionState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsProtectionState> callback) {
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
     * Patches this WindowsProtectionState with a source
     *
     * @param sourceWindowsProtectionState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsProtectionState sourceWindowsProtectionState, final ICallback<WindowsProtectionState> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsProtectionState);
    }

    /**
     * Patches this WindowsProtectionState with a source
     *
     * @param sourceWindowsProtectionState the source object with updates
     * @return the updated WindowsProtectionState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsProtectionState patch(final WindowsProtectionState sourceWindowsProtectionState) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsProtectionState newWindowsProtectionState, final ICallback<WindowsProtectionState> callback) {
        send(HttpMethod.POST, callback, newWindowsProtectionState);
    }

    /**
     * Creates a WindowsProtectionState with a new object
     *
     * @param newWindowsProtectionState the new object to create
     * @return the created WindowsProtectionState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsProtectionState post(final WindowsProtectionState newWindowsProtectionState) throws ClientException {
        return send(HttpMethod.POST, newWindowsProtectionState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsProtectionStateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (WindowsProtectionStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsProtectionStateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (WindowsProtectionStateRequest)this;
     }

}

