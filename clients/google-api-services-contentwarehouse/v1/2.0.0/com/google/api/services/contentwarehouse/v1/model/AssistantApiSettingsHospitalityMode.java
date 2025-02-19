/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.contentwarehouse.v1.model;

/**
 * Hospitality mode config for the current device. go/hospitality-mode-design. Next ID: 17
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiSettingsHospitalityMode extends com.google.api.client.json.GenericJson {

  /**
   * List of AOG app context ids that are linked to this device. These apps will have access to the
   * structure information for the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> aogContextId;

  /**
   * Invocation phrase for hotel's AoG action. Used for ZS promotion card and "talk to my hotel"
   * rewrites. Setting this to an empty value will mark it unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String aogInvocationPhrase;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSettingsHospitalityModeBranding branding;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiSettingsHospitalityCardSettings cardSettings;

  /**
   * The time when we received a request to reset the device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiTimestamp deviceClearRequest;

  /**
   * Should the dialog have a shorter ttl. See go/ipp-consumer-prd#heading=h.ibu9b1ysdl4t and go
   * /interpreter-device-clear#bookmark=id.hw8ey1bzjadn for context.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dialogTtlOverrideMicros;

  /**
   * Identifier for the enterprise which owns the device. Setting this to an empty value will mark
   * it unset.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enterpriseId;

  /**
   * Indicates whether this device is in the hospitality mode.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean hospitalityModeEnabled;

  /**
   * Last time the device was cleared and placed in hospitality mode. Will be set when the switch is
   * toggled on and reset when a guest checks out. On the device this triggers removing alarms,
   * timers, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiTimestamp lastDeviceClear;

  /**
   * Indicates when hospitality settings were last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiTimestamp lastModifiedTimestamp;

  /**
   * Last time the welcome message was played for the guest. If last_welcomed < welcome_request, the
   * message should be replayed and this time set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiTimestamp lastWelcomed;

  /**
   * Indicates whether or not the device must be reset manually (by voice or touch), as opposed to
   * being automatically reset. go/hospitality-manual-reset
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean manualResetRequired;

  /**
   * In order promoted languages for interpreter devices. This represents languages by BCP-47
   * language strings, such as "en", "en-US", "fr", "fr-CA", "sr-Latn", "zh-Hans-CN", "zh-Hant-
   * HK",etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> promotedLanguages;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Whether we allow users to initiate clearing the device verbally. We generally allow this for
   * private devices and not for public ones.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean verbalResetSupported;

  /**
   * The time when we received a request to welcome the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantApiTimestamp welcomeRequest;

  /**
   * List of AOG app context ids that are linked to this device. These apps will have access to the
   * structure information for the device.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAogContextId() {
    return aogContextId;
  }

  /**
   * List of AOG app context ids that are linked to this device. These apps will have access to the
   * structure information for the device.
   * @param aogContextId aogContextId or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setAogContextId(java.util.List<java.lang.String> aogContextId) {
    this.aogContextId = aogContextId;
    return this;
  }

  /**
   * Invocation phrase for hotel's AoG action. Used for ZS promotion card and "talk to my hotel"
   * rewrites. Setting this to an empty value will mark it unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getAogInvocationPhrase() {
    return aogInvocationPhrase;
  }

  /**
   * Invocation phrase for hotel's AoG action. Used for ZS promotion card and "talk to my hotel"
   * rewrites. Setting this to an empty value will mark it unset.
   * @param aogInvocationPhrase aogInvocationPhrase or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setAogInvocationPhrase(java.lang.String aogInvocationPhrase) {
    this.aogInvocationPhrase = aogInvocationPhrase;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSettingsHospitalityModeBranding getBranding() {
    return branding;
  }

  /**
   * @param branding branding or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setBranding(AssistantApiSettingsHospitalityModeBranding branding) {
    this.branding = branding;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AssistantApiSettingsHospitalityCardSettings getCardSettings() {
    return cardSettings;
  }

  /**
   * @param cardSettings cardSettings or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setCardSettings(AssistantApiSettingsHospitalityCardSettings cardSettings) {
    this.cardSettings = cardSettings;
    return this;
  }

  /**
   * The time when we received a request to reset the device.
   * @return value or {@code null} for none
   */
  public AssistantApiTimestamp getDeviceClearRequest() {
    return deviceClearRequest;
  }

  /**
   * The time when we received a request to reset the device.
   * @param deviceClearRequest deviceClearRequest or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setDeviceClearRequest(AssistantApiTimestamp deviceClearRequest) {
    this.deviceClearRequest = deviceClearRequest;
    return this;
  }

  /**
   * Should the dialog have a shorter ttl. See go/ipp-consumer-prd#heading=h.ibu9b1ysdl4t and go
   * /interpreter-device-clear#bookmark=id.hw8ey1bzjadn for context.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDialogTtlOverrideMicros() {
    return dialogTtlOverrideMicros;
  }

  /**
   * Should the dialog have a shorter ttl. See go/ipp-consumer-prd#heading=h.ibu9b1ysdl4t and go
   * /interpreter-device-clear#bookmark=id.hw8ey1bzjadn for context.
   * @param dialogTtlOverrideMicros dialogTtlOverrideMicros or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setDialogTtlOverrideMicros(java.lang.Long dialogTtlOverrideMicros) {
    this.dialogTtlOverrideMicros = dialogTtlOverrideMicros;
    return this;
  }

  /**
   * Identifier for the enterprise which owns the device. Setting this to an empty value will mark
   * it unset.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnterpriseId() {
    return enterpriseId;
  }

  /**
   * Identifier for the enterprise which owns the device. Setting this to an empty value will mark
   * it unset.
   * @param enterpriseId enterpriseId or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setEnterpriseId(java.lang.String enterpriseId) {
    this.enterpriseId = enterpriseId;
    return this;
  }

  /**
   * Indicates whether this device is in the hospitality mode.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHospitalityModeEnabled() {
    return hospitalityModeEnabled;
  }

  /**
   * Indicates whether this device is in the hospitality mode.
   * @param hospitalityModeEnabled hospitalityModeEnabled or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setHospitalityModeEnabled(java.lang.Boolean hospitalityModeEnabled) {
    this.hospitalityModeEnabled = hospitalityModeEnabled;
    return this;
  }

  /**
   * Last time the device was cleared and placed in hospitality mode. Will be set when the switch is
   * toggled on and reset when a guest checks out. On the device this triggers removing alarms,
   * timers, etc.
   * @return value or {@code null} for none
   */
  public AssistantApiTimestamp getLastDeviceClear() {
    return lastDeviceClear;
  }

  /**
   * Last time the device was cleared and placed in hospitality mode. Will be set when the switch is
   * toggled on and reset when a guest checks out. On the device this triggers removing alarms,
   * timers, etc.
   * @param lastDeviceClear lastDeviceClear or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setLastDeviceClear(AssistantApiTimestamp lastDeviceClear) {
    this.lastDeviceClear = lastDeviceClear;
    return this;
  }

  /**
   * Indicates when hospitality settings were last updated.
   * @return value or {@code null} for none
   */
  public AssistantApiTimestamp getLastModifiedTimestamp() {
    return lastModifiedTimestamp;
  }

  /**
   * Indicates when hospitality settings were last updated.
   * @param lastModifiedTimestamp lastModifiedTimestamp or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setLastModifiedTimestamp(AssistantApiTimestamp lastModifiedTimestamp) {
    this.lastModifiedTimestamp = lastModifiedTimestamp;
    return this;
  }

  /**
   * Last time the welcome message was played for the guest. If last_welcomed < welcome_request, the
   * message should be replayed and this time set.
   * @return value or {@code null} for none
   */
  public AssistantApiTimestamp getLastWelcomed() {
    return lastWelcomed;
  }

  /**
   * Last time the welcome message was played for the guest. If last_welcomed < welcome_request, the
   * message should be replayed and this time set.
   * @param lastWelcomed lastWelcomed or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setLastWelcomed(AssistantApiTimestamp lastWelcomed) {
    this.lastWelcomed = lastWelcomed;
    return this;
  }

  /**
   * Indicates whether or not the device must be reset manually (by voice or touch), as opposed to
   * being automatically reset. go/hospitality-manual-reset
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getManualResetRequired() {
    return manualResetRequired;
  }

  /**
   * Indicates whether or not the device must be reset manually (by voice or touch), as opposed to
   * being automatically reset. go/hospitality-manual-reset
   * @param manualResetRequired manualResetRequired or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setManualResetRequired(java.lang.Boolean manualResetRequired) {
    this.manualResetRequired = manualResetRequired;
    return this;
  }

  /**
   * In order promoted languages for interpreter devices. This represents languages by BCP-47
   * language strings, such as "en", "en-US", "fr", "fr-CA", "sr-Latn", "zh-Hans-CN", "zh-Hant-
   * HK",etc.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPromotedLanguages() {
    return promotedLanguages;
  }

  /**
   * In order promoted languages for interpreter devices. This represents languages by BCP-47
   * language strings, such as "en", "en-US", "fr", "fr-CA", "sr-Latn", "zh-Hans-CN", "zh-Hant-
   * HK",etc.
   * @param promotedLanguages promotedLanguages or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setPromotedLanguages(java.util.List<java.lang.String> promotedLanguages) {
    this.promotedLanguages = promotedLanguages;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Whether we allow users to initiate clearing the device verbally. We generally allow this for
   * private devices and not for public ones.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getVerbalResetSupported() {
    return verbalResetSupported;
  }

  /**
   * Whether we allow users to initiate clearing the device verbally. We generally allow this for
   * private devices and not for public ones.
   * @param verbalResetSupported verbalResetSupported or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setVerbalResetSupported(java.lang.Boolean verbalResetSupported) {
    this.verbalResetSupported = verbalResetSupported;
    return this;
  }

  /**
   * The time when we received a request to welcome the user.
   * @return value or {@code null} for none
   */
  public AssistantApiTimestamp getWelcomeRequest() {
    return welcomeRequest;
  }

  /**
   * The time when we received a request to welcome the user.
   * @param welcomeRequest welcomeRequest or {@code null} for none
   */
  public AssistantApiSettingsHospitalityMode setWelcomeRequest(AssistantApiTimestamp welcomeRequest) {
    this.welcomeRequest = welcomeRequest;
    return this;
  }

  @Override
  public AssistantApiSettingsHospitalityMode set(String fieldName, Object value) {
    return (AssistantApiSettingsHospitalityMode) super.set(fieldName, value);
  }

  @Override
  public AssistantApiSettingsHospitalityMode clone() {
    return (AssistantApiSettingsHospitalityMode) super.clone();
  }

}
