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
 * The dataset in downloadable form. There can be multiple data download entries for different file
 * types. Next ID: 6
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResearchScienceSearchDataDownload extends com.google.api.client.json.GenericJson {

  /**
   * Size of the download, as a string from the provider. May include units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentSize;

  /**
   * URL for downloading the data
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String downloadUrl;

  /**
   * File format at the link (ASCII, CSV, etc.)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileFormat;

  /**
   * Pragmatic classification of file formats - for filtering purposes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileFormatClass;

  /**
   * Parsed content size
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ResearchScienceSearchDataSize parsedContentSize;

  /**
   * Size of the download, as a string from the provider. May include units.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentSize() {
    return contentSize;
  }

  /**
   * Size of the download, as a string from the provider. May include units.
   * @param contentSize contentSize or {@code null} for none
   */
  public ResearchScienceSearchDataDownload setContentSize(java.lang.String contentSize) {
    this.contentSize = contentSize;
    return this;
  }

  /**
   * URL for downloading the data
   * @return value or {@code null} for none
   */
  public java.lang.String getDownloadUrl() {
    return downloadUrl;
  }

  /**
   * URL for downloading the data
   * @param downloadUrl downloadUrl or {@code null} for none
   */
  public ResearchScienceSearchDataDownload setDownloadUrl(java.lang.String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * File format at the link (ASCII, CSV, etc.)
   * @return value or {@code null} for none
   */
  public java.lang.String getFileFormat() {
    return fileFormat;
  }

  /**
   * File format at the link (ASCII, CSV, etc.)
   * @param fileFormat fileFormat or {@code null} for none
   */
  public ResearchScienceSearchDataDownload setFileFormat(java.lang.String fileFormat) {
    this.fileFormat = fileFormat;
    return this;
  }

  /**
   * Pragmatic classification of file formats - for filtering purposes
   * @return value or {@code null} for none
   */
  public java.lang.String getFileFormatClass() {
    return fileFormatClass;
  }

  /**
   * Pragmatic classification of file formats - for filtering purposes
   * @param fileFormatClass fileFormatClass or {@code null} for none
   */
  public ResearchScienceSearchDataDownload setFileFormatClass(java.lang.String fileFormatClass) {
    this.fileFormatClass = fileFormatClass;
    return this;
  }

  /**
   * Parsed content size
   * @return value or {@code null} for none
   */
  public ResearchScienceSearchDataSize getParsedContentSize() {
    return parsedContentSize;
  }

  /**
   * Parsed content size
   * @param parsedContentSize parsedContentSize or {@code null} for none
   */
  public ResearchScienceSearchDataDownload setParsedContentSize(ResearchScienceSearchDataSize parsedContentSize) {
    this.parsedContentSize = parsedContentSize;
    return this;
  }

  @Override
  public ResearchScienceSearchDataDownload set(String fieldName, Object value) {
    return (ResearchScienceSearchDataDownload) super.set(fieldName, value);
  }

  @Override
  public ResearchScienceSearchDataDownload clone() {
    return (ResearchScienceSearchDataDownload) super.clone();
  }

}
