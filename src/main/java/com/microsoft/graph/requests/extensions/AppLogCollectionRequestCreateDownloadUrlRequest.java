// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AppLogCollectionDownloadDetails;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCreateDownloadUrlRequest;
import com.microsoft.graph.requests.extensions.AppLogCollectionRequestCreateDownloadUrlRequest;

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
 * The class for the App Log Collection Request Create Download Url Request.
 */
public class AppLogCollectionRequestCreateDownloadUrlRequest extends BaseRequest implements IAppLogCollectionRequestCreateDownloadUrlRequest {

    /**
     * The request for this AppLogCollectionRequestCreateDownloadUrl
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AppLogCollectionRequestCreateDownloadUrlRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AppLogCollectionDownloadDetails.class);
    }

    /**
     * Creates the AppLogCollectionRequestCreateDownloadUrl
     *
     * @param callback the callback to be called after success or failure
     */
    public void post(final ICallback<AppLogCollectionDownloadDetails> callback) {
        send(HttpMethod.POST, callback, null);
    }

    /**
     * Creates the AppLogCollectionRequestCreateDownloadUrl
     *
     * @return the AppLogCollectionDownloadDetails
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public AppLogCollectionDownloadDetails post() throws ClientException {
       return send(HttpMethod.POST, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAppLogCollectionRequestCreateDownloadUrlRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (AppLogCollectionRequestCreateDownloadUrlRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAppLogCollectionRequestCreateDownloadUrlRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (AppLogCollectionRequestCreateDownloadUrlRequest)this;
    }

}
