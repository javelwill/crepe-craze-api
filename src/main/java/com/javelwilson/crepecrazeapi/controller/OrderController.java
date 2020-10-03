package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.model.Order;
import com.javelwilson.crepecrazeapi.model.User;
import com.javelwilson.crepecrazeapi.repository.OrderRepository;
import com.javelwilson.crepecrazeapi.repository.UserRepository;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/orders")
    public String processOrder(@Valid @RequestBody Order order){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = userRepository.findByUsername((String) authentication.getPrincipal());

        order.setUser(user);
        orderRepository.save(order);
        return "Orders";
    }
}
