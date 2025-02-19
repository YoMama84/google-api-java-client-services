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
 * A RawGConceptInstanceProto contains all data required by both internal and external clients. We
 * store the 'public' data in a GConceptInstanceProto and the 'private' data inside of
 * RawGConceptInstanceProto. NOTE: this doesn't really match the design we want anymore. Please talk
 * to the Geo Schema team if you are planning to make use of the "private" fields below.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GeostoreOntologyRawGConceptInstanceProto extends com.google.api.client.json.GenericJson {

  /**
   * This is the 'public' section of the GConceptInstance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GeostoreGConceptInstanceProto instance;

  /**
   * ** DEPRECATED ** Was this GConcept explicitly added by an edit? Examples of gconcepts not added
   * by edits include those inferred through geo ontology and those mapped from legacy category
   * forms by the feature updater. Note that it is possible for both is_added_by_edit and
   * is_inferred to be true - it means this gconcept is added by an edit and there is also another
   * more fine-grained gconcept added by an edit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isAddedByEdit;

  /**
   * RESERVED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean isInferred;

  /**
   * ** DEPRECATED ** These two fields combined describe the source of a GConceptInstance. They are
   * based on geostore/base/proto/datasourceprovider.proto. Their use has been deprecated. Use the
   * FieldMetadataProto inside instance instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provider;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceDataset;

  /**
   * This is the 'public' section of the GConceptInstance.
   * @return value or {@code null} for none
   */
  public GeostoreGConceptInstanceProto getInstance() {
    return instance;
  }

  /**
   * This is the 'public' section of the GConceptInstance.
   * @param instance instance or {@code null} for none
   */
  public GeostoreOntologyRawGConceptInstanceProto setInstance(GeostoreGConceptInstanceProto instance) {
    this.instance = instance;
    return this;
  }

  /**
   * ** DEPRECATED ** Was this GConcept explicitly added by an edit? Examples of gconcepts not added
   * by edits include those inferred through geo ontology and those mapped from legacy category
   * forms by the feature updater. Note that it is possible for both is_added_by_edit and
   * is_inferred to be true - it means this gconcept is added by an edit and there is also another
   * more fine-grained gconcept added by an edit.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsAddedByEdit() {
    return isAddedByEdit;
  }

  /**
   * ** DEPRECATED ** Was this GConcept explicitly added by an edit? Examples of gconcepts not added
   * by edits include those inferred through geo ontology and those mapped from legacy category
   * forms by the feature updater. Note that it is possible for both is_added_by_edit and
   * is_inferred to be true - it means this gconcept is added by an edit and there is also another
   * more fine-grained gconcept added by an edit.
   * @param isAddedByEdit isAddedByEdit or {@code null} for none
   */
  public GeostoreOntologyRawGConceptInstanceProto setIsAddedByEdit(java.lang.Boolean isAddedByEdit) {
    this.isAddedByEdit = isAddedByEdit;
    return this;
  }

  /**
   * RESERVED
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getIsInferred() {
    return isInferred;
  }

  /**
   * RESERVED
   * @param isInferred isInferred or {@code null} for none
   */
  public GeostoreOntologyRawGConceptInstanceProto setIsInferred(java.lang.Boolean isInferred) {
    this.isInferred = isInferred;
    return this;
  }

  /**
   * ** DEPRECATED ** These two fields combined describe the source of a GConceptInstance. They are
   * based on geostore/base/proto/datasourceprovider.proto. Their use has been deprecated. Use the
   * FieldMetadataProto inside instance instead.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvider() {
    return provider;
  }

  /**
   * ** DEPRECATED ** These two fields combined describe the source of a GConceptInstance. They are
   * based on geostore/base/proto/datasourceprovider.proto. Their use has been deprecated. Use the
   * FieldMetadataProto inside instance instead.
   * @param provider provider or {@code null} for none
   */
  public GeostoreOntologyRawGConceptInstanceProto setProvider(java.lang.String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceDataset() {
    return sourceDataset;
  }

  /**
   * @param sourceDataset sourceDataset or {@code null} for none
   */
  public GeostoreOntologyRawGConceptInstanceProto setSourceDataset(java.lang.String sourceDataset) {
    this.sourceDataset = sourceDataset;
    return this;
  }

  @Override
  public GeostoreOntologyRawGConceptInstanceProto set(String fieldName, Object value) {
    return (GeostoreOntologyRawGConceptInstanceProto) super.set(fieldName, value);
  }

  @Override
  public GeostoreOntologyRawGConceptInstanceProto clone() {
    return (GeostoreOntologyRawGConceptInstanceProto) super.clone();
  }

}
