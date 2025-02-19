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
 * Every data source used to construct a data repository has an associated feature that provides
 * more information about it. The standard feature properties have the following interpretations:
 * bound - The bounds must includes all features that refer to this data source, so that bucketing
 * MapReduce passes work correctly. name - The provider name associated with this data source. It is
 * expected to remain constant from release to release, and between datasets. address - should be
 * empty. point, polyline, polygon - should be empty. source_info - should not be set. child -
 * should be empty.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreDataSourceProto extends com.google.api.client.json.GenericJson {

  /**
   * This is the URL of a website representing this DataSource as a whole. If this DataSource
   * feature is specific to a particular dataset or product, the page may contain information
   * relevant to that dataset or product or may be the main page of the organization.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreUrlProto> attributionUrl;

  /**
   * A UTF8 string that will be inserted in copyright messages to refer to this copyright owner,
   * e.g. "Tele Atlas".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String copyrightOwner;

  /**
   * The copyright year of this data (which may be different than the year of the release date),
   * e.g. 2005.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer copyrightYear;

  /**
   * A free-form description of this data source. Ideally the description should include: - Where
   * the data was obtained (URL, company name, individual, etc). - Where to find detailed
   * documentation. - A brief summary of the licensing terms. - As much internal and external
   * contact information as possible (e.g. who to ask about licensing questions, interpreting the
   * data, updating the data, fixing bugs in the importer, etc).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The build information of the importer binary used to generate this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importerBuildInfo;

  /**
   * The build target of the importer binary used to generate this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importerBuildTarget;

  /**
   * The Perforce client information of the importer binary used to generate this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importerClientInfo;

  /**
   * If the importer was built as an MPM, the version number can be stored in this field. As with
   * build_info, this can be useful when tracking down issues that may be due to the use of a
   * particular binary.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importerMpmVersion;

  /**
   * The timestamp of the importer binary used to generate this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String importerTimestamp;

  /**
   * The provider type of this data source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * For every key that is used in raw_data from this source, there must be a corresponding entry in
   * raw_metadata that describes this key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GeostoreRawMetadataProto> rawMetadata;

  /**
   * A release string that doesn't have to be a date. This is provided so that we can preserve
   * provider release strings that aren't based on dates. If you don't set it, the release_date will
   * get formatted into this field for debugging purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String release;

  /**
   * The release date of this data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreDateTimeProto releaseDate;

  /**
   * A data provider defined string describing the source dataset from which the features of this
   * data source were generated. For example, the MultiNet "fra" dataset produces features for both
   * France and Monaco.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDataset;

  /**
   * This is the URL of a website representing this DataSource as a whole. If this DataSource
   * feature is specific to a particular dataset or product, the page may contain information
   * relevant to that dataset or product or may be the main page of the organization.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreUrlProto> getAttributionUrl() {
    return attributionUrl;
  }

  /**
   * This is the URL of a website representing this DataSource as a whole. If this DataSource
   * feature is specific to a particular dataset or product, the page may contain information
   * relevant to that dataset or product or may be the main page of the organization.
   * @param attributionUrl attributionUrl or {@code null} for none
   */
  public GeostoreDataSourceProto setAttributionUrl(java.util.List<GeostoreUrlProto> attributionUrl) {
    this.attributionUrl = attributionUrl;
    return this;
  }

  /**
   * A UTF8 string that will be inserted in copyright messages to refer to this copyright owner,
   * e.g. "Tele Atlas".
   * @return value or {@code null} for none
   */
  public java.lang.String getCopyrightOwner() {
    return copyrightOwner;
  }

  /**
   * A UTF8 string that will be inserted in copyright messages to refer to this copyright owner,
   * e.g. "Tele Atlas".
   * @param copyrightOwner copyrightOwner or {@code null} for none
   */
  public GeostoreDataSourceProto setCopyrightOwner(java.lang.String copyrightOwner) {
    this.copyrightOwner = copyrightOwner;
    return this;
  }

  /**
   * The copyright year of this data (which may be different than the year of the release date),
   * e.g. 2005.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getCopyrightYear() {
    return copyrightYear;
  }

  /**
   * The copyright year of this data (which may be different than the year of the release date),
   * e.g. 2005.
   * @param copyrightYear copyrightYear or {@code null} for none
   */
  public GeostoreDataSourceProto setCopyrightYear(java.lang.Integer copyrightYear) {
    this.copyrightYear = copyrightYear;
    return this;
  }

  /**
   * A free-form description of this data source. Ideally the description should include: - Where
   * the data was obtained (URL, company name, individual, etc). - Where to find detailed
   * documentation. - A brief summary of the licensing terms. - As much internal and external
   * contact information as possible (e.g. who to ask about licensing questions, interpreting the
   * data, updating the data, fixing bugs in the importer, etc).
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A free-form description of this data source. Ideally the description should include: - Where
   * the data was obtained (URL, company name, individual, etc). - Where to find detailed
   * documentation. - A brief summary of the licensing terms. - As much internal and external
   * contact information as possible (e.g. who to ask about licensing questions, interpreting the
   * data, updating the data, fixing bugs in the importer, etc).
   * @param description description or {@code null} for none
   */
  public GeostoreDataSourceProto setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The build information of the importer binary used to generate this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getImporterBuildInfo() {
    return importerBuildInfo;
  }

  /**
   * The build information of the importer binary used to generate this data source.
   * @param importerBuildInfo importerBuildInfo or {@code null} for none
   */
  public GeostoreDataSourceProto setImporterBuildInfo(java.lang.String importerBuildInfo) {
    this.importerBuildInfo = importerBuildInfo;
    return this;
  }

  /**
   * The build target of the importer binary used to generate this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getImporterBuildTarget() {
    return importerBuildTarget;
  }

  /**
   * The build target of the importer binary used to generate this data source.
   * @param importerBuildTarget importerBuildTarget or {@code null} for none
   */
  public GeostoreDataSourceProto setImporterBuildTarget(java.lang.String importerBuildTarget) {
    this.importerBuildTarget = importerBuildTarget;
    return this;
  }

  /**
   * The Perforce client information of the importer binary used to generate this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getImporterClientInfo() {
    return importerClientInfo;
  }

  /**
   * The Perforce client information of the importer binary used to generate this data source.
   * @param importerClientInfo importerClientInfo or {@code null} for none
   */
  public GeostoreDataSourceProto setImporterClientInfo(java.lang.String importerClientInfo) {
    this.importerClientInfo = importerClientInfo;
    return this;
  }

  /**
   * If the importer was built as an MPM, the version number can be stored in this field. As with
   * build_info, this can be useful when tracking down issues that may be due to the use of a
   * particular binary.
   * @return value or {@code null} for none
   */
  public java.lang.String getImporterMpmVersion() {
    return importerMpmVersion;
  }

  /**
   * If the importer was built as an MPM, the version number can be stored in this field. As with
   * build_info, this can be useful when tracking down issues that may be due to the use of a
   * particular binary.
   * @param importerMpmVersion importerMpmVersion or {@code null} for none
   */
  public GeostoreDataSourceProto setImporterMpmVersion(java.lang.String importerMpmVersion) {
    this.importerMpmVersion = importerMpmVersion;
    return this;
  }

  /**
   * The timestamp of the importer binary used to generate this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getImporterTimestamp() {
    return importerTimestamp;
  }

  /**
   * The timestamp of the importer binary used to generate this data source.
   * @param importerTimestamp importerTimestamp or {@code null} for none
   */
  public GeostoreDataSourceProto setImporterTimestamp(java.lang.String importerTimestamp) {
    this.importerTimestamp = importerTimestamp;
    return this;
  }

  /**
   * The provider type of this data source.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * The provider type of this data source.
   * @param provider provider or {@code null} for none
   */
  public GeostoreDataSourceProto setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * For every key that is used in raw_data from this source, there must be a corresponding entry in
   * raw_metadata that describes this key.
   * @return value or {@code null} for none
   */
  public java.util.List<GeostoreRawMetadataProto> getRawMetadata() {
    return rawMetadata;
  }

  /**
   * For every key that is used in raw_data from this source, there must be a corresponding entry in
   * raw_metadata that describes this key.
   * @param rawMetadata rawMetadata or {@code null} for none
   */
  public GeostoreDataSourceProto setRawMetadata(java.util.List<GeostoreRawMetadataProto> rawMetadata) {
    this.rawMetadata = rawMetadata;
    return this;
  }

  /**
   * A release string that doesn't have to be a date. This is provided so that we can preserve
   * provider release strings that aren't based on dates. If you don't set it, the release_date will
   * get formatted into this field for debugging purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelease() {
    return release;
  }

  /**
   * A release string that doesn't have to be a date. This is provided so that we can preserve
   * provider release strings that aren't based on dates. If you don't set it, the release_date will
   * get formatted into this field for debugging purposes.
   * @param release release or {@code null} for none
   */
  public GeostoreDataSourceProto setRelease(java.lang.String release) {
    this.release = release;
    return this;
  }

  /**
   * The release date of this data.
   * @return value or {@code null} for none
   */
  public GeostoreDateTimeProto getReleaseDate() {
    return releaseDate;
  }

  /**
   * The release date of this data.
   * @param releaseDate releaseDate or {@code null} for none
   */
  public GeostoreDataSourceProto setReleaseDate(GeostoreDateTimeProto releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * A data provider defined string describing the source dataset from which the features of this
   * data source were generated. For example, the MultiNet "fra" dataset produces features for both
   * France and Monaco.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDataset() {
    return sourceDataset;
  }

  /**
   * A data provider defined string describing the source dataset from which the features of this
   * data source were generated. For example, the MultiNet "fra" dataset produces features for both
   * France and Monaco.
   * @param sourceDataset sourceDataset or {@code null} for none
   */
  public GeostoreDataSourceProto setSourceDataset(java.lang.String sourceDataset) {
    this.sourceDataset = sourceDataset;
    return this;
  }

  @Override
  public GeostoreDataSourceProto set(String fieldName, Object value) {
    return (GeostoreDataSourceProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreDataSourceProto clone() {
    return (GeostoreDataSourceProto) super.clone();
  }

}
