package com.example.songrater.services;

import com.example.songrater.models.Album;
import com.example.songrater.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public List<Album> getAllAlbums() {
        return albumRepository.findAll();
    }

    public Optional<Album> getAlbumById(Long id) {
        return albumRepository.findById(id);
    }

    public Album createAlbum(Album album) {
        return albumRepository.save(album);
    }

    public Optional<Album> updateAlbum(Long id, Album albumDetails) {
        return albumRepository.findById(id).map(album -> {
            album.setListeningAlbum(albumDetails.getListeningAlbum());
            album.setListeningArtist(albumDetails.getListeningArtist());
            album.setRating(albumDetails.getRating());
            album.setFavorite(albumDetails.isFavorite());
            album.setNumberOfListens(albumDetails.getNumberOfListens());
            album.setLastListened(albumDetails.getLastListened());
            album.setAlbumArt(albumDetails.getAlbumArt());
            return albumRepository.save(album);
        });
    }

    public boolean deleteAlbum(Long id) {
        return albumRepository.findById(id).map(album -> {
            albumRepository.delete(album);
            return true;
        }).orElse(false);
    }
}
