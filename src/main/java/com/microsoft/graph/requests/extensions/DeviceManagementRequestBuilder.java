// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementRequest;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.TermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.AndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.ApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceOverviewWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.DetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.DataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.SoftwareUpdateStatusSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.CartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.NdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.OnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.NotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.RoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.ResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.EmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.TelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.RemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.UserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementEnableLegacyPcManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementEnableLegacyPcManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetAssignedRoleDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementGetAssignedRoleDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScopedForResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementScopedForResourceRequestBuilder;

import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Request Builder.
 */
public class DeviceManagementRequestBuilder extends BaseRequestBuilder implements IDeviceManagementRequestBuilder {

    /**
     * The request builder for the DeviceManagement
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IDeviceManagementRequest instance
     */
    public IDeviceManagementRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    public IDeviceManagementRequest buildRequest(final java.util.List<? extends Option> requestOptions) {
        return new DeviceManagementRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public ITermsAndConditionsCollectionRequestBuilder termsAndConditions() {
        return new TermsAndConditionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions"), getClient(), null);
    }

    public ITermsAndConditionsRequestBuilder termsAndConditions(final String id) {
        return new TermsAndConditionsRequestBuilder(getRequestUrlWithAdditionalSegment("termsAndConditions") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AndroidForWorkSettings
     *
     * @return the IAndroidForWorkSettingsRequestBuilder instance
     */
    public IAndroidForWorkSettingsRequestBuilder androidForWorkSettings() {
        return new AndroidForWorkSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkSettings"), getClient(), null);
    }
    public IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder androidForWorkAppConfigurationSchemas() {
        return new AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkAppConfigurationSchemas"), getClient(), null);
    }

    public IAndroidForWorkAppConfigurationSchemaRequestBuilder androidForWorkAppConfigurationSchemas(final String id) {
        return new AndroidForWorkAppConfigurationSchemaRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkAppConfigurationSchemas") + "/" + id, getClient(), null);
    }
    public IAndroidForWorkEnrollmentProfileCollectionRequestBuilder androidForWorkEnrollmentProfiles() {
        return new AndroidForWorkEnrollmentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkEnrollmentProfiles"), getClient(), null);
    }

    public IAndroidForWorkEnrollmentProfileRequestBuilder androidForWorkEnrollmentProfiles(final String id) {
        return new AndroidForWorkEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("androidForWorkEnrollmentProfiles") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AndroidManagedStoreAccountEnterpriseSettings
     *
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder instance
     */
    public IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder androidManagedStoreAccountEnterpriseSettings() {
        return new AndroidManagedStoreAccountEnterpriseSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAccountEnterpriseSettings"), getClient(), null);
    }
    public IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder androidManagedStoreAppConfigurationSchemas() {
        return new AndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAppConfigurationSchemas"), getClient(), null);
    }

    public IAndroidManagedStoreAppConfigurationSchemaRequestBuilder androidManagedStoreAppConfigurationSchemas(final String id) {
        return new AndroidManagedStoreAppConfigurationSchemaRequestBuilder(getRequestUrlWithAdditionalSegment("androidManagedStoreAppConfigurationSchemas") + "/" + id, getClient(), null);
    }
    public IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder androidDeviceOwnerEnrollmentProfiles() {
        return new AndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("androidDeviceOwnerEnrollmentProfiles"), getClient(), null);
    }

    public IAndroidDeviceOwnerEnrollmentProfileRequestBuilder androidDeviceOwnerEnrollmentProfiles(final String id) {
        return new AndroidDeviceOwnerEnrollmentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("androidDeviceOwnerEnrollmentProfiles") + "/" + id, getClient(), null);
    }
    public IRemoteActionAuditCollectionRequestBuilder remoteActionAudits() {
        return new RemoteActionAuditCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("remoteActionAudits"), getClient(), null);
    }

    public IRemoteActionAuditRequestBuilder remoteActionAudits(final String id) {
        return new RemoteActionAuditRequestBuilder(getRequestUrlWithAdditionalSegment("remoteActionAudits") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the IApplePushNotificationCertificateRequestBuilder instance
     */
    public IApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate() {
        return new ApplePushNotificationCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("applePushNotificationCertificate"), getClient(), null);
    }
    public IDeviceManagementScriptCollectionRequestBuilder deviceManagementScripts() {
        return new DeviceManagementScriptCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementScripts"), getClient(), null);
    }

    public IDeviceManagementScriptRequestBuilder deviceManagementScripts(final String id) {
        return new DeviceManagementScriptRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementScripts") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the IManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    public IManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview() {
        return new ManagedDeviceOverviewWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceOverview"), getClient(), null);
    }
    public IDetectedAppCollectionRequestBuilder detectedApps() {
        return new DetectedAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps"), getClient(), null);
    }

    public IDetectedAppRequestBuilder detectedApps(final String id) {
        return new DetectedAppRequestBuilder(getRequestUrlWithAdditionalSegment("detectedApps") + "/" + id, getClient(), null);
    }
    public IManagedDeviceCollectionRequestBuilder managedDevices() {
        return new ManagedDeviceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices"), getClient(), null);
    }

    public IManagedDeviceRequestBuilder managedDevices(final String id) {
        return new ManagedDeviceRequestBuilder(getRequestUrlWithAdditionalSegment("managedDevices") + "/" + id, getClient(), null);
    }
    public IWindowsMalwareInformationCollectionRequestBuilder windowsMalwareInformation() {
        return new WindowsMalwareInformationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsMalwareInformation"), getClient(), null);
    }

    public IWindowsMalwareInformationRequestBuilder windowsMalwareInformation(final String id) {
        return new WindowsMalwareInformationRequestBuilder(getRequestUrlWithAdditionalSegment("windowsMalwareInformation") + "/" + id, getClient(), null);
    }
    public IDataSharingConsentCollectionRequestBuilder dataSharingConsents() {
        return new DataSharingConsentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("dataSharingConsents"), getClient(), null);
    }

    public IDataSharingConsentRequestBuilder dataSharingConsents(final String id) {
        return new DataSharingConsentRequestBuilder(getRequestUrlWithAdditionalSegment("dataSharingConsents") + "/" + id, getClient(), null);
    }
    public IMobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents() {
        return new MobileAppTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents"), getClient(), null);
    }

    public IMobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(final String id) {
        return new MobileAppTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("mobileAppTroubleshootingEvents") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationCollectionRequestBuilder deviceConfigurations() {
        return new DeviceConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations"), getClient(), null);
    }

    public IDeviceConfigurationRequestBuilder deviceConfigurations(final String id) {
        return new DeviceConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurations") + "/" + id, getClient(), null);
    }
    public IDeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies() {
        return new DeviceCompliancePolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies"), getClient(), null);
    }

    public IDeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(final String id) {
        return new DeviceCompliancePolicyRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    public ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary() {
        return new SoftwareUpdateStatusSummaryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("softwareUpdateStatusSummary"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    public IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary() {
        return new DeviceCompliancePolicyDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicyDeviceStateSummary"), getClient(), null);
    }
    public IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries() {
        return new DeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries"), getClient(), null);
    }

    public IDeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(final String id) {
        return new DeviceCompliancePolicySettingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCompliancePolicySettingStateSummaries") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AdvancedThreatProtectionOnboardingStateSummary
     *
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder instance
     */
    public IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder advancedThreatProtectionOnboardingStateSummary() {
        return new AdvancedThreatProtectionOnboardingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("advancedThreatProtectionOnboardingStateSummary"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the IDeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    public IDeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries() {
        return new DeviceConfigurationDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationDeviceStateSummaries"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserStateSummary
     *
     * @return the IDeviceConfigurationUserStateSummaryRequestBuilder instance
     */
    public IDeviceConfigurationUserStateSummaryRequestBuilder deviceConfigurationUserStateSummaries() {
        return new DeviceConfigurationUserStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationUserStateSummaries"), getClient(), null);
    }
    public ICartToClassAssociationCollectionRequestBuilder cartToClassAssociations() {
        return new CartToClassAssociationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("cartToClassAssociations"), getClient(), null);
    }

    public ICartToClassAssociationRequestBuilder cartToClassAssociations(final String id) {
        return new CartToClassAssociationRequestBuilder(getRequestUrlWithAdditionalSegment("cartToClassAssociations") + "/" + id, getClient(), null);
    }
    public IIosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses() {
        return new IosUpdateDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses"), getClient(), null);
    }

    public IIosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(final String id) {
        return new IosUpdateDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("iosUpdateStatuses") + "/" + id, getClient(), null);
    }
    public INdesConnectorCollectionRequestBuilder ndesConnectors() {
        return new NdesConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("ndesConnectors"), getClient(), null);
    }

    public INdesConnectorRequestBuilder ndesConnectors(final String id) {
        return new NdesConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("ndesConnectors") + "/" + id, getClient(), null);
    }
    public IRestrictedAppsViolationCollectionRequestBuilder deviceConfigurationRestrictedAppsViolations() {
        return new RestrictedAppsViolationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationRestrictedAppsViolations"), getClient(), null);
    }

    public IRestrictedAppsViolationRequestBuilder deviceConfigurationRestrictedAppsViolations(final String id) {
        return new RestrictedAppsViolationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationRestrictedAppsViolations") + "/" + id, getClient(), null);
    }
    public IManagedDeviceEncryptionStateCollectionRequestBuilder managedDeviceEncryptionStates() {
        return new ManagedDeviceEncryptionStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceEncryptionStates"), getClient(), null);
    }

    public IManagedDeviceEncryptionStateRequestBuilder managedDeviceEncryptionStates(final String id) {
        return new ManagedDeviceEncryptionStateRequestBuilder(getRequestUrlWithAdditionalSegment("managedDeviceEncryptionStates") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationConflictSummaryCollectionRequestBuilder deviceConfigurationConflictSummary() {
        return new DeviceConfigurationConflictSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationConflictSummary"), getClient(), null);
    }

    public IDeviceConfigurationConflictSummaryRequestBuilder deviceConfigurationConflictSummary(final String id) {
        return new DeviceConfigurationConflictSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationConflictSummary") + "/" + id, getClient(), null);
    }
    public IManagedAllDeviceCertificateStateCollectionRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates() {
        return new ManagedAllDeviceCertificateStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationsAllManagedDeviceCertificateStates"), getClient(), null);
    }

    public IManagedAllDeviceCertificateStateRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates(final String id) {
        return new ManagedAllDeviceCertificateStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceConfigurationsAllManagedDeviceCertificateStates") + "/" + id, getClient(), null);
    }
    public IDeviceCategoryCollectionRequestBuilder deviceCategories() {
        return new DeviceCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories"), getClient(), null);
    }

    public IDeviceCategoryRequestBuilder deviceCategories(final String id) {
        return new DeviceCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceCategories") + "/" + id, getClient(), null);
    }
    public IDeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors() {
        return new DeviceManagementExchangeConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors"), getClient(), null);
    }

    public IDeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(final String id) {
        return new DeviceManagementExchangeConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeConnectors") + "/" + id, getClient(), null);
    }
    public IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations() {
        return new DeviceEnrollmentConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations"), getClient(), null);
    }

    public IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id) {
        return new DeviceEnrollmentConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("deviceEnrollmentConfigurations") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementExchangeOnPremisesPolicy
     *
     * @return the IDeviceManagementExchangeOnPremisesPolicyRequestBuilder instance
     */
    public IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicy() {
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicy"), getClient(), null);
    }
    public IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder exchangeOnPremisesPolicies() {
        return new DeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicies"), getClient(), null);
    }

    public IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicies(final String id) {
        return new DeviceManagementExchangeOnPremisesPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("exchangeOnPremisesPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the IOnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    public IOnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings() {
        return new OnPremisesConditionalAccessSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("conditionalAccessSettings"), getClient(), null);
    }
    public IMobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors() {
        return new MobileThreatDefenseConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors"), getClient(), null);
    }

    public IMobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(final String id) {
        return new MobileThreatDefenseConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("mobileThreatDefenseConnectors") + "/" + id, getClient(), null);
    }
    public IDeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners() {
        return new DeviceManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners"), getClient(), null);
    }

    public IDeviceManagementPartnerRequestBuilder deviceManagementPartners(final String id) {
        return new DeviceManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("deviceManagementPartners") + "/" + id, getClient(), null);
    }
    public IManagementConditionCollectionRequestBuilder managementConditions() {
        return new ManagementConditionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions"), getClient(), null);
    }

    public IManagementConditionRequestBuilder managementConditions(final String id) {
        return new ManagementConditionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditions") + "/" + id, getClient(), null);
    }
    public IManagementConditionStatementCollectionRequestBuilder managementConditionStatements() {
        return new ManagementConditionStatementCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements"), getClient(), null);
    }

    public IManagementConditionStatementRequestBuilder managementConditionStatements(final String id) {
        return new ManagementConditionStatementRequestBuilder(getRequestUrlWithAdditionalSegment("managementConditionStatements") + "/" + id, getClient(), null);
    }
    public INotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates() {
        return new NotificationMessageTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates"), getClient(), null);
    }

    public INotificationMessageTemplateRequestBuilder notificationMessageTemplates(final String id) {
        return new NotificationMessageTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("notificationMessageTemplates") + "/" + id, getClient(), null);
    }
    public IRoleDefinitionCollectionRequestBuilder roleDefinitions() {
        return new RoleDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions"), getClient(), null);
    }

    public IRoleDefinitionRequestBuilder roleDefinitions(final String id) {
        return new RoleDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("roleDefinitions") + "/" + id, getClient(), null);
    }
    public IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments() {
        return new DeviceAndAppManagementRoleAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments"), getClient(), null);
    }

    public IDeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(final String id) {
        return new DeviceAndAppManagementRoleAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("roleAssignments") + "/" + id, getClient(), null);
    }
    public IRoleScopeTagCollectionRequestBuilder roleScopeTags() {
        return new RoleScopeTagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags"), getClient(), null);
    }

    public IRoleScopeTagRequestBuilder roleScopeTags(final String id) {
        return new RoleScopeTagRequestBuilder(getRequestUrlWithAdditionalSegment("roleScopeTags") + "/" + id, getClient(), null);
    }
    public IResourceOperationCollectionRequestBuilder resourceOperations() {
        return new ResourceOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations"), getClient(), null);
    }

    public IResourceOperationRequestBuilder resourceOperations(final String id) {
        return new ResourceOperationRequestBuilder(getRequestUrlWithAdditionalSegment("resourceOperations") + "/" + id, getClient(), null);
    }
    public IEmbeddedSIMActivationCodePoolCollectionRequestBuilder embeddedSIMActivationCodePools() {
        return new EmbeddedSIMActivationCodePoolCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("embeddedSIMActivationCodePools"), getClient(), null);
    }

    public IEmbeddedSIMActivationCodePoolRequestBuilder embeddedSIMActivationCodePools(final String id) {
        return new EmbeddedSIMActivationCodePoolRequestBuilder(getRequestUrlWithAdditionalSegment("embeddedSIMActivationCodePools") + "/" + id, getClient(), null);
    }
    public ITelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners() {
        return new TelecomExpenseManagementPartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners"), getClient(), null);
    }

    public ITelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(final String id) {
        return new TelecomExpenseManagementPartnerRequestBuilder(getRequestUrlWithAdditionalSegment("telecomExpenseManagementPartners") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for WindowsAutopilotSettings
     *
     * @return the IWindowsAutopilotSettingsRequestBuilder instance
     */
    public IWindowsAutopilotSettingsRequestBuilder windowsAutopilotSettings() {
        return new WindowsAutopilotSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotSettings"), getClient(), null);
    }
    public IWindowsAutopilotDeviceIdentityCollectionRequestBuilder windowsAutopilotDeviceIdentities() {
        return new WindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeviceIdentities"), getClient(), null);
    }

    public IWindowsAutopilotDeviceIdentityRequestBuilder windowsAutopilotDeviceIdentities(final String id) {
        return new WindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeviceIdentities") + "/" + id, getClient(), null);
    }
    public IWindowsAutopilotDeploymentProfileCollectionRequestBuilder windowsAutopilotDeploymentProfiles() {
        return new WindowsAutopilotDeploymentProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeploymentProfiles"), getClient(), null);
    }

    public IWindowsAutopilotDeploymentProfileRequestBuilder windowsAutopilotDeploymentProfiles(final String id) {
        return new WindowsAutopilotDeploymentProfileRequestBuilder(getRequestUrlWithAdditionalSegment("windowsAutopilotDeploymentProfiles") + "/" + id, getClient(), null);
    }
    public IImportedDeviceIdentityCollectionRequestBuilder importedDeviceIdentities() {
        return new ImportedDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("importedDeviceIdentities"), getClient(), null);
    }

    public IImportedDeviceIdentityRequestBuilder importedDeviceIdentities(final String id) {
        return new ImportedDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("importedDeviceIdentities") + "/" + id, getClient(), null);
    }
    public IDepOnboardingSettingCollectionRequestBuilder depOnboardingSettings() {
        return new DepOnboardingSettingCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("depOnboardingSettings"), getClient(), null);
    }

