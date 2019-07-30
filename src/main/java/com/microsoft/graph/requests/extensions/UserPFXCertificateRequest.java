// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateRequest;
import com.microsoft.graph.requests.extensions.UserPFXCertificateRequest;
import com.microsoft.graph.models.extensions.UserPFXCertificate;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User PFXCertificate Request.
 */
public class UserPFXCertificateRequest extends BaseRequest implements IUserPFXCertificateRequest {
	
    /**
     * The request for the UserPFXCertificate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserPFXCertificateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserPFXCertificate.class);
    }

    /**
     * Gets the UserPFXCertificate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserPFXCertificate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserPFXCertificate from the service
     *
     * @return the UserPFXCertificate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserPFXCertificate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserPFXCertificate> callback) {
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
     * Patches this UserPFXCertificate with a source
     *
     * @param sourceUserPFXCertificate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserPFXCertificate sourceUserPFXCertificate, final ICallback<UserPFXCertificate> callback) {
        send(HttpMethod.PATCH, callback, sourceUserPFXCertificate);
    }

    /**
     * Patches this UserPFXCertificate with a source
     *
     * @param sourceUserPFXCertificate the source object with updates
     * @return the updated UserPFXCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserPFXCertificate patch(final UserPFXCertificate sourceUserPFXCertificate) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserPFXCertificate);
    }

    /**
     * Creates a UserPFXCertificate with a new object
     *
     * @param newUserPFXCertificate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserPFXCertificate newUserPFXCertificate, final ICallback<UserPFXCertificate> callback) {
        send(HttpMethod.POST, callback, newUserPFXCertificate);
    }

    /**
     * Creates a UserPFXCertificate with a new object
     *
     * @param newUserPFXCertificate the new object to create
     * @return the created UserPFXCertificate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserPFXCertificate post(final UserPFXCertificate newUserPFXCertificate) throws ClientException {
        return send(HttpMethod.POST, newUserPFXCertificate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserPFXCertificateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (UserPFXCertificateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserPFXCertificateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (UserPFXCertificateRequest)this;
     }

}

