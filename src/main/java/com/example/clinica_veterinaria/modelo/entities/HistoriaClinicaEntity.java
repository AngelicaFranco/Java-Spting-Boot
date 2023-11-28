package com.example.clinica_veterinaria.modelo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "historia_clinica")

public class HistoriaClinicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "antecedentes")
    private String antecedentes;

    @Column(name = "motivo_consulta")
    private String motivo_consulta;

    @Column(name = "peso")
    private Integer peso;

    @Column(name = "temperatura")
    private Integer temperatura;

    @Column(name = "estado_animico")
    private String estado_animico;

    @Column(name = "hallazgo")
    private String hallazgo;

    @OneToOne
    @JoinColumn(name = "id_citamedica")
    private CitaMedicaEntity citaMedica;
}
