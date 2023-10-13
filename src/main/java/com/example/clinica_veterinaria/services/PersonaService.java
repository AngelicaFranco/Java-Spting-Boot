package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.PersonaEntity;

import java.util.List;

public interface PersonaService {

    List<PersonaEntity> listarPersonas();

    PersonaEntity consultarPorId(String id);
}
