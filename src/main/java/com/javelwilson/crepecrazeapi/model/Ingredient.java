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
@Entity
public class Ingredient {

    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Type type;
    @Enumerated(EnumType.STRING)
    private Category category;

    public static enum Type {
        SELECTION, SPREAD, TOPPING, DUSTING, CHEESE
    }

    public static enum Category {
        SWEET, SAVORY
    }
}
