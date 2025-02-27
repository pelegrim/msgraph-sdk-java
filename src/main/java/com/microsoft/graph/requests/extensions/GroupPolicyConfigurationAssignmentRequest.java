// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationAssignmentRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationAssignmentRequest;
import com.microsoft.graph.models.extensions.GroupPolicyConfigurationAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Configuration Assignment Request.
 */
public class GroupPolicyConfigurationAssignmentRequest extends BaseRequest implements IGroupPolicyConfigurationAssignmentRequest {
	
    /**
     * The request for the GroupPolicyConfigurationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyConfigurationAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyConfigurationAssignment.class);
    }

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyConfigurationAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyConfigurationAssignment from the service
     *
     * @return the GroupPolicyConfigurationAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfigurationAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyConfigurationAssignment> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment, final ICallback<GroupPolicyConfigurationAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyConfigurationAssignment);
    }

    /**
     * Patches this GroupPolicyConfigurationAssignment with a source
     *
     * @param sourceGroupPolicyConfigurationAssignment the source object with updates
     * @return the updated GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfigurationAssignment patch(final GroupPolicyConfigurationAssignment sourceGroupPolicyConfigurationAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment, final ICallback<GroupPolicyConfigurationAssignment> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Creates a GroupPolicyConfigurationAssignment with a new object
     *
     * @param newGroupPolicyConfigurationAssignment the new object to create
     * @return the created GroupPolicyConfigurationAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyConfigurationAssignment post(final GroupPolicyConfigurationAssignment newGroupPolicyConfigurationAssignment) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyConfigurationAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyConfigurationAssignmentRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (GroupPolicyConfigurationAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyConfigurationAssignmentRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (GroupPolicyConfigurationAssignmentRequest)this;
     }

}

