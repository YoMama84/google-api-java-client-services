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

package com.google.api.services.healthcare.v1beta1.model;

/**
 * Shift the date by a randomized number of days. See [date
 * shifting](https://cloud.google.com/dlp/docs/concepts-date-shifting) for more information.
 * Supported [types](https://www.hl7.org/fhir/datatypes.html): Date, DateTime
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Healthcare API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DateShiftField extends com.google.api.client.json.GenericJson {

  @Override
  public DateShiftField set(String fieldName, Object value) {
    return (DateShiftField) super.set(fieldName, value);
  }

  @Override
  public DateShiftField clone() {
    return (DateShiftField) super.clone();
  }

}
