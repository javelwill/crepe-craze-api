package com.javelwilson.crepecrazeapi.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {

    private String error;
    private String detail;
    private String message;
    private HashMap<String, Object> data;

}
