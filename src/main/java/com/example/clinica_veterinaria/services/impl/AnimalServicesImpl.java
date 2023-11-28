package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.repository.AnimalRepository;
import com.example.clinica_veterinaria.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AnimalServicesImpl implements AnimalService {

    @Autowired
    private AnimalRepository animalRepository;
    @Override
    public AnimalDto guardar(AnimalDto animalDto) {
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.setNombres(animalDto.getNombres());
        animalEntity.setFecha_nacimiento(animalDto.getFecha_nacimiento());
        animalEntity.setGrupo_animal(animalDto.getGrupo_animal());
        animalEntity.setEdad(animalDto.getEdad());
        animalEntity.setSexo(animalDto.getSexo());
        animalEntity.setPeso(animalDto.getPeso());
        animalEntity.setRaza(animalDto.getRaza());
        animalEntity.setNotas(animalDto.getNotas());
        PersonaEntity propietario = new PersonaEntity();
        propietario.setId(animalDto.getPropietario().getId());
        animalEntity.setPropietario(propietario);
        animalRepository.save(animalEntity);
        return animalDto;
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
