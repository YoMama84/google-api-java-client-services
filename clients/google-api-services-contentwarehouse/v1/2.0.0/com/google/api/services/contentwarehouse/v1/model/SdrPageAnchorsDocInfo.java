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
 * Model definition for SdrPageAnchorsDocInfo.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SdrPageAnchorsDocInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float articleness;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SdrPageAnchorsSitelink> pageAnchors;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float qscore;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SdrPageAnchorsSitelinkWrapper> sitelinkWrapper;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float textRichness;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getArticleness() {
    return articleness;
  }

  /**
   * @param articleness articleness or {@code null} for none
   */
  public SdrPageAnchorsDocInfo setArticleness(java.lang.Float articleness) {
    this.articleness = articleness;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SdrPageAnchorsSitelink> getPageAnchors() {
    return pageAnchors;
  }

  /**
   * @param pageAnchors pageAnchors or {@code null} for none
   */
  public SdrPageAnchorsDocInfo setPageAnchors(java.util.List<SdrPageAnchorsSitelink> pageAnchors) {
    this.pageAnchors = pageAnchors;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getQscore() {
    return qscore;
  }

  /**
   * @param qscore qscore or {@code null} for none
   */
  public SdrPageAnchorsDocInfo setQscore(java.lang.Float qscore) {
    this.qscore = qscore;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SdrPageAnchorsSitelinkWrapper> getSitelinkWrapper() {
    return sitelinkWrapper;
  }

  /**
   * @param sitelinkWrapper sitelinkWrapper or {@code null} for none
   */
  public SdrPageAnchorsDocInfo setSitelinkWrapper(java.util.List<SdrPageAnchorsSitelinkWrapper> sitelinkWrapper) {
    this.sitelinkWrapper = sitelinkWrapper;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getTextRichness() {
    return textRichness;
  }

  /**
   * @param textRichness textRichness or {@code null} for none
   */
  public SdrPageAnchorsDocInfo setTextRichness(java.lang.Float textRichness) {
    this.textRichness = textRichness;
    return this;
  }

  @Override
  public SdrPageAnchorsDocInfo set(String fieldName, Object value) {
    return (SdrPageAnchorsDocInfo) super.set(fieldName, value);
  }

  @Override
  public SdrPageAnchorsDocInfo clone() {
    return (SdrPageAnchorsDocInfo) super.clone();
  }

}
