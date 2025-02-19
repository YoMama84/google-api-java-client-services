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
 * Message containing information about the localized URL linked to from this document in a
 * localized-variation-context.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingDupsLocalizedLocalizedClusterTargetLink extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingDupsLocalizedLocalizedClusterTargetLinkLink linkData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingDupsLocalizedLocalizedClusterTargetLinkMetadata metaData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private IndexingDupsLocalizedLocalizedClusterTargetLinkTargetDocData targetDocData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String validationStatus;

  /**
   * @return value or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLinkLink getLinkData() {
    return linkData;
  }

  /**
   * @param linkData linkData or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLink setLinkData(IndexingDupsLocalizedLocalizedClusterTargetLinkLink linkData) {
    this.linkData = linkData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLinkMetadata getMetaData() {
    return metaData;
  }

  /**
   * @param metaData metaData or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLink setMetaData(IndexingDupsLocalizedLocalizedClusterTargetLinkMetadata metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLinkTargetDocData getTargetDocData() {
    return targetDocData;
  }

  /**
   * @param targetDocData targetDocData or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLink setTargetDocData(IndexingDupsLocalizedLocalizedClusterTargetLinkTargetDocData targetDocData) {
    this.targetDocData = targetDocData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getValidationStatus() {
    return validationStatus;
  }

  /**
   * @param validationStatus validationStatus or {@code null} for none
   */
  public IndexingDupsLocalizedLocalizedClusterTargetLink setValidationStatus(java.lang.String validationStatus) {
    this.validationStatus = validationStatus;
    return this;
  }

  @Override
  public IndexingDupsLocalizedLocalizedClusterTargetLink set(String fieldName, Object value) {
    return (IndexingDupsLocalizedLocalizedClusterTargetLink) super.set(fieldName, value);
  }

  @Override
  public IndexingDupsLocalizedLocalizedClusterTargetLink clone() {
    return (IndexingDupsLocalizedLocalizedClusterTargetLink) super.clone();
  }

}
