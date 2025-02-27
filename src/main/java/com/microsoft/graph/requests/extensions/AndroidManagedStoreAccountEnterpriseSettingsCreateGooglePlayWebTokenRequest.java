// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenBody;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Managed Store Account Enterprise Settings Create Google Play Web Token Request.
 */
public class AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest extends BaseRequest implements IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest {
    protected final AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenBody body;

    /**
     * The request for this AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebToken
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, String.class);
        body = new AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenBody();
    }

    public void post(final ICallback<String> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public String post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest top(final int value) {
        getQueryOptions().add(new QueryOption("$top", value+""));
        return (AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (AndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequest)this;
    }

}
