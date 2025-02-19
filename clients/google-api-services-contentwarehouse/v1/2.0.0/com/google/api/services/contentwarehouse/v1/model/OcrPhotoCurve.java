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
 * Copy of ocr/goodoc/layout-common.proto:CurvedBoundingBox, temporary duplicated here to allow for
 * on-device builds.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OcrPhotoCurve extends com.google.api.client.json.GenericJson {

  /**
   * The sequence of points that approximate the curve.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OcrPhotoCurvePoint> points;

  /**
   * The sequence of points that approximate the curve.
   * @return value or {@code null} for none
   */
  public java.util.List<OcrPhotoCurvePoint> getPoints() {
    return points;
  }

  /**
   * The sequence of points that approximate the curve.
   * @param points points or {@code null} for none
   */
  public OcrPhotoCurve setPoints(java.util.List<OcrPhotoCurvePoint> points) {
    this.points = points;
    return this;
  }

  @Override
  public OcrPhotoCurve set(String fieldName, Object value) {
    return (OcrPhotoCurve) super.set(fieldName, value);
  }

  @Override
  public OcrPhotoCurve clone() {
    return (OcrPhotoCurve) super.clone();
  }

}
