// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementSettingCategory;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Setting Category Collection Page.
 */
public class DeviceManagementSettingCategoryCollectionPage extends BaseCollectionPage<DeviceManagementSettingCategory, IDeviceManagementSettingCategoryCollectionRequestBuilder> implements IDeviceManagementSettingCategoryCollectionPage {

    /**
     * A collection page for DeviceManagementSettingCategory
     *
     * @param response the serialized DeviceManagementSettingCategoryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementSettingCategoryCollectionPage(final DeviceManagementSettingCategoryCollectionResponse response, final IDeviceManagementSettingCategoryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
