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
 * A TimezoneProto holds information about a feature's related time zone.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreTimezoneProto extends com.google.api.client.json.GenericJson {

  /**
   * i18n recognized time zone identifier. For the full list of identifiers, see
   * google3/i18n/identifiers/data/timezones.txt.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Field-level metadata for this relation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFieldMetadataProto metadata;

  /**
   * i18n recognized time zone identifier. For the full list of identifiers, see
   * google3/i18n/identifiers/data/timezones.txt.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * i18n recognized time zone identifier. For the full list of identifiers, see
   * google3/i18n/identifiers/data/timezones.txt.
   * @param id id or {@code null} for none
   */
  public GeostoreTimezoneProto setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Field-level metadata for this relation.
   * @return value or {@code null} for none
   */
  public GeostoreFieldMetadataProto getMetadata() {
    return metadata;
  }

  /**
   * Field-level metadata for this relation.
   * @param metadata metadata or {@code null} for none
   */
  public GeostoreTimezoneProto setMetadata(GeostoreFieldMetadataProto metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public GeostoreTimezoneProto set(String fieldName, Object value) {
    return (GeostoreTimezoneProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreTimezoneProto clone() {
    return (GeostoreTimezoneProto) super.clone();
  }

}
