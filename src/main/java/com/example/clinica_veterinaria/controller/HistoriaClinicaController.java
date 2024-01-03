package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.dto.HistoriaClinicaDto;
import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.HistoriaClinicaEntity;
import com.example.clinica_veterinaria.services.HistoriaClinicaService;
import com.example.clinica_veterinaria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/historiaclinica")
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;


    @PostMapping("/guardar")
    public ResponseEntity<RespuestaDto> guardar(@RequestBody HistoriaClinicaDto historiaClinicaDto){
        return new ResponseEntity<>(historiaClinicaService.guardar(historiaClinicaDto), HttpStatus.CREATED);
    }

}
