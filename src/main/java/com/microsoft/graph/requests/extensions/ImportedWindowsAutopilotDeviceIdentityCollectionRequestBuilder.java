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
 * The class for the Imported Windows Autopilot Device Identity Collection Request Builder.
 */
public class ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder extends BaseRequestBuilder implements IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder {

    /**
     * The request builder for this collection of ImportedWindowsAutopilotDeviceIdentityUpload
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IImportedWindowsAutopilotDeviceIdentityCollectionRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new ImportedWindowsAutopilotDeviceIdentityCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IImportedWindowsAutopilotDeviceIdentityRequestBuilder byId(final String id) {
        return new ImportedWindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder importList(final java.util.List<ImportedWindowsAutopilotDeviceIdentity> importedWindowsAutopilotDeviceIdentities) {
        return new ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.import"), getClient(), null, importedWindowsAutopilotDeviceIdentities);
    }
}
