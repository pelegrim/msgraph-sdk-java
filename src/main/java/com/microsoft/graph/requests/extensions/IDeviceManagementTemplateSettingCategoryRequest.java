// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementTemplateSettingCategory;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Template Setting Category Request.
 */
public interface IDeviceManagementTemplateSettingCategoryRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementTemplateSettingCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementTemplateSettingCategory> callback);

    /**
     * Gets the DeviceManagementTemplateSettingCategory from the service
     *
     * @return the DeviceManagementTemplateSettingCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTemplateSettingCategory get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementTemplateSettingCategory> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementTemplateSettingCategory with a source
     *
     * @param sourceDeviceManagementTemplateSettingCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementTemplateSettingCategory sourceDeviceManagementTemplateSettingCategory, final ICallback<DeviceManagementTemplateSettingCategory> callback);

    /**
     * Patches this DeviceManagementTemplateSettingCategory with a source
     *
     * @param sourceDeviceManagementTemplateSettingCategory the source object with updates
     * @return the updated DeviceManagementTemplateSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTemplateSettingCategory patch(final DeviceManagementTemplateSettingCategory sourceDeviceManagementTemplateSettingCategory) throws ClientException;

    /**
     * Posts a DeviceManagementTemplateSettingCategory with a new object
     *
     * @param newDeviceManagementTemplateSettingCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementTemplateSettingCategory newDeviceManagementTemplateSettingCategory, final ICallback<DeviceManagementTemplateSettingCategory> callback);

    /**
     * Posts a DeviceManagementTemplateSettingCategory with a new object
     *
     * @param newDeviceManagementTemplateSettingCategory the new object to create
     * @return the created DeviceManagementTemplateSettingCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementTemplateSettingCategory post(final DeviceManagementTemplateSettingCategory newDeviceManagementTemplateSettingCategory) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementTemplateSettingCategoryRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementTemplateSettingCategoryRequest expand(final String value);

}

