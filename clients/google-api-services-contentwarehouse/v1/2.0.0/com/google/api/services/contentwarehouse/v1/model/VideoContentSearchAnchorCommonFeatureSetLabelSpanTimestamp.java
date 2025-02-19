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
 * When an anchor label has a long duration (for example, labels that contain multiple sentences),
 * this field stores the mapping between label segments and the start time.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp extends com.google.api.client.json.GenericJson {

  /**
   * The ASR confidence for the label span, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float asrConfidence;

  /**
   * Whether or not this token is the first token in a sentence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isSentenceStart;

  /**
   * The character index range for the span. The end index is exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long labelBeginCharIndex;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long labelEndCharIndex;

  /**
   * The time of the span.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long timeMs;

  /**
   * The ASR confidence for the label span, if available.
   * @return value or {@code null} for none
   */
  public java.lang.Float getAsrConfidence() {
    return asrConfidence;
  }

  /**
   * The ASR confidence for the label span, if available.
   * @param asrConfidence asrConfidence or {@code null} for none
   */
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp setAsrConfidence(java.lang.Float asrConfidence) {
    this.asrConfidence = asrConfidence;
    return this;
  }

  /**
   * Whether or not this token is the first token in a sentence.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsSentenceStart() {
    return isSentenceStart;
  }

  /**
   * Whether or not this token is the first token in a sentence.
   * @param isSentenceStart isSentenceStart or {@code null} for none
   */
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp setIsSentenceStart(java.lang.Boolean isSentenceStart) {
    this.isSentenceStart = isSentenceStart;
    return this;
  }

  /**
   * The character index range for the span. The end index is exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLabelBeginCharIndex() {
    return labelBeginCharIndex;
  }

  /**
   * The character index range for the span. The end index is exclusive.
   * @param labelBeginCharIndex labelBeginCharIndex or {@code null} for none
   */
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp setLabelBeginCharIndex(java.lang.Long labelBeginCharIndex) {
    this.labelBeginCharIndex = labelBeginCharIndex;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getLabelEndCharIndex() {
    return labelEndCharIndex;
  }

  /**
   * @param labelEndCharIndex labelEndCharIndex or {@code null} for none
   */
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp setLabelEndCharIndex(java.lang.Long labelEndCharIndex) {
    this.labelEndCharIndex = labelEndCharIndex;
    return this;
  }

  /**
   * The time of the span.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTimeMs() {
    return timeMs;
  }

  /**
   * The time of the span.
   * @param timeMs timeMs or {@code null} for none
   */
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp setTimeMs(java.lang.Long timeMs) {
    this.timeMs = timeMs;
    return this;
  }

  @Override
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp set(String fieldName, Object value) {
    return (VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp clone() {
    return (VideoContentSearchAnchorCommonFeatureSetLabelSpanTimestamp) super.clone();
  }

}
