package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.CitaMedicaEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;

import java.util.List;

public interface CitaMedicaService {

    List<CitaMedicaEntity> listarCitasMedicas();

    CitaMedicaEntity consultarPorId(String id);
}
