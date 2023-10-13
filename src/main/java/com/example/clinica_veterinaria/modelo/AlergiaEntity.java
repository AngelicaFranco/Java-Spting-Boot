package com.example.clinica_veterinaria.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "alergia")

public class AlergiaEntity {

    @Id
    private Integer id;

    @Column(name = "tipo_alergia")
    private String tipo_alergia;

    @Column(name = "reaccion")
    private String reaccion;

    @Column(name = "descripcion")
    private String descripcion;
}
