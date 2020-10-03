package com.javelwilson.crepecrazeapi.exception;

public class UsernameConflictException extends RuntimeException {

    public UsernameConflictException() {
        super();
    }

    public UsernameConflictException(String message) {
        super(message);
    }
}
