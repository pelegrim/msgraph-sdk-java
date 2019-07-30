// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequest;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequest;
import com.microsoft.graph.models.extensions.DataSharingConsent;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Sharing Consent Request.
 */
public class DataSharingConsentRequest extends BaseRequest implements IDataSharingConsentRequest {
	
    /**
     * The request for the DataSharingConsent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSharingConsentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSharingConsent.class);
    }

    /**
     * Gets the DataSharingConsent from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DataSharingConsent> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DataSharingConsent from the service
     *
     * @return the DataSharingConsent from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataSharingConsent get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DataSharingConsent> callback) {
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
     * Patches this DataSharingConsent with a source
     *
     * @param sourceDataSharingConsent the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DataSharingConsent sourceDataSharingConsent, final ICallback<DataSharingConsent> callback) {
        send(HttpMethod.PATCH, callback, sourceDataSharingConsent);
    }

    /**
     * Patches this DataSharingConsent with a source
     *
     * @param sourceDataSharingConsent the source object with updates
     * @return the updated DataSharingConsent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataSharingConsent patch(final DataSharingConsent sourceDataSharingConsent) throws ClientException {
        return send(HttpMethod.PATCH, sourceDataSharingConsent);
    }

    /**
     * Creates a DataSharingConsent with a new object
     *
     * @param newDataSharingConsent the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DataSharingConsent newDataSharingConsent, final ICallback<DataSharingConsent> callback) {
        send(HttpMethod.POST, callback, newDataSharingConsent);
    }

    /**
     * Creates a DataSharingConsent with a new object
     *
     * @param newDataSharingConsent the new object to create
     * @return the created DataSharingConsent
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataSharingConsent post(final DataSharingConsent newDataSharingConsent) throws ClientException {
        return send(HttpMethod.POST, newDataSharingConsent);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDataSharingConsentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (DataSharingConsentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDataSharingConsentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (DataSharingConsentRequest)this;
     }

}

