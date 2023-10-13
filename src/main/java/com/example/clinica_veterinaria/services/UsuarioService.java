package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.modelo.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> listarUsuarios();

    UsuarioEntity consultarPorId(String id);
}
