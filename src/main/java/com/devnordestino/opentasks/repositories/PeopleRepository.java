package com.devnordestino.opentasks.repositories;

import com.devnordestino.opentasks.entities.People;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeopleRepository extends JpaRepository<People, Long> {
}
