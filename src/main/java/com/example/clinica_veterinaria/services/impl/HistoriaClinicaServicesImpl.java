package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.HistoriaClinicaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import com.example.clinica_veterinaria.modelo.entities.HistoriaClinicaEntity;
import com.example.clinica_veterinaria.repository.HistoriaClinicaRepository;
import com.example.clinica_veterinaria.services.HistoriaClinicaService;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class HistoriaClinicaServicesImpl implements HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    ModelMapper mapper;


    @Override
    @Transactional
    public RespuestaDto guardar(HistoriaClinicaDto historiaClinicaDto) {
        HistoriaClinicaEntity historia = mapper.map(historiaClinicaDto, HistoriaClinicaEntity.class);
        historiaClinicaRepository.save(historia);
        RespuestaDto respuestaDto = new RespuestaDto();
        respuestaDto.setMensaje("historia clinica guardada con éxito");
        respuestaDto.setSalida(historiaClinicaDto);
        return respuestaDto;

    }

    @Override
    public List<HistoriaClinicaEntity> listarHistoriasClinicas() {
        return null;
    }

    @Override
    public HistoriaClinicaEntity consultarPorId(String id) {
        return null;
    }
}
