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
 * Quality constraints about the establishment. In the future we can add to this message Zagat
 * ratings, user reviews, etc. Next ID: 6.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingLocalQualityConstraint extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean best;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean highlyRated;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String starType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingLocalStarRatings stars;

  /**
   * The user mentioned something about quality, but didn't mention a specific constraint. This is
   * used to indicate an intent to remove all quality constraints, in queries like [forget the
   * rating].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean unspecified;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBest() {
    return best;
  }

  /**
   * @param best best or {@code null} for none
   */
  public NlpSemanticParsingLocalQualityConstraint setBest(java.lang.Boolean best) {
    this.best = best;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHighlyRated() {
    return highlyRated;
  }

  /**
   * @param highlyRated highlyRated or {@code null} for none
   */
  public NlpSemanticParsingLocalQualityConstraint setHighlyRated(java.lang.Boolean highlyRated) {
    this.highlyRated = highlyRated;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStarType() {
    return starType;
  }

  /**
   * @param starType starType or {@code null} for none
   */
  public NlpSemanticParsingLocalQualityConstraint setStarType(java.lang.String starType) {
    this.starType = starType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingLocalStarRatings getStars() {
    return stars;
  }

  /**
   * @param stars stars or {@code null} for none
   */
  public NlpSemanticParsingLocalQualityConstraint setStars(NlpSemanticParsingLocalStarRatings stars) {
    this.stars = stars;
    return this;
  }

  /**
   * The user mentioned something about quality, but didn't mention a specific constraint. This is
   * used to indicate an intent to remove all quality constraints, in queries like [forget the
   * rating].
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnspecified() {
    return unspecified;
  }

  /**
   * The user mentioned something about quality, but didn't mention a specific constraint. This is
   * used to indicate an intent to remove all quality constraints, in queries like [forget the
   * rating].
   * @param unspecified unspecified or {@code null} for none
   */
  public NlpSemanticParsingLocalQualityConstraint setUnspecified(java.lang.Boolean unspecified) {
    this.unspecified = unspecified;
    return this;
  }

  @Override
  public NlpSemanticParsingLocalQualityConstraint set(String fieldName, Object value) {
    return (NlpSemanticParsingLocalQualityConstraint) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingLocalQualityConstraint clone() {
    return (NlpSemanticParsingLocalQualityConstraint) super.clone();
  }

}
