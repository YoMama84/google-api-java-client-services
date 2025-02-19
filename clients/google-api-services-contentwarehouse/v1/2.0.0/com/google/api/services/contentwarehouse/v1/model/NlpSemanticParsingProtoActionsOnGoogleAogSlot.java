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
 * In simple cases, each NLU slot will contain one or multiple possible values. But in the case of a
 * composite entity - slots can have a complex tree structure. Each slot can represent a List
 * parameter. List parameters are only allowed at the top level, i.e. lists can't ne nested in maps.
 * Next Id: 9 LINT.IfChange
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingProtoActionsOnGoogleAogSlot extends com.google.api.client.json.GenericJson {

  /**
   * ID of the entity of this slot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String entityId;

  /**
   * Number of bytes of this slot in resolved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numBytes;

  /**
   * Part of input text, matched by that slot. In the case of composite slots, each slot should have
   * its own original.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String original;

  /**
   * Name of parameter of this slot.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parameterName;

  /**
   * Represents a "list parameter". Each parameter may be declared as a list and have multiple slot
   * values, referenced by a single alias. Each slot value in a list may contain multiple possible
   * values. For example: aqua return 3 dates if the year is not specified in a query - one for the
   * current year, one for the past year, and one for the following year. If user defines a list
   * parameter with type @sys.date, and the query contains multiple dates - we should return a list
   * of possible values for each date from the query, i.e. it will be a list of list of dates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingProtoActionsOnGoogleSlotList slotList;

  /**
   * Represents a structured value. Used in composite entities. Composite entities can have
   * arbitrary structure.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingProtoActionsOnGoogleSlotMap slotMap;

  /**
   * Start byte position of this slot in resolved query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer startByte;

  /**
   * One or more possible values. This field does not represent a list parameter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingProtoActionsOnGoogleSlotValue value;

  /**
   * ID of the entity of this slot.
   * @return value or {@code null} for none
   */
  public java.lang.String getEntityId() {
    return entityId;
  }

  /**
   * ID of the entity of this slot.
   * @param entityId entityId or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setEntityId(java.lang.String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Number of bytes of this slot in resolved query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumBytes() {
    return numBytes;
  }

  /**
   * Number of bytes of this slot in resolved query.
   * @param numBytes numBytes or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setNumBytes(java.lang.Integer numBytes) {
    this.numBytes = numBytes;
    return this;
  }

  /**
   * Part of input text, matched by that slot. In the case of composite slots, each slot should have
   * its own original.
   * @return value or {@code null} for none
   */
  public java.lang.String getOriginal() {
    return original;
  }

  /**
   * Part of input text, matched by that slot. In the case of composite slots, each slot should have
   * its own original.
   * @param original original or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setOriginal(java.lang.String original) {
    this.original = original;
    return this;
  }

  /**
   * Name of parameter of this slot.
   * @return value or {@code null} for none
   */
  public java.lang.String getParameterName() {
    return parameterName;
  }

  /**
   * Name of parameter of this slot.
   * @param parameterName parameterName or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setParameterName(java.lang.String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  /**
   * Represents a "list parameter". Each parameter may be declared as a list and have multiple slot
   * values, referenced by a single alias. Each slot value in a list may contain multiple possible
   * values. For example: aqua return 3 dates if the year is not specified in a query - one for the
   * current year, one for the past year, and one for the following year. If user defines a list
   * parameter with type @sys.date, and the query contains multiple dates - we should return a list
   * of possible values for each date from the query, i.e. it will be a list of list of dates.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleSlotList getSlotList() {
    return slotList;
  }

  /**
   * Represents a "list parameter". Each parameter may be declared as a list and have multiple slot
   * values, referenced by a single alias. Each slot value in a list may contain multiple possible
   * values. For example: aqua return 3 dates if the year is not specified in a query - one for the
   * current year, one for the past year, and one for the following year. If user defines a list
   * parameter with type @sys.date, and the query contains multiple dates - we should return a list
   * of possible values for each date from the query, i.e. it will be a list of list of dates.
   * @param slotList slotList or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setSlotList(NlpSemanticParsingProtoActionsOnGoogleSlotList slotList) {
    this.slotList = slotList;
    return this;
  }

  /**
   * Represents a structured value. Used in composite entities. Composite entities can have
   * arbitrary structure.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleSlotMap getSlotMap() {
    return slotMap;
  }

  /**
   * Represents a structured value. Used in composite entities. Composite entities can have
   * arbitrary structure.
   * @param slotMap slotMap or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setSlotMap(NlpSemanticParsingProtoActionsOnGoogleSlotMap slotMap) {
    this.slotMap = slotMap;
    return this;
  }

  /**
   * Start byte position of this slot in resolved query.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getStartByte() {
    return startByte;
  }

  /**
   * Start byte position of this slot in resolved query.
   * @param startByte startByte or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setStartByte(java.lang.Integer startByte) {
    this.startByte = startByte;
    return this;
  }

  /**
   * One or more possible values. This field does not represent a list parameter.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleSlotValue getValue() {
    return value;
  }

  /**
   * One or more possible values. This field does not represent a list parameter.
   * @param value value or {@code null} for none
   */
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot setValue(NlpSemanticParsingProtoActionsOnGoogleSlotValue value) {
    this.value = value;
    return this;
  }

  @Override
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot set(String fieldName, Object value) {
    return (NlpSemanticParsingProtoActionsOnGoogleAogSlot) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingProtoActionsOnGoogleAogSlot clone() {
    return (NlpSemanticParsingProtoActionsOnGoogleAogSlot) super.clone();
  }

}
