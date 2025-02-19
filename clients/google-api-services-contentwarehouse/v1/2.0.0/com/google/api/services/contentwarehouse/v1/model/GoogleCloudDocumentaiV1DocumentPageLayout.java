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
 * Visual element describing a layout unit on a page.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1DocumentPageLayout extends com.google.api.client.json.GenericJson {

  /**
   * The bounding polygon for the Layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1BoundingPoly boundingPoly;

  /**
   * Confidence of the current Layout within context of the object this layout is for. e.g.
   * confidence can be for a single token, a table, a visual element, etc. depending on context.
   * Range `[0, 1]`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float confidence;

  /**
   * Detected orientation for the Layout.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String orientation;

  /**
   * Text anchor indexing into the Document.text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1DocumentTextAnchor textAnchor;

  /**
   * The bounding polygon for the Layout.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1BoundingPoly getBoundingPoly() {
    return boundingPoly;
  }

  /**
   * The bounding polygon for the Layout.
   * @param boundingPoly boundingPoly or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageLayout setBoundingPoly(GoogleCloudDocumentaiV1BoundingPoly boundingPoly) {
    this.boundingPoly = boundingPoly;
    return this;
  }

  /**
   * Confidence of the current Layout within context of the object this layout is for. e.g.
   * confidence can be for a single token, a table, a visual element, etc. depending on context.
   * Range `[0, 1]`.
   * @return value or {@code null} for none
   */
  public java.lang.Float getConfidence() {
    return confidence;
  }

  /**
   * Confidence of the current Layout within context of the object this layout is for. e.g.
   * confidence can be for a single token, a table, a visual element, etc. depending on context.
   * Range `[0, 1]`.
   * @param confidence confidence or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageLayout setConfidence(java.lang.Float confidence) {
    this.confidence = confidence;
    return this;
  }

  /**
   * Detected orientation for the Layout.
   * @return value or {@code null} for none
   */
  public java.lang.String getOrientation() {
    return orientation;
  }

  /**
   * Detected orientation for the Layout.
   * @param orientation orientation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageLayout setOrientation(java.lang.String orientation) {
    this.orientation = orientation;
    return this;
  }

  /**
   * Text anchor indexing into the Document.text.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentTextAnchor getTextAnchor() {
    return textAnchor;
  }

  /**
   * Text anchor indexing into the Document.text.
   * @param textAnchor textAnchor or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentPageLayout setTextAnchor(GoogleCloudDocumentaiV1DocumentTextAnchor textAnchor) {
    this.textAnchor = textAnchor;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageLayout set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1DocumentPageLayout) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1DocumentPageLayout clone() {
    return (GoogleCloudDocumentaiV1DocumentPageLayout) super.clone();
  }

}
