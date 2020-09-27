package com.javelwilson.crepecrazeapi.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
public class Ingredient {

    @Id
    private final String id;
    private final String name;
    @Enumerated(EnumType.STRING)
    private final Type type;
    @Enumerated(EnumType.STRING)
    private final Category category;

    public static enum Type {
        SELECTION, SPREAD, TOPPING, DUSTING, CHEESE
    }

    public static enum Category {
        SWEET, SAVORY
    }
}
