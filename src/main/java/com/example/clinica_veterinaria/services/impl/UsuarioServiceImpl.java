package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.RegistroUsuarioDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.modelo.entities.UsuarioEntity;
import com.example.clinica_veterinaria.repository.PersonaRepository;
import com.example.clinica_veterinaria.repository.UsuarioRepository;
import com.example.clinica_veterinaria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PersonaRepository personaRepository;

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
     * @param usuario
     * @return
     */
    @Override
    @Transactional
    public String guardarUsuario(RegistroUsuarioDto usuario) {
        PersonaEntity persona = new PersonaEntity();
        persona.setNombres(usuario.getDatosPersona().getNombres());
        persona.setApellidos(usuario.getDatosPersona().getApellidos());
        persona.setDireccion(usuario.getDatosPersona().getDireccion());
        persona.setTelefono(usuario.getDatosPersona().getTelefono());
        persona.setCorreo(usuario.getDatosPersona().getCorreo());
        persona.setSexo(usuario.getDatosPersona().getSexo());
        persona.setIdentificacion(usuario.getDatosPersona().getIdentificacion());
        personaRepository.save(persona);

        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setUsuario(usuario.getDatosUsuario().getUsuario());
        usuarioEntity.setContrasena(usuario.getDatosUsuario().getContrasena());
        usuarioEntity.setRol(usuario.getDatosUsuario().getRol());
        usuarioEntity.setPersona(persona);
        usuarioRepository.save(usuarioEntity);
        return "Usuario guardado";
    }

}
