package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.CitaMedicaEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.services.CitaMedicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CitaMedicaController {

    @Autowired
    private CitaMedicaService citaMedicaService;

    @GetMapping("/consultarCitasMedicas")
    public ResponseEntity<List<CitaMedicaEntity>> consultarCitasMedicas(){
        List<CitaMedicaEntity> respuesta = citaMedicaService.listarCitasMedicas();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarCitasMedicasPorIdentificacion/{id}")
    public ResponseEntity<CitaMedicaEntity> consultarCitaMedicaPorId(@PathVariable String id){
        CitaMedicaEntity respuesta = citaMedicaService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
