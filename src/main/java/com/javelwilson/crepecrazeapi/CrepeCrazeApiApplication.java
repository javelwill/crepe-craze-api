package com.javelwilson.crepecrazeapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CrepeCrazeApiApplication {

    @GetMapping("/")
    public String index() {
        return "Crepe Craze API";
    }

    public static void main(String[] args) {
        SpringApplication.run(CrepeCrazeApiApplication.class, args);
    }

}
