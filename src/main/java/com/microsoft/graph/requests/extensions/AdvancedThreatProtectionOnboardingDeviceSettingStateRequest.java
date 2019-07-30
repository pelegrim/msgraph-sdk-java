// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingDeviceSettingStateRequest;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingDeviceSettingStateRequest;
import com.microsoft.graph.models.extensions.AdvancedThreatProtectionOnboardingDeviceSettingState;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.options.Option;
import com.microsoft.graph.options.QueryOption;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Advanced Threat Protection Onboarding Device Setting State Request.
 */
public class AdvancedThreatProtectionOnboardingDeviceSettingStateRequest extends BaseRequest implements IAdvancedThreatProtectionOnboardingDeviceSettingStateRequest {
	
    /**
     * The request for the AdvancedThreatProtectionOnboardingDeviceSettingState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingStateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions, AdvancedThreatProtectionOnboardingDeviceSettingState.class);
    }

    /**
     * Gets the AdvancedThreatProtectionOnboardingDeviceSettingState from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<AdvancedThreatProtectionOnboardingDeviceSettingState> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AdvancedThreatProtectionOnboardingDeviceSettingState from the service
     *
     * @return the AdvancedThreatProtectionOnboardingDeviceSettingState from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingState get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<AdvancedThreatProtectionOnboardingDeviceSettingState> callback) {
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
     * Patches this AdvancedThreatProtectionOnboardingDeviceSettingState with a source
     *
     * @param sourceAdvancedThreatProtectionOnboardingDeviceSettingState the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AdvancedThreatProtectionOnboardingDeviceSettingState sourceAdvancedThreatProtectionOnboardingDeviceSettingState, final ICallback<AdvancedThreatProtectionOnboardingDeviceSettingState> callback) {
        send(HttpMethod.PATCH, callback, sourceAdvancedThreatProtectionOnboardingDeviceSettingState);
    }

    /**
     * Patches this AdvancedThreatProtectionOnboardingDeviceSettingState with a source
     *
     * @param sourceAdvancedThreatProtectionOnboardingDeviceSettingState the source object with updates
     * @return the updated AdvancedThreatProtectionOnboardingDeviceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingState patch(final AdvancedThreatProtectionOnboardingDeviceSettingState sourceAdvancedThreatProtectionOnboardingDeviceSettingState) throws ClientException {
        return send(HttpMethod.PATCH, sourceAdvancedThreatProtectionOnboardingDeviceSettingState);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingDeviceSettingState with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingDeviceSettingState the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AdvancedThreatProtectionOnboardingDeviceSettingState newAdvancedThreatProtectionOnboardingDeviceSettingState, final ICallback<AdvancedThreatProtectionOnboardingDeviceSettingState> callback) {
        send(HttpMethod.POST, callback, newAdvancedThreatProtectionOnboardingDeviceSettingState);
    }

    /**
     * Creates a AdvancedThreatProtectionOnboardingDeviceSettingState with a new object
     *
     * @param newAdvancedThreatProtectionOnboardingDeviceSettingState the new object to create
     * @return the created AdvancedThreatProtectionOnboardingDeviceSettingState
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AdvancedThreatProtectionOnboardingDeviceSettingState post(final AdvancedThreatProtectionOnboardingDeviceSettingState newAdvancedThreatProtectionOnboardingDeviceSettingState) throws ClientException {
        return send(HttpMethod.POST, newAdvancedThreatProtectionOnboardingDeviceSettingState);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAdvancedThreatProtectionOnboardingDeviceSettingStateRequest select(final String value) {
         getQueryOptions().add(new QueryOption("$select", value));
         return (AdvancedThreatProtectionOnboardingDeviceSettingStateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAdvancedThreatProtectionOnboardingDeviceSettingStateRequest expand(final String value) {
         getQueryOptions().add(new QueryOption("$expand", value));
         return (AdvancedThreatProtectionOnboardingDeviceSettingStateRequest)this;
     }

}

