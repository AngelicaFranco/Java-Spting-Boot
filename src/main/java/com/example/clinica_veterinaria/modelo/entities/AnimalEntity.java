package com.example.clinica_veterinaria.modelo.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "animal")

public class AnimalEntity {

    @Id
    private Integer id;

    @Column(name = "nombres")
    private String nombres;

    @Column(name = "fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name = "edad")
    private Integer edad;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "peso")
    private Integer peso;

    @Column(name = "grupo_animal")
    private String grupo_animal;

    @Column(name = "raza")
    private String raza;

    @Column(name = "notas")
    private String notas;

    @ManyToOne // especifica que es un relacion uno a muchos - en este caso un propietario puede tener muchos animales
    @JoinColumn(name = "id_propietario") // se hace la union con la tabla persona por medio de la columna id_propietario de la tabla animal.
    private PersonaEntity propietario;
}
