package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.AlergiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlergiaRepository extends JpaRepository<AlergiaEntity, Integer> {


}
