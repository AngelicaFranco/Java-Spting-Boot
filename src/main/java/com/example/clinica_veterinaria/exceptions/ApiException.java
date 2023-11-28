package com.example.clinica_veterinaria.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

/**
 * Exception personalizada.
 */
@Data
public class ApiException extends RuntimeException {

    /**
     * mensaje del error.
     */
    private String descripcion;
   /**
     *  codigo del error.
     */
    private HttpStatus status;


    /**
     * constructor de la clase.
     * @param descripcion
     * @param status
     */
    public ApiException(final String descripcion, final HttpStatus status) {
        super(descripcion);
        this.descripcion = descripcion;
        this.status = status;
    }
}
