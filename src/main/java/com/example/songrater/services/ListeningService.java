package com.example.songrater.services;

import com.example.songrater.models.Listen;
import com.example.songrater.repositories.ListeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListeningService {

    private final ListeningRepository listeningRepository;

    @Autowired
    public ListeningService(ListeningRepository listeningRepository) {
        this.listeningRepository = listeningRepository;
    }

    public List<Listen> getAllListens() {
        return listeningRepository.findAll();
    }

    public Optional<Listen> getListenById(Long id) {
        return listeningRepository.findById(id);
    }

    public Optional<Listen> getListenByArtistName(String artistName) {
        return listeningRepository.findByArtistName(artistName);
    }

    public Listen createListen(Listen listen) {
        return listeningRepository.save(listen);
    }

    public Listen updateListen(Long id, Listen listen) {
        listen.setId(id);
        return listeningRepository.save(listen);
    }

    public void deleteListen(Long id) {
        listeningRepository.deleteById(id);
    }
}
