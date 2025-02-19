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
 * Message representing a Document (i.e. Google Docs, Sheets, Slides) This is currently only used to
 * indicate the existence of said document and can be later extended to include more document
 * information as needed.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QualityActionsReminderDocument extends com.google.api.client.json.GenericJson {

  @Override
  public QualityActionsReminderDocument set(String fieldName, Object value) {
    return (QualityActionsReminderDocument) super.set(fieldName, value);
  }

  @Override
  public QualityActionsReminderDocument clone() {
    return (QualityActionsReminderDocument) super.clone();
  }

}
