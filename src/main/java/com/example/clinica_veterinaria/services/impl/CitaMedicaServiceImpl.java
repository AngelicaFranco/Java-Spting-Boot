package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.dto.CitaMedicaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import com.example.clinica_veterinaria.repository.CitaMedicaRepository;
import com.example.clinica_veterinaria.services.CitaMedicaService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CitaMedicaServiceImpl implements CitaMedicaService {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    @Autowired
    ModelMapper mapper;

    @Override
    public RespuestaDto guardar(CitaMedicaDto citaMedicaDto) {
        CitaMedicaEntity cita = mapper.map(citaMedicaDto,CitaMedicaEntity.class);
        citaMedicaRepository.save(cita);
        RespuestaDto respuestaDto = new RespuestaDto();
        respuestaDto.setMensaje("cita agendada con éxito");
        respuestaDto.setSalida(citaMedicaDto);
        return respuestaDto;

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
