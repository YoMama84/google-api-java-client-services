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
 * Collection of input, extracted features and classification output.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntitySignalsEntityClassification extends com.google.api.client.json.GenericJson {

  /**
   * Entity id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Input features used in classification.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<EntitySignalsEntityFeature> features;

  /**
   * Classification output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EntitySignalsClassificationOutput output;

  /**
   * Entity id.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * Entity id.
   * @param entityId entityId or {@code null} for none
   */
  public EntitySignalsEntityClassification setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Input features used in classification.
   * @return value or {@code null} for none
   */
  public java.util.List<EntitySignalsEntityFeature> getFeatures() {
    return features;
  }

  /**
   * Input features used in classification.
   * @param features features or {@code null} for none
   */
  public EntitySignalsEntityClassification setFeatures(java.util.List<EntitySignalsEntityFeature> features) {
    this.features = features;
    return this;
  }

  /**
   * Classification output.
   * @return value or {@code null} for none
   */
  public EntitySignalsClassificationOutput getOutput() {
    return output;
  }

  /**
   * Classification output.
   * @param output output or {@code null} for none
   */
  public EntitySignalsEntityClassification setOutput(EntitySignalsClassificationOutput output) {
    this.output = output;
    return this;
  }

  @Override
  public EntitySignalsEntityClassification set(String fieldName, Object value) {
    return (EntitySignalsEntityClassification) super.set(fieldName, value);
  }

  @Override
  public EntitySignalsEntityClassification clone() {
    return (EntitySignalsEntityClassification) super.clone();
  }

}
