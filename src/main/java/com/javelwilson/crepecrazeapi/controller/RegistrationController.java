package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.model.RegistrationForm;
import com.javelwilson.crepecrazeapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void processRegistration(@Valid @RequestBody RegistrationForm registrationForm) {
        userRepository.save(registrationForm.toUser(passwordEncoder));
    }
}
