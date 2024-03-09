package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.People;
import com.devnordestino.opentasks.entities.User;
import com.devnordestino.opentasks.repositories.PeopleRepository;
import com.devnordestino.opentasks.repositories.UserRepository;
import com.devnordestino.opentasks.requests.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PeopleRepository peopleRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public User findById(@PathVariable Long id) {
        return userRepository.findById(id).get();
    }
    
    @PostMapping(value = "/insert")
    public User insert(@RequestBody UserRequest userRequest) {
        var name = userRequest.getName();
        var email = userRequest.getEmail();
        var password = userRequest.getPassword();
        var department = userRequest.getDepartment();

        People people = new People();
        people.setDepartment(department);
        people.setName(name);
        peopleRepository.save(people);

        User user = new User();
        user.setActive(true);
        user.setPassword(password);
        user.setEmail(email);
        user.setPeople(people);

        return userRepository.save(user);
    }

//    @PostMapping(value = "/edit")
//    public User edit(@RequestBody User user) {
//        User findUser = repository.findById(user.getId()).get();
//        findUser.setDepartment(user.getDepartment());
//        findUser.setEmail(user.getEmail());
//        findUser.setFirstName(user.getFirstName());
//        findUser.setLastName(user.getLastName());
//        return repository.save(findUser);
//    }
}
