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
 * the extra info response from ascorer used to build snippets in GWS experiments
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExtraSnippetInfoResponse extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExtraSnippetInfoResponseMatchInfo matchinfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExtraSnippetInfoResponseQuerySubitem> querysubitem;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ExtraSnippetInfoResponseTidbit> tidbit;

  /**
   * @return value or {@code null} for none
   */
  public ExtraSnippetInfoResponseMatchInfo getMatchinfo() {
    return matchinfo;
  }

  /**
   * @param matchinfo matchinfo or {@code null} for none
   */
  public ExtraSnippetInfoResponse setMatchinfo(ExtraSnippetInfoResponseMatchInfo matchinfo) {
    this.matchinfo = matchinfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ExtraSnippetInfoResponseQuerySubitem> getQuerysubitem() {
    return querysubitem;
  }

  /**
   * @param querysubitem querysubitem or {@code null} for none
   */
  public ExtraSnippetInfoResponse setQuerysubitem(java.util.List<ExtraSnippetInfoResponseQuerySubitem> querysubitem) {
    this.querysubitem = querysubitem;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<ExtraSnippetInfoResponseTidbit> getTidbit() {
    return tidbit;
  }

  /**
   * @param tidbit tidbit or {@code null} for none
   */
  public ExtraSnippetInfoResponse setTidbit(java.util.List<ExtraSnippetInfoResponseTidbit> tidbit) {
    this.tidbit = tidbit;
    return this;
  }

  @Override
  public ExtraSnippetInfoResponse set(String fieldName, Object value) {
    return (ExtraSnippetInfoResponse) super.set(fieldName, value);
  }

  @Override
  public ExtraSnippetInfoResponse clone() {
    return (ExtraSnippetInfoResponse) super.clone();
  }

}
