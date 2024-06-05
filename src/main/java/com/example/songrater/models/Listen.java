package com.example.songrater.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "listening_history")
public class Listen {
    @Column(name = "Listening Time")
    private LocalDateTime ListeningDate;
    @Column(name = "Artist Name")
    private String ArtistName;
    @Column(name = "Album Name")
    private String AlbumName;
    @Column(name = "Song Name")
    private String SongName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_listen_id")
    private Long id;

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public void setAlbumName(String albumName) {
        AlbumName = albumName;
    }

    public String getArtistName() {
        return ArtistName;
    }

    public void setArtistName(String artistName) {
        ArtistName = artistName;
    }

    public LocalDateTime getListeningDate() {
        return ListeningDate;
    }

    public void setListeningDate(LocalDateTime listeningDate) {
        ListeningDate = listeningDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
