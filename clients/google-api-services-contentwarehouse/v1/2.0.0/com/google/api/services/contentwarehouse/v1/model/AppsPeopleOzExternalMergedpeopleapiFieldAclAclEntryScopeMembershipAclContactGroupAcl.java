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
 * Used when a field is accessible to a legacy contact group. Contact groups are discouraged and may
 * be deprecated soon. ContactGroupAcls are read-only. If they are included as part of an ACL on an
 * Update, an exception is thrown.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl extends com.google.api.client.json.GenericJson {

  /**
   * A contact group ID. This is either a user-defined contact group hex ID, or it is the string
   * name of the enum constant in Group.PredefinedId in FBS backend.proto for predefined groups.
   * Common values for the predefined name include, but are not limited to: all, myContacts,
   * starred, chatBuddies, friends, family, coworkers, and blocked.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String contactGroupId;

  /**
   * The localized display name for the predefined group, if known; or, the display name for the
   * user-defined contact group. Included when FieldAclOption.FULL_ACL_WITH_DETAILS is requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * A contact group ID. This is either a user-defined contact group hex ID, or it is the string
   * name of the enum constant in Group.PredefinedId in FBS backend.proto for predefined groups.
   * Common values for the predefined name include, but are not limited to: all, myContacts,
   * starred, chatBuddies, friends, family, coworkers, and blocked.
   * @return value or {@code null} for none
   */
  public java.lang.String getContactGroupId() {
    return contactGroupId;
  }

  /**
   * A contact group ID. This is either a user-defined contact group hex ID, or it is the string
   * name of the enum constant in Group.PredefinedId in FBS backend.proto for predefined groups.
   * Common values for the predefined name include, but are not limited to: all, myContacts,
   * starred, chatBuddies, friends, family, coworkers, and blocked.
   * @param contactGroupId contactGroupId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl setContactGroupId(java.lang.String contactGroupId) {
    this.contactGroupId = contactGroupId;
    return this;
  }

  /**
   * The localized display name for the predefined group, if known; or, the display name for the
   * user-defined contact group. Included when FieldAclOption.FULL_ACL_WITH_DETAILS is requested.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The localized display name for the predefined group, if known; or, the display name for the
   * user-defined contact group. Included when FieldAclOption.FULL_ACL_WITH_DETAILS is requested.
   * @param displayName displayName or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl clone() {
    return (AppsPeopleOzExternalMergedpeopleapiFieldAclAclEntryScopeMembershipAclContactGroupAcl) super.clone();
  }

}
