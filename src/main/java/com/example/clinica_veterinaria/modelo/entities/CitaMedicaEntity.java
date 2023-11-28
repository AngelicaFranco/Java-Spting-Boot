package com.example.clinica_veterinaria.modelo.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;

@Data
@Entity
@Table(name = "cita_medica")

public class CitaMedicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "profesional")
    private String profesional;

    @ManyToOne
    @JoinColumn(name = "id_animal")
    private AnimalEntity animal;

    @OneToOne(mappedBy = "citaMedica", cascade = CascadeType.ALL)
    private HistoriaClinicaEntity historiaclinica;
}
