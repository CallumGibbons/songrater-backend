package com.example.songrater.services;

import com.example.songrater.models.Artist;
import com.example.songrater.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    private ArtistRepository artistRepository;

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Optional<Artist> updateArtist(Long id, Artist artistDetails) {
        return artistRepository.findById(id).map(artist -> {
            artist.setListeningArtist(artistDetails.getListeningArtist());
            artist.setRating(artistDetails.getRating());
            artist.setFavorite(artistDetails.isFavorite());
            artist.setNumberOfListens(artistDetails.getNumberOfListens());
            artist.setLastListened(artistDetails.getLastListened());
            return artistRepository.save(artist);
        });
    }

    public boolean deleteArtist(Long id) {
        return artistRepository.findById(id).map(artist -> {
            artistRepository.delete(artist);
            return true;
        }).orElse(false);
    }
}
