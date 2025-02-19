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
 * Metadata related to the history of a given feature in the Geo repository.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreFeatureHistoryMetadataProto extends com.google.api.client.json.GenericJson {

  /**
   * The timestamp (in microseconds since the UNIX epoch) when this feature first went live in the
   * Geo repository. Note that this has no relation to the birth data of that geographical entity in
   * the real world.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long featureBirthTimestampUs;

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the last modification to the feature.
   * Note this includes attachment modifications. The feature's initial creation is also considered
   * as a modification. This is useful for those that consume features via both listening to
   * notifications and reading from repository snapshots. This timestamp can be used to decide
   * whether a feature in the snapshot was already seen in a more recent state through the
   * notifications.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long lastModificationTimestampUs;

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the deletion time of the feature. If
   * the feature is currently removed, this field gets populated with the timestamp the feature
   * first became removed after being live (or being removed from beginning). This field won't be
   * set if the feature is live.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long removalTimestampUs;

  /**
   * The timestamp (in microseconds since the UNIX epoch) when this feature first went live in the
   * Geo repository. Note that this has no relation to the birth data of that geographical entity in
   * the real world.
   * @return value or {@code null} for none
   */
  public java.lang.Long getFeatureBirthTimestampUs() {
    return featureBirthTimestampUs;
  }

  /**
   * The timestamp (in microseconds since the UNIX epoch) when this feature first went live in the
   * Geo repository. Note that this has no relation to the birth data of that geographical entity in
   * the real world.
   * @param featureBirthTimestampUs featureBirthTimestampUs or {@code null} for none
   */
  public GeostoreFeatureHistoryMetadataProto setFeatureBirthTimestampUs(java.lang.Long featureBirthTimestampUs) {
    this.featureBirthTimestampUs = featureBirthTimestampUs;
    return this;
  }

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the last modification to the feature.
   * Note this includes attachment modifications. The feature's initial creation is also considered
   * as a modification. This is useful for those that consume features via both listening to
   * notifications and reading from repository snapshots. This timestamp can be used to decide
   * whether a feature in the snapshot was already seen in a more recent state through the
   * notifications.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLastModificationTimestampUs() {
    return lastModificationTimestampUs;
  }

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the last modification to the feature.
   * Note this includes attachment modifications. The feature's initial creation is also considered
   * as a modification. This is useful for those that consume features via both listening to
   * notifications and reading from repository snapshots. This timestamp can be used to decide
   * whether a feature in the snapshot was already seen in a more recent state through the
   * notifications.
   * @param lastModificationTimestampUs lastModificationTimestampUs or {@code null} for none
   */
  public GeostoreFeatureHistoryMetadataProto setLastModificationTimestampUs(java.lang.Long lastModificationTimestampUs) {
    this.lastModificationTimestampUs = lastModificationTimestampUs;
    return this;
  }

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the deletion time of the feature. If
   * the feature is currently removed, this field gets populated with the timestamp the feature
   * first became removed after being live (or being removed from beginning). This field won't be
   * set if the feature is live.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRemovalTimestampUs() {
    return removalTimestampUs;
  }

  /**
   * The timestamp (in microseconds since the UNIX epoch) of the deletion time of the feature. If
   * the feature is currently removed, this field gets populated with the timestamp the feature
   * first became removed after being live (or being removed from beginning). This field won't be
   * set if the feature is live.
   * @param removalTimestampUs removalTimestampUs or {@code null} for none
   */
  public GeostoreFeatureHistoryMetadataProto setRemovalTimestampUs(java.lang.Long removalTimestampUs) {
    this.removalTimestampUs = removalTimestampUs;
    return this;
  }

  @Override
  public GeostoreFeatureHistoryMetadataProto set(String fieldName, Object value) {
    return (GeostoreFeatureHistoryMetadataProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreFeatureHistoryMetadataProto clone() {
    return (GeostoreFeatureHistoryMetadataProto) super.clone();
  }

}
