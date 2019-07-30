// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryRequest;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Intent Setting Category Request Builder.
 */
public interface IDeviceManagementIntentSettingCategoryRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceManagementIntentSettingCategoryRequest instance
     */
    IDeviceManagementIntentSettingCategoryRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentSettingCategoryRequest instance
     */
    IDeviceManagementIntentSettingCategoryRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    IDeviceManagementSettingInstanceCollectionRequestBuilder settings();

    IDeviceManagementSettingInstanceRequestBuilder settings(final String id);

}
