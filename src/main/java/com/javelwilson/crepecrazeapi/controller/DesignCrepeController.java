package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.model.Crepe;
import com.javelwilson.crepecrazeapi.repository.CrepeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/design")
public class DesignCrepeController {

    @Autowired
    private CrepeRepository crepeRepository;

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Crepe postCrepe(@Valid @RequestBody Crepe crepe){
        return crepeRepository.save(crepe);
    }

    @GetMapping("/recent")
    public Iterable<Crepe> recentCrepes(){
        PageRequest page = PageRequest.of(0, 3, Sort.by("createdAt").descending());
        return crepeRepository.findAll(page).getContent();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Crepe> crepeById(@PathVariable("id") Long id){
        Optional<Crepe> optCrepe = crepeRepository.findById(id);
        if (optCrepe.isPresent()) {
            return ResponseEntity.status(HttpStatus.OK).body(optCrepe.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }
}
