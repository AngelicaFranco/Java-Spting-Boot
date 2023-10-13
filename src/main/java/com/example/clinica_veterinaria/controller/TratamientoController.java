package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.modelo.TratamientoEntity;
import com.example.clinica_veterinaria.services.TratamientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TratamientoController {

    @Autowired
    private TratamientoService tratamientoService;

    @GetMapping("/consultarTratamientos")
    public ResponseEntity<List<TratamientoEntity>> consultarTratamientos(){
        List<TratamientoEntity> respuesta = tratamientoService.listarTratamientos();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarTratamientosPorIdentificacion/{id}")
    public ResponseEntity<TratamientoEntity> consultarTratamientoPorId(@PathVariable String id){
        TratamientoEntity respuesta = tratamientoService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
