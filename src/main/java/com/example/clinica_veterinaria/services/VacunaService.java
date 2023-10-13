package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.modelo.VacunaEntity;

import java.util.List;

public interface VacunaService {

    List<VacunaEntity> listarVacunas();

    VacunaEntity consultarPorId(String id);
}
