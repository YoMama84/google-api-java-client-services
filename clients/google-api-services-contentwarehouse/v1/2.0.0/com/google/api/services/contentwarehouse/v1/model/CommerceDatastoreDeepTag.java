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
 * The basic message that contains a single decision output of go/deeptagger.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CommerceDatastoreDeepTag extends com.google.api.client.json.GenericJson {

  /**
   * The confidence of the tag, encoded to 14 bits (range [0, 16383]). Due to modeling details, a
   * large number of tags become trustworthy with confidence greater than 0.001, so two bytes of
   * precision are required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long confidence;

  /**
   * A Deep Tag enum in uint32 form.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long tag;

  /**
   * The confidence of the tag, encoded to 14 bits (range [0, 16383]). Due to modeling details, a
   * large number of tags become trustworthy with confidence greater than 0.001, so two bytes of
   * precision are required.
   * @return value or {@code null} for none
   */
  public java.lang.Long getConfidence() {
    return confidence;
  }

  /**
   * The confidence of the tag, encoded to 14 bits (range [0, 16383]). Due to modeling details, a
   * large number of tags become trustworthy with confidence greater than 0.001, so two bytes of
   * precision are required.
   * @param confidence confidence or {@code null} for none
   */
  public CommerceDatastoreDeepTag setConfidence(java.lang.Long confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * A Deep Tag enum in uint32 form.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTag() {
    return tag;
  }

  /**
   * A Deep Tag enum in uint32 form.
   * @param tag tag or {@code null} for none
   */
  public CommerceDatastoreDeepTag setTag(java.lang.Long tag) {
    this.tag = tag;
    return this;
  }

  @Override
  public CommerceDatastoreDeepTag set(String fieldName, Object value) {
    return (CommerceDatastoreDeepTag) super.set(fieldName, value);
  }

  @Override
  public CommerceDatastoreDeepTag clone() {
    return (CommerceDatastoreDeepTag) super.clone();
  }

}
