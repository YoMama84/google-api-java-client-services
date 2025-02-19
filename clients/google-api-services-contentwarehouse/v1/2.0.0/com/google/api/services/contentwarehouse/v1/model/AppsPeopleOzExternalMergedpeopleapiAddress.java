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
 * Model definition for AppsPeopleOzExternalMergedpeopleapiAddress.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiAddress extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String country;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String countryCode;

  /**
   * FeatureId associated with the address. The format is the same as that used for ids in PLACE
   * containers in SourceIdentity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String encodedPlaceId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String extendedAddress;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String formatted;

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
  private java.lang.String locality;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String poBox;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPointSpec pointSpec;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postalCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streetAddress;

  /**
   * The type of the address. The type can be free form or one of these predefined values: * `home`
   * * `work` * `other`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountry() {
    return country;
  }

  /**
   * @param country country or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setCountry(java.lang.String country) {
    this.country = country;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCountryCode() {
    return countryCode;
  }

  /**
   * @param countryCode countryCode or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setCountryCode(java.lang.String countryCode) {
    this.countryCode = countryCode;
    return this;
  }

  /**
   * FeatureId associated with the address. The format is the same as that used for ids in PLACE
   * containers in SourceIdentity.
   * @return value or {@code null} for none
   */
  public java.lang.String getEncodedPlaceId() {
    return encodedPlaceId;
  }

  /**
   * FeatureId associated with the address. The format is the same as that used for ids in PLACE
   * containers in SourceIdentity.
   * @param encodedPlaceId encodedPlaceId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setEncodedPlaceId(java.lang.String encodedPlaceId) {
    this.encodedPlaceId = encodedPlaceId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getExtendedAddress() {
    return extendedAddress;
  }

  /**
   * @param extendedAddress extendedAddress or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setExtendedAddress(java.lang.String extendedAddress) {
    this.extendedAddress = extendedAddress;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getFormatted() {
    return formatted;
  }

  /**
   * @param formatted formatted or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setFormatted(java.lang.String formatted) {
    this.formatted = formatted;
    return this;
  }

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
  public AppsPeopleOzExternalMergedpeopleapiAddress setFormattedType(java.lang.String formattedType) {
    this.formattedType = formattedType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocality() {
    return locality;
  }

  /**
   * @param locality locality or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setLocality(java.lang.String locality) {
    this.locality = locality;
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
  public AppsPeopleOzExternalMergedpeopleapiAddress setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPoBox() {
    return poBox;
  }

  /**
   * @param poBox poBox or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setPoBox(java.lang.String poBox) {
    this.poBox = poBox;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiPointSpec getPointSpec() {
    return pointSpec;
  }

  /**
   * @param pointSpec pointSpec or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setPointSpec(AppsPeopleOzExternalMergedpeopleapiPointSpec pointSpec) {
    this.pointSpec = pointSpec;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPostalCode() {
    return postalCode;
  }

  /**
   * @param postalCode postalCode or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setPostalCode(java.lang.String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * @param region region or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStreetAddress() {
    return streetAddress;
  }

  /**
   * @param streetAddress streetAddress or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setStreetAddress(java.lang.String streetAddress) {
    this.streetAddress = streetAddress;
    return this;
  }

  /**
   * The type of the address. The type can be free form or one of these predefined values: * `home`
   * * `work` * `other`
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of the address. The type can be free form or one of these predefined values: * `home`
   * * `work` * `other`
   * @param type type or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAddress setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiAddress set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiAddress) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiAddress clone() {
    return (AppsPeopleOzExternalMergedpeopleapiAddress) super.clone();
  }

}
