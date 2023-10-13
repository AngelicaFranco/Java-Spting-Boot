package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.HistoriaClinicaEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.services.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoriaClinicaController {

    @Autowired
    private HistoriaClinicaService historiaClinicaService;

    @GetMapping("/consultarHistoriasClinicas")
    public ResponseEntity<List<HistoriaClinicaEntity>> consultarHistoriasClinicas(){
        List<HistoriaClinicaEntity> respuesta = historiaClinicaService.listarHistoriasClinicas();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarHistoriasClinicasPorIdentificacion/{id}")
    public ResponseEntity<HistoriaClinicaEntity> consultarHistoriaClinicaPorId(@PathVariable String id){
        HistoriaClinicaEntity respuesta = historiaClinicaService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}
