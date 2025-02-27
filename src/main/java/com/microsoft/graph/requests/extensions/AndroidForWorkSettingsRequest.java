// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequest;
import com.microsoft.graph.models.extensions.AndroidForWorkSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work Settings Request.
 */
public class AndroidForWorkSettingsRequest extends BaseRequest implements IAndroidForWorkSettingsRequest {
	
    /**
     * The request for the AndroidForWorkSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkSettings.class);
    }

    /**
     * Gets the AndroidForWorkSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidForWorkSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidForWorkSettings from the service
     *
     * @return the AndroidForWorkSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidForWorkSettings> callback) {
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
     * Patches this AndroidForWorkSettings with a source
     *
     * @param sourceAndroidForWorkSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidForWorkSettings sourceAndroidForWorkSettings, final ICallback<AndroidForWorkSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidForWorkSettings);
    }

    /**
     * Patches this AndroidForWorkSettings with a source
     *
     * @param sourceAndroidForWorkSettings the source object with updates
     * @return the updated AndroidForWorkSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkSettings patch(final AndroidForWorkSettings sourceAndroidForWorkSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidForWorkSettings);
    }

    /**
     * Creates a AndroidForWorkSettings with a new object
     *
     * @param newAndroidForWorkSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidForWorkSettings newAndroidForWorkSettings, final ICallback<AndroidForWorkSettings> callback) {
        send(HttpMethod.POST, callback, newAndroidForWorkSettings);
    }

    /**
     * Creates a AndroidForWorkSettings with a new object
     *
     * @param newAndroidForWorkSettings the new object to create
     * @return the created AndroidForWorkSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidForWorkSettings post(final AndroidForWorkSettings newAndroidForWorkSettings) throws ClientException {
        return send(HttpMethod.POST, newAndroidForWorkSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidForWorkSettingsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AndroidForWorkSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidForWorkSettingsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AndroidForWorkSettingsRequest)this;
     }

}

