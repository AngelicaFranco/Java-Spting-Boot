package com.example.clinica_veterinaria.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Objeto de respuesta para las peticiones.
 */
@Data
@AllArgsConstructor
public class ApiResponseDTO {
    /**
     * Descripción de la respuesta.
     */
    private String descripcion;
    /**
     * Estado de la respuesta.
     */
    private Integer status;

}
