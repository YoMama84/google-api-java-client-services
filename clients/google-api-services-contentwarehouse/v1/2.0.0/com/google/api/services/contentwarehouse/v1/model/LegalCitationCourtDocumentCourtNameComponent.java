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
 * The name broken down into its various components, such as core court, state, and district
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LegalCitationCourtDocumentCourtNameComponent extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Text")
  private java.lang.String text;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Type")
  private java.lang.Integer type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getText() {
    return text;
  }

  /**
   * @param text text or {@code null} for none
   */
  public LegalCitationCourtDocumentCourtNameComponent setText(java.lang.String text) {
    this.text = text;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public LegalCitationCourtDocumentCourtNameComponent setType(java.lang.Integer type) {
    this.type = type;
    return this;
  }

  @Override
  public LegalCitationCourtDocumentCourtNameComponent set(String fieldName, Object value) {
    return (LegalCitationCourtDocumentCourtNameComponent) super.set(fieldName, value);
  }

  @Override
  public LegalCitationCourtDocumentCourtNameComponent clone() {
    return (LegalCitationCourtDocumentCourtNameComponent) super.clone();
  }

}
