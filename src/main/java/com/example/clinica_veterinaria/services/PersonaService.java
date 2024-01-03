package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;

import java.util.List;

public interface PersonaService {

    RespuestaDto guardar(PersonaDto personaDto);

    List<PersonaDto> listarPersonas();

    PersonaDto consultarPorId(String id);
}
