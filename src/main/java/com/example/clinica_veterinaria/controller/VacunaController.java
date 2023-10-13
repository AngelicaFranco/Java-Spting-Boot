package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.modelo.VacunaEntity;
import com.example.clinica_veterinaria.services.VacunaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VacunaController {

    @Autowired
    private VacunaService vacunaService;

    @GetMapping("/consultarVacunas")
    public ResponseEntity<List<VacunaEntity>> consultarVacunas(){
        List<VacunaEntity> respuesta = vacunaService.listarVacunas();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarVacunaPorIdentificacion/{id}")
    public ResponseEntity<VacunaEntity> consultarVacunaPorId(@PathVariable String id){
        VacunaEntity respuesta = vacunaService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
