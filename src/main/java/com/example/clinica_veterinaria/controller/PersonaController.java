package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.dto.PersonaDto;
import com.example.clinica_veterinaria.modelo.entities.PersonaEntity;
import com.example.clinica_veterinaria.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    private PersonaService personaService;


    @PostMapping("/guardar")
    public ResponseEntity<PersonaDto> guardar(@RequestBody PersonaDto personaDto){
        return new ResponseEntity<>(personaService.guardar(personaDto), HttpStatus.CREATED);
    }

    @GetMapping("/listarTodos")
    public ResponseEntity<List<PersonaDto>> listarPersona(){
        return new ResponseEntity<>(personaService.listarPersonas(),HttpStatus.OK);
    }
}