    public IDepOnboardingSettingRequestBuilder depOnboardingSettings(final String id) {
        return new DepOnboardingSettingRequestBuilder(getRequestUrlWithAdditionalSegment("depOnboardingSettings") + "/" + id, getClient(), null);
    }
    public IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder importedWindowsAutopilotDeviceIdentities() {
        return new ImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("importedWindowsAutopilotDeviceIdentities"), getClient(), null);
    }

    public IImportedWindowsAutopilotDeviceIdentityRequestBuilder importedWindowsAutopilotDeviceIdentities(final String id) {
        return new ImportedWindowsAutopilotDeviceIdentityRequestBuilder(getRequestUrlWithAdditionalSegment("importedWindowsAutopilotDeviceIdentities") + "/" + id, getClient(), null);
    }
    public IRemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners() {
        return new RemoteAssistancePartnerCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners"), getClient(), null);
    }

    public IRemoteAssistancePartnerRequestBuilder remoteAssistancePartners(final String id) {
        return new RemoteAssistancePartnerRequestBuilder(getRequestUrlWithAdditionalSegment("remoteAssistancePartners") + "/" + id, getClient(), null);
    }
    public IDeviceManagementDomainJoinConnectorCollectionRequestBuilder domainJoinConnectors() {
        return new DeviceManagementDomainJoinConnectorCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("domainJoinConnectors"), getClient(), null);
    }

    public IDeviceManagementDomainJoinConnectorRequestBuilder domainJoinConnectors(final String id) {
        return new DeviceManagementDomainJoinConnectorRequestBuilder(getRequestUrlWithAdditionalSegment("domainJoinConnectors") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries() {
        return new WindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries"), getClient(), null);
    }

    public IWindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(final String id) {
        return new WindowsInformationProtectionAppLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionAppLearningSummaries") + "/" + id, getClient(), null);
    }
    public IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries() {
        return new WindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries"), getClient(), null);
    }

    public IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(final String id) {
        return new WindowsInformationProtectionNetworkLearningSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("windowsInformationProtectionNetworkLearningSummaries") + "/" + id, getClient(), null);
    }
    public IIntuneBrandingProfileCollectionRequestBuilder intuneBrandingProfiles() {
        return new IntuneBrandingProfileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intuneBrandingProfiles"), getClient(), null);
    }

    public IIntuneBrandingProfileRequestBuilder intuneBrandingProfiles(final String id) {
        return new IntuneBrandingProfileRequestBuilder(getRequestUrlWithAdditionalSegment("intuneBrandingProfiles") + "/" + id, getClient(), null);
    }
    public IAuditEventCollectionRequestBuilder auditEvents() {
        return new AuditEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents"), getClient(), null);
    }

    public IAuditEventRequestBuilder auditEvents(final String id) {
        return new AuditEventRequestBuilder(getRequestUrlWithAdditionalSegment("auditEvents") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents() {
        return new DeviceManagementTroubleshootingEventCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents"), getClient(), null);
    }

    public IDeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(final String id) {
        return new DeviceManagementTroubleshootingEventRequestBuilder(getRequestUrlWithAdditionalSegment("troubleshootingEvents") + "/" + id, getClient(), null);
    }
    public IUserPFXCertificateCollectionRequestBuilder userPfxCertificates() {
        return new UserPFXCertificateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userPfxCertificates"), getClient(), null);
    }

    public IUserPFXCertificateRequestBuilder userPfxCertificates(final String id) {
        return new UserPFXCertificateRequestBuilder(getRequestUrlWithAdditionalSegment("userPfxCertificates") + "/" + id, getClient(), null);
    }
    public IGroupPolicyConfigurationCollectionRequestBuilder groupPolicyConfigurations() {
        return new GroupPolicyConfigurationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyConfigurations"), getClient(), null);
    }

    public IGroupPolicyConfigurationRequestBuilder groupPolicyConfigurations(final String id) {
        return new GroupPolicyConfigurationRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyConfigurations") + "/" + id, getClient(), null);
    }
    public IGroupPolicyDefinitionCollectionRequestBuilder groupPolicyDefinitions() {
        return new GroupPolicyDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitions"), getClient(), null);
    }

    public IGroupPolicyDefinitionRequestBuilder groupPolicyDefinitions(final String id) {
        return new GroupPolicyDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitions") + "/" + id, getClient(), null);
    }
    public IGroupPolicyDefinitionFileCollectionRequestBuilder groupPolicyDefinitionFiles() {
        return new GroupPolicyDefinitionFileCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitionFiles"), getClient(), null);
    }

    public IGroupPolicyDefinitionFileRequestBuilder groupPolicyDefinitionFiles(final String id) {
        return new GroupPolicyDefinitionFileRequestBuilder(getRequestUrlWithAdditionalSegment("groupPolicyDefinitionFiles") + "/" + id, getClient(), null);
    }
    public IDeviceManagementIntentCollectionRequestBuilder intents() {
        return new DeviceManagementIntentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("intents"), getClient(), null);
    }

    public IDeviceManagementIntentRequestBuilder intents(final String id) {
        return new DeviceManagementIntentRequestBuilder(getRequestUrlWithAdditionalSegment("intents") + "/" + id, getClient(), null);
    }
    public IDeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions() {
        return new DeviceManagementSettingDefinitionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions"), getClient(), null);
    }

    public IDeviceManagementSettingDefinitionRequestBuilder settingDefinitions(final String id) {
        return new DeviceManagementSettingDefinitionRequestBuilder(getRequestUrlWithAdditionalSegment("settingDefinitions") + "/" + id, getClient(), null);
    }
    public IDeviceManagementTemplateCollectionRequestBuilder templates() {
        return new DeviceManagementTemplateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("templates"), getClient(), null);
    }

    public IDeviceManagementTemplateRequestBuilder templates(final String id) {
        return new DeviceManagementTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("templates") + "/" + id, getClient(), null);
    }
    public IDeviceManagementSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IDeviceManagementSettingCategoryRequestBuilder categories(final String id) {
        return new DeviceManagementSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }

    public IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(final String notificationTitle, final String notificationBody, final java.util.List<String> groupsToNotify) {
        return new DeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sendCustomNotificationToCompanyPortal"), getClient(), null, notificationTitle, notificationBody, groupsToNotify);
    }

    public IDeviceManagementEnableLegacyPcManagementRequestBuilder enableLegacyPcManagement() {
        return new DeviceManagementEnableLegacyPcManagementRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.enableLegacyPcManagement"), getClient(), null);
    }

    public IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(final String domainName) {
        return new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.verifyWindowsEnrollmentAutoDiscovery"), getClient(), null, domainName);
    }

    public IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions() {
        return new DeviceManagementGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null);
    }

    public IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(final String scope) {
        return new DeviceManagementGetEffectivePermissionsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getEffectivePermissions"), getClient(), null, scope);
    }

    public IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder getRoleScopeTagsByResource(final String resource) {
        return new DeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRoleScopeTagsByResource"), getClient(), null, resource);
    }

    public IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder getRoleScopeTagsByIds(final java.util.List<String> ids) {
        return new DeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getRoleScopeTagsByIds"), getClient(), null, ids);
    }

    public IDeviceManagementGetAssignedRoleDetailsRequestBuilder getAssignedRoleDetails() {
        return new DeviceManagementGetAssignedRoleDetailsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getAssignedRoleDetails"), getClient(), null);
    }

    public IDeviceManagementScopedForResourceRequestBuilder scopedForResource(final String resource) {
        return new DeviceManagementScopedForResourceRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.scopedForResource"), getClient(), null, resource);
    }
}

