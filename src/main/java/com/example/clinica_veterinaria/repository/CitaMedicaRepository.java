package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedicaEntity, Integer> {


}
