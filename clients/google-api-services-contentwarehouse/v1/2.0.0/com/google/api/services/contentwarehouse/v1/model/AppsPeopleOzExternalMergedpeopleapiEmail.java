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
 * Model definition for AppsPeopleOzExternalMergedpeopleapiEmail.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiEmail extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailCertificate> certificate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String classification;

  /**
   * To read or update, use the CONTACT_GROUP_PREFERENCE mask field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailContactGroupPreference> contactGroupPreference;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiEmailExtendedData extendedData;

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiEmailSignupEmailMetadata signupEmailMetadata;

  /**
   * The type of the email address. The type can be free form or one of these predefined values: *
   * `home` * `work` * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailCertificate> getCertificate() {
    return certificate;
  }

  /**
   * @param certificate certificate or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setCertificate(java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailCertificate> certificate) {
    this.certificate = certificate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getClassification() {
    return classification;
  }

  /**
   * @param classification classification or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setClassification(java.lang.String classification) {
    this.classification = classification;
    return this;
  }

  /**
   * To read or update, use the CONTACT_GROUP_PREFERENCE mask field.
   * @return value or {@code null} for none
   */
  public java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailContactGroupPreference> getContactGroupPreference() {
    return contactGroupPreference;
  }

  /**
   * To read or update, use the CONTACT_GROUP_PREFERENCE mask field.
   * @param contactGroupPreference contactGroupPreference or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setContactGroupPreference(java.util.List<AppsPeopleOzExternalMergedpeopleapiEmailContactGroupPreference> contactGroupPreference) {
    this.contactGroupPreference = contactGroupPreference;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * @param displayName displayName or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmailExtendedData getExtendedData() {
    return extendedData;
  }

  /**
   * @param extendedData extendedData or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setExtendedData(AppsPeopleOzExternalMergedpeopleapiEmailExtendedData extendedData) {
    this.extendedData = extendedData;
    return this;
  }

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * @param formattedType formattedType or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmailSignupEmailMetadata getSignupEmailMetadata() {
    return signupEmailMetadata;
  }

  /**
   * @param signupEmailMetadata signupEmailMetadata or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setSignupEmailMetadata(AppsPeopleOzExternalMergedpeopleapiEmailSignupEmailMetadata signupEmailMetadata) {
    this.signupEmailMetadata = signupEmailMetadata;
    return this;
  }

  /**
   * The type of the email address. The type can be free form or one of these predefined values: *
   * `home` * `work` * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the email address. The type can be free form or one of these predefined values: *
   * `home` * `work` * `other`
   * @param type type or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * @param value value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiEmail setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiEmail set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiEmail) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiEmail clone() {
    return (AppsPeopleOzExternalMergedpeopleapiEmail) super.clone();
  }

}
