package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.TratamientoEntity;

import java.util.List;

public interface TratamientoService {

    List<TratamientoEntity> listarTratamientos();

    TratamientoEntity consultarPorId(String id);
}
