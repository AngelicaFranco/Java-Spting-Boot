package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.dto.HistoriaClinicaDto;
import com.example.clinica_veterinaria.modelo.entities.HistoriaClinicaEntity;

import java.util.List;

public interface HistoriaClinicaService {

    HistoriaClinicaDto guardar(HistoriaClinicaDto historiaClinicaDto);

    List<HistoriaClinicaEntity> listarHistoriasClinicas();

    HistoriaClinicaEntity consultarPorId(String id);
}
