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

package com.google.api.services.vmmigration.v1.model;

/**
 * Source message describes a specific vm migration Source resource. It contains the source
 * environment information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Migrate to Virtual Machines API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Source extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The create time timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * User-provided description of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The labels of the source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Output only. The Source name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The update time timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Vmware type source details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmwareSourceDetails vmware;

  /**
   * Output only. The create time timestamp.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The create time timestamp.
   * @param createTime createTime or {@code null} for none
   */
  public Source setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * User-provided description of the source.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * User-provided description of the source.
   * @param description description or {@code null} for none
   */
  public Source setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The labels of the source.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * The labels of the source.
   * @param labels labels or {@code null} for none
   */
  public Source setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. The Source name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The Source name.
   * @param name name or {@code null} for none
   */
  public Source setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The update time timestamp.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The update time timestamp.
   * @param updateTime updateTime or {@code null} for none
   */
  public Source setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Vmware type source details.
   * @return value or {@code null} for none
   */
  public VmwareSourceDetails getVmware() {
    return vmware;
  }

  /**
   * Vmware type source details.
   * @param vmware vmware or {@code null} for none
   */
  public Source setVmware(VmwareSourceDetails vmware) {
    this.vmware = vmware;
    return this;
  }

  @Override
  public Source set(String fieldName, Object value) {
    return (Source) super.set(fieldName, value);
  }

  @Override
  public Source clone() {
    return (Source) super.clone();
  }

}
