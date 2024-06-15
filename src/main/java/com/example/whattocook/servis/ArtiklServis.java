package com.example.whattocook.servis;

import com.example.whattocook.entity.Artikl;
import com.example.whattocook.repository.ArtiklRepository;
import org.springframework.stereotype.Service;

@Service
public class ArtiklServis {
    private final ArtiklRepository artiklRepository;

    public ArtiklServis(ArtiklRepository artiklRepository) {
        this.artiklRepository = artiklRepository;
    }

    public Artikl findByCaloriesAndName(int calories, String name) {
        return artiklRepository.findByCaloriesAndName(calories, name);
    }

}
