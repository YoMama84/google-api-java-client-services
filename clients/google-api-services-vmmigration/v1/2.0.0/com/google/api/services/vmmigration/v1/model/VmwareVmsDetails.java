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
 * VmwareVmsDetails describes VMs in vCenter.
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
public final class VmwareVmsDetails extends com.google.api.client.json.GenericJson {

  /**
   * The details of the vmware VMs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<VmwareVmDetails> details;

  static {
    // hack to force ProGuard to consider VmwareVmDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(VmwareVmDetails.class);
  }

  /**
   * The details of the vmware VMs.
   * @return value or {@code null} for none
   */
  public java.util.List<VmwareVmDetails> getDetails() {
    return details;
  }

  /**
   * The details of the vmware VMs.
   * @param details details or {@code null} for none
   */
  public VmwareVmsDetails setDetails(java.util.List<VmwareVmDetails> details) {
    this.details = details;
    return this;
  }

  @Override
  public VmwareVmsDetails set(String fieldName, Object value) {
    return (VmwareVmsDetails) super.set(fieldName, value);
  }

  @Override
  public VmwareVmsDetails clone() {
    return (VmwareVmsDetails) super.clone();
  }

}
