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
 * Model definition for EntitySignalsEntityFeature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EntitySignalsEntityFeature extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Name of the feature. For a completely list of available features, please check
   * http://go/entityclassifierfeatures
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Value of the feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float value;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * @param code code or {@code null} for none
   */
  public EntitySignalsEntityFeature setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Name of the feature. For a completely list of available features, please check
   * http://go/entityclassifierfeatures
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the feature. For a completely list of available features, please check
   * http://go/entityclassifierfeatures
   * @param name name or {@code null} for none
   */
  public EntitySignalsEntityFeature setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Value of the feature.
   * @return value or {@code null} for none
   */
  public java.lang.Float getValue() {
    return value;
  }

  /**
   * Value of the feature.
   * @param value value or {@code null} for none
   */
  public EntitySignalsEntityFeature setValue(java.lang.Float value) {
    this.value = value;
    return this;
  }

  @Override
  public EntitySignalsEntityFeature set(String fieldName, Object value) {
    return (EntitySignalsEntityFeature) super.set(fieldName, value);
  }

  @Override
  public EntitySignalsEntityFeature clone() {
    return (EntitySignalsEntityFeature) super.clone();
  }

}
