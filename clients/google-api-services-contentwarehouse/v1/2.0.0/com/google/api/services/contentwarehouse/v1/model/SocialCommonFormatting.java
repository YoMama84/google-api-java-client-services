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
 * Formatting information for a segment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SocialCommonFormatting extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bold;

  /**
   * This indicates that the segment should be rendered as highlighted or visually emphasized.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean highlight;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean italics;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean strikethrough;

  /**
   * If set, this indicates that the segment should be rendered with the specified style. The
   * absence of an explicit style represents "no style", i.e. the segment can be rendered with the
   * default style chosen by the application.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String style;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean underline;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBold() {
    return bold;
  }

  /**
   * @param bold bold or {@code null} for none
   */
  public SocialCommonFormatting setBold(java.lang.Boolean bold) {
    this.bold = bold;
    return this;
  }

  /**
   * This indicates that the segment should be rendered as highlighted or visually emphasized.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getHighlight() {
    return highlight;
  }

  /**
   * This indicates that the segment should be rendered as highlighted or visually emphasized.
   * @param highlight highlight or {@code null} for none
   */
  public SocialCommonFormatting setHighlight(java.lang.Boolean highlight) {
    this.highlight = highlight;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getItalics() {
    return italics;
  }

  /**
   * @param italics italics or {@code null} for none
   */
  public SocialCommonFormatting setItalics(java.lang.Boolean italics) {
    this.italics = italics;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getStrikethrough() {
    return strikethrough;
  }

  /**
   * @param strikethrough strikethrough or {@code null} for none
   */
  public SocialCommonFormatting setStrikethrough(java.lang.Boolean strikethrough) {
    this.strikethrough = strikethrough;
    return this;
  }

  /**
   * If set, this indicates that the segment should be rendered with the specified style. The
   * absence of an explicit style represents "no style", i.e. the segment can be rendered with the
   * default style chosen by the application.
   * @return value or {@code null} for none
   */
  public java.lang.String getStyle() {
    return style;
  }

  /**
   * If set, this indicates that the segment should be rendered with the specified style. The
   * absence of an explicit style represents "no style", i.e. the segment can be rendered with the
   * default style chosen by the application.
   * @param style style or {@code null} for none
   */
  public SocialCommonFormatting setStyle(java.lang.String style) {
    this.style = style;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getUnderline() {
    return underline;
  }

  /**
   * @param underline underline or {@code null} for none
   */
  public SocialCommonFormatting setUnderline(java.lang.Boolean underline) {
    this.underline = underline;
    return this;
  }

  @Override
  public SocialCommonFormatting set(String fieldName, Object value) {
    return (SocialCommonFormatting) super.set(fieldName, value);
  }

  @Override
  public SocialCommonFormatting clone() {
    return (SocialCommonFormatting) super.clone();
  }

}
