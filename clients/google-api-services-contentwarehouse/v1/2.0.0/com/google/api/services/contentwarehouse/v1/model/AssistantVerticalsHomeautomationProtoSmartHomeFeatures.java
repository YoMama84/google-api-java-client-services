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
 * SmartHome feature flags that may be enabled per-item. LINT.IfChange
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantVerticalsHomeautomationProtoSmartHomeFeatures extends com.google.api.client.json.GenericJson {

  /**
   * Flag indicating whether the background Circadian Lighting effect is enabled for a particular
   * light (go/circadian-lighting-e2e).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean circadianLightingEnabled;

  /**
   * Flag indicating whether automatic Energy Savings are enabled for this item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean energySavingsEnabled;

  /**
   * Flag indicating whether Gentle Wake Up is enabled for this item (go/sleep-wake-design).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean gentleWakeupEnabled;

  /**
   * Flag indicating whether the user has enabled / disabled sending Home/Away status updates to the
   * device through the Google custom IntelligenceEvents Matter cluster. (go/google-clusters-design)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean homeAwayOverMatterEnabled;

  /**
   * Flag indicating whether the background Circadian Lighting effect is enabled for a particular
   * light (go/circadian-lighting-e2e).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCircadianLightingEnabled() {
    return circadianLightingEnabled;
  }

  /**
   * Flag indicating whether the background Circadian Lighting effect is enabled for a particular
   * light (go/circadian-lighting-e2e).
   * @param circadianLightingEnabled circadianLightingEnabled or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures setCircadianLightingEnabled(java.lang.Boolean circadianLightingEnabled) {
    this.circadianLightingEnabled = circadianLightingEnabled;
    return this;
  }

  /**
   * Flag indicating whether automatic Energy Savings are enabled for this item.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnergySavingsEnabled() {
    return energySavingsEnabled;
  }

  /**
   * Flag indicating whether automatic Energy Savings are enabled for this item.
   * @param energySavingsEnabled energySavingsEnabled or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures setEnergySavingsEnabled(java.lang.Boolean energySavingsEnabled) {
    this.energySavingsEnabled = energySavingsEnabled;
    return this;
  }

  /**
   * Flag indicating whether Gentle Wake Up is enabled for this item (go/sleep-wake-design).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGentleWakeupEnabled() {
    return gentleWakeupEnabled;
  }

  /**
   * Flag indicating whether Gentle Wake Up is enabled for this item (go/sleep-wake-design).
   * @param gentleWakeupEnabled gentleWakeupEnabled or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures setGentleWakeupEnabled(java.lang.Boolean gentleWakeupEnabled) {
    this.gentleWakeupEnabled = gentleWakeupEnabled;
    return this;
  }

  /**
   * Flag indicating whether the user has enabled / disabled sending Home/Away status updates to the
   * device through the Google custom IntelligenceEvents Matter cluster. (go/google-clusters-design)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHomeAwayOverMatterEnabled() {
    return homeAwayOverMatterEnabled;
  }

  /**
   * Flag indicating whether the user has enabled / disabled sending Home/Away status updates to the
   * device through the Google custom IntelligenceEvents Matter cluster. (go/google-clusters-design)
   * @param homeAwayOverMatterEnabled homeAwayOverMatterEnabled or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures setHomeAwayOverMatterEnabled(java.lang.Boolean homeAwayOverMatterEnabled) {
    this.homeAwayOverMatterEnabled = homeAwayOverMatterEnabled;
    return this;
  }

  @Override
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures set(String fieldName, Object value) {
    return (AssistantVerticalsHomeautomationProtoSmartHomeFeatures) super.set(fieldName, value);
  }

  @Override
  public AssistantVerticalsHomeautomationProtoSmartHomeFeatures clone() {
    return (AssistantVerticalsHomeautomationProtoSmartHomeFeatures) super.clone();
  }

}
