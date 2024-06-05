package com.example.songrater.repositories;

import com.example.songrater.models.Listen;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ListeningRepository extends JpaRepository<Listen, Long> {
    Optional<Listen> findByListen(String listen);
}