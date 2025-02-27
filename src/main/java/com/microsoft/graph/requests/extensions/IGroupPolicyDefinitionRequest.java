// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyDefinition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Definition Request.
 */
public interface IGroupPolicyDefinitionRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyDefinition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupPolicyDefinition> callback);

    /**
     * Gets the GroupPolicyDefinition from the service
     *
     * @return the GroupPolicyDefinition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupPolicyDefinition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyDefinition with a source
     *
     * @param sourceGroupPolicyDefinition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyDefinition sourceGroupPolicyDefinition, final ICallback<GroupPolicyDefinition> callback);

    /**
     * Patches this GroupPolicyDefinition with a source
     *
     * @param sourceGroupPolicyDefinition the source object with updates
     * @return the updated GroupPolicyDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinition patch(final GroupPolicyDefinition sourceGroupPolicyDefinition) throws ClientException;

    /**
     * Posts a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyDefinition newGroupPolicyDefinition, final ICallback<GroupPolicyDefinition> callback);

    /**
     * Posts a GroupPolicyDefinition with a new object
     *
     * @param newGroupPolicyDefinition the new object to create
     * @return the created GroupPolicyDefinition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyDefinition post(final GroupPolicyDefinition newGroupPolicyDefinition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyDefinitionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyDefinitionRequest expand(final String value);

}

