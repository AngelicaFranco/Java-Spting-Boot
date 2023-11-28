package com.example.clinica_veterinaria.modelo.dto;

import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
public class CitaMedicaDto {

    private Integer id;
    private Date fecha;
    private String profesional;
    private AnimalDto animal;
}
