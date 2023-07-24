package com.project0.application.exception;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalExceptionHandlerTest {
    @Test
    void handleGlobalException_ShouldReturnInternalServerError() {
        GlobalExceptionHandler exceptionHandler = new GlobalExceptionHandler();
        Exception exception = new Exception("Error de prueba");

        ResponseEntity<String> response = exceptionHandler.handleGlobalException(exception);

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals("Error interno del servidor", response.getBody());
    }
    
}
