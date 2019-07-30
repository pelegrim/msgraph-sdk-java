// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileExportMobileConfigRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Enrollment Profile Export Mobile Config Request Builder.
 */
public interface IEnrollmentProfileExportMobileConfigRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEnrollmentProfileExportMobileConfigRequest
     *
     * @return the IEnrollmentProfileExportMobileConfigRequest instance
     */
    IEnrollmentProfileExportMobileConfigRequest buildRequest();

    /**
     * Creates the IEnrollmentProfileExportMobileConfigRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEnrollmentProfileExportMobileConfigRequest instance
     */
    IEnrollmentProfileExportMobileConfigRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
