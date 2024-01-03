package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.dto.CitaMedicaDto;
import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.CitaMedicaEntity;
import com.example.clinica_veterinaria.services.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citamedica")
public class CitaMedicaController {

    @Autowired
    private CitaMedicaService citaMedicaService;

    @PostMapping("/guardar")
    public ResponseEntity<RespuestaDto> guardar(@RequestBody CitaMedicaDto citaMedicaDto){
        return new ResponseEntity<>(citaMedicaService.guardar(citaMedicaDto), HttpStatus.CREATED);
    }

}
