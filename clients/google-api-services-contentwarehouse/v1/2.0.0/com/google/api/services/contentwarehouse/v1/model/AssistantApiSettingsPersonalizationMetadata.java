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
 * Model definition for AssistantApiSettingsPersonalizationMetadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiSettingsPersonalizationMetadata extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String faceMatch;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String personalResults;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String voiceMatch;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFaceMatch() {
    return faceMatch;
  }

  /**
   * @param faceMatch faceMatch or {@code null} for none
   */
  public AssistantApiSettingsPersonalizationMetadata setFaceMatch(java.lang.String faceMatch) {
    this.faceMatch = faceMatch;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPersonalResults() {
    return personalResults;
  }

  /**
   * @param personalResults personalResults or {@code null} for none
   */
  public AssistantApiSettingsPersonalizationMetadata setPersonalResults(java.lang.String personalResults) {
    this.personalResults = personalResults;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getVoiceMatch() {
    return voiceMatch;
  }

  /**
   * @param voiceMatch voiceMatch or {@code null} for none
   */
  public AssistantApiSettingsPersonalizationMetadata setVoiceMatch(java.lang.String voiceMatch) {
    this.voiceMatch = voiceMatch;
    return this;
  }

  @Override
  public AssistantApiSettingsPersonalizationMetadata set(String fieldName, Object value) {
    return (AssistantApiSettingsPersonalizationMetadata) super.set(fieldName, value);
  }

  @Override
  public AssistantApiSettingsPersonalizationMetadata clone() {
    return (AssistantApiSettingsPersonalizationMetadata) super.clone();
  }

}
