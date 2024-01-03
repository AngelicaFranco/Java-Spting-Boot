package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.repository.PersonaRepository;
import com.example.clinica_veterinaria.services.PersonaService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    ModelMapper mapper;


    @Override
    @Transactional
    public RespuestaDto guardar(PersonaDto personaDto) {
        PersonaEntity persona = mapper.map(personaDto,PersonaEntity.class);
        personaRepository.save(persona);
        RespuestaDto respuestaDto = new RespuestaDto();
        respuestaDto.setMensaje("persona guardada con éxito");
        respuestaDto.setSalida(personaDto);
        return respuestaDto;
    }

    @Override
    public List<PersonaDto> listarPersonas() {
        List<PersonaEntity> listaPersona = personaRepository.findAll();
        List<PersonaDto> resultadoPersonas = new ArrayList<>();

        listaPersona.forEach(personaEntity -> {
            resultadoPersonas.add(mapper.map(listaPersona, PersonaDto.class));
        });
    return resultadoPersonas;
    }

    @Override
    public PersonaDto consultarPorId(String id) {
        return null;
    }
}
