package com.example.clinica_veterinaria.modelo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AnimalDto {
    private Integer id;
    private String nombres;
    private Date fecha_nacimiento;
    private Integer edad;
    private String sexo;
    private Integer peso;
    private String grupo_animal;
    private String raza;
    private String notas;
    private PersonaDto propietario;
}

