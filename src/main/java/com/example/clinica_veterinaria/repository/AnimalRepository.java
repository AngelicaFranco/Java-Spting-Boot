package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Integer> {



}
