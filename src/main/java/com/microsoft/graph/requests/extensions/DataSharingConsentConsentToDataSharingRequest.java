// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DataSharingConsent;
import com.microsoft.graph.requests.extensions.IDataSharingConsentConsentToDataSharingRequest;
import com.microsoft.graph.requests.extensions.DataSharingConsentConsentToDataSharingRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Sharing Consent Consent To Data Sharing Request.
 */
public class DataSharingConsentConsentToDataSharingRequest extends BaseRequest implements IDataSharingConsentConsentToDataSharingRequest {

    /**
     * The request for this DataSharingConsentConsentToDataSharing
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSharingConsentConsentToDataSharingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataSharingConsent.class);
    }

    /**
     * Creates the DataSharingConsentConsentToDataSharing
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<DataSharingConsent> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the DataSharingConsentConsentToDataSharing
     *
     * @return the DataSharingConsent
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DataSharingConsent post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDataSharingConsentConsentToDataSharingRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (DataSharingConsentConsentToDataSharingRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDataSharingConsentConsentToDataSharingRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (DataSharingConsentConsentToDataSharingRequest)this;
    }

}
