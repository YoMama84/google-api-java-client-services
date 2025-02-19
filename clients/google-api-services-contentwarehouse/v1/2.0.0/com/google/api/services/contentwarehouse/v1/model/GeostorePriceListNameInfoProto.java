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
 * A PriceListNameInfoProto is used by PriceListProto and fields and messages contained in it for
 * storing names, descriptions, languages, and IDs. The name field and the description field must be
 * in the same language, as specified by the language field. None of the fields in this proto is
 * required, although it is not expected to have the language field set unless there is a name or
 * description. When the language field is not set, it is understood to be the preferred language of
 * the locale where the establishment is located. An empty string for any of the fields is treated
 * the same as having the fields not set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostorePriceListNameInfoProto extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * IDs are intended to be unique identifiers of PriceInfoLists, Sections, and Menu items. This is
   * enforced by the ID_DUPLICATE_PRICE_LIST_ID lint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * The external form of a Google International Identifiers Initiative (III) LanguageCode object.
   * See google3/i18n/identifiers/languagecode.h for details. We place extra restrictions on
   * languages in addition to what the III library requires. See go/geo-schema-reference/feature-
   * properties/languages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String language;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * @param description description or {@code null} for none
   */
  public GeostorePriceListNameInfoProto setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * IDs are intended to be unique identifiers of PriceInfoLists, Sections, and Menu items. This is
   * enforced by the ID_DUPLICATE_PRICE_LIST_ID lint.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * IDs are intended to be unique identifiers of PriceInfoLists, Sections, and Menu items. This is
   * enforced by the ID_DUPLICATE_PRICE_LIST_ID lint.
   * @param id id or {@code null} for none
   */
  public GeostorePriceListNameInfoProto setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * The external form of a Google International Identifiers Initiative (III) LanguageCode object.
   * See google3/i18n/identifiers/languagecode.h for details. We place extra restrictions on
   * languages in addition to what the III library requires. See go/geo-schema-reference/feature-
   * properties/languages.
   * @return value or {@code null} for none
   */
  public java.lang.String getLanguage() {
    return language;
  }

  /**
   * The external form of a Google International Identifiers Initiative (III) LanguageCode object.
   * See google3/i18n/identifiers/languagecode.h for details. We place extra restrictions on
   * languages in addition to what the III library requires. See go/geo-schema-reference/feature-
   * properties/languages.
   * @param language language or {@code null} for none
   */
  public GeostorePriceListNameInfoProto setLanguage(java.lang.String language) {
    this.language = language;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * @param name name or {@code null} for none
   */
  public GeostorePriceListNameInfoProto setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GeostorePriceListNameInfoProto set(String fieldName, Object value) {
    return (GeostorePriceListNameInfoProto) super.set(fieldName, value);
  }

  @Override
  public GeostorePriceListNameInfoProto clone() {
    return (GeostorePriceListNameInfoProto) super.clone();
  }

}
