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
 * Indicates a question, requesting the value of a specified slot. Not applicable if the requested
 * slot simultaneously appears as an argument. See go/requested-slots for details. Next ID: 3
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersMarkerOpenQuestion extends com.google.api.client.json.GenericJson {

  /**
   * Note: This is still under development and not available for general use. Contact meaning-
   * platform-eng@ for questions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KnowledgeAnswersMeaningSchemaSlotKey slotKey;

  /**
   * One or multiple slots may be requested by the marker. See go/mrf-multiple-output-slots for
   * details on requesting multiple output slots.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> slotName;

  /**
   * Note: This is still under development and not available for general use. Contact meaning-
   * platform-eng@ for questions.
   * @return value or {@code null} for none
   */
  public KnowledgeAnswersMeaningSchemaSlotKey getSlotKey() {
    return slotKey;
  }

  /**
   * Note: This is still under development and not available for general use. Contact meaning-
   * platform-eng@ for questions.
   * @param slotKey slotKey or {@code null} for none
   */
  public KnowledgeAnswersMarkerOpenQuestion setSlotKey(KnowledgeAnswersMeaningSchemaSlotKey slotKey) {
    this.slotKey = slotKey;
    return this;
  }

  /**
   * One or multiple slots may be requested by the marker. See go/mrf-multiple-output-slots for
   * details on requesting multiple output slots.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSlotName() {
    return slotName;
  }

  /**
   * One or multiple slots may be requested by the marker. See go/mrf-multiple-output-slots for
   * details on requesting multiple output slots.
   * @param slotName slotName or {@code null} for none
   */
  public KnowledgeAnswersMarkerOpenQuestion setSlotName(java.util.List<java.lang.String> slotName) {
    this.slotName = slotName;
    return this;
  }

  @Override
  public KnowledgeAnswersMarkerOpenQuestion set(String fieldName, Object value) {
    return (KnowledgeAnswersMarkerOpenQuestion) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersMarkerOpenQuestion clone() {
    return (KnowledgeAnswersMarkerOpenQuestion) super.clone();
  }

}
