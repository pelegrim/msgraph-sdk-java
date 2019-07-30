// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile Collection Request.
 */
public class AndroidDeviceOwnerEnrollmentProfileCollectionRequest extends BaseCollectionRequest<AndroidDeviceOwnerEnrollmentProfileCollectionResponse, IAndroidDeviceOwnerEnrollmentProfileCollectionPage> implements IAndroidDeviceOwnerEnrollmentProfileCollectionRequest {

    /**
     * The request builder for this collection of AndroidDeviceOwnerEnrollmentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidDeviceOwnerEnrollmentProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidDeviceOwnerEnrollmentProfileCollectionResponse.class, IAndroidDeviceOwnerEnrollmentProfileCollectionPage.class);
    }

    public void get(final ICallback<IAndroidDeviceOwnerEnrollmentProfileCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IAndroidDeviceOwnerEnrollmentProfileCollectionPage get() throws ClientException {
        final AndroidDeviceOwnerEnrollmentProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile, final ICallback<AndroidDeviceOwnerEnrollmentProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AndroidDeviceOwnerEnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAndroidDeviceOwnerEnrollmentProfile, callback);
    }

    public AndroidDeviceOwnerEnrollmentProfile post(final AndroidDeviceOwnerEnrollmentProfile newAndroidDeviceOwnerEnrollmentProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AndroidDeviceOwnerEnrollmentProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newAndroidDeviceOwnerEnrollmentProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (AndroidDeviceOwnerEnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (AndroidDeviceOwnerEnrollmentProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value + ""));
        return (AndroidDeviceOwnerEnrollmentProfileCollectionRequest)this;
    }

    public IAndroidDeviceOwnerEnrollmentProfileCollectionPage buildFromResponse(final AndroidDeviceOwnerEnrollmentProfileCollectionResponse response) {
        final IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AndroidDeviceOwnerEnrollmentProfileCollectionPage page = new AndroidDeviceOwnerEnrollmentProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
