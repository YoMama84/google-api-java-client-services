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
 * Model definition for ResearchScamTokenNamespace.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ResearchScamTokenNamespace extends com.google.api.client.json.GenericJson {

  /**
   * / NAMESPACE - the string name of the namespace that this proto is specifying, such as "color",
   * "shape", "geo", or "tags". Recall that your overall query is an AND across namespaces.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String namespace;

  /**
   * / BLACKLIST - Blacklisting can be used to implement more complex scenarios. The blacklist
   * fields have exactly the same format as the token fields, but represents a negation. When a
   * token is blacklisted, then matches will be excluded whenever the other datapoint has that
   * token. For example, if a query specifies {color: red, blue, !purple}, then that query will
   * match datapoints that are red or blue, but if those points are also purple, then they will be
   * excluded even if they are red/blue. Note that, due to symmetry, if one of the database points
   * is {red, !blue}, that point will be excluded from queries that specify blue. Lastly, note that
   * namespaces with *only* blacklist tokens behave similar to empty namespaces, in that {color:
   * !purple} would match blue or red datapoints, as long as those datapoints don't also have the
   * purple token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> stringBlacklistTokens;

  /**
   * / TOKENS - Conceptually, each token names a set datapoints. The field(s) below are for
   * declaring the tokens that name the datapoint that this TokenNamespace proto is attached to. For
   * convenience, we support either string or uint64 tokens. Internally, the restricts system is
   * based on uint64s, but for many applications, strings are the more natural format, and they
   * should be preferred whenever this is the case. * When only uint64s are specified, they will be
   * used as-is. * When only strings are specified, they will be converted to uint64s via
   * Fingerprint2011. (See "Note on the safety of Fingerprint2011"). * ADVANCED: When both fields
   * are specified, the uint64s are used as-is. Note that, when both fields are used, they *must*
   * have the same number of entries, and the system will assume that your strings correspond 1:1
   * with the list of uint64 tokens. * EDGE CASE: All matching is done in the uint64 space, so, I'm
   * not sure why you'd do this, but if, eg, your database uses strings, and your queries specify
   * the Fingerprint2011 hashes of those strings, matching will work, and this is a specified
   * behavior. Note on the safety of Fingerprint2011: Unless you have well over 1M+ unique string
   * tokens, you can safely assume that every string will map to a unique 64-bit token. Internally,
   * both Mustang and PSI use Fingerprint2011 to hash arbitrary strings into uint64 tokens, and
   * assume, without validation, that each 64-bit token is unique. And the math backs up this
   * assumption: If we are using a "perfect" hashing function (and Fingerprint2011 is close-enough
   * for our purposes), and we then hash 1M unique tokens into a 64-bit space, there's still better
   * than 99.9999% odds that all tokens are collision-free, nearly as good as the odds for the
   * datacenter's continued existence. Scenarios for having both the string and uint64 token forms:
   * * Probably none that matter to you. Just use the strings directly. * You could have uint64 enum
   * values, yet want to include the string values for debugging purposes. Note that it *is*
   * supported to use a proprietary string => uint64 mapping, assuming that it is consistent, and
   * that you always specify the uint64 values. * The mixer-tier in a multi-shard deployment might
   * convert the strings into uint64s to avoid redundant hashing overhead on the leaves, yet keep
   * the string tokens to preserve proto-level debugging. * When strings are present, I reserve the
   * right to use them for making logging "better", but, thusfar, there are 0 examples of this.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> stringTokens;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> uint64BlacklistTokens;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.math.BigInteger> uint64Tokens;

  /**
   * / NAMESPACE - the string name of the namespace that this proto is specifying, such as "color",
   * "shape", "geo", or "tags". Recall that your overall query is an AND across namespaces.
   * @return value or {@code null} for none
   */
  public java.lang.String getNamespace() {
    return namespace;
  }

  /**
   * / NAMESPACE - the string name of the namespace that this proto is specifying, such as "color",
   * "shape", "geo", or "tags". Recall that your overall query is an AND across namespaces.
   * @param namespace namespace or {@code null} for none
   */
  public ResearchScamTokenNamespace setNamespace(java.lang.String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * / BLACKLIST - Blacklisting can be used to implement more complex scenarios. The blacklist
   * fields have exactly the same format as the token fields, but represents a negation. When a
   * token is blacklisted, then matches will be excluded whenever the other datapoint has that
   * token. For example, if a query specifies {color: red, blue, !purple}, then that query will
   * match datapoints that are red or blue, but if those points are also purple, then they will be
   * excluded even if they are red/blue. Note that, due to symmetry, if one of the database points
   * is {red, !blue}, that point will be excluded from queries that specify blue. Lastly, note that
   * namespaces with *only* blacklist tokens behave similar to empty namespaces, in that {color:
   * !purple} would match blue or red datapoints, as long as those datapoints don't also have the
   * purple token.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStringBlacklistTokens() {
    return stringBlacklistTokens;
  }

  /**
   * / BLACKLIST - Blacklisting can be used to implement more complex scenarios. The blacklist
   * fields have exactly the same format as the token fields, but represents a negation. When a
   * token is blacklisted, then matches will be excluded whenever the other datapoint has that
   * token. For example, if a query specifies {color: red, blue, !purple}, then that query will
   * match datapoints that are red or blue, but if those points are also purple, then they will be
   * excluded even if they are red/blue. Note that, due to symmetry, if one of the database points
   * is {red, !blue}, that point will be excluded from queries that specify blue. Lastly, note that
   * namespaces with *only* blacklist tokens behave similar to empty namespaces, in that {color:
   * !purple} would match blue or red datapoints, as long as those datapoints don't also have the
   * purple token.
   * @param stringBlacklistTokens stringBlacklistTokens or {@code null} for none
   */
  public ResearchScamTokenNamespace setStringBlacklistTokens(java.util.List<java.lang.String> stringBlacklistTokens) {
    this.stringBlacklistTokens = stringBlacklistTokens;
    return this;
  }

  /**
   * / TOKENS - Conceptually, each token names a set datapoints. The field(s) below are for
   * declaring the tokens that name the datapoint that this TokenNamespace proto is attached to. For
   * convenience, we support either string or uint64 tokens. Internally, the restricts system is
   * based on uint64s, but for many applications, strings are the more natural format, and they
   * should be preferred whenever this is the case. * When only uint64s are specified, they will be
   * used as-is. * When only strings are specified, they will be converted to uint64s via
   * Fingerprint2011. (See "Note on the safety of Fingerprint2011"). * ADVANCED: When both fields
   * are specified, the uint64s are used as-is. Note that, when both fields are used, they *must*
   * have the same number of entries, and the system will assume that your strings correspond 1:1
   * with the list of uint64 tokens. * EDGE CASE: All matching is done in the uint64 space, so, I'm
   * not sure why you'd do this, but if, eg, your database uses strings, and your queries specify
   * the Fingerprint2011 hashes of those strings, matching will work, and this is a specified
   * behavior. Note on the safety of Fingerprint2011: Unless you have well over 1M+ unique string
   * tokens, you can safely assume that every string will map to a unique 64-bit token. Internally,
   * both Mustang and PSI use Fingerprint2011 to hash arbitrary strings into uint64 tokens, and
   * assume, without validation, that each 64-bit token is unique. And the math backs up this
   * assumption: If we are using a "perfect" hashing function (and Fingerprint2011 is close-enough
   * for our purposes), and we then hash 1M unique tokens into a 64-bit space, there's still better
   * than 99.9999% odds that all tokens are collision-free, nearly as good as the odds for the
   * datacenter's continued existence. Scenarios for having both the string and uint64 token forms:
   * * Probably none that matter to you. Just use the strings directly. * You could have uint64 enum
   * values, yet want to include the string values for debugging purposes. Note that it *is*
   * supported to use a proprietary string => uint64 mapping, assuming that it is consistent, and
   * that you always specify the uint64 values. * The mixer-tier in a multi-shard deployment might
   * convert the strings into uint64s to avoid redundant hashing overhead on the leaves, yet keep
   * the string tokens to preserve proto-level debugging. * When strings are present, I reserve the
   * right to use them for making logging "better", but, thusfar, there are 0 examples of this.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStringTokens() {
    return stringTokens;
  }

  /**
   * / TOKENS - Conceptually, each token names a set datapoints. The field(s) below are for
   * declaring the tokens that name the datapoint that this TokenNamespace proto is attached to. For
   * convenience, we support either string or uint64 tokens. Internally, the restricts system is
   * based on uint64s, but for many applications, strings are the more natural format, and they
   * should be preferred whenever this is the case. * When only uint64s are specified, they will be
   * used as-is. * When only strings are specified, they will be converted to uint64s via
   * Fingerprint2011. (See "Note on the safety of Fingerprint2011"). * ADVANCED: When both fields
   * are specified, the uint64s are used as-is. Note that, when both fields are used, they *must*
   * have the same number of entries, and the system will assume that your strings correspond 1:1
   * with the list of uint64 tokens. * EDGE CASE: All matching is done in the uint64 space, so, I'm
   * not sure why you'd do this, but if, eg, your database uses strings, and your queries specify
   * the Fingerprint2011 hashes of those strings, matching will work, and this is a specified
   * behavior. Note on the safety of Fingerprint2011: Unless you have well over 1M+ unique string
   * tokens, you can safely assume that every string will map to a unique 64-bit token. Internally,
   * both Mustang and PSI use Fingerprint2011 to hash arbitrary strings into uint64 tokens, and
   * assume, without validation, that each 64-bit token is unique. And the math backs up this
   * assumption: If we are using a "perfect" hashing function (and Fingerprint2011 is close-enough
   * for our purposes), and we then hash 1M unique tokens into a 64-bit space, there's still better
   * than 99.9999% odds that all tokens are collision-free, nearly as good as the odds for the
   * datacenter's continued existence. Scenarios for having both the string and uint64 token forms:
   * * Probably none that matter to you. Just use the strings directly. * You could have uint64 enum
   * values, yet want to include the string values for debugging purposes. Note that it *is*
   * supported to use a proprietary string => uint64 mapping, assuming that it is consistent, and
   * that you always specify the uint64 values. * The mixer-tier in a multi-shard deployment might
   * convert the strings into uint64s to avoid redundant hashing overhead on the leaves, yet keep
   * the string tokens to preserve proto-level debugging. * When strings are present, I reserve the
   * right to use them for making logging "better", but, thusfar, there are 0 examples of this.
   * @param stringTokens stringTokens or {@code null} for none
   */
  public ResearchScamTokenNamespace setStringTokens(java.util.List<java.lang.String> stringTokens) {
    this.stringTokens = stringTokens;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getUint64BlacklistTokens() {
    return uint64BlacklistTokens;
  }

  /**
   * @param uint64BlacklistTokens uint64BlacklistTokens or {@code null} for none
   */
  public ResearchScamTokenNamespace setUint64BlacklistTokens(java.util.List<java.math.BigInteger> uint64BlacklistTokens) {
    this.uint64BlacklistTokens = uint64BlacklistTokens;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<java.math.BigInteger> getUint64Tokens() {
    return uint64Tokens;
  }

  /**
   * @param uint64Tokens uint64Tokens or {@code null} for none
   */
  public ResearchScamTokenNamespace setUint64Tokens(java.util.List<java.math.BigInteger> uint64Tokens) {
    this.uint64Tokens = uint64Tokens;
    return this;
  }

  @Override
  public ResearchScamTokenNamespace set(String fieldName, Object value) {
    return (ResearchScamTokenNamespace) super.set(fieldName, value);
  }

  @Override
  public ResearchScamTokenNamespace clone() {
    return (ResearchScamTokenNamespace) super.clone();
  }

}
