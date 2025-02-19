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
 * Metadata on source assertions that isn't part of the user-visible Triple payload, and that
 * doesn't really represent data provenance, but that's used to affect the way Livegraph and
 * possibly other horizontal KG infra systems *process* the triple. Read: fields below really
 * shouldn't be part of the cross-system Triple proto at all. But because Triple is used both as an
 * internal and an external KG API, we at least want to "hide" those fields that ought to be purely
 * part of the internal source <-> LG contract. Next id: 5
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StorageGraphBfgLivegraphProvenanceMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Identifies the LG internal writers that asserted the triple. This is the same as 'origin_id' in
   * LG. This will only be populated by the LG writers to FactStore
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger lgInternalWriterId;

  /**
   * Whether this provenance is a provenance only addition or not. A provenance is considered an
   * "addition" if it belongs to a triple that we expect FactStore to contain on its own (i.e
   * through some inference), and thus we will *not* attempt to write it explicitly. This is a
   * composer only populated field. Clients are not expected to populate this field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean provenanceOnlyAddition;

  /**
   * Triples typically have a single triangulation key. This field supports > 1 keys to allow staged
   * transition to a different key scheme. To successfully triangulate in the Livegraph Composer,
   * the triple must have >=3 instances and each triple instance having a pairwise disjoint set of
   * triangulation keys. The triangulation keys supplied for a single input triple are treated part
   * of the same set, so a single triple cannot self-triangulate, regardless of how many
   * triangulation keys it has. Note2: If a triple has multiple provenances, each one is expected to
   * set the same triangulation_keys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> triangulationKey;

  /**
   * WARNING! The feature is still under active development and the exact semantics may be subject
   * to change pending KE Design Review. Data marked as weak will be less preferred to regular data
   * which does not have the marker. This allows ingesting data with a lower chance of negatively
   * affecting existing features and products, at the cost of potentially not showing the data when
   * competing data is available. Specifically, weak data is less preferred by conflict resolution
   * inside of Livegraph composition. Additionally, RefX triggering will prefer to trigger based on
   * signals computed from regular data. Aside from data providers choosing to mark their data as
   * weak, Livegraph and RefX are the only horizontal systems expected to use this information.
   * Please contact livegraph-team@ if you see a need for this to change. See go/weak-data for more
   * information.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean weakData;

  /**
   * Identifies the LG internal writers that asserted the triple. This is the same as 'origin_id' in
   * LG. This will only be populated by the LG writers to FactStore
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getLgInternalWriterId() {
    return lgInternalWriterId;
  }

  /**
   * Identifies the LG internal writers that asserted the triple. This is the same as 'origin_id' in
   * LG. This will only be populated by the LG writers to FactStore
   * @param lgInternalWriterId lgInternalWriterId or {@code null} for none
   */
  public StorageGraphBfgLivegraphProvenanceMetadata setLgInternalWriterId(java.math.BigInteger lgInternalWriterId) {
    this.lgInternalWriterId = lgInternalWriterId;
    return this;
  }

  /**
   * Whether this provenance is a provenance only addition or not. A provenance is considered an
   * "addition" if it belongs to a triple that we expect FactStore to contain on its own (i.e
   * through some inference), and thus we will *not* attempt to write it explicitly. This is a
   * composer only populated field. Clients are not expected to populate this field.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getProvenanceOnlyAddition() {
    return provenanceOnlyAddition;
  }

  /**
   * Whether this provenance is a provenance only addition or not. A provenance is considered an
   * "addition" if it belongs to a triple that we expect FactStore to contain on its own (i.e
   * through some inference), and thus we will *not* attempt to write it explicitly. This is a
   * composer only populated field. Clients are not expected to populate this field.
   * @param provenanceOnlyAddition provenanceOnlyAddition or {@code null} for none
   */
  public StorageGraphBfgLivegraphProvenanceMetadata setProvenanceOnlyAddition(java.lang.Boolean provenanceOnlyAddition) {
    this.provenanceOnlyAddition = provenanceOnlyAddition;
    return this;
  }

  /**
   * Triples typically have a single triangulation key. This field supports > 1 keys to allow staged
   * transition to a different key scheme. To successfully triangulate in the Livegraph Composer,
   * the triple must have >=3 instances and each triple instance having a pairwise disjoint set of
   * triangulation keys. The triangulation keys supplied for a single input triple are treated part
   * of the same set, so a single triple cannot self-triangulate, regardless of how many
   * triangulation keys it has. Note2: If a triple has multiple provenances, each one is expected to
   * set the same triangulation_keys.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTriangulationKey() {
    return triangulationKey;
  }

  /**
   * Triples typically have a single triangulation key. This field supports > 1 keys to allow staged
   * transition to a different key scheme. To successfully triangulate in the Livegraph Composer,
   * the triple must have >=3 instances and each triple instance having a pairwise disjoint set of
   * triangulation keys. The triangulation keys supplied for a single input triple are treated part
   * of the same set, so a single triple cannot self-triangulate, regardless of how many
   * triangulation keys it has. Note2: If a triple has multiple provenances, each one is expected to
   * set the same triangulation_keys.
   * @param triangulationKey triangulationKey or {@code null} for none
   */
  public StorageGraphBfgLivegraphProvenanceMetadata setTriangulationKey(java.util.List<java.lang.String> triangulationKey) {
    this.triangulationKey = triangulationKey;
    return this;
  }

  /**
   * WARNING! The feature is still under active development and the exact semantics may be subject
   * to change pending KE Design Review. Data marked as weak will be less preferred to regular data
   * which does not have the marker. This allows ingesting data with a lower chance of negatively
   * affecting existing features and products, at the cost of potentially not showing the data when
   * competing data is available. Specifically, weak data is less preferred by conflict resolution
   * inside of Livegraph composition. Additionally, RefX triggering will prefer to trigger based on
   * signals computed from regular data. Aside from data providers choosing to mark their data as
   * weak, Livegraph and RefX are the only horizontal systems expected to use this information.
   * Please contact livegraph-team@ if you see a need for this to change. See go/weak-data for more
   * information.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWeakData() {
    return weakData;
  }

  /**
   * WARNING! The feature is still under active development and the exact semantics may be subject
   * to change pending KE Design Review. Data marked as weak will be less preferred to regular data
   * which does not have the marker. This allows ingesting data with a lower chance of negatively
   * affecting existing features and products, at the cost of potentially not showing the data when
   * competing data is available. Specifically, weak data is less preferred by conflict resolution
   * inside of Livegraph composition. Additionally, RefX triggering will prefer to trigger based on
   * signals computed from regular data. Aside from data providers choosing to mark their data as
   * weak, Livegraph and RefX are the only horizontal systems expected to use this information.
   * Please contact livegraph-team@ if you see a need for this to change. See go/weak-data for more
   * information.
   * @param weakData weakData or {@code null} for none
   */
  public StorageGraphBfgLivegraphProvenanceMetadata setWeakData(java.lang.Boolean weakData) {
    this.weakData = weakData;
    return this;
  }

  @Override
  public StorageGraphBfgLivegraphProvenanceMetadata set(String fieldName, Object value) {
    return (StorageGraphBfgLivegraphProvenanceMetadata) super.set(fieldName, value);
  }

  @Override
  public StorageGraphBfgLivegraphProvenanceMetadata clone() {
    return (StorageGraphBfgLivegraphProvenanceMetadata) super.clone();
  }

}
