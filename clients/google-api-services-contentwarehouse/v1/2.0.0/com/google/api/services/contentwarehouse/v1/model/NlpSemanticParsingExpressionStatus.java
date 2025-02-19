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
 * Status indicating whether the user has finished expressing their intended semantics during a
 * streaming interaction. Semantics are partially expressed when later, unprompted user input is
 * expected to modify the semantics. Future inputs are typically additional speech or continued
 * modification of argument text in form field. These inputs can trigger modifications including
 * adding arguments, changing the intent, or modifying existing arguments. Sensing this status can
 * be done both directly and indirectly. Fluid Actions directly detects this status as the user
 * moves between, or enters and leaves, argument form fields. Understanding indirectly detects this
 * status by the pace of the user's speech, the semantics of the language, and the user's
 * intonation. See go/streaming-nlu-fulfilment-protocol-v1 for details about how it is used in the
 * Streaming NLU Fulfillment protocol.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingExpressionStatus extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * @param status status or {@code null} for none
   */
  public NlpSemanticParsingExpressionStatus setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  @Override
  public NlpSemanticParsingExpressionStatus set(String fieldName, Object value) {
    return (NlpSemanticParsingExpressionStatus) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingExpressionStatus clone() {
    return (NlpSemanticParsingExpressionStatus) super.clone();
  }

}
