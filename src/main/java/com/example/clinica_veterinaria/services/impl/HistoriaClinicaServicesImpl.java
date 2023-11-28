package com.example.clinica_veterinaria.services.impl;

import com.example.clinica_veterinaria.modelo.dto.HistoriaClinicaDto;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import com.example.clinica_veterinaria.modelo.entities.HistoriaClinicaEntity;
import com.example.clinica_veterinaria.repository.HistoriaClinicaRepository;
import com.example.clinica_veterinaria.services.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaServicesImpl implements HistoriaClinicaService {

    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;


    @Override
    public HistoriaClinicaDto guardar(HistoriaClinicaDto historiaClinicaDto) {
        HistoriaClinicaEntity historiaClinicaEntity = new HistoriaClinicaEntity();
        historiaClinicaEntity.setAntecedentes(historiaClinicaDto.getAntecedentes());
        historiaClinicaEntity.setMotivo_consulta(historiaClinicaDto.getMotivo_consulta());
        historiaClinicaEntity.setPeso(historiaClinicaDto.getPeso());
        historiaClinicaEntity.setTemperatura(historiaClinicaDto.getTemperatura());
        historiaClinicaEntity.setEstado_animico(historiaClinicaDto.getEstado_animico());
        historiaClinicaEntity.setHallazgo(historiaClinicaDto.getHallazgo());
        CitaMedicaEntity citaMedica = new CitaMedicaEntity();
        citaMedica.setId(historiaClinicaDto.getCitaMedica().getId());
        historiaClinicaEntity.setCitaMedica(citaMedica);
        historiaClinicaRepository.save(historiaClinicaEntity);
        return historiaClinicaDto;
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
