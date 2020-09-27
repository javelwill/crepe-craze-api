package com.javelwilson.crepecrazeapi.repository;

import com.javelwilson.crepecrazeapi.model.Order;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<Order, Long> {

    List<Order> findByZip(String zip);

    List<Order> readOrdersByZipAndPlacedAtBetween(String zip, Date startDate, Date endDate);
}
