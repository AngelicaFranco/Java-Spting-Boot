package com.example.clinica_veterinaria.controller;

import com.example.clinica_veterinaria.modelo.dto.RegistroUsuarioDto;
import com.example.clinica_veterinaria.modelo.entities.UsuarioEntity;
import com.example.clinica_veterinaria.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping("/guardarUsuario")
    public ResponseEntity<String> guardarUsuario(@RequestBody RegistroUsuarioDto registroUsuarioDto) { // el ResponseEntity es el que se encarga de retornar la informacion es un estandar http para que sea reconocido por cualquier cliente front.
        String res = usuarioService.guardarUsuario(registroUsuarioDto);
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
