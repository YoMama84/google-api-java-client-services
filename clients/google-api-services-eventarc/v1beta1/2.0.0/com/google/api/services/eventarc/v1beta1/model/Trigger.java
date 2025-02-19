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

package com.google.api.services.eventarc.v1beta1.model;

/**
 * A representation of the trigger resource.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Eventarc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Trigger extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Required. Destination specifies where the events should be sent to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Destination destination;

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * may be sent only on create requests to ensure the client has an up-to-date value before
   * proceeding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Optional. User labels attached to the triggers that can be used to group resources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. Unordered list. The criteria by which events are filtered. Only events that match
   * with this criteria will be sent to the destination.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MatchingCriteria> matchingCriteria;

  static {
    // hack to force ProGuard to consider MatchingCriteria used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(MatchingCriteria.class);
  }

  /**
   * Required. The resource name of the trigger. Must be unique within the location on the project
   * and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The IAM service account email associated with the trigger. The service account
   * represents the identity of the trigger. The principal who calls this API must have
   * `iam.serviceAccounts.actAs` permission in the service account. See
   * https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more
   * information. For Cloud Run destinations, this service account is used to generate identity
   * tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push
   * #create-service-account for information on how to invoke authenticated Cloud Run services. In
   * order to create Audit Log triggers, the service account should also have
   * 'eventarc.events.receiveAuditLogV1Written' permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Output only. In order to deliver messages, Eventarc may use other GCP products as transport
   * intermediary. This field contains a reference to that transport intermediary. This information
   * can be used for debugging purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Transport transport;

  /**
   * Output only. The last-modified time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Output only. The creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Trigger setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Required. Destination specifies where the events should be sent to.
   * @return value or {@code null} for none
   */
  public Destination getDestination() {
    return destination;
  }

  /**
   * Required. Destination specifies where the events should be sent to.
   * @param destination destination or {@code null} for none
   */
  public Trigger setDestination(Destination destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * may be sent only on create requests to ensure the client has an up-to-date value before
   * proceeding.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Output only. This checksum is computed by the server based on the value of other fields, and
   * may be sent only on create requests to ensure the client has an up-to-date value before
   * proceeding.
   * @param etag etag or {@code null} for none
   */
  public Trigger setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Optional. User labels attached to the triggers that can be used to group resources.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Optional. User labels attached to the triggers that can be used to group resources.
   * @param labels labels or {@code null} for none
   */
  public Trigger setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. Unordered list. The criteria by which events are filtered. Only events that match
   * with this criteria will be sent to the destination.
   * @return value or {@code null} for none
   */
  public java.util.List<MatchingCriteria> getMatchingCriteria() {
    return matchingCriteria;
  }

  /**
   * Required. Unordered list. The criteria by which events are filtered. Only events that match
   * with this criteria will be sent to the destination.
   * @param matchingCriteria matchingCriteria or {@code null} for none
   */
  public Trigger setMatchingCriteria(java.util.List<MatchingCriteria> matchingCriteria) {
    this.matchingCriteria = matchingCriteria;
    return this;
  }

  /**
   * Required. The resource name of the trigger. Must be unique within the location on the project
   * and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The resource name of the trigger. Must be unique within the location on the project
   * and must in `projects/{project}/locations/{location}/triggers/{trigger}` format.
   * @param name name or {@code null} for none
   */
  public Trigger setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The IAM service account email associated with the trigger. The service account
   * represents the identity of the trigger. The principal who calls this API must have
   * `iam.serviceAccounts.actAs` permission in the service account. See
   * https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more
   * information. For Cloud Run destinations, this service account is used to generate identity
   * tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push
   * #create-service-account for information on how to invoke authenticated Cloud Run services. In
   * order to create Audit Log triggers, the service account should also have
   * 'eventarc.events.receiveAuditLogV1Written' permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * Optional. The IAM service account email associated with the trigger. The service account
   * represents the identity of the trigger. The principal who calls this API must have
   * `iam.serviceAccounts.actAs` permission in the service account. See
   * https://cloud.google.com/iam/docs/understanding-service-accounts?hl=en#sa_common for more
   * information. For Cloud Run destinations, this service account is used to generate identity
   * tokens when invoking the service. See https://cloud.google.com/run/docs/triggering/pubsub-push
   * #create-service-account for information on how to invoke authenticated Cloud Run services. In
   * order to create Audit Log triggers, the service account should also have
   * 'eventarc.events.receiveAuditLogV1Written' permission.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Trigger setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Output only. In order to deliver messages, Eventarc may use other GCP products as transport
   * intermediary. This field contains a reference to that transport intermediary. This information
   * can be used for debugging purposes.
   * @return value or {@code null} for none
   */
  public Transport getTransport() {
    return transport;
  }

  /**
   * Output only. In order to deliver messages, Eventarc may use other GCP products as transport
   * intermediary. This field contains a reference to that transport intermediary. This information
   * can be used for debugging purposes.
   * @param transport transport or {@code null} for none
   */
  public Trigger setTransport(Transport transport) {
    this.transport = transport;
    return this;
  }

  /**
   * Output only. The last-modified time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The last-modified time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Trigger setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public Trigger set(String fieldName, Object value) {
    return (Trigger) super.set(fieldName, value);
  }

  @Override
  public Trigger clone() {
    return (Trigger) super.clone();
  }

}
