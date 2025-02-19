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
 * Text with bounding box.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OcrPhotoTextBox extends com.google.api.client.json.GenericJson {

  /**
   * ID of the text block that this line belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer blockId;

  /**
   * Text bounding box.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OcrPhotoBoundingBox box;

  /**
   * Content type for this box.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contentType;

  /**
   * Optional width of characters in the text.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Integer> symbolWidths;

  /**
   * Text string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String text;

  /**
   * ID of the text block that this line belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBlockId() {
    return blockId;
  }

  /**
   * ID of the text block that this line belongs to.
   * @param blockId blockId or {@code null} for none
   */
  public OcrPhotoTextBox setBlockId(java.lang.Integer blockId) {
    this.blockId = blockId;
    return this;
  }

  /**
   * Text bounding box.
   * @return value or {@code null} for none
   */
  public OcrPhotoBoundingBox getBox() {
    return box;
  }

  /**
   * Text bounding box.
   * @param box box or {@code null} for none
   */
  public OcrPhotoTextBox setBox(OcrPhotoBoundingBox box) {
    this.box = box;
    return this;
  }

  /**
   * Content type for this box.
   * @return value or {@code null} for none
   */
  public java.lang.String getContentType() {
    return contentType;
  }

  /**
   * Content type for this box.
   * @param contentType contentType or {@code null} for none
   */
  public OcrPhotoTextBox setContentType(java.lang.String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Optional width of characters in the text.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Integer> getSymbolWidths() {
    return symbolWidths;
  }

  /**
   * Optional width of characters in the text.
   * @param symbolWidths symbolWidths or {@code null} for none
   */
  public OcrPhotoTextBox setSymbolWidths(java.util.List<java.lang.Integer> symbolWidths) {
    this.symbolWidths = symbolWidths;
    return this;
  }

  /**
   * Text string.
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * Text string.
   * @param text text or {@code null} for none
   */
  public OcrPhotoTextBox setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  @Override
  public OcrPhotoTextBox set(String fieldName, Object value) {
    return (OcrPhotoTextBox) super.set(fieldName, value);
  }

  @Override
  public OcrPhotoTextBox clone() {
    return (OcrPhotoTextBox) super.clone();
  }

}
