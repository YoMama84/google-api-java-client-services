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
 * LINT.IfChange(proto_voice_trigger) Next id: 2
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AssistantVerticalsHomeautomationProtoCommonVoiceTrigger extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * @param query query or {@code null} for none
   */
  public AssistantVerticalsHomeautomationProtoCommonVoiceTrigger setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  @Override
  public AssistantVerticalsHomeautomationProtoCommonVoiceTrigger set(String fieldName, Object value) {
    return (AssistantVerticalsHomeautomationProtoCommonVoiceTrigger) super.set(fieldName, value);
  }

  @Override
  public AssistantVerticalsHomeautomationProtoCommonVoiceTrigger clone() {
    return (AssistantVerticalsHomeautomationProtoCommonVoiceTrigger) super.clone();
  }

}
