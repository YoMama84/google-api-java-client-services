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
 * How did we derive this viewability for this locale+volume? For "partner" books, this includes
 * details about the "Imprint" that provided the rights. These details specify things such as
 * preferred buy-the-book-url to show in the frontend.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OceanLocaleViewabilitySourceDetails extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OceanVolumeImprint imprint;

  /**
   * @return value or {@code null} for none
   */
  public OceanVolumeImprint getImprint() {
    return imprint;
  }

  /**
   * @param imprint imprint or {@code null} for none
   */
  public OceanLocaleViewabilitySourceDetails setImprint(OceanVolumeImprint imprint) {
    this.imprint = imprint;
    return this;
  }

  @Override
  public OceanLocaleViewabilitySourceDetails set(String fieldName, Object value) {
    return (OceanLocaleViewabilitySourceDetails) super.set(fieldName, value);
  }

  @Override
  public OceanLocaleViewabilitySourceDetails clone() {
    return (OceanLocaleViewabilitySourceDetails) super.clone();
  }

}
