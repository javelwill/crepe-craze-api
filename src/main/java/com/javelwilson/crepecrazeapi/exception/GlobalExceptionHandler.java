package com.javelwilson.crepecrazeapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<FieldError> fieldErrors = result.getFieldErrors();
        ErrorResponse errorResponse = processFieldErrors(fieldErrors);
        return ResponseEntity.status(HttpStatus.OK).body(errorResponse);
    }

    private ErrorResponse processFieldErrors(List<FieldError> fieldErrors) {
        ErrorResponse errorResponse = ErrorResponse.builder().error("VALIDATION_ERROR").build();

        List<ValidationError> validationErrors = new ArrayList<>();
        for (FieldError fieldError : fieldErrors) {
            ValidationError validationError = new ValidationError();
            validationError.setField(fieldError.getField());
            validationError.setMessage(fieldError.getDefaultMessage());
            validationErrors.add(validationError);
        }
        HashMap<String, Object> data = new HashMap<>();
        data.put("validationErrors", validationErrors);
        errorResponse.setData(data);
        return errorResponse;
    }
}
