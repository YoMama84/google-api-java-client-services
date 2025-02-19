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
 * Model definition for RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String appStoreLink;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String categoryName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chartType;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rank;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getAppStoreLink() {
    return appStoreLink;
  }

  /**
   * @param appStoreLink appStoreLink or {@code null} for none
   */
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank setAppStoreLink(java.lang.String appStoreLink) {
    this.appStoreLink = appStoreLink;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryId() {
    return categoryId;
  }

  /**
   * @param categoryId categoryId or {@code null} for none
   */
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank setCategoryId(java.lang.String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCategoryName() {
    return categoryName;
  }

  /**
   * @param categoryName categoryName or {@code null} for none
   */
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank setCategoryName(java.lang.String categoryName) {
    this.categoryName = categoryName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getChartType() {
    return chartType;
  }

  /**
   * @param chartType chartType or {@code null} for none
   */
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank setChartType(java.lang.String chartType) {
    this.chartType = chartType;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getRank() {
    return rank;
  }

  /**
   * @param rank rank or {@code null} for none
   */
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank setRank(java.lang.Long rank) {
    this.rank = rank;
    return this;
  }

  @Override
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank set(String fieldName, Object value) {
    return (RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank) super.set(fieldName, value);
  }

  @Override
  public RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank clone() {
    return (RepositoryAnnotationsRdfaRdfaRichSnippetsApplicationRank) super.clone();
  }

}
