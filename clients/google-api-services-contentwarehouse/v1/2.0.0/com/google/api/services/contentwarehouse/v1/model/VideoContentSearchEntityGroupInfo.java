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
 * Model definition for VideoContentSearchEntityGroupInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchEntityGroupInfo extends com.google.api.client.json.GenericJson {

  /**
   * Collection id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String collectionId;

  /**
   * Label for this anchor group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String label;

  /**
   * Collection id.
   * @return value or {@code null} for none
   */
  public java.lang.String getCollectionId() {
    return collectionId;
  }

  /**
   * Collection id.
   * @param collectionId collectionId or {@code null} for none
   */
  public VideoContentSearchEntityGroupInfo setCollectionId(java.lang.String collectionId) {
    this.collectionId = collectionId;
    return this;
  }

  /**
   * Label for this anchor group.
   * @return value or {@code null} for none
   */
  public java.lang.String getLabel() {
    return label;
  }

  /**
   * Label for this anchor group.
   * @param label label or {@code null} for none
   */
  public VideoContentSearchEntityGroupInfo setLabel(java.lang.String label) {
    this.label = label;
    return this;
  }

  @Override
  public VideoContentSearchEntityGroupInfo set(String fieldName, Object value) {
    return (VideoContentSearchEntityGroupInfo) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchEntityGroupInfo clone() {
    return (VideoContentSearchEntityGroupInfo) super.clone();
  }

}
