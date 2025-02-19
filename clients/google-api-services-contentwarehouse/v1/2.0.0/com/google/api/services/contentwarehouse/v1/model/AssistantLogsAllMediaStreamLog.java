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
 * Model definition for AssistantLogsAllMediaStreamLog.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantLogsAllMediaStreamLog extends com.google.api.client.json.GenericJson {

  /**
   * All active media streams while the user issues the query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<AssistantLogsMediaStreamLog> streams;

  /**
   * The stream selected by stream transfer logic to be transferred to another device. It will be
   * empty for other features. Target_stream is different from target_device since target_stream
   * could have multiple devices.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AssistantLogsMediaStreamLog targetStream;

  /**
   * All active media streams while the user issues the query.
   * @return value or {@code null} for none
   */
  public java.util.List<AssistantLogsMediaStreamLog> getStreams() {
    return streams;
  }

  /**
   * All active media streams while the user issues the query.
   * @param streams streams or {@code null} for none
   */
  public AssistantLogsAllMediaStreamLog setStreams(java.util.List<AssistantLogsMediaStreamLog> streams) {
    this.streams = streams;
    return this;
  }

  /**
   * The stream selected by stream transfer logic to be transferred to another device. It will be
   * empty for other features. Target_stream is different from target_device since target_stream
   * could have multiple devices.
   * @return value or {@code null} for none
   */
  public AssistantLogsMediaStreamLog getTargetStream() {
    return targetStream;
  }

  /**
   * The stream selected by stream transfer logic to be transferred to another device. It will be
   * empty for other features. Target_stream is different from target_device since target_stream
   * could have multiple devices.
   * @param targetStream targetStream or {@code null} for none
   */
  public AssistantLogsAllMediaStreamLog setTargetStream(AssistantLogsMediaStreamLog targetStream) {
    this.targetStream = targetStream;
    return this;
  }

  @Override
  public AssistantLogsAllMediaStreamLog set(String fieldName, Object value) {
    return (AssistantLogsAllMediaStreamLog) super.set(fieldName, value);
  }

  @Override
  public AssistantLogsAllMediaStreamLog clone() {
    return (AssistantLogsAllMediaStreamLog) super.clone();
  }

}
