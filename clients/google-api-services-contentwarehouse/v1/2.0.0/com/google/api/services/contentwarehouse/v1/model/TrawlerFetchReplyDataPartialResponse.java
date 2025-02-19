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
 * ---------------------------------------------------------------------- PartialResponse is used
 * with streaming responses in LargeFileFetchAdapter. Rather than fitting entirely in a single
 * FetchReply, there is a series of FetchReplies until IsFinalResponse. Each group of responses will
 * have a unique FetchID to link them.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrawlerFetchReplyDataPartialResponse extends com.google.api.client.json.GenericJson {

  /**
   * If set, indicates where the fetched body is, e.g. a CNS file path. FetchReply.Body should be
   * empty in this case. In the case where client does not support streaming but the content is too
   * large to be accumulated in memory, we keep writing the streaming chunks to some storage unit
   * and notify client when it is done.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("BodyLocation")
  private java.lang.String bodyLocation;

  /**
   * Fetch number in this series of fetches
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ChunkNumber")
  private java.lang.Integer chunkNumber;

  /**
   * If there is a Content-Range header, the ranges in it
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ContentRange")
  private TrawlerContentRangeInfo contentRange;

  /**
   * Any ETag seen in the headers
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ETag")
  private java.lang.String eTag;

  /**
   * ID which links all partial fetches for this url
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("FetchID") @com.google.api.client.json.JsonString
  private java.math.BigInteger fetchID;

  /**
   * Is this the final response for this fetch?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("IsFinalResponse")
  private java.lang.Boolean isFinalResponse;

  /**
   * If set, indicates where the fetched body is, e.g. a CNS file path. FetchReply.Body should be
   * empty in this case. In the case where client does not support streaming but the content is too
   * large to be accumulated in memory, we keep writing the streaming chunks to some storage unit
   * and notify client when it is done.
   * @return value or {@code null} for none
   */
  public java.lang.String getBodyLocation() {
    return bodyLocation;
  }

  /**
   * If set, indicates where the fetched body is, e.g. a CNS file path. FetchReply.Body should be
   * empty in this case. In the case where client does not support streaming but the content is too
   * large to be accumulated in memory, we keep writing the streaming chunks to some storage unit
   * and notify client when it is done.
   * @param bodyLocation bodyLocation or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setBodyLocation(java.lang.String bodyLocation) {
    this.bodyLocation = bodyLocation;
    return this;
  }

  /**
   * Fetch number in this series of fetches
   * @return value or {@code null} for none
   */
  public java.lang.Integer getChunkNumber() {
    return chunkNumber;
  }

  /**
   * Fetch number in this series of fetches
   * @param chunkNumber chunkNumber or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setChunkNumber(java.lang.Integer chunkNumber) {
    this.chunkNumber = chunkNumber;
    return this;
  }

  /**
   * If there is a Content-Range header, the ranges in it
   * @return value or {@code null} for none
   */
  public TrawlerContentRangeInfo getContentRange() {
    return contentRange;
  }

  /**
   * If there is a Content-Range header, the ranges in it
   * @param contentRange contentRange or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setContentRange(TrawlerContentRangeInfo contentRange) {
    this.contentRange = contentRange;
    return this;
  }

  /**
   * Any ETag seen in the headers
   * @return value or {@code null} for none
   */
  public java.lang.String getETag() {
    return eTag;
  }

  /**
   * Any ETag seen in the headers
   * @param eTag eTag or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setETag(java.lang.String eTag) {
    this.eTag = eTag;
    return this;
  }

  /**
   * ID which links all partial fetches for this url
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getFetchID() {
    return fetchID;
  }

  /**
   * ID which links all partial fetches for this url
   * @param fetchID fetchID or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setFetchID(java.math.BigInteger fetchID) {
    this.fetchID = fetchID;
    return this;
  }

  /**
   * Is this the final response for this fetch?
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsFinalResponse() {
    return isFinalResponse;
  }

  /**
   * Is this the final response for this fetch?
   * @param isFinalResponse isFinalResponse or {@code null} for none
   */
  public TrawlerFetchReplyDataPartialResponse setIsFinalResponse(java.lang.Boolean isFinalResponse) {
    this.isFinalResponse = isFinalResponse;
    return this;
  }

  @Override
  public TrawlerFetchReplyDataPartialResponse set(String fieldName, Object value) {
    return (TrawlerFetchReplyDataPartialResponse) super.set(fieldName, value);
  }

  @Override
  public TrawlerFetchReplyDataPartialResponse clone() {
    return (TrawlerFetchReplyDataPartialResponse) super.clone();
  }

}
