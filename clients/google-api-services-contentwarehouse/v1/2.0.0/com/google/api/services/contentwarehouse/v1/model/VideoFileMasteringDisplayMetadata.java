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
 * A message holding information about the mastering display color volume. This metadata can be used
 * when tone mapping an HDR signal to a display with a different gamut or brightness characteristics
 * than the mastering display. This message is capable of containing SMPTE 2086 metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoFileMasteringDisplayMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Coordinates of the blue primary of the mastering display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoFileMasteringDisplayMetadataCIE1931Coordinate blue;

  /**
   * Coordinates of the green primary of the mastering display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoFileMasteringDisplayMetadataCIE1931Coordinate green;

  /**
   * Maximum luminance of the display (in cd/m^2).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float maxLuminance;

  /**
   * Minimum luminance of the display (in cd/m^2).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float minLuminance;

  /**
   * Coordinates of the red primary of the mastering display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoFileMasteringDisplayMetadataCIE1931Coordinate red;

  /**
   * Coordinates of the white point of the mastering display.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoFileMasteringDisplayMetadataCIE1931Coordinate whitePoint;

  /**
   * Coordinates of the blue primary of the mastering display.
   * @return value or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadataCIE1931Coordinate getBlue() {
    return blue;
  }

  /**
   * Coordinates of the blue primary of the mastering display.
   * @param blue blue or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setBlue(VideoFileMasteringDisplayMetadataCIE1931Coordinate blue) {
    this.blue = blue;
    return this;
  }

  /**
   * Coordinates of the green primary of the mastering display.
   * @return value or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadataCIE1931Coordinate getGreen() {
    return green;
  }

  /**
   * Coordinates of the green primary of the mastering display.
   * @param green green or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setGreen(VideoFileMasteringDisplayMetadataCIE1931Coordinate green) {
    this.green = green;
    return this;
  }

  /**
   * Maximum luminance of the display (in cd/m^2).
   * @return value or {@code null} for none
   */
  public java.lang.Float getMaxLuminance() {
    return maxLuminance;
  }

  /**
   * Maximum luminance of the display (in cd/m^2).
   * @param maxLuminance maxLuminance or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setMaxLuminance(java.lang.Float maxLuminance) {
    this.maxLuminance = maxLuminance;
    return this;
  }

  /**
   * Minimum luminance of the display (in cd/m^2).
   * @return value or {@code null} for none
   */
  public java.lang.Float getMinLuminance() {
    return minLuminance;
  }

  /**
   * Minimum luminance of the display (in cd/m^2).
   * @param minLuminance minLuminance or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setMinLuminance(java.lang.Float minLuminance) {
    this.minLuminance = minLuminance;
    return this;
  }

  /**
   * Coordinates of the red primary of the mastering display.
   * @return value or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadataCIE1931Coordinate getRed() {
    return red;
  }

  /**
   * Coordinates of the red primary of the mastering display.
   * @param red red or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setRed(VideoFileMasteringDisplayMetadataCIE1931Coordinate red) {
    this.red = red;
    return this;
  }

  /**
   * Coordinates of the white point of the mastering display.
   * @return value or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadataCIE1931Coordinate getWhitePoint() {
    return whitePoint;
  }

  /**
   * Coordinates of the white point of the mastering display.
   * @param whitePoint whitePoint or {@code null} for none
   */
  public VideoFileMasteringDisplayMetadata setWhitePoint(VideoFileMasteringDisplayMetadataCIE1931Coordinate whitePoint) {
    this.whitePoint = whitePoint;
    return this;
  }

  @Override
  public VideoFileMasteringDisplayMetadata set(String fieldName, Object value) {
    return (VideoFileMasteringDisplayMetadata) super.set(fieldName, value);
  }

  @Override
  public VideoFileMasteringDisplayMetadata clone() {
    return (VideoFileMasteringDisplayMetadata) super.clone();
  }

}
