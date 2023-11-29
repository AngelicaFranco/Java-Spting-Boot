package com.example.clinica_veterinaria.repository;

import com.example.clinica_veterinaria.modelo.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

        UsuarioEntity findByUsuario(String usuario);

}
