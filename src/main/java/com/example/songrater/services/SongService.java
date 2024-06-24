package com.example.songrater.services;

import com.example.songrater.models.Song;
import com.example.songrater.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(Long id) {
        return songRepository.findById(id);
    }

    public Song createSong(Song song) {
        return songRepository.save(song);
    }

    public Optional<Song> updateSong(Long id, Song songDetails) {
        return songRepository.findById(id).map(song -> {
            song.setListeningSong(songDetails.getListeningSong());
            song.setListeningAlbum(songDetails.getListeningAlbum());
            song.setListeningArtist(songDetails.getListeningArtist());
            song.setRating(songDetails.getRating());
            song.setFavorite(songDetails.isFavorite());
            song.setNumberOfListens(songDetails.getNumberOfListens());
            song.setLastListened(songDetails.getLastListened());
            song.setAlbumArt(songDetails.getAlbumArt());
            return songRepository.save(song);
        });
    }

    public boolean deleteSong(Long id) {
        return songRepository.findById(id).map(song -> {
            songRepository.delete(song);
            return true;
        }).orElse(false);
    }
}
