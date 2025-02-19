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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Specifies additional options to apply to the base `profile`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudHealthcareV1beta1DeidentifyOptions extends com.google.api.client.json.GenericJson {

  /**
   * Character mask config for `CharacterMaskField` `FieldMetadatas`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CharacterMaskConfig characterMaskConfig;

  /**
   * Configure contextual de-id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContextualDeidConfig contextualDeid;

  /**
   * Crypo hash config for `CharacterMaskField` `FieldMetadatas`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CryptoHashConfig cryptoHashConfig;

  /**
   * Date shifting config for `CharacterMaskField` `FieldMetadatas`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DateShiftConfig dateShiftConfig;

  /**
   * Configure keeping extensions by default.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KeepExtensionsConfig keepExtensions;

  /**
   * Character mask config for `CharacterMaskField` `FieldMetadatas`.
   * @return value or {@code null} for none
   */
  public CharacterMaskConfig getCharacterMaskConfig() {
    return characterMaskConfig;
  }

  /**
   * Character mask config for `CharacterMaskField` `FieldMetadatas`.
   * @param characterMaskConfig characterMaskConfig or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyOptions setCharacterMaskConfig(CharacterMaskConfig characterMaskConfig) {
    this.characterMaskConfig = characterMaskConfig;
    return this;
  }

  /**
   * Configure contextual de-id.
   * @return value or {@code null} for none
   */
  public ContextualDeidConfig getContextualDeid() {
    return contextualDeid;
  }

  /**
   * Configure contextual de-id.
   * @param contextualDeid contextualDeid or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyOptions setContextualDeid(ContextualDeidConfig contextualDeid) {
    this.contextualDeid = contextualDeid;
    return this;
  }

  /**
   * Crypo hash config for `CharacterMaskField` `FieldMetadatas`.
   * @return value or {@code null} for none
   */
  public CryptoHashConfig getCryptoHashConfig() {
    return cryptoHashConfig;
  }

  /**
   * Crypo hash config for `CharacterMaskField` `FieldMetadatas`.
   * @param cryptoHashConfig cryptoHashConfig or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyOptions setCryptoHashConfig(CryptoHashConfig cryptoHashConfig) {
    this.cryptoHashConfig = cryptoHashConfig;
    return this;
  }

  /**
   * Date shifting config for `CharacterMaskField` `FieldMetadatas`.
   * @return value or {@code null} for none
   */
  public DateShiftConfig getDateShiftConfig() {
    return dateShiftConfig;
  }

  /**
   * Date shifting config for `CharacterMaskField` `FieldMetadatas`.
   * @param dateShiftConfig dateShiftConfig or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyOptions setDateShiftConfig(DateShiftConfig dateShiftConfig) {
    this.dateShiftConfig = dateShiftConfig;
    return this;
  }

  /**
   * Configure keeping extensions by default.
   * @return value or {@code null} for none
   */
  public KeepExtensionsConfig getKeepExtensions() {
    return keepExtensions;
  }

  /**
   * Configure keeping extensions by default.
   * @param keepExtensions keepExtensions or {@code null} for none
   */
  public GoogleCloudHealthcareV1beta1DeidentifyOptions setKeepExtensions(KeepExtensionsConfig keepExtensions) {
    this.keepExtensions = keepExtensions;
    return this;
  }

  @Override
  public GoogleCloudHealthcareV1beta1DeidentifyOptions set(String fieldName, Object value) {
    return (GoogleCloudHealthcareV1beta1DeidentifyOptions) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudHealthcareV1beta1DeidentifyOptions clone() {
    return (GoogleCloudHealthcareV1beta1DeidentifyOptions) super.clone();
  }

}
