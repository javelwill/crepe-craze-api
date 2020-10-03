package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.exception.UsernameConflictException;
import com.javelwilson.crepecrazeapi.model.RegistrationForm;
import com.javelwilson.crepecrazeapi.model.User;
import com.javelwilson.crepecrazeapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

import static java.util.Objects.isNull;

@RestController
public class RegistrationController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public void processRegistration(@Valid @RequestBody RegistrationForm registrationForm) {

        User user = userRepository.findByUsername(registrationForm.getUsername());
        if (!isNull(user)) {
            throw new UsernameConflictException("Username unavailable");
        }
        userRepository.save(registrationForm.toUser(passwordEncoder));
    }
}
