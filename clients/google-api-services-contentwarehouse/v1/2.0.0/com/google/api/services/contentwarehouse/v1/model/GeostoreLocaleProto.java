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
 * A locale is a meta-feature that describes the geographic extent of localization preferences such
 * as the local language, and formatting conventions for numbers, dates and monetary values.
 * Multilingual areas may be contained by multiple locales. We try to model locales fine-grained
 * enough for deciding which languages are typically used within a city. For example, while French
 * is an official language for all of Switzerland, we would prefer to have Zurich contained by a
 * separate (more fine-grained) Swiss-German locale indicating that German, not French, is the
 * predominantly spoken language in this city. Note that language borders are frequently considered
 * a political question and often don't have clearly defined extents. For example, California has a
 * significant Spanish-speaking population, but Spanish is not an official language of California.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreLocaleProto extends com.google.api.client.json.GenericJson {

  /**
   * This holds the list of languages spoken within a locale.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreLocaleLanguageProto> language;

  static {
    // hack to force ProGuard to consider GeostoreLocaleLanguageProto used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GeostoreLocaleLanguageProto.class);
  }

  /**
   * The ID of the localization policy (from
   * googledata/geostore/localization/localization_policies.textpb) to apply to features that have
   * this locale as their best match locale. Localization policy IDs are arbitrary identifiers that
   * uniquely distinguish a set of language-selection rules.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localizationPolicyId;

  /**
   * This holds the list of languages spoken within a locale.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreLocaleLanguageProto> getLanguage() {
    return language;
  }

  /**
   * This holds the list of languages spoken within a locale.
   * @param language language or {@code null} for none
   */
  public GeostoreLocaleProto setLanguage(java.util.List<GeostoreLocaleLanguageProto> language) {
    this.language = language;
    return this;
  }

  /**
   * The ID of the localization policy (from
   * googledata/geostore/localization/localization_policies.textpb) to apply to features that have
   * this locale as their best match locale. Localization policy IDs are arbitrary identifiers that
   * uniquely distinguish a set of language-selection rules.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalizationPolicyId() {
    return localizationPolicyId;
  }

  /**
   * The ID of the localization policy (from
   * googledata/geostore/localization/localization_policies.textpb) to apply to features that have
   * this locale as their best match locale. Localization policy IDs are arbitrary identifiers that
   * uniquely distinguish a set of language-selection rules.
   * @param localizationPolicyId localizationPolicyId or {@code null} for none
   */
  public GeostoreLocaleProto setLocalizationPolicyId(java.lang.String localizationPolicyId) {
    this.localizationPolicyId = localizationPolicyId;
    return this;
  }

  @Override
  public GeostoreLocaleProto set(String fieldName, Object value) {
    return (GeostoreLocaleProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreLocaleProto clone() {
    return (GeostoreLocaleProto) super.clone();
  }

}
