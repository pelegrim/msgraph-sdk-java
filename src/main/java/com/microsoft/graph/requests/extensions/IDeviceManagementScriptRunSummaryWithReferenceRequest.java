// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.models.extensions.*;
import com.microsoft.graph.models.generated.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.requests.extensions.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Script Run Summary With Reference Request.
 */
public interface IDeviceManagementScriptRunSummaryWithReferenceRequest extends IHttpRequest {

    void post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary, final IJsonBackedObject payload, final ICallback<DeviceManagementScriptRunSummary> callback);

    DeviceManagementScriptRunSummary post(final DeviceManagementScriptRunSummary newDeviceManagementScriptRunSummary, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<DeviceManagementScriptRunSummary> callback);

    DeviceManagementScriptRunSummary get() throws ClientException;

	void delete(final ICallback<DeviceManagementScriptRunSummary> callback);

	void delete() throws ClientException;

	void patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary, final ICallback<DeviceManagementScriptRunSummary> callback);

	DeviceManagementScriptRunSummary patch(final DeviceManagementScriptRunSummary sourceDeviceManagementScriptRunSummary) throws ClientException;

    IDeviceManagementScriptRunSummaryWithReferenceRequest select(final String value);

    IDeviceManagementScriptRunSummaryWithReferenceRequest expand(final String value);

}
