// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementComplexSettingInstance;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Complex Setting Instance Request.
 */
public interface IDeviceManagementComplexSettingInstanceRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementComplexSettingInstance> callback);

    /**
     * Gets the DeviceManagementComplexSettingInstance from the service
     *
     * @return the DeviceManagementComplexSettingInstance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingInstance get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementComplexSettingInstance> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance, final ICallback<DeviceManagementComplexSettingInstance> callback);

    /**
     * Patches this DeviceManagementComplexSettingInstance with a source
     *
     * @param sourceDeviceManagementComplexSettingInstance the source object with updates
     * @return the updated DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingInstance patch(final DeviceManagementComplexSettingInstance sourceDeviceManagementComplexSettingInstance) throws ClientException;

    /**
     * Posts a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance, final ICallback<DeviceManagementComplexSettingInstance> callback);

    /**
     * Posts a DeviceManagementComplexSettingInstance with a new object
     *
     * @param newDeviceManagementComplexSettingInstance the new object to create
     * @return the created DeviceManagementComplexSettingInstance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementComplexSettingInstance post(final DeviceManagementComplexSettingInstance newDeviceManagementComplexSettingInstance) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementComplexSettingInstanceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementComplexSettingInstanceRequest expand(final String value);

}

