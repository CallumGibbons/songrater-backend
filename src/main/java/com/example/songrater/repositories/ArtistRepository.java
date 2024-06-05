package com.example.songrater.repositories;

import com.example.songrater.models.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    Optional<Artist> findByListeningArtist(String listeningArtist);
}
