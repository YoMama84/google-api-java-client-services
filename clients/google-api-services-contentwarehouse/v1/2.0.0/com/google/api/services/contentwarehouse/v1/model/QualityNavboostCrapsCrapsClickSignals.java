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
 * Click / impression signals for craps. The tag numbers are the same as they were in the original
 * CrapsData (below). This is deliberate.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityNavboostCrapsCrapsClickSignals extends com.google.api.client.json.GenericJson {

  /**
   * Thus far this field is only used for host level unsquashed impressions. When compressed (e.g.,
   * in perdocdata.proto, CompressedQualitySignals), this value is represented individually and thus
   * is generally incompatible with the other values which are compressed as click-ratios.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double absoluteImpressions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double badClicks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double clicks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double goodClicks;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double impressions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lastLongestClicks;

  /**
   * The subset of clicks that are associated with an event from a Unicorn user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unicornClicks;

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unsquashedClicks;

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unsquashedImpressions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double unsquashedLastLongestClicks;

  /**
   * Thus far this field is only used for host level unsquashed impressions. When compressed (e.g.,
   * in perdocdata.proto, CompressedQualitySignals), this value is represented individually and thus
   * is generally incompatible with the other values which are compressed as click-ratios.
   * @return value or {@code null} for none
   */
  public java.lang.Double getAbsoluteImpressions() {
    return absoluteImpressions;
  }

  /**
   * Thus far this field is only used for host level unsquashed impressions. When compressed (e.g.,
   * in perdocdata.proto, CompressedQualitySignals), this value is represented individually and thus
   * is generally incompatible with the other values which are compressed as click-ratios.
   * @param absoluteImpressions absoluteImpressions or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setAbsoluteImpressions(java.lang.Double absoluteImpressions) {
    this.absoluteImpressions = absoluteImpressions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getBadClicks() {
    return badClicks;
  }

  /**
   * @param badClicks badClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setBadClicks(java.lang.Double badClicks) {
    this.badClicks = badClicks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getClicks() {
    return clicks;
  }

  /**
   * @param clicks clicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setClicks(java.lang.Double clicks) {
    this.clicks = clicks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getGoodClicks() {
    return goodClicks;
  }

  /**
   * @param goodClicks goodClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setGoodClicks(java.lang.Double goodClicks) {
    this.goodClicks = goodClicks;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getImpressions() {
    return impressions;
  }

  /**
   * @param impressions impressions or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setImpressions(java.lang.Double impressions) {
    this.impressions = impressions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLastLongestClicks() {
    return lastLongestClicks;
  }

  /**
   * @param lastLongestClicks lastLongestClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setLastLongestClicks(java.lang.Double lastLongestClicks) {
    this.lastLongestClicks = lastLongestClicks;
    return this;
  }

  /**
   * The subset of clicks that are associated with an event from a Unicorn user.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnicornClicks() {
    return unicornClicks;
  }

  /**
   * The subset of clicks that are associated with an event from a Unicorn user.
   * @param unicornClicks unicornClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setUnicornClicks(java.lang.Double unicornClicks) {
    this.unicornClicks = unicornClicks;
    return this;
  }

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnsquashedClicks() {
    return unsquashedClicks;
  }

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * @param unsquashedClicks unsquashedClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setUnsquashedClicks(java.lang.Double unsquashedClicks) {
    this.unsquashedClicks = unsquashedClicks;
    return this;
  }

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnsquashedImpressions() {
    return unsquashedImpressions;
  }

  /**
   * This is not being populated for the current format - instead two instances of CrapsClickSignals
   * (squashed/unsquashed) are used. We are migrating to the new format where this field will be
   * populated.
   * @param unsquashedImpressions unsquashedImpressions or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setUnsquashedImpressions(java.lang.Double unsquashedImpressions) {
    this.unsquashedImpressions = unsquashedImpressions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getUnsquashedLastLongestClicks() {
    return unsquashedLastLongestClicks;
  }

  /**
   * @param unsquashedLastLongestClicks unsquashedLastLongestClicks or {@code null} for none
   */
  public QualityNavboostCrapsCrapsClickSignals setUnsquashedLastLongestClicks(java.lang.Double unsquashedLastLongestClicks) {
    this.unsquashedLastLongestClicks = unsquashedLastLongestClicks;
    return this;
  }

  @Override
  public QualityNavboostCrapsCrapsClickSignals set(String fieldName, Object value) {
    return (QualityNavboostCrapsCrapsClickSignals) super.set(fieldName, value);
  }

  @Override
  public QualityNavboostCrapsCrapsClickSignals clone() {
    return (QualityNavboostCrapsCrapsClickSignals) super.clone();
  }

}
