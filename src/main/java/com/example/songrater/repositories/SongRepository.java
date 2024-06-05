package com.example.songrater.repositories;

import com.example.songrater.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<Song, Long> {
    Optional<Song> findByListeningSong(String listeningSong);
}
