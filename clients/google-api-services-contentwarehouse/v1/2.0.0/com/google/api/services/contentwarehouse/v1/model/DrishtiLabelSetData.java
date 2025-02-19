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
 * Model definition for DrishtiLabelSetData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DrishtiLabelSetData extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DrishtiFeatureExtra> extra;

  static {
    // hack to force ProGuard to consider DrishtiFeatureExtra used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DrishtiFeatureExtra.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DrishtiFeatureExtra generalExtra;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> targetClass;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> targetClassName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> targetValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Float> targetWeight;

  /**
   * Weight assigned to this set of labels.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float weight;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<DrishtiFeatureExtra> getExtra() {
    return extra;
  }

  /**
   * @param extra extra or {@code null} for none
   */
  public DrishtiLabelSetData setExtra(java.util.List<DrishtiFeatureExtra> extra) {
    this.extra = extra;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DrishtiFeatureExtra getGeneralExtra() {
    return generalExtra;
  }

  /**
   * @param generalExtra generalExtra or {@code null} for none
   */
  public DrishtiLabelSetData setGeneralExtra(DrishtiFeatureExtra generalExtra) {
    this.generalExtra = generalExtra;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getTargetClass() {
    return targetClass;
  }

  /**
   * @param targetClass targetClass or {@code null} for none
   */
  public DrishtiLabelSetData setTargetClass(java.util.List<java.math.BigInteger> targetClass) {
    this.targetClass = targetClass;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTargetClassName() {
    return targetClassName;
  }

  /**
   * @param targetClassName targetClassName or {@code null} for none
   */
  public DrishtiLabelSetData setTargetClassName(java.util.List<java.lang.String> targetClassName) {
    this.targetClassName = targetClassName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getTargetValue() {
    return targetValue;
  }

  /**
   * @param targetValue targetValue or {@code null} for none
   */
  public DrishtiLabelSetData setTargetValue(java.util.List<java.lang.Float> targetValue) {
    this.targetValue = targetValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Float> getTargetWeight() {
    return targetWeight;
  }

  /**
   * @param targetWeight targetWeight or {@code null} for none
   */
  public DrishtiLabelSetData setTargetWeight(java.util.List<java.lang.Float> targetWeight) {
    this.targetWeight = targetWeight;
    return this;
  }

  /**
   * Weight assigned to this set of labels.
   * @return value or {@code null} for none
   */
  public java.lang.Float getWeight() {
    return weight;
  }

  /**
   * Weight assigned to this set of labels.
   * @param weight weight or {@code null} for none
   */
  public DrishtiLabelSetData setWeight(java.lang.Float weight) {
    this.weight = weight;
    return this;
  }

  @Override
  public DrishtiLabelSetData set(String fieldName, Object value) {
    return (DrishtiLabelSetData) super.set(fieldName, value);
  }

  @Override
  public DrishtiLabelSetData clone() {
    return (DrishtiLabelSetData) super.clone();
  }

}
