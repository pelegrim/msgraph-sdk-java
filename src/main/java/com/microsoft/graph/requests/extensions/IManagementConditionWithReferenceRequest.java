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
 * The interface for the Management Condition With Reference Request.
 */
public interface IManagementConditionWithReferenceRequest extends IHttpRequest {

    void post(final ManagementCondition newManagementCondition, final IJsonBackedObject payload, final ICallback<ManagementCondition> callback);

    ManagementCondition post(final ManagementCondition newManagementCondition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<ManagementCondition> callback);

    ManagementCondition get() throws ClientException;

	void delete(final ICallback<ManagementCondition> callback);

	void delete() throws ClientException;

	void patch(final ManagementCondition sourceManagementCondition, final ICallback<ManagementCondition> callback);

	ManagementCondition patch(final ManagementCondition sourceManagementCondition) throws ClientException;

    IManagementConditionWithReferenceRequest select(final String value);

    IManagementConditionWithReferenceRequest expand(final String value);

}
