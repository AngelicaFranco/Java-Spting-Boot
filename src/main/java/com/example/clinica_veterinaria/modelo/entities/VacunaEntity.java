package com.example.clinica_veterinaria.modelo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "vacuna")

public class VacunaEntity {

    @Id
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha")
    private Date fecha;
}
