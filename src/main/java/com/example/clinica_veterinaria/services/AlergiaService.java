package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.AlergiaEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;

import java.util.List;

public interface AlergiaService {

    List<AlergiaEntity> listarAlergias();

    AlergiaEntity consultarPorId(String id);
}
