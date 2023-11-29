package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.exceptions.ApiException;
import com.example.clinica_veterinaria.modelo.dto.RegistroUsuarioDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.modelo.entities.UsuarioEntity;
import com.example.clinica_veterinaria.repository.PersonaRepository;
import com.example.clinica_veterinaria.repository.UsuarioRepository;
import com.example.clinica_veterinaria.services.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j // para poder usar el log
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PersonaRepository personaRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public List<UsuarioEntity> listarUsuarios() {
        return null;
    }

    @Override
    public UsuarioEntity consultarPorId(String id) {
        return null;
    }

    /**
     * Metodo para guardar un usuario
     *
     * @param usuario
     * @return
     */
    @Override
    @Transactional
    public String guardarUsuario(RegistroUsuarioDto usuario) {

        try {
            if (usuario.getDatosPersona() == null) {
                throw new ApiException("Los datos de la persona no pueden ser nulos", HttpStatus.BAD_REQUEST);
            }

            // verificar si existe un usuario con el mismo nombre de usuario
            UsuarioEntity usuarioEntityOp = usuarioRepository.findByUsuario(usuario.getDatosUsuario().getUsuario());
            if (usuarioEntityOp != null) {
                throw new ApiException("El usuario ya existe.", HttpStatus.BAD_REQUEST);
            }

            PersonaEntity persona = mapper.map(usuario.getDatosPersona(), PersonaEntity.class);
            personaRepository.save(persona);
            UsuarioEntity usuarioEntity = mapper.map(usuario.getDatosUsuario(), UsuarioEntity.class);
            usuarioEntity.setPersona(persona);
            usuarioRepository.save(usuarioEntity);
            return "Usuario guardado";
        } catch (Exception e) {
            if (e instanceof ApiException) {
                throw e;
            }
            log.error("Error al guardar el usuario: {}", e.getMessage());
            throw new ApiException("Error al guardar el usuario", HttpStatus.BAD_REQUEST);
        }
    }

}
