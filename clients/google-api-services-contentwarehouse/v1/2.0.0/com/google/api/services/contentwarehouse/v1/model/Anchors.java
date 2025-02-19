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
 * Model definition for Anchors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Anchors extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnchorsAnchor> anchor;

  /**
   * The total # of local homepage anchors dropped in AnchorAccumulator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long homepageAnchorsDropped;

  /**
   * The index tier from which the anchors were extracted. Note that this is only valid in the
   * anchor record written by linkextractor. The value can be one of the enum values defined in
   * segindexer/types.h.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer indexTier;

  /**
   * The total # of local non-homepage anchors dropped in AnchorAccumulator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long localAnchorsDropped;

  /**
   * The total # of non-local anchors dropped in AnchorAccumulator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long nonlocalAnchorsDropped;

  /**
   * The *_anchors_dropped fields below are not populated by Alexandria, which uses
   * cdoc.anchor_stats instead. The total # of redundant anchors dropped in linkextractor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long redundantAnchorsDropped;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AnchorsRedundantAnchorInfo> redundantanchorinfo;

  /**
   * The total # of supplemental anchors dropped in AnchorAccumulator. ## DEPRECATED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long supplementalAnchorsDropped;

  /**
   * may be implicit
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger targetDocid;

  /**
   * HOST_LEVEL site chunking.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetSite;

  /**
   * This is produced during link extraction but not written out in the linklogs in order to save
   * space.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetUrl;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AnchorsAnchor> getAnchor() {
    return anchor;
  }

  /**
   * @param anchor anchor or {@code null} for none
   */
  public Anchors setAnchor(java.util.List<AnchorsAnchor> anchor) {
    this.anchor = anchor;
    return this;
  }

  /**
   * The total # of local homepage anchors dropped in AnchorAccumulator.
   * @return value or {@code null} for none
   */
  public java.lang.Long getHomepageAnchorsDropped() {
    return homepageAnchorsDropped;
  }

  /**
   * The total # of local homepage anchors dropped in AnchorAccumulator.
   * @param homepageAnchorsDropped homepageAnchorsDropped or {@code null} for none
   */
  public Anchors setHomepageAnchorsDropped(java.lang.Long homepageAnchorsDropped) {
    this.homepageAnchorsDropped = homepageAnchorsDropped;
    return this;
  }

  /**
   * The index tier from which the anchors were extracted. Note that this is only valid in the
   * anchor record written by linkextractor. The value can be one of the enum values defined in
   * segindexer/types.h.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndexTier() {
    return indexTier;
  }

  /**
   * The index tier from which the anchors were extracted. Note that this is only valid in the
   * anchor record written by linkextractor. The value can be one of the enum values defined in
   * segindexer/types.h.
   * @param indexTier indexTier or {@code null} for none
   */
  public Anchors setIndexTier(java.lang.Integer indexTier) {
    this.indexTier = indexTier;
    return this;
  }

  /**
   * The total # of local non-homepage anchors dropped in AnchorAccumulator.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLocalAnchorsDropped() {
    return localAnchorsDropped;
  }

  /**
   * The total # of local non-homepage anchors dropped in AnchorAccumulator.
   * @param localAnchorsDropped localAnchorsDropped or {@code null} for none
   */
  public Anchors setLocalAnchorsDropped(java.lang.Long localAnchorsDropped) {
    this.localAnchorsDropped = localAnchorsDropped;
    return this;
  }

  /**
   * The total # of non-local anchors dropped in AnchorAccumulator.
   * @return value or {@code null} for none
   */
  public java.lang.Long getNonlocalAnchorsDropped() {
    return nonlocalAnchorsDropped;
  }

  /**
   * The total # of non-local anchors dropped in AnchorAccumulator.
   * @param nonlocalAnchorsDropped nonlocalAnchorsDropped or {@code null} for none
   */
  public Anchors setNonlocalAnchorsDropped(java.lang.Long nonlocalAnchorsDropped) {
    this.nonlocalAnchorsDropped = nonlocalAnchorsDropped;
    return this;
  }

  /**
   * The *_anchors_dropped fields below are not populated by Alexandria, which uses
   * cdoc.anchor_stats instead. The total # of redundant anchors dropped in linkextractor.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRedundantAnchorsDropped() {
    return redundantAnchorsDropped;
  }

  /**
   * The *_anchors_dropped fields below are not populated by Alexandria, which uses
   * cdoc.anchor_stats instead. The total # of redundant anchors dropped in linkextractor.
   * @param redundantAnchorsDropped redundantAnchorsDropped or {@code null} for none
   */
  public Anchors setRedundantAnchorsDropped(java.lang.Long redundantAnchorsDropped) {
    this.redundantAnchorsDropped = redundantAnchorsDropped;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<AnchorsRedundantAnchorInfo> getRedundantanchorinfo() {
    return redundantanchorinfo;
  }

  /**
   * @param redundantanchorinfo redundantanchorinfo or {@code null} for none
   */
  public Anchors setRedundantanchorinfo(java.util.List<AnchorsRedundantAnchorInfo> redundantanchorinfo) {
    this.redundantanchorinfo = redundantanchorinfo;
    return this;
  }

  /**
   * The total # of supplemental anchors dropped in AnchorAccumulator. ## DEPRECATED.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSupplementalAnchorsDropped() {
    return supplementalAnchorsDropped;
  }

  /**
   * The total # of supplemental anchors dropped in AnchorAccumulator. ## DEPRECATED.
   * @param supplementalAnchorsDropped supplementalAnchorsDropped or {@code null} for none
   */
  public Anchors setSupplementalAnchorsDropped(java.lang.Long supplementalAnchorsDropped) {
    this.supplementalAnchorsDropped = supplementalAnchorsDropped;
    return this;
  }

  /**
   * may be implicit
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getTargetDocid() {
    return targetDocid;
  }

  /**
   * may be implicit
   * @param targetDocid targetDocid or {@code null} for none
   */
  public Anchors setTargetDocid(java.math.BigInteger targetDocid) {
    this.targetDocid = targetDocid;
    return this;
  }

  /**
   * HOST_LEVEL site chunking.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetSite() {
    return targetSite;
  }

  /**
   * HOST_LEVEL site chunking.
   * @param targetSite targetSite or {@code null} for none
   */
  public Anchors setTargetSite(java.lang.String targetSite) {
    this.targetSite = targetSite;
    return this;
  }

  /**
   * This is produced during link extraction but not written out in the linklogs in order to save
   * space.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetUrl() {
    return targetUrl;
  }

  /**
   * This is produced during link extraction but not written out in the linklogs in order to save
   * space.
   * @param targetUrl targetUrl or {@code null} for none
   */
  public Anchors setTargetUrl(java.lang.String targetUrl) {
    this.targetUrl = targetUrl;
    return this;
  }

  @Override
  public Anchors set(String fieldName, Object value) {
    return (Anchors) super.set(fieldName, value);
  }

  @Override
  public Anchors clone() {
    return (Anchors) super.clone();
  }

}
