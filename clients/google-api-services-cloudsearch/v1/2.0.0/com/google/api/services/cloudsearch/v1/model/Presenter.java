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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Presenter contains information about which device is currently presenting as well as which device
 * requested the presenter to be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Presenter extends com.google.api.client.json.GenericJson {

  /**
   * The device resource name of the device which requested the current presenter to be set. This
   * field can not be modified by clients.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String byDeviceId;

  /**
   * The device resource names of other devices which can control the current presentation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> copresenterDeviceIds;

  /**
   * The device resource name of the currently presenting device.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String presenterDeviceId;

  /**
   * The device resource name of the device which requested the current presenter to be set. This
   * field can not be modified by clients.
   * @return value or {@code null} for none
   */
  public java.lang.String getByDeviceId() {
    return byDeviceId;
  }

  /**
   * The device resource name of the device which requested the current presenter to be set. This
   * field can not be modified by clients.
   * @param byDeviceId byDeviceId or {@code null} for none
   */
  public Presenter setByDeviceId(java.lang.String byDeviceId) {
    this.byDeviceId = byDeviceId;
    return this;
  }

  /**
   * The device resource names of other devices which can control the current presentation.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getCopresenterDeviceIds() {
    return copresenterDeviceIds;
  }

  /**
   * The device resource names of other devices which can control the current presentation.
   * @param copresenterDeviceIds copresenterDeviceIds or {@code null} for none
   */
  public Presenter setCopresenterDeviceIds(java.util.List<java.lang.String> copresenterDeviceIds) {
    this.copresenterDeviceIds = copresenterDeviceIds;
    return this;
  }

  /**
   * The device resource name of the currently presenting device.
   * @return value or {@code null} for none
   */
  public java.lang.String getPresenterDeviceId() {
    return presenterDeviceId;
  }

  /**
   * The device resource name of the currently presenting device.
   * @param presenterDeviceId presenterDeviceId or {@code null} for none
   */
  public Presenter setPresenterDeviceId(java.lang.String presenterDeviceId) {
    this.presenterDeviceId = presenterDeviceId;
    return this;
  }

  @Override
  public Presenter set(String fieldName, Object value) {
    return (Presenter) super.set(fieldName, value);
  }

  @Override
  public Presenter clone() {
    return (Presenter) super.clone();
  }

}
