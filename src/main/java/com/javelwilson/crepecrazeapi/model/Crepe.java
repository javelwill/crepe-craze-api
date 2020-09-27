package com.javelwilson.crepecrazeapi.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Crepe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date createdAt;

    @NotNull(message = "Name is required")
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    @JoinTable(name = "Crepe_Ingredient", joinColumns = @JoinColumn(name = "crepe_id"), inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
    @Size(min = 1, message = "At least one ingredient must be chosen")
    private List<Ingredient> ingredients;

    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }


}
