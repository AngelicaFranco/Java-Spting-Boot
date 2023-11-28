package com.example.clinica_veterinaria.modelo.dto;

import lombok.Data;

@Data
public class HistoriaClinicaDto {

    private String antecedentes;
    private String motivo_consulta;
    private Integer peso;
    private Integer temperatura;
    private String estado_animico;
    private String hallazgo;
    private CitaMedicaDto citaMedica;
}
