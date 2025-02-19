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
 * Specification of which video features can be used.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantApiSettingsVideoFilter extends com.google.api.client.json.GenericJson {

  /**
   * State that indicates whether autoplay is enabled for youtube videos.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String autoplayToggleState;

  /**
   * Providers available at the time user updated settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> availableProviders;

  /**
   * Represents the state for the video provider filter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String providerFilterState;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Contains the list of whitelisted video providers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> whitelistedProviders;

  /**
   * State that indicates whether autoplay is enabled for youtube videos.
   * @return value or {@code null} for none
   */
  public java.lang.String getAutoplayToggleState() {
    return autoplayToggleState;
  }

  /**
   * State that indicates whether autoplay is enabled for youtube videos.
   * @param autoplayToggleState autoplayToggleState or {@code null} for none
   */
  public AssistantApiSettingsVideoFilter setAutoplayToggleState(java.lang.String autoplayToggleState) {
    this.autoplayToggleState = autoplayToggleState;
    return this;
  }

  /**
   * Providers available at the time user updated settings.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAvailableProviders() {
    return availableProviders;
  }

  /**
   * Providers available at the time user updated settings.
   * @param availableProviders availableProviders or {@code null} for none
   */
  public AssistantApiSettingsVideoFilter setAvailableProviders(java.util.List<java.lang.String> availableProviders) {
    this.availableProviders = availableProviders;
    return this;
  }

  /**
   * Represents the state for the video provider filter.
   * @return value or {@code null} for none
   */
  public java.lang.String getProviderFilterState() {
    return providerFilterState;
  }

  /**
   * Represents the state for the video provider filter.
   * @param providerFilterState providerFilterState or {@code null} for none
   */
  public AssistantApiSettingsVideoFilter setProviderFilterState(java.lang.String providerFilterState) {
    this.providerFilterState = providerFilterState;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * @param state state or {@code null} for none
   */
  public AssistantApiSettingsVideoFilter setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Contains the list of whitelisted video providers.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getWhitelistedProviders() {
    return whitelistedProviders;
  }

  /**
   * Contains the list of whitelisted video providers.
   * @param whitelistedProviders whitelistedProviders or {@code null} for none
   */
  public AssistantApiSettingsVideoFilter setWhitelistedProviders(java.util.List<java.lang.String> whitelistedProviders) {
    this.whitelistedProviders = whitelistedProviders;
    return this;
  }

  @Override
  public AssistantApiSettingsVideoFilter set(String fieldName, Object value) {
    return (AssistantApiSettingsVideoFilter) super.set(fieldName, value);
  }

  @Override
  public AssistantApiSettingsVideoFilter clone() {
    return (AssistantApiSettingsVideoFilter) super.clone();
  }

}
