package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.Task;
import com.devnordestino.opentasks.entities.User;
import com.devnordestino.opentasks.repositories.TaskRepository;
import com.devnordestino.opentasks.repositories.UserRepository;
import com.devnordestino.opentasks.requests.TaskRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Task findById(@PathVariable Long id) {
        return taskRepository.findById(id).get();
    }

    @PostMapping(value = "/insert")
    public Task insert(@RequestBody TaskRequest taskRequest){
        Task task = new Task();
        if (taskRequest.getUser() != null) {
            Long userId = taskRequest.getUser();
            User user = userRepository.findById(userId).get();
            task.setUser(user);
        }else {
            task.setUser(null);
        }
        task.setClassification(taskRequest.getClassification());
        task.setStatus(taskRequest.getStatus());
        task.setDescription(taskRequest.getDescription());
        task.setTitle(taskRequest.getTitle());
        return taskRepository.save(task);
    }

}
