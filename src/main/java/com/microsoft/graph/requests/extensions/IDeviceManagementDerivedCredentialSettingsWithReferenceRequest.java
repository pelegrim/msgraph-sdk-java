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
 * The interface for the Device Management Derived Credential Settings With Reference Request.
 */
public interface IDeviceManagementDerivedCredentialSettingsWithReferenceRequest extends IHttpRequest {

    void post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final IJsonBackedObject payload, final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    DeviceManagementDerivedCredentialSettings post(final DeviceManagementDerivedCredentialSettings newDeviceManagementDerivedCredentialSettings, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<DeviceManagementDerivedCredentialSettings> callback);

    DeviceManagementDerivedCredentialSettings get() throws ClientException;

	void delete(final ICallback<DeviceManagementDerivedCredentialSettings> callback);

	void delete() throws ClientException;

	void patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings, final ICallback<DeviceManagementDerivedCredentialSettings> callback);

	DeviceManagementDerivedCredentialSettings patch(final DeviceManagementDerivedCredentialSettings sourceDeviceManagementDerivedCredentialSettings) throws ClientException;

    IDeviceManagementDerivedCredentialSettingsWithReferenceRequest select(final String value);

    IDeviceManagementDerivedCredentialSettingsWithReferenceRequest expand(final String value);

}
