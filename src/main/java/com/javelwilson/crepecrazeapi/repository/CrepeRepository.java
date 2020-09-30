package com.javelwilson.crepecrazeapi.repository;

import com.javelwilson.crepecrazeapi.model.Crepe;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CrepeRepository extends PagingAndSortingRepository<Crepe, Long> {
}
