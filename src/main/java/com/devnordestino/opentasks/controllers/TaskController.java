package com.devnordestino.opentasks.controllers;

import com.devnordestino.opentasks.entities.People;
import com.devnordestino.opentasks.entities.Task;
import com.devnordestino.opentasks.repositories.PeopleRepository;
import com.devnordestino.opentasks.repositories.TaskRepository;
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
    private PeopleRepository peopleRepository;

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
        if (taskRequest.getAssignee_id() != null) {
            People assignee = peopleRepository.findById(taskRequest.getAssignee_id()).get();
            task.setAssignee(assignee);
        }else {
            task.setAssignee(null);
        }
        if (taskRequest.getReporter_id() != null) {
            People reporter = peopleRepository.findById(taskRequest.getReporter_id()).get();
            task.setReporter(reporter);
        }
        task.setClassification(taskRequest.getClassification());
        task.setStatus(taskRequest.getStatus());
        task.setDescription(taskRequest.getDescription());
        task.setTitle(taskRequest.getTitle());
        return taskRepository.save(task);
    }

}
