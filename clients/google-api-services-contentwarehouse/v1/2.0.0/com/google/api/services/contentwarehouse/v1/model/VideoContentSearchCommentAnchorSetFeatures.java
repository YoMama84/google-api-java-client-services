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
 * A message containing set-level comment anchor features. Next ID: 3
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VideoContentSearchCommentAnchorSetFeatures extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VideoContentSearchCommentAnchorSetFeaturesComment> replies;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VideoContentSearchCommentAnchorSetFeaturesComment rootComment;

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<VideoContentSearchCommentAnchorSetFeaturesComment> getReplies() {
    return replies;
  }

  /**
   * @param replies replies or {@code null} for none
   */
  public VideoContentSearchCommentAnchorSetFeatures setReplies(java.util.List<VideoContentSearchCommentAnchorSetFeaturesComment> replies) {
    this.replies = replies;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public VideoContentSearchCommentAnchorSetFeaturesComment getRootComment() {
    return rootComment;
  }

  /**
   * @param rootComment rootComment or {@code null} for none
   */
  public VideoContentSearchCommentAnchorSetFeatures setRootComment(VideoContentSearchCommentAnchorSetFeaturesComment rootComment) {
    this.rootComment = rootComment;
    return this;
  }

  @Override
  public VideoContentSearchCommentAnchorSetFeatures set(String fieldName, Object value) {
    return (VideoContentSearchCommentAnchorSetFeatures) super.set(fieldName, value);
  }

  @Override
  public VideoContentSearchCommentAnchorSetFeatures clone() {
    return (VideoContentSearchCommentAnchorSetFeatures) super.clone();
  }

}
