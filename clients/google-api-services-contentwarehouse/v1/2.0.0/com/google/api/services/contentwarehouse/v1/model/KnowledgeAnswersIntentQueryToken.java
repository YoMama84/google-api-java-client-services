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
 * A token represents an ngram with relevant information about it. If the token is a context phrase,
 * it will have a prior score associated with it. The prior is computed via
 * knowledge/answers/query_generalization/ word_prior/word_prior_from_examples_lib.cc, and ranges
 * between 0 and 1. Stopwords and intent tokens (primary and component) have a score of 1.0.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class KnowledgeAnswersIntentQueryToken extends com.google.api.client.json.GenericJson {

  /**
   * This field is used inside Aqua and outside Aqua for identifying the token indices and/or byte
   * offsets of this Token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingAnnotationEvalData evalData;

  /**
   * |ngram| should be populated with a string from the raw query, not the normalized tokens. E.g.
   * The ngram in the ignored token for the Height intent on the query [Height of barack obama],
   * will be "Height". The ngram in the ignored token for the Videos intent on the query [vidéos]
   * will be "vidéos".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ngram;

  /**
   * Experiments that caused this Token to parse, without which this would not have parsed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> parsedDueToExperiment;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float prior;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provenance;

  /**
   * Unique identifiers for the provenance of this token, for example, NLP Repository Example IDs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> provenanceId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provenanceLanguage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<KnowledgeAnswersIntentQueryTokenSynonym> synonyms;

  /**
   * This field is used inside Aqua and outside Aqua for identifying the token indices and/or byte
   * offsets of this Token.
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingAnnotationEvalData getEvalData() {
    return evalData;
  }

  /**
   * This field is used inside Aqua and outside Aqua for identifying the token indices and/or byte
   * offsets of this Token.
   * @param evalData evalData or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setEvalData(NlpSemanticParsingAnnotationEvalData evalData) {
    this.evalData = evalData;
    return this;
  }

  /**
   * |ngram| should be populated with a string from the raw query, not the normalized tokens. E.g.
   * The ngram in the ignored token for the Height intent on the query [Height of barack obama],
   * will be "Height". The ngram in the ignored token for the Videos intent on the query [vidéos]
   * will be "vidéos".
   * @return value or {@code null} for none
   */
  public java.lang.String getNgram() {
    return ngram;
  }

  /**
   * |ngram| should be populated with a string from the raw query, not the normalized tokens. E.g.
   * The ngram in the ignored token for the Height intent on the query [Height of barack obama],
   * will be "Height". The ngram in the ignored token for the Videos intent on the query [vidéos]
   * will be "vidéos".
   * @param ngram ngram or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setNgram(java.lang.String ngram) {
    this.ngram = ngram;
    return this;
  }

  /**
   * Experiments that caused this Token to parse, without which this would not have parsed.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getParsedDueToExperiment() {
    return parsedDueToExperiment;
  }

  /**
   * Experiments that caused this Token to parse, without which this would not have parsed.
   * @param parsedDueToExperiment parsedDueToExperiment or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setParsedDueToExperiment(java.util.List<java.lang.String> parsedDueToExperiment) {
    this.parsedDueToExperiment = parsedDueToExperiment;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Float getPrior() {
    return prior;
  }

  /**
   * @param prior prior or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setPrior(java.lang.Float prior) {
    this.prior = prior;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProvenance() {
    return provenance;
  }

  /**
   * @param provenance provenance or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setProvenance(java.lang.String provenance) {
    this.provenance = provenance;
    return this;
  }

  /**
   * Unique identifiers for the provenance of this token, for example, NLP Repository Example IDs.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getProvenanceId() {
    return provenanceId;
  }

  /**
   * Unique identifiers for the provenance of this token, for example, NLP Repository Example IDs.
   * @param provenanceId provenanceId or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setProvenanceId(java.util.List<java.lang.String> provenanceId) {
    this.provenanceId = provenanceId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getProvenanceLanguage() {
    return provenanceLanguage;
  }

  /**
   * @param provenanceLanguage provenanceLanguage or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setProvenanceLanguage(java.lang.String provenanceLanguage) {
    this.provenanceLanguage = provenanceLanguage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<KnowledgeAnswersIntentQueryTokenSynonym> getSynonyms() {
    return synonyms;
  }

  /**
   * @param synonyms synonyms or {@code null} for none
   */
  public KnowledgeAnswersIntentQueryToken setSynonyms(java.util.List<KnowledgeAnswersIntentQueryTokenSynonym> synonyms) {
    this.synonyms = synonyms;
    return this;
  }

  @Override
  public KnowledgeAnswersIntentQueryToken set(String fieldName, Object value) {
    return (KnowledgeAnswersIntentQueryToken) super.set(fieldName, value);
  }

  @Override
  public KnowledgeAnswersIntentQueryToken clone() {
    return (KnowledgeAnswersIntentQueryToken) super.clone();
  }

}
