package com.example.clinica_veterinaria.services;

import com.example.clinica_veterinaria.modelo.dto.RegistroUsuarioDto;
import com.example.clinica_veterinaria.modelo.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> listarUsuarios();

    UsuarioEntity consultarPorId(String id);

    String guardarUsuario(RegistroUsuarioDto usuario);
}
