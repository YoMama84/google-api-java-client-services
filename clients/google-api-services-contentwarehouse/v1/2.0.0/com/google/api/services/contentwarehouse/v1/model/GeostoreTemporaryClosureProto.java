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
 * This protocol buffer stores information related to temporary closure of a feature. The only
 * allowed precisions for a date is PRECISION_DAY. DateTimeProto.seconds should have the lowest
 * legal value for the desired date/time and precision. E.g. for PRECISION_MONTH, 2019-02-15
 * 21:10:30 is not valid, it should be 2019-02-01 00:00:00 instead. NOTE: Each date is stored in UTC
 * but should be interpreted as being in the local timezone. So clients should convert the
 * DateTimeProto to local (civil) time using UTC+0, and then treat the result as local to the
 * feature.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreTemporaryClosureProto extends com.google.api.client.json.GenericJson {

  /**
   * The latest when this closure may end, if the exact date is unknown. If set, the feature is
   * operational again no later than this date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto endAsOfDate;

  /**
   * RESERVED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto endDate;

  /**
   * The latest when this closure may start, if the exact date is unknown. If set, the feature is
   * temporarily closed starting no later than this date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto startAsOfDate;

  /**
   * RESERVED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto startDate;

  /**
   * The latest when this closure may end, if the exact date is unknown. If set, the feature is
   * operational again no later than this date.
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getEndAsOfDate() {
    return endAsOfDate;
  }

  /**
   * The latest when this closure may end, if the exact date is unknown. If set, the feature is
   * operational again no later than this date.
   * @param endAsOfDate endAsOfDate or {@code null} for none
   */
  public GeostoreTemporaryClosureProto setEndAsOfDate(GeostoreDateTimeProto endAsOfDate) {
    this.endAsOfDate = endAsOfDate;
    return this;
  }

  /**
   * RESERVED
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getEndDate() {
    return endDate;
  }

  /**
   * RESERVED
   * @param endDate endDate or {@code null} for none
   */
  public GeostoreTemporaryClosureProto setEndDate(GeostoreDateTimeProto endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The latest when this closure may start, if the exact date is unknown. If set, the feature is
   * temporarily closed starting no later than this date.
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getStartAsOfDate() {
    return startAsOfDate;
  }

  /**
   * The latest when this closure may start, if the exact date is unknown. If set, the feature is
   * temporarily closed starting no later than this date.
   * @param startAsOfDate startAsOfDate or {@code null} for none
   */
  public GeostoreTemporaryClosureProto setStartAsOfDate(GeostoreDateTimeProto startAsOfDate) {
    this.startAsOfDate = startAsOfDate;
    return this;
  }

  /**
   * RESERVED
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getStartDate() {
    return startDate;
  }

  /**
   * RESERVED
   * @param startDate startDate or {@code null} for none
   */
  public GeostoreTemporaryClosureProto setStartDate(GeostoreDateTimeProto startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public GeostoreTemporaryClosureProto set(String fieldName, Object value) {
    return (GeostoreTemporaryClosureProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreTemporaryClosureProto clone() {
    return (GeostoreTemporaryClosureProto) super.clone();
  }

}
