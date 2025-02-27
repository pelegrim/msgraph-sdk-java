// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Collection Page.
 */
public class DeviceManagementIntentCollectionPage extends BaseCollectionPage<DeviceManagementIntent, IDeviceManagementIntentCollectionRequestBuilder> implements IDeviceManagementIntentCollectionPage {

    /**
     * A collection page for DeviceManagementIntent
     *
     * @param response the serialized DeviceManagementIntentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceManagementIntentCollectionPage(final DeviceManagementIntentCollectionResponse response, final IDeviceManagementIntentCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
