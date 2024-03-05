package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.Task;
import com.devnordestino.opentasks.entities.User;
import com.devnordestino.opentasks.repositories.TaskRepository;
import com.devnordestino.opentasks.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {
    @Autowired
    private TaskRepository repository;

    @GetMapping
    public List<Task> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Task findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping(value = "/insert")
    public Task insert(@RequestBody Task task){
        return repository.save(task);
    }

}
