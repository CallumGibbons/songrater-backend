package com.example.songrater.models;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "listening_history")
public class Listen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_listen_id")
    private Long id;

    @Column(name = "Listening Time")
    private LocalDateTime listeningDate;

    @Column(name = "Artist Name")
    private String artistName;

    @Column(name = "Album Name")
    private String albumName;

    @Column(name = "Song Name")
    private String songName;

    // Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getListeningDate() {
        return listeningDate;
    }

    public void setListeningDate(LocalDateTime listeningDate) {
        this.listeningDate = listeningDate;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
