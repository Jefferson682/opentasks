package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.User;
import com.devnordestino.opentasks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }
    
    @PostMapping(value = "/insert")
    public User insert(@RequestBody User user) {
        return repository.save(user);
    }

    @PostMapping(value = "/edit")
    public User edit(@RequestBody User user) {
        User findUser = repository.findById(user.getId()).get();
        findUser.setDepartment(user.getDepartment());
        findUser.setEmail(user.getEmail());
        findUser.setFirstName(user.getFirstName());
        findUser.setLastName(user.getLastName());
        return repository.save(findUser);
    }
}
