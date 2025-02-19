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
 * A variety of opinions may be published as a single document. We have one OpinionInfo for each
 * opinion About the "CONCURRING" opinion type: It means that a judge "concurs" to the conclusion
 * (judegment) of the majority of the court, however, he may not agree with the argument in the
 * primary opinion. If multiple judges "concur" or "dissent" the primary opinion, then one judge
 * delivers their opinion, and other judges are said to "join" him.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LegalCitationCourtDocumentOpinionInfo extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Bench")
  private java.lang.Integer bench;

  /**
   * if Type == PER_CURIAM, then DeliveredBy is unnecessary since it is delivered by the full court.
   * Who delivered the opinion?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("DeliveredBy")
  private LegalPerson deliveredBy;

  /**
   * Who agrees with the opinion
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("JoinedBy")
  private LegalPerson joinedBy;

  /**
   * OpinionType
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Type")
  private java.lang.Integer type;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBench() {
    return bench;
  }

  /**
   * @param bench bench or {@code null} for none
   */
  public LegalCitationCourtDocumentOpinionInfo setBench(java.lang.Integer bench) {
    this.bench = bench;
    return this;
  }

  /**
   * if Type == PER_CURIAM, then DeliveredBy is unnecessary since it is delivered by the full court.
   * Who delivered the opinion?
   * @return value or {@code null} for none
   */
  public LegalPerson getDeliveredBy() {
    return deliveredBy;
  }

  /**
   * if Type == PER_CURIAM, then DeliveredBy is unnecessary since it is delivered by the full court.
   * Who delivered the opinion?
   * @param deliveredBy deliveredBy or {@code null} for none
   */
  public LegalCitationCourtDocumentOpinionInfo setDeliveredBy(LegalPerson deliveredBy) {
    this.deliveredBy = deliveredBy;
    return this;
  }

  /**
   * Who agrees with the opinion
   * @return value or {@code null} for none
   */
  public LegalPerson getJoinedBy() {
    return joinedBy;
  }

  /**
   * Who agrees with the opinion
   * @param joinedBy joinedBy or {@code null} for none
   */
  public LegalCitationCourtDocumentOpinionInfo setJoinedBy(LegalPerson joinedBy) {
    this.joinedBy = joinedBy;
    return this;
  }

  /**
   * OpinionType
   * @return value or {@code null} for none
   */
  public java.lang.Integer getType() {
    return type;
  }

  /**
   * OpinionType
   * @param type type or {@code null} for none
   */
  public LegalCitationCourtDocumentOpinionInfo setType(java.lang.Integer type) {
    this.type = type;
    return this;
  }

  @Override
  public LegalCitationCourtDocumentOpinionInfo set(String fieldName, Object value) {
    return (LegalCitationCourtDocumentOpinionInfo) super.set(fieldName, value);
  }

  @Override
  public LegalCitationCourtDocumentOpinionInfo clone() {
    return (LegalCitationCourtDocumentOpinionInfo) super.clone();
  }

}
