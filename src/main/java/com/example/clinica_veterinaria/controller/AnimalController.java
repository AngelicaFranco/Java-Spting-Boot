package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.AnimalEntity;
import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @GetMapping("/consultarAnimales")
    public ResponseEntity<List<AnimalEntity>> consultarAnimales(){
        List<AnimalEntity> respuesta = animalService.listarAnimales();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarAnimalPorIdentificacion/{id}")
    public ResponseEntity<AnimalEntity> consultarAnimalPorId(@PathVariable String id){
        AnimalEntity respuesta = animalService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

}
