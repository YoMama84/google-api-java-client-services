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
 * Model definition for AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * A day of the week, as an integer in the range 0-6. 0 is Sunday, 1 is Monday, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long day;

  /**
   * A time in 24-hour "hhmm" format (i.e. range is 0000 to 2359).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String time;

  /**
   * A day of the week, as an integer in the range 0-6. 0 is Sunday, 1 is Monday, etc.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDay() {
    return day;
  }

  /**
   * A day of the week, as an integer in the range 0-6. 0 is Sunday, 1 is Monday, etc.
   * @param day day or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint setDay(java.lang.Long day) {
    this.day = day;
    return this;
  }

  /**
   * A time in 24-hour "hhmm" format (i.e. range is 0000 to 2359).
   * @return value or {@code null} for none
   */
  public java.lang.String getTime() {
    return time;
  }

  /**
   * A time in 24-hour "hhmm" format (i.e. range is 0000 to 2359).
   * @param time time or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint setTime(java.lang.String time) {
    this.time = time;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint clone() {
    return (AppsPeopleOzExternalMergedpeopleapiOpeningHoursEndpoint) super.clone();
  }

}
