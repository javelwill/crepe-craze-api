package com.javelwilson.crepecrazeapi.repository;

import com.javelwilson.crepecrazeapi.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
