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
 * Store all app unique info that are needed for app action fulfillment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo extends com.google.api.client.json.GenericJson {

  /**
   * Store the app unique id endpoint. This will be passed over to app to fulfill the action. For
   * example, app_unique_id for Whatsapp will be "11234567890@s.whatsapp.net"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appUniqueId;

  /**
   * Store third party endpoint that is displayed to users. For example, display_app_unique_id for
   * Whatsapp will be "Message +11234567890".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayAppUniqueId;

  /**
   * Store third party endpoint label. For example, "HOME", "WORK"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * Store mimetype of this endpoint. We will use this as the differentiator for Assistant to know
   * whether to use the RawContact for messaging, call or video call. For example, send message
   * mimetype for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.profile" voice call mimetype
   * for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mimetype;

  /**
   * Store the app unique id endpoint. This will be passed over to app to fulfill the action. For
   * example, app_unique_id for Whatsapp will be "11234567890@s.whatsapp.net"
   * @return value or {@code null} for none
   */
  public java.lang.String getAppUniqueId() {
    return appUniqueId;
  }

  /**
   * Store the app unique id endpoint. This will be passed over to app to fulfill the action. For
   * example, app_unique_id for Whatsapp will be "11234567890@s.whatsapp.net"
   * @param appUniqueId appUniqueId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo setAppUniqueId(java.lang.String appUniqueId) {
    this.appUniqueId = appUniqueId;
    return this;
  }

  /**
   * Store third party endpoint that is displayed to users. For example, display_app_unique_id for
   * Whatsapp will be "Message +11234567890".
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayAppUniqueId() {
    return displayAppUniqueId;
  }

  /**
   * Store third party endpoint that is displayed to users. For example, display_app_unique_id for
   * Whatsapp will be "Message +11234567890".
   * @param displayAppUniqueId displayAppUniqueId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo setDisplayAppUniqueId(java.lang.String displayAppUniqueId) {
    this.displayAppUniqueId = displayAppUniqueId;
    return this;
  }

  /**
   * Store third party endpoint label. For example, "HOME", "WORK"
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * Store third party endpoint label. For example, "HOME", "WORK"
   * @param label label or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  /**
   * Store mimetype of this endpoint. We will use this as the differentiator for Assistant to know
   * whether to use the RawContact for messaging, call or video call. For example, send message
   * mimetype for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.profile" voice call mimetype
   * for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
   * @return value or {@code null} for none
   */
  public java.lang.String getMimetype() {
    return mimetype;
  }

  /**
   * Store mimetype of this endpoint. We will use this as the differentiator for Assistant to know
   * whether to use the RawContact for messaging, call or video call. For example, send message
   * mimetype for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.profile" voice call mimetype
   * for whatsapp: "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
   * @param mimetype mimetype or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo setMimetype(java.lang.String mimetype) {
    this.mimetype = mimetype;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo clone() {
    return (AppsPeopleOzExternalMergedpeopleapiAppUniqueInfo) super.clone();
  }

}
