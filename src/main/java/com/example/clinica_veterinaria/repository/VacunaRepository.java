package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.VacunaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacunaRepository extends JpaRepository<VacunaEntity, Integer> {


}
