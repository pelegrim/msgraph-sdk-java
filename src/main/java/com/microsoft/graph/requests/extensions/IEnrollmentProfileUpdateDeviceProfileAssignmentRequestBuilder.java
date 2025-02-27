// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileUpdateDeviceProfileAssignmentRequest;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Enrollment Profile Update Device Profile Assignment Request Builder.
 */
public interface IEnrollmentProfileUpdateDeviceProfileAssignmentRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest
     *
     * @return the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest instance
     */
    IEnrollmentProfileUpdateDeviceProfileAssignmentRequest buildRequest();

    /**
     * Creates the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IEnrollmentProfileUpdateDeviceProfileAssignmentRequest instance
     */
    IEnrollmentProfileUpdateDeviceProfileAssignmentRequest buildRequest(final java.util.List<? extends Option> requestOptions);
}
