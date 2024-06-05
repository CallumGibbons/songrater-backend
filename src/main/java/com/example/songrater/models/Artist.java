package com.example.songrater.models;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "artist_ratings")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_artist_id")
    private Long id;

    @Column(name = "FK_listening_artist")
    private String listeningArtist;

    @Column(name = "artist_rating")
    private int rating;

    @Column(name = "is_favorite")
    private boolean isFavorite;

    @Column(name = "number_of_listens")
    private int numberOfListens;

    @Column(name = "last_listened")
    private LocalDate lastListened;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getLastListened() {
        return lastListened;
    }

    public void setLastListened(LocalDate lastListened) {
        this.lastListened = lastListened;
    }
}
