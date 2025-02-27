// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Managed Store Account Enterprise Settings Request Signup Url Request.
 */
public interface IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest {

    void post(final ICallback<String> callback);

    String post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest select(final String value) ;

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest top(final int value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequest expand(final String value);

}
