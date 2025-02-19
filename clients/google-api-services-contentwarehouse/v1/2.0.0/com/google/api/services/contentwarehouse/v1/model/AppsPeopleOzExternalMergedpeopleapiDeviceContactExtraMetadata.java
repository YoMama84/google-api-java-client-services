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
 * Extra metadata for an aggregated or raw device contact.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Attributes for this device contact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> attributes;

  /**
   * Usage info for this device contact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SocialGraphApiProtoUsageInfo> usageInfo;

  /**
   * Attributes for this device contact.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Attributes for this device contact.
   * @param attributes attributes or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata setAttributes(java.util.List<java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Usage info for this device contact.
   * @return value or {@code null} for none
   */
  public java.util.List<SocialGraphApiProtoUsageInfo> getUsageInfo() {
    return usageInfo;
  }

  /**
   * Usage info for this device contact.
   * @param usageInfo usageInfo or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata setUsageInfo(java.util.List<SocialGraphApiProtoUsageInfo> usageInfo) {
    this.usageInfo = usageInfo;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata clone() {
    return (AppsPeopleOzExternalMergedpeopleapiDeviceContactExtraMetadata) super.clone();
  }

}
