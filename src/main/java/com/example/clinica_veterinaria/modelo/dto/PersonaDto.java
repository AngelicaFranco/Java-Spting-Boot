package com.example.clinica_veterinaria.modelo.dto;

import lombok.Data;

@Data
public class PersonaDto {

    private Integer id;
    private String nombres;
    private String apellidos;
    private String identificacion;
    private String sexo;
    private String direccion;
    private String telefono;
    private String correo;
    private String rol;

}
