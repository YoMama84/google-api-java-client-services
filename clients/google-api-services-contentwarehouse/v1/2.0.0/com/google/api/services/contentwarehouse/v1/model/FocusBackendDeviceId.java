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
 * // DeviceId / Used by Device Contacts only. For more details see go/fbs-support-for-device-
 * contacts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FocusBackendDeviceId extends com.google.api.client.json.GenericJson {

  /**
   * The GServices id on Android. See go/android-id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("AndroidDeviceId") @com.google.api.client.json.JsonString
  private java.lang.Long androidDeviceId;

  /**
   * DeviceId.Hash is a SHA256 of some attribute of the user and device. For Android devices: Hash =
   * SHA256(gaia_account_name + “:” + “1” + “:” + (android id - LSB)); For iOS devices: Hash =
   * TOLOWER(HEX(GMCSComputeUserDeviceToken(userId, iOsDeviceId)) For more details see go/client-
   * instance-id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Hash")
  private java.lang.String hash;

  /**
   * The GServices id on Android. See go/android-id.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAndroidDeviceId() {
    return androidDeviceId;
  }

  /**
   * The GServices id on Android. See go/android-id.
   * @param androidDeviceId androidDeviceId or {@code null} for none
   */
  public FocusBackendDeviceId setAndroidDeviceId(java.lang.Long androidDeviceId) {
    this.androidDeviceId = androidDeviceId;
    return this;
  }

  /**
   * DeviceId.Hash is a SHA256 of some attribute of the user and device. For Android devices: Hash =
   * SHA256(gaia_account_name + “:” + “1” + “:” + (android id - LSB)); For iOS devices: Hash =
   * TOLOWER(HEX(GMCSComputeUserDeviceToken(userId, iOsDeviceId)) For more details see go/client-
   * instance-id.
   * @return value or {@code null} for none
   */
  public java.lang.String getHash() {
    return hash;
  }

  /**
   * DeviceId.Hash is a SHA256 of some attribute of the user and device. For Android devices: Hash =
   * SHA256(gaia_account_name + “:” + “1” + “:” + (android id - LSB)); For iOS devices: Hash =
   * TOLOWER(HEX(GMCSComputeUserDeviceToken(userId, iOsDeviceId)) For more details see go/client-
   * instance-id.
   * @param hash hash or {@code null} for none
   */
  public FocusBackendDeviceId setHash(java.lang.String hash) {
    this.hash = hash;
    return this;
  }

  @Override
  public FocusBackendDeviceId set(String fieldName, Object value) {
    return (FocusBackendDeviceId) super.set(fieldName, value);
  }

  @Override
  public FocusBackendDeviceId clone() {
    return (FocusBackendDeviceId) super.clone();
  }

}
