package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.dto.AnimalDto;
import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.dto.RespuestaDto;
import com.example.clinica_veterinaria.modelo.entities.AnimalEntity;
import com.example.clinica_veterinaria.services.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // indica que la clase publica URL para hacer consumidas por un externo
@RequestMapping("/animal") //indica que por medio de la palabra entre comillas se va a acceder a los métodos de la clase
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("/guardar")
    public ResponseEntity<RespuestaDto> guardar(@RequestBody AnimalDto animalDto){
        return new ResponseEntity<>(animalService.guardar(animalDto), HttpStatus.CREATED);
    }

}
