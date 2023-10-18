package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.HistoriaClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinicaEntity, Integer> {


}
