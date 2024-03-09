package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.People;
import com.devnordestino.opentasks.repositories.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/people")
public class PeopleController {
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping
    public List<People> findAll() {
        return peopleRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public People findById(@PathVariable Long id) {
        return peopleRepository.findById(id).get();
    }

    @PostMapping()
    public People inserPeople(@RequestBody People people) {
        return peopleRepository.save(people);
    }

}
