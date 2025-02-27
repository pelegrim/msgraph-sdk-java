// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Collection Page.
 */
public class ImportedDeviceIdentityCollectionPage extends BaseCollectionPage<ImportedDeviceIdentity, IImportedDeviceIdentityCollectionRequestBuilder> implements IImportedDeviceIdentityCollectionPage {

    /**
     * A collection page for ImportedDeviceIdentity
     *
     * @param response the serialized ImportedDeviceIdentityCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ImportedDeviceIdentityCollectionPage(final ImportedDeviceIdentityCollectionResponse response, final IImportedDeviceIdentityCollectionRequestBuilder builder) {
        super(response.value, builder);
    }
}
