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
 * Note: A merchant may have multiple merchant center ids, and each one can have multiple purposes.
 * The existing fields merchant_id, local_merchant_id fields are not enough to capture this. Instead
 * we will have a repeated field name mcid with this structure.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isGsx;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isLocal;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isPla;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * @param id id or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsGsx() {
    return isGsx;
  }

  /**
   * @param isGsx isGsx or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId setIsGsx(java.lang.Boolean isGsx) {
    this.isGsx = isGsx;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsLocal() {
    return isLocal;
  }

  /**
   * @param isLocal isLocal or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId setIsLocal(java.lang.Boolean isLocal) {
    this.isLocal = isLocal;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsPla() {
    return isPla;
  }

  /**
   * @param isPla isPla or {@code null} for none
   */
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId setIsPla(java.lang.Boolean isPla) {
    this.isPla = isPla;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId clone() {
    return (NlpSemanticParsingModelsShoppingAssistantMerchantMerchantCenterId) super.clone();
  }

}
