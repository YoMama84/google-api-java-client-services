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
 * The generic version of a snippet response
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GenericSnippetResponse extends com.google.api.client.json.GenericJson {

  /**
   * Per-doc debug information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> debugInfo;

  /**
   * Servlet-specific response info.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet info;

  /**
   * Lines of the snippet HTML. Typically gws concatenates these and lets the browser wrap. The
   * values include trailing spaces, so inserting additional spaces is not necessary. However, for
   * very old browsers, gws may insert break tags after each snippet line. This field is confusing
   * and poorly named; "snippet_line" would be better. In particular, note that this does not return
   * multiple snippets for a result. Nor are these fields the individual tidbits of the snippet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> snippet;

  /**
   * The title HTML. It may contain tags to denote query term matches. It may be already truncated
   * and "..." is put instead (note that truncation does not always happen at the very end of the
   * title text). However the existence of "..." does not guarantee that the snippet generation
   * algorithm truncated it; e.g. webmasters themselves can write "...".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * Snippet-specific members (tag ids 16+, must be optional!) Example: optional NewContentResponse
   * new_response;
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WWWSnippetResponse wwwSnippetResponse;

  /**
   * Per-doc debug information.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDebugInfo() {
    return debugInfo;
  }

  /**
   * Per-doc debug information.
   * @param debugInfo debugInfo or {@code null} for none
   */
  public GenericSnippetResponse setDebugInfo(java.util.List<java.lang.String> debugInfo) {
    this.debugInfo = debugInfo;
    return this;
  }

  /**
   * Servlet-specific response info.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getInfo() {
    return info;
  }

  /**
   * Servlet-specific response info.
   * @param info info or {@code null} for none
   */
  public GenericSnippetResponse setInfo(Proto2BridgeMessageSet info) {
    this.info = info;
    return this;
  }

  /**
   * Lines of the snippet HTML. Typically gws concatenates these and lets the browser wrap. The
   * values include trailing spaces, so inserting additional spaces is not necessary. However, for
   * very old browsers, gws may insert break tags after each snippet line. This field is confusing
   * and poorly named; "snippet_line" would be better. In particular, note that this does not return
   * multiple snippets for a result. Nor are these fields the individual tidbits of the snippet.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSnippet() {
    return snippet;
  }

  /**
   * Lines of the snippet HTML. Typically gws concatenates these and lets the browser wrap. The
   * values include trailing spaces, so inserting additional spaces is not necessary. However, for
   * very old browsers, gws may insert break tags after each snippet line. This field is confusing
   * and poorly named; "snippet_line" would be better. In particular, note that this does not return
   * multiple snippets for a result. Nor are these fields the individual tidbits of the snippet.
   * @param snippet snippet or {@code null} for none
   */
  public GenericSnippetResponse setSnippet(java.util.List<java.lang.String> snippet) {
    this.snippet = snippet;
    return this;
  }

  /**
   * The title HTML. It may contain tags to denote query term matches. It may be already truncated
   * and "..." is put instead (note that truncation does not always happen at the very end of the
   * title text). However the existence of "..." does not guarantee that the snippet generation
   * algorithm truncated it; e.g. webmasters themselves can write "...".
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * The title HTML. It may contain tags to denote query term matches. It may be already truncated
   * and "..." is put instead (note that truncation does not always happen at the very end of the
   * title text). However the existence of "..." does not guarantee that the snippet generation
   * algorithm truncated it; e.g. webmasters themselves can write "...".
   * @param title title or {@code null} for none
   */
  public GenericSnippetResponse setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * Snippet-specific members (tag ids 16+, must be optional!) Example: optional NewContentResponse
   * new_response;
   * @return value or {@code null} for none
   */
  public WWWSnippetResponse getWwwSnippetResponse() {
    return wwwSnippetResponse;
  }

  /**
   * Snippet-specific members (tag ids 16+, must be optional!) Example: optional NewContentResponse
   * new_response;
   * @param wwwSnippetResponse wwwSnippetResponse or {@code null} for none
   */
  public GenericSnippetResponse setWwwSnippetResponse(WWWSnippetResponse wwwSnippetResponse) {
    this.wwwSnippetResponse = wwwSnippetResponse;
    return this;
  }

  @Override
  public GenericSnippetResponse set(String fieldName, Object value) {
    return (GenericSnippetResponse) super.set(fieldName, value);
  }

  @Override
  public GenericSnippetResponse clone() {
    return (GenericSnippetResponse) super.clone();
  }

}
