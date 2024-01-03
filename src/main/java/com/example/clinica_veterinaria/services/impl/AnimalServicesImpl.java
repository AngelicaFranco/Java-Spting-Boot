package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.repository.AnimalRepository;
import com.example.clinica_veterinaria.services.AnimalService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class AnimalServicesImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public RespuestaDto guardar(AnimalDto animalDto) {
        AnimalEntity animal = mapper.map(animalDto,AnimalEntity.class);
        PersonaEntity personaEntity = mapper.map(animalDto.getPropietario(),PersonaEntity.class);
        animal.setPropietario(personaEntity);
        animalRepository.save(animal);
        RespuestaDto respuestaDto = new RespuestaDto();
        respuestaDto.setMensaje("animal guardado con éxito");
        respuestaDto.setSalida(animalDto);
        return respuestaDto;

    }

    @Override
    public List<AnimalEntity> listarAnimales() {
        return null;
    }

    @Override
    public AnimalEntity consultarPorId(String id) {
        return null;
    }
}
