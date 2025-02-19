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
 * Message to represent a "feature property" as an abstract construct. Most feature properties are
 * mapped one to one with the EditProto field types. However in some cases the EditProto field type
 * granularity is too coarse to support use-cases that rely on feature properties (such as per-value
 * rights tracking). When that is the case, the feature property is augmented with a secondary
 * field.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreFeaturePropertyIdProto extends com.google.api.client.json.GenericJson {

  /**
   * Required when field_type == ATTACHMENT.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger attachmentTypeId;

  /**
   * Required when field_type == FEATURE_ATTRIBUTE.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String attributeId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fieldType;

  /**
   * Required when field_type == KNOWLEDGE_GRAPH_PROPERTY.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kgPropertyId;

  /**
   * RESERVED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nameLanguage;

  /**
   * Required when field_type == ATTACHMENT.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAttachmentTypeId() {
    return attachmentTypeId;
  }

  /**
   * Required when field_type == ATTACHMENT.
   * @param attachmentTypeId attachmentTypeId or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto setAttachmentTypeId(java.math.BigInteger attachmentTypeId) {
    this.attachmentTypeId = attachmentTypeId;
    return this;
  }

  /**
   * Required when field_type == FEATURE_ATTRIBUTE.
   * @return value or {@code null} for none
   */
  public java.lang.String getAttributeId() {
    return attributeId;
  }

  /**
   * Required when field_type == FEATURE_ATTRIBUTE.
   * @param attributeId attributeId or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto setAttributeId(java.lang.String attributeId) {
    this.attributeId = attributeId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFieldType() {
    return fieldType;
  }

  /**
   * @param fieldType fieldType or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto setFieldType(java.lang.String fieldType) {
    this.fieldType = fieldType;
    return this;
  }

  /**
   * Required when field_type == KNOWLEDGE_GRAPH_PROPERTY.
   * @return value or {@code null} for none
   */
  public java.lang.String getKgPropertyId() {
    return kgPropertyId;
  }

  /**
   * Required when field_type == KNOWLEDGE_GRAPH_PROPERTY.
   * @param kgPropertyId kgPropertyId or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto setKgPropertyId(java.lang.String kgPropertyId) {
    this.kgPropertyId = kgPropertyId;
    return this;
  }

  /**
   * RESERVED
   * @return value or {@code null} for none
   */
  public java.lang.String getNameLanguage() {
    return nameLanguage;
  }

  /**
   * RESERVED
   * @param nameLanguage nameLanguage or {@code null} for none
   */
  public GeostoreFeaturePropertyIdProto setNameLanguage(java.lang.String nameLanguage) {
    this.nameLanguage = nameLanguage;
    return this;
  }

  @Override
  public GeostoreFeaturePropertyIdProto set(String fieldName, Object value) {
    return (GeostoreFeaturePropertyIdProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreFeaturePropertyIdProto clone() {
    return (GeostoreFeaturePropertyIdProto) super.clone();
  }

}
