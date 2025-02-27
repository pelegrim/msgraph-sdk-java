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
 * The class for the Imported Apple Device Identity Import Apple Device Identity List Collection Request.
 */
public class ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest extends BaseCollectionRequest<ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse, IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage> implements IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest {


    protected final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListBody body;


    /**
     * The request for this ImportedAppleDeviceIdentityImportAppleDeviceIdentityList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse.class, IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage.class);
        body = new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListBody();
    }


    public void post(final ICallback<IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage post() throws ClientException {
        final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage buildFromResponse(final ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionResponse response) {
        final IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, /* importedAppleDeviceIdentities */ null, /* overwriteImportedDeviceIdentities */ null);
        } else {
            builder = null;
        }
        final IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage page = new ImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest select(final String value) {
        addQueryOption(new QueryOption("$select", value));
        return (IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest top(final int value) {
        addQueryOption(new QueryOption("$top", value+""));
        return (IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest expand(final String value) {
        addQueryOption(new QueryOption("$expand", value));
        return (IImportedAppleDeviceIdentityImportAppleDeviceIdentityListCollectionRequest)this;
    }

}
