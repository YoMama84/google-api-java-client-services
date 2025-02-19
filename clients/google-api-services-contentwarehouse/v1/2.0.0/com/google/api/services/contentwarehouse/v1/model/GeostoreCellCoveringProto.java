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
 * This protocol buffer holds S2 cell covering for the feature. See util/geometry/s2cell_union.h for
 * more information on S2 cells. See geostore/base/public/cellcovering.h for utility functions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreCellCoveringProto extends com.google.api.client.json.GenericJson {

  /**
   * Array of S2 cell ids that represent the covering. There is no preset limit on how many cells
   * can be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> cellId;

  /**
   * Array of S2 cell ids that represent the covering. There is no preset limit on how many cells
   * can be used.
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getCellId() {
    return cellId;
  }

  /**
   * Array of S2 cell ids that represent the covering. There is no preset limit on how many cells
   * can be used.
   * @param cellId cellId or {@code null} for none
   */
  public GeostoreCellCoveringProto setCellId(java.util.List<java.math.BigInteger> cellId) {
    this.cellId = cellId;
    return this;
  }

  @Override
  public GeostoreCellCoveringProto set(String fieldName, Object value) {
    return (GeostoreCellCoveringProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreCellCoveringProto clone() {
    return (GeostoreCellCoveringProto) super.clone();
  }

}
