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
 * Represents a music recording (usually a song). Each populated field can be thought of as
 * additional constraint about the song's identity. For instance, if no fields are set, then this
 * represents "some song." If only the music_artist is set, then it represents "some song by the
 * specified music_artist." Inspired (but not strictly adhered to) http://schema.org/MusicRecording
 * Next ID: 22
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the contentwarehouse API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NlpSemanticParsingModelsMediaAudio extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaAlbumTitle album;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaMusicArtist artist;

  /**
   * Like an audio book. "Listen to (moby dick) audiobook"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaBook book;

  /**
   * A date time constraint for audio entity, for example, "jazz station 1980".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingDatetimeDateTime dateTime;

  /**
   * Constraining the query to some detail about the episode. Example: "listen to episode (13) of
   * this american life with (mike birbiglia)" would have the 2 constraints in parens.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NlpSemanticParsingModelsMediaEpisodeConstraint> episodeConstraint;

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the game. "Play soundtrack from (Deus Ex Human Revolution)".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaGame game;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaGenericMusic genericMusic;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaMusicGenre genre;

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the movie. E.g. "Play (Let It Go) from (Disney's Frozen)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaMovie movie;

  /**
   * News topic. "Listen to news about (Ukraine)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaNewsTopic newsTopic;

  /**
   * True when the query does not contains an explict audio name. E.g. When user says "play" or
   * "listen to".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noExplicitAudio;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaMusicPlaylist playlist;

  /**
   * Podcast feeds. "Listen to (This American Life)"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaPodcast podcast;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaRadio radio;

  /**
   * E.g. "play NPR radio", "Play BBC radio".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaRadioNetwork radioNetwork;

  /**
   * The query for backends to use in search. e.g. for an user query of "play kids song video on tv"
   * from assistant, this field would be "kids song". Note: there is no guarantee this field is
   * populated; when it is not, backends should fall back to "raw_text" fields in song, artist,
   * album etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rawText;

  /**
   * If any of movie, game or tv show fields is populated this field indicates specific score type
   * requested in the query. E.g. for [play soundtrack from frozen] this field is SOUNDTRACK, for
   * [play frozen song] this field is THEME_SONG.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scoreType;

  /**
   * Constraining the query to some detail about the season. Example: "listen to season 2 of serial"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaSeasonConstraint seasonConstraint;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaSong song;

  /**
   * Optional tags associated with how the media entity should be played. For example, this can be
   * set to SEED_RADIO to signify that the user wants to play a radio station seeded by the entity.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tag;

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the tv show. E.g. "Play soundtrack from (Friends)".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NlpSemanticParsingModelsMediaTVShow tvShow;

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAlbumTitle getAlbum() {
    return album;
  }

  /**
   * @param album album or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setAlbum(NlpSemanticParsingModelsMediaAlbumTitle album) {
    this.album = album;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaMusicArtist getArtist() {
    return artist;
  }

  /**
   * @param artist artist or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setArtist(NlpSemanticParsingModelsMediaMusicArtist artist) {
    this.artist = artist;
    return this;
  }

  /**
   * Like an audio book. "Listen to (moby dick) audiobook"
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaBook getBook() {
    return book;
  }

  /**
   * Like an audio book. "Listen to (moby dick) audiobook"
   * @param book book or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setBook(NlpSemanticParsingModelsMediaBook book) {
    this.book = book;
    return this;
  }

  /**
   * A date time constraint for audio entity, for example, "jazz station 1980".
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingDatetimeDateTime getDateTime() {
    return dateTime;
  }

  /**
   * A date time constraint for audio entity, for example, "jazz station 1980".
   * @param dateTime dateTime or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setDateTime(NlpSemanticParsingDatetimeDateTime dateTime) {
    this.dateTime = dateTime;
    return this;
  }

  /**
   * Constraining the query to some detail about the episode. Example: "listen to episode (13) of
   * this american life with (mike birbiglia)" would have the 2 constraints in parens.
   * @return value or {@code null} for none
   */
  public java.util.List<NlpSemanticParsingModelsMediaEpisodeConstraint> getEpisodeConstraint() {
    return episodeConstraint;
  }

  /**
   * Constraining the query to some detail about the episode. Example: "listen to episode (13) of
   * this american life with (mike birbiglia)" would have the 2 constraints in parens.
   * @param episodeConstraint episodeConstraint or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setEpisodeConstraint(java.util.List<NlpSemanticParsingModelsMediaEpisodeConstraint> episodeConstraint) {
    this.episodeConstraint = episodeConstraint;
    return this;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the game. "Play soundtrack from (Deus Ex Human Revolution)".
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGame getGame() {
    return game;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the game. "Play soundtrack from (Deus Ex Human Revolution)".
   * @param game game or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setGame(NlpSemanticParsingModelsMediaGame game) {
    this.game = game;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaGenericMusic getGenericMusic() {
    return genericMusic;
  }

  /**
   * @param genericMusic genericMusic or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setGenericMusic(NlpSemanticParsingModelsMediaGenericMusic genericMusic) {
    this.genericMusic = genericMusic;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaMusicGenre getGenre() {
    return genre;
  }

  /**
   * @param genre genre or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setGenre(NlpSemanticParsingModelsMediaMusicGenre genre) {
    this.genre = genre;
    return this;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the movie. E.g. "Play (Let It Go) from (Disney's Frozen)"
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaMovie getMovie() {
    return movie;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the movie. E.g. "Play (Let It Go) from (Disney's Frozen)"
   * @param movie movie or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setMovie(NlpSemanticParsingModelsMediaMovie movie) {
    this.movie = movie;
    return this;
  }

  /**
   * News topic. "Listen to news about (Ukraine)"
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaNewsTopic getNewsTopic() {
    return newsTopic;
  }

  /**
   * News topic. "Listen to news about (Ukraine)"
   * @param newsTopic newsTopic or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setNewsTopic(NlpSemanticParsingModelsMediaNewsTopic newsTopic) {
    this.newsTopic = newsTopic;
    return this;
  }

  /**
   * True when the query does not contains an explict audio name. E.g. When user says "play" or
   * "listen to".
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoExplicitAudio() {
    return noExplicitAudio;
  }

  /**
   * True when the query does not contains an explict audio name. E.g. When user says "play" or
   * "listen to".
   * @param noExplicitAudio noExplicitAudio or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setNoExplicitAudio(java.lang.Boolean noExplicitAudio) {
    this.noExplicitAudio = noExplicitAudio;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaMusicPlaylist getPlaylist() {
    return playlist;
  }

  /**
   * @param playlist playlist or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setPlaylist(NlpSemanticParsingModelsMediaMusicPlaylist playlist) {
    this.playlist = playlist;
    return this;
  }

  /**
   * Podcast feeds. "Listen to (This American Life)"
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaPodcast getPodcast() {
    return podcast;
  }

  /**
   * Podcast feeds. "Listen to (This American Life)"
   * @param podcast podcast or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setPodcast(NlpSemanticParsingModelsMediaPodcast podcast) {
    this.podcast = podcast;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaRadio getRadio() {
    return radio;
  }

  /**
   * @param radio radio or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setRadio(NlpSemanticParsingModelsMediaRadio radio) {
    this.radio = radio;
    return this;
  }

  /**
   * E.g. "play NPR radio", "Play BBC radio".
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaRadioNetwork getRadioNetwork() {
    return radioNetwork;
  }

  /**
   * E.g. "play NPR radio", "Play BBC radio".
   * @param radioNetwork radioNetwork or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setRadioNetwork(NlpSemanticParsingModelsMediaRadioNetwork radioNetwork) {
    this.radioNetwork = radioNetwork;
    return this;
  }

  /**
   * The query for backends to use in search. e.g. for an user query of "play kids song video on tv"
   * from assistant, this field would be "kids song". Note: there is no guarantee this field is
   * populated; when it is not, backends should fall back to "raw_text" fields in song, artist,
   * album etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getRawText() {
    return rawText;
  }

  /**
   * The query for backends to use in search. e.g. for an user query of "play kids song video on tv"
   * from assistant, this field would be "kids song". Note: there is no guarantee this field is
   * populated; when it is not, backends should fall back to "raw_text" fields in song, artist,
   * album etc.
   * @param rawText rawText or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setRawText(java.lang.String rawText) {
    this.rawText = rawText;
    return this;
  }

  /**
   * If any of movie, game or tv show fields is populated this field indicates specific score type
   * requested in the query. E.g. for [play soundtrack from frozen] this field is SOUNDTRACK, for
   * [play frozen song] this field is THEME_SONG.
   * @return value or {@code null} for none
   */
  public java.lang.String getScoreType() {
    return scoreType;
  }

  /**
   * If any of movie, game or tv show fields is populated this field indicates specific score type
   * requested in the query. E.g. for [play soundtrack from frozen] this field is SOUNDTRACK, for
   * [play frozen song] this field is THEME_SONG.
   * @param scoreType scoreType or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setScoreType(java.lang.String scoreType) {
    this.scoreType = scoreType;
    return this;
  }

  /**
   * Constraining the query to some detail about the season. Example: "listen to season 2 of serial"
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaSeasonConstraint getSeasonConstraint() {
    return seasonConstraint;
  }

  /**
   * Constraining the query to some detail about the season. Example: "listen to season 2 of serial"
   * @param seasonConstraint seasonConstraint or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setSeasonConstraint(NlpSemanticParsingModelsMediaSeasonConstraint seasonConstraint) {
    this.seasonConstraint = seasonConstraint;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaSong getSong() {
    return song;
  }

  /**
   * @param song song or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setSong(NlpSemanticParsingModelsMediaSong song) {
    this.song = song;
    return this;
  }

  /**
   * Optional tags associated with how the media entity should be played. For example, this can be
   * set to SEED_RADIO to signify that the user wants to play a radio station seeded by the entity.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTag() {
    return tag;
  }

  /**
   * Optional tags associated with how the media entity should be played. For example, this can be
   * set to SEED_RADIO to signify that the user wants to play a radio station seeded by the entity.
   * @param tag tag or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setTag(java.util.List<java.lang.String> tag) {
    this.tag = tag;
    return this;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the tv show. E.g. "Play soundtrack from (Friends)".
   * @return value or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaTVShow getTvShow() {
    return tvShow;
  }

  /**
   * Soundtrack or theme song (see score_type param that indicates whether the user refers to a
   * soundtrack or a theme song) of the tv show. E.g. "Play soundtrack from (Friends)".
   * @param tvShow tvShow or {@code null} for none
   */
  public NlpSemanticParsingModelsMediaAudio setTvShow(NlpSemanticParsingModelsMediaTVShow tvShow) {
    this.tvShow = tvShow;
    return this;
  }

  @Override
  public NlpSemanticParsingModelsMediaAudio set(String fieldName, Object value) {
    return (NlpSemanticParsingModelsMediaAudio) super.set(fieldName, value);
  }

  @Override
  public NlpSemanticParsingModelsMediaAudio clone() {
    return (NlpSemanticParsingModelsMediaAudio) super.clone();
  }

}
