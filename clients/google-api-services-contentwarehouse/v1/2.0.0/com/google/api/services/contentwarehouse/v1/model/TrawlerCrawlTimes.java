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
 * This is similar to CrawlDates group in FetchReplyData, except that 1) it's a message; 2) it's
 * filled in each Redirects hop; and 3) the timestamps are in ms rather than seconds since Unix
 * Epoch.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TrawlerCrawlTimes extends com.google.api.client.json.GenericJson {

  /**
   * fetched from the web. Time when the page was last
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("NotChangedTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long notChangedTimeMs;

  /**
   * Time when the page was
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("OriginalCrawlTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long originalCrawlTimeMs;

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("ReuseTimeMs") @com.google.api.client.json.JsonString
  private java.lang.Long reuseTimeMs;

  /**
   * fetched from the web. Time when the page was last
   * @return value or {@code null} for none
   */
  public java.lang.Long getNotChangedTimeMs() {
    return notChangedTimeMs;
  }

  /**
   * fetched from the web. Time when the page was last
   * @param notChangedTimeMs notChangedTimeMs or {@code null} for none
   */
  public TrawlerCrawlTimes setNotChangedTimeMs(java.lang.Long notChangedTimeMs) {
    this.notChangedTimeMs = notChangedTimeMs;
    return this;
  }

  /**
   * Time when the page was
   * @return value or {@code null} for none
   */
  public java.lang.Long getOriginalCrawlTimeMs() {
    return originalCrawlTimeMs;
  }

  /**
   * Time when the page was
   * @param originalCrawlTimeMs originalCrawlTimeMs or {@code null} for none
   */
  public TrawlerCrawlTimes setOriginalCrawlTimeMs(java.lang.Long originalCrawlTimeMs) {
    this.originalCrawlTimeMs = originalCrawlTimeMs;
    return this;
  }

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * @return value or {@code null} for none
   */
  public java.lang.Long getReuseTimeMs() {
    return reuseTimeMs;
  }

  /**
   * checked but found to be the same as before. If set, timestamp to indicate
   * @param reuseTimeMs reuseTimeMs or {@code null} for none
   */
  public TrawlerCrawlTimes setReuseTimeMs(java.lang.Long reuseTimeMs) {
    this.reuseTimeMs = reuseTimeMs;
    return this;
  }

  @Override
  public TrawlerCrawlTimes set(String fieldName, Object value) {
    return (TrawlerCrawlTimes) super.set(fieldName, value);
  }

  @Override
  public TrawlerCrawlTimes clone() {
    return (TrawlerCrawlTimes) super.clone();
  }

}
