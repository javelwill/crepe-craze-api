package com.javelwilson.crepecrazeapi.model;

import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RegistrationForm {

    @NotNull(message = "Username is required")
    @Size(min = 2, message = "Username must be at least 2 characters")
    @Size(max = 50, message = "Username must be less than 51 characters")
    private String username;

    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Password must be at least 6 characters")
    @Size(max = 50, message = "Password must be less than 51 characters")
    private String password;

    @NotNull(message = "First name is required")
    @Size(min = 2, message = "First name must be at least 2 characters")
    @Size(max = 50, message = "First name must be less than 51 characters")
    private String firstName;

    @NotNull(message = "Last name is required")
    @Size(min = 2, message = "Last name must be at least 2 characters")
    @Size(max = 50, message = "Last name must be less than 51 characters")
    private String lastName;

    @NotNull(message = "Street is required")
    @Size(min = 2, message = "Street must be at least 2 characters")
    @Size(max = 50, message = "Street must be less than 51 characters")
    private String street;

    @NotNull(message = "City is required")
    @Size(min = 2, message = "City must be at least 2 characters")
    @Size(max = 50, message = "City must be less than 51 characters")
    private String city;

    @NotNull(message = "State is required")
    @Size(min= 2, max = 2, message = "State must be 2 characters")
    private String state;

    @NotNull(message = "Zip is required")
    @Size(min= 2, message = "Zip must be at least 2 characters")
    @Size(max = 50, message = "Zip must be less than 51 characters")
    private String zip;

    @NotNull(message = "Phone number is required")
    @Digits(integer=10, fraction=0, message="Phone number must be 10 digits")
    private String phoneNumber;


    public User toUser(PasswordEncoder passwordEncoder) {
        return new User(username, passwordEncoder.encode(password), firstName, lastName, street, city, state, zip, phoneNumber);
    }
}
