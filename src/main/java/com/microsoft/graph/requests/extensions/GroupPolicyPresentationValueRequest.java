// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyPresentationValueRequest;
import com.microsoft.graph.requests.extensions.GroupPolicyPresentationValueRequest;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValue;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value Request.
 */
public class GroupPolicyPresentationValueRequest extends BaseRequest implements IGroupPolicyPresentationValueRequest {
	
    /**
     * The request for the GroupPolicyPresentationValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public GroupPolicyPresentationValueRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends Option> requestOptions,
            final Class<? extends GroupPolicyPresentationValue> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the GroupPolicyPresentationValue
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationValueRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationValue.class);
    }

    /**
     * Gets the GroupPolicyPresentationValue from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyPresentationValue> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationValue from the service
     *
     * @return the GroupPolicyPresentationValue from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValue get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyPresentationValue> callback) {
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
     * Patches this GroupPolicyPresentationValue with a source
     *
     * @param sourceGroupPolicyPresentationValue the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentationValue sourceGroupPolicyPresentationValue, final ICallback<GroupPolicyPresentationValue> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationValue);
    }

    /**
     * Patches this GroupPolicyPresentationValue with a source
     *
     * @param sourceGroupPolicyPresentationValue the source object with updates
     * @return the updated GroupPolicyPresentationValue
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValue patch(final GroupPolicyPresentationValue sourceGroupPolicyPresentationValue) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationValue);
    }

    /**
     * Creates a GroupPolicyPresentationValue with a new object
     *
     * @param newGroupPolicyPresentationValue the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentationValue newGroupPolicyPresentationValue, final ICallback<GroupPolicyPresentationValue> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationValue);
    }

    /**
     * Creates a GroupPolicyPresentationValue with a new object
     *
     * @param newGroupPolicyPresentationValue the new object to create
     * @return the created GroupPolicyPresentationValue
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValue post(final GroupPolicyPresentationValue newGroupPolicyPresentationValue) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationValue);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationValueRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (GroupPolicyPresentationValueRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationValueRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (GroupPolicyPresentationValueRequest)this;
     }

}

