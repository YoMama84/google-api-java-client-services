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
 * Only one of timestamp_msec or frame_identifier should be set. timestamp_msec is the old
 * identifier for frames, and is still used on thumbnail frames. frame_identifier should be used on
 * other kinds of frames (e.g. preview frame zero).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ImageRepositoryFramePerdoc extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageRepositoryFrameIdentifier frameIdentifier;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ImageData perdoc;

  /**
   * Timestamp (in msec) of the frame from the original video DEPRECATED: Use the timestamp_ms field
   * in frame_identifier instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timestampMsec;

  /**
   * @return value or {@code null} for none
   */
  public ImageRepositoryFrameIdentifier getFrameIdentifier() {
    return frameIdentifier;
  }

  /**
   * @param frameIdentifier frameIdentifier or {@code null} for none
   */
  public ImageRepositoryFramePerdoc setFrameIdentifier(ImageRepositoryFrameIdentifier frameIdentifier) {
    this.frameIdentifier = frameIdentifier;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public ImageData getPerdoc() {
    return perdoc;
  }

  /**
   * @param perdoc perdoc or {@code null} for none
   */
  public ImageRepositoryFramePerdoc setPerdoc(ImageData perdoc) {
    this.perdoc = perdoc;
    return this;
  }

  /**
   * Timestamp (in msec) of the frame from the original video DEPRECATED: Use the timestamp_ms field
   * in frame_identifier instead.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimestampMsec() {
    return timestampMsec;
  }

  /**
   * Timestamp (in msec) of the frame from the original video DEPRECATED: Use the timestamp_ms field
   * in frame_identifier instead.
   * @param timestampMsec timestampMsec or {@code null} for none
   */
  public ImageRepositoryFramePerdoc setTimestampMsec(java.lang.Integer timestampMsec) {
    this.timestampMsec = timestampMsec;
    return this;
  }

  @Override
  public ImageRepositoryFramePerdoc set(String fieldName, Object value) {
    return (ImageRepositoryFramePerdoc) super.set(fieldName, value);
  }

  @Override
  public ImageRepositoryFramePerdoc clone() {
    return (ImageRepositoryFramePerdoc) super.clone();
  }

}
