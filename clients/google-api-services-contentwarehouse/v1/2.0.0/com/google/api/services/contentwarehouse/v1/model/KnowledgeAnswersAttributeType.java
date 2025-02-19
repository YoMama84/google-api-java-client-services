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
 * An attribute type configures a value whose type is intended to be a attribute defined in the
 * schema.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersAttributeType extends com.google.api.client.json.GenericJson {

  /**
   * Use in parsing: the value filled with must be in the list of this. If no attribute ids are
   * specified, this value can be filled with any attribute.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attribute;

  /**
   * If exist, the attribute will be applied on the given pivot slot. This helps type checking when
   * qrewrite constructs function calls with an attribute-typed slot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pivotEntitySlot;

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpMeaningMeaningRemodelings remodelings;

  /**
   * Use in parsing: the value filled with must be in the list of this. If no attribute ids are
   * specified, this value can be filled with any attribute.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttribute() {
    return attribute;
  }

  /**
   * Use in parsing: the value filled with must be in the list of this. If no attribute ids are
   * specified, this value can be filled with any attribute.
   * @param attribute attribute or {@code null} for none
   */
  public KnowledgeAnswersAttributeType setAttribute(java.util.List<java.lang.String> attribute) {
    this.attribute = attribute;
    return this;
  }

  /**
   * If exist, the attribute will be applied on the given pivot slot. This helps type checking when
   * qrewrite constructs function calls with an attribute-typed slot.
   * @return value or {@code null} for none
   */
  public java.lang.String getPivotEntitySlot() {
    return pivotEntitySlot;
  }

  /**
   * If exist, the attribute will be applied on the given pivot slot. This helps type checking when
   * qrewrite constructs function calls with an attribute-typed slot.
   * @param pivotEntitySlot pivotEntitySlot or {@code null} for none
   */
  public KnowledgeAnswersAttributeType setPivotEntitySlot(java.lang.String pivotEntitySlot) {
    this.pivotEntitySlot = pivotEntitySlot;
    return this;
  }

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @return value or {@code null} for none
   */
  public NlpMeaningMeaningRemodelings getRemodelings() {
    return remodelings;
  }

  /**
   * Contains data about current schema remodelings at this ValueType level. For more information
   * see go/meaning-remodeling-framework.
   * @param remodelings remodelings or {@code null} for none
   */
  public KnowledgeAnswersAttributeType setRemodelings(NlpMeaningMeaningRemodelings remodelings) {
    this.remodelings = remodelings;
    return this;
  }

  @Override
  public KnowledgeAnswersAttributeType set(String fieldName, Object value) {
    return (KnowledgeAnswersAttributeType) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersAttributeType clone() {
    return (KnowledgeAnswersAttributeType) super.clone();
  }

}
