package com.example.songrater.controllers;

import com.example.songrater.models.Listen;
import com.example.songrater.services.ListeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/listens")
public class ListeningController {

    @Autowired
    private ListeningService listenService;

    @GetMapping
    public List<Listen> getAllListens() {
        return listenService.getAllListens();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Listen> getListenById(@PathVariable Long id) {
        return listenService.getListenById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Listen createListen(@RequestBody Listen listen) {
        return listenService.createListen(listen);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Listen> updateListen(@PathVariable Long id, @RequestBody Listen listenDetails) {
        return listenService.updateListen(id, listenDetails).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteListen(@PathVariable Long id) {
        return listenService.deleteListen(id) ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
