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
 * Following structure summarizes output of AnchorSpamPenalizer. Spammy anchors are tagged with
 * LINK_SPAM_PHRASE_PENALIZER and demoted to SPAM locality in anchor-localizer.cc
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class IndexingDocjoinerAnchorSpamInfo extends com.google.api.client.json.GenericJson {

  /**
   * End date of the last anchor of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long anchorEnd;

  /**
   * Ratio of spam demoted period to all anchor period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float anchorFraq;

  /**
   * Start date of the first anchor of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long anchorStart;

  /**
   * Following field record details of anchor demotion in action. How many anchors were demoted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long demoted;

  /**
   * Demoted all anchors in the period or only anchors classified as spam.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean demotedAll;

  /**
   * End date of the demotion period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long demotedEnd;

  /**
   * Start date of the demotion period.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long demotedStart;

  /**
   * Following fields record signals used in anchor spam classification. How many spam phrases found
   * in the anchors among unique domains.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float phraseCount;

  /**
   * Over how many days 80% of these phrases were discovered.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float phraseDays;

  /**
   * Spam phrases fraction of all anchors of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float phraseFraq;

  /**
   * Average daily rate of spam anchor discovery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float phraseRate;

  /**
   * Total number of processed anchors.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long processed;

  /**
   * True if anchors were sampled during observation phrase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean sampled;

  /**
   * Detailed information about trusted sources and match computation. Populated only when
   * --anchorspam_penalizer_debug=true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<IndexingDocjoinerAnchorTrustedInfo> sources;

  /**
   * Additional debug information about computation of spam probability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spamDebugInfo;

  /**
   * Combined penalty for anchor demotion.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float spamPenalty;

  /**
   * Predicted probability of spam.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float spamProbability;

  /**
   * Number of trusted anchors used in computation of spam probability.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long trustedDemoted;

  /**
   * Examples of trusted sources.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String trustedExamples;

  /**
   * Number of trusted anchors with anchor text matching spam terms.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long trustedMatching;

  /**
   * Following fields record details about trusted anchors True if is this URL is on trusted source.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean trustedTarget;

  /**
   * Total number of trusted sources for this URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Long trustedTotal;

  /**
   * End date of the last anchor of the document.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnchorEnd() {
    return anchorEnd;
  }

  /**
   * End date of the last anchor of the document.
   * @param anchorEnd anchorEnd or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setAnchorEnd(java.lang.Long anchorEnd) {
    this.anchorEnd = anchorEnd;
    return this;
  }

  /**
   * Ratio of spam demoted period to all anchor period.
   * @return value or {@code null} for none
   */
  public java.lang.Float getAnchorFraq() {
    return anchorFraq;
  }

  /**
   * Ratio of spam demoted period to all anchor period.
   * @param anchorFraq anchorFraq or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setAnchorFraq(java.lang.Float anchorFraq) {
    this.anchorFraq = anchorFraq;
    return this;
  }

  /**
   * Start date of the first anchor of the document.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAnchorStart() {
    return anchorStart;
  }

  /**
   * Start date of the first anchor of the document.
   * @param anchorStart anchorStart or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setAnchorStart(java.lang.Long anchorStart) {
    this.anchorStart = anchorStart;
    return this;
  }

  /**
   * Following field record details of anchor demotion in action. How many anchors were demoted.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDemoted() {
    return demoted;
  }

  /**
   * Following field record details of anchor demotion in action. How many anchors were demoted.
   * @param demoted demoted or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setDemoted(java.lang.Long demoted) {
    this.demoted = demoted;
    return this;
  }

  /**
   * Demoted all anchors in the period or only anchors classified as spam.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDemotedAll() {
    return demotedAll;
  }

  /**
   * Demoted all anchors in the period or only anchors classified as spam.
   * @param demotedAll demotedAll or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setDemotedAll(java.lang.Boolean demotedAll) {
    this.demotedAll = demotedAll;
    return this;
  }

  /**
   * End date of the demotion period.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDemotedEnd() {
    return demotedEnd;
  }

  /**
   * End date of the demotion period.
   * @param demotedEnd demotedEnd or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setDemotedEnd(java.lang.Long demotedEnd) {
    this.demotedEnd = demotedEnd;
    return this;
  }

  /**
   * Start date of the demotion period.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDemotedStart() {
    return demotedStart;
  }

  /**
   * Start date of the demotion period.
   * @param demotedStart demotedStart or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setDemotedStart(java.lang.Long demotedStart) {
    this.demotedStart = demotedStart;
    return this;
  }

  /**
   * Following fields record signals used in anchor spam classification. How many spam phrases found
   * in the anchors among unique domains.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPhraseCount() {
    return phraseCount;
  }

  /**
   * Following fields record signals used in anchor spam classification. How many spam phrases found
   * in the anchors among unique domains.
   * @param phraseCount phraseCount or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setPhraseCount(java.lang.Float phraseCount) {
    this.phraseCount = phraseCount;
    return this;
  }

  /**
   * Over how many days 80% of these phrases were discovered.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPhraseDays() {
    return phraseDays;
  }

  /**
   * Over how many days 80% of these phrases were discovered.
   * @param phraseDays phraseDays or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setPhraseDays(java.lang.Float phraseDays) {
    this.phraseDays = phraseDays;
    return this;
  }

  /**
   * Spam phrases fraction of all anchors of the document.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPhraseFraq() {
    return phraseFraq;
  }

  /**
   * Spam phrases fraction of all anchors of the document.
   * @param phraseFraq phraseFraq or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setPhraseFraq(java.lang.Float phraseFraq) {
    this.phraseFraq = phraseFraq;
    return this;
  }

  /**
   * Average daily rate of spam anchor discovery.
   * @return value or {@code null} for none
   */
  public java.lang.Float getPhraseRate() {
    return phraseRate;
  }

  /**
   * Average daily rate of spam anchor discovery.
   * @param phraseRate phraseRate or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setPhraseRate(java.lang.Float phraseRate) {
    this.phraseRate = phraseRate;
    return this;
  }

  /**
   * Total number of processed anchors.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProcessed() {
    return processed;
  }

  /**
   * Total number of processed anchors.
   * @param processed processed or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setProcessed(java.lang.Long processed) {
    this.processed = processed;
    return this;
  }

  /**
   * True if anchors were sampled during observation phrase.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSampled() {
    return sampled;
  }

  /**
   * True if anchors were sampled during observation phrase.
   * @param sampled sampled or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setSampled(java.lang.Boolean sampled) {
    this.sampled = sampled;
    return this;
  }

  /**
   * Detailed information about trusted sources and match computation. Populated only when
   * --anchorspam_penalizer_debug=true.
   * @return value or {@code null} for none
   */
  public java.util.List<IndexingDocjoinerAnchorTrustedInfo> getSources() {
    return sources;
  }

  /**
   * Detailed information about trusted sources and match computation. Populated only when
   * --anchorspam_penalizer_debug=true.
   * @param sources sources or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setSources(java.util.List<IndexingDocjoinerAnchorTrustedInfo> sources) {
    this.sources = sources;
    return this;
  }

  /**
   * Additional debug information about computation of spam probability.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpamDebugInfo() {
    return spamDebugInfo;
  }

  /**
   * Additional debug information about computation of spam probability.
   * @param spamDebugInfo spamDebugInfo or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setSpamDebugInfo(java.lang.String spamDebugInfo) {
    this.spamDebugInfo = spamDebugInfo;
    return this;
  }

  /**
   * Combined penalty for anchor demotion.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSpamPenalty() {
    return spamPenalty;
  }

  /**
   * Combined penalty for anchor demotion.
   * @param spamPenalty spamPenalty or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setSpamPenalty(java.lang.Float spamPenalty) {
    this.spamPenalty = spamPenalty;
    return this;
  }

  /**
   * Predicted probability of spam.
   * @return value or {@code null} for none
   */
  public java.lang.Float getSpamProbability() {
    return spamProbability;
  }

  /**
   * Predicted probability of spam.
   * @param spamProbability spamProbability or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setSpamProbability(java.lang.Float spamProbability) {
    this.spamProbability = spamProbability;
    return this;
  }

  /**
   * Number of trusted anchors used in computation of spam probability.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrustedDemoted() {
    return trustedDemoted;
  }

  /**
   * Number of trusted anchors used in computation of spam probability.
   * @param trustedDemoted trustedDemoted or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setTrustedDemoted(java.lang.Long trustedDemoted) {
    this.trustedDemoted = trustedDemoted;
    return this;
  }

  /**
   * Examples of trusted sources.
   * @return value or {@code null} for none
   */
  public java.lang.String getTrustedExamples() {
    return trustedExamples;
  }

  /**
   * Examples of trusted sources.
   * @param trustedExamples trustedExamples or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setTrustedExamples(java.lang.String trustedExamples) {
    this.trustedExamples = trustedExamples;
    return this;
  }

  /**
   * Number of trusted anchors with anchor text matching spam terms.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrustedMatching() {
    return trustedMatching;
  }

  /**
   * Number of trusted anchors with anchor text matching spam terms.
   * @param trustedMatching trustedMatching or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setTrustedMatching(java.lang.Long trustedMatching) {
    this.trustedMatching = trustedMatching;
    return this;
  }

  /**
   * Following fields record details about trusted anchors True if is this URL is on trusted source.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getTrustedTarget() {
    return trustedTarget;
  }

  /**
   * Following fields record details about trusted anchors True if is this URL is on trusted source.
   * @param trustedTarget trustedTarget or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setTrustedTarget(java.lang.Boolean trustedTarget) {
    this.trustedTarget = trustedTarget;
    return this;
  }

  /**
   * Total number of trusted sources for this URL.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTrustedTotal() {
    return trustedTotal;
  }

  /**
   * Total number of trusted sources for this URL.
   * @param trustedTotal trustedTotal or {@code null} for none
   */
  public IndexingDocjoinerAnchorSpamInfo setTrustedTotal(java.lang.Long trustedTotal) {
    this.trustedTotal = trustedTotal;
    return this;
  }

  @Override
  public IndexingDocjoinerAnchorSpamInfo set(String fieldName, Object value) {
    return (IndexingDocjoinerAnchorSpamInfo) super.set(fieldName, value);
  }

  @Override
  public IndexingDocjoinerAnchorSpamInfo clone() {
    return (IndexingDocjoinerAnchorSpamInfo) super.clone();
  }

}
