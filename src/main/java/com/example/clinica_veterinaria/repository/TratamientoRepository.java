package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.TratamientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TratamientoRepository extends JpaRepository<TratamientoEntity, Integer> {

}
