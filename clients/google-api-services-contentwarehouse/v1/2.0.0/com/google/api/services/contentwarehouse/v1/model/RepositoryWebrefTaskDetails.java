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
 * Information about what the raters saw, how the information was presented to them, or how they
 * interacted with the task. Next id: 6
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RepositoryWebrefTaskDetails extends com.google.api.client.json.GenericJson {

  /**
   * The id of the experiment in case we are dealing with a refx data experiment. Should only be set
   * in case of data experiments to gather topicality ratings, in order to allow separating these
   * ratings from regular ratings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String experimentId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastSubmitTimestamp;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicDescription;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String topicUrl;

  /**
   * The id of the experiment in case we are dealing with a refx data experiment. Should only be set
   * in case of data experiments to gather topicality ratings, in order to allow separating these
   * ratings from regular ratings.
   * @return value or {@code null} for none
   */
  public java.lang.String getExperimentId() {
    return experimentId;
  }

  /**
   * The id of the experiment in case we are dealing with a refx data experiment. Should only be set
   * in case of data experiments to gather topicality ratings, in order to allow separating these
   * ratings from regular ratings.
   * @param experimentId experimentId or {@code null} for none
   */
  public RepositoryWebrefTaskDetails setExperimentId(java.lang.String experimentId) {
    this.experimentId = experimentId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastSubmitTimestamp() {
    return lastSubmitTimestamp;
  }

  /**
   * @param lastSubmitTimestamp lastSubmitTimestamp or {@code null} for none
   */
  public RepositoryWebrefTaskDetails setLastSubmitTimestamp(java.lang.Long lastSubmitTimestamp) {
    this.lastSubmitTimestamp = lastSubmitTimestamp;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicDescription() {
    return topicDescription;
  }

  /**
   * @param topicDescription topicDescription or {@code null} for none
   */
  public RepositoryWebrefTaskDetails setTopicDescription(java.lang.String topicDescription) {
    this.topicDescription = topicDescription;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicName() {
    return topicName;
  }

  /**
   * @param topicName topicName or {@code null} for none
   */
  public RepositoryWebrefTaskDetails setTopicName(java.lang.String topicName) {
    this.topicName = topicName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getTopicUrl() {
    return topicUrl;
  }

  /**
   * @param topicUrl topicUrl or {@code null} for none
   */
  public RepositoryWebrefTaskDetails setTopicUrl(java.lang.String topicUrl) {
    this.topicUrl = topicUrl;
    return this;
  }

  @Override
  public RepositoryWebrefTaskDetails set(String fieldName, Object value) {
    return (RepositoryWebrefTaskDetails) super.set(fieldName, value);
  }

  @Override
  public RepositoryWebrefTaskDetails clone() {
    return (RepositoryWebrefTaskDetails) super.clone();
  }

}
