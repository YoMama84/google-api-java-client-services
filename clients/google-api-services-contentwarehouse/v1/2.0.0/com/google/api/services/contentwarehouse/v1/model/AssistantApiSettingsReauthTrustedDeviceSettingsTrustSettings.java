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
 * Next id: 6
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings extends com.google.api.client.json.GenericJson {

  /**
   * If true, don't ask user to trust this device again.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean neverAskAgain;

  /**
   * DEPRECATED: Use never_ask_again instead. Expiration timestamp of "never ask again" status. If
   * this field is set and is later than current timestamp, we should NOT ask the user whether
   * they'd like to trust this device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String neverAskExpirationTimestamp;

  /**
   * Expiration timestamp of "trusted" status. If this field is set and is later than current
   * timestamp, we can consider this device to be trusted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String trustDeviceExpirationTimestamp;

  /**
   * If true, don't ask user to trust this device again.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNeverAskAgain() {
    return neverAskAgain;
  }

  /**
   * If true, don't ask user to trust this device again.
   * @param neverAskAgain neverAskAgain or {@code null} for none
   */
  public AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings setNeverAskAgain(java.lang.Boolean neverAskAgain) {
    this.neverAskAgain = neverAskAgain;
    return this;
  }

  /**
   * DEPRECATED: Use never_ask_again instead. Expiration timestamp of "never ask again" status. If
   * this field is set and is later than current timestamp, we should NOT ask the user whether
   * they'd like to trust this device.
   * @return value or {@code null} for none
   */
  public String getNeverAskExpirationTimestamp() {
    return neverAskExpirationTimestamp;
  }

  /**
   * DEPRECATED: Use never_ask_again instead. Expiration timestamp of "never ask again" status. If
   * this field is set and is later than current timestamp, we should NOT ask the user whether
   * they'd like to trust this device.
   * @param neverAskExpirationTimestamp neverAskExpirationTimestamp or {@code null} for none
   */
  public AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings setNeverAskExpirationTimestamp(String neverAskExpirationTimestamp) {
    this.neverAskExpirationTimestamp = neverAskExpirationTimestamp;
    return this;
  }

  /**
   * Expiration timestamp of "trusted" status. If this field is set and is later than current
   * timestamp, we can consider this device to be trusted.
   * @return value or {@code null} for none
   */
  public String getTrustDeviceExpirationTimestamp() {
    return trustDeviceExpirationTimestamp;
  }

  /**
   * Expiration timestamp of "trusted" status. If this field is set and is later than current
   * timestamp, we can consider this device to be trusted.
   * @param trustDeviceExpirationTimestamp trustDeviceExpirationTimestamp or {@code null} for none
   */
  public AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings setTrustDeviceExpirationTimestamp(String trustDeviceExpirationTimestamp) {
    this.trustDeviceExpirationTimestamp = trustDeviceExpirationTimestamp;
    return this;
  }

  @Override
  public AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings set(String fieldName, Object value) {
    return (AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings) super.set(fieldName, value);
  }

  @Override
  public AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings clone() {
    return (AssistantApiSettingsReauthTrustedDeviceSettingsTrustSettings) super.clone();
  }

}
