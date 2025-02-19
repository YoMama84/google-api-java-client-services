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
 * A generic type description for an entity.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSaftEntityType extends com.google.api.client.json.GenericJson {

  /**
   * This field can be used to specify if the entity type has been annotated or predicted from a
   * specific mention of the entity. However, the entity type does still apply to the entity as a
   * whole, and not just a specific mention.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer basedOnMention;

  /**
   * A domain name for the set that this particular type belongs to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * Application-specific information about this entity type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Proto2BridgeMessageSet info;

  /**
   * The type name, like "/saft/person". See README.entity-types for the inventory of SAFT type
   * tags.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * A score for this type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float score;

  /**
   * This field can be used to specify if the entity type has been annotated or predicted from a
   * specific mention of the entity. However, the entity type does still apply to the entity as a
   * whole, and not just a specific mention.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getBasedOnMention() {
    return basedOnMention;
  }

  /**
   * This field can be used to specify if the entity type has been annotated or predicted from a
   * specific mention of the entity. However, the entity type does still apply to the entity as a
   * whole, and not just a specific mention.
   * @param basedOnMention basedOnMention or {@code null} for none
   */
  public NlpSaftEntityType setBasedOnMention(java.lang.Integer basedOnMention) {
    this.basedOnMention = basedOnMention;
    return this;
  }

  /**
   * A domain name for the set that this particular type belongs to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * A domain name for the set that this particular type belongs to.
   * @param domain domain or {@code null} for none
   */
  public NlpSaftEntityType setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Application-specific information about this entity type.
   * @return value or {@code null} for none
   */
  public Proto2BridgeMessageSet getInfo() {
    return info;
  }

  /**
   * Application-specific information about this entity type.
   * @param info info or {@code null} for none
   */
  public NlpSaftEntityType setInfo(Proto2BridgeMessageSet info) {
    this.info = info;
    return this;
  }

  /**
   * The type name, like "/saft/person". See README.entity-types for the inventory of SAFT type
   * tags.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The type name, like "/saft/person". See README.entity-types for the inventory of SAFT type
   * tags.
   * @param name name or {@code null} for none
   */
  public NlpSaftEntityType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * A score for this type.
   * @return value or {@code null} for none
   */
  public java.lang.Float getScore() {
    return score;
  }

  /**
   * A score for this type.
   * @param score score or {@code null} for none
   */
  public NlpSaftEntityType setScore(java.lang.Float score) {
    this.score = score;
    return this;
  }

  @Override
  public NlpSaftEntityType set(String fieldName, Object value) {
    return (NlpSaftEntityType) super.set(fieldName, value);
  }

  @Override
  public NlpSaftEntityType clone() {
    return (NlpSaftEntityType) super.clone();
  }

}
