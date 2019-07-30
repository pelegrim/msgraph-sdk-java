// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequest;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequest;
import com.microsoft.graph.requests.extensions.IDataSharingConsentConsentToDataSharingRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentConsentToDataSharingRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Sharing Consent Request Builder.
 */
public class DataSharingConsentRequestBuilder extends BaseRequestBuilder implements IDataSharingConsentRequestBuilder {

    /**
     * The request builder for the DataSharingConsent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataSharingConsentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDataSharingConsentRequest instance
     */
    public IDataSharingConsentRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDataSharingConsentRequest instance
     */
    public IDataSharingConsentRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DataSharingConsentRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IDataSharingConsentConsentToDataSharingRequestBuilder consentToDataSharing() {
        return new DataSharingConsentConsentToDataSharingRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.consentToDataSharing"), getClient(), null);
    }
}

