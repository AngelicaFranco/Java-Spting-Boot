package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.dto.CitaMedicaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;

import java.util.List;

public interface CitaMedicaService {

    RespuestaDto guardar (CitaMedicaDto citaMedicaDto);

    List<CitaMedicaEntity> listarCitasMedicas();

    CitaMedicaEntity consultarPorId(String id);
}
