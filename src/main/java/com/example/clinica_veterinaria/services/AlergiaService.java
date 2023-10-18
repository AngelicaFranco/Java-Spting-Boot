package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.entities.AlergiaEntity;

import java.util.List;

public interface AlergiaService {

    List<AlergiaEntity> listarAlergias();

    AlergiaEntity consultarPorId(String id);
}
