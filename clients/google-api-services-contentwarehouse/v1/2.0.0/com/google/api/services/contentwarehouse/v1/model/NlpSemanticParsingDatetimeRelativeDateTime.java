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
 * This provides a semi-abstract description for relative datetime expressions. -
 * ShiftedRelativeDateTime encodes datetimes that arise from before/after expressions (e.g. [three
 * days ago], [2 days after March 1st]). - FetchedRelativeDateTime encodes expressions that are
 * retrieval-type statements (e.g. [next weekend], [the last two Mondays]). Next field: 5
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingDatetimeRelativeDateTime extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeFetchedRelativeDateTime fetched;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String metadata;

  /**
   * When a relative datetime which resolves into a range is being used as the endpoint of a range
   * (begin_relative/end_relative), its begin/end will be taken accordingly unless this modifier
   * indicates the opposite: begin_relative with relative range and modifier == AFTER means that its
   * end will be taken as the beginning of the resulting range. Similarly, end_relative with a
   * relative range and modifier == BEFORE means that its begin will be taken as the end of the
   * resulting range. E.g. "after next month" will be a range with a begin_relative that will take
   * the end of "next month" as its starting point (exclusive). values other than AFTER and BEFORE
   * in the specific conditions explained here will be ignored and have no effect in the resolution
   * of RelativeDateTimes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modifier;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeShiftedRelativeDateTime shifted;

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeFetchedRelativeDateTime getFetched() {
    return fetched;
  }

  /**
   * @param fetched fetched or {@code null} for none
   */
  public NlpSemanticParsingDatetimeRelativeDateTime setFetched(NlpSemanticParsingDatetimeFetchedRelativeDateTime fetched) {
    this.fetched = fetched;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public NlpSemanticParsingDatetimeRelativeDateTime setMetadata(java.lang.String metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * When a relative datetime which resolves into a range is being used as the endpoint of a range
   * (begin_relative/end_relative), its begin/end will be taken accordingly unless this modifier
   * indicates the opposite: begin_relative with relative range and modifier == AFTER means that its
   * end will be taken as the beginning of the resulting range. Similarly, end_relative with a
   * relative range and modifier == BEFORE means that its begin will be taken as the end of the
   * resulting range. E.g. "after next month" will be a range with a begin_relative that will take
   * the end of "next month" as its starting point (exclusive). values other than AFTER and BEFORE
   * in the specific conditions explained here will be ignored and have no effect in the resolution
   * of RelativeDateTimes.
   * @return value or {@code null} for none
   */
  public java.lang.String getModifier() {
    return modifier;
  }

  /**
   * When a relative datetime which resolves into a range is being used as the endpoint of a range
   * (begin_relative/end_relative), its begin/end will be taken accordingly unless this modifier
   * indicates the opposite: begin_relative with relative range and modifier == AFTER means that its
   * end will be taken as the beginning of the resulting range. Similarly, end_relative with a
   * relative range and modifier == BEFORE means that its begin will be taken as the end of the
   * resulting range. E.g. "after next month" will be a range with a begin_relative that will take
   * the end of "next month" as its starting point (exclusive). values other than AFTER and BEFORE
   * in the specific conditions explained here will be ignored and have no effect in the resolution
   * of RelativeDateTimes.
   * @param modifier modifier or {@code null} for none
   */
  public NlpSemanticParsingDatetimeRelativeDateTime setModifier(java.lang.String modifier) {
    this.modifier = modifier;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeShiftedRelativeDateTime getShifted() {
    return shifted;
  }

  /**
   * @param shifted shifted or {@code null} for none
   */
  public NlpSemanticParsingDatetimeRelativeDateTime setShifted(NlpSemanticParsingDatetimeShiftedRelativeDateTime shifted) {
    this.shifted = shifted;
    return this;
  }

  @Override
  public NlpSemanticParsingDatetimeRelativeDateTime set(String fieldName, Object value) {
    return (NlpSemanticParsingDatetimeRelativeDateTime) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingDatetimeRelativeDateTime clone() {
    return (NlpSemanticParsingDatetimeRelativeDateTime) super.clone();
  }

}
