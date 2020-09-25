package com.javelwilson.crepecrazeapi.model;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Crepe {
    @NotNull(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @Size(min = 1, message = "At least one ingredient must be chosen")
    private List<String> ingredients;


}
