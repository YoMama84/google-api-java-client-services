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
 * Custom field that represents SSH public keys associated with the user. We can treat the field as
 * a map from a string fingerprint to the SSH public key information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiSshPublicKey extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expirationTime;

  /**
   * The value is automatically set to a SHA-256 fingerprint of an SSH public key. A fingerprint
   * should uniquely identify an SSH public key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String key;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata;

  /**
   * @return value or {@code null} for none
   */
  public String getExpirationTime() {
    return expirationTime;
  }

  /**
   * @param expirationTime expirationTime or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey setExpirationTime(String expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }

  /**
   * The value is automatically set to a SHA-256 fingerprint of an SSH public key. A fingerprint
   * should uniquely identify an SSH public key.
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * The value is automatically set to a SHA-256 fingerprint of an SSH public key. A fingerprint
   * should uniquely identify an SSH public key.
   * @param fingerprint fingerprint or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKey() {
    return key;
  }

  /**
   * @param key key or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey setKey(java.lang.String key) {
    this.key = key;
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
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey setMetadata(AppsPeopleOzExternalMergedpeopleapiPersonFieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiSshPublicKey) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiSshPublicKey clone() {
    return (AppsPeopleOzExternalMergedpeopleapiSshPublicKey) super.clone();
  }

}
