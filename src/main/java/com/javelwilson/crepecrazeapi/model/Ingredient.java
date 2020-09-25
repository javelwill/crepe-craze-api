package com.javelwilson.crepecrazeapi.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;
    private final Category category;

    public static enum Type {
        SELECTION, SPREAD, TOPPING, DUSTING, CHEESE
    }

    public static enum Category {
        SWEET, SAVORY
    }
}
