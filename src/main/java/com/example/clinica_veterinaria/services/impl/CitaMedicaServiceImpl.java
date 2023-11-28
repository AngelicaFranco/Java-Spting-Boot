package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.dto.CitaMedicaDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import com.example.clinica_veterinaria.repository.CitaMedicaRepository;
import com.example.clinica_veterinaria.services.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaServiceImpl implements CitaMedicaService {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    @Override
    public CitaMedicaDto guardar(CitaMedicaDto citaMedicaDto) {
        CitaMedicaEntity citaMedicaEntity = new CitaMedicaEntity();
        citaMedicaEntity.setFecha(citaMedicaDto.getFecha());
        citaMedicaEntity.setProfesional(citaMedicaDto.getProfesional());
        AnimalEntity animal = new AnimalEntity();
        animal.setId(citaMedicaDto.getAnimal().getId());
        citaMedicaEntity.setAnimal(animal);
        citaMedicaRepository.save(citaMedicaEntity);
        return citaMedicaDto;
    }

    @Override
    public List<CitaMedicaEntity> listarCitasMedicas() {
        return null;
    }

    @Override
    public CitaMedicaEntity consultarPorId(String id) {
        return null;
    }
}
