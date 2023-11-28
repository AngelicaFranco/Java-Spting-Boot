package com.example.clinica_veterinaria.exceptions;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

/**
 * clase que captura las excepciones de tipo ApiException.
 */
@ControllerAdvice
@RestController
@Order(Ordered.HIGHEST_PRECEDENCE)
public class ControllerExceptionHandler {

    /**
     * metodo que captura las excepciones de tipo ApiException.
     * @param ex
     * @return ResponseEntity<ApiResponseDTO>
     */
    @ExceptionHandler(ApiException.class)
    public final ResponseEntity<ApiResponseDTO> handleNotFoundException(final ApiException ex) {
        ApiResponseDTO apiError = new ApiResponseDTO(ex.getDescripcion(), ex.getStatus().value());
        return new ResponseEntity<>(apiError, ex.getStatus());
    }

}
