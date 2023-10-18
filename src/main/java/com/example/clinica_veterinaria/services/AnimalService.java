package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;

import java.util.List;

public interface AnimalService {

    List<AnimalEntity> listarAnimales();

    AnimalEntity consultarPorId(String id);
}
