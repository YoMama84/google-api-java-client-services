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
 * Represents the information about user's working hours during one day. Note that a period on
 * Monday from 18:00 - 00:00 is represented as a triplet (1, 1080, 1440).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleInternalAppsWaldoV1alphaAvailabilityPeriod extends com.google.api.client.json.GenericJson {

  /**
   * Day of week, 0 for Sunday, 1 for Monday, ...
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dayOfWeek;

  /**
   * Period end, in minutes from the start of the day, exclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer periodEndMinutes;

  /**
   * Period start, in minutes from the start of the day, inclusive.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer periodStartMinutes;

  /**
   * Day of week, 0 for Sunday, 1 for Monday, ...
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDayOfWeek() {
    return dayOfWeek;
  }

  /**
   * Day of week, 0 for Sunday, 1 for Monday, ...
   * @param dayOfWeek dayOfWeek or {@code null} for none
   */
  public GoogleInternalAppsWaldoV1alphaAvailabilityPeriod setDayOfWeek(java.lang.Integer dayOfWeek) {
    this.dayOfWeek = dayOfWeek;
    return this;
  }

  /**
   * Period end, in minutes from the start of the day, exclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeriodEndMinutes() {
    return periodEndMinutes;
  }

  /**
   * Period end, in minutes from the start of the day, exclusive.
   * @param periodEndMinutes periodEndMinutes or {@code null} for none
   */
  public GoogleInternalAppsWaldoV1alphaAvailabilityPeriod setPeriodEndMinutes(java.lang.Integer periodEndMinutes) {
    this.periodEndMinutes = periodEndMinutes;
    return this;
  }

  /**
   * Period start, in minutes from the start of the day, inclusive.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeriodStartMinutes() {
    return periodStartMinutes;
  }

  /**
   * Period start, in minutes from the start of the day, inclusive.
   * @param periodStartMinutes periodStartMinutes or {@code null} for none
   */
  public GoogleInternalAppsWaldoV1alphaAvailabilityPeriod setPeriodStartMinutes(java.lang.Integer periodStartMinutes) {
    this.periodStartMinutes = periodStartMinutes;
    return this;
  }

  @Override
  public GoogleInternalAppsWaldoV1alphaAvailabilityPeriod set(String fieldName, Object value) {
    return (GoogleInternalAppsWaldoV1alphaAvailabilityPeriod) super.set(fieldName, value);
  }

  @Override
  public GoogleInternalAppsWaldoV1alphaAvailabilityPeriod clone() {
    return (GoogleInternalAppsWaldoV1alphaAvailabilityPeriod) super.clone();
  }

}
