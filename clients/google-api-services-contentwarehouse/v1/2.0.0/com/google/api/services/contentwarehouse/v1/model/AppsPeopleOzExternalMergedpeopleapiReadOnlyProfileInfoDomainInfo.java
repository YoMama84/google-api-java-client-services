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
 * DEPRECATED.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo extends com.google.api.client.json.GenericJson {

  /**
   * DEPRECATED. Organization badge for the domain this person is a member of. The badge is the
   * primary hosted domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domainBadge;

  /**
   * DEPRECATED. Hosted domain this person is a member of. Formerly only available via
   * PersonExtendedData.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> domainName;

  /**
   * DEPRECATED. Organization badge for the domain this person is a member of. The badge is the
   * primary hosted domain.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomainBadge() {
    return domainBadge;
  }

  /**
   * DEPRECATED. Organization badge for the domain this person is a member of. The badge is the
   * primary hosted domain.
   * @param domainBadge domainBadge or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo setDomainBadge(java.util.List<java.lang.String> domainBadge) {
    this.domainBadge = domainBadge;
    return this;
  }

  /**
   * DEPRECATED. Hosted domain this person is a member of. Formerly only available via
   * PersonExtendedData.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDomainName() {
    return domainName;
  }

  /**
   * DEPRECATED. Hosted domain this person is a member of. Formerly only available via
   * PersonExtendedData.
   * @param domainName domainName or {@code null} for none
   */
  public AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo setDomainName(java.util.List<java.lang.String> domainName) {
    this.domainName = domainName;
    return this;
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo set(String fieldName, Object value) {
    return (AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo) super.set(fieldName, value);
  }

  @Override
  public AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo clone() {
    return (AppsPeopleOzExternalMergedpeopleapiReadOnlyProfileInfoDomainInfo) super.clone();
  }

}
