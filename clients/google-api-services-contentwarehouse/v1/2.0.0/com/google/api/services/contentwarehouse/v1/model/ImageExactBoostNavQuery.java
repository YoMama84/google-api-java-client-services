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
 * Navboost query data.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageExactBoostNavQuery extends com.google.api.client.json.GenericJson {

  /**
   * Associated confidence scores for the image for the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer confidence;

  /**
   * Click-based rank of the image for this query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer imageClickRank;

  /**
   * Query fingerprint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger navFp;

  /**
   * The normalized raw query text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String navQuery;

  /**
   * List of all referrers, sorted by their rank (stored in Moosedog).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> referrerDocid;

  /**
   * Rank of the current web doc referrer (stored in docjoins).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer referrerRank;

  /**
   * Associated confidence scores for the image for the query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getConfidence() {
    return confidence;
  }

  /**
   * Associated confidence scores for the image for the query.
   * @param confidence confidence or {@code null} for none
   */
  public ImageExactBoostNavQuery setConfidence(java.lang.Integer confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Click-based rank of the image for this query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getImageClickRank() {
    return imageClickRank;
  }

  /**
   * Click-based rank of the image for this query.
   * @param imageClickRank imageClickRank or {@code null} for none
   */
  public ImageExactBoostNavQuery setImageClickRank(java.lang.Integer imageClickRank) {
    this.imageClickRank = imageClickRank;
    return this;
  }

  /**
   * Query fingerprint.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getNavFp() {
    return navFp;
  }

  /**
   * Query fingerprint.
   * @param navFp navFp or {@code null} for none
   */
  public ImageExactBoostNavQuery setNavFp(java.math.BigInteger navFp) {
    this.navFp = navFp;
    return this;
  }

  /**
   * The normalized raw query text.
   * @return value or {@code null} for none
   */
  public java.lang.String getNavQuery() {
    return navQuery;
  }

  /**
   * The normalized raw query text.
   * @param navQuery navQuery or {@code null} for none
   */
  public ImageExactBoostNavQuery setNavQuery(java.lang.String navQuery) {
    this.navQuery = navQuery;
    return this;
  }

  /**
   * List of all referrers, sorted by their rank (stored in Moosedog).
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getReferrerDocid() {
    return referrerDocid;
  }

  /**
   * List of all referrers, sorted by their rank (stored in Moosedog).
   * @param referrerDocid referrerDocid or {@code null} for none
   */
  public ImageExactBoostNavQuery setReferrerDocid(java.util.List<java.math.BigInteger> referrerDocid) {
    this.referrerDocid = referrerDocid;
    return this;
  }

  /**
   * Rank of the current web doc referrer (stored in docjoins).
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReferrerRank() {
    return referrerRank;
  }

  /**
   * Rank of the current web doc referrer (stored in docjoins).
   * @param referrerRank referrerRank or {@code null} for none
   */
  public ImageExactBoostNavQuery setReferrerRank(java.lang.Integer referrerRank) {
    this.referrerRank = referrerRank;
    return this;
  }

  @Override
  public ImageExactBoostNavQuery set(String fieldName, Object value) {
    return (ImageExactBoostNavQuery) super.set(fieldName, value);
  }

  @Override
  public ImageExactBoostNavQuery clone() {
    return (ImageExactBoostNavQuery) super.clone();
  }

}
