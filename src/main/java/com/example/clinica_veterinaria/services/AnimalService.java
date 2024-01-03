package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;

import java.util.List;

public interface AnimalService {

    RespuestaDto guardar(AnimalDto animalDto);

    List<AnimalEntity> listarAnimales();

    AnimalEntity consultarPorId(String id);
}
