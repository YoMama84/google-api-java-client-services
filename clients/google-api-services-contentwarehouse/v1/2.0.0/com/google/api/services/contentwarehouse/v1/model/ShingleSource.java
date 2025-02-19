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
 * This message represents a source of shingles. Used by ShingleInfoPerDocData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ShingleSource extends com.google.api.client.json.GenericJson {

  /**
   * Hash-value of the URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer id;

  /**
   * Number of shingles originating from this source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numShingles;

  /**
   * First-seen timestamp of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timestamp;

  /**
   * Hash-value of the URL.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getId() {
    return id;
  }

  /**
   * Hash-value of the URL.
   * @param id id or {@code null} for none
   */
  public ShingleSource setId(java.lang.Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Number of shingles originating from this source.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumShingles() {
    return numShingles;
  }

  /**
   * Number of shingles originating from this source.
   * @param numShingles numShingles or {@code null} for none
   */
  public ShingleSource setNumShingles(java.lang.Integer numShingles) {
    this.numShingles = numShingles;
    return this;
  }

  /**
   * First-seen timestamp of the source.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimestamp() {
    return timestamp;
  }

  /**
   * First-seen timestamp of the source.
   * @param timestamp timestamp or {@code null} for none
   */
  public ShingleSource setTimestamp(java.lang.Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public ShingleSource set(String fieldName, Object value) {
    return (ShingleSource) super.set(fieldName, value);
  }

  @Override
  public ShingleSource clone() {
    return (ShingleSource) super.clone();
  }

}
