package com.javelwilson.crepecrazeapi.controller;

import com.javelwilson.crepecrazeapi.model.Order;
import com.javelwilson.crepecrazeapi.model.User;
import com.javelwilson.crepecrazeapi.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @PostMapping("/orders")
    public String processOrder(@Valid @RequestBody Order order){

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        User user = (User) authentication.getPrincipal();

        order.setUser(user);
        orderRepository.save(order);
        return "Orders";
    }
}
