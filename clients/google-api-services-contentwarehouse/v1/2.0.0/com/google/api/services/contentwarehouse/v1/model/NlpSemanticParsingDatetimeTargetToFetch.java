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
 * Next field: 9
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingDatetimeTargetToFetch extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeEvent event;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fuzzyRange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String month;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quarter;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reference;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String season;

  /**
   * Unnamed target: "week", "month" etc. E.g., "1st week of April".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unit;

  /**
   * Named target: only one of the following is expected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> weekday;

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeEvent getEvent() {
    return event;
  }

  /**
   * @param event event or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setEvent(NlpSemanticParsingDatetimeEvent event) {
    this.event = event;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFuzzyRange() {
    return fuzzyRange;
  }

  /**
   * @param fuzzyRange fuzzyRange or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setFuzzyRange(java.lang.String fuzzyRange) {
    this.fuzzyRange = fuzzyRange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMonth() {
    return month;
  }

  /**
   * @param month month or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setMonth(java.lang.String month) {
    this.month = month;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getQuarter() {
    return quarter;
  }

  /**
   * @param quarter quarter or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setQuarter(java.lang.String quarter) {
    this.quarter = quarter;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getReference() {
    return reference;
  }

  /**
   * @param reference reference or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setReference(java.lang.String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSeason() {
    return season;
  }

  /**
   * @param season season or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setSeason(java.lang.String season) {
    this.season = season;
    return this;
  }

  /**
   * Unnamed target: "week", "month" etc. E.g., "1st week of April".
   * @return value or {@code null} for none
   */
  public java.lang.String getUnit() {
    return unit;
  }

  /**
   * Unnamed target: "week", "month" etc. E.g., "1st week of April".
   * @param unit unit or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setUnit(java.lang.String unit) {
    this.unit = unit;
    return this;
  }

  /**
   * Named target: only one of the following is expected.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWeekday() {
    return weekday;
  }

  /**
   * Named target: only one of the following is expected.
   * @param weekday weekday or {@code null} for none
   */
  public NlpSemanticParsingDatetimeTargetToFetch setWeekday(java.util.List<java.lang.String> weekday) {
    this.weekday = weekday;
    return this;
  }

  @Override
  public NlpSemanticParsingDatetimeTargetToFetch set(String fieldName, Object value) {
    return (NlpSemanticParsingDatetimeTargetToFetch) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingDatetimeTargetToFetch clone() {
    return (NlpSemanticParsingDatetimeTargetToFetch) super.clone();
  }

}
