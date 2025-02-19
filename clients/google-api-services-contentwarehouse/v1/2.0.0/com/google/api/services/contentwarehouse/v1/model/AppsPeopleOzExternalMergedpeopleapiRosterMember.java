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
 * Represents details of a member of a roster. Used in RosterDetails. Corresponds to
 * http://cs/symbol:google.apps.cloudidentity.groups.internal.Membership
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiRosterMember extends com.google.api.client.json.GenericJson {

  /**
   * Type of the member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberType;

  /**
   * Focus-Obfuscated Gaia Id of the member.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String personId;

  /**
   * Type of the member.
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberType() {
    return memberType;
  }

  /**
   * Type of the member.
   * @param memberType memberType or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiRosterMember setMemberType(java.lang.String memberType) {
    this.memberType = memberType;
    return this;
  }

  /**
   * Focus-Obfuscated Gaia Id of the member.
   * @return value or {@code null} for none
   */
  public java.lang.String getPersonId() {
    return personId;
  }

  /**
   * Focus-Obfuscated Gaia Id of the member.
   * @param personId personId or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiRosterMember setPersonId(java.lang.String personId) {
    this.personId = personId;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiRosterMember set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiRosterMember) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiRosterMember clone() {
    return (AppsPeopleOzExternalMergedpeopleapiRosterMember) super.clone();
  }

}
