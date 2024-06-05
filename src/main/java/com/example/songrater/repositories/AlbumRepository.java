package com.example.songrater.repositories;

import com.example.songrater.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlbumRepository extends JpaRepository<Album, Long> {
    Optional<Album> findByListeningAlbum(String listeningAlbum);
}
