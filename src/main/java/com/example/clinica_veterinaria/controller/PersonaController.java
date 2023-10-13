package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping("/consultarPersonas")
    public ResponseEntity<List<PersonaEntity>> consultarPersonas(){
        List<PersonaEntity> respuesta = personaService.listarPersonas();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarPersonaPorIdentificacion/{id}")
    public ResponseEntity<PersonaEntity> consultarPersonaPorId(@PathVariable String id){
        PersonaEntity respuesta = personaService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
