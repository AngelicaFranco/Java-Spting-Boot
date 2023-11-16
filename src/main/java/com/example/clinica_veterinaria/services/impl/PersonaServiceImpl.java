package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.repository.PersonaRepository;
import com.example.clinica_veterinaria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
        personaRepository.save(personaEntity);
        return personaDto;
    }

    @Override
    public List<PersonaDto> listarPersonas() {
        List<PersonaEntity> listaPersona = personaRepository.findAll();
        List<PersonaDto> resultadoPersonas = new ArrayList<>();
        listaPersona.forEach(personaEntity -> {
            PersonaDto item = new PersonaDto();
            item.setNombres(personaEntity.getNombres());
            item.setApellidos(personaEntity.getApellidos());
            item.setIdentificacion(personaEntity.getIdentificacion());
            item.setDireccion(personaEntity.getDireccion());
            item.setSexo(personaEntity.getSexo());
            item.setId(personaEntity.getId());
            item.setCorreo(personaEntity.getCorreo());
            item.setTelefono(personaEntity.getTelefono());
            resultadoPersonas.add(item);
        });
    return resultadoPersonas;
    }

    @Override
    public PersonaDto consultarPorId(String id) {
        return null;
    }
}
