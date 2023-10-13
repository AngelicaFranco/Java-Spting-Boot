package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.CitaMedicaEntity;
import org.springframework.data.jpa.repository.JpaContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitaMedicaRepository extends JpaRepository<CitaMedicaEntity, Integer> {


}
