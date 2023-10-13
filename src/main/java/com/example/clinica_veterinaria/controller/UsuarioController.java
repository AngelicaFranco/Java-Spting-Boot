package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.PersonaEntity;
import com.example.clinica_veterinaria.modelo.UsuarioEntity;
import com.example.clinica_veterinaria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/consultarUsuarios")
    public ResponseEntity<List<UsuarioEntity>> consultarUsuarios(){
        List<UsuarioEntity> respuesta = usuarioService.listarUsuarios();
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }

    @GetMapping("/consultarUsuarioPorIdentificacion/{id}")
    public ResponseEntity<UsuarioEntity> consultarUsuarioPorId(@PathVariable String id){
        UsuarioEntity respuesta = usuarioService.consultarPorId(id);
        if(respuesta == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(respuesta, HttpStatus.OK);
    }
}
