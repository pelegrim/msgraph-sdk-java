// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequest;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsCompleteSignupRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsSyncAppsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsUnbindRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android Managed Store Account Enterprise Settings Request Builder.
 */
public interface IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsRequest instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsRequest instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequest buildRequest(final java.util.List<? extends Option> requestOptions);

    IAndroidManagedStoreAccountEnterpriseSettingsRequestSignupUrlRequestBuilder requestSignupUrl(final String hostName);
    IAndroidManagedStoreAccountEnterpriseSettingsCompleteSignupRequestBuilder completeSignup(final String enterpriseToken);
    IAndroidManagedStoreAccountEnterpriseSettingsSyncAppsRequestBuilder syncApps();
    IAndroidManagedStoreAccountEnterpriseSettingsUnbindRequestBuilder unbind();
    IAndroidManagedStoreAccountEnterpriseSettingsCreateGooglePlayWebTokenRequestBuilder createGooglePlayWebToken(final String parentUri);
    IAndroidManagedStoreAccountEnterpriseSettingsSetAndroidDeviceOwnerFullyManagedEnrollmentStateRequestBuilder setAndroidDeviceOwnerFullyManagedEnrollmentState(final Boolean enabled);

}
