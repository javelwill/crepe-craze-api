package com.javelwilson.crepecrazeapi.repository;

import com.javelwilson.crepecrazeapi.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsername(String username);
}
