package com.example.songrater.controllers;

import com.example.songrater.models.Listen;
import com.example.songrater.services.ListeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/listens")
public class ListeningController {

    private final ListeningService listeningService;

    @Autowired
    public ListeningController(ListeningService listeningService) {
        this.listeningService = listeningService;
    }

    @GetMapping
    public List<Listen> getAllListens() {
        return listeningService.getAllListens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Listen> getListenById(@PathVariable Long id) {
        Optional<Listen> listen = listeningService.getListenById(id);
        return listen.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/artist/{artistName}")
    public ResponseEntity<Listen> getListenByArtistName(@PathVariable String artistName) {
        Optional<Listen> listen = listeningService.getListenByArtistName(artistName);
        return listen.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Listen createListen(@RequestBody Listen listen) {
        return listeningService.createListen(listen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Listen> updateListen(@PathVariable Long id, @RequestBody Listen listen) {
        return ResponseEntity.ok(listeningService.updateListen(id, listen));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListen(@PathVariable Long id) {
        listeningService.deleteListen(id);
        return ResponseEntity.noContent().build();
    }
}
