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
 * Segments (go/social-segments) represent structured social content, e.g. the contents of a G+
 * stream post or chat message. A single post or message may consist of a sequence of segments, each
 * representing a type of content, e.g. plain text, hash tag, mention, etc. Segments correspond
 * approximately to units of content delimited by HTML tags, so that a piece of bolded text would be
 * a distinct Segment, a link would be a distinct Segment, and so forth. A single Segment may have
 * multiple such qualifiers; e.g. it may be a bold link; in this case, information about all such
 * qualifiers will be encoded in the Segment proto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SocialCommonSegments extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SocialCommonSegment> segments;

  static {
    // hack to force ProGuard to consider SocialCommonSegment used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(SocialCommonSegment.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<SocialCommonSegment> getSegments() {
    return segments;
  }

  /**
   * @param segments segments or {@code null} for none
   */
  public SocialCommonSegments setSegments(java.util.List<SocialCommonSegment> segments) {
    this.segments = segments;
    return this;
  }

  @Override
  public SocialCommonSegments set(String fieldName, Object value) {
    return (SocialCommonSegments) super.set(fieldName, value);
  }

  @Override
  public SocialCommonSegments clone() {
    return (SocialCommonSegments) super.clone();
  }

}
