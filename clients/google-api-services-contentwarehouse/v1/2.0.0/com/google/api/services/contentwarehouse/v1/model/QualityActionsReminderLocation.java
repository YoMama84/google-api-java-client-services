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
 * A representation of reminder-triggering locations. They may be specific, resolved locations, non-
 * specific location groups, or personal aliases. Next id: 12
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityActionsReminderLocation extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityActionsReminderLocationCategoryInfo categoryInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QualityActionsReminderLocationChainInfo chainInfo;

  /**
   * Optional additional information about the types of the custom location. This field is not
   * stored in backend, and is only used to plumb NLP information to fulfillment UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customLocationType;

  /**
   * An address string that is suitable for displaying to the user in an application interface. It
   * can be detailed, or brief. e.g. "80 Absolute Ave, Unit 1708, Mississauga, ON" e.g. "151 Charles
   * Street West"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayAddress;

  /**
   * Filled if location_type is CUSTOM and this is a resolved instance of a business (not for
   * specific address locations).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreFeatureIdProto geoFeatureId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lat;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double lng;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationType;

  /**
   * Descriptive name, e.g. "43rd st new york", a user-edited place name (e.g. "Gym"), or a reverse
   * geocoded business name. This can be any string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated in favor of Reminder.personal_reference_metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CopleySourceTypeList personalLocationMetadata;

  /**
   * A localized, shortened version of the address, suitable for TTS. This originates in the
   * LocationFrame.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ttsAddress;

  /**
   * @return value or {@code null} for none
   */
  public QualityActionsReminderLocationCategoryInfo getCategoryInfo() {
    return categoryInfo;
  }

  /**
   * @param categoryInfo categoryInfo or {@code null} for none
   */
  public QualityActionsReminderLocation setCategoryInfo(QualityActionsReminderLocationCategoryInfo categoryInfo) {
    this.categoryInfo = categoryInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public QualityActionsReminderLocationChainInfo getChainInfo() {
    return chainInfo;
  }

  /**
   * @param chainInfo chainInfo or {@code null} for none
   */
  public QualityActionsReminderLocation setChainInfo(QualityActionsReminderLocationChainInfo chainInfo) {
    this.chainInfo = chainInfo;
    return this;
  }

  /**
   * Optional additional information about the types of the custom location. This field is not
   * stored in backend, and is only used to plumb NLP information to fulfillment UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomLocationType() {
    return customLocationType;
  }

  /**
   * Optional additional information about the types of the custom location. This field is not
   * stored in backend, and is only used to plumb NLP information to fulfillment UI.
   * @param customLocationType customLocationType or {@code null} for none
   */
  public QualityActionsReminderLocation setCustomLocationType(java.lang.String customLocationType) {
    this.customLocationType = customLocationType;
    return this;
  }

  /**
   * An address string that is suitable for displaying to the user in an application interface. It
   * can be detailed, or brief. e.g. "80 Absolute Ave, Unit 1708, Mississauga, ON" e.g. "151 Charles
   * Street West"
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayAddress() {
    return displayAddress;
  }

  /**
   * An address string that is suitable for displaying to the user in an application interface. It
   * can be detailed, or brief. e.g. "80 Absolute Ave, Unit 1708, Mississauga, ON" e.g. "151 Charles
   * Street West"
   * @param displayAddress displayAddress or {@code null} for none
   */
  public QualityActionsReminderLocation setDisplayAddress(java.lang.String displayAddress) {
    this.displayAddress = displayAddress;
    return this;
  }

  /**
   * Filled if location_type is CUSTOM and this is a resolved instance of a business (not for
   * specific address locations).
   * @return value or {@code null} for none
   */
  public GeostoreFeatureIdProto getGeoFeatureId() {
    return geoFeatureId;
  }

  /**
   * Filled if location_type is CUSTOM and this is a resolved instance of a business (not for
   * specific address locations).
   * @param geoFeatureId geoFeatureId or {@code null} for none
   */
  public QualityActionsReminderLocation setGeoFeatureId(GeostoreFeatureIdProto geoFeatureId) {
    this.geoFeatureId = geoFeatureId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLat() {
    return lat;
  }

  /**
   * @param lat lat or {@code null} for none
   */
  public QualityActionsReminderLocation setLat(java.lang.Double lat) {
    this.lat = lat;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getLng() {
    return lng;
  }

  /**
   * @param lng lng or {@code null} for none
   */
  public QualityActionsReminderLocation setLng(java.lang.Double lng) {
    this.lng = lng;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationType() {
    return locationType;
  }

  /**
   * @param locationType locationType or {@code null} for none
   */
  public QualityActionsReminderLocation setLocationType(java.lang.String locationType) {
    this.locationType = locationType;
    return this;
  }

  /**
   * Descriptive name, e.g. "43rd st new york", a user-edited place name (e.g. "Gym"), or a reverse
   * geocoded business name. This can be any string.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Descriptive name, e.g. "43rd st new york", a user-edited place name (e.g. "Gym"), or a reverse
   * geocoded business name. This can be any string.
   * @param name name or {@code null} for none
   */
  public QualityActionsReminderLocation setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated in favor of Reminder.personal_reference_metadata.
   * @return value or {@code null} for none
   */
  public CopleySourceTypeList getPersonalLocationMetadata() {
    return personalLocationMetadata;
  }

  /**
   * Deprecated in favor of Reminder.personal_reference_metadata.
   * @param personalLocationMetadata personalLocationMetadata or {@code null} for none
   */
  public QualityActionsReminderLocation setPersonalLocationMetadata(CopleySourceTypeList personalLocationMetadata) {
    this.personalLocationMetadata = personalLocationMetadata;
    return this;
  }

  /**
   * A localized, shortened version of the address, suitable for TTS. This originates in the
   * LocationFrame.
   * @return value or {@code null} for none
   */
  public java.lang.String getTtsAddress() {
    return ttsAddress;
  }

  /**
   * A localized, shortened version of the address, suitable for TTS. This originates in the
   * LocationFrame.
   * @param ttsAddress ttsAddress or {@code null} for none
   */
  public QualityActionsReminderLocation setTtsAddress(java.lang.String ttsAddress) {
    this.ttsAddress = ttsAddress;
    return this;
  }

  @Override
  public QualityActionsReminderLocation set(String fieldName, Object value) {
    return (QualityActionsReminderLocation) super.set(fieldName, value);
  }

  @Override
  public QualityActionsReminderLocation clone() {
    return (QualityActionsReminderLocation) super.clone();
  }

}
