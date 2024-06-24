package com.example.songrater.services;

import com.example.songrater.models.Listen;
import com.example.songrater.repositories.ListeningRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ListeningService {

    @Autowired
    private ListeningRepository listeningRepository;

    public List<Listen> getAllListens() {
        return listeningRepository.findAll();
    }

    public Optional<Listen> getListenById(Long id) {
        return listeningRepository.findById(id);
    }

    public Listen createListen(Listen listen) {
        return listeningRepository.save(listen);
    }

    public Optional<Listen> updateListen(Long id, Listen listenDetails) {
        return listeningRepository.findById(id).map(listen -> {
            listen.setListeningDate(listenDetails.getListeningDate());
            listen.setArtistName(listenDetails.getArtistName());
            listen.setAlbumName(listenDetails.getAlbumName());
            listen.setSongName(listenDetails.getSongName());
            return listeningRepository.save(listen);
        });
    }

    public boolean deleteListen(Long id) {
        return listeningRepository.findById(id).map(listen -> {
            listeningRepository.delete(listen);
            return true;
        }).orElse(false);
    }
}
