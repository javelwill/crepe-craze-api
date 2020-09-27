package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.model.Ingredient;
import com.javelwilson.crepecrazeapi.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/ingredients")
    public Iterable<Ingredient> allIngredients() {
        return ingredientRepository.findAll();
    }


}
