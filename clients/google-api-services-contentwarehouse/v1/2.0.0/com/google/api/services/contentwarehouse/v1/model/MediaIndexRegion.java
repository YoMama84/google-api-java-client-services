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
 * Metadata associated with a region in an image. NEXT_ID: 13
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MediaIndexRegion extends com.google.api.client.json.GenericJson {

  /**
   * The bounding box corresponding to the region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MediaIndexBoundingbox boundingBox;

  /**
   * Detected Entities found within this region.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MediaIndexEntityField> entityFields;

  static {
    // hack to force ProGuard to consider MediaIndexEntityField used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MediaIndexEntityField.class);
  }

  /**
   * The labels associated with the region encoded as a SparseFloatVector to facilitate dot product
   * computation during sorting. The columns are the fingerprints of the labels and the values are
   * the corresponding confidence scores. The vector is L2 normalized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MediaIndexSparseFloatVector labels;

  /**
   * PRIMI Apparel Features v2 embedding and tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primiApparelFeaturesV2;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> primiApparelTokensV2;

  /**
   * PRIMI Generic Features v2.5 embedding and tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String primiGenericFeaturesV25;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> primiGenericTokensV25;

  /**
   * Starburst v4 embedding and tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String starburstFeaturesV4;

  /**
   * Starburst v5 embedding and tokens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String starburstFeaturesV5;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> starburstTokensV4;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> starburstTokensV5;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageContentStarburstVersionGroup starburstV4;

  /**
   * The bounding box corresponding to the region.
   * @return value or {@code null} for none
   */
  public MediaIndexBoundingbox getBoundingBox() {
    return boundingBox;
  }

  /**
   * The bounding box corresponding to the region.
   * @param boundingBox boundingBox or {@code null} for none
   */
  public MediaIndexRegion setBoundingBox(MediaIndexBoundingbox boundingBox) {
    this.boundingBox = boundingBox;
    return this;
  }

  /**
   * Detected Entities found within this region.
   * @return value or {@code null} for none
   */
  public java.util.List<MediaIndexEntityField> getEntityFields() {
    return entityFields;
  }

  /**
   * Detected Entities found within this region.
   * @param entityFields entityFields or {@code null} for none
   */
  public MediaIndexRegion setEntityFields(java.util.List<MediaIndexEntityField> entityFields) {
    this.entityFields = entityFields;
    return this;
  }

  /**
   * The labels associated with the region encoded as a SparseFloatVector to facilitate dot product
   * computation during sorting. The columns are the fingerprints of the labels and the values are
   * the corresponding confidence scores. The vector is L2 normalized.
   * @return value or {@code null} for none
   */
  public MediaIndexSparseFloatVector getLabels() {
    return labels;
  }

  /**
   * The labels associated with the region encoded as a SparseFloatVector to facilitate dot product
   * computation during sorting. The columns are the fingerprints of the labels and the values are
   * the corresponding confidence scores. The vector is L2 normalized.
   * @param labels labels or {@code null} for none
   */
  public MediaIndexRegion setLabels(MediaIndexSparseFloatVector labels) {
    this.labels = labels;
    return this;
  }

  /**
   * PRIMI Apparel Features v2 embedding and tokens.
   * @see #decodePrimiApparelFeaturesV2()
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimiApparelFeaturesV2() {
    return primiApparelFeaturesV2;
  }

  /**
   * PRIMI Apparel Features v2 embedding and tokens.
   * @see #getPrimiApparelFeaturesV2()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePrimiApparelFeaturesV2() {
    return com.google.api.client.util.Base64.decodeBase64(primiApparelFeaturesV2);
  }

  /**
   * PRIMI Apparel Features v2 embedding and tokens.
   * @see #encodePrimiApparelFeaturesV2()
   * @param primiApparelFeaturesV2 primiApparelFeaturesV2 or {@code null} for none
   */
  public MediaIndexRegion setPrimiApparelFeaturesV2(java.lang.String primiApparelFeaturesV2) {
    this.primiApparelFeaturesV2 = primiApparelFeaturesV2;
    return this;
  }

  /**
   * PRIMI Apparel Features v2 embedding and tokens.
   * @see #setPrimiApparelFeaturesV2()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MediaIndexRegion encodePrimiApparelFeaturesV2(byte[] primiApparelFeaturesV2) {
    this.primiApparelFeaturesV2 = com.google.api.client.util.Base64.encodeBase64URLSafeString(primiApparelFeaturesV2);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrimiApparelTokensV2() {
    return primiApparelTokensV2;
  }

  /**
   * @param primiApparelTokensV2 primiApparelTokensV2 or {@code null} for none
   */
  public MediaIndexRegion setPrimiApparelTokensV2(java.util.List<java.lang.String> primiApparelTokensV2) {
    this.primiApparelTokensV2 = primiApparelTokensV2;
    return this;
  }

  /**
   * PRIMI Generic Features v2.5 embedding and tokens.
   * @see #decodePrimiGenericFeaturesV25()
   * @return value or {@code null} for none
   */
  public java.lang.String getPrimiGenericFeaturesV25() {
    return primiGenericFeaturesV25;
  }

  /**
   * PRIMI Generic Features v2.5 embedding and tokens.
   * @see #getPrimiGenericFeaturesV25()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodePrimiGenericFeaturesV25() {
    return com.google.api.client.util.Base64.decodeBase64(primiGenericFeaturesV25);
  }

  /**
   * PRIMI Generic Features v2.5 embedding and tokens.
   * @see #encodePrimiGenericFeaturesV25()
   * @param primiGenericFeaturesV25 primiGenericFeaturesV25 or {@code null} for none
   */
  public MediaIndexRegion setPrimiGenericFeaturesV25(java.lang.String primiGenericFeaturesV25) {
    this.primiGenericFeaturesV25 = primiGenericFeaturesV25;
    return this;
  }

  /**
   * PRIMI Generic Features v2.5 embedding and tokens.
   * @see #setPrimiGenericFeaturesV25()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MediaIndexRegion encodePrimiGenericFeaturesV25(byte[] primiGenericFeaturesV25) {
    this.primiGenericFeaturesV25 = com.google.api.client.util.Base64.encodeBase64URLSafeString(primiGenericFeaturesV25);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPrimiGenericTokensV25() {
    return primiGenericTokensV25;
  }

  /**
   * @param primiGenericTokensV25 primiGenericTokensV25 or {@code null} for none
   */
  public MediaIndexRegion setPrimiGenericTokensV25(java.util.List<java.lang.String> primiGenericTokensV25) {
    this.primiGenericTokensV25 = primiGenericTokensV25;
    return this;
  }

  /**
   * Starburst v4 embedding and tokens.
   * @see #decodeStarburstFeaturesV4()
   * @return value or {@code null} for none
   */
  public java.lang.String getStarburstFeaturesV4() {
    return starburstFeaturesV4;
  }

  /**
   * Starburst v4 embedding and tokens.
   * @see #getStarburstFeaturesV4()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeStarburstFeaturesV4() {
    return com.google.api.client.util.Base64.decodeBase64(starburstFeaturesV4);
  }

  /**
   * Starburst v4 embedding and tokens.
   * @see #encodeStarburstFeaturesV4()
   * @param starburstFeaturesV4 starburstFeaturesV4 or {@code null} for none
   */
  public MediaIndexRegion setStarburstFeaturesV4(java.lang.String starburstFeaturesV4) {
    this.starburstFeaturesV4 = starburstFeaturesV4;
    return this;
  }

  /**
   * Starburst v4 embedding and tokens.
   * @see #setStarburstFeaturesV4()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MediaIndexRegion encodeStarburstFeaturesV4(byte[] starburstFeaturesV4) {
    this.starburstFeaturesV4 = com.google.api.client.util.Base64.encodeBase64URLSafeString(starburstFeaturesV4);
    return this;
  }

  /**
   * Starburst v5 embedding and tokens.
   * @see #decodeStarburstFeaturesV5()
   * @return value or {@code null} for none
   */
  public java.lang.String getStarburstFeaturesV5() {
    return starburstFeaturesV5;
  }

  /**
   * Starburst v5 embedding and tokens.
   * @see #getStarburstFeaturesV5()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeStarburstFeaturesV5() {
    return com.google.api.client.util.Base64.decodeBase64(starburstFeaturesV5);
  }

  /**
   * Starburst v5 embedding and tokens.
   * @see #encodeStarburstFeaturesV5()
   * @param starburstFeaturesV5 starburstFeaturesV5 or {@code null} for none
   */
  public MediaIndexRegion setStarburstFeaturesV5(java.lang.String starburstFeaturesV5) {
    this.starburstFeaturesV5 = starburstFeaturesV5;
    return this;
  }

  /**
   * Starburst v5 embedding and tokens.
   * @see #setStarburstFeaturesV5()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public MediaIndexRegion encodeStarburstFeaturesV5(byte[] starburstFeaturesV5) {
    this.starburstFeaturesV5 = com.google.api.client.util.Base64.encodeBase64URLSafeString(starburstFeaturesV5);
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStarburstTokensV4() {
    return starburstTokensV4;
  }

  /**
   * @param starburstTokensV4 starburstTokensV4 or {@code null} for none
   */
  public MediaIndexRegion setStarburstTokensV4(java.util.List<java.lang.String> starburstTokensV4) {
    this.starburstTokensV4 = starburstTokensV4;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStarburstTokensV5() {
    return starburstTokensV5;
  }

  /**
   * @param starburstTokensV5 starburstTokensV5 or {@code null} for none
   */
  public MediaIndexRegion setStarburstTokensV5(java.util.List<java.lang.String> starburstTokensV5) {
    this.starburstTokensV5 = starburstTokensV5;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ImageContentStarburstVersionGroup getStarburstV4() {
    return starburstV4;
  }

  /**
   * @param starburstV4 starburstV4 or {@code null} for none
   */
  public MediaIndexRegion setStarburstV4(ImageContentStarburstVersionGroup starburstV4) {
    this.starburstV4 = starburstV4;
    return this;
  }

  @Override
  public MediaIndexRegion set(String fieldName, Object value) {
    return (MediaIndexRegion) super.set(fieldName, value);
  }

  @Override
  public MediaIndexRegion clone() {
    return (MediaIndexRegion) super.clone();
  }

}
