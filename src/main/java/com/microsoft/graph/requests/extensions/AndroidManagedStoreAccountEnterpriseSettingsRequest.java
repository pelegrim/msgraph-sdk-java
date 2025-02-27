// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequest;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsRequest;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Request.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsRequest extends BaseRequest implements IAndroidManagedStoreAccountEnterpriseSettingsRequest {
	
    /**
     * The request for the AndroidManagedStoreAccountEnterpriseSettings
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAccountEnterpriseSettingsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidManagedStoreAccountEnterpriseSettings.class);
    }

    /**
     * Gets the AndroidManagedStoreAccountEnterpriseSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AndroidManagedStoreAccountEnterpriseSettings> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidManagedStoreAccountEnterpriseSettings from the service
     *
     * @return the AndroidManagedStoreAccountEnterpriseSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedStoreAccountEnterpriseSettings get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AndroidManagedStoreAccountEnterpriseSettings> callback) {
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
     * Patches this AndroidManagedStoreAccountEnterpriseSettings with a source
     *
     * @param sourceAndroidManagedStoreAccountEnterpriseSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AndroidManagedStoreAccountEnterpriseSettings sourceAndroidManagedStoreAccountEnterpriseSettings, final ICallback<AndroidManagedStoreAccountEnterpriseSettings> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidManagedStoreAccountEnterpriseSettings);
    }

    /**
     * Patches this AndroidManagedStoreAccountEnterpriseSettings with a source
     *
     * @param sourceAndroidManagedStoreAccountEnterpriseSettings the source object with updates
     * @return the updated AndroidManagedStoreAccountEnterpriseSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedStoreAccountEnterpriseSettings patch(final AndroidManagedStoreAccountEnterpriseSettings sourceAndroidManagedStoreAccountEnterpriseSettings) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidManagedStoreAccountEnterpriseSettings);
    }

    /**
     * Creates a AndroidManagedStoreAccountEnterpriseSettings with a new object
     *
     * @param newAndroidManagedStoreAccountEnterpriseSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AndroidManagedStoreAccountEnterpriseSettings newAndroidManagedStoreAccountEnterpriseSettings, final ICallback<AndroidManagedStoreAccountEnterpriseSettings> callback) {
        send(HttpMethod.POST, callback, newAndroidManagedStoreAccountEnterpriseSettings);
    }

    /**
     * Creates a AndroidManagedStoreAccountEnterpriseSettings with a new object
     *
     * @param newAndroidManagedStoreAccountEnterpriseSettings the new object to create
     * @return the created AndroidManagedStoreAccountEnterpriseSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AndroidManagedStoreAccountEnterpriseSettings post(final AndroidManagedStoreAccountEnterpriseSettings newAndroidManagedStoreAccountEnterpriseSettings) throws ClientException {
        return send(HttpMethod.POST, newAndroidManagedStoreAccountEnterpriseSettings);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAndroidManagedStoreAccountEnterpriseSettingsRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AndroidManagedStoreAccountEnterpriseSettingsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAndroidManagedStoreAccountEnterpriseSettingsRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AndroidManagedStoreAccountEnterpriseSettingsRequest)this;
     }

}

