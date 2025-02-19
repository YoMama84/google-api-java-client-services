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
 * Representing a dominating branch of the URL tree.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingUrlPatternUrlTreeBigTreeBranch extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingUrlPatternUrlTreeUrlFeatures features;

  /**
   * The fingerprint of the features string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger patternId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet payload;

  /**
   * @return value or {@code null} for none
   */
  public IndexingUrlPatternUrlTreeUrlFeatures getFeatures() {
    return features;
  }

  /**
   * @param features features or {@code null} for none
   */
  public IndexingUrlPatternUrlTreeBigTreeBranch setFeatures(IndexingUrlPatternUrlTreeUrlFeatures features) {
    this.features = features;
    return this;
  }

  /**
   * The fingerprint of the features string.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getPatternId() {
    return patternId;
  }

  /**
   * The fingerprint of the features string.
   * @param patternId patternId or {@code null} for none
   */
  public IndexingUrlPatternUrlTreeBigTreeBranch setPatternId(java.math.BigInteger patternId) {
    this.patternId = patternId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getPayload() {
    return payload;
  }

  /**
   * @param payload payload or {@code null} for none
   */
  public IndexingUrlPatternUrlTreeBigTreeBranch setPayload(Proto2BridgeMessageSet payload) {
    this.payload = payload;
    return this;
  }

  @Override
  public IndexingUrlPatternUrlTreeBigTreeBranch set(String fieldName, Object value) {
    return (IndexingUrlPatternUrlTreeBigTreeBranch) super.set(fieldName, value);
  }

  @Override
  public IndexingUrlPatternUrlTreeBigTreeBranch clone() {
    return (IndexingUrlPatternUrlTreeBigTreeBranch) super.clone();
  }

}
