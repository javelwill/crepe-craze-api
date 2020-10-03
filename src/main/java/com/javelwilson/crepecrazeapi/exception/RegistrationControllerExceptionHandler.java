package com.javelwilson.crepecrazeapi.exception;

import com.javelwilson.crepecrazeapi.controller.RegistrationController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(assignableTypes = RegistrationController.class)
public class RegistrationControllerExceptionHandler {

    @ExceptionHandler(UsernameConflictException.class)
    public ResponseEntity handleUsernameConflictException() {
        ErrorResponse errorResponse = ErrorResponse.builder().error("USERNAME_CONFLICT").message("Username is not available").build();
        return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
    }
}
