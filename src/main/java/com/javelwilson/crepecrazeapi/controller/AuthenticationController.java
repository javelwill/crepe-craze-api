package com.javelwilson.crepecrazeapi.controller;


import com.javelwilson.crepecrazeapi.model.AuthenticationRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @PostMapping("/test")
    public String processLogin(AuthenticationRequest loginForm) {
        return "Login";
    }
}
