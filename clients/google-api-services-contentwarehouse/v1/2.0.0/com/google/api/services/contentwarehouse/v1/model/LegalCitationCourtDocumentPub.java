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
 * Model definition for LegalCitationCourtDocumentPub.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LegalCitationCourtDocumentPub extends com.google.api.client.json.GenericJson {

  /**
   * Page number
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Page")
  private java.lang.String page;

  /**
   * Paragraph number
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Paragraph")
  private java.lang.String paragraph;

  /**
   * The publisher of the opinion. For example, 'U.S.' - United States Reports 'S. Ct.' - Supreme
   * Court Reporter 'L. Ed. 2d' - Lawyers Edition Second Series
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Reporter")
  private java.lang.String reporter;

  /**
   * For documents published by a court reporter. Vendor/Media neutral citations will probably not
   * have this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Volume")
  private java.lang.Integer volume;

  /**
   * This is the publication year. In many citations, there is one year listed and it is typically
   * the year the opinion was handed down. For example: Roe v. Wade, 410 U.S. 113 (1973)
   * Occasionally, the publication year of the reporter is included. This happens typically when the
   * law reporter volume numbers are numbered within a calendar year. For example, Swiss Bank Corp.
   * v. Air Canada, [1988] 1 F.C. 71. It some (most?) areas, publication date is denoted by [] while
   * opinion date is denoted by ().
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("Year")
  private java.lang.Integer year;

  /**
   * Page number
   * @return value or {@code null} for none
   */
  public java.lang.String getPage() {
    return page;
  }

  /**
   * Page number
   * @param page page or {@code null} for none
   */
  public LegalCitationCourtDocumentPub setPage(java.lang.String page) {
    this.page = page;
    return this;
  }

  /**
   * Paragraph number
   * @return value or {@code null} for none
   */
  public java.lang.String getParagraph() {
    return paragraph;
  }

  /**
   * Paragraph number
   * @param paragraph paragraph or {@code null} for none
   */
  public LegalCitationCourtDocumentPub setParagraph(java.lang.String paragraph) {
    this.paragraph = paragraph;
    return this;
  }

  /**
   * The publisher of the opinion. For example, 'U.S.' - United States Reports 'S. Ct.' - Supreme
   * Court Reporter 'L. Ed. 2d' - Lawyers Edition Second Series
   * @return value or {@code null} for none
   */
  public java.lang.String getReporter() {
    return reporter;
  }

  /**
   * The publisher of the opinion. For example, 'U.S.' - United States Reports 'S. Ct.' - Supreme
   * Court Reporter 'L. Ed. 2d' - Lawyers Edition Second Series
   * @param reporter reporter or {@code null} for none
   */
  public LegalCitationCourtDocumentPub setReporter(java.lang.String reporter) {
    this.reporter = reporter;
    return this;
  }

  /**
   * For documents published by a court reporter. Vendor/Media neutral citations will probably not
   * have this.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getVolume() {
    return volume;
  }

  /**
   * For documents published by a court reporter. Vendor/Media neutral citations will probably not
   * have this.
   * @param volume volume or {@code null} for none
   */
  public LegalCitationCourtDocumentPub setVolume(java.lang.Integer volume) {
    this.volume = volume;
    return this;
  }

  /**
   * This is the publication year. In many citations, there is one year listed and it is typically
   * the year the opinion was handed down. For example: Roe v. Wade, 410 U.S. 113 (1973)
   * Occasionally, the publication year of the reporter is included. This happens typically when the
   * law reporter volume numbers are numbered within a calendar year. For example, Swiss Bank Corp.
   * v. Air Canada, [1988] 1 F.C. 71. It some (most?) areas, publication date is denoted by [] while
   * opinion date is denoted by ().
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * This is the publication year. In many citations, there is one year listed and it is typically
   * the year the opinion was handed down. For example: Roe v. Wade, 410 U.S. 113 (1973)
   * Occasionally, the publication year of the reporter is included. This happens typically when the
   * law reporter volume numbers are numbered within a calendar year. For example, Swiss Bank Corp.
   * v. Air Canada, [1988] 1 F.C. 71. It some (most?) areas, publication date is denoted by [] while
   * opinion date is denoted by ().
   * @param year year or {@code null} for none
   */
  public LegalCitationCourtDocumentPub setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public LegalCitationCourtDocumentPub set(String fieldName, Object value) {
    return (LegalCitationCourtDocumentPub) super.set(fieldName, value);
  }

  @Override
  public LegalCitationCourtDocumentPub clone() {
    return (LegalCitationCourtDocumentPub) super.clone();
  }

}
