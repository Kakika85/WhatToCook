package com.example.whattocook.repository;

import com.example.whattocook.entity.Artikl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtiklRepository extends JpaRepository <Artikl, Integer> {
    Artikl findByCaloriesAndName(int calories, String name);

}
