package com.example.whattocook.controller;

import com.example.whattocook.entity.Artikl;
import com.example.whattocook.servis.ArtiklServis;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/api/v1")
@org.springframework.web.bind.annotation.RestController
public class RestController {
    private final ArtiklServis artiklServis;

    public RestController(ArtiklServis artiklServis) {
        this.artiklServis = artiklServis;
    }

    @GetMapping("/artikl")
    public ResponseEntity<Artikl> getArtiklByNameAndCalories(@RequestParam Integer calories, String name){
        return new ResponseEntity<>(artiklServis.findByCaloriesAndName(calories, name), HttpStatus.OK);
    }
}