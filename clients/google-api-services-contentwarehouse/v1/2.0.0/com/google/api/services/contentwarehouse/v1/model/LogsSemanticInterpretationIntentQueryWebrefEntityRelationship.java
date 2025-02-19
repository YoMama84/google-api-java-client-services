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
 * Logs version of the repository_webref.WebrefEntityRelationship proto Used to represent QRef
 * implications
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LogsSemanticInterpretationIntentQueryWebrefEntityRelationship extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer entityIndex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LogsSemanticInterpretationIntentQueryEntityLinkMetadata linkMetadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float linkWeight;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getEntityIndex() {
    return entityIndex;
  }

  /**
   * @param entityIndex entityIndex or {@code null} for none
   */
  public LogsSemanticInterpretationIntentQueryWebrefEntityRelationship setEntityIndex(java.lang.Integer entityIndex) {
    this.entityIndex = entityIndex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public LogsSemanticInterpretationIntentQueryEntityLinkMetadata getLinkMetadata() {
    return linkMetadata;
  }

  /**
   * @param linkMetadata linkMetadata or {@code null} for none
   */
  public LogsSemanticInterpretationIntentQueryWebrefEntityRelationship setLinkMetadata(LogsSemanticInterpretationIntentQueryEntityLinkMetadata linkMetadata) {
    this.linkMetadata = linkMetadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getLinkWeight() {
    return linkWeight;
  }

  /**
   * @param linkWeight linkWeight or {@code null} for none
   */
  public LogsSemanticInterpretationIntentQueryWebrefEntityRelationship setLinkWeight(java.lang.Float linkWeight) {
    this.linkWeight = linkWeight;
    return this;
  }

  @Override
  public LogsSemanticInterpretationIntentQueryWebrefEntityRelationship set(String fieldName, Object value) {
    return (LogsSemanticInterpretationIntentQueryWebrefEntityRelationship) super.set(fieldName, value);
  }

  @Override
  public LogsSemanticInterpretationIntentQueryWebrefEntityRelationship clone() {
    return (LogsSemanticInterpretationIntentQueryWebrefEntityRelationship) super.clone();
  }

}
