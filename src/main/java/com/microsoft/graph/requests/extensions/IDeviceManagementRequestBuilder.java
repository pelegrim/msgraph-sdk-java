// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementRequest;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedStoreAppConfigurationSchemaRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidDeviceOwnerEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditRequestBuilder;
import com.microsoft.graph.requests.extensions.IApplePushNotificationCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScriptRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceOverviewWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDetectedAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsMalwareInformationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataSharingConsentRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicySettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICartToClassAssociationRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosUpdateDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INdesConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceEncryptionStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationConflictSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceEnrollmentConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementExchangeOnPremisesPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesConditionalAccessSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileThreatDefenseConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.INotificationMessageTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAndAppManagementRoleAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRoleScopeTagRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IResourceOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEmbeddedSIMActivationCodePoolRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITelecomExpenseManagementPartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteAssistancePartnerRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementDomainJoinConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionAppLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuditEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTroubleshootingEventRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserPFXCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionFileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementEnableLegacyPcManagementRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetAssignedRoleDetailsRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementScopedForResourceRequestBuilder;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.options.Option;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Request Builder.
 */
public interface IDeviceManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementRequest instance
     */
    IDeviceManagementRequest buildRequest(final java.util.List<? extends Option> requestOptions);


    ITermsAndConditionsCollectionRequestBuilder termsAndConditions();

    ITermsAndConditionsRequestBuilder termsAndConditions(final String id);

    /**
     * Gets the request builder for AndroidForWorkSettings
     *
     * @return the IAndroidForWorkSettingsRequestBuilder instance
     */
    IAndroidForWorkSettingsRequestBuilder androidForWorkSettings();

    IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder androidForWorkAppConfigurationSchemas();

    IAndroidForWorkAppConfigurationSchemaRequestBuilder androidForWorkAppConfigurationSchemas(final String id);

    IAndroidForWorkEnrollmentProfileCollectionRequestBuilder androidForWorkEnrollmentProfiles();

    IAndroidForWorkEnrollmentProfileRequestBuilder androidForWorkEnrollmentProfiles(final String id);

    /**
     * Gets the request builder for AndroidManagedStoreAccountEnterpriseSettings
     *
     * @return the IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder instance
     */
    IAndroidManagedStoreAccountEnterpriseSettingsRequestBuilder androidManagedStoreAccountEnterpriseSettings();

    IAndroidManagedStoreAppConfigurationSchemaCollectionRequestBuilder androidManagedStoreAppConfigurationSchemas();

    IAndroidManagedStoreAppConfigurationSchemaRequestBuilder androidManagedStoreAppConfigurationSchemas(final String id);

    IAndroidDeviceOwnerEnrollmentProfileCollectionRequestBuilder androidDeviceOwnerEnrollmentProfiles();

    IAndroidDeviceOwnerEnrollmentProfileRequestBuilder androidDeviceOwnerEnrollmentProfiles(final String id);

    IRemoteActionAuditCollectionRequestBuilder remoteActionAudits();

    IRemoteActionAuditRequestBuilder remoteActionAudits(final String id);

    /**
     * Gets the request builder for ApplePushNotificationCertificate
     *
     * @return the IApplePushNotificationCertificateRequestBuilder instance
     */
    IApplePushNotificationCertificateRequestBuilder applePushNotificationCertificate();

    IDeviceManagementScriptCollectionRequestBuilder deviceManagementScripts();

    IDeviceManagementScriptRequestBuilder deviceManagementScripts(final String id);

    /**
     * Gets the request builder for ManagedDeviceOverview
     *
     * @return the IManagedDeviceOverviewWithReferenceRequestBuilder instance
     */
    IManagedDeviceOverviewWithReferenceRequestBuilder managedDeviceOverview();

    IDetectedAppCollectionRequestBuilder detectedApps();

    IDetectedAppRequestBuilder detectedApps(final String id);

    IManagedDeviceCollectionRequestBuilder managedDevices();

    IManagedDeviceRequestBuilder managedDevices(final String id);

    IWindowsMalwareInformationCollectionRequestBuilder windowsMalwareInformation();

    IWindowsMalwareInformationRequestBuilder windowsMalwareInformation(final String id);

    IDataSharingConsentCollectionRequestBuilder dataSharingConsents();

    IDataSharingConsentRequestBuilder dataSharingConsents(final String id);

    IMobileAppTroubleshootingEventCollectionRequestBuilder mobileAppTroubleshootingEvents();

    IMobileAppTroubleshootingEventRequestBuilder mobileAppTroubleshootingEvents(final String id);

    IDeviceConfigurationCollectionRequestBuilder deviceConfigurations();

    IDeviceConfigurationRequestBuilder deviceConfigurations(final String id);

    IDeviceCompliancePolicyCollectionRequestBuilder deviceCompliancePolicies();

    IDeviceCompliancePolicyRequestBuilder deviceCompliancePolicies(final String id);

    /**
     * Gets the request builder for SoftwareUpdateStatusSummary
     *
     * @return the ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder instance
     */
    ISoftwareUpdateStatusSummaryWithReferenceRequestBuilder softwareUpdateStatusSummary();

    /**
     * Gets the request builder for DeviceCompliancePolicyDeviceStateSummary
     *
     * @return the IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder instance
     */
    IDeviceCompliancePolicyDeviceStateSummaryRequestBuilder deviceCompliancePolicyDeviceStateSummary();

    IDeviceCompliancePolicySettingStateSummaryCollectionRequestBuilder deviceCompliancePolicySettingStateSummaries();

    IDeviceCompliancePolicySettingStateSummaryRequestBuilder deviceCompliancePolicySettingStateSummaries(final String id);

    /**
     * Gets the request builder for AdvancedThreatProtectionOnboardingStateSummary
     *
     * @return the IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder instance
     */
    IAdvancedThreatProtectionOnboardingStateSummaryRequestBuilder advancedThreatProtectionOnboardingStateSummary();

    /**
     * Gets the request builder for DeviceConfigurationDeviceStateSummary
     *
     * @return the IDeviceConfigurationDeviceStateSummaryRequestBuilder instance
     */
    IDeviceConfigurationDeviceStateSummaryRequestBuilder deviceConfigurationDeviceStateSummaries();

    /**
     * Gets the request builder for DeviceConfigurationUserStateSummary
     *
     * @return the IDeviceConfigurationUserStateSummaryRequestBuilder instance
     */
    IDeviceConfigurationUserStateSummaryRequestBuilder deviceConfigurationUserStateSummaries();

    ICartToClassAssociationCollectionRequestBuilder cartToClassAssociations();

    ICartToClassAssociationRequestBuilder cartToClassAssociations(final String id);

    IIosUpdateDeviceStatusCollectionRequestBuilder iosUpdateStatuses();

    IIosUpdateDeviceStatusRequestBuilder iosUpdateStatuses(final String id);

    INdesConnectorCollectionRequestBuilder ndesConnectors();

    INdesConnectorRequestBuilder ndesConnectors(final String id);

    IRestrictedAppsViolationCollectionRequestBuilder deviceConfigurationRestrictedAppsViolations();

    IRestrictedAppsViolationRequestBuilder deviceConfigurationRestrictedAppsViolations(final String id);

    IManagedDeviceEncryptionStateCollectionRequestBuilder managedDeviceEncryptionStates();

    IManagedDeviceEncryptionStateRequestBuilder managedDeviceEncryptionStates(final String id);

    IDeviceConfigurationConflictSummaryCollectionRequestBuilder deviceConfigurationConflictSummary();

    IDeviceConfigurationConflictSummaryRequestBuilder deviceConfigurationConflictSummary(final String id);

    IManagedAllDeviceCertificateStateCollectionRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates();

    IManagedAllDeviceCertificateStateRequestBuilder deviceConfigurationsAllManagedDeviceCertificateStates(final String id);

    IDeviceCategoryCollectionRequestBuilder deviceCategories();

    IDeviceCategoryRequestBuilder deviceCategories(final String id);

    IDeviceManagementExchangeConnectorCollectionRequestBuilder exchangeConnectors();

    IDeviceManagementExchangeConnectorRequestBuilder exchangeConnectors(final String id);

    IDeviceEnrollmentConfigurationCollectionRequestBuilder deviceEnrollmentConfigurations();

    IDeviceEnrollmentConfigurationRequestBuilder deviceEnrollmentConfigurations(final String id);

    /**
     * Gets the request builder for DeviceManagementExchangeOnPremisesPolicy
     *
     * @return the IDeviceManagementExchangeOnPremisesPolicyRequestBuilder instance
     */
    IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicy();

    IDeviceManagementExchangeOnPremisesPolicyCollectionRequestBuilder exchangeOnPremisesPolicies();

    IDeviceManagementExchangeOnPremisesPolicyRequestBuilder exchangeOnPremisesPolicies(final String id);

    /**
     * Gets the request builder for OnPremisesConditionalAccessSettings
     *
     * @return the IOnPremisesConditionalAccessSettingsRequestBuilder instance
     */
    IOnPremisesConditionalAccessSettingsRequestBuilder conditionalAccessSettings();

    IMobileThreatDefenseConnectorCollectionRequestBuilder mobileThreatDefenseConnectors();

    IMobileThreatDefenseConnectorRequestBuilder mobileThreatDefenseConnectors(final String id);

    IDeviceManagementPartnerCollectionRequestBuilder deviceManagementPartners();

    IDeviceManagementPartnerRequestBuilder deviceManagementPartners(final String id);

    IManagementConditionCollectionRequestBuilder managementConditions();

    IManagementConditionRequestBuilder managementConditions(final String id);

    IManagementConditionStatementCollectionRequestBuilder managementConditionStatements();

    IManagementConditionStatementRequestBuilder managementConditionStatements(final String id);

    INotificationMessageTemplateCollectionRequestBuilder notificationMessageTemplates();

    INotificationMessageTemplateRequestBuilder notificationMessageTemplates(final String id);

    IRoleDefinitionCollectionRequestBuilder roleDefinitions();

    IRoleDefinitionRequestBuilder roleDefinitions(final String id);

    IDeviceAndAppManagementRoleAssignmentCollectionRequestBuilder roleAssignments();

    IDeviceAndAppManagementRoleAssignmentRequestBuilder roleAssignments(final String id);

    IRoleScopeTagCollectionRequestBuilder roleScopeTags();

    IRoleScopeTagRequestBuilder roleScopeTags(final String id);

    IResourceOperationCollectionRequestBuilder resourceOperations();

    IResourceOperationRequestBuilder resourceOperations(final String id);

    IEmbeddedSIMActivationCodePoolCollectionRequestBuilder embeddedSIMActivationCodePools();

    IEmbeddedSIMActivationCodePoolRequestBuilder embeddedSIMActivationCodePools(final String id);

    ITelecomExpenseManagementPartnerCollectionRequestBuilder telecomExpenseManagementPartners();

    ITelecomExpenseManagementPartnerRequestBuilder telecomExpenseManagementPartners(final String id);

    /**
     * Gets the request builder for WindowsAutopilotSettings
     *
     * @return the IWindowsAutopilotSettingsRequestBuilder instance
     */
    IWindowsAutopilotSettingsRequestBuilder windowsAutopilotSettings();

    IWindowsAutopilotDeviceIdentityCollectionRequestBuilder windowsAutopilotDeviceIdentities();

    IWindowsAutopilotDeviceIdentityRequestBuilder windowsAutopilotDeviceIdentities(final String id);

    IWindowsAutopilotDeploymentProfileCollectionRequestBuilder windowsAutopilotDeploymentProfiles();

    IWindowsAutopilotDeploymentProfileRequestBuilder windowsAutopilotDeploymentProfiles(final String id);

    IImportedDeviceIdentityCollectionRequestBuilder importedDeviceIdentities();

    IImportedDeviceIdentityRequestBuilder importedDeviceIdentities(final String id);

    IDepOnboardingSettingCollectionRequestBuilder depOnboardingSettings();

    IDepOnboardingSettingRequestBuilder depOnboardingSettings(final String id);

    IImportedWindowsAutopilotDeviceIdentityCollectionRequestBuilder importedWindowsAutopilotDeviceIdentities();

    IImportedWindowsAutopilotDeviceIdentityRequestBuilder importedWindowsAutopilotDeviceIdentities(final String id);

    IRemoteAssistancePartnerCollectionRequestBuilder remoteAssistancePartners();

    IRemoteAssistancePartnerRequestBuilder remoteAssistancePartners(final String id);

    IDeviceManagementDomainJoinConnectorCollectionRequestBuilder domainJoinConnectors();

    IDeviceManagementDomainJoinConnectorRequestBuilder domainJoinConnectors(final String id);

    IWindowsInformationProtectionAppLearningSummaryCollectionRequestBuilder windowsInformationProtectionAppLearningSummaries();

    IWindowsInformationProtectionAppLearningSummaryRequestBuilder windowsInformationProtectionAppLearningSummaries(final String id);

    IWindowsInformationProtectionNetworkLearningSummaryCollectionRequestBuilder windowsInformationProtectionNetworkLearningSummaries();

    IWindowsInformationProtectionNetworkLearningSummaryRequestBuilder windowsInformationProtectionNetworkLearningSummaries(final String id);

    IIntuneBrandingProfileCollectionRequestBuilder intuneBrandingProfiles();

    IIntuneBrandingProfileRequestBuilder intuneBrandingProfiles(final String id);

    IAuditEventCollectionRequestBuilder auditEvents();

    IAuditEventRequestBuilder auditEvents(final String id);

    IDeviceManagementTroubleshootingEventCollectionRequestBuilder troubleshootingEvents();

    IDeviceManagementTroubleshootingEventRequestBuilder troubleshootingEvents(final String id);

    IUserPFXCertificateCollectionRequestBuilder userPfxCertificates();

    IUserPFXCertificateRequestBuilder userPfxCertificates(final String id);

    IGroupPolicyConfigurationCollectionRequestBuilder groupPolicyConfigurations();

    IGroupPolicyConfigurationRequestBuilder groupPolicyConfigurations(final String id);

    IGroupPolicyDefinitionCollectionRequestBuilder groupPolicyDefinitions();

    IGroupPolicyDefinitionRequestBuilder groupPolicyDefinitions(final String id);

    IGroupPolicyDefinitionFileCollectionRequestBuilder groupPolicyDefinitionFiles();

    IGroupPolicyDefinitionFileRequestBuilder groupPolicyDefinitionFiles(final String id);

    IDeviceManagementIntentCollectionRequestBuilder intents();

    IDeviceManagementIntentRequestBuilder intents(final String id);

    IDeviceManagementSettingDefinitionCollectionRequestBuilder settingDefinitions();

    IDeviceManagementSettingDefinitionRequestBuilder settingDefinitions(final String id);

    IDeviceManagementTemplateCollectionRequestBuilder templates();

    IDeviceManagementTemplateRequestBuilder templates(final String id);

    IDeviceManagementSettingCategoryCollectionRequestBuilder categories();

    IDeviceManagementSettingCategoryRequestBuilder categories(final String id);
    IDeviceManagementSendCustomNotificationToCompanyPortalRequestBuilder sendCustomNotificationToCompanyPortal(final String notificationTitle, final String notificationBody, final java.util.List<String> groupsToNotify);
    IDeviceManagementEnableLegacyPcManagementRequestBuilder enableLegacyPcManagement();
    IDeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder verifyWindowsEnrollmentAutoDiscovery(final String domainName);

    IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions();

    IDeviceManagementGetEffectivePermissionsCollectionRequestBuilder getEffectivePermissions(final String scope);

    IDeviceManagementGetRoleScopeTagsByResourceCollectionRequestBuilder getRoleScopeTagsByResource(final String resource);

    IDeviceManagementGetRoleScopeTagsByIdsCollectionRequestBuilder getRoleScopeTagsByIds(final java.util.List<String> ids);
    IDeviceManagementGetAssignedRoleDetailsRequestBuilder getAssignedRoleDetails();
    IDeviceManagementScopedForResourceRequestBuilder scopedForResource(final String resource);

}
