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
 * LocationHint is used to specify a location as well as format.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleInternalCommunicationsInstantmessagingV1LocationHint extends com.google.api.client.json.GenericJson {

  /**
   * the format of location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * Location is the location, provided in the format specified by format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * the format of location.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * the format of location.
   * @param format format or {@code null} for none
   */
  public GoogleInternalCommunicationsInstantmessagingV1LocationHint setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  /**
   * Location is the location, provided in the format specified by format.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location is the location, provided in the format specified by format.
   * @param location location or {@code null} for none
   */
  public GoogleInternalCommunicationsInstantmessagingV1LocationHint setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  @Override
  public GoogleInternalCommunicationsInstantmessagingV1LocationHint set(String fieldName, Object value) {
    return (GoogleInternalCommunicationsInstantmessagingV1LocationHint) super.set(fieldName, value);
  }

  @Override
  public GoogleInternalCommunicationsInstantmessagingV1LocationHint clone() {
    return (GoogleInternalCommunicationsInstantmessagingV1LocationHint) super.clone();
  }

}
