package com.example.songrater.models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "song_ratings")
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_song_id")
    private Long id;

    @Column(name = "FK_listening_song")
    private String listeningSong;

    @Column(name = "FK_listening_album")
    private String listeningAlbum;

    @Column(name = "FK_listening_artist")
    private String listeningArtist;

    @Column(name = "song_rating")
    private int rating;

    @Column(name = "is_favorite")
    private boolean isFavorite;

    @Column(name = "number_of_listens")
    private int numberOfListens;

    @Column(name = "last_listened")
    private LocalDateTime lastListened;

    @Column(name = "album_art")
    private String albumArt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListeningSong() {
        return listeningSong;
    }

    public void setListeningSong(String listeningSong) {
        this.listeningSong = listeningSong;
    }

    public String getListeningAlbum() {
        return listeningAlbum;
    }

    public void setListeningAlbum(String listeningAlbum) {
        this.listeningAlbum = listeningAlbum;
    }

    public String getListeningArtist() {
        return listeningArtist;
    }

    public void setListeningArtist(String listeningArtist) {
        this.listeningArtist = listeningArtist;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getNumberOfListens() {
        return numberOfListens;
    }

    public void setNumberOfListens(int numberOfListens) {
        this.numberOfListens = numberOfListens;
    }

    public LocalDateTime getLastListened() {
        return lastListened;
    }

    public void setLastListened(LocalDateTime lastListened) {
        this.lastListened = lastListened;
    }

    public String getAlbumArt() {
        return albumArt;
    }

    public void setAlbumArt(String albumArt) {
        this.albumArt = albumArt;
    }
}
