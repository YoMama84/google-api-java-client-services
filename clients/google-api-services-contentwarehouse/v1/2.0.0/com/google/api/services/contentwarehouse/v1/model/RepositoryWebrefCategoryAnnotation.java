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
 * High level category annotations for documents and queries.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefCategoryAnnotation extends com.google.api.client.json.GenericJson {

  /**
   * Experimental scores to be used by Discover.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryWebrefCategoryAnnotationBrowsyTopic browsyTopic;

  /**
   * Title of the category. Eg "Politics", "Technology".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String debugString;

  /**
   * Sources asserting the category. In the future we may have one calibrated confidence score.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryWebrefCategoryAnnotationHitCatSource hitcat;

  /**
   * Mid representation of the category. Eg "/m/05qt0". WARNING: In UDR this field is not populated,
   * use document_entity.entity.mid instead of document_entity.category.mid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mid;

  /**
   * Qprime asserting this category.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RepositoryWebrefCategoryAnnotationShoppingSignals shopping;

  /**
   * Experimental scores to be used by Discover.
   * @return value or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotationBrowsyTopic getBrowsyTopic() {
    return browsyTopic;
  }

  /**
   * Experimental scores to be used by Discover.
   * @param browsyTopic browsyTopic or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotation setBrowsyTopic(RepositoryWebrefCategoryAnnotationBrowsyTopic browsyTopic) {
    this.browsyTopic = browsyTopic;
    return this;
  }

  /**
   * Title of the category. Eg "Politics", "Technology".
   * @return value or {@code null} for none
   */
  public java.lang.String getDebugString() {
    return debugString;
  }

  /**
   * Title of the category. Eg "Politics", "Technology".
   * @param debugString debugString or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotation setDebugString(java.lang.String debugString) {
    this.debugString = debugString;
    return this;
  }

  /**
   * Sources asserting the category. In the future we may have one calibrated confidence score.
   * @return value or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotationHitCatSource getHitcat() {
    return hitcat;
  }

  /**
   * Sources asserting the category. In the future we may have one calibrated confidence score.
   * @param hitcat hitcat or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotation setHitcat(RepositoryWebrefCategoryAnnotationHitCatSource hitcat) {
    this.hitcat = hitcat;
    return this;
  }

  /**
   * Mid representation of the category. Eg "/m/05qt0". WARNING: In UDR this field is not populated,
   * use document_entity.entity.mid instead of document_entity.category.mid.
   * @return value or {@code null} for none
   */
  public java.lang.String getMid() {
    return mid;
  }

  /**
   * Mid representation of the category. Eg "/m/05qt0". WARNING: In UDR this field is not populated,
   * use document_entity.entity.mid instead of document_entity.category.mid.
   * @param mid mid or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotation setMid(java.lang.String mid) {
    this.mid = mid;
    return this;
  }

  /**
   * Qprime asserting this category.
   * @return value or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotationShoppingSignals getShopping() {
    return shopping;
  }

  /**
   * Qprime asserting this category.
   * @param shopping shopping or {@code null} for none
   */
  public RepositoryWebrefCategoryAnnotation setShopping(RepositoryWebrefCategoryAnnotationShoppingSignals shopping) {
    this.shopping = shopping;
    return this;
  }

  @Override
  public RepositoryWebrefCategoryAnnotation set(String fieldName, Object value) {
    return (RepositoryWebrefCategoryAnnotation) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefCategoryAnnotation clone() {
    return (RepositoryWebrefCategoryAnnotation) super.clone();
  }

}
