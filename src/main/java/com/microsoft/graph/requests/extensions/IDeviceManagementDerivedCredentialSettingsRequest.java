// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementDerivedCredentialSettings;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Derived Credential Settings Request.
 */
public interface IDeviceManagementDerivedCredentialSettingsRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    /**
     * Gets the DeviceManagementDerivedCredentialSettings from the service
     *
     * @return the DeviceManagementDerivedCredentialSettings from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementDerivedCredentialSettings get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings, final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    /**
     * Patches this DeviceManagementDerivedCredentialSettings with a source
     *
     * @param sourceDeviceManagementDerivedCredentialSettings the source object with updates
     * @return the updated DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementDerivedCredentialSettings patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings) throws ClientException;

    /**
     * Posts a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    /**
     * Posts a DeviceManagementDerivedCredentialSettings with a new object
     *
     * @param newDeviceManagementDerivedCredentialSettings the new object to create
     * @return the created DeviceManagementDerivedCredentialSettings
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementDerivedCredentialSettings post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementDerivedCredentialSettingsRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementDerivedCredentialSettingsRequest expand(final String value);

}

