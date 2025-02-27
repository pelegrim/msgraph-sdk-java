// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementScriptAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Script Assignment Request.
 */
public interface IDeviceManagementScriptAssignmentRequest extends IHttpRequest {

    /**
     * Gets the DeviceManagementScriptAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<DeviceManagementScriptAssignment> callback);

    /**
     * Gets the DeviceManagementScriptAssignment from the service
     *
     * @return the DeviceManagementScriptAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<DeviceManagementScriptAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DeviceManagementScriptAssignment with a source
     *
     * @param sourceDeviceManagementScriptAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DeviceManagementScriptAssignment sourceDeviceManagementScriptAssignment, final ICallback<DeviceManagementScriptAssignment> callback);

    /**
     * Patches this DeviceManagementScriptAssignment with a source
     *
     * @param sourceDeviceManagementScriptAssignment the source object with updates
     * @return the updated DeviceManagementScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptAssignment patch(final DeviceManagementScriptAssignment sourceDeviceManagementScriptAssignment) throws ClientException;

    /**
     * Posts a DeviceManagementScriptAssignment with a new object
     *
     * @param newDeviceManagementScriptAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DeviceManagementScriptAssignment newDeviceManagementScriptAssignment, final ICallback<DeviceManagementScriptAssignment> callback);

    /**
     * Posts a DeviceManagementScriptAssignment with a new object
     *
     * @param newDeviceManagementScriptAssignment the new object to create
     * @return the created DeviceManagementScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DeviceManagementScriptAssignment post(final DeviceManagementScriptAssignment newDeviceManagementScriptAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementScriptAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementScriptAssignmentRequest expand(final String value);

}

