// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceConfigurationConflictSummary;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration Conflict Summary Collection Page.
 */
public class DeviceConfigurationConflictSummaryCollectionPage extends BaseCollectionPage<DeviceConfigurationConflictSummary, IDeviceConfigurationConflictSummaryCollectionRequestBuilder> implements IDeviceConfigurationConflictSummaryCollectionPage {

    /**
     * A collection page for DeviceConfigurationConflictSummary
     *
     * @param response the serialized DeviceConfigurationConflictSummaryCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceConfigurationConflictSummaryCollectionPage(final DeviceConfigurationConflictSummaryCollectionResponse response, final IDeviceConfigurationConflictSummaryCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
