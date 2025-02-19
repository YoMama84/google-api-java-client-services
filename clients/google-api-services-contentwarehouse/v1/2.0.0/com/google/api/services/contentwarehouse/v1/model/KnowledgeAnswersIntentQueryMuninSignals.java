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
 * Signals derived from Munin Function call annotations.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersIntentQueryMuninSignals extends com.google.api.client.json.GenericJson {

  /**
   * If the modifier is only a good soft modifier by itself, then we would trigger only if it's the
   * only modifier
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isIsolated;

  /**
   * Signals for $ListQueryRuleWithSoftModifier. Collections allowed by the soft modifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> softModifierCollection;

  /**
   * If true, the text for this argument did not come from the query, but was generated somehow
   * else.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean textIsGenerated;

  /**
   * If the modifier is only a good soft modifier by itself, then we would trigger only if it's the
   * only modifier
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsIsolated() {
    return isIsolated;
  }

  /**
   * If the modifier is only a good soft modifier by itself, then we would trigger only if it's the
   * only modifier
   * @param isIsolated isIsolated or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryMuninSignals setIsIsolated(java.lang.Boolean isIsolated) {
    this.isIsolated = isIsolated;
    return this;
  }

  /**
   * Signals for $ListQueryRuleWithSoftModifier. Collections allowed by the soft modifier.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSoftModifierCollection() {
    return softModifierCollection;
  }

  /**
   * Signals for $ListQueryRuleWithSoftModifier. Collections allowed by the soft modifier.
   * @param softModifierCollection softModifierCollection or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryMuninSignals setSoftModifierCollection(java.util.List<java.lang.String> softModifierCollection) {
    this.softModifierCollection = softModifierCollection;
    return this;
  }

  /**
   * If true, the text for this argument did not come from the query, but was generated somehow
   * else.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTextIsGenerated() {
    return textIsGenerated;
  }

  /**
   * If true, the text for this argument did not come from the query, but was generated somehow
   * else.
   * @param textIsGenerated textIsGenerated or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryMuninSignals setTextIsGenerated(java.lang.Boolean textIsGenerated) {
    this.textIsGenerated = textIsGenerated;
    return this;
  }

  @Override
  public KnowledgeAnswersIntentQueryMuninSignals set(String fieldName, Object value) {
    return (KnowledgeAnswersIntentQueryMuninSignals) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersIntentQueryMuninSignals clone() {
    return (KnowledgeAnswersIntentQueryMuninSignals) super.clone();
  }

}
