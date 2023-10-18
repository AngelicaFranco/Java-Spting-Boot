package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.repository.PersonaRepository;
import com.example.clinica_veterinaria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    @Override
    public PersonaDto guardar(PersonaDto personaDto) {
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setNombres(personaDto.getNombres());
        personaEntity.setApellidos(personaDto.getApellidos());
        personaEntity.setIdentificacion(personaDto.getIdentificacion());
        personaEntity.setSexo(personaDto.getSexo());
        personaEntity.setDireccion(personaDto.getDireccion());
        personaEntity.setTelefono(personaDto.getTelefono());
        personaEntity.setCorreo(personaDto.getCorreo());
        personaEntity.setRol(personaDto.getRol());
        personaRepository.save(personaEntity);
        return personaDto;
    }

    @Override
    public List<PersonaDto> listarPersonas() {
        return null;
    }

    @Override
    public PersonaDto consultarPorId(String id) {
        return null;
    }
}
