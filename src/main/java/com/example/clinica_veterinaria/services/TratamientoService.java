package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.entities.TratamientoEntity;

import java.util.List;

public interface TratamientoService {

    List<TratamientoEntity> listarTratamientos();

    TratamientoEntity consultarPorId(String id);
}
