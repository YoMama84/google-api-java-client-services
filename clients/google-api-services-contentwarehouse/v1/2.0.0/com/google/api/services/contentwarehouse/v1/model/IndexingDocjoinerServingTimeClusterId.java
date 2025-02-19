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
 * The serving cluster id metadata. Why we cluster the documents. The default value is UNKNOWN.
 * Serving-Side Clustering is used for pages which represent the same content but are not identical
 * (e.g. translated pages, or paginated content). Those documents are not dup-clustered in
 * Alexandria so that all documents (and their tokens) are available to search queries. However,
 * those documents are assigned the same Serving-Time-Cluster-ID (on the same reasontype), which
 * during serving guarantees that only one of them is shown to the user.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingDocjoinerServingTimeClusterId extends com.google.api.client.json.GenericJson {

  /**
   * The unique id to distinguish members in cluster. It could be generated in different ways
   * according to reason, e.g. LINK_REL_NEXT_PREVIOUS: it is the fingerprint of the URL of index 0;
   * PAGE_PARAMETER_INFO: it is the fingerprint of pagination pattern (pagination_pattern_fp field
   * in PageParamInfo message).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger clusterId;

  /**
   * The member index of this document in cluster. Starts from "0". Note that indices of pages in a
   * cluster may not be consistent with each other, because we may update them at different points
   * in time. Currently only used for debugging.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer indexForDebugging;

  /**
   * The reason why this document is clustered into this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reason;

  /**
   * The unique id to distinguish members in cluster. It could be generated in different ways
   * according to reason, e.g. LINK_REL_NEXT_PREVIOUS: it is the fingerprint of the URL of index 0;
   * PAGE_PARAMETER_INFO: it is the fingerprint of pagination pattern (pagination_pattern_fp field
   * in PageParamInfo message).
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getClusterId() {
    return clusterId;
  }

  /**
   * The unique id to distinguish members in cluster. It could be generated in different ways
   * according to reason, e.g. LINK_REL_NEXT_PREVIOUS: it is the fingerprint of the URL of index 0;
   * PAGE_PARAMETER_INFO: it is the fingerprint of pagination pattern (pagination_pattern_fp field
   * in PageParamInfo message).
   * @param clusterId clusterId or {@code null} for none
   */
  public IndexingDocjoinerServingTimeClusterId setClusterId(java.math.BigInteger clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The member index of this document in cluster. Starts from "0". Note that indices of pages in a
   * cluster may not be consistent with each other, because we may update them at different points
   * in time. Currently only used for debugging.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndexForDebugging() {
    return indexForDebugging;
  }

  /**
   * The member index of this document in cluster. Starts from "0". Note that indices of pages in a
   * cluster may not be consistent with each other, because we may update them at different points
   * in time. Currently only used for debugging.
   * @param indexForDebugging indexForDebugging or {@code null} for none
   */
  public IndexingDocjoinerServingTimeClusterId setIndexForDebugging(java.lang.Integer indexForDebugging) {
    this.indexForDebugging = indexForDebugging;
    return this;
  }

  /**
   * The reason why this document is clustered into this cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getReason() {
    return reason;
  }

  /**
   * The reason why this document is clustered into this cluster.
   * @param reason reason or {@code null} for none
   */
  public IndexingDocjoinerServingTimeClusterId setReason(java.lang.String reason) {
    this.reason = reason;
    return this;
  }

  @Override
  public IndexingDocjoinerServingTimeClusterId set(String fieldName, Object value) {
    return (IndexingDocjoinerServingTimeClusterId) super.set(fieldName, value);
  }

  @Override
  public IndexingDocjoinerServingTimeClusterId clone() {
    return (IndexingDocjoinerServingTimeClusterId) super.clone();
  }

}
