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
 * Model definition for AppsPeopleOzExternalMergedpeopleapiOtherKeyword.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiOtherKeyword extends com.google.api.client.json.GenericJson {

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formattedType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String source;

  /**
   * The type of the event. The type depends on the `OtherKeyword.source`. `OUTLOOK` source fields
   * must be one of: * `billing_information` * `directory_server` * `keyword` * `mileage` *
   * `sensitivity` * `user` * `subject` All other fields are treated as a `CUSTOM` source field. The
   * value can be free form or one of these predefined values: * `home` * `other` * `work`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormattedType() {
    return formattedType;
  }

  /**
   * The `type` translated and formatted in the request locale. See go/people-api-howto/localization
   * for details on how to usage.
   * @param formattedType formattedType or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * @param metadata metadata or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSource() {
    return source;
  }

  /**
   * @param source source or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword setSource(java.lang.String source) {
    this.source = source;
    return this;
  }

  /**
   * The type of the event. The type depends on the `OtherKeyword.source`. `OUTLOOK` source fields
   * must be one of: * `billing_information` * `directory_server` * `keyword` * `mileage` *
   * `sensitivity` * `user` * `subject` All other fields are treated as a `CUSTOM` source field. The
   * value can be free form or one of these predefined values: * `home` * `other` * `work`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the event. The type depends on the `OtherKeyword.source`. `OUTLOOK` source fields
   * must be one of: * `billing_information` * `directory_server` * `keyword` * `mileage` *
   * `sensitivity` * `user` * `subject` All other fields are treated as a `CUSTOM` source field. The
   * value can be free form or one of these predefined values: * `home` * `other` * `work`
   * @param type type or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * @param value value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiOtherKeyword) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiOtherKeyword clone() {
    return (AppsPeopleOzExternalMergedpeopleapiOtherKeyword) super.clone();
  }

}
