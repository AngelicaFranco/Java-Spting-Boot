package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.AlergiaEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.services.AlergiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AlergiaController {

    @Autowired
    private AlergiaService alergiaService;

    @GetMapping("/consultarAlergias")
    public ResponseEntity<List<AlergiaEntity>> consultarAlergias(){
        List<AlergiaEntity> respuesta = alergiaService.listarAlergias();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarAlergiaPorIdentificacion/{id}")
    public ResponseEntity<AlergiaEntity> consultarAlergiaPorId(@PathVariable String id){
        AlergiaEntity respuesta = alergiaService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
