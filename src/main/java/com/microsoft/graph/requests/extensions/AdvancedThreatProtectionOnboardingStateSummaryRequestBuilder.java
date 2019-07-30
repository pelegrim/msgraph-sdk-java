// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingStateSummaryRequest;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingStateSummaryRequest;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Advanced Threat Protection Onboarding State Summary Request Builder.
 */
public class AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder extends BaseRequestBuilder implements IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder {

    /**
     * The request builder for the AdvancedThreatProtectionOnboardingStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequest instance
     */
    public IAdvancedThreatProtectionOnboardingStateSummaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequest instance
     */
    public IAdvancedThreatProtectionOnboardingStateSummaryRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new AdvancedThreatProtectionOnboardingStateSummaryRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IAdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder advancedThreatProtectionOnboardingDeviceSettingStates() {
        return new AdvancedThreatProtectionOnboardingDeviceSettingStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("advancedThreatProtectionOnboardingDeviceSettingStates"), getClient(), null);
    }

    public IAdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder advancedThreatProtectionOnboardingDeviceSettingStates(final String id) {
        return new AdvancedThreatProtectionOnboardingDeviceSettingStateRequestBuilder(getRequestUrlWithAdditionalSegment("advancedThreatProtectionOnboardingDeviceSettingStates") + "/" + id, getClient(), null);
    }
}

